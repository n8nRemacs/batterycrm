package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class lg1 {
    public static final lg1 a;
    public static final lg1 b;
    public static final /* synthetic */ lg1[] c;

    /* JADX INFO: Fake field, exist only in values array */
    lg1 EF0;

    static {
        lg1 lg1Var = new lg1("UNDEFINE", 0);
        lg1 lg1Var2 = new lg1("MENU", 1);
        a = lg1Var2;
        lg1 lg1Var3 = new lg1("RECORD", 2);
        b = lg1Var3;
        c = new lg1[]{lg1Var, lg1Var2, lg1Var3};
    }

    public static lg1 valueOf(String str) {
        return (lg1) Enum.valueOf(lg1.class, str);
    }

    public static lg1[] values() {
        return (lg1[]) c.clone();
    }
}
