package io.reactivex.rxjava3.internal.jdk8;

import io.reactivex.rxjava3.core.I;
import io.reactivex.rxjava3.core.L;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import n41.InterfaceC44188e;
import s41.C47998a;

/* compiled from: ObservableCollectWithCollectorSingle.java */
/* loaded from: classes8.dex */
public final class r<T, A, R> extends I<R> implements InterfaceC44188e<R> {

    /* compiled from: ObservableCollectWithCollectorSingle.java */
    public static final class a<T, A, R> implements io.reactivex.rxjava3.core.G<T>, io.reactivex.rxjava3.disposables.d {

        /* renamed from: b, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f402078b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f402079c;

        public a() {
            throw null;
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void b(@j41.e io.reactivex.rxjava3.disposables.d dVar) {
            if (DisposableHelper.f(this.f402078b, dVar)) {
                this.f402078b = dVar;
                throw null;
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            this.f402078b.dispose();
            this.f402078b = DisposableHelper.f401986b;
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void e() {
            throw null;
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return this.f402078b == DisposableHelper.f401986b;
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onError(Throwable th2) {
            if (this.f402079c) {
                C47998a.b(th2);
            } else {
                this.f402079c = true;
                this.f402078b = DisposableHelper.f401986b;
                throw null;
            }
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onNext(T t12) {
            if (this.f402079c) {
                return;
            }
            try {
                throw null;
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                this.f402078b.dispose();
                onError(th2);
            }
        }
    }

    @Override // n41.InterfaceC44188e
    public final io.reactivex.rxjava3.core.z<R> d() {
        return new q();
    }

    @Override // io.reactivex.rxjava3.core.I
    public final void y(@j41.e L<? super R> l12) {
        try {
            throw null;
        } catch (Throwable th2) {
            io.reactivex.rxjava3.exceptions.a.a(th2);
            EmptyDisposable.e(th2, l12);
        }
    }
}
