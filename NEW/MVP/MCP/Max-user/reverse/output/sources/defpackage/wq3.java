package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class wq3 {
    public static final wq3 a;
    public static final wq3 b;
    public static final /* synthetic */ wq3[] c;

    static {
        wq3 wq3Var = new wq3("POSITIVE", 0);
        a = wq3Var;
        wq3 wq3Var2 = new wq3("NEGATIVE", 1);
        b = wq3Var2;
        c = new wq3[]{wq3Var, wq3Var2};
    }

    public static wq3 valueOf(String str) {
        return (wq3) Enum.valueOf(wq3.class, str);
    }

    public static wq3[] values() {
        return (wq3[]) c.clone();
    }
}
