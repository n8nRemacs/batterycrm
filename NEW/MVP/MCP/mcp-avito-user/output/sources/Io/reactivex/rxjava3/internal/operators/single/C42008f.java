package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;

/* compiled from: SingleDelay.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.single.f, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42008f<T> extends io.reactivex.rxjava3.core.I<T> {

    /* renamed from: b, reason: collision with root package name */
    public final io.reactivex.rxjava3.core.I f404573b;

    /* renamed from: c, reason: collision with root package name */
    public final long f404574c;

    /* renamed from: d, reason: collision with root package name */
    public final TimeUnit f404575d;

    /* renamed from: e, reason: collision with root package name */
    public final io.reactivex.rxjava3.core.H f404576e;

    /* compiled from: SingleDelay.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.single.f$a */
    public final class a implements io.reactivex.rxjava3.core.L<T> {

        /* renamed from: b, reason: collision with root package name */
        public final m41.d f404577b;

        /* renamed from: c, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.L<? super T> f404578c;

        /* compiled from: SingleDelay.java */
        /* renamed from: io.reactivex.rxjava3.internal.operators.single.f$a$a, reason: collision with other inner class name */
        public final class RunnableC11512a implements Runnable {

            /* renamed from: b, reason: collision with root package name */
            public final Throwable f404580b;

            public RunnableC11512a(Throwable th2) {
                this.f404580b = th2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                a.this.f404578c.onError(this.f404580b);
            }
        }

        /* compiled from: SingleDelay.java */
        /* renamed from: io.reactivex.rxjava3.internal.operators.single.f$a$b */
        public final class b implements Runnable {

            /* renamed from: b, reason: collision with root package name */
            public final T f404582b;

            public b(T t12) {
                this.f404582b = t12;
            }

            @Override // java.lang.Runnable
            public final void run() {
                a.this.f404578c.onSuccess(this.f404582b);
            }
        }

        public a(m41.d dVar, io.reactivex.rxjava3.core.L<? super T> l12) {
            this.f404577b = dVar;
            this.f404578c = l12;
        }

        @Override // io.reactivex.rxjava3.core.L
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            m41.d dVar2 = this.f404577b;
            dVar2.getClass();
            DisposableHelper.c(dVar2, dVar);
        }

        @Override // io.reactivex.rxjava3.core.L
        public final void onError(Throwable th2) {
            C42008f c42008f = C42008f.this;
            DisposableHelper.c(this.f404577b, c42008f.f404576e.e(new RunnableC11512a(th2), 0L, c42008f.f404575d));
        }

        @Override // io.reactivex.rxjava3.core.L
        public final void onSuccess(T t12) {
            C42008f c42008f = C42008f.this;
            DisposableHelper.c(this.f404577b, c42008f.f404576e.e(new b(t12), c42008f.f404574c, c42008f.f404575d));
        }
    }

    public C42008f(io.reactivex.rxjava3.core.I i12, long j12, TimeUnit timeUnit, io.reactivex.rxjava3.core.H h12) {
        this.f404573b = i12;
        this.f404574c = j12;
        this.f404575d = timeUnit;
        this.f404576e = h12;
    }

    @Override // io.reactivex.rxjava3.core.I
    public final void y(io.reactivex.rxjava3.core.L<? super T> l12) {
        m41.d dVar = new m41.d();
        l12.b(dVar);
        this.f404573b.a(new a(dVar, l12));
    }
}
