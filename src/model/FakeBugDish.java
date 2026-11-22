
package model;

public class FakeBugDish extends MenuItem {

    private String appearance;

    public FakeBugDish(int id, String name, String description,
                       double price, String appearance) {

        super(id, name, description, price);
        setAppearance(appearance);
    }

    public String getAppearance() {
        return appearance;
    }

    public void setAppearance(String appearance) {
        if (appearance == null || appearance.trim().isEmpty()) {
            throw new IllegalArgumentException("Izgled jela nije unet.");
        }

        this.appearance = appearance;
    }

    @Override
    public void displayDetails() {
        System.out.println("Jelo: " + getName());
        System.out.println("Opis: " + getDescription());
        System.out.println("Cena: " + getPrice() + " RSD");
        System.out.println("Izgled: " + appearance);
        System.out.println("Napomena: Jelo ne sadrži prave insekte!");
    }
}
