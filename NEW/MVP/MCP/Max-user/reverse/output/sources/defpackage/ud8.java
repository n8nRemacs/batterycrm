package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class ud8 {
    public static final ud8 a;
    public static final ud8 b;
    public static final ud8 c;
    public static final ud8 d;
    public static final /* synthetic */ ud8[] o;

    static {
        ud8 ud8Var = new ud8("NOT_SUPPORTED", 0);
        a = ud8Var;
        ud8 ud8Var2 = new ud8("PHOTO", 1);
        b = ud8Var2;
        ud8 ud8Var3 = new ud8("GIF", 2);
        c = ud8Var3;
        ud8 ud8Var4 = new ud8("VIDEO", 3);
        d = ud8Var4;
        o = new ud8[]{ud8Var, ud8Var2, ud8Var3, ud8Var4};
    }

    public static ud8 valueOf(String str) {
        return (ud8) Enum.valueOf(ud8.class, str);
    }

    public static ud8[] values() {
        return (ud8[]) o.clone();
    }
}
