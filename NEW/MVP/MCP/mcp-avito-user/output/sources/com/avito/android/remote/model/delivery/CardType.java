package com.avito.android.remote.model.delivery;

import Y61.k;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.payment.PaymentMethodTypeKt;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CardType.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/remote/model/delivery/CardType;", "", "(Ljava/lang/String;I)V", "VISA", "MASTERCARD", "MIR", "OTHER", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class CardType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ CardType[] $VALUES;

    @c(PaymentMethodTypeKt.PAYMENT_METHOD_TYPE_VISA)
    public static final CardType VISA = new CardType("VISA", 0);

    @c("mastercard")
    public static final CardType MASTERCARD = new CardType("MASTERCARD", 1);

    @c(PaymentMethodTypeKt.PAYMENT_METHOD_TYPE_MIR)
    public static final CardType MIR = new CardType("MIR", 2);

    @c(PluralsKeys.OTHER)
    public static final CardType OTHER = new CardType("OTHER", 3);

    private static final /* synthetic */ CardType[] $values() {
        return new CardType[]{VISA, MASTERCARD, MIR, OTHER};
    }

    static {
        CardType[] cardTypeArr$values = $values();
        $VALUES = cardTypeArr$values;
        $ENTRIES = kotlin.enums.c.a(cardTypeArr$values);
    }

    private CardType(String str, int i12) {
    }

    @k
    public static a<CardType> getEntries() {
        return $ENTRIES;
    }

    public static CardType valueOf(String str) {
        return (CardType) Enum.valueOf(CardType.class, str);
    }

    public static CardType[] values() {
        return (CardType[]) $VALUES.clone();
    }
}
