package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class l38 {
    public static final /* synthetic */ l38[] X;
    public static final l38 a;
    public static final l38 b;
    public static final l38 c;
    public static final l38 d;
    public static final l38 o;

    static {
        l38 l38Var = new l38("DESTROYED", 0);
        a = l38Var;
        l38 l38Var2 = new l38("INITIALIZED", 1);
        b = l38Var2;
        l38 l38Var3 = new l38("CREATED", 2);
        c = l38Var3;
        l38 l38Var4 = new l38("STARTED", 3);
        d = l38Var4;
        l38 l38Var5 = new l38("RESUMED", 4);
        o = l38Var5;
        X = new l38[]{l38Var, l38Var2, l38Var3, l38Var4, l38Var5};
    }

    public static l38 valueOf(String str) {
        return (l38) Enum.valueOf(l38.class, str);
    }

    public static l38[] values() {
        return (l38[]) X.clone();
    }

    public final boolean a(l38 l38Var) {
        return compareTo(l38Var) >= 0;
    }
}
