package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class qse extends dtf implements sm6 {
    public final /* synthetic */ rse X;
    public final /* synthetic */ String o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qse(String str, rse rseVar, Continuation continuation) {
        super(2, continuation);
        this.o = str;
        this.X = rseVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        qse qseVar = (qse) l((f84) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        qseVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new qse(this.o, this.X, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        bwf bwfVar = if5.a;
        xfh.r(this.X.o, if5.a(this.o));
        return qqg.a;
    }
}
