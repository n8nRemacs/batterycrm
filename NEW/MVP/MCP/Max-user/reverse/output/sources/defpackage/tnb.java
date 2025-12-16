package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class tnb extends dtf implements wm6 {
    public /* synthetic */ Throwable o;

    @Override // defpackage.wm6
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        ((Number) obj3).longValue();
        tnb tnbVar = new tnb(4, (Continuation) obj4);
        tnbVar.o = (Throwable) obj2;
        return tnbVar.n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        Throwable th = this.o;
        wqi.p("ParticipantsRepository", "ParticipantsUpdates retry due to " + th.getMessage(), th);
        return Boolean.valueOf(!(th instanceof CancellationException));
    }
}
