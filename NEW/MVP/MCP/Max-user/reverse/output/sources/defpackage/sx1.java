package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class sx1 implements ux1 {
    public static final sx1 a;
    public static final /* synthetic */ sx1[] b;

    static {
        sx1 sx1Var = new sx1("CALL_BY_LINK", 0);
        a = sx1Var;
        b = new sx1[]{sx1Var};
    }

    public static sx1 valueOf(String str) {
        return (sx1) Enum.valueOf(sx1.class, str);
    }

    public static sx1[] values() {
        return (sx1[]) b.clone();
    }

    @Override // defpackage.ux1
    public final String a() {
        return "CALL_BY_LINK";
    }
}
