package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class jsb extends dtf implements sm6 {
    public final /* synthetic */ msb X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jsb(msb msbVar, Continuation continuation) {
        super(2, continuation);
        this.X = msbVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        jsb jsbVar = (jsb) l((nsb) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        jsbVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        jsb jsbVar = new jsb(this.X, continuation);
        jsbVar.o = obj;
        return jsbVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        msb.a(this.X, "camera", ((nsb) this.o) == nsb.a ? "allowed" : "denied");
        return qqg.a;
    }
}
