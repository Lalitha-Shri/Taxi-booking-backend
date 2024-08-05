package com.example.TaxiBookingBackend.Repository;

import com.example.TaxiBookingBackend.Entity.Taxi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaxiRepository extends JpaRepository<Taxi,Long> {
}
