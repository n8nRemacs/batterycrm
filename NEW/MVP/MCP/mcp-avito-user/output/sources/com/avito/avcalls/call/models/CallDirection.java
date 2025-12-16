package com.avito.avcalls.call.models;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CallDirection.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/avcalls/call/models/CallDirection;", "", "(Ljava/lang/String;I)V", "OUTGOING", "INCOMING", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CallDirection {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ CallDirection[] $VALUES;
    public static final CallDirection OUTGOING = new CallDirection("OUTGOING", 0);
    public static final CallDirection INCOMING = new CallDirection("INCOMING", 1);

    private static final /* synthetic */ CallDirection[] $values() {
        return new CallDirection[]{OUTGOING, INCOMING};
    }

    static {
        CallDirection[] callDirectionArr$values = $values();
        $VALUES = callDirectionArr$values;
        $ENTRIES = c.a(callDirectionArr$values);
    }

    private CallDirection(String str, int i12) {
    }

    public static CallDirection valueOf(String str) {
        return (CallDirection) Enum.valueOf(CallDirection.class, str);
    }

    public static CallDirection[] values() {
        return (CallDirection[]) $VALUES.clone();
    }
}
