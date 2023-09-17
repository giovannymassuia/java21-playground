package io.giovannymassuia.pattern_matching;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ProductTest {

    @Test
    public void test() {
        Product importedMeat = new Food(10, 5,
                new Food.Meat(10, true));
        assertEquals(30, importedMeat.calculatePrice());

        Product taxedMeat = new Food(10, 5,
                new Food.Meat(15, false));
        assertEquals(30, taxedMeat.calculatePrice());

        Product regularMeat = new Food(10, 5,
                new Food.Meat(5, false));
        assertEquals(15, regularMeat.calculatePrice());
    }

}