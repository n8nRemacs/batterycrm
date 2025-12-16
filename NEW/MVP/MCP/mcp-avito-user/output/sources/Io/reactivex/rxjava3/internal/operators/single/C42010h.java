package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;
import s41.C47998a;

/* compiled from: SingleDelayWithObservable.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.single.h, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42010h<T, U> extends io.reactivex.rxjava3.core.I<T> {

    /* compiled from: SingleDelayWithObservable.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.single.h$a */
    public static final class a<T, U> extends AtomicReference<io.reactivex.rxjava3.disposables.d> implements io.reactivex.rxjava3.core.G<U>, io.reactivex.rxjava3.disposables.d {
        private static final long serialVersionUID = -8565274649390031272L;

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.L<? super T> f404600b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f404601c;

        public a(io.reactivex.rxjava3.core.L l12) {
            this.f404600b = l12;
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            if (DisposableHelper.e(this, dVar)) {
                this.f404600b.b(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            DisposableHelper.a(this);
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void e() {
            if (this.f404601c) {
                return;
            }
            this.f404601c = true;
            throw null;
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return DisposableHelper.b(get());
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onError(Throwable th2) {
            if (this.f404601c) {
                C47998a.b(th2);
            } else {
                this.f404601c = true;
                this.f404600b.onError(th2);
            }
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onNext(U u12) {
            get().dispose();
            e();
        }
    }

    @Override // io.reactivex.rxjava3.core.I
    public final void y(io.reactivex.rxjava3.core.L<? super T> l12) {
        new a(l12);
        throw null;
    }
}
