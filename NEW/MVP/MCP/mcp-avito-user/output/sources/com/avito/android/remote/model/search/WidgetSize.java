package com.avito.android.remote.model.search;

import Y61.k;
import com.adjust.sdk.Constants;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: InlineFilters.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/remote/model/search/WidgetSize;", "", "(Ljava/lang/String;I)V", "Large", "Medium", "Small", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class WidgetSize {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ WidgetSize[] $VALUES;

    @c("big")
    public static final WidgetSize Large = new WidgetSize("Large", 0);

    @c("medium")
    public static final WidgetSize Medium = new WidgetSize("Medium", 1);

    @c(Constants.SMALL)
    public static final WidgetSize Small = new WidgetSize("Small", 2);

    private static final /* synthetic */ WidgetSize[] $values() {
        return new WidgetSize[]{Large, Medium, Small};
    }

    static {
        WidgetSize[] widgetSizeArr$values = $values();
        $VALUES = widgetSizeArr$values;
        $ENTRIES = kotlin.enums.c.a(widgetSizeArr$values);
    }

    private WidgetSize(String str, int i12) {
    }

    @k
    public static a<WidgetSize> getEntries() {
        return $ENTRIES;
    }

    public static WidgetSize valueOf(String str) {
        return (WidgetSize) Enum.valueOf(WidgetSize.class, str);
    }

    public static WidgetSize[] values() {
        return (WidgetSize[]) $VALUES.clone();
    }
}
