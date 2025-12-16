package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class yg2 {
    public static final yg2 a;
    public static final yg2 b;
    public static final yg2 c;
    public static final yg2 d;
    public static final /* synthetic */ yg2[] o;

    static {
        yg2 yg2Var = new yg2("ACCEPT_ALL", 0);
        a = yg2Var;
        yg2 yg2Var2 = new yg2("FORWARDABLE", 1);
        b = yg2Var2;
        yg2 yg2Var3 = new yg2("ADDABLE", 2);
        c = yg2Var3;
        yg2 yg2Var4 = new yg2("INVITABLE", 3);
        d = yg2Var4;
        o = new yg2[]{yg2Var, yg2Var2, yg2Var3, yg2Var4};
    }

    public static yg2 valueOf(String str) {
        return (yg2) Enum.valueOf(yg2.class, str);
    }

    public static yg2[] values() {
        return (yg2[]) o.clone();
    }
}
