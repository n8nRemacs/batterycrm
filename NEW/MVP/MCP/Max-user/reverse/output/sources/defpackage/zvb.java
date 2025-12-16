package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class zvb extends dtf implements sm6 {
    public double X;
    public int Y;
    public /* synthetic */ Object Z;
    public double o;
    public final /* synthetic */ gwb s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zvb(gwb gwbVar, Continuation continuation) {
        super(2, continuation);
        this.s0 = gwbVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((zvb) l((imb) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        zvb zvbVar = new zvb(this.s0, continuation);
        zvbVar.Z = obj;
        return zvbVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        double d;
        double d2;
        Object objB;
        int i = this.Y;
        if (i == 0) {
            g8j.b(obj);
            imb imbVar = (imb) this.Z;
            double dDoubleValue = ((Number) imbVar.a).doubleValue();
            double dDoubleValue2 = ((Number) imbVar.b).doubleValue();
            gwb gwbVar = this.s0;
            yvb yvbVar = (yvb) gwbVar.Z.a.getValue();
            tcf tcfVar = gwbVar.Y;
            tcfVar.m(null, yvb.a((yvb) tcfVar.getValue(), null, null, null, null, null, null, true, 63));
            xzf xzfVar = (xzf) gwbVar.c.getValue();
            Double d3 = yvbVar.a;
            double dDoubleValue3 = d3 != null ? d3.doubleValue() : 0.0d;
            Double d4 = yvbVar.b;
            double dDoubleValue4 = d4 != null ? d4.doubleValue() : 0.0d;
            this.o = dDoubleValue;
            this.X = dDoubleValue2;
            this.Y = 1;
            d = dDoubleValue;
            d2 = dDoubleValue2;
            objB = xzfVar.b(d, d2, dDoubleValue3, dDoubleValue4, this);
            g84 g84Var = g84.a;
            if (objB == g84Var) {
                return g84Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            double d5 = this.X;
            double d6 = this.o;
            g8j.b(obj);
            d2 = d5;
            d = d6;
            objB = obj;
        }
        return new cjg(new Double(d), new Double(d2), (String) objB);
    }
}
