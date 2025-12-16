package hu.akarnokd.rxjava3.basetypes;

import io.reactivex.rxjava3.internal.fuseable.QueueSubscription;
import io.reactivex.rxjava3.internal.fuseable.SimpleQueue;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import o41.AbstractC44583c;

/* compiled from: SoloObserveOn.java */
/* loaded from: classes8.dex */
final class N1<T> extends AbstractC41073l1<T> {

    /* compiled from: SoloObserveOn.java */
    public static final class a<T> extends AbstractC44583c<T> implements org.reactivestreams.d<T>, Runnable {
        private static final long serialVersionUID = -658564450611526565L;

        /* renamed from: b, reason: collision with root package name */
        public org.reactivestreams.e f397589b;

        /* renamed from: c, reason: collision with root package name */
        public volatile boolean f397590c;

        /* renamed from: d, reason: collision with root package name */
        public Throwable f397591d;

        /* renamed from: e, reason: collision with root package name */
        public SimpleQueue<T> f397592e;

        /* renamed from: f, reason: collision with root package name */
        public volatile boolean f397593f;

        /* renamed from: g, reason: collision with root package name */
        public volatile boolean f397594g;

        /* renamed from: h, reason: collision with root package name */
        public int f397595h;

        /* renamed from: i, reason: collision with root package name */
        public boolean f397596i;

        public a() {
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.i(this.f397589b, eVar)) {
                this.f397589b = eVar;
                if (eVar instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) eVar;
                    int iRequestFusion = queueSubscription.requestFusion(7);
                    if (iRequestFusion == 1) {
                        this.f397595h = iRequestFusion;
                        this.f397592e = queueSubscription;
                        this.f397590c = true;
                        throw null;
                    }
                    if (iRequestFusion == 2) {
                        this.f397595h = iRequestFusion;
                        this.f397592e = queueSubscription;
                        throw null;
                    }
                }
                this.f397592e = new hu.akarnokd.rxjava3.util.d();
                throw null;
            }
        }

        @Override // org.reactivestreams.e
        public final void cancel() {
            if (this.f397593f) {
                return;
            }
            this.f397593f = true;
            this.f397589b.cancel();
            throw null;
        }

        @Override // q41.g
        public final void clear() {
            this.f397592e.clear();
        }

        @Override // org.reactivestreams.d
        public final void e() {
            this.f397590c = true;
            if (getAndIncrement() == 0) {
                throw null;
            }
        }

        @Override // q41.g
        public final boolean isEmpty() {
            return this.f397592e.isEmpty();
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            this.f397591d = th2;
            this.f397590c = true;
            if (getAndIncrement() == 0) {
                throw null;
            }
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            if (this.f397595h == 0) {
                this.f397592e.offer(t12);
            }
            if (getAndIncrement() == 0) {
                throw null;
            }
        }

        @Override // q41.g
        public final T poll() {
            return (T) this.f397592e.poll();
        }

        @Override // org.reactivestreams.e
        public final void request(long j12) {
            if (SubscriptionHelper.h(j12)) {
                this.f397594g = true;
                if (getAndIncrement() == 0) {
                    throw null;
                }
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            SimpleQueue<T> simpleQueue = this.f397592e;
            int iAddAndGet = 1;
            while (!this.f397593f) {
                boolean z12 = this.f397590c;
                if (this.f397594g) {
                    if (!this.f397596i) {
                        try {
                            if (simpleQueue.poll() != null) {
                                throw null;
                            }
                        } catch (Throwable th2) {
                            io.reactivex.rxjava3.exceptions.a.a(th2);
                            simpleQueue.clear();
                            throw null;
                        }
                    } else if (!simpleQueue.isEmpty()) {
                        throw null;
                    }
                }
                if (z12) {
                    if (this.f397591d != null) {
                        throw null;
                    }
                    if (simpleQueue.isEmpty()) {
                        throw null;
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
            simpleQueue.clear();
        }

        @Override // q41.InterfaceC47200c
        public final int v(int i12) {
            if ((i12 & 2) == 0) {
                return 0;
            }
            this.f397596i = true;
            return 2;
        }
    }

    @Override // hu.akarnokd.rxjava3.basetypes.AbstractC41073l1
    public final void a(org.reactivestreams.d<? super T> dVar) {
        throw null;
    }
}
