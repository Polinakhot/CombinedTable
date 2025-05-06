public class CombinedTable {
    private SingleTable table1;
    private SingleTable table2;

    public CombinedTable(SingleTable t1, SingleTable t2) {
        table1 = t1;
        table2 = t2;
    }

    public boolean canSeat(int count) {
        int totalSeats = table1.getNumSeats() + table2.getNumSeats() - 2;
        return count <= totalSeats;
    }

    public double getDesirability() {
        double avgView = (table1.getViewQuality() + table2.getViewQuality()) / 2.0;
        if (table1.getHeight() == table2.getHeight()) {
            return avgView;
        } else {
            return avgView - 10;
        }
    }
}
