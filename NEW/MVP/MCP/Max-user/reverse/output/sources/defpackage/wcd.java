package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class wcd extends dtf implements sm6 {
    public final /* synthetic */ vcd X;
    public final /* synthetic */ pb2 Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wcd(vcd vcdVar, pb2 pb2Var, Continuation continuation) {
        super(2, continuation);
        this.X = vcdVar;
        this.Y = pb2Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((wcd) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new wcd(this.X, this.Y, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            ve2 ve2Var = this.X.a;
            long j = this.Y.a;
            this.o = 1;
            ve2Var.getClass();
            Object objF = si2.f(ve2Var, j, 0L, this);
            g84 g84Var = g84.a;
            if (objF == g84Var) {
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
