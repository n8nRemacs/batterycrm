package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class c77 extends dtf implements sm6 {
    public final /* synthetic */ bs4 X;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c77(bs4 bs4Var, Continuation continuation) {
        super(2, continuation);
        this.X = bs4Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((c77) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new c77(this.X, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
            return obj;
        }
        g8j.b(obj);
        this.o = 1;
        Object objC = this.X.c(this);
        g84 g84Var = g84.a;
        return objC == g84Var ? g84Var : objC;
    }
}
