package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class trb extends dtf implements sm6 {
    public final /* synthetic */ urb o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public trb(urb urbVar, Continuation continuation) {
        super(2, continuation);
        this.o = urbVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        trb trbVar = (trb) l((z26) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        trbVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new trb(this.o, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        urb urbVar = this.o;
        urbVar.a.registerActivityLifecycleCallbacks(urbVar.c);
        return qqg.a;
    }
}
