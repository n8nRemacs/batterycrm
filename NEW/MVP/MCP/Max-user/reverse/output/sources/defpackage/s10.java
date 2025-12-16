package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class s10 {
    public static final s10 X;
    public static final s10 Y;
    public static final s10 Z;
    public static final s10 a;
    public static final s10 b;
    public static final s10 c;
    public static final s10 d;
    public static final s10 o;
    public static final s10 s0;
    public static final s10 t0;
    public static final s10 u0;
    public static final s10 v0;
    public static final s10 w0;
    public static final s10 x0;
    public static final /* synthetic */ s10[] y0;

    static {
        s10 s10Var = new s10("UNKNOWN", 0);
        a = s10Var;
        s10 s10Var2 = new s10("CONTROL", 1);
        b = s10Var2;
        s10 s10Var3 = new s10("PHOTO", 2);
        c = s10Var3;
        s10 s10Var4 = new s10("VIDEO", 3);
        d = s10Var4;
        s10 s10Var5 = new s10("AUDIO", 4);
        o = s10Var5;
        s10 s10Var6 = new s10("STICKER", 5);
        X = s10Var6;
        s10 s10Var7 = new s10("SHARE", 6);
        Y = s10Var7;
        s10 s10Var8 = new s10("CALL", 7);
        Z = s10Var8;
        s10 s10Var9 = new s10("APP", 8);
        s0 = s10Var9;
        s10 s10Var10 = new s10("FILE", 9);
        t0 = s10Var10;
        s10 s10Var11 = new s10("CONTACT", 10);
        u0 = s10Var11;
        s10 s10Var12 = new s10("PRESENT", 11);
        v0 = s10Var12;
        s10 s10Var13 = new s10("LOCATION", 12);
        w0 = s10Var13;
        s10 s10Var14 = new s10("WIDGET", 13);
        x0 = s10Var14;
        y0 = new s10[]{s10Var, s10Var2, s10Var3, s10Var4, s10Var5, s10Var6, s10Var7, s10Var8, s10Var9, s10Var10, s10Var11, s10Var12, s10Var13, s10Var14};
    }

    public static s10 valueOf(String str) {
        return (s10) Enum.valueOf(s10.class, str);
    }

    public static s10[] values() {
        return (s10[]) y0.clone();
    }
}
