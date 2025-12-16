package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class h36 extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ x26 Y;
    public final /* synthetic */ rt7 Z;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h36(x26 x26Var, rt7 rt7Var, Continuation continuation) {
        super(2, continuation);
        this.Y = x26Var;
        this.Z = rt7Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((h36) l((sac) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        h36 h36Var = new h36(this.Y, this.Z, continuation);
        h36Var.X = obj;
        return h36Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            g36 g36Var = new g36((sac) this.X, 0);
            this.o = 1;
            Object objD = this.Y.d(g36Var, this);
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
        this.Z.D();
        return qqg.a;
    }
}
