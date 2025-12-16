package io.reactivex.rxjava3.internal.operators.completable;

import io.reactivex.rxjava3.core.AbstractC41768a;
import io.reactivex.rxjava3.core.InterfaceC41771d;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import s41.C47998a;

/* compiled from: CompletableTimeout.java */
/* loaded from: classes8.dex */
public final class O extends AbstractC41768a {

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC41768a f402190b;

    /* renamed from: c, reason: collision with root package name */
    public final long f402191c = 10000;

    /* renamed from: d, reason: collision with root package name */
    public final TimeUnit f402192d;

    /* renamed from: e, reason: collision with root package name */
    public final io.reactivex.rxjava3.core.H f402193e;

    /* compiled from: CompletableTimeout.java */
    public final class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final AtomicBoolean f402194b;

        /* renamed from: c, reason: collision with root package name */
        public final io.reactivex.rxjava3.disposables.c f402195c;

        /* renamed from: d, reason: collision with root package name */
        public final InterfaceC41771d f402196d;

        /* compiled from: CompletableTimeout.java */
        /* renamed from: io.reactivex.rxjava3.internal.operators.completable.O$a$a, reason: collision with other inner class name */
        public final class C11445a implements InterfaceC41771d {
            @Override // io.reactivex.rxjava3.core.InterfaceC41771d
            public final void b(io.reactivex.rxjava3.disposables.d dVar) {
                throw null;
            }

            @Override // io.reactivex.rxjava3.core.InterfaceC41771d
            public final void e() {
                throw null;
            }

            @Override // io.reactivex.rxjava3.core.InterfaceC41771d
            public final void onError(Throwable th2) {
                throw null;
            }
        }

        public a(AtomicBoolean atomicBoolean, io.reactivex.rxjava3.disposables.c cVar, InterfaceC41771d interfaceC41771d) {
            this.f402194b = atomicBoolean;
            this.f402195c = cVar;
            this.f402196d = interfaceC41771d;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f402194b.compareAndSet(false, true)) {
                this.f402195c.e();
                O o12 = O.this;
                this.f402196d.onError(new TimeoutException(io.reactivex.rxjava3.internal.util.h.e(o12.f402191c, o12.f402192d)));
            }
        }
    }

    /* compiled from: CompletableTimeout.java */
    public static final class b implements InterfaceC41771d {

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.disposables.c f402198b;

        /* renamed from: c, reason: collision with root package name */
        public final AtomicBoolean f402199c;

        /* renamed from: d, reason: collision with root package name */
        public final InterfaceC41771d f402200d;

        public b(io.reactivex.rxjava3.disposables.c cVar, AtomicBoolean atomicBoolean, InterfaceC41771d interfaceC41771d) {
            this.f402198b = cVar;
            this.f402199c = atomicBoolean;
            this.f402200d = interfaceC41771d;
        }

        @Override // io.reactivex.rxjava3.core.InterfaceC41771d
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            this.f402198b.b(dVar);
        }

        @Override // io.reactivex.rxjava3.core.InterfaceC41771d
        public final void e() {
            if (this.f402199c.compareAndSet(false, true)) {
                this.f402198b.dispose();
                this.f402200d.e();
            }
        }

        @Override // io.reactivex.rxjava3.core.InterfaceC41771d
        public final void onError(Throwable th2) {
            if (!this.f402199c.compareAndSet(false, true)) {
                C47998a.b(th2);
            } else {
                this.f402198b.dispose();
                this.f402200d.onError(th2);
            }
        }
    }

    public O(AbstractC41768a abstractC41768a, TimeUnit timeUnit, io.reactivex.rxjava3.core.H h12) {
        this.f402190b = abstractC41768a;
        this.f402192d = timeUnit;
        this.f402193e = h12;
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41768a
    public final void w(InterfaceC41771d interfaceC41771d) {
        io.reactivex.rxjava3.disposables.c cVar = new io.reactivex.rxjava3.disposables.c();
        interfaceC41771d.b(cVar);
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        cVar.b(this.f402193e.e(new a(atomicBoolean, cVar, interfaceC41771d), this.f402191c, this.f402192d));
        this.f402190b.a(new b(cVar, atomicBoolean, interfaceC41771d));
    }
}
