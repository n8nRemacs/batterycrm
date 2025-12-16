package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class gt1 {
    public static final /* synthetic */ gt1[] X;
    public static final gt1 a;
    public static final gt1 b;
    public static final gt1 c;
    public static final gt1 d;
    public static final gt1 o;

    static {
        gt1 gt1Var = new gt1("MIDDLE", 0);
        a = gt1Var;
        gt1 gt1Var2 = new gt1("SMALL", 1);
        b = gt1Var2;
        gt1 gt1Var3 = new gt1("PIP", 2);
        c = gt1Var3;
        gt1 gt1Var4 = new gt1("PREVIEW", 3);
        d = gt1Var4;
        gt1 gt1Var5 = new gt1("BIG_AVATAR", 4);
        o = gt1Var5;
        X = new gt1[]{gt1Var, gt1Var2, gt1Var3, gt1Var4, gt1Var5};
    }

    public static gt1 valueOf(String str) {
        return (gt1) Enum.valueOf(gt1.class, str);
    }

    public static gt1[] values() {
        return (gt1[]) X.clone();
    }
}
