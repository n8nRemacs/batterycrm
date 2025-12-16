package com.avito.android.remote.model;

import Y61.k;
import com.adjust.sdk.Constants;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Offers.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/remote/model/OfferType;", "", "(Ljava/lang/String;I)V", "SMALL_CARD_OFFER", "_avito-discouraged_avito-api_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class OfferType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ OfferType[] $VALUES;

    @c(Constants.SMALL)
    public static final OfferType SMALL_CARD_OFFER = new OfferType("SMALL_CARD_OFFER", 0);

    private static final /* synthetic */ OfferType[] $values() {
        return new OfferType[]{SMALL_CARD_OFFER};
    }

    static {
        OfferType[] offerTypeArr$values = $values();
        $VALUES = offerTypeArr$values;
        $ENTRIES = kotlin.enums.c.a(offerTypeArr$values);
    }

    private OfferType(String str, int i12) {
    }

    @k
    public static a<OfferType> getEntries() {
        return $ENTRIES;
    }

    public static OfferType valueOf(String str) {
        return (OfferType) Enum.valueOf(OfferType.class, str);
    }

    public static OfferType[] values() {
        return (OfferType[]) $VALUES.clone();
    }
}
