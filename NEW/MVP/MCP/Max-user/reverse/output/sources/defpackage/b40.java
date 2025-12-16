package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class b40 extends dtf implements sm6 {
    public final /* synthetic */ k18 X;
    public final /* synthetic */ e40 Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b40(k18 k18Var, e40 e40Var, Continuation continuation) {
        super(2, continuation);
        this.X = k18Var;
        this.Y = e40Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((b40) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new b40(this.X, this.Y, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        qqg qqgVar = qqg.a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
            return qqgVar;
        }
        g8j.b(obj);
        k18 k18Var = this.X;
        hbd hbdVar = ((b8a) ((l7a) k18Var.getValue())).R0;
        e40 e40Var = this.Y;
        tw twVar = new tw(1, e40Var);
        this.o = 1;
        Object objD = hbdVar.a.d(new a40(twVar, e40Var, k18Var, 0), this);
        g84 g84Var = g84.a;
        if (objD != g84Var) {
            objD = qqgVar;
        }
        return objD == g84Var ? g84Var : qqgVar;
    }
}
