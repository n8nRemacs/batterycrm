package defpackage;

import com.my.tracker.MyTracker;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class sba extends dtf implements sm6 {
    public /* synthetic */ long o;

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        sba sbaVar = (sba) l(Long.valueOf(((Number) obj).longValue()), (Continuation) obj2);
        qqg qqgVar = qqg.a;
        sbaVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        sba sbaVar = new sba(2, continuation);
        sbaVar.o = ((Number) obj).longValue();
        return sbaVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        MyTracker.getTrackerParams().setCustomUserId(String.valueOf(this.o));
        return qqg.a;
    }
}
