package defpackage;

/* loaded from: classes2.dex */
public final /* synthetic */ class pi2 implements cm6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;

    public /* synthetic */ pi2(int i, long j, long j2, Object obj) {
        this.a = i;
        this.d = obj;
        this.b = j;
        this.c = j2;
    }

    @Override // defpackage.cm6
    public final Object invoke() {
        int i = this.a;
        qqg qqgVar = qqg.a;
        long j = this.b;
        Object obj = this.d;
        switch (i) {
            case 0:
                ve2 ve2Var = (ve2) obj;
                sf2 sf2VarK = ve2Var.K(j);
                if (sf2VarK != null) {
                    ve2Var.r0(sf2VarK.a, sf2VarK.b, this.c);
                    break;
                }
                break;
            default:
                ve2 ve2VarI = ((w63) obj).i();
                ve2VarI.getClass();
                Long lValueOf = Long.valueOf(j);
                long j2 = this.c;
                wqi.c("ve2", "changeLastNotifMessageId, chatId = %d, lastNotifMessageId = %d", lValueOf, Long.valueOf(j2));
                ve2VarI.r(j, false, new be2(j2, 7));
                break;
        }
        return qqgVar;
    }
}
