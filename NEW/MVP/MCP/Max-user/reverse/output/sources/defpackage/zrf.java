package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class zrf implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ csf b;

    public /* synthetic */ zrf(csf csfVar, int i) {
        this.a = i;
        this.b = csfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.a();
                break;
            case 1:
                this.b.b();
                break;
            default:
                csf csfVar = this.b;
                fsf fsfVar = csfVar.r;
                if (fsfVar != null) {
                    fsfVar.l();
                }
                if (csfVar.q == null) {
                    csfVar.p.c();
                    break;
                }
                break;
        }
    }
}
