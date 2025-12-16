package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ovb extends dtf implements sm6 {
    public int X;
    public final /* synthetic */ pvb Y;
    public tcf o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ovb(pvb pvbVar, Continuation continuation) {
        super(2, continuation);
        this.Y = pvbVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((ovb) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new ovb(this.Y, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        tcf tcfVar;
        int i = this.X;
        if (i == 0) {
            g8j.b(obj);
            pvb pvbVar = this.Y;
            tcfVar = pvbVar.d;
            l24 l24Var = (l24) pvbVar.a.getValue();
            this.o = tcfVar;
            this.X = 1;
            obj = l24Var.d();
            g84 g84Var = g84.a;
            if (obj == g84Var) {
                return g84Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            tcfVar = this.o;
            g8j.b(obj);
        }
        tcfVar.setValue(Boolean.valueOf(((Number) obj).intValue() == 0));
        return qqg.a;
    }
}
