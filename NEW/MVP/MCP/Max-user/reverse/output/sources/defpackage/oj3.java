package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class oj3 extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ pj3 Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oj3(pj3 pj3Var, Continuation continuation) {
        super(2, continuation);
        this.Y = pj3Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((oj3) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        oj3 oj3Var = new oj3(this.Y, continuation);
        oj3Var.X = obj;
        return oj3Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) throws Throwable {
        Object ipdVar;
        qqg qqgVar = qqg.a;
        g84 g84Var = g84.a;
        int i = this.o;
        try {
        } catch (Throwable th) {
            ipdVar = new ipd(th);
        }
        if (i == 0) {
            g8j.b(obj);
            pe8 pe8Var = (pe8) ((pb3) this.Y.d.getValue());
            long jLongValue = ((Number) pe8Var.R0.D(pe8Var, pe8.U0[31])).longValue();
            String str = this.Y.a;
            l6b l6bVar = wqi.a;
            if (l6bVar != null) {
                lg8 lg8Var = lg8.d;
                if (l6bVar.b(lg8Var)) {
                    l6bVar.c(lg8Var, str, vb9.e(jLongValue, "Start get complain reasons from server, current sync="), null);
                }
            }
            fh2 fh2Var = new fh2(xhb.K2, 16);
            fh2Var.t(jLongValue, "complainSync");
            hwa hwaVar = (hwa) this.Y.b.getValue();
            this.o = 1;
            obj = hwaVar.F(fh2Var, this);
            if (obj == g84Var) {
                return g84Var;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                g8j.b(obj);
                return qqgVar;
            }
            g8j.b(obj);
        }
        ipdVar = (qj3) obj;
        pj3 pj3Var = this.Y;
        Throwable thA = kpd.a(ipdVar);
        if (thA != null) {
            if (thA instanceof CancellationException) {
                throw thA;
            }
            String str2 = pj3Var.a;
            l6b l6bVar2 = wqi.a;
            if (l6bVar2 != null) {
                lg8 lg8Var2 = lg8.Y;
                if (l6bVar2.b(lg8Var2)) {
                    l6bVar2.c(lg8Var2, str2, "Fail get complain reasons", null);
                }
            }
        }
        qj3 qj3Var = (qj3) (ipdVar instanceof ipd ? null : ipdVar);
        if (qj3Var != null) {
            pe8 pe8Var2 = (pe8) ((pb3) this.Y.d.getValue());
            pe8Var2.R0.O(pe8Var2, pe8.U0[31], Long.valueOf(qj3Var.c));
            if (!qj3Var.d.isEmpty()) {
                ((mj3) this.Y.c.getValue()).a();
                mj3 mj3Var = (mj3) this.Y.c.getValue();
                List<lj3> list = qj3Var.d;
                ArrayList arrayList = new ArrayList(we3.q(list, 10));
                for (lj3 lj3Var : list) {
                    arrayList.add(new nj3(0L, lj3Var.a.a, lj3Var.b));
                }
                this.o = 2;
                if (k7j.b(mj3Var.a, new ci(mj3Var, 4, arrayList), this) == g84Var) {
                    return g84Var;
                }
            }
        }
        return qqgVar;
    }
}
