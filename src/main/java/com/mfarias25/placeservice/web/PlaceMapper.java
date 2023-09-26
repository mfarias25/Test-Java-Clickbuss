package com.mfarias25.placeservice.web;

import com.mfarias25.placeservice.apí.PlaceResponse;
import com.mfarias25.placeservice.domain.Place;

public class PlaceMapper {
    public static PlaceResponse toResponse(Place place){
        return new PlaceResponse(place.name(),place.slug(),
                place.state(), place.createdAt(), place.updatedAt());
    }
}
