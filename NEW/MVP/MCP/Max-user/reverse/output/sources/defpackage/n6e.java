package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class n6e extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ l7e Y;
    public final /* synthetic */ x26 Z;
    public int o;
    public final /* synthetic */ x26 s0;
    public final /* synthetic */ int t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n6e(l7e l7eVar, x26 x26Var, x26 x26Var2, int i, Continuation continuation) {
        super(2, continuation);
        this.Y = l7eVar;
        this.Z = x26Var;
        this.s0 = x26Var2;
        this.t0 = i;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((n6e) l((z26) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        n6e n6eVar = new n6e(this.Y, this.Z, this.s0, this.t0, continuation);
        n6eVar.X = obj;
        return n6eVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            z26 z26Var = (z26) this.X;
            uid uidVar = new uid();
            String strB = vid.a(this.Y.getClass()).b();
            fa2 fa2VarE = gw0.E(gw0.m(new z41(this.Z, this.s0, l6e.Z, 3)), new m6e(uidVar, this.Y, this.t0, strB, null));
            this.o = 1;
            Object objD = fa2VarE.d(z26Var, this);
            g84 g84Var = g84.a;
            if (objD == g84Var) {
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
