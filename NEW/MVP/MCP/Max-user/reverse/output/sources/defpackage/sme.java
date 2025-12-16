package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class sme extends dtf implements sm6 {
    public final /* synthetic */ tme X;
    public final /* synthetic */ nqd Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sme(tme tmeVar, nqd nqdVar, Continuation continuation) {
        super(2, continuation);
        this.X = tmeVar;
        this.Y = nqdVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((sme) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new sme(this.X, this.Y, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        char c;
        String str;
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            tme tmeVar = this.X;
            dna dnaVar = tmeVar.b;
            sxg sxgVar = (sxg) dnaVar.b.getValue();
            sxgVar.getClass();
            nqd nqdVar = this.Y;
            sxgVar.i("app.calls.incoming.ringtone", nqdVar.toString());
            dnaVar.c = nqdVar;
            if (nqdVar instanceof kqd) {
                c = 3;
            } else if (nqdVar instanceof lqd) {
                c = 1;
            } else {
                if (!(nqdVar instanceof mqd)) {
                    throw new NoWhenBranchMatchedException();
                }
                c = 2;
            }
            yx1 yx1Var = (yx1) tmeVar.X.getValue();
            yx1Var.getClass();
            if (c == 1) {
                str = "MAX";
            } else if (c == 2) {
                str = "SYSTEM";
            } else {
                if (c != 3) {
                    throw null;
                }
                str = "CUSTOM";
            }
            yx1.d(yx1Var, "CALL_CHANGE_RINGTONE", null, str, null, null, null, false, 250);
            this.o = 1;
            Object objT = tme.t(tmeVar, this);
            g84 g84Var = g84.a;
            if (objT == g84Var) {
                return g84Var;
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
