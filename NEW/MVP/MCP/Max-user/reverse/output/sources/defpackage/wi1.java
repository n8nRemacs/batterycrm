package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class wi1 {
    public static final wi1 a;
    public static final wi1 b;
    public static final wi1 c;
    public static final /* synthetic */ wi1[] d;

    static {
        wi1 wi1Var = new wi1("CREATOR", 0);
        a = wi1Var;
        wi1 wi1Var2 = new wi1("ADMIN", 1);
        b = wi1Var2;
        wi1 wi1Var3 = new wi1("SPEAKER", 2);
        c = wi1Var3;
        d = new wi1[]{wi1Var, wi1Var2, wi1Var3};
    }

    public static wi1 valueOf(String str) {
        return (wi1) Enum.valueOf(wi1.class, str);
    }

    public static wi1[] values() {
        return (wi1[]) d.clone();
    }
}
