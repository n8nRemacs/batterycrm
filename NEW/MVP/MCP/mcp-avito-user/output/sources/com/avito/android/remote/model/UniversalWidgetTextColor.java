package com.avito.android.remote.model;

import Y61.k;
import com.avito.android.avito_map.AvitoMapMarkerKt;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ExtendedProfileUniversalWidget.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/model/UniversalWidgetTextColor;", "", "(Ljava/lang/String;I)V", "BLACK", "WHITE", "_avito-discouraged_avito-api_extended-profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class UniversalWidgetTextColor {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ UniversalWidgetTextColor[] $VALUES;

    @c(AvitoMapMarkerKt.AMENITY_TYPE_BLACK)
    public static final UniversalWidgetTextColor BLACK = new UniversalWidgetTextColor("BLACK", 0);

    @c("white")
    public static final UniversalWidgetTextColor WHITE = new UniversalWidgetTextColor("WHITE", 1);

    private static final /* synthetic */ UniversalWidgetTextColor[] $values() {
        return new UniversalWidgetTextColor[]{BLACK, WHITE};
    }

    static {
        UniversalWidgetTextColor[] universalWidgetTextColorArr$values = $values();
        $VALUES = universalWidgetTextColorArr$values;
        $ENTRIES = kotlin.enums.c.a(universalWidgetTextColorArr$values);
    }

    private UniversalWidgetTextColor(String str, int i12) {
    }

    @k
    public static a<UniversalWidgetTextColor> getEntries() {
        return $ENTRIES;
    }

    public static UniversalWidgetTextColor valueOf(String str) {
        return (UniversalWidgetTextColor) Enum.valueOf(UniversalWidgetTextColor.class, str);
    }

    public static UniversalWidgetTextColor[] values() {
        return (UniversalWidgetTextColor[]) $VALUES.clone();
    }
}
