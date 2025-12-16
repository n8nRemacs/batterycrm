package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class j43 extends dtf implements sm6 {
    public final /* synthetic */ k53 X;
    public final /* synthetic */ long Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j43(k53 k53Var, long j, Continuation continuation) {
        super(2, continuation);
        this.X = k53Var;
        this.Y = j;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((j43) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new j43(this.X, this.Y, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        k53 k53Var = this.X;
        if (i == 0) {
            g8j.b(obj);
            yy7[] yy7VarArr = k53.d1;
            w63 w63VarW = k53Var.w();
            this.o = 1;
            obj = w63VarW.p(this.Y, this);
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
        pb2 pb2Var = (pb2) obj;
        if (pb2Var != null) {
            xfh.r(k53Var.T0, a63.M0(a63.c, pb2Var.a));
        }
        return qqg.a;
    }
}
