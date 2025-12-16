package com.avito.android.beduin.common.alignment;

import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: HorizontalAlignment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/beduin/common/alignment/HorizontalAlignment;", "", "(Ljava/lang/String;I)V", "LEFT", "RIGHT", "CENTER", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class HorizontalAlignment {

    @c("center")
    public static final HorizontalAlignment CENTER;

    @c("left")
    public static final HorizontalAlignment LEFT;

    @c("right")
    public static final HorizontalAlignment RIGHT;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ HorizontalAlignment[] f100584b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ a f100585c;

    static {
        HorizontalAlignment horizontalAlignment = new HorizontalAlignment("LEFT", 0);
        LEFT = horizontalAlignment;
        HorizontalAlignment horizontalAlignment2 = new HorizontalAlignment("RIGHT", 1);
        RIGHT = horizontalAlignment2;
        HorizontalAlignment horizontalAlignment3 = new HorizontalAlignment("CENTER", 2);
        CENTER = horizontalAlignment3;
        HorizontalAlignment[] horizontalAlignmentArr = {horizontalAlignment, horizontalAlignment2, horizontalAlignment3};
        f100584b = horizontalAlignmentArr;
        f100585c = kotlin.enums.c.a(horizontalAlignmentArr);
    }

    private HorizontalAlignment(String str, int i12) {
    }

    public static HorizontalAlignment valueOf(String str) {
        return (HorizontalAlignment) Enum.valueOf(HorizontalAlignment.class, str);
    }

    public static HorizontalAlignment[] values() {
        return (HorizontalAlignment[]) f100584b.clone();
    }
}
