package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class fq6 extends dtf implements sm6 {
    public final /* synthetic */ tq6 X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fq6(tq6 tq6Var, Continuation continuation) {
        super(2, continuation);
        this.X = tq6Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        fq6 fq6Var = (fq6) l((imb) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        fq6Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        fq6 fq6Var = new fq6(this.X, continuation);
        fq6Var.o = obj;
        return fq6Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        imb imbVar = (imb) this.o;
        vo6 vo6Var = (vo6) imbVar.a;
        List list = (List) imbVar.b;
        wqi.c("tq6", "got album and items, items size = " + list.size(), new Object[0]);
        tq6 tq6Var = this.X;
        tq6Var.y0.m(null, Boolean.FALSE);
        tq6Var.A0.setValue(vo6Var);
        tq6Var.v0.m(null, list);
        return qqg.a;
    }
}
