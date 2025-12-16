package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class dxg {
    public static final dxg a;
    public static final dxg b;
    public static final dxg c;
    public static final dxg d;
    public static final /* synthetic */ dxg[] o;

    static {
        dxg dxgVar = new dxg("ENABLED", 0);
        a = dxgVar;
        dxg dxgVar2 = new dxg("DISABLED", 1);
        b = dxgVar2;
        dxg dxgVar3 = new dxg("USER_IGNORED", 2);
        c = dxgVar3;
        dxg dxgVar4 = new dxg("UNKNOWN", 3);
        d = dxgVar4;
        o = new dxg[]{dxgVar, dxgVar2, dxgVar3, dxgVar4};
    }

    public static dxg valueOf(String str) {
        return (dxg) Enum.valueOf(dxg.class, str);
    }

    public static dxg[] values() {
        return (dxg[]) o.clone();
    }
}
