package com.airbnb.lottie;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class LottieFeatureFlag {

    /* renamed from: b, reason: collision with root package name */
    public static final LottieFeatureFlag f59146b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ LottieFeatureFlag[] f59147c;

    static {
        LottieFeatureFlag lottieFeatureFlag = new LottieFeatureFlag();
        f59146b = lottieFeatureFlag;
        f59147c = new LottieFeatureFlag[]{lottieFeatureFlag};
    }

    public static LottieFeatureFlag valueOf(String str) {
        return (LottieFeatureFlag) Enum.valueOf(LottieFeatureFlag.class, str);
    }

    public static LottieFeatureFlag[] values() {
        return (LottieFeatureFlag[]) f59147c.clone();
    }
}
