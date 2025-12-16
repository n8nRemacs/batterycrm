package o41;

import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: ScalarSubscription.java */
/* loaded from: classes8.dex */
public final class g<T> extends AtomicInteger implements q41.d<T> {
    private static final long serialVersionUID = -3830916580126663321L;

    /* renamed from: b, reason: collision with root package name */
    public final T f419378b;

    /* renamed from: c, reason: collision with root package name */
    public final org.reactivestreams.d<? super T> f419379c;

    /* JADX WARN: Multi-variable type inference failed */
    public g(Object obj, org.reactivestreams.d dVar) {
        this.f419379c = dVar;
        this.f419378b = obj;
    }

    @Override // org.reactivestreams.e
    public final void cancel() {
        lazySet(2);
    }

    @Override // q41.g
    public final void clear() {
        lazySet(1);
    }

    @Override // q41.g
    public final boolean isEmpty() {
        return get() != 0;
    }

    @Override // q41.g
    public final boolean offer(T t12) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // q41.g
    @j41.f
    public final T poll() {
        if (get() != 0) {
            return null;
        }
        lazySet(1);
        return this.f419378b;
    }

    @Override // org.reactivestreams.e
    public final void request(long j12) {
        if (SubscriptionHelper.h(j12) && compareAndSet(0, 1)) {
            org.reactivestreams.d<? super T> dVar = this.f419379c;
            dVar.onNext(this.f419378b);
            if (get() != 2) {
                dVar.e();
            }
        }
    }

    @Override // q41.InterfaceC47200c
    public final int v(int i12) {
        return i12 & 1;
    }
}
