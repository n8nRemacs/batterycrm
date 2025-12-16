package com.bumptech.glide.load;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class DecodeFormat {

    /* renamed from: b, reason: collision with root package name */
    public static final DecodeFormat f338833b;

    /* renamed from: c, reason: collision with root package name */
    public static final DecodeFormat f338834c;

    /* renamed from: d, reason: collision with root package name */
    public static final DecodeFormat f338835d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ DecodeFormat[] f338836e;

    static {
        DecodeFormat decodeFormat = new DecodeFormat("PREFER_ARGB_8888", 0);
        f338833b = decodeFormat;
        DecodeFormat decodeFormat2 = new DecodeFormat("PREFER_RGB_565", 1);
        f338834c = decodeFormat2;
        f338836e = new DecodeFormat[]{decodeFormat, decodeFormat2};
        f338835d = decodeFormat;
    }

    public DecodeFormat() {
        throw null;
    }

    public static DecodeFormat valueOf(String str) {
        return (DecodeFormat) Enum.valueOf(DecodeFormat.class, str);
    }

    public static DecodeFormat[] values() {
        return (DecodeFormat[]) f338836e.clone();
    }
}
