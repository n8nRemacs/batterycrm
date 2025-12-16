package com.avito.android.remote.model;

import Y61.k;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ExtendedProfileUniversalWidget.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/remote/model/UniversalWidgetImageWithTextSectionType;", "", "(Ljava/lang/String;I)V", "FULL_WIDTH", "IMG_WITH_TEXT", "TWO_COLUMNS", "THREE_COLUMNS", "FOUR_COLUMNS", "_avito-discouraged_avito-api_extended-profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class UniversalWidgetImageWithTextSectionType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ UniversalWidgetImageWithTextSectionType[] $VALUES;

    @c("full_width")
    public static final UniversalWidgetImageWithTextSectionType FULL_WIDTH = new UniversalWidgetImageWithTextSectionType("FULL_WIDTH", 0);

    @c("img_with_text")
    public static final UniversalWidgetImageWithTextSectionType IMG_WITH_TEXT = new UniversalWidgetImageWithTextSectionType("IMG_WITH_TEXT", 1);

    @c("2_columns")
    public static final UniversalWidgetImageWithTextSectionType TWO_COLUMNS = new UniversalWidgetImageWithTextSectionType("TWO_COLUMNS", 2);

    @c("3_columns")
    public static final UniversalWidgetImageWithTextSectionType THREE_COLUMNS = new UniversalWidgetImageWithTextSectionType("THREE_COLUMNS", 3);

    @c("4_columns")
    public static final UniversalWidgetImageWithTextSectionType FOUR_COLUMNS = new UniversalWidgetImageWithTextSectionType("FOUR_COLUMNS", 4);

    private static final /* synthetic */ UniversalWidgetImageWithTextSectionType[] $values() {
        return new UniversalWidgetImageWithTextSectionType[]{FULL_WIDTH, IMG_WITH_TEXT, TWO_COLUMNS, THREE_COLUMNS, FOUR_COLUMNS};
    }

    static {
        UniversalWidgetImageWithTextSectionType[] universalWidgetImageWithTextSectionTypeArr$values = $values();
        $VALUES = universalWidgetImageWithTextSectionTypeArr$values;
        $ENTRIES = kotlin.enums.c.a(universalWidgetImageWithTextSectionTypeArr$values);
    }

    private UniversalWidgetImageWithTextSectionType(String str, int i12) {
    }

    @k
    public static a<UniversalWidgetImageWithTextSectionType> getEntries() {
        return $ENTRIES;
    }

    public static UniversalWidgetImageWithTextSectionType valueOf(String str) {
        return (UniversalWidgetImageWithTextSectionType) Enum.valueOf(UniversalWidgetImageWithTextSectionType.class, str);
    }

    public static UniversalWidgetImageWithTextSectionType[] values() {
        return (UniversalWidgetImageWithTextSectionType[]) $VALUES.clone();
    }
}
