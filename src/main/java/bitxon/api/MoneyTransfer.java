package bitxon.api;

public record MoneyTransfer(
    Integer senderId,
    Integer recipientId,
    Integer moneyAmount
) {}
