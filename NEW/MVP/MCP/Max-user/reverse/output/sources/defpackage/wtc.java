package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class wtc extends dtf implements sm6 {
    public final /* synthetic */ ytc X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wtc(Continuation continuation, ytc ytcVar) {
        super(2, continuation);
        this.X = ytcVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        wtc wtcVar = (wtc) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        wtcVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        wtc wtcVar = new wtc(continuation, this.X);
        wtcVar.o = obj;
        return wtcVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        ytc.b(this.X, (i02) this.o);
        return qqg.a;
    }
}
