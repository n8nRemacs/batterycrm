package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class wzf extends dtf implements sm6 {
    public final /* synthetic */ xzf X;
    public final /* synthetic */ double Y;
    public final /* synthetic */ double Z;
    public int o;
    public final /* synthetic */ double s0;
    public final /* synthetic */ double t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wzf(xzf xzfVar, double d, double d2, double d3, double d4, Continuation continuation) {
        super(2, continuation);
        this.X = xzfVar;
        this.Y = d;
        this.Z = d2;
        this.s0 = d3;
        this.t0 = d4;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((wzf) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new wzf(this.X, this.Y, this.Z, this.s0, this.t0, continuation);
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
        Object objB = this.X.b(this.Y, this.Z, this.s0, this.t0, this);
        g84 g84Var = g84.a;
        return objB == g84Var ? g84Var : objB;
    }
}
