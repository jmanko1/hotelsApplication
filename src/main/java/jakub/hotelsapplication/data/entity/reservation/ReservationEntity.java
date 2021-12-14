package jakub.hotelsapplication.data.entity.reservation;

import jakub.hotelsapplication.data.entity.room.RoomEntity;
import jakub.hotelsapplication.domain.model.ReservationStatusType;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "reservations")
public class ReservationEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "status")
    private ReservationStatusType status;

    @Column(name = "name")
    private String name;

    @Column(name = "phone")
    private String phone;

    @Column(name = "address")
    private String address;

    @Column(name = "floor")
    private String floor;

    @Column(name = "days")
    private Integer days;

    @OneToMany(mappedBy = "room")
    private Set<RoomEntity> rooms;

}
