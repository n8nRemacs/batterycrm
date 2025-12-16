package kotlinx.coroutines.flow.internal;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlinx.coroutines.I0;
import kotlinx.coroutines.channels.M0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: SendingCollector.kt */
@I0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/coroutines/flow/internal/F;", "T", "Lkotlinx/coroutines/flow/j;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class F<T> implements InterfaceC43172j<T> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final M0<T> f411445b;

    /* JADX WARN: Multi-variable type inference failed */
    public F(@Y61.k M0<? super T> m02) {
        this.f411445b = m02;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC43172j
    @Y61.l
    public final Object emit(T t12, @Y61.k Continuation<? super G0> continuation) {
        Object objSend = this.f411445b.send(t12, continuation);
        return objSend == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objSend : G0.f406611a;
    }
}
