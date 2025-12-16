package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class c10 {
    public static final c10 X;
    public static final c10 Y;
    public static final c10 Z;
    public static final c10 a;
    public static final c10 b;
    public static final c10 c;
    public static final c10 d;
    public static final c10 o;
    public static final c10 s0;
    public static final c10 t0;
    public static final c10 u0;
    public static final /* synthetic */ c10[] v0;

    static {
        c10 c10Var = new c10("UNKNOWN", 0);
        a = c10Var;
        c10 c10Var2 = new c10("NEW", 1);
        b = c10Var2;
        c10 c10Var3 = new c10("ADD", 2);
        c = c10Var3;
        c10 c10Var4 = new c10("REMOVE", 3);
        d = c10Var4;
        c10 c10Var5 = new c10("LEAVE", 4);
        o = c10Var5;
        c10 c10Var6 = new c10("TITLE", 5);
        X = c10Var6;
        c10 c10Var7 = new c10("ICON", 6);
        Y = c10Var7;
        c10 c10Var8 = new c10("SYSTEM", 7);
        Z = c10Var8;
        c10 c10Var9 = new c10("JOIN_BY_LINK", 8);
        s0 = c10Var9;
        c10 c10Var10 = new c10("PIN", 9);
        t0 = c10Var10;
        c10 c10Var11 = new c10("BOT_STARTED", 10);
        u0 = c10Var11;
        v0 = new c10[]{c10Var, c10Var2, c10Var3, c10Var4, c10Var5, c10Var6, c10Var7, c10Var8, c10Var9, c10Var10, c10Var11};
    }

    public static c10 valueOf(String str) {
        return (c10) Enum.valueOf(c10.class, str);
    }

    public static c10[] values() {
        return (c10[]) v0.clone();
    }
}
