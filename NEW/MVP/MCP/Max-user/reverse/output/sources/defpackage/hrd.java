package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class hrd extends dtf implements sm6 {
    public final /* synthetic */ jrd X;
    public final /* synthetic */ long Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hrd(jrd jrdVar, long j, Continuation continuation) {
        super(2, continuation);
        this.X = jrdVar;
        this.Y = j;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((hrd) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new hrd(this.X, this.Y, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            jrd jrdVar = this.X;
            m03 m03VarC = jrdVar.c();
            lq9 lq9Var = (lq9) jrdVar.d.getValue();
            zxd zxdVarD = jrdVar.d();
            this.o = 1;
            Object objA = i8j.a(m03VarC.a, new j03(m03VarC, this.Y, lq9Var, zxdVarD), this);
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
