package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class yrf implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ dsf b;

    public /* synthetic */ yrf(dsf dsfVar, int i) {
        this.a = i;
        this.b = dsfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ayi.d().execute(new yrf(this.b, 1));
                break;
            default:
                dsf dsfVar = this.b;
                if (!dsfVar.n) {
                    dsfVar.e();
                    break;
                }
                break;
        }
    }
}
