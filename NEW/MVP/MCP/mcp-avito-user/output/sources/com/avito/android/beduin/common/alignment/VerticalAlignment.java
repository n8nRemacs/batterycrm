package com.avito.android.beduin.common.alignment;

import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VerticalAlignment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/beduin/common/alignment/VerticalAlignment;", "", "(Ljava/lang/String;I)V", "TOP", "CENTER", "BOTTOM", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class VerticalAlignment {

    @c("bottom")
    public static final VerticalAlignment BOTTOM;

    @c("center")
    public static final VerticalAlignment CENTER;

    @c("top")
    public static final VerticalAlignment TOP;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ VerticalAlignment[] f100586b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ a f100587c;

    static {
        VerticalAlignment verticalAlignment = new VerticalAlignment("TOP", 0);
        TOP = verticalAlignment;
        VerticalAlignment verticalAlignment2 = new VerticalAlignment("CENTER", 1);
        CENTER = verticalAlignment2;
        VerticalAlignment verticalAlignment3 = new VerticalAlignment("BOTTOM", 2);
        BOTTOM = verticalAlignment3;
        VerticalAlignment[] verticalAlignmentArr = {verticalAlignment, verticalAlignment2, verticalAlignment3};
        f100586b = verticalAlignmentArr;
        f100587c = kotlin.enums.c.a(verticalAlignmentArr);
    }

    private VerticalAlignment(String str, int i12) {
    }

    public static VerticalAlignment valueOf(String str) {
        return (VerticalAlignment) Enum.valueOf(VerticalAlignment.class, str);
    }

    public static VerticalAlignment[] values() {
        return (VerticalAlignment[]) f100586b.clone();
    }
}
