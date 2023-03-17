package com.springframework5.pets;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
@Profile({"dog","default"})
@Service
public class DogService implements PetServices{
    @Override
    public String getPetType() {
        return "Dogs are best according to Zri";
    }
}
