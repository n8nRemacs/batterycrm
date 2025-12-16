package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class h29 {
    public static final h29 a;
    public static final h29 b;
    public static final h29 c;
    public static final h29 d;
    public static final /* synthetic */ h29[] o;

    static {
        h29 h29Var = new h29("UNMUTED", 0);
        a = h29Var;
        h29 h29Var2 = new h29("UNMUTED_BUT_MUTED_ONCE", 1);
        b = h29Var2;
        h29 h29Var3 = new h29("MUTED_PERMANENT", 2);
        c = h29Var3;
        h29 h29Var4 = new h29("MUTED_PERMANENT_BUT_UNMUTED_ONCE", 3);
        d = h29Var4;
        o = new h29[]{h29Var, h29Var2, h29Var3, h29Var4};
    }

    public static h29 valueOf(String str) {
        return (h29) Enum.valueOf(h29.class, str);
    }

    public static h29[] values() {
        return (h29[]) o.clone();
    }
}
