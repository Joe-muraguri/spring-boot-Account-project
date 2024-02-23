package com.joe.AccountSystem.Repository;

import com.joe.AccountSystem.Model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Integer> {

}
