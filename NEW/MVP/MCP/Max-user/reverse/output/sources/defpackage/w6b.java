package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class w6b extends dtf implements sm6 {
    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        w6b w6bVar = (w6b) l((f84) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        w6bVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new w6b(2, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        return qqg.a;
    }
}
