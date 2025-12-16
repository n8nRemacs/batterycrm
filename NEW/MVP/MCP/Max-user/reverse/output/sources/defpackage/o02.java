package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class o02 {
    public static final o02 X;
    public static final o02 Y;
    public static final /* synthetic */ o02[] Z;
    public static final o02 a;
    public static final o02 b;
    public static final o02 c;
    public static final o02 d;
    public static final o02 o;

    static {
        o02 o02Var = new o02("UNKNOWN", 0);
        a = o02Var;
        o02 o02Var2 = new o02("INACTIVE", 1);
        b = o02Var2;
        o02 o02Var3 = new o02("SCANNING", 2);
        c = o02Var3;
        o02 o02Var4 = new o02("PASSIVE_FOCUSED", 3);
        d = o02Var4;
        o02 o02Var5 = new o02("PASSIVE_NOT_FOCUSED", 4);
        o = o02Var5;
        o02 o02Var6 = new o02("LOCKED_FOCUSED", 5);
        X = o02Var6;
        o02 o02Var7 = new o02("LOCKED_NOT_FOCUSED", 6);
        Y = o02Var7;
        Z = new o02[]{o02Var, o02Var2, o02Var3, o02Var4, o02Var5, o02Var6, o02Var7};
    }

    public static o02 valueOf(String str) {
        return (o02) Enum.valueOf(o02.class, str);
    }

    public static o02[] values() {
        return (o02[]) Z.clone();
    }
}
