package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;

/* compiled from: SingleDetach.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.single.l, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42014l<T> extends io.reactivex.rxjava3.core.I<T> {

    /* compiled from: SingleDetach.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.single.l$a */
    public static final class a<T> implements io.reactivex.rxjava3.core.L<T>, io.reactivex.rxjava3.disposables.d {

        /* renamed from: b, reason: collision with root package name */
        public io.reactivex.rxjava3.core.L<? super T> f404607b;

        /* renamed from: c, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f404608c;

        public a() {
            throw null;
        }

        @Override // io.reactivex.rxjava3.core.L
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            if (DisposableHelper.f(this.f404608c, dVar)) {
                this.f404608c = dVar;
                this.f404607b.b(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            this.f404607b = null;
            this.f404608c.dispose();
            this.f404608c = DisposableHelper.f401986b;
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return this.f404608c.getF318621e();
        }

        @Override // io.reactivex.rxjava3.core.L
        public final void onError(Throwable th2) {
            this.f404608c = DisposableHelper.f401986b;
            io.reactivex.rxjava3.core.L<? super T> l12 = this.f404607b;
            if (l12 != null) {
                this.f404607b = null;
                l12.onError(th2);
            }
        }

        @Override // io.reactivex.rxjava3.core.L
        public final void onSuccess(T t12) {
            this.f404608c = DisposableHelper.f401986b;
            io.reactivex.rxjava3.core.L<? super T> l12 = this.f404607b;
            if (l12 != null) {
                this.f404607b = null;
                l12.onSuccess(t12);
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.I
    public final void y(io.reactivex.rxjava3.core.L<? super T> l12) {
        new a().f404607b = l12;
        throw null;
    }
}
