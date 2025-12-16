package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.channels.BufferOverflow;

/* compiled from: Share.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/coroutines/flow/h2;", "T", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
final class h2<T> {

    /* renamed from: a, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final InterfaceC43160i<T> f411426a;

    /* renamed from: b, reason: collision with root package name */
    @X41.f
    public final int f411427b;

    /* renamed from: c, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final BufferOverflow f411428c;

    /* renamed from: d, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final CoroutineContext f411429d;

    public h2(int i12, @Y61.k CoroutineContext coroutineContext, @Y61.k BufferOverflow bufferOverflow, @Y61.k InterfaceC43160i interfaceC43160i) {
        this.f411426a = interfaceC43160i;
        this.f411427b = i12;
        this.f411428c = bufferOverflow;
        this.f411429d = coroutineContext;
    }
}
