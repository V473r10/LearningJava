package com.v473r10.market.domain.service;

import com.v473r10.market.domain.Purchase;
import com.v473r10.market.domain.repository.PurchaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PurchaseService {
    @Autowired
    private PurchaseRepository purchaseRepository;

    public List<Purchase> getAll() {return purchaseRepository.getAll();}
    public Optional<Purchase> getById(int purchaseId) {return purchaseRepository.getById(purchaseId); }

    public Optional<List<Purchase>> getClientPurchases(String clientId) { return purchaseRepository.getByClient(clientId ); }

    public Purchase save (Purchase purchase) { return purchaseRepository.save(purchase); }


}
