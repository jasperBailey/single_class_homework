public class WaterBottle {
    private int volume;

    public WaterBottle() {
        this.volume = 100;
    }
    public void drink() {
        if (this.volume >= 10) {
            this.volume -= 10;
            System.out.println("glug glug glug");
        } else {
            this.volume = 0;
        }
    }
    public void fill() {
        this.volume = 100;
    }
    public void empty() {
        this.volume = 0;
    }
    public int getVolume() {
        return this.volume;
    }
}
