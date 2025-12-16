package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class epf {
    public static final dpf Companion;
    public static final epf X;
    public static final /* synthetic */ epf[] Y;
    public static final Object a;
    public static final epf b;
    public static final epf c;
    public static final epf d;
    public static final epf o;

    static {
        epf epfVar = new epf("UPDATED", 0);
        b = epfVar;
        epf epfVar2 = new epf("REMOVED", 1);
        c = epfVar2;
        epf epfVar3 = new epf("CLEARED", 2);
        d = epfVar3;
        epf epfVar4 = new epf("OPENED", 3);
        o = epfVar4;
        epf epfVar5 = new epf("AUTHORIZED", 4);
        X = epfVar5;
        Y = new epf[]{epfVar, epfVar2, epfVar3, epfVar4, epfVar5};
        Companion = new dpf();
        a = ipi.b(2, new nte(24));
    }

    public static epf valueOf(String str) {
        return (epf) Enum.valueOf(epf.class, str);
    }

    public static epf[] values() {
        return (epf[]) Y.clone();
    }
}
