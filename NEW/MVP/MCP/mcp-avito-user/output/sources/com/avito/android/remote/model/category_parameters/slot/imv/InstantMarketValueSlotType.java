package com.avito.android.remote.model.category_parameters.slot.imv;

import Y61.k;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: InstantMarketValueSlotConfig.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/slot/imv/InstantMarketValueSlotType;", "", "(Ljava/lang/String;I)V", "FAIR_PRICING", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class InstantMarketValueSlotType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ InstantMarketValueSlotType[] $VALUES;

    @c("fairPricing")
    public static final InstantMarketValueSlotType FAIR_PRICING = new InstantMarketValueSlotType("FAIR_PRICING", 0);

    private static final /* synthetic */ InstantMarketValueSlotType[] $values() {
        return new InstantMarketValueSlotType[]{FAIR_PRICING};
    }

    static {
        InstantMarketValueSlotType[] instantMarketValueSlotTypeArr$values = $values();
        $VALUES = instantMarketValueSlotTypeArr$values;
        $ENTRIES = kotlin.enums.c.a(instantMarketValueSlotTypeArr$values);
    }

    private InstantMarketValueSlotType(String str, int i12) {
    }

    @k
    public static a<InstantMarketValueSlotType> getEntries() {
        return $ENTRIES;
    }

    public static InstantMarketValueSlotType valueOf(String str) {
        return (InstantMarketValueSlotType) Enum.valueOf(InstantMarketValueSlotType.class, str);
    }

    public static InstantMarketValueSlotType[] values() {
        return (InstantMarketValueSlotType[]) $VALUES.clone();
    }
}
