package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.observers.AbstractC41804b;

/* compiled from: ObservableFilter.java */
/* loaded from: classes8.dex */
public final class W<T> extends AbstractC41932a<T, T> {

    /* renamed from: c, reason: collision with root package name */
    public final l41.r<? super T> f403876c;

    /* compiled from: ObservableFilter.java */
    public static final class a<T> extends AbstractC41804b<T, T> {

        /* renamed from: g, reason: collision with root package name */
        public final l41.r<? super T> f403877g;

        public a(io.reactivex.rxjava3.core.G<? super T> g12, l41.r<? super T> rVar) {
            super(g12);
            this.f403877g = rVar;
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onNext(T t12) {
            int i12 = this.f402101f;
            io.reactivex.rxjava3.core.G<? super R> g12 = this.f402097b;
            if (i12 != 0) {
                g12.onNext(null);
                return;
            }
            try {
                if (this.f403877g.test(t12)) {
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
            do {
                tPoll = this.f402099d.poll();
                if (tPoll == null) {
                    break;
                }
            } while (!this.f403877g.test(tPoll));
            return tPoll;
        }
    }

    public W(io.reactivex.rxjava3.core.z zVar, l41.r rVar) {
        super(zVar);
        this.f403876c = rVar;
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(io.reactivex.rxjava3.core.G<? super T> g12) {
        this.f403951b.c(new a(g12, this.f403876c));
    }
}
