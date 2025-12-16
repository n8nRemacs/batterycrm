package com.avito.android.iac_avcalls.public_module.models;

import Y61.k;
import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AvCallsCallDirection.kt */
@Keep
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/iac_avcalls/public_module/models/AvCallsCallDirection;", "", "(Ljava/lang/String;I)V", "OUTGOING", "INCOMING", "_avito_iac-avcalls_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AvCallsCallDirection {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ AvCallsCallDirection[] $VALUES;
    public static final AvCallsCallDirection OUTGOING = new AvCallsCallDirection("OUTGOING", 0);
    public static final AvCallsCallDirection INCOMING = new AvCallsCallDirection("INCOMING", 1);

    private static final /* synthetic */ AvCallsCallDirection[] $values() {
        return new AvCallsCallDirection[]{OUTGOING, INCOMING};
    }

    static {
        AvCallsCallDirection[] avCallsCallDirectionArr$values = $values();
        $VALUES = avCallsCallDirectionArr$values;
        $ENTRIES = c.a(avCallsCallDirectionArr$values);
    }

    private AvCallsCallDirection(String str, int i12) {
    }

    @k
    public static a<AvCallsCallDirection> getEntries() {
        return $ENTRIES;
    }

    public static AvCallsCallDirection valueOf(String str) {
        return (AvCallsCallDirection) Enum.valueOf(AvCallsCallDirection.class, str);
    }

    public static AvCallsCallDirection[] values() {
        return (AvCallsCallDirection[]) $VALUES.clone();
    }
}
