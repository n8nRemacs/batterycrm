package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class hu8 extends dtf implements sm6 {
    public final /* synthetic */ mu8 X;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hu8(mu8 mu8Var, Continuation continuation) {
        super(2, continuation);
        this.X = mu8Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((hu8) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new hu8(this.X, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        boolean z;
        int i;
        int i2 = this.o;
        if (i2 == 0) {
            g8j.b(obj);
            mu8 mu8Var = this.X;
            sd8 sd8VarT = mu8.t(mu8Var);
            tcf tcfVar = mu8Var.s0;
            k18 k18Var = mu8Var.d;
            CharSequence charSequence = sd8VarT.f.j;
            ((sd8) k18Var.getValue()).f.j = null;
            int iOrdinal = ((l00) tcfVar.getValue()).ordinal();
            if (iOrdinal == 0) {
                z = false;
            } else {
                if (iOrdinal != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                z = true;
            }
            dce dceVar = ((sd8) k18Var.getValue()).f;
            l00 l00Var = (l00) tcfVar.getValue();
            l00Var.getClass();
            int i3 = k00.$EnumSwitchMapping$0[l00Var.ordinal()];
            if (i3 != 1) {
                i = 2;
                if (i3 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                i = 3;
            }
            dceVar.p(i);
            xfh.r(mu8Var.x0, new zt8(charSequence, ((sd8) k18Var.getValue()).f.d(), z));
            pv0 pv0Var = mu8Var.u0;
            zs8 zs8Var = new zs8(true);
            this.o = 1;
            Object objH = pv0Var.h(zs8Var, this);
            g84 g84Var = g84.a;
            if (objH == g84Var) {
                return g84Var;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
        }
        return qqg.a;
    }
}
