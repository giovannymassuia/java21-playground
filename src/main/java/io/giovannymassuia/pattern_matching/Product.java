package io.giovannymassuia.pattern_matching;

public sealed interface Product permits Book, Food, Medicine {

    default int calculatePrice() {
        return switch (this) {
            case Book(var price, var federalTax, var provincialTax) -> price + federalTax + provincialTax;

            case Food(var price, var localTax, Food.Fruit(var additionalTax)) -> price + localTax + additionalTax;
            case Food(var price, var localTax, Food.Vegetable()) -> price + localTax;

            // Imported meat
            case Food(var price, var localTax, Food.Meat(var additionalTax, boolean imported))
                    when imported -> price + localTax + additionalTax + 5;
            // Taxed meat
            case Food(var price, var localTax, Food.Meat meat)
                    when meat.additionalTax() > 10 -> price + localTax + meat.additionalTax();
            // Regular meat
            case Food(var price, var localTax, Food.Meat _) -> price + localTax;

            case Food(var price, var localTax, Food.Cheese()) -> price + localTax;

            case Medicine(var price, var federalTax) -> price + federalTax;
        };
    }

}
