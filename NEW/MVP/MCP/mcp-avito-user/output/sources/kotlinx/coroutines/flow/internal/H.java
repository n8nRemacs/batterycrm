package kotlinx.coroutines.flow.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.e2;
import kotlinx.coroutines.flow.n2;

/* compiled from: AbstractSharedFlow.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/coroutines/flow/internal/H;", "Lkotlinx/coroutines/flow/n2;", "", "Lkotlinx/coroutines/flow/e2;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
final class H extends e2<Integer> implements n2<Integer> {
    @Override // kotlinx.coroutines.flow.n2
    public final Integer getValue() {
        Integer numValueOf;
        synchronized (this) {
            numValueOf = Integer.valueOf(((Number) this.f411365i[((int) ((this.f411366j + ((int) ((k() + this.f411368l) - this.f411366j))) - 1)) & (r0.length - 1)]).intValue());
        }
        return numValueOf;
    }

    public final void r(int i12) {
        synchronized (this) {
            K5(Integer.valueOf(((Number) this.f411365i[((int) ((this.f411366j + ((int) ((k() + this.f411368l) - this.f411366j))) - 1)) & (r0.length - 1)]).intValue() + i12));
        }
    }
}
