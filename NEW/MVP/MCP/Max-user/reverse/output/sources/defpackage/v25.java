package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class v25 {
    public static final v25 a;
    public static final v25 b;
    public static final v25 c;
    public static final /* synthetic */ v25[] d;

    static {
        v25 v25Var = new v25("ALWAYS", 0);
        a = v25Var;
        v25 v25Var2 = new v25("AUTO", 1);
        b = v25Var2;
        v25 v25Var3 = new v25("NEVER", 2);
        c = v25Var3;
        d = new v25[]{v25Var, v25Var2, v25Var3};
    }

    public static v25 valueOf(String str) {
        return (v25) Enum.valueOf(v25.class, str);
    }

    public static v25[] values() {
        return (v25[]) d.clone();
    }
}
