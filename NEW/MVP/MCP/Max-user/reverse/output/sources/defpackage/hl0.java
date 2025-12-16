package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class hl0 {
    public static final hl0 a;
    public static final hl0 b;
    public static final /* synthetic */ hl0[] c;

    static {
        hl0 hl0Var = new hl0("SQUARE", 0);
        a = hl0Var;
        hl0 hl0Var2 = new hl0("ORIGINAL", 1);
        b = hl0Var2;
        c = new hl0[]{hl0Var, hl0Var2};
    }

    public static hl0 valueOf(String str) {
        return (hl0) Enum.valueOf(hl0.class, str);
    }

    public static hl0[] values() {
        return (hl0[]) c.clone();
    }
}
