package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class g46 extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ x26 Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g46(x26 x26Var, Continuation continuation) {
        super(2, continuation);
        this.Y = x26Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((g46) l((sac) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        g46 g46Var = new g46(this.Y, continuation);
        g46Var.X = obj;
        return g46Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            g36 g36Var = new g36((sac) this.X, 2);
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
        return qqg.a;
    }
}
