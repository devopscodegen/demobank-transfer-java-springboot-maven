package com.demobank.transfer.application.transfer;

public class TransferCommand {

    private String fromAccountId;
    private String toAccountId;
    private Double amount;
    private String currencyCode;

    public TransferCommand(String fromAccountId, String toAccountId, Double amount, String currencyCode) {
        super();

        this.setFromAccountId(fromAccountId);
        this.setToAccountId(toAccountId);
        this.setAmount(amount);
        this.setCurrencyCode(currencyCode);
    }

    public TransferCommand() {
        super();
    }

    public String getFromAccountId() {
        return fromAccountId;
    }

    public void setFromAccountId(String fromAccountId) {
        this.fromAccountId = fromAccountId;
    }

    public String getToAccountId() {
        return toAccountId;
    }

    public void setToAccountId(String toAccountId) {
        this.toAccountId = toAccountId;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }
}