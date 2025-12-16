package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class vv3 {
    public static final vv3 X;
    public static final /* synthetic */ vv3[] Y;
    public static final vv3 a;
    public static final vv3 b;
    public static final vv3 c;
    public static final vv3 d;
    public static final vv3 o;

    static {
        vv3 vv3Var = new vv3("OFFICIAL", 0);
        a = vv3Var;
        vv3 vv3Var2 = new vv3("BOT", 1);
        b = vv3Var2;
        vv3 vv3Var3 = new vv3("SERVICE_ACCOUNT", 2);
        c = vv3Var3;
        vv3 vv3Var4 = new vv3("HAS_WEBAPP", 3);
        d = vv3Var4;
        vv3 vv3Var5 = new vv3("RESTRICTED", 4);
        o = vv3Var5;
        vv3 vv3Var6 = new vv3("NO_FORWARD", 5);
        X = vv3Var6;
        Y = new vv3[]{vv3Var, vv3Var2, vv3Var3, vv3Var4, vv3Var5, vv3Var6};
    }

    public static vv3 valueOf(String str) {
        return (vv3) Enum.valueOf(vv3.class, str);
    }

    public static vv3[] values() {
        return (vv3[]) Y.clone();
    }
}
