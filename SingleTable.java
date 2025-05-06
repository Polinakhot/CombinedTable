public class SingleTable {
    private int numSeats;
    private int height;
    private double viewQuality;

    public SingleTable(int numSeats, double viewQuality, int height) {
        this.numSeats = numSeats;
        this.viewQuality = viewQuality;
        this.height = height;
    }

    public int getNumSeats() {
        return numSeats;
    }

    public int getHeight() {
        return height;
    }

    public double getViewQuality() {
        return viewQuality;
    }

    public void setViewQuality(double value) {
        viewQuality = value;
    }
}
