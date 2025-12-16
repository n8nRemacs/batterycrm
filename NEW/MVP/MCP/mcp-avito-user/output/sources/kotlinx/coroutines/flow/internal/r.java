package kotlinx.coroutines.flow.internal;

import kotlin.Metadata;
import kotlinx.coroutines.internal.W;

/* compiled from: FlowCoroutine.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/coroutines/flow/internal/r;", "T", "Lkotlinx/coroutines/internal/W;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
final class r<T> extends W<T> {
    public r() {
        throw null;
    }

    @Override // kotlinx.coroutines.V0
    public final boolean Y(@Y61.k Throwable th2) {
        if (th2 instanceof ChildCancelledException) {
            return true;
        }
        return U(th2);
    }
}
