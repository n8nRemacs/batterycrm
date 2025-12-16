package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class p72 implements a4h {
    public final /* synthetic */ int a;
    public final /* synthetic */ su6 b;

    public /* synthetic */ p72(su6 su6Var, int i) {
        this.a = i;
        this.b = su6Var;
    }

    @Override // defpackage.a4h
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.flush();
                break;
            default:
                this.b.c();
                break;
        }
    }
}
