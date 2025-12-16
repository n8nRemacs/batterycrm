package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class ys0 {
    public static final ys0 a;
    public static final ys0 b;
    public static final ys0 c;
    public static final /* synthetic */ ys0[] d;

    static {
        ys0 ys0Var = new ys0("INPUT", 0);
        a = ys0Var;
        ys0 ys0Var2 = new ys0("SEARCH", 1);
        b = ys0Var2;
        ys0 ys0Var3 = new ys0("CHAT_STATUS", 2);
        c = ys0Var3;
        d = new ys0[]{ys0Var, ys0Var2, ys0Var3};
    }

    public static ys0 valueOf(String str) {
        return (ys0) Enum.valueOf(ys0.class, str);
    }

    public static ys0[] values() {
        return (ys0[]) d.clone();
    }
}
