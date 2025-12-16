package kotlin.reflect.jvm.internal.impl.types;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Variance.kt */
/* loaded from: classes8.dex */
public final class Variance {

    /* renamed from: d, reason: collision with root package name */
    public static final Variance f410069d;

    /* renamed from: e, reason: collision with root package name */
    public static final Variance f410070e;

    /* renamed from: f, reason: collision with root package name */
    public static final Variance f410071f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ Variance[] f410072g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f410073h;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f410074b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f410075c;

    static {
        Variance variance = new Variance(0, "INVARIANT", "", true);
        f410069d = variance;
        Variance variance2 = new Variance(1, "IN_VARIANCE", "in", false);
        f410070e = variance2;
        Variance variance3 = new Variance(2, "OUT_VARIANCE", "out", true);
        f410071f = variance3;
        Variance[] varianceArr = {variance, variance2, variance3};
        f410072g = varianceArr;
        f410073h = kotlin.enums.c.a(varianceArr);
    }

    public Variance(int i12, String str, String str2, boolean z12) {
        this.f410074b = str2;
        this.f410075c = z12;
    }

    public static Variance valueOf(String str) {
        return (Variance) Enum.valueOf(Variance.class, str);
    }

    public static Variance[] values() {
        return (Variance[]) f410072g.clone();
    }

    @Override // java.lang.Enum
    @Y61.k
    public final String toString() {
        return this.f410074b;
    }
}
