package com.avito.android.remote.model.search;

import Y61.k;
import com.avito.android.remote.model.category_parameters.HiddenParameter;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: InlineFilters.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/remote/model/search/Layout;", "", "(Ljava/lang/String;I)V", "TextOnly", "ImageOnly", "ImageText", "Hidden", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class Layout {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ Layout[] $VALUES;

    @c("textOnly")
    public static final Layout TextOnly = new Layout("TextOnly", 0);

    @c("imageOnly")
    public static final Layout ImageOnly = new Layout("ImageOnly", 1);

    @c("imageText")
    public static final Layout ImageText = new Layout("ImageText", 2);

    @c(HiddenParameter.TYPE)
    public static final Layout Hidden = new Layout("Hidden", 3);

    private static final /* synthetic */ Layout[] $values() {
        return new Layout[]{TextOnly, ImageOnly, ImageText, Hidden};
    }

    static {
        Layout[] layoutArr$values = $values();
        $VALUES = layoutArr$values;
        $ENTRIES = kotlin.enums.c.a(layoutArr$values);
    }

    private Layout(String str, int i12) {
    }

    @k
    public static a<Layout> getEntries() {
        return $ENTRIES;
    }

    public static Layout valueOf(String str) {
        return (Layout) Enum.valueOf(Layout.class, str);
    }

    public static Layout[] values() {
        return (Layout[]) $VALUES.clone();
    }
}
