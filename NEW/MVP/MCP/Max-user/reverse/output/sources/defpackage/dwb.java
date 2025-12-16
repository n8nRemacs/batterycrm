package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class dwb extends dtf implements sm6 {
    public final /* synthetic */ gwb o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dwb(gwb gwbVar, Continuation continuation) {
        super(2, continuation);
        this.o = gwbVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        dwb dwbVar = (dwb) l((f84) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        dwbVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new dwb(this.o, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        tcf tcfVar = this.o.Y;
        tcfVar.m(null, yvb.a((yvb) tcfVar.getValue(), null, null, null, null, null, null, true, 63));
        return qqg.a;
    }
}
