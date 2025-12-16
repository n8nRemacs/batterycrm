package io.reactivex.rxjava3.internal.operators.completable;

import io.reactivex.rxjava3.core.AbstractC41768a;
import io.reactivex.rxjava3.core.InterfaceC41771d;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: CompletableSubscribeOn.java */
/* loaded from: classes8.dex */
public final class M extends AbstractC41768a {

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC41768a f402181b;

    /* renamed from: c, reason: collision with root package name */
    public final io.reactivex.rxjava3.core.H f402182c;

    /* compiled from: CompletableSubscribeOn.java */
    public static final class a extends AtomicReference<io.reactivex.rxjava3.disposables.d> implements InterfaceC41771d, io.reactivex.rxjava3.disposables.d, Runnable {
        private static final long serialVersionUID = 7000911171163930287L;

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC41771d f402183b;

        /* renamed from: c, reason: collision with root package name */
        public final m41.d f402184c = new m41.d();

        /* renamed from: d, reason: collision with root package name */
        public final AbstractC41768a f402185d;

        public a(InterfaceC41771d interfaceC41771d, AbstractC41768a abstractC41768a) {
            this.f402183b = interfaceC41771d;
            this.f402185d = abstractC41768a;
        }

        @Override // io.reactivex.rxjava3.core.InterfaceC41771d
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            DisposableHelper.e(this, dVar);
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            DisposableHelper.a(this);
            m41.d dVar = this.f402184c;
            dVar.getClass();
            DisposableHelper.a(dVar);
        }

        @Override // io.reactivex.rxjava3.core.InterfaceC41771d
        public final void e() {
            this.f402183b.e();
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final boolean i() {
            return DisposableHelper.b(get());
        }

        @Override // io.reactivex.rxjava3.core.InterfaceC41771d
        public final void onError(Throwable th2) {
            this.f402183b.onError(th2);
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f402185d.a(this);
        }
    }

    public M(AbstractC41768a abstractC41768a, io.reactivex.rxjava3.core.H h12) {
        this.f402181b = abstractC41768a;
        this.f402182c = h12;
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41768a
    public final void w(InterfaceC41771d interfaceC41771d) {
        a aVar = new a(interfaceC41771d, this.f402181b);
        interfaceC41771d.b(aVar);
        io.reactivex.rxjava3.disposables.d dVarD = this.f402182c.d(aVar);
        m41.d dVar = aVar.f402184c;
        dVar.getClass();
        DisposableHelper.c(dVar, dVarD);
    }
}
