package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import java.util.Collection;

/* compiled from: ObservableToList.java */
/* loaded from: classes8.dex */
public final class G1<T, U extends Collection<? super T>> extends AbstractC41932a<T, U> {

    /* renamed from: c, reason: collision with root package name */
    public final l41.s<U> f403633c;

    /* compiled from: ObservableToList.java */
    public static final class a<T, U extends Collection<? super T>> implements io.reactivex.rxjava3.core.G<T>, io.reactivex.rxjava3.disposables.d {

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.G<? super U> f403634b;

        /* renamed from: c, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f403635c;

        /* renamed from: d, reason: collision with root package name */
        public U f403636d;

        public a(io.reactivex.rxjava3.core.G<? super U> g12, U u12) {
            this.f403634b = g12;
            this.f403636d = u12;
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            if (DisposableHelper.f(this.f403635c, dVar)) {
                this.f403635c = dVar;
                this.f403634b.b(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            this.f403635c.dispose();
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void e() {
            U u12 = this.f403636d;
            this.f403636d = null;
            io.reactivex.rxjava3.core.G<? super U> g12 = this.f403634b;
            g12.onNext(u12);
            g12.e();
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return this.f403635c.getF318621e();
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onError(Throwable th2) {
            this.f403636d = null;
            this.f403634b.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onNext(T t12) {
            this.f403636d.add(t12);
        }
    }

    public G1(io.reactivex.rxjava3.core.z zVar, l41.s sVar) {
        super(zVar);
        this.f403633c = sVar;
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(io.reactivex.rxjava3.core.G<? super U> g12) {
        try {
            U u12 = this.f403633c.get();
            if (u12 == null) {
                throw io.reactivex.rxjava3.internal.util.h.b("The collectionSupplier returned a null Collection.");
            }
            Throwable th2 = io.reactivex.rxjava3.internal.util.h.f404834a;
            this.f403951b.c(new a(g12, u12));
        } catch (Throwable th3) {
            io.reactivex.rxjava3.exceptions.a.a(th3);
            EmptyDisposable.d(th3, g12);
        }
    }
}
