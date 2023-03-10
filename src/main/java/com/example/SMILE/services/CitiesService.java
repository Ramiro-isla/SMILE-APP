package com.example.SMILE.services;
import java.util.List;
import java.util.Optional;
import com.example.SMILE.models.Cities;
import com.example.SMILE.repositories.CitiesRepository;

public class CitiesService {
    private CitiesRepository repository;

    public CitiesService(CitiesRepository repository){
        this.repository = repository;
    }

    public List<Cities> getAll(){
        return repository.findAll();
    }

    public Cities getOne(Long id) {
       Cities cities = repository.findById(id).orElse(null);
        return cities;
    }

    public Cities  save(Cities cities) {
        Cities citiesSaved = repository.save(cities);
        return citiesSaved;
    }

    public static Optional <Cities> findById(Long id){
        return null;
    }
}
