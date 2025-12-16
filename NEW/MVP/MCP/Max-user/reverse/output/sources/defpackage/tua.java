package defpackage;

/* loaded from: classes2.dex */
public final class tua implements em6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ mbd b;

    public /* synthetic */ tua(mbd mbdVar, int i) {
        this.a = i;
        this.b = mbdVar;
    }

    @Override // defpackage.em6
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                try {
                    this.b.d();
                } catch (Throwable unused) {
                }
                break;
            default:
                this.b.d();
                break;
        }
        return qqg.a;
    }
}
