package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class w54 {
    public static final w54 a;
    public static final w54 b;
    public static final w54 c;
    public static final w54 d;
    public static final /* synthetic */ w54[] o;

    static {
        w54 w54Var = new w54("TEMPORARY_VISIBLE", 0);
        a = w54Var;
        w54 w54Var2 = new w54("HIDDEN", 1);
        b = w54Var2;
        w54 w54Var3 = new w54("PLAY_HIDDEN", 2);
        c = w54Var3;
        w54 w54Var4 = new w54("PERMANENTLY_VISIBLE", 3);
        d = w54Var4;
        o = new w54[]{w54Var, w54Var2, w54Var3, w54Var4};
    }

    public static w54 valueOf(String str) {
        return (w54) Enum.valueOf(w54.class, str);
    }

    public static w54[] values() {
        return (w54[]) o.clone();
    }
}
