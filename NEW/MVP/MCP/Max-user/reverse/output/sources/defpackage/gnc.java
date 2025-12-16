package defpackage;

import android.graphics.RectF;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class gnc extends dtf implements sm6 {
    public final /* synthetic */ RectF X;
    public final /* synthetic */ pnc o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gnc(pnc pncVar, RectF rectF, Continuation continuation) {
        super(2, continuation);
        this.o = pncVar;
        this.X = rectF;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        gnc gncVar = (gnc) l((f84) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        gncVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new gnc(this.o, this.X, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        yy7[] yy7VarArr = pnc.X0;
        pnc pncVar = this.o;
        pncVar.A(((iz5) pncVar.y0.getValue()).p((String) pncVar.U0.get()).getAbsolutePath(), this.X);
        return qqg.a;
    }
}
