package com.avito.android.beduin.common.component.text;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Alignment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/beduin/common/component/text/Alignment;", "", "(Ljava/lang/String;I)V", "LEFT", "CENTER", "RIGHT", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class Alignment {

    @com.google.gson.annotations.c("center")
    public static final Alignment CENTER;

    @com.google.gson.annotations.c("left")
    public static final Alignment LEFT;

    @com.google.gson.annotations.c("right")
    public static final Alignment RIGHT;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ Alignment[] f102772b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f102773c;

    static {
        Alignment alignment = new Alignment("LEFT", 0);
        LEFT = alignment;
        Alignment alignment2 = new Alignment("CENTER", 1);
        CENTER = alignment2;
        Alignment alignment3 = new Alignment("RIGHT", 2);
        RIGHT = alignment3;
        Alignment[] alignmentArr = {alignment, alignment2, alignment3};
        f102772b = alignmentArr;
        f102773c = kotlin.enums.c.a(alignmentArr);
    }

    private Alignment(String str, int i12) {
    }

    public static Alignment valueOf(String str) {
        return (Alignment) Enum.valueOf(Alignment.class, str);
    }

    public static Alignment[] values() {
        return (Alignment[]) f102772b.clone();
    }
}
