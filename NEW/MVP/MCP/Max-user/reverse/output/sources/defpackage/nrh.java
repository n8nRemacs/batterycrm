package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class nrh {
    public static final mrh Companion;
    public static final Object a;
    public static final nrh b;
    public static final nrh c;
    public static final nrh d;
    public static final /* synthetic */ nrh[] o;

    static {
        nrh nrhVar = new nrh("IMPACT_OCCURED", 0);
        b = nrhVar;
        nrh nrhVar2 = new nrh("NOTIFICATION_OCCURED", 1);
        c = nrhVar2;
        nrh nrhVar3 = new nrh("SELECTION_CHANGED", 2);
        d = nrhVar3;
        o = new nrh[]{nrhVar, nrhVar2, nrhVar3};
        Companion = new mrh();
        a = ipi.b(2, new q8g(24));
    }

    public static nrh valueOf(String str) {
        return (nrh) Enum.valueOf(nrh.class, str);
    }

    public static nrh[] values() {
        return (nrh[]) o.clone();
    }
}
