package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class b17 {
    public static final b17 a;
    public static final b17 b;
    public static final /* synthetic */ b17[] c;

    static {
        b17 b17Var = new b17("PQ", 0);
        a = b17Var;
        b17 b17Var2 = new b17("HLG", 1);
        b = b17Var2;
        c = new b17[]{b17Var, b17Var2};
    }

    public static b17 valueOf(String str) {
        return (b17) Enum.valueOf(b17.class, str);
    }

    public static b17[] values() {
        return (b17[]) c.clone();
    }
}
