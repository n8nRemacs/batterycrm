package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class os3 implements Comparable {
    public static final os3 X;
    public static final /* synthetic */ os3[] Y;
    public static final /* synthetic */ zg5 Z;
    public static final os3 b;
    public static final os3 c;
    public static final os3 d;
    public static final os3 o;
    public final int a;

    static {
        os3 os3Var = new os3("TYPE_UNKNOWN", 0, 0);
        b = os3Var;
        os3 os3Var2 = new os3("TYPE_WIFI", 1, 2);
        c = os3Var2;
        os3 os3Var3 = new os3("TYPE_MOBILE_SLOW", 2, 3);
        d = os3Var3;
        os3 os3Var4 = new os3("TYPE_MOBILE_NORMAL", 3, 4);
        o = os3Var4;
        os3 os3Var5 = new os3("TYPE_MOBILE_FAST", 4, 5);
        X = os3Var5;
        os3[] os3VarArr = {os3Var, os3Var2, os3Var3, os3Var4, os3Var5};
        Y = os3VarArr;
        Z = new zg5(os3VarArr);
    }

    public os3(String str, int i, int i2) {
        this.a = i2;
    }

    public static os3 valueOf(String str) {
        return (os3) Enum.valueOf(os3.class, str);
    }

    public static os3[] values() {
        return (os3[]) Y.clone();
    }

    public final String a() {
        int i = ns3.$EnumSwitchMapping$0[ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "UNKNOWN" : "4G" : "3G" : "2G" : "WIFI";
    }
}
