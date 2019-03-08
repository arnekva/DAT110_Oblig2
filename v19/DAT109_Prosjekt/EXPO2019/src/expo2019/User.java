package expo2019;

import javax.persistence.*;


@Entity
@Table(name = "user", schema = "expo2019")
public class User {

    @Id
    private int id;

}
