package defpackage;

import kotlin.coroutines.Continuation;
import ru.ok.tamtam.android.prefs.PmsKey;

/* loaded from: classes2.dex */
public final class f33 extends dtf implements sm6 {
    public final /* synthetic */ b43 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f33(b43 b43Var, Continuation continuation) {
        super(2, continuation);
        this.o = b43Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        f33 f33Var = (f33) l((f84) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        f33Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new f33(this.o, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        yy7[] yy7VarArr = b43.W0;
        b43 b43Var = this.o;
        gu5 gu5Var = (gu5) b43Var.w();
        gu5Var.getClass();
        if (gu5Var.j(PmsKey.f132searchloaderv2enabled, false)) {
            tcf tcfVar = b43Var.K0;
            dmb dmbVar = (dmb) b43Var.N0.get();
            tcfVar.setValue(dmbVar != null ? (String) dmbVar.d : null);
        } else {
            zm8 zm8Var = b43Var.d;
            String str = ((y23) b43Var.H0.getValue()).b;
            zm8Var.getClass();
            wqi.c("zm8", "loadNextMessages", new Object[0]);
            j0e j0eVar = zm8Var.c;
            if (bwd.c(zm8Var.l)) {
                String str2 = l8g.c(zm8Var.s) ? null : zm8Var.s;
                o0g o0gVar = zm8Var.d;
                fh2 fh2Var = new fh2(str, 50, str2);
                u0g u0gVar = (u0g) o0gVar;
                u0gVar.getClass();
                u2f u2fVarI = new wk3(2, new z9a(u0gVar, 29, fh2Var)).i(j0eVar);
                d1g d1gVar = zm8Var.f;
                d1gVar.getClass();
                u2f u2fVarI2 = u2fVarI.j(new b1g(d1gVar, 1, 0)).m(j0eVar).i(zm8Var.b);
                qu1 qu1Var = new qu1(new tm8(zm8Var, str, 0), 2, new sm8(zm8Var, 1));
                u2fVarI2.k(qu1Var);
                zm8Var.l = qu1Var;
            } else {
                wqi.c("zm8", "searchMessagesInternal: is loading, return", new Object[0]);
            }
        }
        return qqg.a;
    }
}
