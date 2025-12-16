package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class co8 {
    public static final co8 a;
    public static final co8 b;
    public static final co8 c;
    public static final co8 d;
    public static final /* synthetic */ co8[] o;

    static {
        co8 co8Var = new co8("ACTIVE_SMALL", 0);
        a = co8Var;
        co8 co8Var2 = new co8("ACTIVE_BIG", 1);
        b = co8Var2;
        co8 co8Var3 = new co8("PASSIVE_SMALL", 2);
        c = co8Var3;
        co8 co8Var4 = new co8("PASSIVE_BIG", 3);
        d = co8Var4;
        o = new co8[]{co8Var, co8Var2, co8Var3, co8Var4};
    }

    public static co8 valueOf(String str) {
        return (co8) Enum.valueOf(co8.class, str);
    }

    public static co8[] values() {
        return (co8[]) o.clone();
    }
}
