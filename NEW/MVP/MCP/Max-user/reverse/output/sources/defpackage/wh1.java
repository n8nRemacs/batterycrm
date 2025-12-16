package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class wh1 extends dtf implements sm6 {
    public final /* synthetic */ ci1 X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wh1(ci1 ci1Var, Continuation continuation) {
        super(2, continuation);
        this.X = ci1Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        wh1 wh1Var = (wh1) l((lb) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        wh1Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        wh1 wh1Var = new wh1(this.X, continuation);
        wh1Var.o = obj;
        return wh1Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        ci5 ci5Var = this.X.D0;
        g8j.b(obj);
        lb lbVar = (lb) this.o;
        if (lbVar instanceof gb) {
            xfh.r(ci5Var, en1.k);
        } else if (lbVar instanceof hb) {
            xfh.r(ci5Var, en1.l);
        } else if (lbVar instanceof kb) {
            xfh.r(ci5Var, en1.m);
        } else if (lbVar instanceof db) {
            xfh.r(ci5Var, en1.n);
        } else if (lbVar instanceof ib) {
            xfh.r(ci5Var, en1.o);
        }
        return qqg.a;
    }
}
