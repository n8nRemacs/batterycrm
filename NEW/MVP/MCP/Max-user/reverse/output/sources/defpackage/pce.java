package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class pce extends dtf implements sm6 {
    public final /* synthetic */ fde X;
    public final /* synthetic */ yyb Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pce(fde fdeVar, yyb yybVar, Continuation continuation) {
        super(2, continuation);
        this.X = fdeVar;
        this.Y = yybVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((pce) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new pce(this.X, this.Y, continuation);
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
        w63 w63Var = (w63) ((k18) this.X.b).getValue();
        long j = this.Y.a;
        this.o = 1;
        Object objP = w63Var.p(j, this);
        g84 g84Var = g84.a;
        return objP == g84Var ? g84Var : objP;
    }
}
