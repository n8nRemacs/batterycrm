package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class jr0 extends dtf implements sm6 {
    public final /* synthetic */ rr0 X;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jr0(rr0 rr0Var, Continuation continuation) {
        super(2, continuation);
        this.X = rr0Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((jr0) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new jr0(this.X, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            i6 i6Var = new i6(16, this.X);
            this.o = 1;
            Object objI = vmi.i(bd5.a, i6Var, this);
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
