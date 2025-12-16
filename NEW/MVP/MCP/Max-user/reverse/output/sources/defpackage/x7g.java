package defpackage;

import java.util.Map;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class x7g extends dtf implements sm6 {
    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        x7g x7gVar = (x7g) l((f84) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        x7gVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new x7g(2, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        ssb ssbVarB = eei.b();
        wqi.b("ThreadsDeveloperTools", "Threads count: " + ((Map) ssbVarB.b), (Throwable) ssbVarB.c);
        return qqg.a;
    }
}
