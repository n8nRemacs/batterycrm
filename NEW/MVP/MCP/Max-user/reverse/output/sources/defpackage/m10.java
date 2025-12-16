package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class m10 {
    public static final m10 a;
    public static final m10 b;
    public static final m10 c;
    public static final /* synthetic */ m10[] d;

    static {
        m10 m10Var = new m10("DEFAULT", 0);
        a = m10Var;
        m10 m10Var2 = new m10("PROCESSING", 1);
        b = m10Var2;
        m10 m10Var3 = new m10("PROCESSED", 2);
        c = m10Var3;
        d = new m10[]{m10Var, m10Var2, m10Var3};
    }

    public static m10 valueOf(String str) {
        return (m10) Enum.valueOf(m10.class, str);
    }

    public static m10[] values() {
        return (m10[]) d.clone();
    }
}
