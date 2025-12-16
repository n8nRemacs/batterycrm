package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class t81 {
    public static final t81 a;
    public static final t81 b;
    public static final t81 c;
    public static final /* synthetic */ t81[] d;

    /* JADX INFO: Fake field, exist only in values array */
    t81 EF0;

    static {
        t81 t81Var = new t81("FEASIBLE", 0);
        t81 t81Var2 = new t81("CALLER_IS_BLOCKED", 1);
        t81 t81Var3 = new t81("NOT_FRIENDS", 2);
        t81 t81Var4 = new t81("CALLEE_IS_OFFLINE", 3);
        t81 t81Var5 = new t81("UNKNOWN_ERROR", 4);
        a = t81Var5;
        t81 t81Var6 = new t81("UNSUPPORTED", 5);
        b = t81Var6;
        t81 t81Var7 = new t81("OLD_VERSION", 6);
        c = t81Var7;
        d = new t81[]{t81Var, t81Var2, t81Var3, t81Var4, t81Var5, t81Var6, t81Var7};
    }

    public static t81 valueOf(String str) {
        return (t81) Enum.valueOf(t81.class, str);
    }

    public static t81[] values() {
        return (t81[]) d.clone();
    }
}
