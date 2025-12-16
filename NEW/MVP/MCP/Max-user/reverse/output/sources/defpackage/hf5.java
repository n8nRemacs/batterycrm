package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class hf5 {
    public static final hf5 a;
    public static final hf5 b;
    public static final hf5 c;
    public static final hf5 d;
    public static final /* synthetic */ hf5[] o;

    static {
        hf5 hf5Var = new hf5("Initial", 0);
        a = hf5Var;
        hf5 hf5Var2 = new hf5("ZeroRTT", 1);
        b = hf5Var2;
        hf5 hf5Var3 = new hf5("Handshake", 2);
        c = hf5Var3;
        hf5 hf5Var4 = new hf5("App", 3);
        d = hf5Var4;
        o = new hf5[]{hf5Var, hf5Var2, hf5Var3, hf5Var4};
    }

    public static hf5 valueOf(String str) {
        return (hf5) Enum.valueOf(hf5.class, str);
    }

    public static hf5[] values() {
        return (hf5[]) o.clone();
    }

    public final m5c a() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return m5c.a;
        }
        m5c m5cVar = m5c.c;
        if (iOrdinal == 1) {
            return m5cVar;
        }
        if (iOrdinal == 2) {
            return m5c.b;
        }
        if (iOrdinal != 3) {
            return null;
        }
        return m5cVar;
    }
}
