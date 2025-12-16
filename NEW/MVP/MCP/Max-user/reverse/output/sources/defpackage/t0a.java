package defpackage;

/* loaded from: classes2.dex */
public final /* synthetic */ class t0a implements cm6 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ ds4 b;

    @Override // defpackage.cm6
    public final Object invoke() {
        Object ipdVar;
        switch (this.a) {
            case 0:
                return this.b.getClass().getName();
            default:
                try {
                    vy vyVarN = this.b.n();
                    ipdVar = Boolean.valueOf(vyVarN.c.delete() && vyVarN.d.delete() && vyVarN.e.delete());
                } catch (Throwable th) {
                    ipdVar = new ipd(th);
                }
                return new kpd(ipdVar);
        }
    }
}
