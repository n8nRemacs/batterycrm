package defpackage;

import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class lra extends k3 {
    public final /* synthetic */ int b;
    public final j0e c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lra(vqa vqaVar, j0e j0eVar) {
        super(vqaVar);
        this.b = 1;
        this.c = j0eVar;
    }

    @Override // defpackage.vqa
    public final void o(vta vtaVar) {
        switch (this.b) {
            case 0:
                yee yeeVar = new yee(vtaVar);
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                this.a.a(new kra(yeeVar, this.c.a()));
                break;
            case 1:
                qu1 qu1Var = new qu1(vtaVar);
                vtaVar.c(qu1Var);
                ty4.h(qu1Var, this.c.b(new yn6(this, qu1Var, false, 23)));
                break;
            default:
                TimeUnit timeUnit2 = TimeUnit.SECONDS;
                this.a.a(new pta(vtaVar, this.c.a()));
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lra(lqc lqcVar, j0e j0eVar, int i) {
        super(lqcVar);
        this.b = i;
        switch (i) {
            case 2:
                TimeUnit timeUnit = TimeUnit.SECONDS;
                super(lqcVar);
                this.c = j0eVar;
                break;
            default:
                TimeUnit timeUnit2 = TimeUnit.MILLISECONDS;
                this.c = j0eVar;
                break;
        }
    }
}
