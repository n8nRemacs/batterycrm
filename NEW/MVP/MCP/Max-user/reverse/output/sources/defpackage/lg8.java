package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class lg8 {
    public static final lg8 X;
    public static final lg8 Y;
    public static final lg8 Z;
    public static final lg8 c;
    public static final lg8 d;
    public static final lg8 o;
    public static final /* synthetic */ lg8[] s0;
    public static final /* synthetic */ zg5 t0;
    public final int a;
    public final char b;

    static {
        lg8 lg8Var = new lg8('V', 0, 2, "VERBOSE");
        c = lg8Var;
        lg8 lg8Var2 = new lg8('D', 1, 3, "DEBUG");
        d = lg8Var2;
        lg8 lg8Var3 = new lg8('I', 2, 4, "INFO");
        o = lg8Var3;
        lg8 lg8Var4 = new lg8('W', 3, 5, "WARN");
        X = lg8Var4;
        lg8 lg8Var5 = new lg8('E', 4, 6, "ERROR");
        Y = lg8Var5;
        lg8 lg8Var6 = new lg8('A', 5, 7, "ASSERT");
        Z = lg8Var6;
        lg8[] lg8VarArr = {lg8Var, lg8Var2, lg8Var3, lg8Var4, lg8Var5, lg8Var6};
        s0 = lg8VarArr;
        t0 = new zg5(lg8VarArr);
    }

    public lg8(char c2, int i, int i2, String str) {
        this.a = i2;
        this.b = c2;
    }

    public static lg8 valueOf(String str) {
        return (lg8) Enum.valueOf(lg8.class, str);
    }

    public static lg8[] values() {
        return (lg8[]) s0.clone();
    }
}
