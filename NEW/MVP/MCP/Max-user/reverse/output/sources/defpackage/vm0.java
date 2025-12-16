package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class vm0 extends dtf implements sm6 {
    public final /* synthetic */ Object X;
    public final /* synthetic */ an0 Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vm0(Object obj, Continuation continuation, an0 an0Var) {
        super(2, continuation);
        this.X = obj;
        this.Y = an0Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((vm0) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new vm0(this.X, continuation, this.Y);
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
        long jLongValue = ((Number) this.X).longValue();
        l24 l24Var = (l24) this.Y.e.getValue();
        this.o = 1;
        Comparable comparableB = l24Var.b(jLongValue, this);
        g84 g84Var = g84.a;
        return comparableB == g84Var ? g84Var : comparableB;
    }
}
