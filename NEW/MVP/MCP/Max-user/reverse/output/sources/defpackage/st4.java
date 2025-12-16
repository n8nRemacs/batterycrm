package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class st4 {
    public static final st4 X;
    public static final st4 Y;
    public static final st4 Z;
    public static final lcj b;
    public static final st4 c;
    public static final st4 d;
    public static final st4 o;
    public static final /* synthetic */ st4[] s0;
    public static final /* synthetic */ zg5 t0;
    public final to7 a;

    static {
        st4 st4Var = new st4("LDPI", 0, new to7(Integer.MIN_VALUE, 120, 1));
        c = st4Var;
        st4 st4Var2 = new st4("MDPI", 1, new to7(120, 160, 1));
        d = st4Var2;
        st4 st4Var3 = new st4("HDPI", 2, new to7(160, 240, 1));
        o = st4Var3;
        st4 st4Var4 = new st4("XHDPI", 3, new to7(240, 320, 1));
        X = st4Var4;
        st4 st4Var5 = new st4("XXHDPI", 4, new to7(320, 480, 1));
        Y = st4Var5;
        st4 st4Var6 = new st4("XXXHDPI", 5, new to7(480, Integer.MAX_VALUE, 1));
        Z = st4Var6;
        st4[] st4VarArr = {st4Var, st4Var2, st4Var3, st4Var4, st4Var5, st4Var6};
        s0 = st4VarArr;
        t0 = new zg5(st4VarArr);
        b = new lcj(18);
    }

    public st4(String str, int i, to7 to7Var) {
        this.a = to7Var;
    }

    public static st4 valueOf(String str) {
        return (st4) Enum.valueOf(st4.class, str);
    }

    public static st4[] values() {
        return (st4[]) s0.clone();
    }
}
