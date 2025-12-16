package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class x23 {
    public static final /* synthetic */ x23[] X;
    public static final x23 a;
    public static final x23 b;
    public static final x23 c;
    public static final x23 d;
    public static final x23 o;

    static {
        x23 x23Var = new x23("LOADING", 0);
        a = x23Var;
        x23 x23Var2 = new x23("LOADING_NEXT_PAGE", 1);
        b = x23Var2;
        x23 x23Var3 = new x23("IDLE_SEARCH", 2);
        c = x23Var3;
        x23 x23Var4 = new x23("SEARCH_RESULT", 3);
        d = x23Var4;
        x23 x23Var5 = new x23("EMPTY_SEARCH_RESULT", 4);
        o = x23Var5;
        X = new x23[]{x23Var, x23Var2, x23Var3, x23Var4, x23Var5};
    }

    public static x23 valueOf(String str) {
        return (x23) Enum.valueOf(x23.class, str);
    }

    public static x23[] values() {
        return (x23[]) X.clone();
    }
}
