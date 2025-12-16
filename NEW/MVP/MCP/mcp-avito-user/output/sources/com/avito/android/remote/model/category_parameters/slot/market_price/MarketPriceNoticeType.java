package com.avito.android.remote.model.category_parameters.slot.market_price;

import Y61.k;
import com.adjust.sdk.Constants;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MarketPriceNoticeType.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/slot/market_price/MarketPriceNoticeType;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "LOWEST", "LOW", "NORMAL", "HIGHEST", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class MarketPriceNoticeType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ MarketPriceNoticeType[] $VALUES;

    @k
    private final String value;

    @c("greyLow")
    public static final MarketPriceNoticeType LOWEST = new MarketPriceNoticeType("LOWEST", 0, "greyLow");

    @c(Constants.LOW)
    public static final MarketPriceNoticeType LOW = new MarketPriceNoticeType("LOW", 1, Constants.LOW);

    @c(Constants.NORMAL)
    public static final MarketPriceNoticeType NORMAL = new MarketPriceNoticeType("NORMAL", 2, Constants.NORMAL);

    @c("greyHigh")
    public static final MarketPriceNoticeType HIGHEST = new MarketPriceNoticeType("HIGHEST", 3, "greyHigh");

    private static final /* synthetic */ MarketPriceNoticeType[] $values() {
        return new MarketPriceNoticeType[]{LOWEST, LOW, NORMAL, HIGHEST};
    }

    static {
        MarketPriceNoticeType[] marketPriceNoticeTypeArr$values = $values();
        $VALUES = marketPriceNoticeTypeArr$values;
        $ENTRIES = kotlin.enums.c.a(marketPriceNoticeTypeArr$values);
    }

    private MarketPriceNoticeType(String str, int i12, String str2) {
        this.value = str2;
    }

    @k
    public static a<MarketPriceNoticeType> getEntries() {
        return $ENTRIES;
    }

    public static MarketPriceNoticeType valueOf(String str) {
        return (MarketPriceNoticeType) Enum.valueOf(MarketPriceNoticeType.class, str);
    }

    public static MarketPriceNoticeType[] values() {
        return (MarketPriceNoticeType[]) $VALUES.clone();
    }

    @k
    public final String getValue() {
        return this.value;
    }
}
