package spring.testcase.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.testcase.model.City;
import spring.testcase.model.Country;
import spring.testcase.repository.ICountryRepository;

import java.util.Optional;

@Service
public class CountryService implements ICountryService {
    @Autowired
    ICountryRepository countryRepository;
    @Override
    public Iterable<Country> findAll() {
        return countryRepository.findAll();
    }

    @Override
    public Optional<Country> findById(Long id) {
        return countryRepository.findById(id);
    }

    @Override
    public Country save(Country country) {
        return countryRepository.save(country);
    }

    @Override
    public void deleteById(Long id) {
        countryRepository.deleteById(id);
    }
}
