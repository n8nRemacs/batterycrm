package com.avito.android.beduin.common.component.separator;

import Y61.k;
import androidx.annotation.Keep;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SeparatorStyle.kt */
@Keep
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/beduin/common/component/separator/SeparatorStyle;", "", "(Ljava/lang/String;I)V", "FULL_WIDTH", "LEFT_INSET", "SIDE_INSET", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class SeparatorStyle {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES;
    private static final /* synthetic */ SeparatorStyle[] $VALUES;

    @com.google.gson.annotations.c("fullWidth")
    public static final SeparatorStyle FULL_WIDTH = new SeparatorStyle("FULL_WIDTH", 0);

    @com.google.gson.annotations.c("leftInset")
    public static final SeparatorStyle LEFT_INSET = new SeparatorStyle("LEFT_INSET", 1);

    @com.google.gson.annotations.c("sideInset")
    public static final SeparatorStyle SIDE_INSET = new SeparatorStyle("SIDE_INSET", 2);

    private static final /* synthetic */ SeparatorStyle[] $values() {
        return new SeparatorStyle[]{FULL_WIDTH, LEFT_INSET, SIDE_INSET};
    }

    static {
        SeparatorStyle[] separatorStyleArr$values = $values();
        $VALUES = separatorStyleArr$values;
        $ENTRIES = kotlin.enums.c.a(separatorStyleArr$values);
    }

    private SeparatorStyle(String str, int i12) {
    }

    @k
    public static kotlin.enums.a<SeparatorStyle> getEntries() {
        return $ENTRIES;
    }

    public static SeparatorStyle valueOf(String str) {
        return (SeparatorStyle) Enum.valueOf(SeparatorStyle.class, str);
    }

    public static SeparatorStyle[] values() {
        return (SeparatorStyle[]) $VALUES.clone();
    }
}
