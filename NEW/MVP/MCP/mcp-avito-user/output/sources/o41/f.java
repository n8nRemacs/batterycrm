package o41;

import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;

/* compiled from: DeferredScalarSubscription.java */
/* loaded from: classes8.dex */
public class f<T> extends AbstractC44583c<T> {
    private static final long serialVersionUID = -2151279923272604993L;

    /* renamed from: b, reason: collision with root package name */
    public final org.reactivestreams.d<? super T> f419376b;

    /* renamed from: c, reason: collision with root package name */
    public T f419377c;

    public f(org.reactivestreams.d<? super T> dVar) {
        this.f419376b = dVar;
    }

    public void cancel() {
        set(4);
        this.f419377c = null;
    }

    @Override // q41.g
    public final void clear() {
        lazySet(32);
        this.f419377c = null;
    }

    @Override // q41.g
    public final boolean isEmpty() {
        return get() != 16;
    }

    public final void l(T t12) {
        int i12 = get();
        do {
            org.reactivestreams.d<? super T> dVar = this.f419376b;
            if (i12 == 8) {
                this.f419377c = t12;
                lazySet(16);
                dVar.onNext(null);
                if (get() != 4) {
                    dVar.e();
                    return;
                }
                return;
            }
            if ((i12 & (-3)) != 0) {
                return;
            }
            if (i12 == 2) {
                lazySet(3);
                dVar.onNext(t12);
                if (get() != 4) {
                    dVar.e();
                    return;
                }
                return;
            }
            this.f419377c = t12;
            if (compareAndSet(0, 1)) {
                return;
            } else {
                i12 = get();
            }
        } while (i12 != 4);
        this.f419377c = null;
    }

    public final boolean m() {
        return get() == 4;
    }

    public void onSuccess(T t12) {
        l(t12);
    }

    @Override // q41.g
    @j41.f
    public final T poll() {
        if (get() != 16) {
            return null;
        }
        lazySet(32);
        T t12 = this.f419377c;
        this.f419377c = null;
        return t12;
    }

    @Override // org.reactivestreams.e
    public final void request(long j12) {
        T t12;
        if (SubscriptionHelper.h(j12)) {
            do {
                int i12 = get();
                if ((i12 & (-2)) != 0) {
                    return;
                }
                if (i12 == 1) {
                    if (!compareAndSet(1, 3) || (t12 = this.f419377c) == null) {
                        return;
                    }
                    this.f419377c = null;
                    org.reactivestreams.d<? super T> dVar = this.f419376b;
                    dVar.onNext(t12);
                    if (get() != 4) {
                        dVar.e();
                        return;
                    }
                    return;
                }
            } while (!compareAndSet(0, 2));
        }
    }

    @Override // q41.InterfaceC47200c
    public final int v(int i12) {
        if ((i12 & 2) == 0) {
            return 0;
        }
        lazySet(8);
        return 2;
    }
}
