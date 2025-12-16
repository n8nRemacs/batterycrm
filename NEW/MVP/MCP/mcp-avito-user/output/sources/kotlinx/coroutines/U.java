package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlinx.coroutines.internal.C43238h;

/* compiled from: CoroutineScope.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlinx-coroutines-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class U {
    @Y61.k
    public static final C43238h a(@Y61.k CoroutineContext coroutineContext) {
        if (coroutineContext.get(N0.f410716u2) == null) {
            coroutineContext = coroutineContext.plus(Q0.a());
        }
        return new C43238h(coroutineContext);
    }

    public static final void b(@Y61.k T t12, @Y61.l CancellationException cancellationException) {
        N0 n02 = (N0) t12.getF46675c().get(N0.f410716u2);
        if (n02 != null) {
            n02.c(cancellationException);
        } else {
            throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + t12).toString());
        }
    }

    @Y61.l
    public static final <R> Object c(@Y61.k Y41.p<? super T, ? super Continuation<? super R>, ? extends Object> pVar, @Y61.k Continuation<? super R> continuation) {
        kotlinx.coroutines.internal.W w12 = new kotlinx.coroutines.internal.W(continuation, continuation.getF410748d());
        Object objA = F51.b.a(w12, w12, pVar);
        if (objA == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return objA;
    }

    public static final void d(@Y61.k T t12) {
        Q0.e(t12.getF46675c());
    }

    public static final boolean e(@Y61.k T t12) {
        N0 n02 = (N0) t12.getF46675c().get(N0.f410716u2);
        if (n02 != null) {
            return n02.isActive();
        }
        return true;
    }

    @Y61.k
    public static final C43238h f(@Y61.k T t12, @Y61.k CoroutineContext coroutineContext) {
        return new C43238h(t12.getF46675c().plus(coroutineContext));
    }
}
