package jakub.hotelsapplication.remote.rest.dto.request;

import jakub.hotelsapplication.remote.rest.dto.common.PersonDto;
import jakub.hotelsapplication.remote.rest.dto.common.HotelReservationDto;

import java.util.List;

public class AddReservationDto {

    private List<HotelReservationDto> hotels;
    private PersonDto person;

    public AddReservationDto(List<HotelReservationDto> hotels, PersonDto person) {
        this.hotels = hotels;
        this.person = person;
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
