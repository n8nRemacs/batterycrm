package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class g84 {
    public static final g84 a;
    public static final g84 b;
    public static final g84 c;
    public static final /* synthetic */ g84[] d;

    static {
        g84 g84Var = new g84("COROUTINE_SUSPENDED", 0);
        a = g84Var;
        g84 g84Var2 = new g84("UNDECIDED", 1);
        b = g84Var2;
        g84 g84Var3 = new g84("RESUMED", 2);
        c = g84Var3;
        d = new g84[]{g84Var, g84Var2, g84Var3};
    }

    public static g84 valueOf(String str) {
        return (g84) Enum.valueOf(g84.class, str);
    }

    public static g84[] values() {
        return (g84[]) d.clone();
    }
}
