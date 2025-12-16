package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class wj9 {
    public static final wj9 a;
    public static final wj9 b;
    public static final wj9 c;
    public static final /* synthetic */ wj9[] d;

    static {
        wj9 wj9Var = new wj9("DISABLED", 0);
        a = wj9Var;
        wj9 wj9Var2 = new wj9("EXPANDED", 1);
        b = wj9Var2;
        wj9 wj9Var3 = new wj9("COLLAPSED", 2);
        c = wj9Var3;
        d = new wj9[]{wj9Var, wj9Var2, wj9Var3};
    }

    public static wj9 valueOf(String str) {
        return (wj9) Enum.valueOf(wj9.class, str);
    }

    public static wj9[] values() {
        return (wj9[]) d.clone();
    }
}
