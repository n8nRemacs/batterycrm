package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import s41.C47998a;

/* compiled from: FlowableDebounce.java */
/* loaded from: classes8.dex */
public final class G<T, U> extends AbstractC41833b<T, T> {

    /* compiled from: FlowableDebounce.java */
    public static final class a<T, U> extends AtomicLong implements InterfaceC41782o<T>, org.reactivestreams.e {
        private static final long serialVersionUID = 6725975399620862591L;

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.subscribers.e f402337b;

        /* renamed from: c, reason: collision with root package name */
        public org.reactivestreams.e f402338c;

        /* renamed from: d, reason: collision with root package name */
        public final AtomicReference<io.reactivex.rxjava3.disposables.d> f402339d = new AtomicReference<>();

        /* renamed from: e, reason: collision with root package name */
        public volatile long f402340e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f402341f;

        /* compiled from: FlowableDebounce.java */
        /* renamed from: io.reactivex.rxjava3.internal.operators.flowable.G$a$a, reason: collision with other inner class name */
        public static final class C11451a<T, U> extends io.reactivex.rxjava3.subscribers.b<U> {

            /* renamed from: c, reason: collision with root package name */
            public boolean f402342c;

            public final void b() {
                throw null;
            }

            @Override // org.reactivestreams.d
            public final void e() {
                if (this.f402342c) {
                    return;
                }
                this.f402342c = true;
                b();
            }

            @Override // org.reactivestreams.d
            public final void onError(Throwable th2) {
                if (this.f402342c) {
                    C47998a.b(th2);
                } else {
                    this.f402342c = true;
                    throw null;
                }
            }

            @Override // org.reactivestreams.d
            public final void onNext(U u12) {
                if (this.f402342c) {
                    return;
                }
                this.f402342c = true;
                dispose();
                b();
            }
        }

        public a(io.reactivex.rxjava3.subscribers.e eVar) {
            this.f402337b = eVar;
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.i(this.f402338c, eVar)) {
                this.f402338c = eVar;
                this.f402337b.K(this);
                eVar.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.e
        public final void cancel() {
            this.f402338c.cancel();
            DisposableHelper.a(this.f402339d);
        }

        @Override // org.reactivestreams.d
        public final void e() {
            if (this.f402341f) {
                return;
            }
            this.f402341f = true;
            AtomicReference<io.reactivex.rxjava3.disposables.d> atomicReference = this.f402339d;
            io.reactivex.rxjava3.disposables.d dVar = atomicReference.get();
            if (DisposableHelper.b(dVar)) {
                return;
            }
            C11451a c11451a = (C11451a) dVar;
            if (c11451a != null) {
                c11451a.b();
            }
            DisposableHelper.a(atomicReference);
            this.f402337b.e();
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            DisposableHelper.a(this.f402339d);
            this.f402337b.onError(th2);
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            if (this.f402341f) {
                return;
            }
            this.f402340e++;
            io.reactivex.rxjava3.disposables.d dVar = this.f402339d.get();
            if (dVar != null) {
                dVar.dispose();
            }
            try {
                throw null;
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                cancel();
                this.f402337b.onError(th2);
            }
        }

        @Override // org.reactivestreams.e
        public final void request(long j12) {
            if (SubscriptionHelper.h(j12)) {
                io.reactivex.rxjava3.internal.util.c.a(this, j12);
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super T> dVar) {
        this.f402624c.q(new a(new io.reactivex.rxjava3.subscribers.e((InterfaceC41782o) dVar)));
    }
}
