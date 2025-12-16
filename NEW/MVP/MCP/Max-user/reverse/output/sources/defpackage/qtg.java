package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class qtg extends dtf implements sm6 {
    public final /* synthetic */ rtg X;
    public final /* synthetic */ boolean Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qtg(rtg rtgVar, boolean z, Continuation continuation) {
        super(2, continuation);
        this.X = rtgVar;
        this.Y = z;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((qtg) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new qtg(this.X, this.Y, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        rtg rtgVar = this.X;
        if (i == 0) {
            g8j.b(obj);
            hwa hwaVar = (hwa) rtgVar.a.getValue();
            oxg oxgVar = new oxg();
            oxgVar.x = Boolean.valueOf(this.Y);
            fh2 fh2Var = new fh2(null, 0L, new po3(null, new qxg(oxgVar), 23), false);
            this.o = 1;
            obj = hwaVar.F(fh2Var, this);
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
        qxg qxgVar = ((do3) obj).d;
        if (qxgVar == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        ((sxg) rtgVar.b.getValue()).t(qxgVar);
        return qqg.a;
    }
}
