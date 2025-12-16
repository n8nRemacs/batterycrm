package defpackage;

import java.util.Collections;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class rb1 extends dtf implements sm6 {
    public int o;

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((rb1) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new rb1(2, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            this.o = 1;
            Object objC = s8j.c(300L, this);
            g84 g84Var = g84.a;
            if (objC == g84Var) {
                return g84Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
        }
        uh7 uh7VarG = t1b.a.g();
        if (uh7VarG != null) {
            uh7VarG.f(Collections.singleton(new th7(rh7.s0, 1)), f1e.CALL);
        }
        return qqg.a;
    }
}
