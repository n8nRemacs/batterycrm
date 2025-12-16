package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class yz3 {
    public static final yz3 a;
    public static final yz3 b;
    public static final yz3 c;
    public static final /* synthetic */ yz3[] d;

    static {
        yz3 yz3Var = new yz3("CUSTOM", 0);
        a = yz3Var;
        yz3 yz3Var2 = new yz3("DEVICE", 1);
        yz3 yz3Var3 = new yz3("ONEME", 2);
        b = yz3Var3;
        yz3 yz3Var4 = new yz3("UNKNOWN", 3);
        c = yz3Var4;
        d = new yz3[]{yz3Var, yz3Var2, yz3Var3, yz3Var4};
    }

    public static yz3 valueOf(String str) {
        return (yz3) Enum.valueOf(yz3.class, str);
    }

    public static yz3[] values() {
        return (yz3[]) d.clone();
    }
}
