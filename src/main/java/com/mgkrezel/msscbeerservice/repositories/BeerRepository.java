package com.mgkrezel.msscbeerservice.repositories;

import com.mgkrezel.msscbeerservice.domain.Beer;
import org.springframework.data.jpa.repository.Lock;
import org.springframework.data.repository.PagingAndSortingRepository;

import javax.persistence.LockModeType;
import java.util.Optional;
import java.util.UUID;

public interface BeerRepository extends PagingAndSortingRepository<Beer, UUID> {

    @Override
    @Lock(LockModeType.PESSIMISTIC_WRITE)
    Optional<Beer> findById(UUID id);

}
