package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.util.NotificationLite;
import java.util.Objects;
import s41.C47998a;

/* compiled from: ObservableDematerialize.java */
/* loaded from: classes8.dex */
public final class I<T, R> extends AbstractC41932a<T, R> {

    /* renamed from: c, reason: collision with root package name */
    public final l41.o<? super T, ? extends io.reactivex.rxjava3.core.y<R>> f403650c;

    /* compiled from: ObservableDematerialize.java */
    public static final class a<T, R> implements io.reactivex.rxjava3.core.G<T>, io.reactivex.rxjava3.disposables.d {

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.G<? super R> f403651b;

        /* renamed from: c, reason: collision with root package name */
        public final l41.o<? super T, ? extends io.reactivex.rxjava3.core.y<R>> f403652c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f403653d;

        /* renamed from: e, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f403654e;

        public a(io.reactivex.rxjava3.core.G<? super R> g12, l41.o<? super T, ? extends io.reactivex.rxjava3.core.y<R>> oVar) {
            this.f403651b = g12;
            this.f403652c = oVar;
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            if (DisposableHelper.f(this.f403654e, dVar)) {
                this.f403654e = dVar;
                this.f403651b.b(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            this.f403654e.dispose();
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void e() {
            if (this.f403653d) {
                return;
            }
            this.f403653d = true;
            this.f403651b.e();
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return this.f403654e.getF318621e();
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onError(Throwable th2) {
            if (this.f403653d) {
                C47998a.b(th2);
            } else {
                this.f403653d = true;
                this.f403651b.onError(th2);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.rxjava3.core.G
        public final void onNext(T t12) {
            if (this.f403653d) {
                if (t12 instanceof io.reactivex.rxjava3.core.y) {
                    io.reactivex.rxjava3.core.y yVar = (io.reactivex.rxjava3.core.y) t12;
                    if (NotificationLite.i(yVar.f401975a)) {
                        C47998a.b(yVar.b());
                        return;
                    }
                    return;
                }
                return;
            }
            try {
                io.reactivex.rxjava3.core.y<R> yVarApply = this.f403652c.apply(t12);
                Objects.requireNonNull(yVarApply, "The selector returned a null Notification");
                io.reactivex.rxjava3.core.y<R> yVar2 = yVarApply;
                if (NotificationLite.i(yVar2.f401975a)) {
                    this.f403654e.dispose();
                    onError(yVar2.b());
                } else if (!yVar2.d()) {
                    this.f403651b.onNext(yVar2.c());
                } else {
                    this.f403654e.dispose();
                    e();
                }
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                this.f403654e.dispose();
                onError(th2);
            }
        }
    }

    public I(W w12, l41.o oVar) {
        super(w12);
        this.f403650c = oVar;
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(io.reactivex.rxjava3.core.G<? super R> g12) {
        this.f403951b.c(new a(g12, this.f403650c));
    }
}
