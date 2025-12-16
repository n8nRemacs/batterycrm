package defpackage;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.TimeoutCancellationException;

/* loaded from: classes.dex */
public final class j46 extends dtf implements em6 {
    public final /* synthetic */ long o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j46(long j, Continuation continuation) {
        super(1, continuation);
        this.o = j;
    }

    @Override // defpackage.em6
    public final Object invoke(Object obj) {
        new j46(this.o, (Continuation) obj).n(qqg.a);
        throw null;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        throw new TimeoutCancellationException("Timed out waiting for " + ((Object) s65.n(this.o)), null);
    }
}
