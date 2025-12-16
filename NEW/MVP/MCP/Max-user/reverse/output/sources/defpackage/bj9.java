package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class bj9 {
    public static final bj9 X;
    public static final bj9 Y;
    public static final bj9 Z;
    public static final bj9 a;
    public static final bj9 b;
    public static final bj9 c;
    public static final bj9 d;
    public static final bj9 o;
    public static final bj9 s0;
    public static final bj9 t0;
    public static final bj9 u0;
    public static final bj9 v0;
    public static final /* synthetic */ bj9[] w0;

    static {
        bj9 bj9Var = new bj9("USER_MENTION", 0);
        a = bj9Var;
        bj9 bj9Var2 = new bj9("GROUP_MENTION", 1);
        b = bj9Var2;
        bj9 bj9Var3 = new bj9("MONOSPACED", 2);
        c = bj9Var3;
        bj9 bj9Var4 = new bj9("STRONG", 3);
        d = bj9Var4;
        bj9 bj9Var5 = new bj9("EMPHASIZED", 4);
        o = bj9Var5;
        bj9 bj9Var6 = new bj9("LINK", 5);
        X = bj9Var6;
        bj9 bj9Var7 = new bj9("STRIKETHROUGH", 6);
        Y = bj9Var7;
        bj9 bj9Var8 = new bj9("CODE", 7);
        Z = bj9Var8;
        bj9 bj9Var9 = new bj9("UNDERLINE", 8);
        s0 = bj9Var9;
        bj9 bj9Var10 = new bj9("HEADING", 9);
        t0 = bj9Var10;
        bj9 bj9Var11 = new bj9("ANIMOJI", 10);
        u0 = bj9Var11;
        bj9 bj9Var12 = new bj9("QUOTE", 11);
        v0 = bj9Var12;
        w0 = new bj9[]{bj9Var, bj9Var2, bj9Var3, bj9Var4, bj9Var5, bj9Var6, bj9Var7, bj9Var8, bj9Var9, bj9Var10, bj9Var11, bj9Var12};
    }

    public static bj9 valueOf(String str) {
        return (bj9) Enum.valueOf(bj9.class, str);
    }

    public static bj9[] values() {
        return (bj9[]) w0.clone();
    }
}
