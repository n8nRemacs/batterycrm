package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class px9 extends dtf implements sm6 {
    public final /* synthetic */ ay9 X;
    public final /* synthetic */ pb2 Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public px9(pb2 pb2Var, ay9 ay9Var, Continuation continuation) {
        super(2, continuation);
        this.X = ay9Var;
        this.Y = pb2Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((px9) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new px9(this.Y, this.X, continuation);
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
        qvf qvfVar = (qvf) this.X.l.getValue();
        rf2 rf2Var = this.Y.b;
        long j = rf2Var.a;
        long j2 = rf2Var.g0;
        this.o = 1;
        Object objA = qvfVar.a(j, j2, this);
        g84 g84Var = g84.a;
        return objA == g84Var ? g84Var : objA;
    }
}
