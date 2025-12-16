package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class amh extends dtf implements sm6 {
    public final /* synthetic */ tmh X;
    public final /* synthetic */ boolean Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amh(tmh tmhVar, Continuation continuation, boolean z) {
        super(2, continuation);
        this.X = tmhVar;
        this.Y = z;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((amh) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new amh(this.X, continuation, this.Y);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) throws Throwable {
        qqg qqgVar = qqg.a;
        g84 g84Var = g84.a;
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            qv7 qv7Var = this.X.m;
            oo0 oo0Var = qv7Var instanceof oo0 ? (oo0) qv7Var : null;
            if (oo0Var == null) {
                qv7 qv7Var2 = this.X.m;
                if (qv7Var2 != null) {
                    qv7Var2.b(new d1());
                }
                this.X.m = null;
                return qqgVar;
            }
            if (this.Y) {
                oo0Var.a(qqgVar);
                jve jveVar = this.X.k;
                slh slhVar = slh.a;
                this.o = 1;
                if (jveVar.a(slhVar, this) == g84Var) {
                    return g84Var;
                }
            } else {
                oo0Var.b(new zmh());
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
        }
        this.X.m = null;
        return qqgVar;
    }
}
