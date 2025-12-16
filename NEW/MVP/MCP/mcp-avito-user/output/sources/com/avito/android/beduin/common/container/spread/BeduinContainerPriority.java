package com.avito.android.beduin.common.container.spread;

import androidx.annotation.Keep;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BeduinContainerPriority.kt */
@Keep
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/beduin/common/container/spread/BeduinContainerPriority;", "", "(Ljava/lang/String;I)V", "LEFT", "RIGHT", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BeduinContainerPriority {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES;
    private static final /* synthetic */ BeduinContainerPriority[] $VALUES;

    @com.google.gson.annotations.c("left")
    public static final BeduinContainerPriority LEFT = new BeduinContainerPriority("LEFT", 0);

    @com.google.gson.annotations.c("right")
    public static final BeduinContainerPriority RIGHT = new BeduinContainerPriority("RIGHT", 1);

    private static final /* synthetic */ BeduinContainerPriority[] $values() {
        return new BeduinContainerPriority[]{LEFT, RIGHT};
    }

    static {
        BeduinContainerPriority[] beduinContainerPriorityArr$values = $values();
        $VALUES = beduinContainerPriorityArr$values;
        $ENTRIES = kotlin.enums.c.a(beduinContainerPriorityArr$values);
    }

    private BeduinContainerPriority(String str, int i12) {
    }

    @Y61.k
    public static kotlin.enums.a<BeduinContainerPriority> getEntries() {
        return $ENTRIES;
    }

    public static BeduinContainerPriority valueOf(String str) {
        return (BeduinContainerPriority) Enum.valueOf(BeduinContainerPriority.class, str);
    }

    public static BeduinContainerPriority[] values() {
        return (BeduinContainerPriority[]) $VALUES.clone();
    }
}
