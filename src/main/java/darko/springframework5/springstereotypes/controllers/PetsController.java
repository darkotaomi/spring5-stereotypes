package darko.springframework5.springstereotypes.controllers;

import com.springframework5.pets.PetServices;
import org.springframework.stereotype.Controller;

@Controller
public class PetsController {
    private final PetServices petServices;

    public PetsController(PetServices petServices) {
        this.petServices = petServices;
    }

    public String getBestPet(){
        return petServices.getPetType();
    }
}
