package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.AbstractC41777j;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableMergeWithSingle.java */
/* loaded from: classes8.dex */
public final class G0<T> extends AbstractC41932a<T, T> {

    /* compiled from: ObservableMergeWithSingle.java */
    public static final class a<T> extends AtomicInteger implements io.reactivex.rxjava3.core.G<T>, io.reactivex.rxjava3.disposables.d {
        private static final long serialVersionUID = -4592979584110982903L;

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.G<? super T> f403623b;

        /* renamed from: c, reason: collision with root package name */
        public final AtomicReference<io.reactivex.rxjava3.disposables.d> f403624c = new AtomicReference<>();

        /* renamed from: d, reason: collision with root package name */
        public final C11491a<T> f403625d = new C11491a<>(this);

        /* renamed from: e, reason: collision with root package name */
        public final io.reactivex.rxjava3.internal.util.b f403626e = new io.reactivex.rxjava3.internal.util.b();

        /* renamed from: f, reason: collision with root package name */
        public volatile q41.i f403627f;

        /* renamed from: g, reason: collision with root package name */
        public T f403628g;

        /* renamed from: h, reason: collision with root package name */
        public volatile boolean f403629h;

        /* renamed from: i, reason: collision with root package name */
        public volatile boolean f403630i;

        /* renamed from: j, reason: collision with root package name */
        public volatile int f403631j;

        /* compiled from: ObservableMergeWithSingle.java */
        /* renamed from: io.reactivex.rxjava3.internal.operators.observable.G0$a$a, reason: collision with other inner class name */
        public static final class C11491a<T> extends AtomicReference<io.reactivex.rxjava3.disposables.d> implements io.reactivex.rxjava3.core.L<T> {
            private static final long serialVersionUID = -2935427570954647017L;

            /* renamed from: b, reason: collision with root package name */
            public final a<T> f403632b;

            public C11491a(a<T> aVar) {
                this.f403632b = aVar;
            }

            @Override // io.reactivex.rxjava3.core.L
            public final void b(io.reactivex.rxjava3.disposables.d dVar) {
                DisposableHelper.e(this, dVar);
            }

            @Override // io.reactivex.rxjava3.core.L
            public final void onError(Throwable th2) {
                a<T> aVar = this.f403632b;
                if (aVar.f403626e.b(th2)) {
                    DisposableHelper.a(aVar.f403624c);
                    if (aVar.getAndIncrement() == 0) {
                        aVar.a();
                    }
                }
            }

            @Override // io.reactivex.rxjava3.core.L
            public final void onSuccess(T t12) {
                a<T> aVar = this.f403632b;
                if (aVar.compareAndSet(0, 1)) {
                    aVar.f403623b.onNext(t12);
                    aVar.f403631j = 2;
                } else {
                    aVar.f403628g = t12;
                    aVar.f403631j = 1;
                    if (aVar.getAndIncrement() != 0) {
                        return;
                    }
                }
                aVar.a();
            }
        }

        public a(io.reactivex.rxjava3.core.G<? super T> g12) {
            this.f403623b = g12;
        }

        public final void a() {
            io.reactivex.rxjava3.core.G<? super T> g12 = this.f403623b;
            int iAddAndGet = 1;
            while (!this.f403629h) {
                if (this.f403626e.get() != null) {
                    this.f403628g = null;
                    this.f403627f = null;
                    this.f403626e.e(g12);
                    return;
                }
                int i12 = this.f403631j;
                if (i12 == 1) {
                    T t12 = this.f403628g;
                    this.f403628g = null;
                    this.f403631j = 2;
                    g12.onNext(t12);
                    i12 = 2;
                }
                boolean z12 = this.f403630i;
                q41.i iVar = this.f403627f;
                A00.b bVar = iVar != null ? (Object) iVar.poll() : null;
                boolean z13 = bVar == null;
                if (z12 && z13 && i12 == 2) {
                    this.f403627f = null;
                    g12.e();
                    return;
                } else if (z13) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    g12.onNext(bVar);
                }
            }
            this.f403628g = null;
            this.f403627f = null;
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            DisposableHelper.e(this.f403624c, dVar);
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            this.f403629h = true;
            DisposableHelper.a(this.f403624c);
            DisposableHelper.a(this.f403625d);
            this.f403626e.c();
            if (getAndIncrement() == 0) {
                this.f403627f = null;
                this.f403628g = null;
            }
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void e() {
            this.f403630i = true;
            if (getAndIncrement() == 0) {
                a();
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return DisposableHelper.b(this.f403624c.get());
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onError(Throwable th2) {
            if (this.f403626e.b(th2)) {
                DisposableHelper.a(this.f403625d);
                if (getAndIncrement() == 0) {
                    a();
                }
            }
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onNext(T t12) {
            if (compareAndSet(0, 1)) {
                this.f403623b.onNext(t12);
                if (decrementAndGet() == 0) {
                    return;
                }
            } else {
                q41.i iVar = this.f403627f;
                if (iVar == null) {
                    iVar = new q41.i(AbstractC41777j.f401972b);
                    this.f403627f = iVar;
                }
                iVar.offer(t12);
                if (getAndIncrement() != 0) {
                    return;
                }
            }
            a();
        }
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(io.reactivex.rxjava3.core.G<? super T> g12) {
        a aVar = new a(g12);
        g12.b(aVar);
        this.f403951b.c(aVar);
        throw null;
    }
}
