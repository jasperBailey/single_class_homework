public class Printer {
    private int paper;
    private int toner;
    public Printer(int paper) {
        this.paper = paper;
        this.toner = 50;
    }
    public void print(int copies, int pages) {
        int requiredPaper = copies * pages;
        if (requiredPaper <= this.paper && requiredPaper <= this.toner) {
            this.paper -= requiredPaper;
            this.toner -= requiredPaper;
        }
    }
    public int getPaper() {
        return this.paper;
    }
    public void fillToner() {
        this.toner = 50;
    }
    public int getToner() {
        return this.toner;
    }
}
