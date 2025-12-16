package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class ig0 {
    public static final /* synthetic */ ig0[] X;
    public static final ig0 a;
    public static final ig0 b;
    public static final ig0 c;
    public static final ig0 d;
    public static final ig0 o;

    static {
        ig0 ig0Var = new ig0("REMOTE", 0);
        a = ig0Var;
        ig0 ig0Var2 = new ig0("LOCAL_RTT", 1);
        b = ig0Var2;
        ig0 ig0Var3 = new ig0("LOCAL_LOSS", 2);
        c = ig0Var3;
        ig0 ig0Var4 = new ig0("REMOTE_RTT", 3);
        d = ig0Var4;
        ig0 ig0Var5 = new ig0("REMOTE_LOSS", 4);
        o = ig0Var5;
        X = new ig0[]{ig0Var, ig0Var2, ig0Var3, ig0Var4, ig0Var5};
    }

    public static ig0 valueOf(String str) {
        return (ig0) Enum.valueOf(ig0.class, str);
    }

    public static ig0[] values() {
        return (ig0[]) X.clone();
    }
}
