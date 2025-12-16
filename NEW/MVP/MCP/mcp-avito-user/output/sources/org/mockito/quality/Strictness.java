package org.mockito.quality;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class Strictness {

    /* renamed from: b, reason: collision with root package name */
    public static final Strictness f421788b;

    /* renamed from: c, reason: collision with root package name */
    public static final Strictness f421789c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ Strictness[] f421790d;

    static {
        Strictness strictness = new Strictness("LENIENT", 0);
        f421788b = strictness;
        Strictness strictness2 = new Strictness("WARN", 1);
        Strictness strictness3 = new Strictness("STRICT_STUBS", 2);
        f421789c = strictness3;
        f421790d = new Strictness[]{strictness, strictness2, strictness3};
    }

    public Strictness() {
        throw null;
    }

    public static Strictness valueOf(String str) {
        return (Strictness) Enum.valueOf(Strictness.class, str);
    }

    public static Strictness[] values() {
        return (Strictness[]) f421790d.clone();
    }
}
