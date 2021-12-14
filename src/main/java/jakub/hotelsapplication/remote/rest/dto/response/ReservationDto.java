package jakub.hotelsapplication.remote.rest.dto.response;

import jakub.hotelsapplication.domain.model.ReservationStatusType;
import jakub.hotelsapplication.remote.rest.dto.common.PersonDto;
import jakub.hotelsapplication.remote.rest.dto.common.HotelReservationDto;

import java.util.List;

public class ReservationDto {

    private Integer id;
    private ReservationStatusType status;
    private List<HotelReservationDto> hotels;
    private PersonDto person;

    public ReservationDto(Integer id, ReservationStatusType status, List<HotelReservationDto> hotels, PersonDto person) {
        this.id = id;
        this.status = status;
        this.hotels = hotels;
        this.person = person;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ReservationStatusType getStatus() {
        return status;
    }

    public void setStatus(ReservationStatusType status) {
        this.status = status;
    }

    public List<HotelReservationDto> getHotels() {
        return hotels;
    }

    public void setHotels(List<HotelReservationDto> hotels) {
        this.hotels = hotels;
    }

    public PersonDto getPerson() {
        return person;
    }

    public void setPerson(PersonDto person) {
        this.person = person;
    }
}
