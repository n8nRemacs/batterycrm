package defpackage;

import android.text.Layout;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class r4g extends dtf implements sm6 {
    public final /* synthetic */ bwf X;
    public final /* synthetic */ f5g o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r4g(f5g f5gVar, bwf bwfVar, Continuation continuation) {
        super(2, continuation);
        this.o = f5gVar;
        this.X = bwfVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        r4g r4gVar = (r4g) l((f84) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        r4gVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new r4g(this.o, this.X, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        this.o.b((Layout) this.X.getValue());
        return qqg.a;
    }
}
