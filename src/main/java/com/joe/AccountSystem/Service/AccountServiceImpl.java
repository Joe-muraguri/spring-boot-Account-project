package com.joe.AccountSystem.Service;

import com.joe.AccountSystem.Model.Account;
import com.joe.AccountSystem.Repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountRepository accountRepository;

    @Override
    public List<Account> getAllAccounts() {
        return accountRepository.findAll();
    }


    @Override
    public Optional<Account> findAccountById(Integer id) {
        if (id.equals(null)){
            return Optional.empty();
        }

            return accountRepository.findById(id);
        }

        @Override
        public Account createAccount (Account account){
            return accountRepository.save(account);
        }

        @Override
        public Account updateAccount (Account account, Integer id){
            account.setId(id);
            return accountRepository.save(account);
        }

        @Override
        public void deleteAccount (Integer id){
            accountRepository.deleteById(id);

        }
    }

