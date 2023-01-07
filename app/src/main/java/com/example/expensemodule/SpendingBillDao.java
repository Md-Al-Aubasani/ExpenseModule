package com.example.expensemodule;

import androidx.room.*;

import java.util.List;

@Dao
public interface SpendingBillDao {

    @Query("SELECT * FROM spending_bills_table")
    public List<SpendingBill> getAllSpendingBills();

    @Insert
    public void addSpendingBill(SpendingBill spendingBill);

    @Update
    public void updateSpendingBill(SpendingBill spendingBill);

    @Delete
    public void deleteSpendingBill(SpendingBill spendingBill);
}
