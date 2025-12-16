package com.avito.android.remote.model;

import Y61.k;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Alignment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/remote/model/Alignment;", "", "(Ljava/lang/String;I)V", "LEFT", "CENTER", "RIGHT", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class Alignment {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ Alignment[] $VALUES;

    @c("left")
    public static final Alignment LEFT = new Alignment("LEFT", 0);

    @c("center")
    public static final Alignment CENTER = new Alignment("CENTER", 1);

    @c("right")
    public static final Alignment RIGHT = new Alignment("RIGHT", 2);

    private static final /* synthetic */ Alignment[] $values() {
        return new Alignment[]{LEFT, CENTER, RIGHT};
    }

    static {
        Alignment[] alignmentArr$values = $values();
        $VALUES = alignmentArr$values;
        $ENTRIES = kotlin.enums.c.a(alignmentArr$values);
    }

    private Alignment(String str, int i12) {
    }

    @k
    public static a<Alignment> getEntries() {
        return $ENTRIES;
    }

    public static Alignment valueOf(String str) {
        return (Alignment) Enum.valueOf(Alignment.class, str);
    }

    public static Alignment[] values() {
        return (Alignment[]) $VALUES.clone();
    }
}
