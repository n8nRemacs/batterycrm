package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.observers.AbstractC41804b;
import java.util.Collection;
import java.util.Objects;
import s41.C47998a;

/* compiled from: ObservableDistinct.java */
/* loaded from: classes8.dex */
public final class K<T, K> extends AbstractC41932a<T, T> {

    /* renamed from: c, reason: collision with root package name */
    public final l41.o<? super T, K> f403679c;

    /* renamed from: d, reason: collision with root package name */
    public final l41.s<? extends Collection<? super K>> f403680d;

    /* compiled from: ObservableDistinct.java */
    public static final class a<T, K> extends AbstractC41804b<T, T> {

        /* renamed from: g, reason: collision with root package name */
        public final Collection<? super K> f403681g;

        /* renamed from: h, reason: collision with root package name */
        public final l41.o<? super T, K> f403682h;

        public a(io.reactivex.rxjava3.core.G<? super T> g12, l41.o<? super T, K> oVar, Collection<? super K> collection) {
            super(g12);
            this.f403682h = oVar;
            this.f403681g = collection;
        }

        @Override // io.reactivex.rxjava3.internal.observers.AbstractC41804b, q41.g
        public final void clear() {
            this.f403681g.clear();
            super.clear();
        }

        @Override // io.reactivex.rxjava3.internal.observers.AbstractC41804b, io.reactivex.rxjava3.core.G
        public final void e() {
            if (this.f402100e) {
                return;
            }
            this.f402100e = true;
            this.f403681g.clear();
            this.f402097b.e();
        }

        @Override // io.reactivex.rxjava3.internal.observers.AbstractC41804b, io.reactivex.rxjava3.core.G
        public final void onError(Throwable th2) {
            if (this.f402100e) {
                C47998a.b(th2);
                return;
            }
            this.f402100e = true;
            this.f403681g.clear();
            this.f402097b.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onNext(T t12) {
            if (this.f402100e) {
                return;
            }
            int i12 = this.f402101f;
            io.reactivex.rxjava3.core.G<? super R> g12 = this.f402097b;
            if (i12 != 0) {
                g12.onNext(null);
                return;
            }
            try {
                this.f403682h.apply(t12);
                Objects.requireNonNull(t12, "The keySelector returned a null key");
                if (this.f403681g.add(t12)) {
                    g12.onNext(t12);
                }
            } catch (Throwable th2) {
                a(th2);
            }
        }

        @Override // q41.g
        @j41.f
        public final T poll() {
            T tPoll;
            K kApply;
            do {
                tPoll = this.f402099d.poll();
                if (tPoll == null) {
                    break;
                }
                kApply = this.f403682h.apply(tPoll);
                Objects.requireNonNull(kApply, "The keySelector returned a null key");
            } while (!this.f403681g.add(kApply));
            return tPoll;
        }
    }

    public K(io.reactivex.rxjava3.core.z zVar, l41.o oVar, l41.s sVar) {
        super(zVar);
        this.f403679c = oVar;
        this.f403680d = sVar;
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(io.reactivex.rxjava3.core.G<? super T> g12) {
        try {
            Collection<? super K> collection = this.f403680d.get();
            if (collection == null) {
                throw io.reactivex.rxjava3.internal.util.h.b("The collectionSupplier returned a null Collection.");
            }
            Throwable th2 = io.reactivex.rxjava3.internal.util.h.f404834a;
            this.f403951b.c(new a(g12, this.f403679c, collection));
        } catch (Throwable th3) {
            io.reactivex.rxjava3.exceptions.a.a(th3);
            EmptyDisposable.d(th3, g12);
        }
    }
}
