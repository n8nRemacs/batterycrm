package defpackage;

import android.graphics.RectF;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class bhc extends dtf implements sm6 {
    public final /* synthetic */ RectF X;
    public final /* synthetic */ fhc o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bhc(fhc fhcVar, RectF rectF, Continuation continuation) {
        super(2, continuation);
        this.o = fhcVar;
        this.X = rectF;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        bhc bhcVar = (bhc) l((f84) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        bhcVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new bhc(this.o, this.X, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        yy7[] yy7VarArr = fhc.z0;
        fhc fhcVar = this.o;
        svi.e(fhcVar.a, ((q2b) fhcVar.t()).b(), null, new ahc(fhcVar, ((iz5) fhcVar.X.getValue()).p((String) fhcVar.y0.get()).getAbsolutePath(), this.X, null), 2);
        return qqg.a;
    }
}
