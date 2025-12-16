package hu.akarnokd.rxjava3.operators;

import io.reactivex.rxjava3.core.AbstractC41777j;
import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.internal.fuseable.ConditionalSubscriber;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import o41.AbstractC44584d;

/* compiled from: FlowableRepeatSupplier.java */
/* loaded from: classes8.dex */
final class D<T> extends AbstractC41777j<T> {
    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super T> dVar) {
        if (dVar instanceof ConditionalSubscriber) {
            dVar.K(new a((ConditionalSubscriber) dVar));
        } else {
            dVar.K(new b((InterfaceC41782o) dVar));
        }
    }

    /* compiled from: FlowableRepeatSupplier.java */
    public static final class a<T> extends AbstractC44584d<T> {
        private static final long serialVersionUID = -231033913007168200L;

        /* renamed from: b, reason: collision with root package name */
        public final ConditionalSubscriber<? super T> f397914b;

        /* renamed from: c, reason: collision with root package name */
        public volatile boolean f397915c;

        public a(ConditionalSubscriber conditionalSubscriber) {
            this.f397914b = conditionalSubscriber;
        }

        public final void a() {
            if (this.f397915c) {
                return;
            }
            try {
                throw null;
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                this.f397914b.onError(th2);
            }
        }

        public final void b(long j12) {
            while (0 == j12) {
                if (this.f397915c) {
                    return;
                }
                j12 = get();
                if (0 == j12) {
                    j12 = addAndGet(-0L);
                    if (j12 == 0) {
                        return;
                    }
                }
            }
            if (this.f397915c) {
                return;
            }
            try {
                throw null;
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                this.f397914b.onError(th2);
            }
        }

        @Override // org.reactivestreams.e
        public final void cancel() {
            this.f397915c = true;
        }

        @Override // q41.g
        public final boolean isEmpty() {
            return false;
        }

        @Override // q41.g
        public final T poll() {
            throw null;
        }

        @Override // org.reactivestreams.e
        public final void request(long j12) {
            if (SubscriptionHelper.h(j12) && io.reactivex.rxjava3.internal.util.c.a(this, j12) == 0) {
                if (j12 == Long.MAX_VALUE) {
                    a();
                } else {
                    b(j12);
                }
            }
        }

        @Override // q41.InterfaceC47200c
        public final int v(int i12) {
            if ((i12 & 4) == 0) {
                return i12 & 1;
            }
            return 0;
        }

        @Override // q41.g
        public final void clear() {
        }
    }

    /* compiled from: FlowableRepeatSupplier.java */
    public static final class b<T> extends AbstractC44584d<T> {
        private static final long serialVersionUID = -231033913007168200L;

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC41782o f397916b;

        /* renamed from: c, reason: collision with root package name */
        public volatile boolean f397917c;

        public b(InterfaceC41782o interfaceC41782o) {
            this.f397916b = interfaceC41782o;
        }

        @Override // org.reactivestreams.e
        public final void cancel() {
            this.f397917c = true;
        }

        @Override // q41.g
        public final boolean isEmpty() {
            return false;
        }

        @Override // q41.g
        public final T poll() {
            throw null;
        }

        @Override // org.reactivestreams.e
        public final void request(long j12) {
            if (SubscriptionHelper.h(j12) && io.reactivex.rxjava3.internal.util.c.a(this, j12) == 0) {
                if (j12 == Long.MAX_VALUE) {
                    if (this.f397917c) {
                        return;
                    }
                    try {
                        throw null;
                    } catch (Throwable th2) {
                        io.reactivex.rxjava3.exceptions.a.a(th2);
                        this.f397916b.onError(th2);
                        return;
                    }
                }
                while (0 == j12) {
                    if (this.f397917c) {
                        return;
                    }
                    j12 = get();
                    if (0 == j12) {
                        j12 = addAndGet(-0L);
                        if (j12 == 0) {
                            return;
                        }
                    }
                }
                if (this.f397917c) {
                    return;
                }
                try {
                    throw null;
                } catch (Throwable th3) {
                    io.reactivex.rxjava3.exceptions.a.a(th3);
                    this.f397916b.onError(th3);
                }
            }
        }

        @Override // q41.InterfaceC47200c
        public final int v(int i12) {
            if ((i12 & 4) == 0) {
                return i12 & 1;
            }
            return 0;
        }

        @Override // q41.g
        public final void clear() {
        }
    }
}
