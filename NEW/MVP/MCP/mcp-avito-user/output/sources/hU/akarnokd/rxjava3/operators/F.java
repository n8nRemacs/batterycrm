package hu.akarnokd.rxjava3.operators;

import io.reactivex.rxjava3.core.AbstractC41777j;
import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.core.InterfaceC41783p;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: FlowableRequestObserveOn.java */
/* loaded from: classes8.dex */
final class F<T> extends AbstractC41777j<T> implements InterfaceC41783p<T, T> {

    /* compiled from: FlowableRequestObserveOn.java */
    public static final class a<T> extends AtomicLong implements InterfaceC41782o<T>, org.reactivestreams.e, Runnable {
        private static final long serialVersionUID = 3167152788131496136L;

        /* renamed from: b, reason: collision with root package name */
        public org.reactivestreams.e f397919b;

        /* renamed from: c, reason: collision with root package name */
        public volatile T f397920c;

        /* renamed from: d, reason: collision with root package name */
        public Throwable f397921d;

        /* renamed from: e, reason: collision with root package name */
        public volatile boolean f397922e;

        /* renamed from: f, reason: collision with root package name */
        public long f397923f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f397924g;

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            this.f397919b = eVar;
            throw null;
        }

        @Override // org.reactivestreams.e
        public final void cancel() {
            this.f397919b.cancel();
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void e() {
            this.f397922e = true;
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            this.f397921d = th2;
            this.f397922e = true;
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            this.f397920c = t12;
            throw null;
        }

        @Override // org.reactivestreams.e
        public final void request(long j12) {
            io.reactivex.rxjava3.internal.util.c.a(this, j12);
            throw null;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f397924g) {
                return;
            }
            boolean z12 = this.f397922e;
            boolean z13 = this.f397920c == null;
            if (z12 && z13) {
                this.f397921d.getClass();
                throw null;
            }
            long j12 = this.f397923f;
            if (z13 || j12 == get()) {
                return;
            }
            this.f397920c = null;
            throw null;
        }
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super T> dVar) {
        throw null;
    }
}
