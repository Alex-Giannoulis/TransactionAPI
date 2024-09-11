package com.example.Transaction.API;

import java.util.Objects;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;





public interface UserRepository extends JpaRepository<User, Long>{
    @Modifying
    @Query("Update Users set balance = balance + :amount where accountID = :accountID")
    void deposit(@Param("accountID")Long accountID, @Param("balance")double balance);

    @Modifying
    @Query("Update Users set balance = balance - :amount where accountID = :accountID")
    void withdraw(@Param("accountID")Long accountID, @Param("balance")double balance);

} 
