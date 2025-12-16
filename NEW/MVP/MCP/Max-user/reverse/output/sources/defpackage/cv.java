package defpackage;

/* loaded from: classes2.dex */
public final /* synthetic */ class cv implements p6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ul2 b;

    public /* synthetic */ cv(ul2 ul2Var, int i) {
        this.a = i;
        this.b = ul2Var;
    }

    @Override // defpackage.p6
    public final void run() {
        switch (this.a) {
            case 0:
                ul2 ul2Var = this.b;
                synchronized (ul2Var.s0) {
                }
                ul2Var.d.b(new mc(ul2Var));
                break;
            default:
                ul2 ul2Var2 = this.b;
                synchronized (ul2Var2.Z) {
                }
                synchronized (ul2Var2.t0) {
                }
                synchronized (ul2Var2.s0) {
                }
                ul2Var2.d.b(new mc(ul2Var2));
                break;
        }
    }
}
