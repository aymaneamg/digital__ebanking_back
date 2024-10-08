package org.example.ebankingdigitalspringbootapps.repositories;

import org.example.ebankingdigitalspringbootapps.entities.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BankAccountRepository extends JpaRepository<BankAccount,String> {
    List<BankAccount> findByCustomer_Id(Long customerId);
}
