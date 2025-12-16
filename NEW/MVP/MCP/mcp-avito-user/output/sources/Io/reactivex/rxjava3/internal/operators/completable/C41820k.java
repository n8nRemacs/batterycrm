package io.reactivex.rxjava3.internal.operators.completable;

import io.reactivex.rxjava3.core.AbstractC41768a;
import io.reactivex.rxjava3.core.InterfaceC41771d;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import s41.C47998a;

/* compiled from: CompletableDisposeOn.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.completable.k, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41820k extends AbstractC41768a {

    /* compiled from: CompletableDisposeOn.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.completable.k$a */
    public static final class a implements InterfaceC41771d, io.reactivex.rxjava3.disposables.d, Runnable {

        /* renamed from: b, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f402253b;

        /* renamed from: c, reason: collision with root package name */
        public volatile boolean f402254c;

        @Override // io.reactivex.rxjava3.core.InterfaceC41771d
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            if (DisposableHelper.f(this.f402253b, dVar)) {
                this.f402253b = dVar;
                throw null;
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            this.f402254c = true;
            throw null;
        }

        @Override // io.reactivex.rxjava3.core.InterfaceC41771d
        public final void e() {
            if (!this.f402254c) {
                throw null;
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return this.f402254c;
        }

        @Override // io.reactivex.rxjava3.core.InterfaceC41771d
        public final void onError(Throwable th2) {
            if (!this.f402254c) {
                throw null;
            }
            C47998a.b(th2);
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f402253b.dispose();
            this.f402253b = DisposableHelper.f401986b;
        }
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41768a
    public final void w(InterfaceC41771d interfaceC41771d) {
        throw null;
    }
}
