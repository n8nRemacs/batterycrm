package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class uke extends dtf implements sm6 {
    public final /* synthetic */ ele X;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uke(ele eleVar, Continuation continuation) {
        super(2, continuation);
        this.X = eleVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((uke) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new uke(this.X, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        ele eleVar = this.X;
        if (i == 0) {
            g8j.b(obj);
            os6 os6Var = eleVar.b;
            this.o = 1;
            obj = os6Var.c(this);
            g84 g84Var = g84.a;
            if (obj == g84Var) {
                return g84Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
        }
        xfh.r(eleVar.C0, new xoe((String) obj, new n5g(pbb.w)));
        return qqg.a;
    }
}
