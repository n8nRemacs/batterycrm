package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlinx.coroutines.H1;

/* compiled from: BufferedChannel.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/coroutines/channels/J0;", "E", "Lkotlinx/coroutines/H1;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
final class J0<E> implements H1 {

    /* renamed from: b, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final kotlinx.coroutines.r<B<? extends E>> f410807b;

    /* JADX WARN: Multi-variable type inference failed */
    public J0(@Y61.k kotlinx.coroutines.r<? super B<? extends E>> rVar) {
        this.f410807b = rVar;
    }

    @Override // kotlinx.coroutines.H1
    public final void c(@Y61.k kotlinx.coroutines.internal.X<?> x12, int i12) {
        this.f410807b.c(x12, i12);
    }
}
