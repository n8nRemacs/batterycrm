package defpackage;

import java.util.concurrent.atomic.AtomicLong;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class jw3 extends dtf implements sm6 {
    public final /* synthetic */ tw3 X;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jw3(tw3 tw3Var, Continuation continuation) {
        super(2, continuation);
        this.X = tw3Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((jw3) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new jw3(this.X, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        qqg qqgVar = qqg.a;
        tw3 tw3Var = this.X;
        g84 g84Var = g84.a;
        if (i == 0) {
            g8j.b(obj);
            l24 l24Var = (l24) tw3Var.o.getValue();
            long j = tw3Var.n;
            this.o = 1;
            obj = l24Var.b(j, this);
            if (obj != g84Var) {
            }
            return g84Var;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
            return qqgVar;
        }
        g8j.b(obj);
        ku3 ku3Var = (ku3) obj;
        if (ku3Var != null) {
            AtomicLong atomicLong = tw3Var.l;
            hwa hwaVar = (hwa) tw3Var.z.getValue();
            atomicLong.set(hwaVar.u().c(new cld(hwaVar.t().a.k(), ku3Var.a.b.e), false, 0L, (12 & 8) != 0 ? 0 : 1));
            jve jveVar = tw3Var.d;
            dgc dgcVar = new dgc(new n5g(u8b.R), new Integer(yud.n));
            this.o = 2;
            if (jveVar.a(dgcVar, this) == g84Var) {
                return g84Var;
            }
        }
        return qqgVar;
    }
}
