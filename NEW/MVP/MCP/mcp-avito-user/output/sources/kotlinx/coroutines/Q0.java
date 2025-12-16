package kotlinx.coroutines;

import java.util.Iterator;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.sequences.InterfaceC43030m;

@Metadata(d1 = {"kotlinx/coroutines/R0", "kotlinx/coroutines/T0"}, d2 = {}, k = 4, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class Q0 {
    public static P0 a() {
        return new P0(null);
    }

    public static final void b(@Y61.k CoroutineContext coroutineContext, @Y61.l CancellationException cancellationException) {
        N0 n02 = (N0) coroutineContext.get(N0.f410716u2);
        if (n02 != null) {
            n02.c(cancellationException);
        }
    }

    @Y61.l
    public static final Object c(@Y61.k N0 n02, @Y61.k SuspendLambda suspendLambda) {
        n02.c(null);
        Object objA = n02.A(suspendLambda);
        return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : kotlin.G0.f406611a;
    }

    public static void d(CoroutineContext coroutineContext) {
        InterfaceC43030m<N0> children;
        N0 n02 = (N0) coroutineContext.get(N0.f410716u2);
        if (n02 == null || (children = n02.getChildren()) == null) {
            return;
        }
        Iterator<N0> it = children.iterator();
        while (it.hasNext()) {
            it.next().c(null);
        }
    }

    public static final void e(@Y61.k CoroutineContext coroutineContext) {
        N0 n02 = (N0) coroutineContext.get(N0.f410716u2);
        if (n02 != null && !n02.isActive()) {
            throw n02.J();
        }
    }

    @Y61.k
    public static final N0 f(@Y61.k CoroutineContext coroutineContext) {
        N0 n02 = (N0) coroutineContext.get(N0.f410716u2);
        if (n02 != null) {
            return n02;
        }
        throw new IllegalStateException(("Current context doesn't contain Job in it: " + coroutineContext).toString());
    }

    public static InterfaceC43268o0 g(N0 n02, U0 u02, int i12) {
        boolean z12 = (i12 & 1) == 0;
        boolean z13 = (i12 & 2) != 0;
        return n02 instanceof V0 ? ((V0) n02).n0(z12, z13, u02) : n02.Q(z12, z13, new S0(1, u02, H0.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0));
    }

    public static final boolean h(@Y61.k CoroutineContext coroutineContext) {
        N0 n02 = (N0) coroutineContext.get(N0.f410716u2);
        if (n02 != null) {
            return n02.isActive();
        }
        return true;
    }
}
