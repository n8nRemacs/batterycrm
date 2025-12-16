package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class eo6 {
    public static final eo6 a;
    public static final eo6 b;
    public static final eo6 c;
    public static final /* synthetic */ eo6[] d;

    static {
        eo6 eo6Var = new eo6("UNKNOWN", 0);
        a = eo6Var;
        eo6 eo6Var2 = new eo6("DEFAULT", 1);
        b = eo6Var2;
        eo6 eo6Var3 = new eo6("YUV", 2);
        c = eo6Var3;
        d = new eo6[]{eo6Var, eo6Var2, eo6Var3};
    }

    public static eo6 valueOf(String str) {
        return (eo6) Enum.valueOf(eo6.class, str);
    }

    public static eo6[] values() {
        return (eo6[]) d.clone();
    }
}
