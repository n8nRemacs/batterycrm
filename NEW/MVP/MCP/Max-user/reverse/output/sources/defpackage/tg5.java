package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class tg5 {
    public static final tg5 a;
    public static final tg5 b;
    public static final /* synthetic */ tg5[] c;

    static {
        tg5 tg5Var = new tg5("SUCCESS", 0);
        a = tg5Var;
        tg5 tg5Var2 = new tg5("FAILURE", 1);
        b = tg5Var2;
        c = new tg5[]{tg5Var, tg5Var2};
    }

    public static tg5 valueOf(String str) {
        return (tg5) Enum.valueOf(tg5.class, str);
    }

    public static tg5[] values() {
        return (tg5[]) c.clone();
    }
}
