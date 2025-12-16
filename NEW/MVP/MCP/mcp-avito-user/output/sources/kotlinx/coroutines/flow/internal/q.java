package kotlinx.coroutines.flow.internal;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;

/* compiled from: SafeCollector.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/flow/internal/q;", "Lkotlin/coroutines/CoroutineContext;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class q implements CoroutineContext {

    /* renamed from: b, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final Throwable f411573b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CoroutineContext f411574c;

    public q(@Y61.k CoroutineContext coroutineContext, @Y61.k Throwable th2) {
        this.f411573b = th2;
        this.f411574c = coroutineContext;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final <R> R fold(R r12, @Y61.k Y41.p<? super R, ? super CoroutineContext.Element, ? extends R> pVar) {
        return (R) this.f411574c.fold(r12, pVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    @Y61.l
    public final <E extends CoroutineContext.Element> E get(@Y61.k CoroutineContext.Key<E> key) {
        return (E) this.f411574c.get(key);
    }

    @Override // kotlin.coroutines.CoroutineContext
    @Y61.k
    public final CoroutineContext minusKey(@Y61.k CoroutineContext.Key<?> key) {
        return this.f411574c.minusKey(key);
    }

    @Override // kotlin.coroutines.CoroutineContext
    @Y61.k
    public final CoroutineContext plus(@Y61.k CoroutineContext coroutineContext) {
        return this.f411574c.plus(coroutineContext);
    }
}
