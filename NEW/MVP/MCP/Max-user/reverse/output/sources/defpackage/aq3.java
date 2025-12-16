package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class aq3 {
    public static final aq3 a;
    public static final aq3 b;
    public static final aq3 c;
    public static final /* synthetic */ aq3[] d;

    static {
        aq3 aq3Var = new aq3("DEFAULT", 0);
        a = aq3Var;
        aq3 aq3Var2 = new aq3("SUCCESS", 1);
        b = aq3Var2;
        aq3 aq3Var3 = new aq3("ERROR", 2);
        c = aq3Var3;
        d = new aq3[]{aq3Var, aq3Var2, aq3Var3};
    }

    public static aq3 valueOf(String str) {
        return (aq3) Enum.valueOf(aq3.class, str);
    }

    public static aq3[] values() {
        return (aq3[]) d.clone();
    }
}
