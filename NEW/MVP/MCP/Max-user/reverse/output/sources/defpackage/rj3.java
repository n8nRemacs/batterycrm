package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class rj3 {
    public static final rj3 X;
    public static final rj3 Y;
    public static final rj3 Z;
    public static final rj3 b;
    public static final rj3 c;
    public static final rj3 d;
    public static final rj3 o;
    public static final rj3 s0;
    public static final /* synthetic */ rj3[] t0;
    public static final /* synthetic */ zg5 u0;
    public final byte a;

    static {
        rj3 rj3Var = new rj3("CHAT", 0, (byte) 1);
        b = rj3Var;
        rj3 rj3Var2 = new rj3("CHANNEL", 1, (byte) 2);
        c = rj3Var2;
        rj3 rj3Var3 = new rj3("MSG_DIALOG", 2, (byte) 3);
        d = rj3Var3;
        rj3 rj3Var4 = new rj3("MSG_CHAT", 3, (byte) 4);
        o = rj3Var4;
        rj3 rj3Var5 = new rj3("MSG_CHANNEL", 4, (byte) 5);
        X = rj3Var5;
        rj3 rj3Var6 = new rj3("USER_PROFILE", 5, (byte) 6);
        Y = rj3Var6;
        rj3 rj3Var7 = new rj3("BOT_PROFILE", 6, (byte) 7);
        Z = rj3Var7;
        rj3 rj3Var8 = new rj3("UNKNOWN_CALL", 7, (byte) 8);
        s0 = rj3Var8;
        rj3[] rj3VarArr = {rj3Var, rj3Var2, rj3Var3, rj3Var4, rj3Var5, rj3Var6, rj3Var7, rj3Var8};
        t0 = rj3VarArr;
        u0 = new zg5(rj3VarArr);
    }

    public rj3(String str, int i, byte b2) {
        this.a = b2;
    }

    public static rj3 valueOf(String str) {
        return (rj3) Enum.valueOf(rj3.class, str);
    }

    public static rj3[] values() {
        return (rj3[]) t0.clone();
    }
}
