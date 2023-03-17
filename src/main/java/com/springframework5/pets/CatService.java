package com.springframework5.pets;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
@Profile("cat")
@Service
public class CatService implements PetServices{
    @Override
    public String getPetType() {
        return "Cats are best according to Mate";
    }
}
