package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import s41.C47998a;

/* compiled from: ObservableDebounce.java */
/* loaded from: classes8.dex */
public final class D<T, U> extends AbstractC41932a<T, T> {

    /* renamed from: c, reason: collision with root package name */
    public final l41.o<? super T, ? extends io.reactivex.rxjava3.core.E<U>> f403534c;

    /* compiled from: ObservableDebounce.java */
    public static final class a<T, U> implements io.reactivex.rxjava3.core.G<T>, io.reactivex.rxjava3.disposables.d {

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.observers.m f403535b;

        /* renamed from: c, reason: collision with root package name */
        public final l41.o<? super T, ? extends io.reactivex.rxjava3.core.E<U>> f403536c;

        /* renamed from: d, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f403537d;

        /* renamed from: e, reason: collision with root package name */
        public final AtomicReference<io.reactivex.rxjava3.disposables.d> f403538e = new AtomicReference<>();

        /* renamed from: f, reason: collision with root package name */
        public volatile long f403539f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f403540g;

        /* compiled from: ObservableDebounce.java */
        /* renamed from: io.reactivex.rxjava3.internal.operators.observable.D$a$a, reason: collision with other inner class name */
        public static final class C11487a<T, U> extends io.reactivex.rxjava3.observers.e<U> {

            /* renamed from: c, reason: collision with root package name */
            public final a<T, U> f403541c;

            /* renamed from: d, reason: collision with root package name */
            public final long f403542d;

            /* renamed from: e, reason: collision with root package name */
            public final T f403543e;

            /* renamed from: f, reason: collision with root package name */
            public boolean f403544f;

            /* renamed from: g, reason: collision with root package name */
            public final AtomicBoolean f403545g = new AtomicBoolean();

            public C11487a(a<T, U> aVar, long j12, T t12) {
                this.f403541c = aVar;
                this.f403542d = j12;
                this.f403543e = t12;
            }

            public final void c() {
                if (this.f403545g.compareAndSet(false, true)) {
                    a<T, U> aVar = this.f403541c;
                    long j12 = this.f403542d;
                    T t12 = this.f403543e;
                    if (j12 == aVar.f403539f) {
                        aVar.f403535b.onNext(t12);
                    }
                }
            }

            @Override // io.reactivex.rxjava3.core.G
            public final void e() {
                if (this.f403544f) {
                    return;
                }
                this.f403544f = true;
                c();
            }

            @Override // io.reactivex.rxjava3.core.G
            public final void onError(Throwable th2) {
                if (this.f403544f) {
                    C47998a.b(th2);
                } else {
                    this.f403544f = true;
                    this.f403541c.onError(th2);
                }
            }

            @Override // io.reactivex.rxjava3.core.G
            public final void onNext(U u12) {
                if (this.f403544f) {
                    return;
                }
                this.f403544f = true;
                dispose();
                c();
            }
        }

        public a(io.reactivex.rxjava3.observers.m mVar, l41.o oVar) {
            this.f403535b = mVar;
            this.f403536c = oVar;
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            if (DisposableHelper.f(this.f403537d, dVar)) {
                this.f403537d = dVar;
                this.f403535b.b(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            this.f403537d.dispose();
            DisposableHelper.a(this.f403538e);
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void e() {
            if (this.f403540g) {
                return;
            }
            this.f403540g = true;
            AtomicReference<io.reactivex.rxjava3.disposables.d> atomicReference = this.f403538e;
            io.reactivex.rxjava3.disposables.d dVar = atomicReference.get();
            if (dVar != DisposableHelper.f401986b) {
                C11487a c11487a = (C11487a) dVar;
                if (c11487a != null) {
                    c11487a.c();
                }
                DisposableHelper.a(atomicReference);
                this.f403535b.e();
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return this.f403537d.getF318621e();
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onError(Throwable th2) {
            DisposableHelper.a(this.f403538e);
            this.f403535b.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onNext(T t12) {
            if (this.f403540g) {
                return;
            }
            long j12 = this.f403539f + 1;
            this.f403539f = j12;
            io.reactivex.rxjava3.disposables.d dVar = this.f403538e.get();
            if (dVar != null) {
                dVar.dispose();
            }
            try {
                io.reactivex.rxjava3.core.E<U> eApply = this.f403536c.apply(t12);
                Objects.requireNonNull(eApply, "The ObservableSource supplied is null");
                io.reactivex.rxjava3.core.E<U> e12 = eApply;
                C11487a c11487a = new C11487a(this, j12, t12);
                AtomicReference<io.reactivex.rxjava3.disposables.d> atomicReference = this.f403538e;
                while (!atomicReference.compareAndSet(dVar, c11487a)) {
                    if (atomicReference.get() != dVar) {
                        return;
                    }
                }
                e12.c(c11487a);
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                dispose();
                this.f403535b.onError(th2);
            }
        }
    }

    public D(io.reactivex.rxjava3.core.z zVar, l41.o oVar) {
        super(zVar);
        this.f403534c = oVar;
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(io.reactivex.rxjava3.core.G<? super T> g12) {
        this.f403951b.c(new a(new io.reactivex.rxjava3.observers.m(g12), this.f403534c));
    }
}
