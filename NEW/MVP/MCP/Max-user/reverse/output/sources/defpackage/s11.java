package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class s11 extends dtf implements sm6 {
    public final /* synthetic */ v11 X;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s11(v11 v11Var, Continuation continuation) {
        super(2, continuation);
        this.X = v11Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((s11) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new s11(this.X, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            v11 v11Var = this.X;
            xs xsVar = (xs) v11Var.Z.get();
            this.o = 1;
            Object objA = v11.a(v11Var, xsVar, this);
            g84 g84Var = g84.a;
            if (objA == g84Var) {
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
