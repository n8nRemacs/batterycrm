package hu.akarnokd.rxjava3.processors;

import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicBoolean;
import org.reactivestreams.e;

/* compiled from: RefCountProcessor.java */
/* loaded from: classes8.dex */
final class d<T> extends io.reactivex.rxjava3.processors.c<T> implements e {

    /* compiled from: RefCountProcessor.java */
    public static final class a<T> extends AtomicBoolean implements InterfaceC41782o<T>, e {
        private static final long serialVersionUID = -4317488092687530631L;

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC41782o f398199b;

        /* renamed from: c, reason: collision with root package name */
        public final d<T> f398200c;

        /* renamed from: d, reason: collision with root package name */
        public e f398201d;

        public a(InterfaceC41782o interfaceC41782o, d dVar) {
            this.f398199b = interfaceC41782o;
            this.f398200c = dVar;
        }

        @Override // org.reactivestreams.d
        public final void K(e eVar) {
            this.f398201d = eVar;
            this.f398199b.K(this);
        }

        @Override // org.reactivestreams.e
        public final void cancel() {
            lazySet(true);
            this.f398201d.cancel();
            this.f398200c.getClass();
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void e() {
            this.f398199b.e();
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            this.f398199b.onError(th2);
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            this.f398199b.onNext(t12);
        }

        @Override // org.reactivestreams.e
        public final void request(long j12) {
            this.f398201d.request(j12);
        }
    }

    @Override // org.reactivestreams.d
    public final void K(e eVar) {
        if (SubscriptionHelper.f(null, eVar)) {
            throw null;
        }
    }

    @Override // org.reactivestreams.e
    public final void cancel() {
        SubscriptionHelper.a(null);
        throw null;
    }

    @Override // org.reactivestreams.d
    public final void e() {
        throw null;
    }

    @Override // org.reactivestreams.d
    public final void onError(Throwable th2) {
        throw null;
    }

    @Override // org.reactivestreams.d
    public final void onNext(T t12) {
        throw null;
    }

    @Override // org.reactivestreams.e
    public final void request(long j12) {
        throw null;
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super T> dVar) {
        new a((InterfaceC41782o) dVar, this);
        throw null;
    }
}
