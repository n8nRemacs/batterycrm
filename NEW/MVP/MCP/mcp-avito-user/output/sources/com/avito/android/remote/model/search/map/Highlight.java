package com.avito.android.remote.model.search.map;

import Y61.k;
import com.avito.android.remote.model.text.FontStyleKt;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Marker.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/remote/model/search/map/Highlight;", "", "(Ljava/lang/String;I)V", "Regular", "Violet", "Green", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class Highlight {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ Highlight[] $VALUES;

    @c(FontStyleKt.REGULAR)
    public static final Highlight Regular = new Highlight("Regular", 0);

    @c("violet")
    public static final Highlight Violet = new Highlight("Violet", 1);

    @c("green")
    public static final Highlight Green = new Highlight("Green", 2);

    private static final /* synthetic */ Highlight[] $values() {
        return new Highlight[]{Regular, Violet, Green};
    }

    static {
        Highlight[] highlightArr$values = $values();
        $VALUES = highlightArr$values;
        $ENTRIES = kotlin.enums.c.a(highlightArr$values);
    }

    private Highlight(String str, int i12) {
    }

    @k
    public static a<Highlight> getEntries() {
        return $ENTRIES;
    }

    public static Highlight valueOf(String str) {
        return (Highlight) Enum.valueOf(Highlight.class, str);
    }

    public static Highlight[] values() {
        return (Highlight[]) $VALUES.clone();
    }
}
