package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class b52 {
    public static final b52 a;
    public static final b52 b;
    public static final b52 c;
    public static final /* synthetic */ b52[] d;

    static {
        b52 b52Var = new b52("COLLAPSED", 0);
        a = b52Var;
        b52 b52Var2 = new b52("EXPANDED", 1);
        b = b52Var2;
        b52 b52Var3 = new b52("MAX_EXPANDED", 2);
        c = b52Var3;
        d = new b52[]{b52Var, b52Var2, b52Var3};
    }

    public static b52 valueOf(String str) {
        return (b52) Enum.valueOf(b52.class, str);
    }

    public static b52[] values() {
        return (b52[]) d.clone();
    }
}
