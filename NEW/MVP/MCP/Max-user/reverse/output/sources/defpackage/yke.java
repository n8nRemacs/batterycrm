package defpackage;

import android.graphics.RectF;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class yke extends dtf implements sm6 {
    public final /* synthetic */ RectF X;
    public final /* synthetic */ ele o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yke(ele eleVar, RectF rectF, Continuation continuation) {
        super(2, continuation);
        this.o = eleVar;
        this.X = rectF;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        yke ykeVar = (yke) l((f84) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        ykeVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new yke(this.o, this.X, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        yy7[] yy7VarArr = ele.M0;
        ele eleVar = this.o;
        eleVar.y(((iz5) eleVar.s0.getValue()).p((String) eleVar.H0.get()).getAbsolutePath(), this.X);
        return qqg.a;
    }
}
