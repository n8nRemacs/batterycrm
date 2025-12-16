package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class u0c extends dtf implements sm6 {
    public final /* synthetic */ x0c X;
    public final /* synthetic */ pb2 Y;
    public final /* synthetic */ long Z;
    public int o;
    public final /* synthetic */ long s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0c(x0c x0cVar, pb2 pb2Var, long j, long j2, Continuation continuation) {
        super(2, continuation);
        this.X = x0cVar;
        this.Y = pb2Var;
        this.Z = j;
        this.s0 = j2;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((u0c) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new u0c(this.X, this.Y, this.Z, this.s0, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            nt2 nt2Var = (nt2) this.X.f.getValue();
            long j = this.Y.a;
            this.o = 1;
            Object objA = nt2Var.a(j, this.Z, this.s0, false, this);
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
