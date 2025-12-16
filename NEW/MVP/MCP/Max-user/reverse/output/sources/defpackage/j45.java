package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class j45 {
    public static final j45 A0;
    public static final j45 B0;
    public static final j45 C0;
    public static final /* synthetic */ j45[] D0;
    public static final j45 X;
    public static final j45 Y;
    public static final j45 Z;
    public static final j45 a;
    public static final j45 b;
    public static final j45 c;
    public static final j45 d;
    public static final j45 o;
    public static final j45 s0;
    public static final j45 t0;
    public static final j45 u0;
    public static final j45 v0;
    public static final j45 w0;
    public static final j45 x0;
    public static final j45 y0;
    public static final j45 z0;

    static {
        j45 j45Var = new j45("ON_SET_HIERARCHY", 0);
        a = j45Var;
        j45 j45Var2 = new j45("ON_CLEAR_HIERARCHY", 1);
        b = j45Var2;
        j45 j45Var3 = new j45("ON_SET_CONTROLLER", 2);
        c = j45Var3;
        j45 j45Var4 = new j45("ON_CLEAR_OLD_CONTROLLER", 3);
        d = j45Var4;
        j45 j45Var5 = new j45("ON_CLEAR_CONTROLLER", 4);
        o = j45Var5;
        j45 j45Var6 = new j45("ON_INIT_CONTROLLER", 5);
        X = j45Var6;
        j45 j45Var7 = new j45("ON_ATTACH_CONTROLLER", 6);
        Y = j45Var7;
        j45 j45Var8 = new j45("ON_DETACH_CONTROLLER", 7);
        Z = j45Var8;
        j45 j45Var9 = new j45("ON_RELEASE_CONTROLLER", 8);
        s0 = j45Var9;
        j45 j45Var10 = new j45("ON_DATASOURCE_SUBMIT", 9);
        t0 = j45Var10;
        j45 j45Var11 = new j45("ON_DATASOURCE_RESULT", 10);
        u0 = j45Var11;
        j45 j45Var12 = new j45("ON_DATASOURCE_RESULT_INT", 11);
        v0 = j45Var12;
        j45 j45Var13 = new j45("ON_DATASOURCE_FAILURE", 12);
        w0 = j45Var13;
        j45 j45Var14 = new j45("ON_DATASOURCE_FAILURE_INT", 13);
        x0 = j45Var14;
        j45 j45Var15 = new j45("ON_HOLDER_ATTACH", 14);
        y0 = j45Var15;
        j45 j45Var16 = new j45("ON_HOLDER_DETACH", 15);
        z0 = j45Var16;
        j45 j45Var17 = new j45("ON_DRAWABLE_SHOW", 16);
        A0 = j45Var17;
        j45 j45Var18 = new j45("ON_DRAWABLE_HIDE", 17);
        B0 = j45Var18;
        j45 j45Var19 = new j45("ON_ACTIVITY_START", 18);
        j45 j45Var20 = new j45("ON_ACTIVITY_STOP", 19);
        j45 j45Var21 = new j45("ON_RUN_CLEAR_CONTROLLER", 20);
        j45 j45Var22 = new j45("ON_SCHEDULE_CLEAR_CONTROLLER", 21);
        j45 j45Var23 = new j45("ON_SAME_CONTROLLER_SKIPPED", 22);
        j45 j45Var24 = new j45("ON_SUBMIT_CACHE_HIT", 23);
        C0 = j45Var24;
        D0 = new j45[]{j45Var, j45Var2, j45Var3, j45Var4, j45Var5, j45Var6, j45Var7, j45Var8, j45Var9, j45Var10, j45Var11, j45Var12, j45Var13, j45Var14, j45Var15, j45Var16, j45Var17, j45Var18, j45Var19, j45Var20, j45Var21, j45Var22, j45Var23, j45Var24};
    }

    public static j45 valueOf(String str) {
        return (j45) Enum.valueOf(j45.class, str);
    }

    public static j45[] values() {
        return (j45[]) D0.clone();
    }
}
