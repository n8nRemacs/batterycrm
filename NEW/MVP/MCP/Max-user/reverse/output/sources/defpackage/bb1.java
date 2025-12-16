package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class bb1 {
    public static final bb1 b;
    public static final bb1 c;
    public static final /* synthetic */ bb1[] d;
    public static final /* synthetic */ zg5 o;
    public final int a;

    static {
        bb1 bb1Var = new bb1("ALL", 0, y2d.call_history_call_tab_all);
        b = bb1Var;
        bb1 bb1Var2 = new bb1("MISSING", 1, y2d.call_history_call_tab_missing);
        c = bb1Var2;
        bb1[] bb1VarArr = {bb1Var, bb1Var2};
        d = bb1VarArr;
        o = new zg5(bb1VarArr);
    }

    public bb1(String str, int i, int i2) {
        this.a = i2;
    }

    public static bb1 valueOf(String str) {
        return (bb1) Enum.valueOf(bb1.class, str);
    }

    public static bb1[] values() {
        return (bb1[]) d.clone();
    }
}
