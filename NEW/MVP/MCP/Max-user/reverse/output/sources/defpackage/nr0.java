package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class nr0 extends dtf implements sm6 {
    public final /* synthetic */ rr0 X;
    public final /* synthetic */ long Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nr0(rr0 rr0Var, long j, Continuation continuation) {
        super(2, continuation);
        this.X = rr0Var;
        this.Y = j;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((nr0) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new nr0(this.X, this.Y, continuation);
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
        kr0 kr0Var = new kr0(this.X, this.Y, 1);
        this.o = 1;
        Object objI = vmi.i(bd5.a, kr0Var, this);
        g84 g84Var = g84.a;
        return objI == g84Var ? g84Var : objI;
    }
}
