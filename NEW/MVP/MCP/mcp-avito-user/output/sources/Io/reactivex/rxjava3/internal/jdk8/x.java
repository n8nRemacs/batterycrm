package io.reactivex.rxjava3.internal.jdk8;

import io.reactivex.rxjava3.internal.observers.AbstractC41804b;
import java.util.Objects;
import java.util.Optional;

/* compiled from: ObservableMapOptional.java */
/* loaded from: classes8.dex */
public final class x<T, R> extends io.reactivex.rxjava3.core.z<R> {

    /* renamed from: b, reason: collision with root package name */
    public final io.reactivex.rxjava3.core.z<T> f402089b;

    /* renamed from: c, reason: collision with root package name */
    public final l41.o<? super T, Optional<? extends R>> f402090c;

    /* compiled from: ObservableMapOptional.java */
    public static final class a<T, R> extends AbstractC41804b<T, R> {

        /* renamed from: g, reason: collision with root package name */
        public final l41.o<? super T, Optional<? extends R>> f402091g;

        public a(io.reactivex.rxjava3.core.G<? super R> g12, l41.o<? super T, Optional<? extends R>> oVar) {
            super(g12);
            this.f402091g = oVar;
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
                Optional<? extends R> optionalApply = this.f402091g.apply(t12);
                Objects.requireNonNull(optionalApply, "The mapper returned a null Optional");
                Optional<? extends R> optional = optionalApply;
                if (optional.isPresent()) {
                    g12.onNext(optional.get());
                }
            } catch (Throwable th2) {
                a(th2);
            }
        }

        @Override // q41.g
        public final R poll() {
            Optional<? extends R> optional;
            do {
                T tPoll = this.f402099d.poll();
                if (tPoll == null) {
                    return null;
                }
                Optional<? extends R> optionalApply = this.f402091g.apply(tPoll);
                Objects.requireNonNull(optionalApply, "The mapper returned a null Optional");
                optional = optionalApply;
            } while (!optional.isPresent());
            return optional.get();
        }
    }

    public x(io.reactivex.rxjava3.core.z<T> zVar, l41.o<? super T, Optional<? extends R>> oVar) {
        this.f402089b = zVar;
        this.f402090c = oVar;
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(io.reactivex.rxjava3.core.G<? super R> g12) {
        this.f402089b.c(new a(g12, this.f402090c));
    }
}
