package com.avito.avcalls.call.models;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CameraPosition.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/avcalls/call/models/CameraPosition;", "", "(Ljava/lang/String;I)V", "FRONT", "BACK", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CameraPosition {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ CameraPosition[] $VALUES;
    public static final CameraPosition FRONT = new CameraPosition("FRONT", 0);
    public static final CameraPosition BACK = new CameraPosition("BACK", 1);

    private static final /* synthetic */ CameraPosition[] $values() {
        return new CameraPosition[]{FRONT, BACK};
    }

    static {
        CameraPosition[] cameraPositionArr$values = $values();
        $VALUES = cameraPositionArr$values;
        $ENTRIES = c.a(cameraPositionArr$values);
    }

    private CameraPosition(String str, int i12) {
    }

    public static CameraPosition valueOf(String str) {
        return (CameraPosition) Enum.valueOf(CameraPosition.class, str);
    }

    public static CameraPosition[] values() {
        return (CameraPosition[]) $VALUES.clone();
    }
}
