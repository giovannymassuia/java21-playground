package io.giovannymassuia.patternmatching;

public record Food(int price, int localTax, FoodType type) implements Product {

    public sealed interface FoodType permits Fruit, Vegetable, Meat, Cheese {
    }

    public record Fruit(int additionalTax) implements FoodType {
    }

    public record Vegetable() implements FoodType {
    }

    public record Meat(int additionalTax, boolean imported) implements FoodType {
    }

    public record Cheese() implements FoodType {
    }

}
