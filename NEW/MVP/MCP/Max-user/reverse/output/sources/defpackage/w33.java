package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class w33 extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public int o;

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((w33) l((z26) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        w33 w33Var = new w33(2, continuation);
        w33Var.X = obj;
        return w33Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            z26 z26Var = (z26) this.X;
            this.o = 1;
            Object objA = z26Var.a(null, this);
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
