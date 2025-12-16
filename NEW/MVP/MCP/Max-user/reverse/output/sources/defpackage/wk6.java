package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class wk6 extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ long Y;
    public final /* synthetic */ xk6 Z;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wk6(long j, xk6 xk6Var, Continuation continuation) {
        super(2, continuation);
        this.Y = j;
        this.Z = xk6Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((wk6) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        wk6 wk6Var = new wk6(this.Y, this.Z, continuation);
        wk6Var.X = obj;
        return wk6Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        f84 f84Var;
        int i = this.o;
        long j = this.Y;
        if (i == 0) {
            g8j.b(obj);
            f84Var = (f84) this.X;
            this.X = f84Var;
            this.o = 1;
            Object objD = s8j.d(j, this);
            g84 g84Var = g84.a;
            if (objD == g84Var) {
                return g84Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f84Var = (f84) this.X;
            g8j.b(obj);
        }
        if (d7j.f(f84Var)) {
            this.Z.c.invoke(new s65(j));
        }
        return qqg.a;
    }
}
