package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class x0b extends dtf implements sm6 {
    public final /* synthetic */ y0b X;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0b(y0b y0bVar, Continuation continuation) {
        super(2, continuation);
        this.X = y0bVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((x0b) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new x0b(this.X, continuation);
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
        y0b y0bVar = this.X;
        w63 w63Var = (w63) y0bVar.d.getValue();
        long j = y0bVar.b;
        this.o = 1;
        Object objR = w63Var.r(j, this);
        g84 g84Var = g84.a;
        return objR == g84Var ? g84Var : objR;
    }
}
