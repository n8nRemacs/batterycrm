package hu.akarnokd.rxjava3.operators;

import io.reactivex.rxjava3.core.AbstractC41777j;
import io.reactivex.rxjava3.core.InterfaceC41781n;
import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.core.InterfaceC41783p;
import io.reactivex.rxjava3.internal.fuseable.SimplePlainQueue;
import io.reactivex.rxjava3.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: FlowableValve.java */
/* loaded from: classes8.dex */
final class S<T> extends AbstractC41777j<T> implements InterfaceC41781n<T, T>, InterfaceC41783p<T, T> {

    /* compiled from: FlowableValve.java */
    public static final class a<T> extends AtomicInteger implements org.reactivestreams.d<T>, org.reactivestreams.e {
        private static final long serialVersionUID = -2233734924340471378L;

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC41782o f397974b;

        /* renamed from: h, reason: collision with root package name */
        public volatile boolean f397980h;

        /* renamed from: j, reason: collision with root package name */
        public volatile boolean f397982j;

        /* renamed from: e, reason: collision with root package name */
        public final SimplePlainQueue<T> f397977e = new SpscLinkedArrayQueue(0);

        /* renamed from: i, reason: collision with root package name */
        public volatile boolean f397981i = false;

        /* renamed from: f, reason: collision with root package name */
        public final a<T>.C11324a f397978f = new C11324a();

        /* renamed from: d, reason: collision with root package name */
        public final AtomicLong f397976d = new AtomicLong();

        /* renamed from: g, reason: collision with root package name */
        public final io.reactivex.rxjava3.internal.util.b f397979g = new io.reactivex.rxjava3.internal.util.b();

        /* renamed from: c, reason: collision with root package name */
        public final AtomicReference<org.reactivestreams.e> f397975c = new AtomicReference<>();

        /* compiled from: FlowableValve.java */
        /* renamed from: hu.akarnokd.rxjava3.operators.S$a$a, reason: collision with other inner class name */
        public final class C11324a extends AtomicReference<org.reactivestreams.e> implements InterfaceC41782o<Boolean> {
            private static final long serialVersionUID = -3076915855750118155L;

            public C11324a() {
            }

            @Override // org.reactivestreams.d
            public final void K(org.reactivestreams.e eVar) {
                if (SubscriptionHelper.f(this, eVar)) {
                    eVar.request(Long.MAX_VALUE);
                }
            }

            @Override // org.reactivestreams.d
            public final void e() {
                a aVar = a.this;
                aVar.getClass();
                aVar.onError(new IllegalStateException("The valve source completed unexpectedly."));
            }

            @Override // org.reactivestreams.d
            public final void onError(Throwable th2) {
                a.this.onError(th2);
            }

            @Override // org.reactivestreams.d
            public final void onNext(Object obj) {
                a aVar = a.this;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                aVar.f397981i = zBooleanValue;
                if (zBooleanValue) {
                    aVar.a();
                }
            }
        }

        public a(InterfaceC41782o interfaceC41782o) {
            this.f397974b = interfaceC41782o;
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            SubscriptionHelper.c(this.f397975c, this.f397976d, eVar);
        }

        public final void a() {
            if (getAndIncrement() != 0) {
                return;
            }
            SimplePlainQueue<T> simplePlainQueue = this.f397977e;
            org.reactivestreams.d<?> dVar = this.f397974b;
            io.reactivex.rxjava3.internal.util.b bVar = this.f397979g;
            int iAddAndGet = 1;
            while (!this.f397982j) {
                if (bVar.get() != null) {
                    simplePlainQueue.clear();
                    SubscriptionHelper.a(this.f397975c);
                    SubscriptionHelper.a(this.f397978f);
                    bVar.g(dVar);
                    return;
                }
                if (this.f397981i) {
                    boolean z12 = this.f397980h;
                    Object objPoll = simplePlainQueue.poll();
                    boolean z13 = objPoll == 0;
                    if (z12 && z13) {
                        SubscriptionHelper.a(this.f397978f);
                        dVar.e();
                        return;
                    } else if (!z13) {
                        dVar.onNext(objPoll);
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
            simplePlainQueue.clear();
        }

        @Override // org.reactivestreams.e
        public final void cancel() {
            this.f397982j = true;
            SubscriptionHelper.a(this.f397975c);
            SubscriptionHelper.a(this.f397978f);
            this.f397979g.c();
        }

        @Override // org.reactivestreams.d
        public final void e() {
            this.f397980h = true;
            a();
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            if (this.f397979g.b(th2)) {
                a();
            }
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            this.f397977e.offer(t12);
            a();
        }

        @Override // org.reactivestreams.e
        public final void request(long j12) {
            SubscriptionHelper.b(this.f397975c, this.f397976d, j12);
        }
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super T> dVar) {
        InterfaceC41782o interfaceC41782o = (InterfaceC41782o) dVar;
        interfaceC41782o.K(new a(interfaceC41782o));
        throw null;
    }
}
