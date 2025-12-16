package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class cf9 extends dtf implements sm6 {
    public final /* synthetic */ hf9 X;
    public final /* synthetic */ pb2 Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cf9(hf9 hf9Var, pb2 pb2Var, Continuation continuation) {
        super(2, continuation);
        this.X = hf9Var;
        this.Y = pb2Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((cf9) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new cf9(this.X, this.Y, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) throws Throwable {
        int i = this.o;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
            return obj;
        }
        g8j.b(obj);
        hf9 hf9Var = this.X;
        et6 et6Var = (et6) hf9Var.w0.getValue();
        long j = this.Y.b.a;
        long j2 = hf9Var.d;
        Integer num = new Integer(((Number) hf9Var.I0.getValue()).intValue());
        this.o = 1;
        Object objA = et6Var.a(j, j2, num, this);
        g84 g84Var = g84.a;
        return objA == g84Var ? g84Var : objA;
    }
}
