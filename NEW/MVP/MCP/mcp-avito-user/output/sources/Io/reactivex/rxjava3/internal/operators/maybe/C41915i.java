package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import n41.InterfaceC44190g;

/* compiled from: MaybeCount.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.maybe.i, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41915i<T> extends io.reactivex.rxjava3.core.I<Long> implements InterfaceC44190g<T> {

    /* compiled from: MaybeCount.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.maybe.i$a */
    public static final class a implements io.reactivex.rxjava3.core.t<Object>, io.reactivex.rxjava3.disposables.d {

        /* renamed from: b, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f403245b;

        public a() {
            throw null;
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            if (DisposableHelper.f(this.f403245b, dVar)) {
                this.f403245b = dVar;
                throw null;
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            this.f403245b.dispose();
            this.f403245b = DisposableHelper.f401986b;
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void e() {
            this.f403245b = DisposableHelper.f401986b;
            throw null;
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return this.f403245b.getF318621e();
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void onError(Throwable th2) {
            this.f403245b = DisposableHelper.f401986b;
            throw null;
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void onSuccess(Object obj) {
            this.f403245b = DisposableHelper.f401986b;
            throw null;
        }
    }

    @Override // io.reactivex.rxjava3.core.I
    public final void y(io.reactivex.rxjava3.core.L<? super Long> l12) {
        throw null;
    }
}
