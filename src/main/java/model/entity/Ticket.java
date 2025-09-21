package model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import model.enums.PaymentStatus;

import java.time.LocalDateTime;

@Entity
@Table(name = "ticket")
@Getter
@Setter
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Enumerated(EnumType.STRING)
    @Column(name = "payment_status", nullable = false)
    private PaymentStatus paymentStatus;

    private LocalDateTime datePayment;

    @Column(name = "qr_code", nullable = false, length = 100)
    private String qrCode;

    @Column(name = "use_code", nullable = false)
    private Boolean useCode;

    // Relaciones
    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false) // FK a user.id
    private User user;

    @ManyToOne
    @JoinColumn(name = "event_id", nullable = false) // FK a event.id
    private Event event;
}
