package com.avito.android.avito_map;

import Y61.k;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AvitoMap.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/avito_map/AvitoMapMoveReason;", "", "(Ljava/lang/String;I)V", "DEVELOPER_ANIMATION", "GESTURE", "API_ANIMATION", GrsBaseInfo.CountryCodeSource.UNKNOWN, "_avito_avito-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AvitoMapMoveReason {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ AvitoMapMoveReason[] $VALUES;
    public static final AvitoMapMoveReason DEVELOPER_ANIMATION = new AvitoMapMoveReason("DEVELOPER_ANIMATION", 0);
    public static final AvitoMapMoveReason GESTURE = new AvitoMapMoveReason("GESTURE", 1);
    public static final AvitoMapMoveReason API_ANIMATION = new AvitoMapMoveReason("API_ANIMATION", 2);
    public static final AvitoMapMoveReason UNKNOWN = new AvitoMapMoveReason(GrsBaseInfo.CountryCodeSource.UNKNOWN, 3);

    private static final /* synthetic */ AvitoMapMoveReason[] $values() {
        return new AvitoMapMoveReason[]{DEVELOPER_ANIMATION, GESTURE, API_ANIMATION, UNKNOWN};
    }

    static {
        AvitoMapMoveReason[] avitoMapMoveReasonArr$values = $values();
        $VALUES = avitoMapMoveReasonArr$values;
        $ENTRIES = c.a(avitoMapMoveReasonArr$values);
    }

    private AvitoMapMoveReason(String str, int i12) {
    }

    @k
    public static a<AvitoMapMoveReason> getEntries() {
        return $ENTRIES;
    }

    public static AvitoMapMoveReason valueOf(String str) {
        return (AvitoMapMoveReason) Enum.valueOf(AvitoMapMoveReason.class, str);
    }

    public static AvitoMapMoveReason[] values() {
        return (AvitoMapMoveReason[]) $VALUES.clone();
    }
}
