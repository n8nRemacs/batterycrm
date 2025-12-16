package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class o36 extends dtf implements sm6 {
    public final /* synthetic */ x26 X;
    public final /* synthetic */ sac Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o36(x26 x26Var, sac sacVar, Continuation continuation) {
        super(2, continuation);
        this.X = x26Var;
        this.Y = sacVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((o36) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new o36(this.X, this.Y, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            g36 g36Var = new g36(this.Y, 1);
            this.o = 1;
            Object objD = this.X.d(g36Var, this);
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
