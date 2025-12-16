package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class xv3 {
    public static final xv3 a;
    public static final xv3 b;
    public static final /* synthetic */ xv3[] c;

    static {
        xv3 xv3Var = new xv3("BLOCKED", 0);
        a = xv3Var;
        xv3 xv3Var2 = new xv3("REMOVED", 1);
        b = xv3Var2;
        c = new xv3[]{xv3Var, xv3Var2};
    }

    public static xv3 valueOf(String str) {
        return (xv3) Enum.valueOf(xv3.class, str);
    }

    public static xv3[] values() {
        return (xv3[]) c.clone();
    }
}
