package defpackage;

import java.util.Collection;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class u4h extends dtf implements sm6 {
    public /* synthetic */ Object o;

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        u4h u4hVar = (u4h) l((Collection) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        u4hVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        u4h u4hVar = new u4h(2, continuation);
        u4hVar.o = obj;
        return u4hVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        return qqg.a;
    }
}
