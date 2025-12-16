package androidx.compose.foundation;

import androidx.compose.runtime.F3;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: MutatorMutex.kt */
@F3
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/compose/foundation/G1;", "", "<init>", "()V", "a", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class G1 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final AtomicReference<a> f26710a = new AtomicReference<>(null);

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final kotlinx.coroutines.sync.d f26711b = new kotlinx.coroutines.sync.d();

    /* compiled from: MutatorMutex.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/G1$a;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final MutatePriority f26712a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final kotlinx.coroutines.N0 f26713b;

        public a(@Y61.k MutatePriority mutatePriority, @Y61.k kotlinx.coroutines.N0 n02) {
            this.f26712a = mutatePriority;
            this.f26713b = n02;
        }
    }

    public static final void a(G1 g12, a aVar) {
        while (true) {
            AtomicReference<a> atomicReference = g12.f26710a;
            a aVar2 = atomicReference.get();
            if (aVar2 != null && aVar.f26712a.compareTo(aVar2.f26712a) < 0) {
                throw new CancellationException("Current mutation had a higher priority");
            }
            while (!atomicReference.compareAndSet(aVar2, aVar)) {
                if (atomicReference.get() != aVar2) {
                    break;
                }
            }
            if (aVar2 != null) {
                aVar2.f26713b.c(new MutationInterruptedException());
                return;
            }
            return;
        }
    }

    @Y61.l
    public final Object b(@Y61.k MutatePriority mutatePriority, @Y61.k Y41.l lVar, @Y61.k ContinuationImpl continuationImpl) {
        return kotlinx.coroutines.U.c(new H1(mutatePriority, this, lVar, null), continuationImpl);
    }

    @Y61.l
    public final Object c(Object obj, @Y61.k MutatePriority mutatePriority, @Y61.k Y41.p pVar, @Y61.k SuspendLambda suspendLambda) {
        return kotlinx.coroutines.U.c(new I1(mutatePriority, this, pVar, obj, null), suspendLambda);
    }
}
