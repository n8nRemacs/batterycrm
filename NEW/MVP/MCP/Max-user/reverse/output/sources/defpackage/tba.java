package defpackage;

import com.my.tracker.userlifecycle.MyTrackerUserLifecycle;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class tba extends dtf implements sm6 {
    public /* synthetic */ long o;

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        tba tbaVar = (tba) l(Long.valueOf(((Number) obj).longValue()), (Continuation) obj2);
        qqg qqgVar = qqg.a;
        tbaVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        tba tbaVar = new tba(2, continuation);
        tbaVar.o = ((Number) obj).longValue();
        return tbaVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        MyTrackerUserLifecycle.trackLoginEvent(String.valueOf(this.o), null);
        return qqg.a;
    }
}
