package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;
import s41.C47998a;

/* compiled from: MaybeTakeUntilMaybe.java */
/* loaded from: classes8.dex */
public final class k0<T, U> extends AbstractC41907a<T, T> {

    /* compiled from: MaybeTakeUntilMaybe.java */
    public static final class a<T, U> extends AtomicReference<io.reactivex.rxjava3.disposables.d> implements io.reactivex.rxjava3.core.t<T>, io.reactivex.rxjava3.disposables.d {
        private static final long serialVersionUID = -2187421758664251153L;

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.t<? super T> f403260b;

        /* renamed from: c, reason: collision with root package name */
        public final C11472a<U> f403261c = new C11472a<>(this);

        /* compiled from: MaybeTakeUntilMaybe.java */
        /* renamed from: io.reactivex.rxjava3.internal.operators.maybe.k0$a$a, reason: collision with other inner class name */
        public static final class C11472a<U> extends AtomicReference<io.reactivex.rxjava3.disposables.d> implements io.reactivex.rxjava3.core.t<U> {
            private static final long serialVersionUID = -1266041316834525931L;

            /* renamed from: b, reason: collision with root package name */
            public final a<?, U> f403262b;

            public C11472a(a<?, U> aVar) {
                this.f403262b = aVar;
            }

            @Override // io.reactivex.rxjava3.core.t
            public final void b(io.reactivex.rxjava3.disposables.d dVar) {
                DisposableHelper.e(this, dVar);
            }

            @Override // io.reactivex.rxjava3.core.t
            public final void e() {
                a<?, U> aVar = this.f403262b;
                aVar.getClass();
                if (DisposableHelper.a(aVar)) {
                    aVar.f403260b.e();
                }
            }

            @Override // io.reactivex.rxjava3.core.t
            public final void onError(Throwable th2) {
                a<?, U> aVar = this.f403262b;
                aVar.getClass();
                if (DisposableHelper.a(aVar)) {
                    aVar.f403260b.onError(th2);
                } else {
                    C47998a.b(th2);
                }
            }

            @Override // io.reactivex.rxjava3.core.t
            public final void onSuccess(Object obj) {
                a<?, U> aVar = this.f403262b;
                aVar.getClass();
                if (DisposableHelper.a(aVar)) {
                    aVar.f403260b.e();
                }
            }
        }

        public a(io.reactivex.rxjava3.core.t<? super T> tVar) {
            this.f403260b = tVar;
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            DisposableHelper.e(this, dVar);
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            DisposableHelper.a(this);
            DisposableHelper.a(this.f403261c);
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void e() {
            DisposableHelper.a(this.f403261c);
            DisposableHelper disposableHelper = DisposableHelper.f401986b;
            if (getAndSet(disposableHelper) != disposableHelper) {
                this.f403260b.e();
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return DisposableHelper.b(get());
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void onError(Throwable th2) {
            DisposableHelper.a(this.f403261c);
            DisposableHelper disposableHelper = DisposableHelper.f401986b;
            if (getAndSet(disposableHelper) != disposableHelper) {
                this.f403260b.onError(th2);
            } else {
                C47998a.b(th2);
            }
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void onSuccess(T t12) {
            DisposableHelper.a(this.f403261c);
            DisposableHelper disposableHelper = DisposableHelper.f401986b;
            if (getAndSet(disposableHelper) != disposableHelper) {
                this.f403260b.onSuccess(t12);
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.q
    public final void o(io.reactivex.rxjava3.core.t<? super T> tVar) {
        tVar.b(new a(tVar));
        throw null;
    }
}
