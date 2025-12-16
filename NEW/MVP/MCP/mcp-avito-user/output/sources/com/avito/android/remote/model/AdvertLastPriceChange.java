package com.avito.android.remote.model;

import Y61.k;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AdvertNavBar.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/model/AdvertLastPriceChange;", "", "(Ljava/lang/String;I)V", "UP", "DOWN", "_avito-discouraged_avito-api_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class AdvertLastPriceChange {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ AdvertLastPriceChange[] $VALUES;

    /* renamed from: UP, reason: collision with root package name */
    @c(ServiceTypeKt.SERVICE_PUSHUP)
    public static final AdvertLastPriceChange f253578UP = new AdvertLastPriceChange("UP", 0);

    @c("down")
    public static final AdvertLastPriceChange DOWN = new AdvertLastPriceChange("DOWN", 1);

    private static final /* synthetic */ AdvertLastPriceChange[] $values() {
        return new AdvertLastPriceChange[]{f253578UP, DOWN};
    }

    static {
        AdvertLastPriceChange[] advertLastPriceChangeArr$values = $values();
        $VALUES = advertLastPriceChangeArr$values;
        $ENTRIES = kotlin.enums.c.a(advertLastPriceChangeArr$values);
    }

    private AdvertLastPriceChange(String str, int i12) {
    }

    @k
    public static a<AdvertLastPriceChange> getEntries() {
        return $ENTRIES;
    }

    public static AdvertLastPriceChange valueOf(String str) {
        return (AdvertLastPriceChange) Enum.valueOf(AdvertLastPriceChange.class, str);
    }

    public static AdvertLastPriceChange[] values() {
        return (AdvertLastPriceChange[]) $VALUES.clone();
    }
}
