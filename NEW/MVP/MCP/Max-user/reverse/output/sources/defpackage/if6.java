package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class if6 {
    public static final if6 X;
    public static final /* synthetic */ if6[] Y;
    public static final if6 a;
    public static final if6 b;
    public static final if6 c;
    public static final if6 d;
    public static final if6 o;

    static {
        if6 if6Var = new if6("FORMAT_HANDLED", 0);
        a = if6Var;
        if6 if6Var2 = new if6("FORMAT_EXCEEDS_CAPABILITIES", 1);
        b = if6Var2;
        if6 if6Var3 = new if6("FORMAT_UNSUPPORTED_DRM", 2);
        c = if6Var3;
        if6 if6Var4 = new if6("FORMAT_UNSUPPORTED_SUBTYPE", 3);
        d = if6Var4;
        if6 if6Var5 = new if6("FORMAT_UNSUPPORTED_TYPE", 4);
        o = if6Var5;
        if6 if6Var6 = new if6("UNKNOWN", 5);
        X = if6Var6;
        Y = new if6[]{if6Var, if6Var2, if6Var3, if6Var4, if6Var5, if6Var6};
    }

    public static if6 valueOf(String str) {
        return (if6) Enum.valueOf(if6.class, str);
    }

    public static if6[] values() {
        return (if6[]) Y.clone();
    }
}
