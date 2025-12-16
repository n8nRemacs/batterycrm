package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class g29 {
    public static final g29 a;
    public static final g29 b;
    public static final g29 c;
    public static final g29 d;
    public static final /* synthetic */ g29[] o;

    static {
        g29 g29Var = new g29("AUDIO", 0);
        a = g29Var;
        g29 g29Var2 = new g29("VIDEO", 1);
        b = g29Var2;
        g29 g29Var3 = new g29("SCREEN_SHARING", 2);
        c = g29Var3;
        g29 g29Var4 = new g29("MOVIE_SHARING", 3);
        d = g29Var4;
        o = new g29[]{g29Var, g29Var2, g29Var3, g29Var4};
    }

    public static g29 valueOf(String str) {
        return (g29) Enum.valueOf(g29.class, str);
    }

    public static g29[] values() {
        return (g29[]) o.clone();
    }
}
