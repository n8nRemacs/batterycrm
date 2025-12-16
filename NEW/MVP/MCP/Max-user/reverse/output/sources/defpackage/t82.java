package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class t82 extends dtf implements sm6 {
    public final /* synthetic */ u82 X;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t82(u82 u82Var, Continuation continuation) {
        super(2, continuation);
        this.X = u82Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((t82) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new t82(this.X, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            i82 i82Var = this.X.b;
            this.o = 1;
            Object objJ = i82Var.j(this);
            g84 g84Var = g84.a;
            if (objJ == g84Var) {
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
