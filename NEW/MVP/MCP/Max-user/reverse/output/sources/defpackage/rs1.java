package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class rs1 {
    public static final rs1 a;
    public static final rs1 b;
    public static final /* synthetic */ rs1[] c;

    static {
        rs1 rs1Var = new rs1("NEGATIVE_POSITIVE", 0);
        a = rs1Var;
        rs1 rs1Var2 = new rs1("NEUTRAL_POSITIVE", 1);
        b = rs1Var2;
        c = new rs1[]{rs1Var, rs1Var2};
    }

    public static rs1 valueOf(String str) {
        return (rs1) Enum.valueOf(rs1.class, str);
    }

    public static rs1[] values() {
        return (rs1[]) c.clone();
    }
}
