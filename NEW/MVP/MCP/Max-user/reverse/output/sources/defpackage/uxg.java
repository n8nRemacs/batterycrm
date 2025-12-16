package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class uxg {
    public static final uxg a;
    public static final uxg b;
    public static final uxg c;
    public static final uxg d;
    public static final /* synthetic */ uxg[] o;

    static {
        uxg uxgVar = new uxg("MORE", 0);
        a = uxgVar;
        uxg uxgVar2 = new uxg("ROTATION", 1);
        b = uxgVar2;
        uxg uxgVar3 = new uxg("PIN", 2);
        c = uxgVar3;
        uxg uxgVar4 = new uxg("NONE", 3);
        d = uxgVar4;
        o = new uxg[]{uxgVar, uxgVar2, uxgVar3, uxgVar4};
    }

    public static uxg valueOf(String str) {
        return (uxg) Enum.valueOf(uxg.class, str);
    }

    public static uxg[] values() {
        return (uxg[]) o.clone();
    }
}
