package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class kf3 {
    public static final kf3 a;
    public static final kf3 b;
    public static final kf3 c;
    public static final /* synthetic */ kf3[] d;

    static {
        kf3 kf3Var = new kf3("LIGHT", 0);
        a = kf3Var;
        kf3 kf3Var2 = new kf3("DARK", 1);
        b = kf3Var2;
        kf3 kf3Var3 = new kf3("UNIVERSAL", 2);
        c = kf3Var3;
        d = new kf3[]{kf3Var, kf3Var2, kf3Var3};
    }

    public static kf3 valueOf(String str) {
        return (kf3) Enum.valueOf(kf3.class, str);
    }

    public static kf3[] values() {
        return (kf3[]) d.clone();
    }
}
