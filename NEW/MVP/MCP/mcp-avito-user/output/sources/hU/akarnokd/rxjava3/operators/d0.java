package hu.akarnokd.rxjava3.operators;

import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableErrorJump.java */
/* loaded from: classes8.dex */
final class d0<T, R> extends io.reactivex.rxjava3.core.z<R> implements io.reactivex.rxjava3.core.F<T, R> {

    /* renamed from: b, reason: collision with root package name */
    public final io.reactivex.rxjava3.core.z<T> f398006b;

    /* compiled from: ObservableErrorJump.java */
    public static final class a<T, R> extends io.reactivex.rxjava3.core.z<T> implements io.reactivex.rxjava3.core.G<T>, io.reactivex.rxjava3.disposables.d {

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.z<T> f398007b;

        /* renamed from: c, reason: collision with root package name */
        public final AtomicReference<io.reactivex.rxjava3.core.G<? super T>> f398008c = new AtomicReference<>();

        /* renamed from: d, reason: collision with root package name */
        public final a<T, R>.C11333a f398009d;

        /* renamed from: e, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f398010e;

        /* compiled from: ObservableErrorJump.java */
        /* renamed from: hu.akarnokd.rxjava3.operators.d0$a$a, reason: collision with other inner class name */
        public final class C11333a extends AtomicReference<Throwable> implements io.reactivex.rxjava3.core.G<R>, io.reactivex.rxjava3.disposables.d {
            private static final long serialVersionUID = -5718512540714037078L;

            /* renamed from: b, reason: collision with root package name */
            public final io.reactivex.rxjava3.core.G<? super R> f398011b;

            /* renamed from: c, reason: collision with root package name */
            public io.reactivex.rxjava3.disposables.d f398012c;

            public C11333a(io.reactivex.rxjava3.core.G g12) {
                this.f398011b = g12;
            }

            @Override // io.reactivex.rxjava3.core.G
            public final void b(io.reactivex.rxjava3.disposables.d dVar) {
                this.f398012c = dVar;
                this.f398011b.b(this);
            }

            @Override // io.reactivex.rxjava3.disposables.d
            public final void dispose() {
                this.f398012c.dispose();
            }

            @Override // io.reactivex.rxjava3.core.G
            public final void e() {
                Throwable th2 = get();
                io.reactivex.rxjava3.core.G<? super R> g12 = this.f398011b;
                if (th2 != null) {
                    g12.onError(th2);
                } else {
                    g12.e();
                }
            }

            @Override // io.reactivex.rxjava3.disposables.d
            /* renamed from: i */
            public final boolean getF318621e() {
                return this.f398012c.getF318621e();
            }

            @Override // io.reactivex.rxjava3.core.G
            public final void onError(Throwable th2) {
                Throwable th3 = get();
                if (th3 != null) {
                    th2 = new CompositeException(th3, th2);
                }
                this.f398011b.onError(th2);
            }

            @Override // io.reactivex.rxjava3.core.G
            public final void onNext(R r12) {
                this.f398011b.onNext(r12);
            }
        }

        public a(io.reactivex.rxjava3.core.z<T> zVar, io.reactivex.rxjava3.core.G<? super R> g12) {
            this.f398007b = zVar;
            this.f398009d = new C11333a(g12);
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            this.f398010e = dVar;
            this.f398008c.get().b(this);
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            this.f398010e.dispose();
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void e() {
            this.f398008c.get().e();
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return this.f398010e.getF318621e();
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onError(Throwable th2) {
            this.f398009d.set(th2);
            this.f398008c.get().e();
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onNext(T t12) {
            this.f398008c.get().onNext(t12);
        }

        @Override // io.reactivex.rxjava3.core.z
        public final void w0(io.reactivex.rxjava3.core.G<? super T> g12) {
            AtomicReference<io.reactivex.rxjava3.core.G<? super T>> atomicReference = this.f398008c;
            while (!atomicReference.compareAndSet(null, g12)) {
                if (atomicReference.get() != null) {
                    EmptyDisposable.d(new IllegalStateException("Only one Subscriber allowed"), g12);
                    return;
                }
            }
            this.f398007b.c(this);
        }
    }

    public d0(io.reactivex.rxjava3.core.z zVar) {
        this.f398006b = zVar;
    }

    @Override // io.reactivex.rxjava3.core.F
    public final io.reactivex.rxjava3.core.E<R> a(io.reactivex.rxjava3.core.z<T> zVar) {
        return new d0(zVar);
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(io.reactivex.rxjava3.core.G<? super R> g12) {
        new a(this.f398006b, g12);
        try {
            throw null;
        } catch (Throwable th2) {
            io.reactivex.rxjava3.exceptions.a.a(th2);
            EmptyDisposable.d(th2, g12);
        }
    }
}
