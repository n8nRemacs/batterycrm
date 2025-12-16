package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class pf7 {
    public static final pf7 a;
    public static final pf7 b;
    public static final /* synthetic */ pf7[] c;

    static {
        pf7 pf7Var = new pf7("SMALL", 0);
        a = pf7Var;
        pf7 pf7Var2 = new pf7("DEFAULT", 1);
        b = pf7Var2;
        c = new pf7[]{pf7Var, pf7Var2, new pf7("DYNAMIC", 2)};
    }

    public static pf7 valueOf(String str) {
        return (pf7) Enum.valueOf(pf7.class, str);
    }

    public static pf7[] values() {
        return (pf7[]) c.clone();
    }
}
