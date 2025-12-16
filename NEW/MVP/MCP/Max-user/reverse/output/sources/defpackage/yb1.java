package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class yb1 {
    public static final yb1 a;
    public static final yb1 b;
    public static final yb1 c;
    public static final /* synthetic */ yb1[] d;

    static {
        yb1 yb1Var = new yb1("CALLING", 0);
        a = yb1Var;
        yb1 yb1Var2 = new yb1("ACTIVE", 1);
        b = yb1Var2;
        yb1 yb1Var3 = new yb1("NO_CONNECTION", 2);
        c = yb1Var3;
        d = new yb1[]{yb1Var, yb1Var2, yb1Var3};
    }

    public static yb1 valueOf(String str) {
        return (yb1) Enum.valueOf(yb1.class, str);
    }

    public static yb1[] values() {
        return (yb1[]) d.clone();
    }
}
