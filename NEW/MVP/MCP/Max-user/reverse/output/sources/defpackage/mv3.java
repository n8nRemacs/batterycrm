package defpackage;

/* loaded from: classes2.dex */
public final /* synthetic */ class mv3 implements p6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ mv3(Object obj, long j, int i) {
        this.a = i;
        this.c = obj;
        this.b = j;
    }

    @Override // defpackage.p6
    public final void run() {
        switch (this.a) {
            case 0:
                qv3 qv3Var = (qv3) this.c;
                qv3Var.c(this.b, new t00(qv3Var.g.a.j(), 1));
                break;
            default:
                ((gs5) this.c).a.d(5, this.b);
                break;
        }
    }
}
