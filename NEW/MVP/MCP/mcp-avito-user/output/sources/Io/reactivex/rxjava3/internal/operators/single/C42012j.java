package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: SingleDelayWithSingle.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.single.j, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42012j<T, U> extends io.reactivex.rxjava3.core.I<T> {

    /* compiled from: SingleDelayWithSingle.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.single.j$a */
    public static final class a<T, U> extends AtomicReference<io.reactivex.rxjava3.disposables.d> implements io.reactivex.rxjava3.core.L<U>, io.reactivex.rxjava3.disposables.d {
        private static final long serialVersionUID = -8565274649390031272L;

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.L<? super T> f404605b;

        public a(io.reactivex.rxjava3.core.L l12) {
            this.f404605b = l12;
        }

        @Override // io.reactivex.rxjava3.core.L
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            if (DisposableHelper.e(this, dVar)) {
                this.f404605b.b(this);
            }
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

        @Override // io.reactivex.rxjava3.core.L
        public final void onError(Throwable th2) {
            this.f404605b.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.L
        public final void onSuccess(U u12) {
            throw null;
        }
    }

    @Override // io.reactivex.rxjava3.core.I
    public final void y(io.reactivex.rxjava3.core.L<? super T> l12) {
        new a(l12);
        throw null;
    }
}
