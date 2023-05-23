package com.petclinic.owner.controllers;

import com.petclinic.owner.models.Owner;
import com.petclinic.owner.services.OwnerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/owners")
public class OwnerController {

    private OwnerService ownerService;

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @GetMapping("/message")
    public String getMessage() {
        return "Hello from OwnerController";
    }

    @GetMapping("/all")
    public List<Owner> getAllOwners() {
        return this.ownerService.getAllOwners();
    }

    @PostMapping("/add")
    public Owner postOwner(@RequestBody Owner owner) {
        return this.ownerService.postOwner(owner);
    }
}
