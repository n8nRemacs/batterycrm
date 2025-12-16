package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class lb1 {
    public static final lb1 a;
    public static final lb1 b;
    public static final lb1 c;
    public static final /* synthetic */ lb1[] d;

    static {
        lb1 lb1Var = new lb1("Old", 0);
        a = lb1Var;
        lb1 lb1Var2 = new lb1("Strategy1", 1);
        b = lb1Var2;
        lb1 lb1Var3 = new lb1("Strategy2", 2);
        c = lb1Var3;
        d = new lb1[]{lb1Var, lb1Var2, lb1Var3};
    }

    public static lb1 valueOf(String str) {
        return (lb1) Enum.valueOf(lb1.class, str);
    }

    public static lb1[] values() {
        return (lb1[]) d.clone();
    }
}
