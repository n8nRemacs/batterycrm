package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class ss1 {
    public static final ss1 a;
    public static final ss1 b;
    public static final ss1 c;
    public static final ss1 d;
    public static final /* synthetic */ ss1[] o;

    static {
        ss1 ss1Var = new ss1("ACTIVE", 0);
        a = ss1Var;
        ss1 ss1Var2 = new ss1("CALLING", 1);
        b = ss1Var2;
        ss1 ss1Var3 = new ss1("NO_CONNECTION", 2);
        c = ss1Var3;
        ss1 ss1Var4 = new ss1("NONE", 3);
        d = ss1Var4;
        o = new ss1[]{ss1Var, ss1Var2, ss1Var3, ss1Var4};
    }

    public static ss1 valueOf(String str) {
        return (ss1) Enum.valueOf(ss1.class, str);
    }

    public static ss1[] values() {
        return (ss1[]) o.clone();
    }
}
