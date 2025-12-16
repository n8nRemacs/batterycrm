package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class mx5 {
    public static final mx5 a;
    public static final mx5 b;
    public static final mx5 c;
    public static final mx5 d;
    public static final /* synthetic */ mx5[] o;

    static {
        mx5 mx5Var = new mx5("PresentArrow", 0);
        a = mx5Var;
        mx5 mx5Var2 = new mx5("ArrowToProgress", 1);
        b = mx5Var2;
        mx5 mx5Var3 = new mx5("ProgressToArrow", 2);
        c = mx5Var3;
        mx5 mx5Var4 = new mx5("ProgressSpinning", 3);
        d = mx5Var4;
        o = new mx5[]{mx5Var, mx5Var2, mx5Var3, mx5Var4};
    }

    public static mx5 valueOf(String str) {
        return (mx5) Enum.valueOf(mx5.class, str);
    }

    public static mx5[] values() {
        return (mx5[]) o.clone();
    }
}
