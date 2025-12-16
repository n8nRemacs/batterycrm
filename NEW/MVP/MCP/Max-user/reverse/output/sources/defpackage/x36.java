package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class x36 extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ long Y;
    public final /* synthetic */ x26 Z;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x36(long j, x26 x26Var, Continuation continuation) {
        super(2, continuation);
        this.Y = j;
        this.Z = x26Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((x36) l((sac) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        x36 x36Var = new x36(this.Y, this.Z, continuation);
        x36Var.X = obj;
        return x36Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            sac sacVar = (sac) this.X;
            w36 w36Var = new w36(this.Y, this.Z, sacVar, null);
            this.o = 1;
            Object objD = d7j.d(w36Var, this);
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
