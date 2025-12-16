package com.airbnb.lottie.model.content;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class LBlendMode {

    /* renamed from: b, reason: collision with root package name */
    public static final LBlendMode f59659b;

    /* renamed from: c, reason: collision with root package name */
    public static final LBlendMode f59660c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ LBlendMode[] f59661d;

    static {
        LBlendMode lBlendMode = new LBlendMode("NORMAL", 0);
        f59659b = lBlendMode;
        LBlendMode lBlendMode2 = new LBlendMode("MULTIPLY", 1);
        f59660c = lBlendMode2;
        f59661d = new LBlendMode[]{lBlendMode, lBlendMode2, new LBlendMode("SCREEN", 2), new LBlendMode("OVERLAY", 3), new LBlendMode("DARKEN", 4), new LBlendMode("LIGHTEN", 5), new LBlendMode("COLOR_DODGE", 6), new LBlendMode("COLOR_BURN", 7), new LBlendMode("HARD_LIGHT", 8), new LBlendMode("SOFT_LIGHT", 9), new LBlendMode("DIFFERENCE", 10), new LBlendMode("EXCLUSION", 11), new LBlendMode("HUE", 12), new LBlendMode("SATURATION", 13), new LBlendMode("COLOR", 14), new LBlendMode("LUMINOSITY", 15), new LBlendMode("ADD", 16), new LBlendMode("HARD_MIX", 17)};
    }

    public LBlendMode() {
        throw null;
    }

    public static LBlendMode valueOf(String str) {
        return (LBlendMode) Enum.valueOf(LBlendMode.class, str);
    }

    public static LBlendMode[] values() {
        return (LBlendMode[]) f59661d.clone();
    }
}
