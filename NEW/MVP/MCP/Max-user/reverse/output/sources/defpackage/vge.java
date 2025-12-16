package defpackage;

/* loaded from: classes2.dex */
public final /* synthetic */ class vge implements p6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ wge b;

    public /* synthetic */ vge(wge wgeVar, int i) {
        this.a = i;
        this.b = wgeVar;
    }

    @Override // defpackage.p6
    public final void run() {
        switch (this.a) {
            case 0:
                wge wgeVar = this.b;
                wgeVar.p().c(wgeVar.b);
                break;
            default:
                this.b.v();
                break;
        }
    }
}
