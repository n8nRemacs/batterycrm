package defpackage;

import android.text.Layout;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class cr9 extends dtf implements sm6 {
    public final /* synthetic */ bwf X;
    public final /* synthetic */ j18 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cr9(j18 j18Var, bwf bwfVar, Continuation continuation) {
        super(2, continuation);
        this.o = j18Var;
        this.X = bwfVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        cr9 cr9Var = (cr9) l((f84) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        cr9Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new cr9(this.o, this.X, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        this.o.a.b((Layout) this.X.getValue());
        return qqg.a;
    }
}
