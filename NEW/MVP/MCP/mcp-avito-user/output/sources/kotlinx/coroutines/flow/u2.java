package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: Emitters.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001¨\u0006\u0003"}, d2 = {"Lkotlinx/coroutines/flow/u2;", "Lkotlinx/coroutines/flow/j;", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class u2 implements InterfaceC43172j<Object> {

    /* renamed from: b, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final Throwable f411788b;

    public u2(@Y61.k Throwable th2) {
        this.f411788b = th2;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC43172j
    @Y61.l
    public final Object emit(@Y61.l Object obj, @Y61.k Continuation<? super kotlin.G0> continuation) throws Throwable {
        throw this.f411788b;
    }
}
