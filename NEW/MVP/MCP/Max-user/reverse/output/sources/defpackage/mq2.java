package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class mq2 extends dtf implements sm6 {
    public final /* synthetic */ yq2 X;
    public final /* synthetic */ fh2 Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mq2(yq2 yq2Var, fh2 fh2Var, Continuation continuation) {
        super(2, continuation);
        this.X = yq2Var;
        this.Y = fh2Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((mq2) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new mq2(this.X, this.Y, continuation);
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
        hwa hwaVar = this.X.u0;
        this.o = 1;
        Object objF = hwaVar.F(this.Y, this);
        g84 g84Var = g84.a;
        return objF == g84Var ? g84Var : objF;
    }
}
