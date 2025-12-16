package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class p02 {
    public static final /* synthetic */ p02[] X;
    public static final p02 a;
    public static final p02 b;
    public static final p02 c;
    public static final p02 d;
    public static final p02 o;

    static {
        p02 p02Var = new p02("UNKNOWN", 0);
        a = p02Var;
        p02 p02Var2 = new p02("INACTIVE", 1);
        b = p02Var2;
        p02 p02Var3 = new p02("METERING", 2);
        c = p02Var3;
        p02 p02Var4 = new p02("CONVERGED", 3);
        d = p02Var4;
        p02 p02Var5 = new p02("LOCKED", 4);
        o = p02Var5;
        X = new p02[]{p02Var, p02Var2, p02Var3, p02Var4, p02Var5};
    }

    public static p02 valueOf(String str) {
        return (p02) Enum.valueOf(p02.class, str);
    }

    public static p02[] values() {
        return (p02[]) X.clone();
    }
}
