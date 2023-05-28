package bitxon.db;

import static bitxon.generated.jooq.Tables.ACCOUNT;

import bitxon.generated.jooq.tables.records.AccountRecord;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;


@Component
public class AccountDao {

    @Autowired
    DSLContext dslContext;

    public Optional<AccountRecord> findById(Integer id) {
        return dslContext.selectFrom(ACCOUNT)
            .where(ACCOUNT.ID.eq(id))
            .fetchOptional();
    }

    public void updateMoneyAmount(Integer id, Integer newMoneyAmount) {
        dslContext.update(ACCOUNT)
            .set(ACCOUNT.MONEY_AMOUNT, newMoneyAmount)
            .where(ACCOUNT.ID.eq(id))
            .execute();
    }


}
