package kotlinx.coroutines;

import java.util.concurrent.Executor;
import kotlin.Metadata;

/* compiled from: Executors.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0010\b\u0007\u0010\u0002\"\u00020\u00002\u00020\u0000B\u0002\b\u0001¨\u0006\u0003"}, d2 = {"Lkotlinx/coroutines/y0;", "Lkotlinx/coroutines/B0;", "CloseableCoroutineDispatcher", "kotlinx-coroutines-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class A0 {
    @Y61.k
    public static final Executor a(@Y61.k M m12) {
        Executor f412305c;
        AbstractC43313y0 abstractC43313y0 = m12 instanceof AbstractC43313y0 ? (AbstractC43313y0) m12 : null;
        return (abstractC43313y0 == null || (f412305c = abstractC43313y0.getF412305c()) == null) ? new ExecutorC43260k0(m12) : f412305c;
    }

    @X41.i
    @Y61.k
    public static final M b(@Y61.k Executor executor) {
        M m12;
        ExecutorC43260k0 executorC43260k0 = executor instanceof ExecutorC43260k0 ? (ExecutorC43260k0) executor : null;
        return (executorC43260k0 == null || (m12 = executorC43260k0.f411943b) == null) ? new C43315z0(executor) : m12;
    }
}
