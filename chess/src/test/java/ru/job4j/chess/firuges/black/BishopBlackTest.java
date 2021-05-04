package ru.job4j.chess.firuges.black;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.chess.firuges.Cell;

public class BishopBlackTest {

    @Test
    public void position() {
        Assert.assertEquals(new BishopBlack(Cell.A1).position(), Cell.A1);
    }

    @Test
    public void way() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        Cell[] steps = bishopBlack.way(Cell.G5);
        Cell[] expextedSteps = {Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        Assert.assertArrayEquals(expextedSteps, steps);
    }

    @Test
    public void copy() {
        BishopBlack bishopBlack = new BishopBlack(Cell.A1);
        Assert.assertEquals(bishopBlack.copy(Cell.B1).position(), Cell.B1);
    }

    @Test
    public void isDiagonal() {
        Assert.assertTrue(new BishopBlack(Cell.A1).isDiagonal(Cell.A1, Cell.H8));
        Assert.assertFalse(new BishopBlack(Cell.G5).isDiagonal(Cell.G5, Cell.E8));
    }
}