package model.entity;

import jakarta.persistence.*;
import lombok.Cleanup;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CollectionId;

@Entity
@Table(name = "user")
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "full_name", nullable = false, length = 100)
    private String fullName;

    @Column(nullable = false, length = 100)
    private String dni;

    @Column(nullable = false, unique = true, length = 100)
    private String email;

    @Column(length = 100)
    private String expectations;

    //Relacion 1 usuario -> N tickets
    @OneToMany(mappedBy = "user")
    private List<Ticket> tickets;

}
