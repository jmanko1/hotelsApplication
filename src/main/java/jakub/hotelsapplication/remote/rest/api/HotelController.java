package jakub.hotelsapplication.remote.rest.api;

import jakub.hotelsapplication.remote.rest.dto.response.HotelCollectionDto;
import jakub.hotelsapplication.remote.rest.dto.response.HotelDto;
import jakub.hotelsapplication.remote.rest.dto.response.RoomDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RequestMapping(value = "/api/v1/hotels", produces = APPLICATION_JSON_VALUE)
@RestController
public class HotelController {

    @GetMapping
    public ResponseEntity<HotelCollectionDto> getHotels(){

        RoomDto roomDto = new RoomDto(3, "1", BigDecimal.valueOf(31.20));
        HotelDto hotelDto = new HotelDto(2, "HotelHilton", List.of(roomDto));
        HotelCollectionDto hotelCollectionDto = new HotelCollectionDto(List.of(hotelDto));

        return ResponseEntity.ok(hotelCollectionDto);

    }

}
