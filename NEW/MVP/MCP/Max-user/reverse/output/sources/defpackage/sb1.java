package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class sb1 extends dtf implements sm6 {
    public int o;

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((sb1) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new sb1(2, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            bia biaVar = bia.a;
            rb1 rb1Var = new rb1(2, null);
            this.o = 1;
            Object objI = svi.i(biaVar, rb1Var, this);
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
