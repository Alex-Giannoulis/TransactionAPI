package com.example.Transaction.API;

import java.util.Objects;

@Service
public class Transaction[
    private final UserRepository userRepository;

    public Transaction(UserRepository userRepository){
        this.userRepository = userRepository;
    }
    @Transactional
    public void transfer(Long fromAccountID, Long toAccountID, double balance){
        UserRepository.deposit(toAccountID, balance);
        UserRepository.withdraw(fromAccountID, balance);
    }
]