package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.observers.AbstractC41804b;

/* compiled from: ObservableDoAfterNext.java */
/* loaded from: classes8.dex */
public final class M<T> extends AbstractC41932a<T, T> {

    /* renamed from: c, reason: collision with root package name */
    public final l41.g<? super T> f403717c;

    /* compiled from: ObservableDoAfterNext.java */
    public static final class a<T> extends AbstractC41804b<T, T> {

        /* renamed from: g, reason: collision with root package name */
        public final l41.g<? super T> f403718g;

        public a(io.reactivex.rxjava3.core.G<? super T> g12, l41.g<? super T> gVar) {
            super(g12);
            this.f403718g = gVar;
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onNext(T t12) {
            this.f402097b.onNext(t12);
            if (this.f402101f == 0) {
                try {
                    this.f403718g.accept(t12);
                } catch (Throwable th2) {
                    a(th2);
                }
            }
        }

        @Override // q41.g
        @j41.f
        public final T poll() {
            T tPoll = this.f402099d.poll();
            if (tPoll != null) {
                this.f403718g.accept(tPoll);
            }
            return tPoll;
        }
    }

    public M(io.reactivex.rxjava3.core.z zVar, l41.g gVar) {
        super(zVar);
        this.f403717c = gVar;
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(io.reactivex.rxjava3.core.G<? super T> g12) {
        this.f403951b.c(new a(g12, this.f403717c));
    }
}
