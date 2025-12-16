package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class w36 extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ long Y;
    public final /* synthetic */ x26 Z;
    public int o;
    public final /* synthetic */ sac s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w36(long j, x26 x26Var, sac sacVar, Continuation continuation) {
        super(2, continuation);
        this.Y = j;
        this.Z = x26Var;
        this.s0 = sacVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((w36) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        w36 w36Var = new w36(this.Y, this.Z, this.s0, continuation);
        w36Var.X = obj;
        return w36Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            f84 f84Var = (f84) this.X;
            long jG = s65.g(this.Y);
            x74 coroutineContext = f84Var.getCoroutineContext();
            v36 v36Var = new v36(new tid(), jG, this.s0, new uid(), f84Var, coroutineContext);
            this.o = 1;
            Object objD = this.Z.d(v36Var, this);
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
