package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class jt9 extends dtf implements sm6 {
    public final /* synthetic */ vu9 X;
    public final /* synthetic */ Long Y;
    public final /* synthetic */ String Z;
    public int o;
    public final /* synthetic */ dx0 s0;
    public final /* synthetic */ yw0 t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jt9(vu9 vu9Var, Long l, String str, dx0 dx0Var, yw0 yw0Var, Continuation continuation) {
        super(2, continuation);
        this.X = vu9Var;
        this.Y = l;
        this.Z = str;
        this.s0 = dx0Var;
        this.t0 = yw0Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((jt9) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new jt9(this.X, this.Y, this.Z, this.s0, this.t0, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            fde fdeVar = this.X.w0;
            long jLongValue = this.Y.longValue();
            this.o = 1;
            Object objX = fdeVar.x(jLongValue, this.Z, this.s0, this.t0, this);
            g84 g84Var = g84.a;
            if (objX == g84Var) {
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
