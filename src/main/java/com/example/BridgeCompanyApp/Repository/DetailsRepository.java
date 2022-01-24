package com.example.BridgeCompanyApp.Repository;

import com.example.BridgeCompanyApp.Entity.Details;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetailsRepository extends JpaRepository <Details, Integer> {
}
