package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class vv7 extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ra3 Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vv7(ra3 ra3Var, Continuation continuation) {
        super(2, continuation);
        this.Y = ra3Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((vv7) l((tv7) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        vv7 vv7Var = new vv7(this.Y, continuation);
        vv7Var.X = obj;
        return vv7Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            tv7 tv7Var = (tv7) this.X;
            pv0 pv0Var = (pv0) this.Y.f;
            this.o = 1;
            Object objH = pv0Var.h(tv7Var, this);
            g84 g84Var = g84.a;
            if (objH == g84Var) {
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
