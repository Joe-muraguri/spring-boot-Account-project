package com.joe.AccountSystem.Service;

import com.joe.AccountSystem.Model.Account;

import java.util.List;
import java.util.Optional;

public interface AccountService {

    List<Account> getAllAccounts();

    Optional<Account> findAccountById(Integer id);

    Account createAccount(Account account);
    Account updateAccount(Account account, Integer id);
    void deleteAccount(Integer id);



}
