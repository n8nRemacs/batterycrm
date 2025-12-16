package kotlinx.coroutines.internal;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.u1;

/* compiled from: ThreadContext.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/coroutines/internal/h0;", "T", "Lkotlinx/coroutines/u1;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class h0<T> implements u1<T> {

    /* renamed from: b, reason: collision with root package name */
    public final Integer f411906b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final ThreadLocal<T> f411907c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final i0 f411908d;

    public h0(Integer num, @Y61.k ThreadLocal threadLocal) {
        this.f411906b = num;
        this.f411907c = threadLocal;
        this.f411908d = new i0(threadLocal);
    }

    @Override // kotlinx.coroutines.u1
    public final T R(@Y61.k CoroutineContext coroutineContext) {
        ThreadLocal<T> threadLocal = this.f411907c;
        T t12 = (T) threadLocal.get();
        threadLocal.set(this.f411906b);
        return t12;
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public final <R> R fold(R r12, @Y61.k Y41.p<? super R, ? super CoroutineContext.Element, ? extends R> pVar) {
        return (R) CoroutineContext.Element.DefaultImpls.fold(this, r12, pVar);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    @Y61.l
    public final <E extends CoroutineContext.Element> E get(@Y61.k CoroutineContext.Key<E> key) {
        if (this.f411908d.equals(key)) {
            return this;
        }
        return null;
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    @Y61.k
    public final CoroutineContext.Key<?> getKey() {
        return this.f411908d;
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    @Y61.k
    public final CoroutineContext minusKey(@Y61.k CoroutineContext.Key<?> key) {
        return this.f411908d.equals(key) ? EmptyCoroutineContext.INSTANCE : this;
    }

    @Override // kotlinx.coroutines.u1
    public final void o(Object obj) {
        this.f411907c.set(obj);
    }

    @Override // kotlin.coroutines.CoroutineContext
    @Y61.k
    public final CoroutineContext plus(@Y61.k CoroutineContext coroutineContext) {
        return CoroutineContext.Element.DefaultImpls.plus(this, coroutineContext);
    }

    @Y61.k
    public final String toString() {
        return "ThreadLocal(value=" + this.f411906b + ", threadLocal = " + this.f411907c + ')';
    }
}
