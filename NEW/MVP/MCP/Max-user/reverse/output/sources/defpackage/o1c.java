package defpackage;

import java.util.Collection;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class o1c extends dtf implements sm6 {
    public /* synthetic */ Object o;

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        o1c o1cVar = (o1c) l((Collection) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        o1cVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        o1c o1cVar = new o1c(2, continuation);
        o1cVar.o = obj;
        return o1cVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        ((e9a) ((oy4) e51.a.getAccessor().c(21)).d.getValue()).h((Collection) this.o);
        return qqg.a;
    }
}
