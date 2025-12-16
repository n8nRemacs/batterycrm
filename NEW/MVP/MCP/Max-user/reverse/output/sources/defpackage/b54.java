package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class b54 {
    public static final b54 a;
    public static final b54 b;
    public static final /* synthetic */ b54[] c;

    static {
        b54 b54Var = new b54("RELEASE_DETACH", 0);
        a = b54Var;
        b54 b54Var2 = new b54("RETAIN_DETACH", 1);
        b = b54Var2;
        c = new b54[]{b54Var, b54Var2};
    }

    public static b54 valueOf(String str) {
        return (b54) Enum.valueOf(b54.class, str);
    }

    public static b54[] values() {
        return (b54[]) c.clone();
    }
}
