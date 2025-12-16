package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.H;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableIntervalRange.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.observable.v0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41994v0 extends io.reactivex.rxjava3.core.z<Long> {

    /* renamed from: b, reason: collision with root package name */
    public final io.reactivex.rxjava3.core.H f404363b;

    /* renamed from: c, reason: collision with root package name */
    public final long f404364c;

    /* renamed from: d, reason: collision with root package name */
    public final long f404365d;

    /* renamed from: e, reason: collision with root package name */
    public final long f404366e;

    /* renamed from: f, reason: collision with root package name */
    public final TimeUnit f404367f;

    /* compiled from: ObservableIntervalRange.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.observable.v0$a */
    public static final class a extends AtomicReference<io.reactivex.rxjava3.disposables.d> implements io.reactivex.rxjava3.disposables.d, Runnable {
        private static final long serialVersionUID = 1891866368734007884L;

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.G<? super Long> f404368b;

        /* renamed from: c, reason: collision with root package name */
        public final long f404369c;

        /* renamed from: d, reason: collision with root package name */
        public long f404370d = 0;

        public a(io.reactivex.rxjava3.core.G g12, long j12) {
            this.f404368b = g12;
            this.f404369c = j12;
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
            long j12 = this.f404370d;
            Long lValueOf = Long.valueOf(j12);
            io.reactivex.rxjava3.core.G<? super Long> g12 = this.f404368b;
            g12.onNext(lValueOf);
            if (j12 != this.f404369c) {
                this.f404370d = j12 + 1;
                return;
            }
            if (!getF318621e()) {
                g12.e();
            }
            DisposableHelper.a(this);
        }
    }

    public C41994v0(long j12, long j13, long j14, TimeUnit timeUnit, io.reactivex.rxjava3.core.H h12) {
        this.f404365d = j13;
        this.f404366e = j14;
        this.f404367f = timeUnit;
        this.f404363b = h12;
        this.f404364c = j12;
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(io.reactivex.rxjava3.core.G<? super Long> g12) {
        a aVar = new a(g12, this.f404364c);
        g12.b(aVar);
        io.reactivex.rxjava3.core.H h12 = this.f404363b;
        if (!(h12 instanceof io.reactivex.rxjava3.internal.schedulers.s)) {
            DisposableHelper.e(aVar, h12.f(aVar, this.f404365d, this.f404366e, this.f404367f));
        } else {
            H.c cVarB = h12.b();
            DisposableHelper.e(aVar, cVarB);
            cVarB.d(aVar, this.f404365d, this.f404366e, this.f404367f);
        }
    }
}
