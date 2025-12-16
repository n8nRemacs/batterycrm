package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import java.util.Collection;
import n41.InterfaceC44188e;

/* compiled from: ObservableToListSingle.java */
/* loaded from: classes8.dex */
public final class H1<T, U extends Collection<? super T>> extends io.reactivex.rxjava3.core.I<U> implements InterfaceC44188e<U> {

    /* renamed from: b, reason: collision with root package name */
    public final io.reactivex.rxjava3.core.z f403645b;

    /* renamed from: c, reason: collision with root package name */
    public final l41.s<U> f403646c = io.reactivex.rxjava3.internal.functions.a.c();

    /* compiled from: ObservableToListSingle.java */
    public static final class a<T, U extends Collection<? super T>> implements io.reactivex.rxjava3.core.G<T>, io.reactivex.rxjava3.disposables.d {

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.L<? super U> f403647b;

        /* renamed from: c, reason: collision with root package name */
        public U f403648c;

        /* renamed from: d, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f403649d;

        public a(io.reactivex.rxjava3.core.L<? super U> l12, U u12) {
            this.f403647b = l12;
            this.f403648c = u12;
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            if (DisposableHelper.f(this.f403649d, dVar)) {
                this.f403649d = dVar;
                this.f403647b.b(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            this.f403649d.dispose();
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void e() {
            U u12 = this.f403648c;
            this.f403648c = null;
            this.f403647b.onSuccess(u12);
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return this.f403649d.getF318621e();
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onError(Throwable th2) {
            this.f403648c = null;
            this.f403647b.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onNext(T t12) {
            this.f403648c.add(t12);
        }
    }

    public H1(io.reactivex.rxjava3.core.z zVar) {
        this.f403645b = zVar;
    }

    @Override // n41.InterfaceC44188e
    public final io.reactivex.rxjava3.core.z<U> d() {
        return new G1(this.f403645b, this.f403646c);
    }

    @Override // io.reactivex.rxjava3.core.I
    public final void y(io.reactivex.rxjava3.core.L<? super U> l12) {
        try {
            U u12 = this.f403646c.get();
            if (u12 == null) {
                throw io.reactivex.rxjava3.internal.util.h.b("The collectionSupplier returned a null Collection.");
            }
            Throwable th2 = io.reactivex.rxjava3.internal.util.h.f404834a;
            this.f403645b.c(new a(l12, u12));
        } catch (Throwable th3) {
            io.reactivex.rxjava3.exceptions.a.a(th3);
            EmptyDisposable.e(th3, l12);
        }
    }
}
