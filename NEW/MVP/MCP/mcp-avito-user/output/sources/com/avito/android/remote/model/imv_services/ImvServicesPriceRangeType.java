package com.avito.android.remote.model.imv_services;

import Y61.k;
import com.adjust.sdk.Constants;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ImvServices.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/remote/model/imv_services/ImvServicesPriceRangeType;", "", "(Ljava/lang/String;I)V", "LOW", "GOOD", "HIGH", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ImvServicesPriceRangeType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ ImvServicesPriceRangeType[] $VALUES;

    @c(Constants.LOW)
    public static final ImvServicesPriceRangeType LOW = new ImvServicesPriceRangeType("LOW", 0);

    @c("good")
    public static final ImvServicesPriceRangeType GOOD = new ImvServicesPriceRangeType("GOOD", 1);

    @c(Constants.HIGH)
    public static final ImvServicesPriceRangeType HIGH = new ImvServicesPriceRangeType("HIGH", 2);

    private static final /* synthetic */ ImvServicesPriceRangeType[] $values() {
        return new ImvServicesPriceRangeType[]{LOW, GOOD, HIGH};
    }

    static {
        ImvServicesPriceRangeType[] imvServicesPriceRangeTypeArr$values = $values();
        $VALUES = imvServicesPriceRangeTypeArr$values;
        $ENTRIES = kotlin.enums.c.a(imvServicesPriceRangeTypeArr$values);
    }

    private ImvServicesPriceRangeType(String str, int i12) {
    }

    @k
    public static a<ImvServicesPriceRangeType> getEntries() {
        return $ENTRIES;
    }

    public static ImvServicesPriceRangeType valueOf(String str) {
        return (ImvServicesPriceRangeType) Enum.valueOf(ImvServicesPriceRangeType.class, str);
    }

    public static ImvServicesPriceRangeType[] values() {
        return (ImvServicesPriceRangeType[]) $VALUES.clone();
    }
}
