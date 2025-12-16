package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class a2e extends dtf implements sm6 {
    public /* synthetic */ Object o;

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((a2e) l((ww3) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        a2e a2eVar = new a2e(2, continuation);
        a2eVar.o = obj;
        return a2eVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        return new mwd(new z1e((ww3) this.o, null));
    }
}
