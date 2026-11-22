
package model;

import java.time.LocalDateTime;

public class ThemedEvent {

    private int eventId;
    private String name;
    private String description;
    private LocalDateTime dateTime;
    private int capacity;
    private double ticketPrice;

    public ThemedEvent(int eventId, String name,
            String description, LocalDateTime dateTime,
            int capacity, double ticketPrice) {

        setEventId(eventId);
        setName(name);
        setDescription(description);
        setDateTime(dateTime);
        setCapacity(capacity);
        setTicketPrice(ticketPrice);
    }

    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        if (eventId <= 0) {
            throw new IllegalArgumentException(
                "ID događaja mora biti pozitivan."
            );
        }
        this.eventId = eventId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException(
                "Naziv događaja ne sme biti prazan."
            );
        }
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        if (description == null || description.trim().isEmpty()) {
            throw new IllegalArgumentException(
                "Opis događaja ne sme biti prazan."
            );
        }
        this.description = description;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        if (dateTime == null || dateTime.isBefore(LocalDateTime.now())) {
            throw new IllegalArgumentException(
                "Datum događaja mora biti u budućnosti."
            );
        }
        this.dateTime = dateTime;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException(
                "Kapacitet mora biti veći od nule."
            );
        }
        this.capacity = capacity;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(double ticketPrice) {
        if (ticketPrice < 0) {
            throw new IllegalArgumentException(
                "Cena karte ne može biti negativna."
            );
        }
        this.ticketPrice = ticketPrice;
    }

    public void displayEventDetails() {
        System.out.println("Događaj: " + name);
        System.out.println("Opis: " + description);
        System.out.println("Datum: " + dateTime);
        System.out.println("Kapacitet: " + capacity);
        System.out.println("Cena karte: " + ticketPrice + " RSD");
    }
}
