package io.reactivex.rxjava3.internal.operators.completable;

import io.reactivex.rxjava3.core.AbstractC41768a;
import io.reactivex.rxjava3.core.InterfaceC41771d;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: CompletableObserveOn.java */
/* loaded from: classes8.dex */
public final class H extends AbstractC41768a {

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC41768a f402156b;

    /* renamed from: c, reason: collision with root package name */
    public final io.reactivex.rxjava3.core.H f402157c;

    /* compiled from: CompletableObserveOn.java */
    public static final class a extends AtomicReference<io.reactivex.rxjava3.disposables.d> implements InterfaceC41771d, io.reactivex.rxjava3.disposables.d, Runnable {
        private static final long serialVersionUID = 8571289934935992137L;

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC41771d f402158b;

        /* renamed from: c, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.H f402159c;

        /* renamed from: d, reason: collision with root package name */
        public Throwable f402160d;

        public a(InterfaceC41771d interfaceC41771d, io.reactivex.rxjava3.core.H h12) {
            this.f402158b = interfaceC41771d;
            this.f402159c = h12;
        }

        @Override // io.reactivex.rxjava3.core.InterfaceC41771d
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            if (DisposableHelper.e(this, dVar)) {
                this.f402158b.b(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            DisposableHelper.a(this);
        }

        @Override // io.reactivex.rxjava3.core.InterfaceC41771d
        public final void e() {
            DisposableHelper.c(this, this.f402159c.d(this));
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return DisposableHelper.b(get());
        }

        @Override // io.reactivex.rxjava3.core.InterfaceC41771d
        public final void onError(Throwable th2) {
            this.f402160d = th2;
            DisposableHelper.c(this, this.f402159c.d(this));
        }

        @Override // java.lang.Runnable
        public final void run() {
            Throwable th2 = this.f402160d;
            InterfaceC41771d interfaceC41771d = this.f402158b;
            if (th2 == null) {
                interfaceC41771d.e();
            } else {
                this.f402160d = null;
                interfaceC41771d.onError(th2);
            }
        }
    }

    public H(AbstractC41768a abstractC41768a, io.reactivex.rxjava3.core.H h12) {
        this.f402156b = abstractC41768a;
        this.f402157c = h12;
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41768a
    public final void w(InterfaceC41771d interfaceC41771d) {
        this.f402156b.a(new a(interfaceC41771d, this.f402157c));
    }
}
