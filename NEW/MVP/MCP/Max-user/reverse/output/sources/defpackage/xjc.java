package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class xjc extends dtf implements sm6 {
    public final /* synthetic */ hkc o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xjc(hkc hkcVar, Continuation continuation) {
        super(2, continuation);
        this.o = hkcVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        xjc xjcVar = (xjc) l((f84) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        xjcVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new xjc(this.o, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        ccb ccbVar = (ccb) this.o.X.getValue();
        ccbVar.g(new n5g(u8b.s1));
        ccbVar.e(new qcb(yud.J));
        ccbVar.i();
        return qqg.a;
    }
}
