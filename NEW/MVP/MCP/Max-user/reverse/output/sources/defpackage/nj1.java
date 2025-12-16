package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class nj1 {
    public static final nj1 a;
    public static final nj1 b;
    public static final nj1 c;
    public static final /* synthetic */ nj1[] d;

    static {
        nj1 nj1Var = new nj1("NONE", 0);
        a = nj1Var;
        nj1 nj1Var2 = new nj1("LOCAL", 1);
        b = nj1Var2;
        nj1 nj1Var3 = new nj1("APPLICATION", 2);
        c = nj1Var3;
        d = new nj1[]{nj1Var, nj1Var2, nj1Var3};
    }

    public static nj1 valueOf(String str) {
        return (nj1) Enum.valueOf(nj1.class, str);
    }

    public static nj1[] values() {
        return (nj1[]) d.clone();
    }
}
