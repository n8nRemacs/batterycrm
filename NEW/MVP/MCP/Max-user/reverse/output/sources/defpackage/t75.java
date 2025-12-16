package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class t75 {
    public static final t75 X;
    public static final /* synthetic */ t75[] Y;
    public static final t75 a;
    public static final t75 b;
    public static final t75 c;
    public static final t75 d;
    public static final t75 o;

    static {
        t75 t75Var = new t75("MEDIUM", 0);
        a = t75Var;
        t75 t75Var2 = new t75("LARGE", 1);
        b = t75Var2;
        t75 t75Var3 = new t75("XLARGE", 2);
        c = t75Var3;
        t75 t75Var4 = new t75("XXLARGE", 3);
        d = t75Var4;
        t75 t75Var5 = new t75("XXXLARGE", 4);
        o = t75Var5;
        t75 t75Var6 = new t75("XXXXLARGE", 5);
        X = t75Var6;
        Y = new t75[]{t75Var, t75Var2, t75Var3, t75Var4, t75Var5, t75Var6};
    }

    public static t75 valueOf(String str) {
        return (t75) Enum.valueOf(t75.class, str);
    }

    public static t75[] values() {
        return (t75[]) Y.clone();
    }
}
