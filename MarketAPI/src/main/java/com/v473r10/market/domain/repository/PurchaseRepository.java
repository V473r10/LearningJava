package com.v473r10.market.domain.repository;

import com.v473r10.market.domain.Purchase;

import java.util.List;
import java.util.Optional;

public interface PurchaseRepository {
    List<Purchase> getAll();
    Optional<Purchase> getById(int purchaseId);
    Optional<List<Purchase>> getByClient(String clientId);
    Purchase save(Purchase purchase);
}
