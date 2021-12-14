package jakub.hotelsapplication.data.entity.hotel;

import jakub.hotelsapplication.data.entity.room.RoomEntity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "hotels")
public class HotelEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "room")
    private Set<RoomEntity> rooms;

}
