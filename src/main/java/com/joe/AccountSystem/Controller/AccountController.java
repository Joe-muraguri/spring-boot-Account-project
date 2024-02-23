package com.joe.AccountSystem.Controller;

import com.joe.AccountSystem.Model.Account;
import com.joe.AccountSystem.Service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/accounts")
public class AccountController {
    @Autowired
    private AccountService accountService;

    @GetMapping
    public ResponseEntity<List<Account>> getAllAccounts(){

        return ResponseEntity.ok(accountService.getAllAccounts());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Account>> getAccountById(@PathVariable Integer id){
        return ResponseEntity.ok(accountService.findAccountById(id));
    }

    @PostMapping
    public ResponseEntity createAccount(@RequestBody Account account){
        return ResponseEntity.ok(accountService.createAccount(account));
    }

    @PutMapping("/{id}")
    public ResponseEntity updateAccount(@PathVariable Integer id, @RequestBody Account account){
        return ResponseEntity.ok(accountService.updateAccount(account,id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteAccount(@PathVariable Integer id){
        accountService.deleteAccount(id);
        return ResponseEntity.ok().build();
    }
}
