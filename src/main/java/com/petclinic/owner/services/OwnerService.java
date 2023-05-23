package com.petclinic.owner.services;

import com.petclinic.owner.repositories.OwnerRepository;
import com.petclinic.owner.models.Owner;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OwnerService {

    private OwnerRepository ownerRepository;

    public OwnerService(OwnerRepository ownerRepository) {
        this.ownerRepository = ownerRepository;
    }

    public List<Owner> getAllOwners() {
        return this.ownerRepository.findAll();
    }

    public Owner postOwner(Owner owner) {
        return this.ownerRepository.save(owner);
    }
}
