package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class ej9 {
    public static final ej9 X;
    public static final ej9 Y;
    public static final ej9 Z;
    public static final ej9 a;
    public static final ej9 b;
    public static final ej9 c;
    public static final ej9 d;
    public static final ej9 o;
    public static final ej9 s0;
    public static final ej9 t0;
    public static final ej9 u0;
    public static final ej9 v0;
    public static final ej9 w0;
    public static final /* synthetic */ ej9[] x0;

    static {
        ej9 ej9Var = new ej9("UNKNOWN", 0);
        a = ej9Var;
        ej9 ej9Var2 = new ej9("USER_MENTION", 1);
        b = ej9Var2;
        ej9 ej9Var3 = new ej9("GROUP_MENTION", 2);
        c = ej9Var3;
        ej9 ej9Var4 = new ej9("MONOSPACED", 3);
        d = ej9Var4;
        ej9 ej9Var5 = new ej9("STRONG", 4);
        o = ej9Var5;
        ej9 ej9Var6 = new ej9("EMPHASIZED", 5);
        X = ej9Var6;
        ej9 ej9Var7 = new ej9("LINK", 6);
        Y = ej9Var7;
        ej9 ej9Var8 = new ej9("STRIKETHROUGH", 7);
        Z = ej9Var8;
        ej9 ej9Var9 = new ej9("UNDERLINE", 8);
        s0 = ej9Var9;
        ej9 ej9Var10 = new ej9("HEADING", 9);
        t0 = ej9Var10;
        ej9 ej9Var11 = new ej9("CODE", 10);
        u0 = ej9Var11;
        ej9 ej9Var12 = new ej9("ANIMOJI", 11);
        v0 = ej9Var12;
        ej9 ej9Var13 = new ej9("QUOTE", 12);
        w0 = ej9Var13;
        x0 = new ej9[]{ej9Var, ej9Var2, ej9Var3, ej9Var4, ej9Var5, ej9Var6, ej9Var7, ej9Var8, ej9Var9, ej9Var10, ej9Var11, ej9Var12, ej9Var13};
    }

    public static ej9 valueOf(String str) {
        return (ej9) Enum.valueOf(ej9.class, str);
    }

    public static ej9[] values() {
        return (ej9[]) x0.clone();
    }
}
