package com.mfarias25.placeservice.domain;

import com.github.slugify.Slugify;
import com.mfarias25.placeservice.apí.PlaceRequest;
import reactor.core.publisher.Mono;

//Service: Responsavel pelas regras de negocio na aplicação.
public class PlaceService {
    private PlaceRepository placeRepository;
    private Slugify slg;

    public PlaceService(PlaceRepository placeRepository) {
        this.placeRepository = placeRepository;
        this.slg = Slugify.builder().build();
    }

    public Mono<Place> create(PlaceRequest placeRequest) {
        var place = new Place(null, placeRequest.name(), slg.slugify(placeRequest.name()),
                placeRequest.state(), null, null);

        return placeRepository.save((place));
    }
}
