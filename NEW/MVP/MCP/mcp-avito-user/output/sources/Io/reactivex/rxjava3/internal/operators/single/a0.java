package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: SingleTimer.java */
/* loaded from: classes8.dex */
public final class a0 extends io.reactivex.rxjava3.core.I<Long> {

    /* renamed from: b, reason: collision with root package name */
    public final long f404556b;

    /* renamed from: c, reason: collision with root package name */
    public final TimeUnit f404557c;

    /* renamed from: d, reason: collision with root package name */
    public final io.reactivex.rxjava3.core.H f404558d;

    /* compiled from: SingleTimer.java */
    public static final class a extends AtomicReference<io.reactivex.rxjava3.disposables.d> implements io.reactivex.rxjava3.disposables.d, Runnable {
        private static final long serialVersionUID = 8465401857522493082L;

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.L<? super Long> f404559b;

        public a(io.reactivex.rxjava3.core.L<? super Long> l12) {
            this.f404559b = l12;
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            DisposableHelper.a(this);
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return DisposableHelper.b(get());
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f404559b.onSuccess(0L);
        }
    }

    public a0(long j12, TimeUnit timeUnit, io.reactivex.rxjava3.core.H h12) {
        this.f404556b = j12;
        this.f404557c = timeUnit;
        this.f404558d = h12;
    }

    @Override // io.reactivex.rxjava3.core.I
    public final void y(io.reactivex.rxjava3.core.L<? super Long> l12) {
        a aVar = new a(l12);
        l12.b(aVar);
        DisposableHelper.c(aVar, this.f404558d.e(aVar, this.f404556b, this.f404557c));
    }
}
