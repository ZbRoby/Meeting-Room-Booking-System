package ro.uvt.mrbs.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
public class Room {

    @Id
    @GeneratedValue
    private long id;
    private String name;

    public Room(String name) {
        this.name = name;
    }

}
