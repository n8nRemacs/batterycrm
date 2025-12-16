package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class dc1 {
    public static final dc1 a;
    public static final dc1 b;
    public static final /* synthetic */ dc1[] c;

    static {
        dc1 dc1Var = new dc1("NONE", 0);
        a = dc1Var;
        dc1 dc1Var2 = new dc1("CALL", 1);
        b = dc1Var2;
        c = new dc1[]{dc1Var, dc1Var2};
    }

    public static dc1 valueOf(String str) {
        return (dc1) Enum.valueOf(dc1.class, str);
    }

    public static dc1[] values() {
        return (dc1[]) c.clone();
    }
}
