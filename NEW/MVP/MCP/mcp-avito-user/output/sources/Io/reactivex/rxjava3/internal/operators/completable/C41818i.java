package io.reactivex.rxjava3.internal.operators.completable;

import io.reactivex.rxjava3.core.AbstractC41768a;
import io.reactivex.rxjava3.core.InterfaceC41771d;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: CompletableDelay.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.completable.i, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41818i extends AbstractC41768a {

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC41768a f402242b;

    /* renamed from: c, reason: collision with root package name */
    public final long f402243c;

    /* renamed from: d, reason: collision with root package name */
    public final TimeUnit f402244d;

    /* renamed from: e, reason: collision with root package name */
    public final io.reactivex.rxjava3.core.H f402245e;

    /* compiled from: CompletableDelay.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.completable.i$a */
    public static final class a extends AtomicReference<io.reactivex.rxjava3.disposables.d> implements InterfaceC41771d, Runnable, io.reactivex.rxjava3.disposables.d {
        private static final long serialVersionUID = 465972761105851022L;

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC41771d f402246b;

        /* renamed from: c, reason: collision with root package name */
        public final long f402247c;

        /* renamed from: d, reason: collision with root package name */
        public final TimeUnit f402248d;

        /* renamed from: e, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.H f402249e;

        /* renamed from: f, reason: collision with root package name */
        public Throwable f402250f;

        public a(InterfaceC41771d interfaceC41771d, long j12, TimeUnit timeUnit, io.reactivex.rxjava3.core.H h12) {
            this.f402246b = interfaceC41771d;
            this.f402247c = j12;
            this.f402248d = timeUnit;
            this.f402249e = h12;
        }

        @Override // io.reactivex.rxjava3.core.InterfaceC41771d
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            if (DisposableHelper.e(this, dVar)) {
                this.f402246b.b(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            DisposableHelper.a(this);
        }

        @Override // io.reactivex.rxjava3.core.InterfaceC41771d
        public final void e() {
            DisposableHelper.c(this, this.f402249e.e(this, this.f402247c, this.f402248d));
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return DisposableHelper.b(get());
        }

        @Override // io.reactivex.rxjava3.core.InterfaceC41771d
        public final void onError(Throwable th2) {
            this.f402250f = th2;
            DisposableHelper.c(this, this.f402249e.e(this, 0L, this.f402248d));
        }

        @Override // java.lang.Runnable
        public final void run() {
            Throwable th2 = this.f402250f;
            this.f402250f = null;
            InterfaceC41771d interfaceC41771d = this.f402246b;
            if (th2 != null) {
                interfaceC41771d.onError(th2);
            } else {
                interfaceC41771d.e();
            }
        }
    }

    public C41818i(AbstractC41768a abstractC41768a, long j12, TimeUnit timeUnit, io.reactivex.rxjava3.core.H h12) {
        this.f402242b = abstractC41768a;
        this.f402243c = j12;
        this.f402244d = timeUnit;
        this.f402245e = h12;
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41768a
    public final void w(InterfaceC41771d interfaceC41771d) {
        this.f402242b.a(new a(interfaceC41771d, this.f402243c, this.f402244d, this.f402245e));
    }
}
