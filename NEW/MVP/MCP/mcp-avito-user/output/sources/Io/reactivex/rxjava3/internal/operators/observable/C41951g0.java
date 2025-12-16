package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.InterfaceC41771d;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import n41.AbstractC44184a;
import n41.InterfaceC44189f;

/* compiled from: ObservableFromCompletable.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.observable.g0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41951g0<T> extends io.reactivex.rxjava3.core.z<T> implements InterfaceC44189f {

    /* compiled from: ObservableFromCompletable.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.observable.g0$a */
    public static final class a<T> extends AbstractC44184a<T> implements InterfaceC41771d {

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.G<? super T> f404051b;

        /* renamed from: c, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f404052c;

        public a(io.reactivex.rxjava3.core.G<? super T> g12) {
            this.f404051b = g12;
        }

        @Override // io.reactivex.rxjava3.core.InterfaceC41771d
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            if (DisposableHelper.f(this.f404052c, dVar)) {
                this.f404052c = dVar;
                this.f404051b.b(this);
            }
        }

        @Override // n41.AbstractC44184a, io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            this.f404052c.dispose();
            this.f404052c = DisposableHelper.f401986b;
        }

        @Override // io.reactivex.rxjava3.core.InterfaceC41771d
        public final void e() {
            this.f404052c = DisposableHelper.f401986b;
            this.f404051b.e();
        }

        @Override // n41.AbstractC44184a, io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return this.f404052c.getF318621e();
        }

        @Override // io.reactivex.rxjava3.core.InterfaceC41771d
        public final void onError(Throwable th2) {
            this.f404052c = DisposableHelper.f401986b;
            this.f404051b.onError(th2);
        }
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(io.reactivex.rxjava3.core.G<? super T> g12) {
        new a(g12);
        throw null;
    }
}
