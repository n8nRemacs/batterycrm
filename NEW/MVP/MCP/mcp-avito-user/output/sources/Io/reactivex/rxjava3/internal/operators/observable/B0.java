package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.observers.AbstractC41804b;
import java.util.Objects;

/* compiled from: ObservableMap.java */
/* loaded from: classes8.dex */
public final class B0<T, U> extends AbstractC41932a<T, U> {

    /* renamed from: c, reason: collision with root package name */
    public final l41.o<? super T, ? extends U> f403510c;

    /* compiled from: ObservableMap.java */
    public static final class a<T, U> extends AbstractC41804b<T, U> {

        /* renamed from: g, reason: collision with root package name */
        public final l41.o<? super T, ? extends U> f403511g;

        public a(io.reactivex.rxjava3.core.G<? super U> g12, l41.o<? super T, ? extends U> oVar) {
            super(g12);
            this.f403511g = oVar;
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
                U uApply = this.f403511g.apply(t12);
                Objects.requireNonNull(uApply, "The mapper function returned a null value.");
                g12.onNext(uApply);
            } catch (Throwable th2) {
                a(th2);
            }
        }

        @Override // q41.g
        @j41.f
        public final U poll() {
            T tPoll = this.f402099d.poll();
            if (tPoll == null) {
                return null;
            }
            U uApply = this.f403511g.apply(tPoll);
            Objects.requireNonNull(uApply, "The mapper function returned a null value.");
            return uApply;
        }
    }

    public B0(io.reactivex.rxjava3.core.E<T> e12, l41.o<? super T, ? extends U> oVar) {
        super(e12);
        this.f403510c = oVar;
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(io.reactivex.rxjava3.core.G<? super U> g12) {
        this.f403951b.c(new a(g12, this.f403510c));
    }
}
