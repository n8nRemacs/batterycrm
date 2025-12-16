package com.google.common.collect;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@XY0.b
@InterfaceC37329f0
/* loaded from: classes6.dex */
public final class BoundType {

    /* renamed from: b, reason: collision with root package name */
    public static final BoundType f359276b;

    /* renamed from: c, reason: collision with root package name */
    public static final BoundType f359277c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ BoundType[] f359278d;

    static {
        BoundType boundType = new BoundType("OPEN", 0);
        f359276b = boundType;
        BoundType boundType2 = new BoundType("CLOSED", 1);
        f359277c = boundType2;
        f359278d = new BoundType[]{boundType, boundType2};
    }

    public BoundType() {
        throw null;
    }

    public static BoundType a(boolean z12) {
        return z12 ? f359277c : f359276b;
    }

    public static BoundType valueOf(String str) {
        return (BoundType) Enum.valueOf(BoundType.class, str);
    }

    public static BoundType[] values() {
        return (BoundType[]) f359278d.clone();
    }
}
