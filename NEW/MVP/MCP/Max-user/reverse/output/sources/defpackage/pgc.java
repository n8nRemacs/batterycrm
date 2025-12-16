package defpackage;

import androidx.coordinatorlayout.widget.CoordinatorLayout;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class pgc extends dtf implements um6 {
    public /* synthetic */ CoordinatorLayout X;
    public /* synthetic */ yeb Y;
    public final /* synthetic */ int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pgc(int i, Continuation continuation, int i2) {
        super(i, continuation);
        this.o = i2;
    }

    @Override // defpackage.um6
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) obj;
        yeb yebVar = (yeb) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.o) {
            case 0:
                pgc pgcVar = new pgc(3, continuation, 0);
                pgcVar.X = coordinatorLayout;
                pgcVar.Y = yebVar;
                qqg qqgVar = qqg.a;
                pgcVar.n(qqgVar);
                return qqgVar;
            default:
                pgc pgcVar2 = new pgc(3, continuation, 1);
                pgcVar2.X = coordinatorLayout;
                pgcVar2.Y = yebVar;
                qqg qqgVar2 = qqg.a;
                pgcVar2.n(qqgVar2);
                return qqgVar2;
        }
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        switch (this.o) {
            case 0:
                g8j.b(obj);
                this.X.setBackgroundColor(this.Y.b().k);
                break;
            default:
                g8j.b(obj);
                this.X.setBackgroundColor(this.Y.b().k);
                break;
        }
        return qqg.a;
    }
}
