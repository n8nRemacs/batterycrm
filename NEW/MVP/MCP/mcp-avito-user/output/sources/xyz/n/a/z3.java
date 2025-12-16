package xyz.n.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class z3 {

    /* renamed from: b, reason: collision with root package name */
    public static final z3 f442811b;

    /* renamed from: c, reason: collision with root package name */
    public static final z3 f442812c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ z3[] f442813d;

    static {
        z3 z3Var = new z3("Single", 0);
        f442811b = z3Var;
        z3 z3Var2 = new z3("Multi", 1);
        f442812c = z3Var2;
        f442813d = new z3[]{z3Var, z3Var2};
    }

    public z3() {
        throw null;
    }

    public static z3 valueOf(String str) {
        return (z3) Enum.valueOf(z3.class, str);
    }

    public static z3[] values() {
        return (z3[]) f442813d.clone();
    }
}
