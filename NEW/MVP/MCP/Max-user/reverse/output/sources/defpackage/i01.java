package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class i01 {
    public static final i01 X;
    public static final /* synthetic */ i01[] Y;
    public static final i01 a;
    public static final i01 b;
    public static final i01 c;
    public static final i01 d;
    public static final i01 o;

    static {
        i01 i01Var = new i01("REQUIRE_AUTH_TO_JOIN", 0);
        a = i01Var;
        i01 i01Var2 = new i01("WAITING_HALL", 1);
        b = i01Var2;
        i01 i01Var3 = new i01("RECURRING", 2);
        c = i01Var3;
        i01 i01Var4 = new i01("FEEDBACK", 3);
        d = i01Var4;
        i01 i01Var5 = new i01("AUDIENCE_MODE", 4);
        o = i01Var5;
        i01 i01Var6 = new i01("ASR", 5);
        X = i01Var6;
        Y = new i01[]{i01Var, i01Var2, i01Var3, i01Var4, i01Var5, i01Var6};
    }

    public static i01 valueOf(String str) {
        return (i01) Enum.valueOf(i01.class, str);
    }

    public static i01[] values() {
        return (i01[]) Y.clone();
    }
}
