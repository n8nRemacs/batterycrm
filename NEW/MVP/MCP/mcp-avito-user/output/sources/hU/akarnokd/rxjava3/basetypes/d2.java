package hu.akarnokd.rxjava3.basetypes;

import io.reactivex.rxjava3.internal.fuseable.QueueSubscription;

/* compiled from: SoloUnsubscribeOn.java */
/* loaded from: classes8.dex */
final class d2<T> extends AbstractC41073l1<T> {

    /* compiled from: SoloUnsubscribeOn.java */
    public static final class a<T> extends io.reactivex.rxjava3.internal.subscribers.b<T, T> implements Runnable {
        public a() {
            throw null;
        }

        @Override // io.reactivex.rxjava3.internal.subscribers.b, org.reactivestreams.e
        public final void cancel() {
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            this.f404774b.onNext(t12);
        }

        @Override // q41.g
        public final T poll() {
            return (T) this.qs.poll();
        }

        @Override // java.lang.Runnable
        public final void run() {
            super.cancel();
        }

        @Override // io.reactivex.rxjava3.internal.subscribers.b, q41.InterfaceC47200c
        public final int v(int i12) {
            QueueSubscription queueSubscription = this.qs;
            if (queueSubscription == null) {
                return 0;
            }
            int iRequestFusion = queueSubscription.requestFusion(i12);
            this.f404778f = iRequestFusion;
            return iRequestFusion;
        }
    }

    @Override // hu.akarnokd.rxjava3.basetypes.AbstractC41073l1
    public final void a(org.reactivestreams.d<? super T> dVar) {
        throw null;
    }
}
