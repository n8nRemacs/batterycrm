package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class xq {
    public static final /* synthetic */ zg5 X;
    public static final xq b;
    public static final xq c;
    public static final xq d;
    public static final /* synthetic */ xq[] o;
    public final int a;

    static {
        xq xqVar = new xq("SYSTEM", 0, 1);
        b = xqVar;
        xq xqVar2 = new xq("LIGHT", 1, 2);
        c = xqVar2;
        xq xqVar3 = new xq("DARK", 2, 3);
        d = xqVar3;
        xq[] xqVarArr = {xqVar, xqVar2, xqVar3};
        o = xqVarArr;
        X = new zg5(xqVarArr);
    }

    public xq(String str, int i, int i2) {
        this.a = i2;
    }

    public static xq valueOf(String str) {
        return (xq) Enum.valueOf(xq.class, str);
    }

    public static xq[] values() {
        return (xq[]) o.clone();
    }
}
