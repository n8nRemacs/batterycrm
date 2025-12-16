package defpackage;

/* loaded from: classes2.dex */
public final /* synthetic */ class pja implements cm6 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ qja b;

    public /* synthetic */ pja(qja qjaVar) {
        this.b = qjaVar;
    }

    @Override // defpackage.cm6
    public final Object invoke() {
        switch (this.a) {
            case 0:
                this.b.a().getClass();
                wqi.c(tfe.class.getName(), "onNotifLocationRequest", new Object[0]);
                break;
            default:
                this.b.a().getClass();
                wqi.c(tfe.class.getName(), "onNotifLocationResponse", new Object[0]);
                break;
        }
        return qqg.a;
    }

    public /* synthetic */ pja(qja qjaVar, rja rjaVar) {
        this.b = qjaVar;
    }
}
