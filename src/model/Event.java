package model;

import java.time.LocalDateTime;

public class Event {
    private int id;
    private String name;
    private String organizerUsername;
    private LocalDateTime date;
    private int capacity;
    private int sold;

    public Event(int id, String name, String organizerUsername, LocalDateTime date, int capacity, int sold) {
        this.id = id;
        this.name = name;
        this.organizerUsername = organizerUsername;
        this.date = date;
        this.capacity = capacity;
        this.sold = sold;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getOrganizerUsername() {
        return this.organizerUsername;
    }

    public LocalDateTime getDate() {
        return this.date;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public int getSold() {
        return this.sold;
    }

    public boolean equals(Event event) {
        return this.id == event.id && this.name.equals(event.getName())
                && this.organizerUsername.equals(event.getOrganizerUsername())
                && this.date.equals(event.getDate())
                && this.capacity == event.getCapacity() && this.sold == event.getSold();
    }

    @Override
    public int hashCode() {
        return this.id + this.name.hashCode() + this.organizerUsername.hashCode() + this.date.hashCode()
                + this.capacity + this.sold;
    }

}
