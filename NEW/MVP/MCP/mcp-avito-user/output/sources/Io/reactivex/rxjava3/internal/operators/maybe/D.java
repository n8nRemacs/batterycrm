package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.core.AbstractC41768a;
import io.reactivex.rxjava3.core.InterfaceC41771d;
import io.reactivex.rxjava3.core.InterfaceC41774g;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: MaybeFlatMapCompletable.java */
/* loaded from: classes8.dex */
public final class D<T> extends AbstractC41768a {

    /* renamed from: b, reason: collision with root package name */
    public final io.reactivex.rxjava3.core.q f403137b;

    /* renamed from: c, reason: collision with root package name */
    public final l41.o<? super T, ? extends InterfaceC41774g> f403138c;

    /* compiled from: MaybeFlatMapCompletable.java */
    public static final class a<T> extends AtomicReference<io.reactivex.rxjava3.disposables.d> implements io.reactivex.rxjava3.core.t<T>, InterfaceC41771d, io.reactivex.rxjava3.disposables.d {
        private static final long serialVersionUID = -2177128922851101253L;

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC41771d f403139b;

        /* renamed from: c, reason: collision with root package name */
        public final l41.o<? super T, ? extends InterfaceC41774g> f403140c;

        public a(InterfaceC41771d interfaceC41771d, l41.o<? super T, ? extends InterfaceC41774g> oVar) {
            this.f403139b = interfaceC41771d;
            this.f403140c = oVar;
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            DisposableHelper.c(this, dVar);
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            DisposableHelper.a(this);
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void e() {
            this.f403139b.e();
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return DisposableHelper.b(get());
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void onError(Throwable th2) {
            this.f403139b.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void onSuccess(T t12) {
            try {
                InterfaceC41774g interfaceC41774gApply = this.f403140c.apply(t12);
                Objects.requireNonNull(interfaceC41774gApply, "The mapper returned a null CompletableSource");
                InterfaceC41774g interfaceC41774g = interfaceC41774gApply;
                if (getF318621e()) {
                    return;
                }
                interfaceC41774g.a(this);
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                onError(th2);
            }
        }
    }

    public D(io.reactivex.rxjava3.core.q qVar, l41.o oVar) {
        this.f403137b = qVar;
        this.f403138c = oVar;
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41768a
    public final void w(InterfaceC41771d interfaceC41771d) {
        a aVar = new a(interfaceC41771d, this.f403138c);
        interfaceC41771d.b(aVar);
        this.f403137b.a(aVar);
    }
}
