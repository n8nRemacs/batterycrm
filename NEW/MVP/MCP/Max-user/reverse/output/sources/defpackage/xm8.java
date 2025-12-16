package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class xm8 {
    public static final xm8 a;
    public static final xm8 b;
    public static final xm8 c;
    public static final /* synthetic */ xm8[] d;

    static {
        xm8 xm8Var = new xm8("LOCAL", 0);
        a = xm8Var;
        xm8 xm8Var2 = new xm8("GLOBAL", 1);
        b = xm8Var2;
        xm8 xm8Var3 = new xm8("MESSAGES", 2);
        c = xm8Var3;
        d = new xm8[]{xm8Var, xm8Var2, xm8Var3};
    }

    public static xm8 valueOf(String str) {
        return (xm8) Enum.valueOf(xm8.class, str);
    }

    public static xm8[] values() {
        return (xm8[]) d.clone();
    }
}
