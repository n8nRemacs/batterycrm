package kotlinx.coroutines;

import java.util.concurrent.locks.LockSupport;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;

/* compiled from: Builders.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/coroutines/i;", "T", "Lkotlinx/coroutines/a;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlinx.coroutines.i, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C43228i<T> extends AbstractC43075a<T> {

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Thread f411857e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final AbstractC43300s0 f411858f;

    public C43228i(@Y61.k CoroutineContext coroutineContext, @Y61.k Thread thread, @Y61.l AbstractC43300s0 abstractC43300s0) {
        super(coroutineContext, true, true);
        this.f411857e = thread;
        this.f411858f = abstractC43300s0;
    }

    @Override // kotlinx.coroutines.V0
    public final void K(@Y61.l Object obj) {
        Thread threadCurrentThread = Thread.currentThread();
        Thread thread = this.f411857e;
        if (kotlin.jvm.internal.L.f(threadCurrentThread, thread)) {
            return;
        }
        LockSupport.unpark(thread);
    }
}
