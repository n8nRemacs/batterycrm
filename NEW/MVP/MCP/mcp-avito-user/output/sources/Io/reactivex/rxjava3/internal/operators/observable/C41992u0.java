package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.H;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableInterval.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.observable.u0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41992u0 extends io.reactivex.rxjava3.core.z<Long> {

    /* renamed from: b, reason: collision with root package name */
    public final io.reactivex.rxjava3.core.H f404344b;

    /* renamed from: c, reason: collision with root package name */
    public final long f404345c;

    /* renamed from: d, reason: collision with root package name */
    public final long f404346d;

    /* renamed from: e, reason: collision with root package name */
    public final TimeUnit f404347e;

    /* compiled from: ObservableInterval.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.observable.u0$a */
    public static final class a extends AtomicReference<io.reactivex.rxjava3.disposables.d> implements io.reactivex.rxjava3.disposables.d, Runnable {
        private static final long serialVersionUID = 346773832286157679L;

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.G<? super Long> f404348b;

        /* renamed from: c, reason: collision with root package name */
        public long f404349c;

        public a(io.reactivex.rxjava3.core.G<? super Long> g12) {
            this.f404348b = g12;
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            DisposableHelper.a(this);
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return get() == DisposableHelper.f401986b;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (get() != DisposableHelper.f401986b) {
                long j12 = this.f404349c;
                this.f404349c = 1 + j12;
                this.f404348b.onNext(Long.valueOf(j12));
            }
        }
    }

    public C41992u0(long j12, long j13, TimeUnit timeUnit, io.reactivex.rxjava3.core.H h12) {
        this.f404345c = j12;
        this.f404346d = j13;
        this.f404347e = timeUnit;
        this.f404344b = h12;
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(io.reactivex.rxjava3.core.G<? super Long> g12) {
        a aVar = new a(g12);
        g12.b(aVar);
        io.reactivex.rxjava3.core.H h12 = this.f404344b;
        if (!(h12 instanceof io.reactivex.rxjava3.internal.schedulers.s)) {
            DisposableHelper.e(aVar, h12.f(aVar, this.f404345c, this.f404346d, this.f404347e));
        } else {
            H.c cVarB = h12.b();
            DisposableHelper.e(aVar, cVarB);
            cVarB.d(aVar, this.f404345c, this.f404346d, this.f404347e);
        }
    }
}
