package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ye9 extends dtf implements sm6 {
    public final /* synthetic */ hf9 X;
    public final /* synthetic */ pb2 Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ye9(hf9 hf9Var, pb2 pb2Var, Continuation continuation) {
        super(2, continuation);
        this.X = hf9Var;
        this.Y = pb2Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((ye9) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new ye9(this.X, this.Y, continuation);
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
        ut6 ut6Var = (ut6) this.X.v0.getValue();
        long j = this.Y.b.a;
        this.o = 1;
        Object objA = ut6Var.a(j, br2.MEMBER, 0L, null, this);
        g84 g84Var = g84.a;
        return objA == g84Var ? g84Var : objA;
    }
}
