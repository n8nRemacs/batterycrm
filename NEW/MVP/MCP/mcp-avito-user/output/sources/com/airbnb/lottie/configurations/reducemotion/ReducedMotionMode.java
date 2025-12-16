package com.airbnb.lottie.configurations.reducemotion;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class ReducedMotionMode {

    /* renamed from: b, reason: collision with root package name */
    public static final ReducedMotionMode f59563b;

    /* renamed from: c, reason: collision with root package name */
    public static final ReducedMotionMode f59564c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ ReducedMotionMode[] f59565d;

    static {
        ReducedMotionMode reducedMotionMode = new ReducedMotionMode("STANDARD_MOTION", 0);
        f59563b = reducedMotionMode;
        ReducedMotionMode reducedMotionMode2 = new ReducedMotionMode("REDUCED_MOTION", 1);
        f59564c = reducedMotionMode2;
        f59565d = new ReducedMotionMode[]{reducedMotionMode, reducedMotionMode2};
    }

    public ReducedMotionMode() {
        throw null;
    }

    public static ReducedMotionMode valueOf(String str) {
        return (ReducedMotionMode) Enum.valueOf(ReducedMotionMode.class, str);
    }

    public static ReducedMotionMode[] values() {
        return (ReducedMotionMode[]) f59565d.clone();
    }
}
