package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class lx5 {
    public static final lx5 a;
    public static final lx5 b;
    public static final /* synthetic */ lx5[] c;

    static {
        lx5 lx5Var = new lx5("Arrow", 0);
        a = lx5Var;
        lx5 lx5Var2 = new lx5("Progress", 1);
        b = lx5Var2;
        c = new lx5[]{lx5Var, lx5Var2};
    }

    public static lx5 valueOf(String str) {
        return (lx5) Enum.valueOf(lx5.class, str);
    }

    public static lx5[] values() {
        return (lx5[]) c.clone();
    }
}
