package ru.mylife.project.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Target {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String title;
    private String fullText;
    private String target_img;
    private boolean active;
    private LocalDate dateOfCreation;
    private LocalDate dateExpiration;
    private String fulfilled;
    private String notFulfilled;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")
    private User owner;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "category_id")
    private Category category;

    public Target(String title, String fullText, LocalDate dateExpiration, User owner, String fulfilled, String notFulfilled) {
        this.title = title;
        this.fullText = fullText;
        this.dateExpiration = dateExpiration;
        this.owner = owner;
        this.fulfilled = fulfilled;
        this.notFulfilled = notFulfilled;
    }

    public String getFulfilled() {
        return fulfilled;
    }

    public void setFulfilled(String fulfilled) {
        this.fulfilled = fulfilled;
    }

    public String getNotFulfilled() {
        return notFulfilled;
    }

    public void setNotFulfilled(String notFulfilled) {
        this.notFulfilled = notFulfilled;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public String getTarget_img() {
        return target_img;
    }

    public void setTarget_img(String target_img) {
        this.target_img = target_img;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public LocalDate getDateOfCreation() {
        return dateOfCreation;
    }

    public void setDateOfCreation(LocalDate dateOfCreation) {
        this.dateOfCreation = dateOfCreation;
    }

    public LocalDate getDateExpiration() {
        return dateExpiration;
    }

    public void setDateExpiration(LocalDate dateExpiration) {
        this.dateExpiration = dateExpiration;
    }

    public Target() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String name) {
        this.title = name;
    }

    public String getFullText() {
        return fullText;
    }

    public void setFullText(String anons) {
        this.fullText = anons;
    }

    public String getOwnerName() {
        return owner != null ? owner.getUsername() : "<none>";
    }


}
