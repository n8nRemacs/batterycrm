package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class sc2 {
    public static final /* synthetic */ sc2[] X;
    public static final sc2 a;
    public static final sc2 b;
    public static final sc2 c;
    public static final sc2 d;
    public static final sc2 o;

    static {
        sc2 sc2Var = new sc2("NONE", 0);
        a = sc2Var;
        sc2 sc2Var2 = new sc2("IN_PROGRESS", 1);
        b = sc2Var2;
        sc2 sc2Var3 = new sc2("SENT", 2);
        c = sc2Var3;
        sc2 sc2Var4 = new sc2("READ", 3);
        d = sc2Var4;
        sc2 sc2Var5 = new sc2("ERROR", 4);
        o = sc2Var5;
        X = new sc2[]{sc2Var, sc2Var2, sc2Var3, sc2Var4, sc2Var5};
    }

    public static sc2 valueOf(String str) {
        return (sc2) Enum.valueOf(sc2.class, str);
    }

    public static sc2[] values() {
        return (sc2[]) X.clone();
    }
}
