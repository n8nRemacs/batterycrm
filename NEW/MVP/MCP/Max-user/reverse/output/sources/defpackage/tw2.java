package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class tw2 extends dtf implements sm6 {
    public final /* synthetic */ zx2 X;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tw2(zx2 zx2Var, Continuation continuation) {
        super(2, continuation);
        this.X = zx2Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((tw2) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new tw2(this.X, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        qqg qqgVar = qqg.a;
        zx2 zx2Var = this.X;
        if (i == 0) {
            g8j.b(obj);
            pb2 pb2Var = (pb2) zx2Var.a1.a.getValue();
            if (pb2Var != null) {
                long j = pb2Var.a;
                gaf gafVar = (gaf) zx2Var.C0.getValue();
                String str = zx2Var.b;
                if (str == null || str.length() == 0) {
                    str = null;
                }
                this.o = 1;
                Object objA = gafVar.a(j, str, this);
                g84 g84Var = g84.a;
                if (objA == g84Var) {
                    return g84Var;
                }
            }
            return qqgVar;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        g8j.b(obj);
        zx2Var.b = null;
        return qqgVar;
    }
}
