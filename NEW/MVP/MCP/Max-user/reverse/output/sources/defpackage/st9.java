package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class st9 extends dtf implements sm6 {
    public final /* synthetic */ vu9 X;
    public final /* synthetic */ long Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public st9(vu9 vu9Var, long j, Continuation continuation) {
        super(2, continuation);
        this.X = vu9Var;
        this.Y = j;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((st9) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new st9(this.X, this.Y, continuation);
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
        gx9 gx9Var = (gx9) this.X.I0.getValue();
        this.o = 1;
        Object objJ = gx9Var.a.j(this.Y, this);
        g84 g84Var = g84.a;
        return objJ == g84Var ? g84Var : objJ;
    }
}
