package com.bumptech.glide.load;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class EncodeStrategy {

    /* renamed from: b, reason: collision with root package name */
    public static final EncodeStrategy f338837b;

    /* renamed from: c, reason: collision with root package name */
    public static final EncodeStrategy f338838c;

    /* renamed from: d, reason: collision with root package name */
    public static final EncodeStrategy f338839d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ EncodeStrategy[] f338840e;

    static {
        EncodeStrategy encodeStrategy = new EncodeStrategy("SOURCE", 0);
        f338837b = encodeStrategy;
        EncodeStrategy encodeStrategy2 = new EncodeStrategy("TRANSFORMED", 1);
        f338838c = encodeStrategy2;
        EncodeStrategy encodeStrategy3 = new EncodeStrategy("NONE", 2);
        f338839d = encodeStrategy3;
        f338840e = new EncodeStrategy[]{encodeStrategy, encodeStrategy2, encodeStrategy3};
    }

    public EncodeStrategy() {
        throw null;
    }

    public static EncodeStrategy valueOf(String str) {
        return (EncodeStrategy) Enum.valueOf(EncodeStrategy.class, str);
    }

    public static EncodeStrategy[] values() {
        return (EncodeStrategy[]) f338840e.clone();
    }
}
