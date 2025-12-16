package com.avito.android.remote.model.user_profile.items;

import Y61.k;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AvitoFinanceItem.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/remote/model/user_profile/items/AccountType;", "", "(Ljava/lang/String;I)V", "BONUSES", "PURCHASE_WALLET", "SERVICE_WALLET", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class AccountType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ AccountType[] $VALUES;

    @c("bonuses")
    public static final AccountType BONUSES = new AccountType("BONUSES", 0);

    @c("purchaseWallet")
    public static final AccountType PURCHASE_WALLET = new AccountType("PURCHASE_WALLET", 1);

    @c("serviceWallet")
    public static final AccountType SERVICE_WALLET = new AccountType("SERVICE_WALLET", 2);

    private static final /* synthetic */ AccountType[] $values() {
        return new AccountType[]{BONUSES, PURCHASE_WALLET, SERVICE_WALLET};
    }

    static {
        AccountType[] accountTypeArr$values = $values();
        $VALUES = accountTypeArr$values;
        $ENTRIES = kotlin.enums.c.a(accountTypeArr$values);
    }

    private AccountType(String str, int i12) {
    }

    @k
    public static a<AccountType> getEntries() {
        return $ENTRIES;
    }

    public static AccountType valueOf(String str) {
        return (AccountType) Enum.valueOf(AccountType.class, str);
    }

    public static AccountType[] values() {
        return (AccountType[]) $VALUES.clone();
    }
}
