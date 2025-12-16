package kotlinx.coroutines.debug.internal;

import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.X;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.internal.s0;

/* compiled from: DebugCoroutineInfoImpl.kt */
@s0
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lkotlinx/coroutines/debug/internal/g;", "", "", "_state", "Ljava/lang/String;", "Ljava/lang/Thread;", "lastObservedThread", "Ljava/lang/Thread;", "Ljava/lang/ref/WeakReference;", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "_lastObservedFrame", "Ljava/lang/ref/WeakReference;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
@X
/* loaded from: classes8.dex */
public final class g {

    @X41.f
    @Y61.l
    public volatile WeakReference<CoroutineStackFrame> _lastObservedFrame;

    @X41.f
    @Y61.k
    public volatile String _state;

    @X41.f
    @Y61.l
    public volatile Thread lastObservedThread;

    @Y61.k
    public final String toString() {
        throw null;
    }
}
