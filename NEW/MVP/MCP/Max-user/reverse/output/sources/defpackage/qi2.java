package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class qi2 extends dtf implements sm6 {
    public final /* synthetic */ ve2 X;
    public final /* synthetic */ long Y;
    public final /* synthetic */ long Z;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qi2(ve2 ve2Var, long j, long j2, Continuation continuation) {
        super(2, continuation);
        this.X = ve2Var;
        this.Y = j;
        this.Z = j2;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((qi2) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new qi2(this.X, this.Y, this.Z, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            pi2 pi2Var = new pi2(0, this.Y, this.Z, this.X);
            this.o = 1;
            Object objI = vmi.i(bd5.a, pi2Var, this);
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
