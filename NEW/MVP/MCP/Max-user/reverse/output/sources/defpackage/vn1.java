package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class vn1 extends dtf implements sm6 {
    public final /* synthetic */ wo1 X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vn1(wo1 wo1Var, Continuation continuation) {
        super(2, continuation);
        this.X = wo1Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        vn1 vn1Var = (vn1) l((lb) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        vn1Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        vn1 vn1Var = new vn1(this.X, continuation);
        vn1Var.o = obj;
        return vn1Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        ci5 ci5Var = this.X.L0;
        g8j.b(obj);
        lb lbVar = (lb) this.o;
        if (lbVar instanceof bb) {
            xfh.r(ci5Var, en1.b);
        } else if (lbVar instanceof za) {
            xfh.r(ci5Var, en1.c);
        } else if (lbVar instanceof ya) {
            xfh.r(ci5Var, en1.d);
        } else if (lbVar instanceof fb) {
            xfh.r(ci5Var, en1.e);
        } else if (lbVar instanceof xa) {
            xfh.r(ci5Var, en1.f);
        } else if (lbVar instanceof ua) {
            xfh.r(ci5Var, en1.g);
        } else if (lbVar instanceof ta) {
            xfh.r(ci5Var, en1.h);
        } else if (lbVar instanceof cb) {
            xfh.r(ci5Var, en1.i);
        } else if (lbVar instanceof ab) {
            xfh.r(ci5Var, en1.j);
        } else if (lbVar instanceof gb) {
            xfh.r(ci5Var, en1.k);
        } else if (lbVar instanceof hb) {
            xfh.r(ci5Var, en1.l);
        } else if (lbVar instanceof kb) {
            xfh.r(ci5Var, en1.m);
        } else if (lbVar instanceof db) {
            xfh.r(ci5Var, en1.n);
        } else if (lbVar instanceof ib) {
            xfh.r(ci5Var, en1.o);
        } else if (lbVar instanceof va) {
            xfh.r(ci5Var, en1.p);
        } else if (lbVar instanceof wa) {
            xfh.r(ci5Var, en1.A);
        } else if (lbVar instanceof jb) {
            xfh.r(ci5Var, ((jb) lbVar).a ? en1.B : en1.C);
        }
        return qqg.a;
    }
}
