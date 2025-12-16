package com.avito.android.remote.model;

import Y61.k;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ExtendedProfileUniversalWidget.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/remote/model/UniversalWidgetTextSectionType;", "", "(Ljava/lang/String;I)V", "FULL_WIDTH", "_avito-discouraged_avito-api_extended-profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class UniversalWidgetTextSectionType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ UniversalWidgetTextSectionType[] $VALUES;

    @c("full_width")
    public static final UniversalWidgetTextSectionType FULL_WIDTH = new UniversalWidgetTextSectionType("FULL_WIDTH", 0);

    private static final /* synthetic */ UniversalWidgetTextSectionType[] $values() {
        return new UniversalWidgetTextSectionType[]{FULL_WIDTH};
    }

    static {
        UniversalWidgetTextSectionType[] universalWidgetTextSectionTypeArr$values = $values();
        $VALUES = universalWidgetTextSectionTypeArr$values;
        $ENTRIES = kotlin.enums.c.a(universalWidgetTextSectionTypeArr$values);
    }

    private UniversalWidgetTextSectionType(String str, int i12) {
    }

    @k
    public static a<UniversalWidgetTextSectionType> getEntries() {
        return $ENTRIES;
    }

    public static UniversalWidgetTextSectionType valueOf(String str) {
        return (UniversalWidgetTextSectionType) Enum.valueOf(UniversalWidgetTextSectionType.class, str);
    }

    public static UniversalWidgetTextSectionType[] values() {
        return (UniversalWidgetTextSectionType[]) $VALUES.clone();
    }
}
