package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class xs1 extends dtf implements sm6 {
    public final /* synthetic */ at1 X;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xs1(at1 at1Var, Continuation continuation) {
        super(2, continuation);
        this.X = at1Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((xs1) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new xs1(this.X, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            this.o = 1;
            obj = at1.a(this.X, this);
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
        ku3 ku3Var = (ku3) obj;
        long jP = ku3Var.p();
        String strE = ku3Var.e();
        if (strE == null) {
            strE = "";
        }
        return new kxg(jP, strE, ku3Var.o(), ku3Var.B(), ku3Var.r(il0.d));
    }
}
