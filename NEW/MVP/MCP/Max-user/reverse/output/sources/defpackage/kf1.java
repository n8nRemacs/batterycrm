package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class kf1 extends dtf implements sm6 {
    public final /* synthetic */ pf1 X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kf1(pf1 pf1Var, Continuation continuation) {
        super(2, continuation);
        this.X = pf1Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        kf1 kf1Var = (kf1) l((ba1) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        kf1Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        kf1 kf1Var = new kf1(this.X, continuation);
        kf1Var.o = obj;
        return kf1Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        Object value;
        qqg qqgVar = qqg.a;
        g8j.b(obj);
        ba1 ba1Var = (ba1) this.o;
        CharSequence charSequence = null;
        if (ba1Var instanceof z91) {
            Long l = this.X.Z;
            z91 z91Var = (z91) ba1Var;
            long j = z91Var.a.b;
            if (l != null && l.longValue() == j) {
                this.X.Z = null;
                pf1 pf1Var = this.X;
                String str = z91Var.a.o;
                py0 py0Var = pf1Var.c;
                tcf tcfVar = pf1Var.s0;
                while (true) {
                    Object value2 = tcfVar.getValue();
                    mc0 mc0VarD = py0Var.d(charSequence, Long.MIN_VALUE);
                    n5g n5gVar = new n5g(b0b.l);
                    if (tcfVar.c(value2, cf1.a((cf1) value2, mc0VarD, dqi.u(str), null, new af1(py0Var.f(str)), n5gVar, cf1.k, ve1.a, true, null, pf1Var.t(true, null), 1))) {
                        break;
                    }
                    charSequence = null;
                }
            }
        } else {
            if (!(ba1Var instanceof aa1)) {
                throw new NoWhenBranchMatchedException();
            }
            Long l2 = this.X.Z;
            long j2 = ((aa1) ba1Var).a;
            if (l2 != null && l2.longValue() == j2) {
                this.X.Z = null;
                tcf tcfVar2 = this.X.s0;
                do {
                    value = tcfVar2.getValue();
                } while (!tcfVar2.c(value, cf1.a((cf1) value, null, null, null, new ye1(), new n5g(b0b.f), hd5.a, we1.a, false, null, null, 1807)));
            }
        }
        return qqgVar;
    }
}
