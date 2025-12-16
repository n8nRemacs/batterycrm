package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class gy2 {
    public static final gy2 X;
    public static final gy2 Y;
    public static final gy2 Z;
    public static final gy2 a;
    public static final gy2 b;
    public static final gy2 c;
    public static final gy2 d;
    public static final gy2 o;
    public static final gy2 s0;
    public static final /* synthetic */ gy2[] t0;

    static {
        gy2 gy2Var = new gy2("UNBLOCK", 0);
        a = gy2Var;
        gy2 gy2Var2 = new gy2("REMOVE_CHAT", 1);
        b = gy2Var2;
        gy2 gy2Var3 = new gy2("LEAVE_CHAT", 2);
        c = gy2Var3;
        gy2 gy2Var4 = new gy2("JOIN_CHAT", 3);
        d = gy2Var4;
        gy2 gy2Var5 = new gy2("START_BOT", 4);
        o = gy2Var5;
        gy2 gy2Var6 = new gy2("POST_RESTRICTED", 5);
        X = gy2Var6;
        gy2 gy2Var7 = new gy2("UNMUTE_CHAT", 6);
        Y = gy2Var7;
        gy2 gy2Var8 = new gy2("MUTE_CHAT", 7);
        Z = gy2Var8;
        gy2 gy2Var9 = new gy2("SUBSCRIBE", 8);
        s0 = gy2Var9;
        t0 = new gy2[]{gy2Var, gy2Var2, gy2Var3, gy2Var4, gy2Var5, gy2Var6, gy2Var7, gy2Var8, gy2Var9};
    }

    public static gy2 valueOf(String str) {
        return (gy2) Enum.valueOf(gy2.class, str);
    }

    public static gy2[] values() {
        return (gy2[]) t0.clone();
    }
}
