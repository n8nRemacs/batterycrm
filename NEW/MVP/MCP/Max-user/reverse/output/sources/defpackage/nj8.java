package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class nj8 extends dtf implements sm6 {
    public final /* synthetic */ sj8 X;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nj8(sj8 sj8Var, Continuation continuation) {
        super(2, continuation);
        this.X = sj8Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((nj8) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new nj8(this.X, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            bj8 bj8Var = new bj8(this.X, 2);
            this.o = 1;
            Object objI = vmi.i(bd5.a, bj8Var, this);
            g84 g84Var = g84.a;
            if (objI == g84Var) {
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
