package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class kw3 extends dtf implements sm6 {
    public final /* synthetic */ tw3 X;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kw3(tw3 tw3Var, Continuation continuation) {
        super(2, continuation);
        this.X = tw3Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((kw3) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new kw3(this.X, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) throws Throwable {
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            tw3 tw3Var = this.X;
            jve jveVar = tw3Var.d;
            d95 d95VarC = tw3Var.c();
            xec xecVar = (xec) tw3Var.b.getValue();
            boolean z = false;
            if (xecVar != null && xecVar.a != null) {
                z = true;
            }
            d95VarC.getClass();
            n5g n5gVar = new n5g(u8b.n);
            o98 o98VarD = ve3.d();
            o98VarD.add(new pq3(r8b.X, new n5g(u8b.b1), 3, 56));
            o98VarD.add(new pq3(r8b.Z, new n5g(u8b.s), 3, 56));
            o98VarD.add(new pq3(r8b.Y, new n5g(u8b.r), 3, 56));
            if (z) {
                o98VarD.add(new pq3(r8b.W, new n5g(u8b.o), 1, 56));
            }
            o98VarD.add(new pq3(r8b.V, new n5g(mvd.p), 2, 56));
            cgc cgcVar = new cgc(n5gVar, null, ve3.a(o98VarD));
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
