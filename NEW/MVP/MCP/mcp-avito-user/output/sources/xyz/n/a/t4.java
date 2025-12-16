package xyz.n.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class t4 {

    /* renamed from: b, reason: collision with root package name */
    public static final t4 f442796b;

    /* renamed from: c, reason: collision with root package name */
    public static final t4 f442797c;

    /* renamed from: d, reason: collision with root package name */
    public static final t4 f442798d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ t4[] f442799e;

    static {
        t4 t4Var = new t4("Center", 0);
        f442796b = t4Var;
        t4 t4Var2 = new t4("Left", 1);
        f442797c = t4Var2;
        t4 t4Var3 = new t4("Right", 2);
        f442798d = t4Var3;
        f442799e = new t4[]{t4Var, t4Var2, t4Var3};
    }

    public t4() {
        throw null;
    }

    public static t4 valueOf(String str) {
        return (t4) Enum.valueOf(t4.class, str);
    }

    public static t4[] values() {
        return (t4[]) f442799e.clone();
    }
}
