package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class i84 {
    public static final i84 a;
    public static final i84 b;
    public static final i84 c;
    public static final i84 d;
    public static final /* synthetic */ i84[] o;

    static {
        i84 i84Var = new i84("DEFAULT", 0);
        a = i84Var;
        i84 i84Var2 = new i84("LAZY", 1);
        b = i84Var2;
        i84 i84Var3 = new i84("ATOMIC", 2);
        c = i84Var3;
        i84 i84Var4 = new i84("UNDISPATCHED", 3);
        d = i84Var4;
        o = new i84[]{i84Var, i84Var2, i84Var3, i84Var4};
    }

    public static i84 valueOf(String str) {
        return (i84) Enum.valueOf(i84.class, str);
    }

    public static i84[] values() {
        return (i84[]) o.clone();
    }
}
