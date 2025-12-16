package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class a16 {
    public static final a16 a;
    public static final a16 b;
    public static final a16 c;
    public static final /* synthetic */ a16[] d;
    public static final /* synthetic */ zg5 o;

    static {
        a16 a16Var = new a16("FIT_XY", 0);
        a16 a16Var2 = new a16("FILL", 1);
        a = a16Var2;
        a16 a16Var3 = new a16("CENTER_INSIDE", 2);
        b = a16Var3;
        a16 a16Var4 = new a16("CENTER", 3);
        c = a16Var4;
        a16[] a16VarArr = {a16Var, a16Var2, a16Var3, a16Var4};
        d = a16VarArr;
        o = new zg5(a16VarArr);
    }

    public static a16 valueOf(String str) {
        return (a16) Enum.valueOf(a16.class, str);
    }

    public static a16[] values() {
        return (a16[]) d.clone();
    }
}
