package defpackage;

import java.util.concurrent.atomic.AtomicLong;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class jg2 extends dtf implements sm6 {
    public int X;
    public final /* synthetic */ qg2 Y;
    public AtomicLong o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jg2(qg2 qg2Var, Continuation continuation) {
        super(2, continuation);
        this.Y = qg2Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((jg2) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new jg2(this.Y, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        AtomicLong atomicLong;
        int i = this.X;
        qqg qqgVar = qqg.a;
        qg2 qg2Var = this.Y;
        g84 g84Var = g84.a;
        if (i == 0) {
            g8j.b(obj);
            pb2 pb2VarP = qg2Var.p();
            if (pb2VarP != null) {
                atomicLong = qg2Var.l;
                ykd ykdVar = (ykd) qg2Var.x.getValue();
                long j = pb2VarP.a;
                this.o = atomicLong;
                this.X = 1;
                obj = ykdVar.a(j, this);
                if (obj != g84Var) {
                }
            }
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
            return qqgVar;
        }
        atomicLong = this.o;
        g8j.b(obj);
        atomicLong.set(((Number) obj).longValue());
        jve jveVar = qg2Var.d;
        dgc dgcVar = new dgc(new n5g(u8b.R), new Integer(yud.n));
        this.o = null;
        this.X = 2;
        return jveVar.a(dgcVar, this) == g84Var ? g84Var : qqgVar;
    }
}
