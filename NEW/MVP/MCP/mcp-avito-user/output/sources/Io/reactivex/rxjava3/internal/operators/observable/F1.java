package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableTimer.java */
/* loaded from: classes8.dex */
public final class F1 extends io.reactivex.rxjava3.core.z<Long> {

    /* renamed from: b, reason: collision with root package name */
    public final io.reactivex.rxjava3.core.H f403606b;

    /* renamed from: c, reason: collision with root package name */
    public final long f403607c;

    /* renamed from: d, reason: collision with root package name */
    public final TimeUnit f403608d;

    /* compiled from: ObservableTimer.java */
    public static final class a extends AtomicReference<io.reactivex.rxjava3.disposables.d> implements io.reactivex.rxjava3.disposables.d, Runnable {
        private static final long serialVersionUID = -2809475196591179431L;

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.G<? super Long> f403609b;

        public a(io.reactivex.rxjava3.core.G<? super Long> g12) {
            this.f403609b = g12;
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
            if (getF318621e()) {
                return;
            }
            io.reactivex.rxjava3.core.G<? super Long> g12 = this.f403609b;
            g12.onNext(0L);
            lazySet(EmptyDisposable.f401988b);
            g12.e();
        }
    }

    public F1(long j12, TimeUnit timeUnit, io.reactivex.rxjava3.core.H h12) {
        this.f403607c = j12;
        this.f403608d = timeUnit;
        this.f403606b = h12;
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(io.reactivex.rxjava3.core.G<? super Long> g12) {
        a aVar = new a(g12);
        g12.b(aVar);
        io.reactivex.rxjava3.disposables.d dVarE = this.f403606b.e(aVar, this.f403607c, this.f403608d);
        while (!aVar.compareAndSet(null, dVarE)) {
            if (aVar.get() != null) {
                if (aVar.get() == DisposableHelper.f401986b) {
                    dVarE.dispose();
                    return;
                }
                return;
            }
        }
    }
}
