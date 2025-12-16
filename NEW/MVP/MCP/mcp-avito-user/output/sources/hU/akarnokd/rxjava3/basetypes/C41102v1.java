package hu.akarnokd.rxjava3.basetypes;

import io.reactivex.rxjava3.internal.fuseable.QueueSubscription;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import o41.AbstractC44583c;
import s41.C47998a;

/* compiled from: SoloDoFinally.java */
/* renamed from: hu.akarnokd.rxjava3.basetypes.v1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C41102v1<T> extends AbstractC41073l1<T> {

    /* compiled from: SoloDoFinally.java */
    /* renamed from: hu.akarnokd.rxjava3.basetypes.v1$a */
    public static final class a<T> extends AbstractC44583c<T> implements org.reactivestreams.d<T> {
        private static final long serialVersionUID = -2447716698732984984L;

        /* renamed from: b, reason: collision with root package name */
        public final org.reactivestreams.d<? super T> f397789b;

        /* renamed from: c, reason: collision with root package name */
        public org.reactivestreams.e f397790c;

        /* renamed from: d, reason: collision with root package name */
        public QueueSubscription<T> f397791d;

        /* renamed from: e, reason: collision with root package name */
        public int f397792e;

        public a(org.reactivestreams.d dVar) {
            this.f397789b = dVar;
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.i(this.f397790c, eVar)) {
                this.f397790c = eVar;
                if (eVar instanceof QueueSubscription) {
                    this.f397791d = (QueueSubscription) eVar;
                }
                this.f397789b.K(this);
            }
        }

        @Override // org.reactivestreams.e
        public final void cancel() {
            this.f397790c.cancel();
            l();
        }

        @Override // q41.g
        public final void clear() {
            this.f397791d.clear();
        }

        @Override // org.reactivestreams.d
        public final void e() {
            this.f397789b.e();
            l();
        }

        @Override // q41.g
        public final boolean isEmpty() {
            return this.f397791d.isEmpty();
        }

        public final void l() {
            if (compareAndSet(0, 1)) {
                try {
                    throw null;
                } catch (Throwable th2) {
                    io.reactivex.rxjava3.exceptions.a.a(th2);
                    C47998a.b(th2);
                }
            }
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            this.f397789b.onError(th2);
            l();
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            this.f397789b.onNext(t12);
        }

        @Override // q41.g
        public final T poll() {
            T t12 = (T) this.f397791d.poll();
            if (this.f397792e == 1 && t12 == null) {
                l();
            }
            return t12;
        }

        @Override // org.reactivestreams.e
        public final void request(long j12) {
            this.f397790c.request(j12);
        }

        @Override // q41.InterfaceC47200c
        public final int v(int i12) {
            QueueSubscription<T> queueSubscription = this.f397791d;
            if (queueSubscription == null || (i12 & 4) != 0) {
                return 0;
            }
            int iRequestFusion = queueSubscription.requestFusion(i12);
            this.f397792e = iRequestFusion;
            return iRequestFusion;
        }
    }

    @Override // hu.akarnokd.rxjava3.basetypes.AbstractC41073l1
    public final void a(org.reactivestreams.d<? super T> dVar) {
        new a(dVar);
        throw null;
    }
}
