package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class rq9 extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ u92 Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rq9(u92 u92Var, Continuation continuation) {
        super(2, continuation);
        this.Y = u92Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((rq9) l((z26) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        rq9 rq9Var = new rq9(this.Y, continuation);
        rq9Var.X = obj;
        return rq9Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            h28 h28Var = new h28((z26) this.X, 24);
            this.o = 1;
            Object objD = this.Y.d(h28Var, this);
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
