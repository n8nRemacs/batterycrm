package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: MaybeTimer.java */
/* loaded from: classes8.dex */
public final class p0 extends io.reactivex.rxjava3.core.q<Long> {

    /* renamed from: b, reason: collision with root package name */
    public final long f403301b;

    /* renamed from: c, reason: collision with root package name */
    public final TimeUnit f403302c;

    /* renamed from: d, reason: collision with root package name */
    public final io.reactivex.rxjava3.core.H f403303d;

    /* compiled from: MaybeTimer.java */
    public static final class a extends AtomicReference<io.reactivex.rxjava3.disposables.d> implements io.reactivex.rxjava3.disposables.d, Runnable {
        private static final long serialVersionUID = 2875964065294031672L;

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.t<? super Long> f403304b;

        public a(io.reactivex.rxjava3.core.t<? super Long> tVar) {
            this.f403304b = tVar;
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
            this.f403304b.onSuccess(0L);
        }
    }

    public p0(long j12, TimeUnit timeUnit, io.reactivex.rxjava3.core.H h12) {
        this.f403301b = j12;
        this.f403302c = timeUnit;
        this.f403303d = h12;
    }

    @Override // io.reactivex.rxjava3.core.q
    public final void o(io.reactivex.rxjava3.core.t<? super Long> tVar) {
        a aVar = new a(tVar);
        tVar.b(aVar);
        DisposableHelper.c(aVar, this.f403303d.e(aVar, this.f403301b, this.f403302c));
    }
}
