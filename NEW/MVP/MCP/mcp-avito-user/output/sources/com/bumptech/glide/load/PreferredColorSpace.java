package com.bumptech.glide.load;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class PreferredColorSpace {

    /* renamed from: b, reason: collision with root package name */
    public static final PreferredColorSpace f338842b;

    /* renamed from: c, reason: collision with root package name */
    public static final PreferredColorSpace f338843c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ PreferredColorSpace[] f338844d;

    static {
        PreferredColorSpace preferredColorSpace = new PreferredColorSpace("SRGB", 0);
        f338842b = preferredColorSpace;
        PreferredColorSpace preferredColorSpace2 = new PreferredColorSpace("DISPLAY_P3", 1);
        f338843c = preferredColorSpace2;
        f338844d = new PreferredColorSpace[]{preferredColorSpace, preferredColorSpace2};
    }

    public PreferredColorSpace() {
        throw null;
    }

    public static PreferredColorSpace valueOf(String str) {
        return (PreferredColorSpace) Enum.valueOf(PreferredColorSpace.class, str);
    }

    public static PreferredColorSpace[] values() {
        return (PreferredColorSpace[]) f338844d.clone();
    }
}
