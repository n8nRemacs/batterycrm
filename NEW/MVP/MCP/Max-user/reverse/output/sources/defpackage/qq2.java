package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class qq2 extends dtf implements sm6 {
    public final /* synthetic */ yq2 X;
    public final /* synthetic */ long Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qq2(yq2 yq2Var, long j, Continuation continuation) {
        super(2, continuation);
        this.X = yq2Var;
        this.Y = j;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((qq2) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new qq2(this.X, this.Y, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g2h g2hVar;
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
        yy7[] yy7VarArr = yq2.u1;
        yq2 yq2Var = this.X;
        j09 j09VarE = yq2Var.E();
        h09 h09Var = j09VarE instanceof h09 ? (h09) j09VarE : null;
        if (h09Var != null && (g2hVar = ((lp2) yq2Var.d1.getValue()).b) != null) {
            yxd yxdVar = (yxd) yq2Var.C0.getValue();
            long j = h09Var.a;
            String str = h09Var.o;
            long duration = g2hVar.getDuration();
            boolean zG = g2hVar.g();
            this.o = 1;
            Object objA = yxdVar.a(j, str, this.Y, duration, zG, this);
            g84 g84Var = g84.a;
            if (objA == g84Var) {
                return g84Var;
            }
        }
        return qqgVar;
    }
}
