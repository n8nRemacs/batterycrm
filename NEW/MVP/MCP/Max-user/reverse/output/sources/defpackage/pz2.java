package defpackage;

import android.graphics.Rect;
import android.graphics.RectF;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class pz2 extends dtf implements sm6 {
    public final /* synthetic */ RectF X;
    public final /* synthetic */ Rect Y;
    public final /* synthetic */ sz2 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pz2(sz2 sz2Var, RectF rectF, Rect rect, Continuation continuation) {
        super(2, continuation);
        this.o = sz2Var;
        this.X = rectF;
        this.Y = rect;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        pz2 pz2Var = (pz2) l((f84) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        pz2Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new pz2(this.o, this.X, this.Y, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        sz2 sz2Var = this.o;
        yy7[] yy7VarArr = sz2.H0;
        String absolutePath = sz2Var.v().p(this.o.E0).getAbsolutePath();
        sz2 sz2Var2 = this.o;
        xfh.o(sz2Var2, null, new oz2(sz2Var2, absolutePath, this.Y, this.X, null), 3);
        return qqg.a;
    }
}
