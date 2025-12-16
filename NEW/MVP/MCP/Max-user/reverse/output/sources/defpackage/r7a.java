package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class r7a extends dtf implements sm6 {
    public final /* synthetic */ b8a X;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r7a(b8a b8aVar, Continuation continuation) {
        super(2, continuation);
        this.X = b8aVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((r7a) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new r7a(this.X, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            long j = b8a.T0;
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
            g8j.b(obj);
        }
        int i2 = b8a.U0;
        this.X.i(false);
        return qqg.a;
    }
}
