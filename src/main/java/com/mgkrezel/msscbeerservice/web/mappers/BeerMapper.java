package com.mgkrezel.msscbeerservice.web.mappers;

import com.mgkrezel.msscbeerservice.domain.Beer;
import com.mgkrezel.msscbeerservice.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface BeerMapper {
    BeerDto beerToBeerDto(Beer beer);
    Beer beerDtoToBeer(BeerDto beerDto);
}
