package hu.akarnokd.rxjava3.basetypes;

import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.internal.fuseable.QueueSubscription;

/* compiled from: SoloMapError.java */
/* loaded from: classes8.dex */
final class L1<T> extends AbstractC41073l1<T> {

    /* compiled from: SoloMapError.java */
    public static final class a<T> extends io.reactivex.rxjava3.internal.subscribers.b<T, T> {
        public a() {
            throw null;
        }

        @Override // io.reactivex.rxjava3.internal.subscribers.b, org.reactivestreams.d
        public final void onError(Throwable th2) {
            try {
                throw null;
            } catch (Throwable th3) {
                io.reactivex.rxjava3.exceptions.a.a(th3);
                super.onError(new CompositeException(th2, th3));
            }
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            this.f404774b.onNext(t12);
        }

        @Override // q41.g
        public final T poll() {
            return (T) this.qs.poll();
        }

        @Override // io.reactivex.rxjava3.internal.subscribers.b, q41.InterfaceC47200c
        public final int v(int i12) {
            QueueSubscription queueSubscription = this.qs;
            if (queueSubscription != null) {
                return queueSubscription.requestFusion(i12);
            }
            return 0;
        }
    }

    @Override // hu.akarnokd.rxjava3.basetypes.AbstractC41073l1
    public final void a(org.reactivestreams.d<? super T> dVar) {
        throw null;
    }
}
