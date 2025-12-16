package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class n02 {
    public static final n02 X;
    public static final /* synthetic */ n02[] Y;
    public static final n02 a;
    public static final n02 b;
    public static final n02 c;
    public static final n02 d;
    public static final n02 o;

    static {
        n02 n02Var = new n02("UNKNOWN", 0);
        a = n02Var;
        n02 n02Var2 = new n02("INACTIVE", 1);
        b = n02Var2;
        n02 n02Var3 = new n02("SEARCHING", 2);
        c = n02Var3;
        n02 n02Var4 = new n02("FLASH_REQUIRED", 3);
        d = n02Var4;
        n02 n02Var5 = new n02("CONVERGED", 4);
        o = n02Var5;
        n02 n02Var6 = new n02("LOCKED", 5);
        X = n02Var6;
        Y = new n02[]{n02Var, n02Var2, n02Var3, n02Var4, n02Var5, n02Var6};
    }

    public static n02 valueOf(String str) {
        return (n02) Enum.valueOf(n02.class, str);
    }

    public static n02[] values() {
        return (n02[]) Y.clone();
    }
}
