package defpackage;

import android.graphics.RectF;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class xke extends dtf implements sm6 {
    public final /* synthetic */ ele X;
    public final /* synthetic */ String Y;
    public final /* synthetic */ RectF o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xke(RectF rectF, ele eleVar, String str, Continuation continuation) {
        super(2, continuation);
        this.o = rectF;
        this.X = eleVar;
        this.Y = str;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        xke xkeVar = (xke) l((f84) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        xkeVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new xke(this.o, this.X, this.Y, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        RectF rectF = this.o;
        n10 n10Var = new n10(rectF.left, rectF.top, rectF.right, rectF.bottom, 2);
        ele eleVar = this.X;
        eleVar.I0.set(((hwa) eleVar.t0.getValue()).A(this.Y, n10Var));
        xfh.r(eleVar.B0, new ype(new n5g(pbb.q), new Integer(yud.n)));
        return qqg.a;
    }
}
