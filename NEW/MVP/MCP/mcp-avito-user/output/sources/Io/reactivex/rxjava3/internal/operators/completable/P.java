package io.reactivex.rxjava3.internal.operators.completable;

import io.reactivex.rxjava3.core.AbstractC41768a;
import io.reactivex.rxjava3.core.InterfaceC41771d;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: CompletableTimer.java */
/* loaded from: classes8.dex */
public final class P extends AbstractC41768a {

    /* renamed from: b, reason: collision with root package name */
    public final long f402201b;

    /* renamed from: c, reason: collision with root package name */
    public final TimeUnit f402202c;

    /* renamed from: d, reason: collision with root package name */
    public final io.reactivex.rxjava3.core.H f402203d;

    /* compiled from: CompletableTimer.java */
    public static final class a extends AtomicReference<io.reactivex.rxjava3.disposables.d> implements io.reactivex.rxjava3.disposables.d, Runnable {
        private static final long serialVersionUID = 3167244060586201109L;

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC41771d f402204b;

        public a(InterfaceC41771d interfaceC41771d) {
            this.f402204b = interfaceC41771d;
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
            this.f402204b.e();
        }
    }

    public P(long j12, TimeUnit timeUnit, io.reactivex.rxjava3.core.H h12) {
        this.f402201b = j12;
        this.f402202c = timeUnit;
        this.f402203d = h12;
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41768a
    public final void w(InterfaceC41771d interfaceC41771d) {
        a aVar = new a(interfaceC41771d);
        interfaceC41771d.b(aVar);
        DisposableHelper.c(aVar, this.f402203d.e(aVar, this.f402201b, this.f402202c));
    }
}
