package com.avito.android.remote.model.user_profile.items;

import Y61.k;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AvitoFinanceItem.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/remote/model/user_profile/items/FeatureType;", "", "(Ljava/lang/String;I)V", "INSTALLMENTS_REPAYMENT", "INSTALLMENTS_PROMO", "PURCHASE_WALLET", "SERVICE_WALLET", "SPLIT_WALLET", "WALLET_TOPUP", "BONUSES", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class FeatureType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ FeatureType[] $VALUES;

    @c("installmentsRepayment")
    public static final FeatureType INSTALLMENTS_REPAYMENT = new FeatureType("INSTALLMENTS_REPAYMENT", 0);

    @c("installmentsPromo")
    public static final FeatureType INSTALLMENTS_PROMO = new FeatureType("INSTALLMENTS_PROMO", 1);

    @c("purchaseWallet")
    public static final FeatureType PURCHASE_WALLET = new FeatureType("PURCHASE_WALLET", 2);

    @c("serviceWallet")
    public static final FeatureType SERVICE_WALLET = new FeatureType("SERVICE_WALLET", 3);

    @c("splitWallet")
    public static final FeatureType SPLIT_WALLET = new FeatureType("SPLIT_WALLET", 4);

    @c("purchaseWalletTopup")
    public static final FeatureType WALLET_TOPUP = new FeatureType("WALLET_TOPUP", 5);

    @c("bonuses")
    public static final FeatureType BONUSES = new FeatureType("BONUSES", 6);

    private static final /* synthetic */ FeatureType[] $values() {
        return new FeatureType[]{INSTALLMENTS_REPAYMENT, INSTALLMENTS_PROMO, PURCHASE_WALLET, SERVICE_WALLET, SPLIT_WALLET, WALLET_TOPUP, BONUSES};
    }

    static {
        FeatureType[] featureTypeArr$values = $values();
        $VALUES = featureTypeArr$values;
        $ENTRIES = kotlin.enums.c.a(featureTypeArr$values);
    }

    private FeatureType(String str, int i12) {
    }

    @k
    public static a<FeatureType> getEntries() {
        return $ENTRIES;
    }

    public static FeatureType valueOf(String str) {
        return (FeatureType) Enum.valueOf(FeatureType.class, str);
    }

    public static FeatureType[] values() {
        return (FeatureType[]) $VALUES.clone();
    }
}
