package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class sv3 {
    public static final sv3 a;
    public static final sv3 b;
    public static final sv3 c;
    public static final sv3 d;
    public static final /* synthetic */ sv3[] o;

    static {
        sv3 sv3Var = new sv3("CUSTOM", 0);
        a = sv3Var;
        sv3 sv3Var2 = new sv3("DEVICE", 1);
        b = sv3Var2;
        sv3 sv3Var3 = new sv3("ONEME", 2);
        c = sv3Var3;
        sv3 sv3Var4 = new sv3("UNKNOWN", 3);
        d = sv3Var4;
        o = new sv3[]{sv3Var, sv3Var2, sv3Var3, sv3Var4};
    }

    public static sv3 valueOf(String str) {
        return (sv3) Enum.valueOf(sv3.class, str);
    }

    public static sv3[] values() {
        return (sv3[]) o.clone();
    }
}
