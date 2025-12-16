package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class hn8 extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ fs4 Y;
    public final /* synthetic */ int Z;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hn8(fs4 fs4Var, int i, Continuation continuation) {
        super(2, continuation);
        this.Y = fs4Var;
        this.Z = i;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((hn8) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        hn8 hn8Var = new hn8(this.Y, this.Z, continuation);
        hn8Var.X = obj;
        return hn8Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        f84 f84Var;
        int i = this.o;
        fs4 fs4Var = this.Y;
        if (i == 0) {
            g8j.b(obj);
            f84Var = (f84) this.X;
            a3b a3bVar = (a3b) fs4Var.c;
            this.X = f84Var;
            this.o = 1;
            bj7 bj7Var = (bj7) a3bVar.b;
            obj = svi.i(((q2b) bj7Var.c).b(), new qi7(bj7Var, null), this);
            g84 g84Var = g84.a;
            if (obj == g84Var) {
                return g84Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f84Var = (f84) this.X;
            g8j.b(obj);
        }
        lpd lpdVar = (lpd) obj;
        wqi.c("fs4", "onStateChanged: allMediaCountResult is " + lpdVar, new Object[0]);
        if (lpdVar instanceof hpd) {
            wqi.p("fs4", "onStateChanged: error", ((hpd) lpdVar).a);
        } else {
            if (!(lpdVar instanceof jpd)) {
                throw new NoWhenBranchMatchedException();
            }
            if (this.Z != ((jpd) lpdVar).a.intValue() && d7j.f(f84Var)) {
                ((e44) fs4Var.d).invoke();
            }
        }
        return qqg.a;
    }
}
