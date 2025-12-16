package defpackage;

/* loaded from: classes2.dex */
public final /* synthetic */ class hdb implements cm6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ kdb b;

    public /* synthetic */ hdb(kdb kdbVar, int i) {
        this.a = i;
        this.b = kdbVar;
    }

    @Override // defpackage.cm6
    public final Object invoke() {
        switch (this.a) {
            case 0:
                this.b.invalidate();
                break;
            default:
                idb idbVar = this.b.u0;
                if (idbVar != null) {
                    ((dz6) ((xt4) idbVar).b).F0.stop();
                }
                break;
        }
        return qqg.a;
    }
}
