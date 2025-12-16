package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class d30 extends dtf implements sm6 {
    public final /* synthetic */ e30 X;
    public final /* synthetic */ long Y;
    public final /* synthetic */ l09 Z;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d30(e30 e30Var, long j, l09 l09Var, Continuation continuation) {
        super(2, continuation);
        this.X = e30Var;
        this.Y = j;
        this.Z = l09Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((d30) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new d30(this.X, this.Y, this.Z, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        Object objI;
        g84 g84Var = g84.a;
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            z74 z74VarB = ((q2b) ((lzf) this.X.g.getValue())).b();
            c30 c30Var = new c30(this.X, this.Y, null);
            this.o = 1;
            objI = svi.i(z74VarB, c30Var, this);
            if (objI == g84Var) {
                return g84Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
            objI = obj;
        }
        si9 si9Var = (si9) objI;
        if (si9Var != null) {
            this.X.k = this.Y;
            this.X.l = si9Var.Z;
            e30 e30Var = this.X;
            e30Var.s(this.Y, this.Z, e30Var.l);
        } else {
            this.X.s(this.Y, this.Z, -1L);
        }
        return qqg.a;
    }
}
