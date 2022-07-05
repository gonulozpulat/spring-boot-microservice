package com.sha.springbootmicroservicetransaction.service;

import com.sha.springbootmicroservicetransaction.model.Transaction;

import java.util.List;

public interface ITransactionService {
    Transaction saveTransaction(Transaction transaction);

    void deleteTransaction(Long transactionId);

    List<Transaction> findAllTransaction(Long userId);
}
