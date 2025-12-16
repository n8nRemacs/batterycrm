package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class sw3 extends dtf implements sm6 {
    public final /* synthetic */ tw3 X;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sw3(tw3 tw3Var, Continuation continuation) {
        super(2, continuation);
        this.X = tw3Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((sw3) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new sw3(this.X, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        qqg qqgVar = qqg.a;
        tw3 tw3Var = this.X;
        if (i == 0) {
            g8j.b(obj);
            if (!tw3Var.B.get()) {
                return qqgVar;
            }
            au6 au6Var = (au6) tw3Var.A.getValue();
            this.o = 1;
            obj = ((m1g) ((p8b) au6Var.a.getValue()).a.getValue()).e(new zf8(), this);
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
        tw3.p(tw3Var, ((fld) obj).c);
        return qqgVar;
    }
}
