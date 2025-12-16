package io.reactivex.rxjava3.internal.operators.completable;

import io.reactivex.rxjava3.core.AbstractC41768a;
import io.reactivex.rxjava3.core.InterfaceC41771d;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;

/* compiled from: CompletableHide.java */
/* loaded from: classes8.dex */
public final class y extends AbstractC41768a {

    /* compiled from: CompletableHide.java */
    public static final class a implements InterfaceC41771d, io.reactivex.rxjava3.disposables.d {

        /* renamed from: b, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f402269b;

        @Override // io.reactivex.rxjava3.core.InterfaceC41771d
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            if (DisposableHelper.f(this.f402269b, dVar)) {
                this.f402269b = dVar;
                throw null;
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            this.f402269b.dispose();
            this.f402269b = DisposableHelper.f401986b;
        }

        @Override // io.reactivex.rxjava3.core.InterfaceC41771d
        public final void e() {
            throw null;
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return this.f402269b.getF318621e();
        }

        @Override // io.reactivex.rxjava3.core.InterfaceC41771d
        public final void onError(Throwable th2) {
            throw null;
        }
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41768a
    public final void w(InterfaceC41771d interfaceC41771d) {
        throw null;
    }
}
