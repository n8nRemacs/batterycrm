package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class hga extends dtf implements sm6 {
    public final /* synthetic */ oga o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hga(oga ogaVar, Continuation continuation) {
        super(2, continuation);
        this.o = ogaVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        hga hgaVar = (hga) l((wc0) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        hgaVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new hga(this.o, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        this.o.y(null);
        return qqg.a;
    }
}
