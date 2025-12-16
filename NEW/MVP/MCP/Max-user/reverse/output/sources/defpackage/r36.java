package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class r36 extends dtf implements sm6 {
    public final /* synthetic */ x26 X;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r36(x26 x26Var, Continuation continuation) {
        super(2, continuation);
        this.X = x26Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((r36) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new r36(this.X, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            this.o = 1;
            Object objG = gw0.g(this.X, this);
            g84 g84Var = g84.a;
            if (objG == g84Var) {
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
