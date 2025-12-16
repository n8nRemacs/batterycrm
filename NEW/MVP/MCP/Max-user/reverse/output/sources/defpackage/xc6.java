package defpackage;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class xc6 extends dtf implements um6 {
    public /* synthetic */ ConstraintLayout X;
    public /* synthetic */ yeb Y;
    public final /* synthetic */ int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xc6(int i, Continuation continuation, int i2) {
        super(i, continuation);
        this.o = i2;
    }

    @Override // defpackage.um6
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ConstraintLayout constraintLayout = (ConstraintLayout) obj;
        yeb yebVar = (yeb) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.o) {
            case 0:
                xc6 xc6Var = new xc6(3, continuation, 0);
                xc6Var.X = constraintLayout;
                xc6Var.Y = yebVar;
                qqg qqgVar = qqg.a;
                xc6Var.n(qqgVar);
                return qqgVar;
            default:
                xc6 xc6Var2 = new xc6(3, continuation, 1);
                xc6Var2.X = constraintLayout;
                xc6Var2.Y = yebVar;
                qqg qqgVar2 = qqg.a;
                xc6Var2.n(qqgVar2);
                return qqgVar2;
        }
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        switch (this.o) {
            case 0:
                g8j.b(obj);
                this.X.setBackgroundColor(this.Y.b().l);
                break;
            default:
                g8j.b(obj);
                this.X.setBackgroundColor(this.Y.b().m);
                break;
        }
        return qqg.a;
    }
}
