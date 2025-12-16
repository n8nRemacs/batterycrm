package kotlinx.coroutines.reactive;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.internal.H;

/* compiled from: ReactiveFlow.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
final /* synthetic */ class p extends H implements Y41.l<Continuation<? super G0>, Object>, SuspendFunction {
    @Override // Y41.l
    public final Object invoke(Continuation<? super G0> continuation) {
        return r.F0((r) this.receiver, continuation);
    }
}
