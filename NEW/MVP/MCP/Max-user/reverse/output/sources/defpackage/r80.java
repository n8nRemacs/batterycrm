package defpackage;

import ru.ok.android.externcalls.sdk.stat.candidateschanged.IceCandidatePairChangedStat;

/* loaded from: classes.dex */
public final class r80 implements pqa {
    public static final r80 a = new r80();
    public static final wu5 b = new wu5("eventsDroppedCount", az1.p(az1.o(bpc.class, new ly(1))));
    public static final wu5 c = new wu5(IceCandidatePairChangedStat.KEY_REASON, az1.p(az1.o(bpc.class, new ly(3))));

    @Override // defpackage.ie5
    public final void a(Object obj, Object obj2) {
        kg8 kg8Var = (kg8) obj;
        qqa qqaVar = (qqa) obj2;
        qqaVar.e(b, kg8Var.a);
        qqaVar.a(c, kg8Var.b);
    }
}
