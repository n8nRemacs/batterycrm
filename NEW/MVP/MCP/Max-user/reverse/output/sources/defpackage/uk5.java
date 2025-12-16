package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class uk5 {
    public static final uk5 a;
    public static final uk5 b;
    public static final uk5 c;
    public static final uk5 d;
    public static final /* synthetic */ uk5[] o;

    static {
        uk5 uk5Var = new uk5("REPLACE", 0);
        a = uk5Var;
        uk5 uk5Var2 = new uk5("KEEP", 1);
        b = uk5Var2;
        uk5 uk5Var3 = new uk5("APPEND", 2);
        c = uk5Var3;
        uk5 uk5Var4 = new uk5("APPEND_OR_REPLACE", 3);
        d = uk5Var4;
        o = new uk5[]{uk5Var, uk5Var2, uk5Var3, uk5Var4};
    }

    public static uk5 valueOf(String str) {
        return (uk5) Enum.valueOf(uk5.class, str);
    }

    public static uk5[] values() {
        return (uk5[]) o.clone();
    }
}
