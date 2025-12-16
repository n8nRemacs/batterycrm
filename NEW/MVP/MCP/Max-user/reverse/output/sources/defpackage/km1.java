package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class km1 {
    public static final km1 a;
    public static final km1 b;
    public static final /* synthetic */ km1[] c;

    static {
        km1 km1Var = new km1("LOW", 0);
        a = km1Var;
        km1 km1Var2 = new km1("MIDDLE", 1);
        b = km1Var2;
        c = new km1[]{km1Var, km1Var2, new km1("HIGH", 2)};
    }

    public static km1 valueOf(String str) {
        return (km1) Enum.valueOf(km1.class, str);
    }

    public static km1[] values() {
        return (km1[]) c.clone();
    }
}
