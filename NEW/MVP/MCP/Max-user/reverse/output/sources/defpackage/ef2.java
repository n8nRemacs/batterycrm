package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class ef2 {
    public static final ef2 a;
    public static final ef2 b;
    public static final ef2 c;
    public static final /* synthetic */ ef2[] d;

    static {
        ef2 ef2Var = new ef2("SOUND", 0);
        a = ef2Var;
        ef2 ef2Var2 = new ef2("VIBRATION", 1);
        b = ef2Var2;
        ef2 ef2Var3 = new ef2("LED", 2);
        c = ef2Var3;
        d = new ef2[]{ef2Var, ef2Var2, ef2Var3};
    }

    public static ef2 valueOf(String str) {
        return (ef2) Enum.valueOf(ef2.class, str);
    }

    public static ef2[] values() {
        return (ef2[]) d.clone();
    }
}
