package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: MaybeSwitchIfEmpty.java */
/* loaded from: classes8.dex */
public final class i0<T> extends AbstractC41907a<T, T> {

    /* renamed from: c, reason: collision with root package name */
    public final io.reactivex.rxjava3.core.q f403246c;

    /* compiled from: MaybeSwitchIfEmpty.java */
    public static final class a<T> extends AtomicReference<io.reactivex.rxjava3.disposables.d> implements io.reactivex.rxjava3.core.t<T>, io.reactivex.rxjava3.disposables.d {
        private static final long serialVersionUID = -2223459372976438024L;

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.t<? super T> f403247b;

        /* renamed from: c, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.q f403248c;

        /* compiled from: MaybeSwitchIfEmpty.java */
        /* renamed from: io.reactivex.rxjava3.internal.operators.maybe.i0$a$a, reason: collision with other inner class name */
        public static final class C11470a<T> implements io.reactivex.rxjava3.core.t<T> {

            /* renamed from: b, reason: collision with root package name */
            public final io.reactivex.rxjava3.core.t<? super T> f403249b;

            /* renamed from: c, reason: collision with root package name */
            public final AtomicReference<io.reactivex.rxjava3.disposables.d> f403250c;

            public C11470a(io.reactivex.rxjava3.core.t<? super T> tVar, AtomicReference<io.reactivex.rxjava3.disposables.d> atomicReference) {
                this.f403249b = tVar;
                this.f403250c = atomicReference;
            }

            @Override // io.reactivex.rxjava3.core.t
            public final void b(io.reactivex.rxjava3.disposables.d dVar) {
                DisposableHelper.e(this.f403250c, dVar);
            }

            @Override // io.reactivex.rxjava3.core.t
            public final void e() {
                this.f403249b.e();
            }

            @Override // io.reactivex.rxjava3.core.t
            public final void onError(Throwable th2) {
                this.f403249b.onError(th2);
            }

            @Override // io.reactivex.rxjava3.core.t
            public final void onSuccess(T t12) {
                this.f403249b.onSuccess(t12);
            }
        }

        public a(io.reactivex.rxjava3.core.t tVar, io.reactivex.rxjava3.core.q qVar) {
            this.f403247b = tVar;
            this.f403248c = qVar;
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            if (DisposableHelper.e(this, dVar)) {
                this.f403247b.b(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            DisposableHelper.a(this);
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void e() {
            io.reactivex.rxjava3.disposables.d dVar = get();
            if (dVar == DisposableHelper.f401986b || !compareAndSet(dVar, null)) {
                return;
            }
            this.f403248c.a(new C11470a(this.f403247b, this));
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return DisposableHelper.b(get());
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void onError(Throwable th2) {
            this.f403247b.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void onSuccess(T t12) {
            this.f403247b.onSuccess(t12);
        }
    }

    public i0(io.reactivex.rxjava3.core.q qVar, io.reactivex.rxjava3.core.q qVar2) {
        super(qVar);
        this.f403246c = qVar2;
    }

    @Override // io.reactivex.rxjava3.core.q
    public final void o(io.reactivex.rxjava3.core.t<? super T> tVar) {
        this.f403189b.a(new a(tVar, this.f403246c));
    }
}
