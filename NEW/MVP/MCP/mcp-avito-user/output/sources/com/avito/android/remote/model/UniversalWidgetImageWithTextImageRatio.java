package com.avito.android.remote.model;

import Y61.k;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ExtendedProfileUniversalWidget.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/remote/model/UniversalWidgetImageWithTextImageRatio;", "", "(Ljava/lang/String;I)V", "ONE_TO_ONE", "FOUR_TO_THREE", "THREE_TO_FOUR", "FIX", "_avito-discouraged_avito-api_extended-profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class UniversalWidgetImageWithTextImageRatio {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ UniversalWidgetImageWithTextImageRatio[] $VALUES;

    @c("1_1")
    public static final UniversalWidgetImageWithTextImageRatio ONE_TO_ONE = new UniversalWidgetImageWithTextImageRatio("ONE_TO_ONE", 0);

    @c("4_3")
    public static final UniversalWidgetImageWithTextImageRatio FOUR_TO_THREE = new UniversalWidgetImageWithTextImageRatio("FOUR_TO_THREE", 1);

    @c("3_4")
    public static final UniversalWidgetImageWithTextImageRatio THREE_TO_FOUR = new UniversalWidgetImageWithTextImageRatio("THREE_TO_FOUR", 2);

    @c("fix")
    public static final UniversalWidgetImageWithTextImageRatio FIX = new UniversalWidgetImageWithTextImageRatio("FIX", 3);

    private static final /* synthetic */ UniversalWidgetImageWithTextImageRatio[] $values() {
        return new UniversalWidgetImageWithTextImageRatio[]{ONE_TO_ONE, FOUR_TO_THREE, THREE_TO_FOUR, FIX};
    }

    static {
        UniversalWidgetImageWithTextImageRatio[] universalWidgetImageWithTextImageRatioArr$values = $values();
        $VALUES = universalWidgetImageWithTextImageRatioArr$values;
        $ENTRIES = kotlin.enums.c.a(universalWidgetImageWithTextImageRatioArr$values);
    }

    private UniversalWidgetImageWithTextImageRatio(String str, int i12) {
    }

    @k
    public static a<UniversalWidgetImageWithTextImageRatio> getEntries() {
        return $ENTRIES;
    }

    public static UniversalWidgetImageWithTextImageRatio valueOf(String str) {
        return (UniversalWidgetImageWithTextImageRatio) Enum.valueOf(UniversalWidgetImageWithTextImageRatio.class, str);
    }

    public static UniversalWidgetImageWithTextImageRatio[] values() {
        return (UniversalWidgetImageWithTextImageRatio[]) $VALUES.clone();
    }
}
