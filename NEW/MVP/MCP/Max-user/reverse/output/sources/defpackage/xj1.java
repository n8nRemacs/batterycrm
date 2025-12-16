package defpackage;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class xj1 extends dtf implements um6 {
    public /* synthetic */ ConstraintLayout X;
    public final /* synthetic */ int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xj1(int i, Continuation continuation, int i2) {
        super(i, continuation);
        this.o = i2;
    }

    @Override // defpackage.um6
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ConstraintLayout constraintLayout = (ConstraintLayout) obj;
        Continuation continuation = (Continuation) obj3;
        switch (this.o) {
            case 0:
                xj1 xj1Var = new xj1(3, continuation, 0);
                xj1Var.X = constraintLayout;
                qqg qqgVar = qqg.a;
                xj1Var.n(qqgVar);
                return qqgVar;
            default:
                xj1 xj1Var2 = new xj1(3, continuation, 1);
                xj1Var2.X = constraintLayout;
                qqg qqgVar2 = qqg.a;
                xj1Var2.n(qqgVar2);
                return qqgVar2;
        }
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        switch (this.o) {
            case 0:
                g8j.b(obj);
                ConstraintLayout constraintLayout = this.X;
                constraintLayout.setBackgroundColor(a93.s0.y(constraintLayout).b().m);
                break;
            default:
                g8j.b(obj);
                ConstraintLayout constraintLayout2 = this.X;
                constraintLayout2.setBackgroundColor(a93.s0.y(constraintLayout2).b().k);
                break;
        }
        return qqg.a;
    }
}
