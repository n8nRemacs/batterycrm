package hu.akarnokd.rxjava3.operators;

import io.reactivex.rxjava3.core.AbstractC41777j;
import io.reactivex.rxjava3.internal.subscriptions.EmptySubscription;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import s41.C47998a;

/* compiled from: FlowableGenerateAsync.java */
/* renamed from: hu.akarnokd.rxjava3.operators.u, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C41161u<T, S> extends AbstractC41777j<T> {

    /* compiled from: FlowableGenerateAsync.java */
    /* renamed from: hu.akarnokd.rxjava3.operators.u$b */
    public static final class b<T, S> extends AtomicInteger implements org.reactivestreams.e, InterfaceC41151j<T> {
        private static final long serialVersionUID = -2460374219999425947L;

        /* renamed from: b, reason: collision with root package name */
        public volatile int f398157b;

        /* renamed from: c, reason: collision with root package name */
        public volatile boolean f398158c;

        /* renamed from: d, reason: collision with root package name */
        public volatile boolean f398159d;

        /* renamed from: e, reason: collision with root package name */
        public long f398160e;

        public b() {
            throw null;
        }

        public final void b() {
            if (getAndIncrement() != 0) {
                return;
            }
            long j12 = this.f398160e;
            int iAddAndGet = 1;
            while (!this.f398159d) {
                boolean z12 = this.f398158c;
                int i12 = this.f398157b;
                if (z12 && i12 == 4) {
                    throw null;
                }
                int i13 = i12 & (-5);
                if (i13 == 1) {
                    throw null;
                }
                if (i13 != 2) {
                    this.f398160e = j12;
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    if ((i12 & 4) == 0) {
                        this.f398157b = 0;
                        throw null;
                    }
                    this.f398157b = 4;
                }
            }
            try {
                throw null;
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                C47998a.b(th2);
            }
        }

        @Override // org.reactivestreams.e
        public final void cancel() {
            this.f398159d = true;
            throw null;
        }

        @Override // io.reactivex.rxjava3.core.InterfaceC41776i
        public final void e() {
            this.f398157b |= 4;
            this.f398158c = true;
            b();
        }

        @Override // io.reactivex.rxjava3.core.InterfaceC41776i
        public final void onError(Throwable th2) {
            throw null;
        }

        @Override // io.reactivex.rxjava3.core.InterfaceC41776i
        public final void onNext(T t12) {
            t12.getClass();
            this.f398157b = 1;
            b();
        }

        @Override // org.reactivestreams.e
        public final void request(long j12) {
            io.reactivex.rxjava3.internal.util.c.a(null, j12);
            throw null;
        }
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super T> dVar) {
        try {
            throw null;
        } catch (Throwable th2) {
            io.reactivex.rxjava3.exceptions.a.a(th2);
            EmptySubscription.b(th2, dVar);
        }
    }

    /* compiled from: FlowableGenerateAsync.java */
    /* renamed from: hu.akarnokd.rxjava3.operators.u$a */
    public static final class a extends AtomicReference<l41.f> {

        /* renamed from: b, reason: collision with root package name */
        public static final l41.f f398156b = null;
        private static final long serialVersionUID = -8193511349691432602L;

        static {
            new C11348a();
        }

        /* compiled from: FlowableGenerateAsync.java */
        /* renamed from: hu.akarnokd.rxjava3.operators.u$a$a, reason: collision with other inner class name */
        public static class C11348a implements l41.f {
            @Override // l41.f
            public final void cancel() {
            }
        }
    }
}
