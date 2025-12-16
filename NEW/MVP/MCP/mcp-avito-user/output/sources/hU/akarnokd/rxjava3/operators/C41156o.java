package hu.akarnokd.rxjava3.operators;

import io.reactivex.rxjava3.core.AbstractC41777j;
import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.core.InterfaceC41783p;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.internal.subscriptions.EmptySubscription;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: FlowableErrorJump.java */
/* renamed from: hu.akarnokd.rxjava3.operators.o, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C41156o<T, R> extends AbstractC41777j<R> implements InterfaceC41783p<T, R> {

    /* compiled from: FlowableErrorJump.java */
    /* renamed from: hu.akarnokd.rxjava3.operators.o$a */
    public static final class a<T, R> extends AbstractC41777j<T> implements InterfaceC41782o<T>, org.reactivestreams.e {

        /* renamed from: c, reason: collision with root package name */
        public final AbstractC41777j<T> f398092c;

        /* renamed from: d, reason: collision with root package name */
        public final AtomicReference<org.reactivestreams.d<? super T>> f398093d = new AtomicReference<>();

        /* renamed from: e, reason: collision with root package name */
        public final a<T, R>.C11342a f398094e;

        /* renamed from: f, reason: collision with root package name */
        public org.reactivestreams.e f398095f;

        /* compiled from: FlowableErrorJump.java */
        /* renamed from: hu.akarnokd.rxjava3.operators.o$a$a, reason: collision with other inner class name */
        public final class C11342a extends AtomicReference<Throwable> implements InterfaceC41782o<R>, org.reactivestreams.e {
            private static final long serialVersionUID = -5718512540714037078L;

            /* renamed from: b, reason: collision with root package name */
            public final InterfaceC41782o f398096b;

            /* renamed from: c, reason: collision with root package name */
            public org.reactivestreams.e f398097c;

            public C11342a(InterfaceC41782o interfaceC41782o) {
                this.f398096b = interfaceC41782o;
            }

            @Override // org.reactivestreams.d
            public final void K(org.reactivestreams.e eVar) {
                this.f398097c = eVar;
                this.f398096b.K(this);
            }

            @Override // org.reactivestreams.e
            public final void cancel() {
                this.f398097c.cancel();
            }

            @Override // org.reactivestreams.d
            public final void e() {
                Throwable th2 = get();
                InterfaceC41782o interfaceC41782o = this.f398096b;
                if (th2 != null) {
                    interfaceC41782o.onError(th2);
                } else {
                    interfaceC41782o.e();
                }
            }

            @Override // org.reactivestreams.d
            public final void onError(Throwable th2) {
                Throwable th3 = get();
                if (th3 != null) {
                    th2 = new CompositeException(th3, th2);
                }
                this.f398096b.onError(th2);
            }

            @Override // org.reactivestreams.d
            public final void onNext(R r12) {
                this.f398096b.onNext(r12);
            }

            @Override // org.reactivestreams.e
            public final void request(long j12) {
                this.f398097c.request(j12);
            }
        }

        public a(AbstractC41777j abstractC41777j, InterfaceC41782o interfaceC41782o) {
            this.f398092c = abstractC41777j;
            this.f398094e = new C11342a(interfaceC41782o);
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            this.f398095f = eVar;
            this.f398093d.get().K(this);
        }

        @Override // org.reactivestreams.e
        public final void cancel() {
            this.f398095f.cancel();
        }

        @Override // org.reactivestreams.d
        public final void e() {
            this.f398093d.get().e();
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            this.f398094e.set(th2);
            this.f398093d.get().e();
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            this.f398093d.get().onNext(t12);
        }

        @Override // org.reactivestreams.e
        public final void request(long j12) {
            this.f398095f.request(j12);
        }

        @Override // io.reactivex.rxjava3.core.AbstractC41777j
        public final void u(org.reactivestreams.d<? super T> dVar) {
            AtomicReference<org.reactivestreams.d<? super T>> atomicReference = this.f398093d;
            while (!atomicReference.compareAndSet(null, dVar)) {
                if (atomicReference.get() != null) {
                    EmptySubscription.b(new IllegalStateException("Only one Subscriber allowed"), dVar);
                    return;
                }
            }
            this.f398092c.q(this);
        }
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super R> dVar) {
        new a(null, (InterfaceC41782o) dVar);
        try {
            throw null;
        } catch (Throwable th2) {
            io.reactivex.rxjava3.exceptions.a.a(th2);
            EmptySubscription.b(th2, dVar);
        }
    }
}
