package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class fk extends dtf implements sm6 {
    public final /* synthetic */ boolean X;
    public final /* synthetic */ gk o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fk(gk gkVar, boolean z, Continuation continuation) {
        super(2, continuation);
        this.o = gkVar;
        this.X = z;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        fk fkVar = (fk) l((f84) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        fkVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new fk(this.o, this.X, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        gk gkVar = this.o;
        ij2 ij2Var = (ij2) gkVar.d.getValue();
        ij2Var.A.i(-1);
        ij2Var.C.i(-1);
        ((c7c) gkVar.b.getValue()).a();
        ((w63) gkVar.c.getValue()).i().X();
        ((ej0) gkVar.e.getValue()).a(q03.a);
        if (this.X) {
            ((wj) gkVar.f.getValue()).k();
        }
        return qqg.a;
    }
}
