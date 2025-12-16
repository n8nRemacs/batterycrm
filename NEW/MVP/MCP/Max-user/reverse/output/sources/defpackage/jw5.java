package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class jw5 extends dtf implements sm6 {
    public final /* synthetic */ kw5 X;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jw5(kw5 kw5Var, Continuation continuation) {
        super(2, continuation);
        this.X = kw5Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((jw5) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new jw5(this.X, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        kw5 kw5Var = this.X;
        String str = kw5Var.d;
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            if (str != null) {
                htg htgVar = (htg) kw5Var.u0.getValue();
                long j = kw5Var.b;
                long j2 = kw5Var.c;
                this.o = 1;
                Object objA = htgVar.a(j, j2, str, p10.o, this);
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
        dv5 dv5Var = (dv5) kw5Var.t0.getValue();
        long j3 = kw5Var.c;
        if (str == null) {
            str = "";
        }
        dv5Var.a(new m2g(j3, str, 0L, 0L, 0L, 0L, kw5Var.Y, true, false, kw5Var.o, kw5Var.X, 0, false, false, "FILE"));
        return qqg.a;
    }
}
