package com.mgkrezel.msscbeerservice.web.controller;

import com.mgkrezel.msscbeerservice.web.model.BeerDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/beer")
public class BeerController {

    @GetMapping("/{beerId}")
    public ResponseEntity<BeerDto> getBeerById(@PathVariable("beerId") UUID beerId) {
        // TODO: 26.12.2020 impl
        return new ResponseEntity<>(BeerDto.builder().build(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<?> saveNewBeer(@RequestBody BeerDto beerDto) {
        // TODO: 26.12.2020 impl
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PutMapping("/{beerId}")
    public ResponseEntity<?> updateBeerById(@PathVariable("beerId") UUID beerId, @RequestBody BeerDto beerDto) {
        // TODO: 26.12.2020 impl
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
