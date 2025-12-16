package kotlinx.coroutines.flow.internal;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.K;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.I0;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.internal.g0;

/* compiled from: ChannelFlow.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b \u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/coroutines/flow/internal/j;", "S", "T", "Lkotlinx/coroutines/flow/internal/f;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public abstract class j<S, T> extends AbstractC43168f<T> {

    /* renamed from: e, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final InterfaceC43160i<S> f411487e;

    public j(int i12, @Y61.k CoroutineContext coroutineContext, @Y61.k BufferOverflow bufferOverflow, @Y61.k InterfaceC43160i interfaceC43160i) {
        super(coroutineContext, i12, bufferOverflow);
        this.f411487e = interfaceC43160i;
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractC43168f
    @Y61.l
    public final Object b(@Y61.k I0<? super T> i02, @Y61.k Continuation<? super G0> continuation) {
        Object objF = f(new F(i02), continuation);
        return objF == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objF : G0.f406611a;
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractC43168f, kotlinx.coroutines.flow.InterfaceC43160i
    @Y61.l
    public final Object collect(@Y61.k InterfaceC43172j<? super T> interfaceC43172j, @Y61.k Continuation<? super G0> continuation) {
        if (this.f411467c == -3) {
            CoroutineContext f411998b = continuation.getF411960f();
            CoroutineContext coroutineContextB = K.b(f411998b, this.f411466b);
            if (L.f(coroutineContextB, f411998b)) {
                Object objF = f(interfaceC43172j, continuation);
                return objF == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objF : G0.f406611a;
            }
            ContinuationInterceptor.Companion companion = ContinuationInterceptor.INSTANCE;
            if (L.f(coroutineContextB.get(companion), f411998b.get(companion))) {
                CoroutineContext f411998b2 = continuation.getF411960f();
                if (!(interfaceC43172j instanceof F ? true : interfaceC43172j instanceof y)) {
                    interfaceC43172j = new I(interfaceC43172j, f411998b2);
                }
                Object objA = C43169g.a(coroutineContextB, interfaceC43172j, coroutineContextB.fold(0, g0.f411899b), new C43171i(this, null), continuation);
                return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : G0.f406611a;
            }
        }
        Object objCollect = super.collect(interfaceC43172j, continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
    }

    @Y61.l
    public abstract Object f(@Y61.k InterfaceC43172j<? super T> interfaceC43172j, @Y61.k Continuation<? super G0> continuation);

    @Override // kotlinx.coroutines.flow.internal.AbstractC43168f
    @Y61.k
    public final String toString() {
        return this.f411487e + " -> " + super.toString();
    }
}
