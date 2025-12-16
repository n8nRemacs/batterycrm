package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class p10 {
    public static final /* synthetic */ p10[] X;
    public static final p10 a;
    public static final p10 b;
    public static final p10 c;
    public static final p10 d;
    public static final p10 o;

    static {
        p10 p10Var = new p10("NOT_LOADED", 0);
        a = p10Var;
        p10 p10Var2 = new p10("CANCELLED", 1);
        b = p10Var2;
        p10 p10Var3 = new p10("LOADED", 2);
        c = p10Var3;
        p10 p10Var4 = new p10("ERROR", 3);
        d = p10Var4;
        p10 p10Var5 = new p10("LOADING", 4);
        o = p10Var5;
        X = new p10[]{p10Var, p10Var2, p10Var3, p10Var4, p10Var5};
    }

    public static p10 valueOf(String str) {
        return (p10) Enum.valueOf(p10.class, str);
    }

    public static p10[] values() {
        return (p10[]) X.clone();
    }

    public final boolean a() {
        return this == b;
    }

    public final boolean c() {
        return this == d;
    }

    public final boolean d() {
        return this == c;
    }
}
