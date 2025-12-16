package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class eg2 extends dtf implements sm6 {
    public final /* synthetic */ qg2 X;
    public final /* synthetic */ boolean Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eg2(qg2 qg2Var, boolean z, Continuation continuation) {
        super(2, continuation);
        this.X = qg2Var;
        this.Y = z;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((eg2) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new eg2(this.X, this.Y, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) throws Throwable {
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            qg2 qg2Var = this.X;
            boolean z = qg2Var.C;
            long j = qg2Var.n;
            boolean z2 = z && qg2Var.D;
            ((c6i) qg2Var.u.getValue()).b(new kge(j, this.Y));
            if (z2) {
                jve jveVar = qg2Var.d;
                xfc xfcVar = new xfc(j);
                this.o = 1;
                Object objA = jveVar.a(xfcVar, this);
                g84 g84Var = g84.a;
                if (objA == g84Var) {
                    return g84Var;
                }
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
