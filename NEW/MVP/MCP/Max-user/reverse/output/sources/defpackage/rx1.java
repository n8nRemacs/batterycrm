package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class rx1 {
    public static final rx1 a;
    public static final rx1 b;
    public static final rx1 c;
    public static final /* synthetic */ rx1[] d;

    static {
        rx1 rx1Var = new rx1("OUTGOING", 0);
        a = rx1Var;
        rx1 rx1Var2 = new rx1("INCOMING", 1);
        b = rx1Var2;
        rx1 rx1Var3 = new rx1("GROUP", 2);
        c = rx1Var3;
        d = new rx1[]{rx1Var, rx1Var2, rx1Var3};
    }

    public static rx1 valueOf(String str) {
        return (rx1) Enum.valueOf(rx1.class, str);
    }

    public static rx1[] values() {
        return (rx1[]) d.clone();
    }
}
