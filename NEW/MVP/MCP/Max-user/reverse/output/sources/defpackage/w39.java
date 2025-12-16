package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class w39 {
    public static final w39 a;
    public static final w39 b;
    public static final w39 c;
    public static final w39 d;
    public static final /* synthetic */ w39[] o;

    static {
        w39 w39Var = new w39("GIF", 0);
        a = w39Var;
        w39 w39Var2 = new w39("STICKER", 1);
        b = w39Var2;
        w39 w39Var3 = new w39("VIDEO", 2);
        c = w39Var3;
        w39 w39Var4 = new w39("PIP", 3);
        d = w39Var4;
        o = new w39[]{w39Var, w39Var2, w39Var3, w39Var4};
    }

    public static w39 valueOf(String str) {
        return (w39) Enum.valueOf(w39.class, str);
    }

    public static w39[] values() {
        return (w39[]) o.clone();
    }
}
