package com.avito.android.remote.model;

import Y61.k;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: RealtyInfo.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/avito/android/remote/model/TransactionType;", "", "(Ljava/lang/String;I)V", "LTR", "STR", "LTL", "STL", "SELL", "BUY", "_avito-discouraged_avito-api_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class TransactionType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ TransactionType[] $VALUES;

    @c("ltr")
    public static final TransactionType LTR = new TransactionType("LTR", 0);

    @c("str")
    public static final TransactionType STR = new TransactionType("STR", 1);

    @c("ltl")
    public static final TransactionType LTL = new TransactionType("LTL", 2);

    @c("stl")
    public static final TransactionType STL = new TransactionType("STL", 3);

    @c("sell")
    public static final TransactionType SELL = new TransactionType("SELL", 4);

    @c("buy")
    public static final TransactionType BUY = new TransactionType("BUY", 5);

    private static final /* synthetic */ TransactionType[] $values() {
        return new TransactionType[]{LTR, STR, LTL, STL, SELL, BUY};
    }

    static {
        TransactionType[] transactionTypeArr$values = $values();
        $VALUES = transactionTypeArr$values;
        $ENTRIES = kotlin.enums.c.a(transactionTypeArr$values);
    }

    private TransactionType(String str, int i12) {
    }

    @k
    public static a<TransactionType> getEntries() {
        return $ENTRIES;
    }

    public static TransactionType valueOf(String str) {
        return (TransactionType) Enum.valueOf(TransactionType.class, str);
    }

    public static TransactionType[] values() {
        return (TransactionType[]) $VALUES.clone();
    }
}
