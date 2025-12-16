package hu.akarnokd.rxjava3.basetypes;

import io.reactivex.rxjava3.core.InterfaceC41771d;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;

/* compiled from: NonoFromCompletable.java */
/* loaded from: classes8.dex */
final class D extends AbstractC41062i {

    /* compiled from: NonoFromCompletable.java */
    public static final class a extends AbstractC41038a implements InterfaceC41771d {

        /* renamed from: b, reason: collision with root package name */
        public final org.reactivestreams.d<? super Void> f397566b;

        /* renamed from: c, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f397567c;

        public a(org.reactivestreams.d<? super Void> dVar) {
            this.f397566b = dVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.rxjava3.core.InterfaceC41771d
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            if (DisposableHelper.f(this.f397567c, dVar)) {
                this.f397567c = dVar;
                this.f397566b.K(this);
            }
        }

        @Override // io.reactivex.rxjava3.core.InterfaceC41771d
        public final void e() {
            this.f397566b.e();
        }

        @Override // io.reactivex.rxjava3.core.InterfaceC41771d
        public final void onError(Throwable th2) {
            this.f397566b.onError(th2);
        }
    }

    @Override // hu.akarnokd.rxjava3.basetypes.AbstractC41062i
    public final void a(org.reactivestreams.d<? super Void> dVar) {
        new a(dVar);
        throw null;
    }
}
