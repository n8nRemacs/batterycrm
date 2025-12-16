package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class pf2 {
    public static final pf2 a;
    public static final pf2 b;
    public static final pf2 c;
    public static final pf2 d;
    public static final /* synthetic */ pf2[] o;

    static {
        pf2 pf2Var = new pf2("DIALOG", 0);
        a = pf2Var;
        pf2 pf2Var2 = new pf2("CHAT", 1);
        b = pf2Var2;
        pf2 pf2Var3 = new pf2("CHANNEL", 2);
        c = pf2Var3;
        pf2 pf2Var4 = new pf2("GROUP_CHAT", 3);
        d = pf2Var4;
        o = new pf2[]{pf2Var, pf2Var2, pf2Var3, pf2Var4};
    }

    public static pf2 valueOf(String str) {
        return (pf2) Enum.valueOf(pf2.class, str);
    }

    public static pf2[] values() {
        return (pf2[]) o.clone();
    }
}
