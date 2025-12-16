package io.reactivex.rxjava3.subjects;

import io.reactivex.rxjava3.core.G;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.observers.AbstractC41805c;
import j41.InterfaceC42196c;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import s41.C47998a;

/* compiled from: UnicastSubject.java */
/* loaded from: classes8.dex */
public final class j<T> extends i<T> {

    /* renamed from: b, reason: collision with root package name */
    public final q41.i<T> f405026b;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReference<Runnable> f405028d;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f405030f;

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f405031g;

    /* renamed from: h, reason: collision with root package name */
    public Throwable f405032h;

    /* renamed from: k, reason: collision with root package name */
    public boolean f405035k;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f405029e = true;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReference<G<? super T>> f405027c = new AtomicReference<>();

    /* renamed from: i, reason: collision with root package name */
    public final AtomicBoolean f405033i = new AtomicBoolean();

    /* renamed from: j, reason: collision with root package name */
    public final AbstractC41805c<T> f405034j = new a();

    /* compiled from: UnicastSubject.java */
    public final class a extends AbstractC41805c<T> {
        private static final long serialVersionUID = 7926949470189395511L;

        public a() {
        }

        @Override // q41.g
        public final void clear() {
            j.this.f405026b.clear();
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            if (j.this.f405030f) {
                return;
            }
            j.this.f405030f = true;
            j.this.O0();
            j.this.f405027c.lazySet(null);
            if (j.this.f405034j.getAndIncrement() == 0) {
                j.this.f405027c.lazySet(null);
                j jVar = j.this;
                if (jVar.f405035k) {
                    return;
                }
                jVar.f405026b.clear();
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return j.this.f405030f;
        }

        @Override // q41.g
        public final boolean isEmpty() {
            return j.this.f405026b.isEmpty();
        }

        @Override // q41.g
        @j41.f
        public final T poll() {
            return j.this.f405026b.poll();
        }

        @Override // q41.InterfaceC47200c
        public final int v(int i12) {
            j.this.f405035k = true;
            return 2;
        }
    }

    public j(int i12, Runnable runnable) {
        this.f405026b = new q41.i<>(i12);
        this.f405028d = new AtomicReference<>(runnable);
    }

    @j41.e
    @InterfaceC42196c
    public static j N0(@j41.e Runnable runnable) {
        io.reactivex.rxjava3.internal.functions.b.a(0, "capacityHint");
        Objects.requireNonNull(runnable, "onTerminate");
        return new j(0, runnable);
    }

    public final void O0() {
        AtomicReference<Runnable> atomicReference = this.f405028d;
        Runnable runnable = atomicReference.get();
        if (runnable != null) {
            while (!atomicReference.compareAndSet(runnable, null)) {
                if (atomicReference.get() != runnable) {
                    return;
                }
            }
            runnable.run();
        }
    }

    public final void P0() {
        Throwable th2;
        if (this.f405034j.getAndIncrement() != 0) {
            return;
        }
        G<? super T> g12 = this.f405027c.get();
        int iAddAndGet = 1;
        int iAddAndGet2 = 1;
        while (g12 == null) {
            iAddAndGet2 = this.f405034j.addAndGet(-iAddAndGet2);
            if (iAddAndGet2 == 0) {
                return;
            } else {
                g12 = this.f405027c.get();
            }
        }
        if (this.f405035k) {
            q41.i<T> iVar = this.f405026b;
            boolean z12 = this.f405029e;
            while (!this.f405030f) {
                boolean z13 = this.f405031g;
                if (!z12 && z13 && (th2 = this.f405032h) != null) {
                    this.f405027c.lazySet(null);
                    iVar.clear();
                    g12.onError(th2);
                    return;
                }
                g12.onNext(null);
                if (z13) {
                    this.f405027c.lazySet(null);
                    Throwable th3 = this.f405032h;
                    if (th3 != null) {
                        g12.onError(th3);
                        return;
                    } else {
                        g12.e();
                        return;
                    }
                }
                iAddAndGet = this.f405034j.addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
            this.f405027c.lazySet(null);
            return;
        }
        q41.i<T> iVar2 = this.f405026b;
        boolean z14 = this.f405029e;
        boolean z15 = true;
        int iAddAndGet3 = 1;
        while (!this.f405030f) {
            boolean z16 = this.f405031g;
            T tPoll = this.f405026b.poll();
            boolean z17 = tPoll == null;
            if (z16) {
                if (!z14 && z15) {
                    Throwable th4 = this.f405032h;
                    if (th4 != null) {
                        this.f405027c.lazySet(null);
                        iVar2.clear();
                        g12.onError(th4);
                        return;
                    }
                    z15 = false;
                }
                if (z17) {
                    this.f405027c.lazySet(null);
                    Throwable th5 = this.f405032h;
                    if (th5 != null) {
                        g12.onError(th5);
                        return;
                    } else {
                        g12.e();
                        return;
                    }
                }
            }
            if (z17) {
                iAddAndGet3 = this.f405034j.addAndGet(-iAddAndGet3);
                if (iAddAndGet3 == 0) {
                    return;
                }
            } else {
                g12.onNext(tPoll);
            }
        }
        this.f405027c.lazySet(null);
        iVar2.clear();
    }

    @Override // io.reactivex.rxjava3.core.G
    public final void b(io.reactivex.rxjava3.disposables.d dVar) {
        if (this.f405031g || this.f405030f) {
            dVar.dispose();
        }
    }

    @Override // io.reactivex.rxjava3.core.G
    public final void e() {
        if (this.f405031g || this.f405030f) {
            return;
        }
        this.f405031g = true;
        O0();
        P0();
    }

    @Override // io.reactivex.rxjava3.core.G
    public final void onError(Throwable th2) {
        io.reactivex.rxjava3.internal.util.h.c(th2, "onError called with a null Throwable.");
        if (this.f405031g || this.f405030f) {
            C47998a.b(th2);
            return;
        }
        this.f405032h = th2;
        this.f405031g = true;
        O0();
        P0();
    }

    @Override // io.reactivex.rxjava3.core.G
    public final void onNext(T t12) {
        io.reactivex.rxjava3.internal.util.h.c(t12, "onNext called with a null value.");
        if (this.f405031g || this.f405030f) {
            return;
        }
        this.f405026b.offer(t12);
        P0();
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(G<? super T> g12) {
        if (this.f405033i.get() || !this.f405033i.compareAndSet(false, true)) {
            EmptyDisposable.d(new IllegalStateException("Only a single observer allowed."), g12);
            return;
        }
        g12.b(this.f405034j);
        this.f405027c.lazySet(g12);
        if (this.f405030f) {
            this.f405027c.lazySet(null);
        } else {
            P0();
        }
    }
}
