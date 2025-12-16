package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class bd2 extends dtf implements sm6 {
    public final /* synthetic */ sd2 X;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bd2(sd2 sd2Var, Continuation continuation) {
        super(2, continuation);
        this.X = sd2Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((bd2) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new bd2(this.X, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) throws Throwable {
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            sd2 sd2Var = this.X;
            jve jveVar = sd2Var.f;
            yy7[] yy7VarArr = sd2.B;
            o98 o98VarD = ve3.d();
            x82 x82Var = (x82) sd2Var.i.getValue();
            if ((x82Var != null ? x82Var.b : null) == w82.b) {
                o98VarD.add(new b44(r8b.z0, new n5g(u8b.y1), Integer.valueOf(w9b.V), Integer.valueOf(yud.I1), Integer.valueOf(w9b.Q)));
            }
            adc adcVar = new adc(ve3.a(o98VarD));
            this.o = 1;
            Object objA = jveVar.a(adcVar, this);
            g84 g84Var = g84.a;
            if (objA == g84Var) {
                return g84Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
        }
        return qqg.a;
    }
}
