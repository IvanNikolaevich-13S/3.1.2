package ru.shvayko.FirstBootApp.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Entity
@Table(name = "users")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    @NotEmpty(message = "Имя не может быть пустым!")
    @Pattern(regexp = "^[a-zA-ZА-Яа-я]*$", message = "Вы ввели неккоретное имя!")
    private String name;

    @Column(name = "last_name")
    @Pattern(regexp = "^[a-zA-ZА-Яа-я]*$", message = "Вы ввели неккоретную фамлию!")
    private String surname;

    public User(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
}
