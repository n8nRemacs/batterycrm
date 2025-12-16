package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class nng extends dtf implements sm6 {
    public final /* synthetic */ sng X;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nng(sng sngVar, Continuation continuation) {
        super(2, continuation);
        this.X = sngVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((nng) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new nng(this.X, continuation);
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
        yy7[] yy7VarArr = sng.x0;
        sng sngVar = this.X;
        klc klcVar = (klc) sngVar.X.getValue();
        long jS = ((w4e) ((pb3) sngVar.o.getValue())).s();
        this.o = 1;
        Object objA = klcVar.a(jS, this);
        g84 g84Var = g84.a;
        return objA == g84Var ? g84Var : objA;
    }
}
