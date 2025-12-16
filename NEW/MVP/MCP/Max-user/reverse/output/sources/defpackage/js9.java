package defpackage;

import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class js9 extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ vu9 Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public js9(vu9 vu9Var, Continuation continuation) {
        super(2, continuation);
        this.Y = vu9Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((js9) l((oj9) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        js9 js9Var = new js9(this.Y, continuation);
        js9Var.X = obj;
        return js9Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        qqg qqgVar = qqg.a;
        lg8 lg8Var = lg8.d;
        g84 g84Var = g84.a;
        int i = this.o;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
            return qqgVar;
        }
        g8j.b(obj);
        oj9 oj9Var = (oj9) this.X;
        String str = this.Y.C0;
        l6b l6bVar = wqi.a;
        if (l6bVar != null && l6bVar.b(lg8Var)) {
            l6bVar.c(lg8Var, str, "Got MessageEvent=" + oj9Var, null);
        }
        if (oj9Var instanceof hj9) {
            vu9 vu9Var = this.Y;
            hj9 hj9Var = (hj9) oj9Var;
            this.o = 1;
            if (hj9Var.b) {
                String str2 = vu9Var.C0;
                l6b l6bVar2 = wqi.a;
                if (l6bVar2 != null && l6bVar2.b(lg8Var)) {
                    l6bVar2.c(lg8Var, str2, ho7.f(hj9Var.a.size(), "handleMessageAddEvent: delayed scroll for outgoing message, addedSize:"), null);
                }
                ay9 ay9VarE = vu9Var.E();
                Set set = hj9Var.a;
                ay9VarE.getClass();
                if (!set.isEmpty()) {
                    ay9VarE.n.updateAndGet(new jx9(((Number) ue3.O(set)).longValue(), 1));
                }
            }
            if (qqgVar == g84Var) {
                return g84Var;
            }
        } else if (oj9Var instanceof mj9) {
            vu9 vu9Var2 = this.Y;
            mj9 mj9Var = (mj9) oj9Var;
            ci5 ci5Var = vu9Var2.I1;
            AtomicLong atomicLong = vu9Var2.N1;
            if (vu9Var2.D().g()) {
                if (mj9Var instanceof kj9) {
                    p6a p6aVarD = vu9Var2.D();
                    svi.e(p6aVarD.a, ((q2b) p6aVarD.b).a(), null, new l6a(p6aVarD, ((kj9) mj9Var).a, null), 2);
                    return qqgVar;
                }
                if (!(mj9Var instanceof lj9)) {
                    throw new NoWhenBranchMatchedException();
                }
                p6a p6aVarD2 = vu9Var2.D();
                svi.e(p6aVarD2.a, ((q2b) p6aVarD2.b).a(), null, new m6a(p6aVarD2, null), 2);
                return qqgVar;
            }
            if (atomicLong.get() != 0) {
                if (mj9Var instanceof kj9) {
                    if (((kj9) mj9Var).a.contains(Long.valueOf(atomicLong.get()))) {
                        xfh.r(ci5Var, new n27(atomicLong.getAndSet(0L)));
                        return qqgVar;
                    }
                } else {
                    if (!(mj9Var instanceof lj9)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (((hr9) vu9Var2.D1.a.getValue()).e(atomicLong.get()) == null) {
                        xfh.r(ci5Var, new n27(atomicLong.getAndSet(0L)));
                        return qqgVar;
                    }
                }
            }
        }
        return qqgVar;
    }
}
