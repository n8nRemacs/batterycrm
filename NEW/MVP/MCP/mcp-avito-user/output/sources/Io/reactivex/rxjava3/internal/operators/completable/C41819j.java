package io.reactivex.rxjava3.internal.operators.completable;

import io.reactivex.rxjava3.core.AbstractC41768a;
import io.reactivex.rxjava3.core.InterfaceC41771d;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;

/* compiled from: CompletableDetach.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.completable.j, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41819j extends AbstractC41768a {

    /* compiled from: CompletableDetach.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.completable.j$a */
    public static final class a implements InterfaceC41771d, io.reactivex.rxjava3.disposables.d {

        /* renamed from: b, reason: collision with root package name */
        public InterfaceC41771d f402251b;

        /* renamed from: c, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f402252c;

        @Override // io.reactivex.rxjava3.core.InterfaceC41771d
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            if (DisposableHelper.f(this.f402252c, dVar)) {
                this.f402252c = dVar;
                this.f402251b.b(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            this.f402251b = null;
            this.f402252c.dispose();
            this.f402252c = DisposableHelper.f401986b;
        }

        @Override // io.reactivex.rxjava3.core.InterfaceC41771d
        public final void e() {
            this.f402252c = DisposableHelper.f401986b;
            InterfaceC41771d interfaceC41771d = this.f402251b;
            if (interfaceC41771d != null) {
                this.f402251b = null;
                interfaceC41771d.e();
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return this.f402252c.getF318621e();
        }

        @Override // io.reactivex.rxjava3.core.InterfaceC41771d
        public final void onError(Throwable th2) {
            this.f402252c = DisposableHelper.f401986b;
            InterfaceC41771d interfaceC41771d = this.f402251b;
            if (interfaceC41771d != null) {
                this.f402251b = null;
                interfaceC41771d.onError(th2);
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41768a
    public final void w(InterfaceC41771d interfaceC41771d) {
        new a().f402251b = interfaceC41771d;
        throw null;
    }
}
