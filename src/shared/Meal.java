package shared;

import java.util.Objects;
import java.util.Set;

public class Meal {
    private Double price;
    private Integer weightInGrams;
    private Set<String> ingredients;

    public Meal(Double price, Integer weightInGrams, Set<String> ingredients) {
        this.price = price;
        this.weightInGrams = weightInGrams;
        this.ingredients = ingredients;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getWeightInGrams() {
        return weightInGrams;
    }

    public void setWeightInGrams(Integer weightInGrams) {
        this.weightInGrams = weightInGrams;
    }

    public Set<String> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "Meal{" +
                "price=" + price + "EUR"+
                ", weightInGrams=" + weightInGrams +
                ", ingredients=" + ingredients +
                '}';
    }

    @Override
    public boolean equals(Object theOtherObject) {
        if (this == theOtherObject) return true;
        if (!(theOtherObject instanceof Meal)) return false;

        Meal meal = (Meal) theOtherObject;

        return Objects.equals(ingredients, meal.ingredients);
    }

    @Override
    public int hashCode() {
        return ingredients != null ? ingredients.hashCode() : 0;
    }
}
