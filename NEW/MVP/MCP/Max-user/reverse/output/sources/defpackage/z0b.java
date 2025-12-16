package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class z0b extends dtf implements sm6 {
    public final /* synthetic */ a1b X;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0b(a1b a1bVar, Continuation continuation) {
        super(2, continuation);
        this.X = a1bVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((z0b) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new z0b(this.X, continuation);
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
        a1b a1bVar = this.X;
        w63 w63Var = (w63) a1bVar.c.getValue();
        long j = a1bVar.b;
        this.o = 1;
        Object objR = w63Var.r(j, this);
        g84 g84Var = g84.a;
        return objR == g84Var ? g84Var : objR;
    }
}
