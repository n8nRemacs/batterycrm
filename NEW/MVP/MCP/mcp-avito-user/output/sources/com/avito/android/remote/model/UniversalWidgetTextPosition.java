package com.avito.android.remote.model;

import Y61.k;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ExtendedProfileUniversalWidget.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/model/UniversalWidgetTextPosition;", "", "(Ljava/lang/String;I)V", "IN", "OUT", "_avito-discouraged_avito-api_extended-profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class UniversalWidgetTextPosition {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ UniversalWidgetTextPosition[] $VALUES;

    /* renamed from: IN, reason: collision with root package name */
    @c("in")
    public static final UniversalWidgetTextPosition f253677IN = new UniversalWidgetTextPosition("IN", 0);

    @c("out")
    public static final UniversalWidgetTextPosition OUT = new UniversalWidgetTextPosition("OUT", 1);

    private static final /* synthetic */ UniversalWidgetTextPosition[] $values() {
        return new UniversalWidgetTextPosition[]{f253677IN, OUT};
    }

    static {
        UniversalWidgetTextPosition[] universalWidgetTextPositionArr$values = $values();
        $VALUES = universalWidgetTextPositionArr$values;
        $ENTRIES = kotlin.enums.c.a(universalWidgetTextPositionArr$values);
    }

    private UniversalWidgetTextPosition(String str, int i12) {
    }

    @k
    public static a<UniversalWidgetTextPosition> getEntries() {
        return $ENTRIES;
    }

    public static UniversalWidgetTextPosition valueOf(String str) {
        return (UniversalWidgetTextPosition) Enum.valueOf(UniversalWidgetTextPosition.class, str);
    }

    public static UniversalWidgetTextPosition[] values() {
        return (UniversalWidgetTextPosition[]) $VALUES.clone();
    }
}
