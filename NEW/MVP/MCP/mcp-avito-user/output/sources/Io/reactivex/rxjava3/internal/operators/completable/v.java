package io.reactivex.rxjava3.internal.operators.completable;

import io.reactivex.rxjava3.core.AbstractC41768a;
import io.reactivex.rxjava3.core.InterfaceC41771d;

/* compiled from: CompletableFromSingle.java */
/* loaded from: classes8.dex */
public final class v<T> extends AbstractC41768a {

    /* renamed from: b, reason: collision with root package name */
    public final io.reactivex.rxjava3.core.I f402267b;

    /* compiled from: CompletableFromSingle.java */
    public static final class a<T> implements io.reactivex.rxjava3.core.L<T> {

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC41771d f402268b;

        public a(InterfaceC41771d interfaceC41771d) {
            this.f402268b = interfaceC41771d;
        }

        @Override // io.reactivex.rxjava3.core.L
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            this.f402268b.b(dVar);
        }

        @Override // io.reactivex.rxjava3.core.L
        public final void onError(Throwable th2) {
            this.f402268b.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.L
        public final void onSuccess(T t12) {
            this.f402268b.e();
        }
    }

    public v(io.reactivex.rxjava3.core.I i12) {
        this.f402267b = i12;
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41768a
    public final void w(InterfaceC41771d interfaceC41771d) {
        this.f402267b.a(new a(interfaceC41771d));
    }
}
