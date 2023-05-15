import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {
    Printer printer;

    @Before
    public void before() {
        printer = new Printer(100);
    }


    @Test
    public void hasPaper() {
        assertEquals(100, printer.getPaper());
    }
    @Test
    public void hasToner() {
        assertEquals(50, printer.getToner());
    }
    @Test
    public void testPrintHasPaper() {
        printer.print(2, 3);
        assertEquals(94, printer.getPaper());
    }
    @Test
    public void testPrintNoPaper() {
        Printer emptyPrinter = new Printer(0);
        emptyPrinter.print(2, 3);
        assertEquals(0, emptyPrinter.getPaper());
    }
    @Test
    public void testPrintSomeButNotEnoughPaper() {
        printer.print(20, 8);
        assertEquals(100, printer.getPaper());
    }
    @Test
    public void testCanFillToner() {
        printer.print(10, 5);
        printer.fillToner();
        assertEquals(50, printer.getToner());
    }
    @Test
    public void testPrintEnoughPaperNotEnoughToner() {
        printer.print(10, 6);
        assertEquals(100, printer.getPaper());
        assertEquals(50, printer.getToner());
    }
}
