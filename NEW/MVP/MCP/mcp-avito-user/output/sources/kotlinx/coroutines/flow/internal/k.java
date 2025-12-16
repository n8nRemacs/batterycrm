package kotlinx.coroutines.flow.internal;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.C42822w;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: ChannelFlow.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/coroutines/flow/internal/k;", "T", "Lkotlinx/coroutines/flow/internal/j;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class k<T> extends j<T, T> {
    public k() {
        throw null;
    }

    public k(InterfaceC43160i interfaceC43160i, CoroutineContext coroutineContext, int i12, BufferOverflow bufferOverflow, int i13, C42822w c42822w) {
        super((i13 & 4) != 0 ? -3 : i12, (i13 & 2) != 0 ? EmptyCoroutineContext.INSTANCE : coroutineContext, (i13 & 8) != 0 ? BufferOverflow.f410777b : bufferOverflow, interfaceC43160i);
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractC43168f
    @Y61.k
    public final AbstractC43168f<T> c(@Y61.k CoroutineContext coroutineContext, int i12, @Y61.k BufferOverflow bufferOverflow) {
        return new k(i12, coroutineContext, bufferOverflow, this.f411487e);
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractC43168f
    @Y61.k
    public final InterfaceC43160i<T> d() {
        return (InterfaceC43160i<T>) this.f411487e;
    }

    @Override // kotlinx.coroutines.flow.internal.j
    @Y61.l
    public final Object f(@Y61.k InterfaceC43172j<? super T> interfaceC43172j, @Y61.k Continuation<? super G0> continuation) {
        Object objCollect = this.f411487e.collect(interfaceC43172j, continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
    }
}
