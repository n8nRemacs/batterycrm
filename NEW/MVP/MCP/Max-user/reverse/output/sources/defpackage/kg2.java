package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class kg2 extends dtf implements sm6 {
    public final /* synthetic */ qg2 X;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kg2(qg2 qg2Var, Continuation continuation) {
        super(2, continuation);
        this.X = qg2Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((kg2) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new kg2(this.X, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) throws Throwable {
        cgc cgcVar;
        qg2 qg2Var = this.X;
        tcf tcfVar = qg2Var.b;
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            boolean z = false;
            if (qg2Var.C) {
                d95 d95VarC = qg2Var.c();
                xec xecVar = (xec) tcfVar.getValue();
                if (xecVar != null && xecVar.a != null) {
                    z = true;
                }
                d95VarC.getClass();
                n5g n5gVar = new n5g(u8b.l);
                o98 o98VarD = ve3.d();
                o98VarD.add(new pq3(r8b.Z, new n5g(u8b.s), 3, 56));
                o98VarD.add(new pq3(r8b.Y, new n5g(u8b.r), 3, 56));
                if (z) {
                    o98VarD.add(new pq3(r8b.W, new n5g(u8b.o), 1, 56));
                }
                o98VarD.add(new pq3(r8b.V, new n5g(mvd.p), 2, 56));
                cgcVar = new cgc(n5gVar, null, ve3.a(o98VarD));
            } else {
                d95 d95VarC2 = qg2Var.c();
                xec xecVar2 = (xec) tcfVar.getValue();
                if (xecVar2 != null && xecVar2.a != null) {
                    z = true;
                }
                d95VarC2.getClass();
                n5g n5gVar2 = new n5g(u8b.m);
                o98 o98VarD2 = ve3.d();
                o98VarD2.add(new pq3(r8b.Z, new n5g(u8b.s), 3, 56));
                o98VarD2.add(new pq3(r8b.Y, new n5g(u8b.r), 3, 56));
                if (z) {
                    o98VarD2.add(new pq3(r8b.W, new n5g(u8b.o), 1, 56));
                }
                o98VarD2.add(new pq3(r8b.V, new n5g(mvd.p), 2, 56));
                cgcVar = new cgc(n5gVar2, null, ve3.a(o98VarD2));
            }
            jve jveVar = qg2Var.d;
            this.o = 1;
            Object objA = jveVar.a(cgcVar, this);
            g84 g84Var = g84.a;
            if (objA == g84Var) {
                return g84Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
        }
        return qqg.a;
    }
}
