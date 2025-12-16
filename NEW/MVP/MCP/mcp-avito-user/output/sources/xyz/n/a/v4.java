package xyz.n.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class v4 {

    /* renamed from: b, reason: collision with root package name */
    public static final v4 f442804b;

    /* renamed from: c, reason: collision with root package name */
    public static final v4 f442805c;

    /* renamed from: d, reason: collision with root package name */
    public static final v4 f442806d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ v4[] f442807e;

    static {
        v4 v4Var = new v4("Small", 0);
        f442804b = v4Var;
        v4 v4Var2 = new v4("Normal", 1);
        f442805c = v4Var2;
        v4 v4Var3 = new v4("Large", 2);
        f442806d = v4Var3;
        f442807e = new v4[]{v4Var, v4Var2, v4Var3};
    }

    public v4() {
        throw null;
    }

    public static v4 valueOf(String str) {
        return (v4) Enum.valueOf(v4.class, str);
    }

    public static v4[] values() {
        return (v4[]) f442807e.clone();
    }
}
