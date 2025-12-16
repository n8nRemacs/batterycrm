package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class eg0 {
    public static final eg0 a;
    public static final eg0 b;
    public static final /* synthetic */ eg0[] c;

    static {
        eg0 eg0Var = new eg0("EXPONENTIAL", 0);
        a = eg0Var;
        eg0 eg0Var2 = new eg0("LINEAR", 1);
        b = eg0Var2;
        c = new eg0[]{eg0Var, eg0Var2};
    }

    public static eg0 valueOf(String str) {
        return (eg0) Enum.valueOf(eg0.class, str);
    }

    public static eg0[] values() {
        return (eg0[]) c.clone();
    }
}
