package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.core.AbstractC41768a;
import io.reactivex.rxjava3.core.InterfaceC41771d;
import io.reactivex.rxjava3.core.InterfaceC41774g;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: SingleFlatMapCompletable.java */
/* loaded from: classes8.dex */
public final class A<T> extends AbstractC41768a {

    /* renamed from: b, reason: collision with root package name */
    public final io.reactivex.rxjava3.core.I f404474b;

    /* renamed from: c, reason: collision with root package name */
    public final l41.o<? super T, ? extends InterfaceC41774g> f404475c;

    /* compiled from: SingleFlatMapCompletable.java */
    public static final class a<T> extends AtomicReference<io.reactivex.rxjava3.disposables.d> implements io.reactivex.rxjava3.core.L<T>, InterfaceC41771d, io.reactivex.rxjava3.disposables.d {
        private static final long serialVersionUID = -2177128922851101253L;

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC41771d f404476b;

        /* renamed from: c, reason: collision with root package name */
        public final l41.o<? super T, ? extends InterfaceC41774g> f404477c;

        public a(InterfaceC41771d interfaceC41771d, l41.o<? super T, ? extends InterfaceC41774g> oVar) {
            this.f404476b = interfaceC41771d;
            this.f404477c = oVar;
        }

        @Override // io.reactivex.rxjava3.core.L
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            DisposableHelper.c(this, dVar);
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            DisposableHelper.a(this);
        }

        @Override // io.reactivex.rxjava3.core.InterfaceC41771d
        public final void e() {
            this.f404476b.e();
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final boolean i() {
            return DisposableHelper.b(get());
        }

        @Override // io.reactivex.rxjava3.core.L
        public final void onError(Throwable th2) {
            this.f404476b.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.L
        public final void onSuccess(T t12) {
            try {
                InterfaceC41774g interfaceC41774gApply = this.f404477c.apply(t12);
                Objects.requireNonNull(interfaceC41774gApply, "The mapper returned a null CompletableSource");
                InterfaceC41774g interfaceC41774g = interfaceC41774gApply;
                if (i()) {
                    return;
                }
                interfaceC41774g.a(this);
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                onError(th2);
            }
        }
    }

    public A(io.reactivex.rxjava3.core.I i12, l41.o oVar) {
        this.f404474b = i12;
        this.f404475c = oVar;
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41768a
    public final void w(InterfaceC41771d interfaceC41771d) {
        a aVar = new a(interfaceC41771d, this.f404475c);
        interfaceC41771d.b(aVar);
        this.f404474b.a(aVar);
    }
}
