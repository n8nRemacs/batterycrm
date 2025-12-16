package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.BackpressureOverflowStrategy;
import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import s41.C47998a;

/* compiled from: FlowableOnBackpressureBufferStrategy.java */
/* loaded from: classes8.dex */
public final class Q0<T> extends AbstractC41833b<T, T> {

    /* compiled from: FlowableOnBackpressureBufferStrategy.java */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f402510a;

        static {
            int[] iArr = new int[BackpressureOverflowStrategy.values().length];
            f402510a = iArr;
            try {
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f402510a[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: FlowableOnBackpressureBufferStrategy.java */
    public static final class b<T> extends AtomicInteger implements InterfaceC41782o<T>, org.reactivestreams.e {
        private static final long serialVersionUID = 3240706908776709697L;

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC41782o f402511b;

        /* renamed from: c, reason: collision with root package name */
        public final AtomicLong f402512c = new AtomicLong();

        /* renamed from: d, reason: collision with root package name */
        public final ArrayDeque f402513d = new ArrayDeque();

        /* renamed from: e, reason: collision with root package name */
        public org.reactivestreams.e f402514e;

        /* renamed from: f, reason: collision with root package name */
        public volatile boolean f402515f;

        /* renamed from: g, reason: collision with root package name */
        public volatile boolean f402516g;

        /* renamed from: h, reason: collision with root package name */
        public Throwable f402517h;

        public b(InterfaceC41782o interfaceC41782o) {
            this.f402511b = interfaceC41782o;
        }

        public static void a(ArrayDeque arrayDeque) {
            synchronized (arrayDeque) {
                arrayDeque.clear();
            }
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.i(this.f402514e, eVar)) {
                this.f402514e = eVar;
                this.f402511b.K(this);
                eVar.request(Long.MAX_VALUE);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void b() {
            boolean zIsEmpty;
            Object objPoll;
            if (getAndIncrement() != 0) {
                return;
            }
            ArrayDeque arrayDeque = this.f402513d;
            InterfaceC41782o interfaceC41782o = this.f402511b;
            int iAddAndGet = 1;
            do {
                long j12 = this.f402512c.get();
                long j13 = 0;
                while (j13 != j12) {
                    if (this.f402515f) {
                        a(arrayDeque);
                        return;
                    }
                    boolean z12 = this.f402516g;
                    synchronized (arrayDeque) {
                        objPoll = arrayDeque.poll();
                    }
                    boolean z13 = objPoll == null;
                    if (z12) {
                        Throwable th2 = this.f402517h;
                        if (th2 != null) {
                            a(arrayDeque);
                            interfaceC41782o.onError(th2);
                            return;
                        } else if (z13) {
                            interfaceC41782o.e();
                            return;
                        }
                    }
                    if (z13) {
                        break;
                    }
                    interfaceC41782o.onNext(objPoll);
                    j13++;
                }
                if (j13 == j12) {
                    if (this.f402515f) {
                        a(arrayDeque);
                        return;
                    }
                    boolean z14 = this.f402516g;
                    synchronized (arrayDeque) {
                        zIsEmpty = arrayDeque.isEmpty();
                    }
                    if (z14) {
                        Throwable th3 = this.f402517h;
                        if (th3 != null) {
                            a(arrayDeque);
                            interfaceC41782o.onError(th3);
                            return;
                        } else if (zIsEmpty) {
                            interfaceC41782o.e();
                            return;
                        }
                    }
                }
                if (j13 != 0) {
                    io.reactivex.rxjava3.internal.util.c.e(this.f402512c, j13);
                }
                iAddAndGet = addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // org.reactivestreams.e
        public final void cancel() {
            this.f402515f = true;
            this.f402514e.cancel();
            if (getAndIncrement() == 0) {
                a(this.f402513d);
            }
        }

        @Override // org.reactivestreams.d
        public final void e() {
            this.f402516g = true;
            b();
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            if (this.f402516g) {
                C47998a.b(th2);
                return;
            }
            this.f402517h = th2;
            this.f402516g = true;
            b();
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            if (this.f402516g) {
                return;
            }
            ArrayDeque arrayDeque = this.f402513d;
            synchronized (arrayDeque) {
                if (arrayDeque.size() == 0) {
                    throw null;
                }
                arrayDeque.offer(t12);
            }
            b();
        }

        @Override // org.reactivestreams.e
        public final void request(long j12) {
            if (SubscriptionHelper.h(j12)) {
                io.reactivex.rxjava3.internal.util.c.a(this.f402512c, j12);
                b();
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super T> dVar) {
        this.f402624c.q(new b((InterfaceC41782o) dVar));
    }
}
