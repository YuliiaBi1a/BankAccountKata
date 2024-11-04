# Bank Account Kata 
(completed as part of the tasks of the bootcamp FactoriaF5 - AWS_Cloud & Backend) 

> **Goal:** Practice basic OOP principles such as Abstraction and Encapsulation using Test-Driven Development (TDD).

## Table of Contents
- [Requirements](#requirements)
- [Project Structure](#project-structure)
- [Implementation Details](#implementation-details)
- [How to Run Tests](#how-to-run-tests)

---

## ⚙️ Requirements

This kata uses TDD as the main development methodology, focusing on cycles of:
- **Test** → **Red** → **Green** → **Refactor** 🔁

**Rules:**
- You cannot write code without a failing test.
- New tests must always initially fail.
- Write the simplest solution to pass the tests; refactor afterward.

---

## 👀 Objective

Develop a simple bank account management system that allows users to:
1. **Create an Account**
2. **Deposit Money**
3. **Withdraw Money**
4. **Check Account Balance**

This exercise will help solidify your understanding of Object-Oriented Programming (OOP), managing state, and designing a simple API.

## 🏁 Context

You are tasked with implementing a banking system that manages account information. Users should be able to:
- Create accounts with unique account numbers
- Deposit money into their accounts
- Withdraw money (with a sufficient balance)
- Check their current balance

---

## Implementation Details

### Class: `Account`

This class represents a bank account with the following attributes and methods:

- **Attributes:**
    - `String accountNumber`: Unique account identifier, auto-generated in the format "ES" + 22 random digits.
    - `double balance`: Represents the account balance, initialized to 0.

- **Methods:**
    - **Constructor `Account()`**: Initializes a new account with a unique number and a balance of 0.
    - **`String getCountNumber()`**: Returns the unique account number.
    - **`void setCountNumber(String accountNumber)`**: Sets a custom account number.
    - **`double getSaldo()`**: Returns the current account balance.
    - **`void setSaldo(double balance)`**: Sets the account balance.
    - **`Double depositingMoney(int amount)`**: Adds funds to the account if `amount` is positive.
    - **`Double withdrawMoney(int amount)`**: Withdraws funds if `amount` is positive and does not exceed the balance.
    - **`String toString()`**: Returns a string representation of the account.

---

## 🧪 Tests

The `AccountTest` class contains tests to verify the main functionalities:

### Test Methods:
1. **Deposit Tests**
    - **`testDepositingMoneyPositiveAmount()`**: Verifies that the balance increases after a positive deposit.
    - **`testDepositingMoneyNegativeAmount()`**: Ensures balance remains unchanged with a negative deposit.

2. **Withdrawal Tests**
    - **`testWithdrawMoneyValidAmount()`**: Confirms balance decreases after a valid withdrawal.
    - **`testWithdrawMoneyExceedsBalance()`**: Checks balance remains unchanged if withdrawal exceeds balance.
    - **`testWithdrawMoneyNegativeAmount()`**: Ensures balance remains unchanged if withdrawal is negative.

3. **Balance Tests**
    - **`testGetSaldoInitial()`**: Ensures initial balance is zero.
    - **`testGetSaldoAfterDeposit()`**: Verifies balance updates correctly after deposit.
    - **`testGetSaldoAfterWithdraw()`**: Confirms balance updates correctly after valid withdrawal.
    - **`testGetSaldoAfterInvalidWithdraw()`**: Checks balance remains unchanged after an invalid withdrawal.

---

## How to Run Tests

1. **Compile the Project**: Ensure `Account.java` and `AccountTest.java` are compiled.
2. **Run Tests**: Use JUnit (or any Java IDE with JUnit support) to run `AccountTest.java`.
3. **Verify Output**: Check that all tests pass. Failing tests should be addressed as per TDD guidelines.

---

## Notes

- Ensure that no more than the available balance can be withdrawn.
- Each account has a unique account number.
- Only positive amounts are accepted for deposits and withdrawals.

## Author

- Yulia Bila
- https://github.com/YuliiaBi1a


**Happy Coding!**
