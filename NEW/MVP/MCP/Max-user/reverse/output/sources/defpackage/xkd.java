package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class xkd extends dtf implements sm6 {
    public /* synthetic */ Object o;

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        xkd xkdVar = (xkd) l((af2) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        xkdVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        xkd xkdVar = new xkd(2, continuation);
        xkdVar.o = obj;
        return xkdVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        ((af2) this.o).h = null;
        return qqg.a;
    }
}
