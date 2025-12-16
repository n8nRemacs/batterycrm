package kotlinx.coroutines.channels;

import kotlin.Metadata;

/* compiled from: Produce.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/coroutines/channels/H0;", "E", "Lkotlinx/coroutines/channels/x;", "Lkotlinx/coroutines/channels/I0;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
final class H0<E> extends C43124x<E> implements I0<E> {
    public H0() {
        throw null;
    }

    @Override // kotlinx.coroutines.AbstractC43075a
    public final void C0(@Y61.k Throwable th2, boolean z12) {
        if (this.f411033e.h(th2) || z12) {
            return;
        }
        kotlinx.coroutines.P.a(this.f410748d, th2);
    }

    @Override // kotlinx.coroutines.AbstractC43075a
    public final void D0(kotlin.G0 g02) {
        this.f411033e.h(null);
    }

    @Override // kotlinx.coroutines.channels.I0
    public final M0 r() {
        return this;
    }
}
