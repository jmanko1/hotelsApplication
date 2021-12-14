package jakub.hotelsapplication.remote.rest.api;

import jakub.hotelsapplication.domain.model.ReservationStatusType;
import jakub.hotelsapplication.remote.rest.dto.common.HotelReservationDto;
import jakub.hotelsapplication.remote.rest.dto.common.PersonDto;
import jakub.hotelsapplication.remote.rest.dto.request.AddReservationDto;
import jakub.hotelsapplication.remote.rest.dto.response.ReservationCollectionDto;
import jakub.hotelsapplication.remote.rest.dto.response.ReservationDto;
import jakub.hotelsapplication.remote.rest.dto.response.TokenDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RequestMapping(value = "/api/v1/reservations", produces = APPLICATION_JSON_VALUE)
@RestController
public class ReservationController {

    @PostMapping
    public ResponseEntity<TokenDto> addReservation(@RequestBody AddReservationDto addReservationDto){
        return ResponseEntity.ok(null);
    }

    @GetMapping
    public ResponseEntity<ReservationCollectionDto> getReservations(@RequestParam("status") ReservationStatusType reservationStatusType, @RequestHeader("Access-Token") String token){

        HotelReservationDto hotelReservationDto = new HotelReservationDto(3, 1 ,14);
        PersonDto personDto = new PersonDto("Jan Kowalski", "123456", "Branickiego 34/2", "1");
        ReservationDto reservationDto = new ReservationDto(1, ReservationStatusType.NEW, List.of(hotelReservationDto), personDto);
        ReservationCollectionDto reservationCollectionDto = new ReservationCollectionDto(List.of(reservationDto));

        return ResponseEntity.ok(reservationCollectionDto);
    }

    @DeleteMapping("/{reservation-id}")
    public ResponseEntity<Void> deleteReservation(@RequestHeader("Access-Token") String token, @PathVariable("reservation-id") Integer reservationId){
        return ResponseEntity.ok().build();
    }

}
