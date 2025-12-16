package com.google.android.renderscript;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Toolkit.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/google/android/renderscript/BlendingMode;", "", "_design-modules_renderscript-toolkit"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BlendingMode {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ BlendingMode[] f358943b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ a f358944c;

    static {
        BlendingMode[] blendingModeArr = {new BlendingMode("CLEAR", 0), new BlendingMode("SRC", 1), new BlendingMode("DST", 2), new BlendingMode("SRC_OVER", 3), new BlendingMode("DST_OVER", 4), new BlendingMode("SRC_IN", 5), new BlendingMode("DST_IN", 6), new BlendingMode("SRC_OUT", 7), new BlendingMode("DST_OUT", 8), new BlendingMode("SRC_ATOP", 9), new BlendingMode("DST_ATOP", 10), new BlendingMode("XOR", 11), new BlendingMode("MULTIPLY", 12), new BlendingMode("ADD", 13), new BlendingMode("SUBTRACT", 14)};
        f358943b = blendingModeArr;
        f358944c = c.a(blendingModeArr);
    }

    public BlendingMode() {
        throw null;
    }

    public static BlendingMode valueOf(String str) {
        return (BlendingMode) Enum.valueOf(BlendingMode.class, str);
    }

    public static BlendingMode[] values() {
        return (BlendingMode[]) f358943b.clone();
    }
}
