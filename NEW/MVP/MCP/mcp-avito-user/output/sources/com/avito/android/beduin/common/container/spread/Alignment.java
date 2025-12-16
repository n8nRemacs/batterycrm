package com.avito.android.beduin.common.container.spread;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BeduinSpreadContainerModel.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/beduin/common/container/spread/Alignment;", "", "(Ljava/lang/String;I)V", "LEFT", "RIGHT", "CENTER", "SPREAD", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class Alignment {

    @com.google.gson.annotations.c("center")
    public static final Alignment CENTER;

    @com.google.gson.annotations.c("left")
    public static final Alignment LEFT;

    @com.google.gson.annotations.c("right")
    public static final Alignment RIGHT;

    @com.google.gson.annotations.c("spread")
    public static final Alignment SPREAD;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ Alignment[] f103176b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f103177c;

    static {
        Alignment alignment = new Alignment("LEFT", 0);
        LEFT = alignment;
        Alignment alignment2 = new Alignment("RIGHT", 1);
        RIGHT = alignment2;
        Alignment alignment3 = new Alignment("CENTER", 2);
        CENTER = alignment3;
        Alignment alignment4 = new Alignment("SPREAD", 3);
        SPREAD = alignment4;
        Alignment[] alignmentArr = {alignment, alignment2, alignment3, alignment4};
        f103176b = alignmentArr;
        f103177c = kotlin.enums.c.a(alignmentArr);
    }

    private Alignment(String str, int i12) {
    }

    public static Alignment valueOf(String str) {
        return (Alignment) Enum.valueOf(Alignment.class, str);
    }

    public static Alignment[] values() {
        return (Alignment[]) f103176b.clone();
    }
}
