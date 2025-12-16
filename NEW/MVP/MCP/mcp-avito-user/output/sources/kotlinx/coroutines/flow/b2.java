package kotlinx.coroutines.flow;

import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.channels.BufferOverflow;

/* compiled from: Share.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0012\u0004\u0012\u00028\u00000\u0004¨\u0006\u0005"}, d2 = {"Lkotlinx/coroutines/flow/b2;", "T", "Lkotlinx/coroutines/flow/n2;", "Lkotlinx/coroutines/flow/c;", "Lkotlinx/coroutines/flow/internal/w;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
final class b2<T> implements n2<T>, InterfaceC43142c<T>, kotlinx.coroutines.flow.internal.w<T> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final kotlinx.coroutines.N0 f411342b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Z1 f411343c;

    public b2(@Y61.k Z1 z12, @Y61.l kotlinx.coroutines.N0 n02) {
        this.f411342b = n02;
        this.f411343c = z12;
    }

    @Override // kotlinx.coroutines.flow.internal.w
    @Y61.k
    public final InterfaceC43160i<T> Bc(@Y61.k CoroutineContext coroutineContext, int i12, @Y61.k BufferOverflow bufferOverflow) {
        return (((i12 < 0 || i12 >= 2) && i12 != -2) || bufferOverflow != BufferOverflow.f410778c) ? f2.d(this, coroutineContext, i12, bufferOverflow) : this;
    }

    @Override // kotlinx.coroutines.flow.d2
    @Y61.k
    public final List<T> E3() {
        return this.f411343c.E3();
    }

    @Override // kotlinx.coroutines.flow.InterfaceC43160i
    @Y61.l
    public final Object collect(@Y61.k InterfaceC43172j<? super T> interfaceC43172j, @Y61.k Continuation<?> continuation) {
        return this.f411343c.collect(interfaceC43172j, continuation);
    }

    @Override // kotlinx.coroutines.flow.n2
    public final T getValue() {
        return this.f411343c.getValue();
    }
}
