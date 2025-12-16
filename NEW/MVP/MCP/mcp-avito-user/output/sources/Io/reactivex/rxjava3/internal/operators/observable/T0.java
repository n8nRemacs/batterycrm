package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p41.AbstractC46894a;
import s41.C47998a;

/* compiled from: ObservableRefCount.java */
/* loaded from: classes8.dex */
public final class T0<T> extends io.reactivex.rxjava3.core.z<T> {

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC46894a<T> f403852b;

    /* renamed from: c, reason: collision with root package name */
    public final int f403853c;

    /* renamed from: d, reason: collision with root package name */
    public final long f403854d;

    /* renamed from: e, reason: collision with root package name */
    public final TimeUnit f403855e;

    /* renamed from: f, reason: collision with root package name */
    public final io.reactivex.rxjava3.core.H f403856f;

    /* renamed from: g, reason: collision with root package name */
    public a f403857g;

    /* compiled from: ObservableRefCount.java */
    public static final class a extends AtomicReference<io.reactivex.rxjava3.disposables.d> implements Runnable, l41.g<io.reactivex.rxjava3.disposables.d> {
        private static final long serialVersionUID = -4552101107598366241L;

        /* renamed from: b, reason: collision with root package name */
        public final T0<?> f403858b;

        /* renamed from: c, reason: collision with root package name */
        public m41.d f403859c;

        /* renamed from: d, reason: collision with root package name */
        public long f403860d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f403861e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f403862f;

        public a(T0<?> t02) {
            this.f403858b = t02;
        }

        @Override // l41.g
        public final void accept(io.reactivex.rxjava3.disposables.d dVar) {
            DisposableHelper.c(this, dVar);
            synchronized (this.f403858b) {
                try {
                    if (this.f403862f) {
                        this.f403858b.f403852b.P0();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f403858b.N0(this);
        }
    }

    /* compiled from: ObservableRefCount.java */
    public static final class b<T> extends AtomicBoolean implements io.reactivex.rxjava3.core.G<T>, io.reactivex.rxjava3.disposables.d {
        private static final long serialVersionUID = -7419642935409022375L;

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.G<? super T> f403863b;

        /* renamed from: c, reason: collision with root package name */
        public final T0<T> f403864c;

        /* renamed from: d, reason: collision with root package name */
        public final a f403865d;

        /* renamed from: e, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f403866e;

        public b(io.reactivex.rxjava3.core.G<? super T> g12, T0<T> t02, a aVar) {
            this.f403863b = g12;
            this.f403864c = t02;
            this.f403865d = aVar;
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            if (DisposableHelper.f(this.f403866e, dVar)) {
                this.f403866e = dVar;
                this.f403863b.b(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            this.f403866e.dispose();
            if (compareAndSet(false, true)) {
                T0<T> t02 = this.f403864c;
                a aVar = this.f403865d;
                synchronized (t02) {
                    try {
                        a aVar2 = t02.f403857g;
                        if (aVar2 != null && aVar2 == aVar) {
                            long j12 = aVar.f403860d - 1;
                            aVar.f403860d = j12;
                            if (j12 == 0 && aVar.f403861e) {
                                if (t02.f403854d == 0) {
                                    t02.N0(aVar);
                                } else {
                                    m41.d dVar = new m41.d();
                                    aVar.f403859c = dVar;
                                    DisposableHelper.c(dVar, t02.f403856f.e(aVar, t02.f403854d, t02.f403855e));
                                }
                            }
                        }
                    } finally {
                    }
                }
            }
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void e() {
            if (compareAndSet(false, true)) {
                this.f403864c.M0(this.f403865d);
                this.f403863b.e();
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return this.f403866e.getF318621e();
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onError(Throwable th2) {
            if (!compareAndSet(false, true)) {
                C47998a.b(th2);
            } else {
                this.f403864c.M0(this.f403865d);
                this.f403863b.onError(th2);
            }
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onNext(T t12) {
            this.f403863b.onNext(t12);
        }
    }

    public T0() {
        throw null;
    }

    public T0(AbstractC46894a abstractC46894a, long j12, TimeUnit timeUnit, io.reactivex.rxjava3.core.H h12) {
        this.f403852b = abstractC46894a;
        this.f403853c = 1;
        this.f403854d = j12;
        this.f403855e = timeUnit;
        this.f403856f = h12;
    }

    public final void M0(a aVar) {
        synchronized (this) {
            try {
                if (this.f403857g == aVar) {
                    m41.d dVar = aVar.f403859c;
                    if (dVar != null) {
                        DisposableHelper.a(dVar);
                        aVar.f403859c = null;
                    }
                    long j12 = aVar.f403860d - 1;
                    aVar.f403860d = j12;
                    if (j12 == 0) {
                        this.f403857g = null;
                        this.f403852b.P0();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void N0(a aVar) {
        synchronized (this) {
            try {
                if (aVar.f403860d == 0 && aVar == this.f403857g) {
                    this.f403857g = null;
                    io.reactivex.rxjava3.disposables.d dVar = aVar.get();
                    DisposableHelper.a(aVar);
                    if (dVar == null) {
                        aVar.f403862f = true;
                    } else {
                        this.f403852b.P0();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(io.reactivex.rxjava3.core.G<? super T> g12) {
        a aVar;
        boolean z12;
        m41.d dVar;
        synchronized (this) {
            try {
                aVar = this.f403857g;
                if (aVar == null) {
                    aVar = new a(this);
                    this.f403857g = aVar;
                }
                long j12 = aVar.f403860d;
                if (j12 == 0 && (dVar = aVar.f403859c) != null) {
                    DisposableHelper.a(dVar);
                }
                long j13 = j12 + 1;
                aVar.f403860d = j13;
                if (aVar.f403861e || j13 != this.f403853c) {
                    z12 = false;
                } else {
                    z12 = true;
                    aVar.f403861e = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f403852b.c(new b(g12, this, aVar));
        if (z12) {
            this.f403852b.O0(aVar);
        }
    }
}
