package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;
import n41.InterfaceC44190g;

/* compiled from: MaybeSwitchIfEmptySingle.java */
/* loaded from: classes8.dex */
public final class j0<T> extends io.reactivex.rxjava3.core.I<T> implements InterfaceC44190g<T> {

    /* renamed from: b, reason: collision with root package name */
    public final io.reactivex.rxjava3.core.q f403253b;

    /* renamed from: c, reason: collision with root package name */
    public final io.reactivex.rxjava3.core.I f403254c;

    /* compiled from: MaybeSwitchIfEmptySingle.java */
    public static final class a<T> extends AtomicReference<io.reactivex.rxjava3.disposables.d> implements io.reactivex.rxjava3.core.t<T>, io.reactivex.rxjava3.disposables.d {
        private static final long serialVersionUID = 4603919676453758899L;

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.L<? super T> f403255b;

        /* renamed from: c, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.I f403256c;

        /* compiled from: MaybeSwitchIfEmptySingle.java */
        /* renamed from: io.reactivex.rxjava3.internal.operators.maybe.j0$a$a, reason: collision with other inner class name */
        public static final class C11471a<T> implements io.reactivex.rxjava3.core.L<T> {

            /* renamed from: b, reason: collision with root package name */
            public final io.reactivex.rxjava3.core.L<? super T> f403257b;

            /* renamed from: c, reason: collision with root package name */
            public final AtomicReference<io.reactivex.rxjava3.disposables.d> f403258c;

            public C11471a(io.reactivex.rxjava3.core.L<? super T> l12, AtomicReference<io.reactivex.rxjava3.disposables.d> atomicReference) {
                this.f403257b = l12;
                this.f403258c = atomicReference;
            }

            @Override // io.reactivex.rxjava3.core.L
            public final void b(io.reactivex.rxjava3.disposables.d dVar) {
                DisposableHelper.e(this.f403258c, dVar);
            }

            @Override // io.reactivex.rxjava3.core.L
            public final void onError(Throwable th2) {
                this.f403257b.onError(th2);
            }

            @Override // io.reactivex.rxjava3.core.L
            public final void onSuccess(T t12) {
                this.f403257b.onSuccess(t12);
            }
        }

        public a(io.reactivex.rxjava3.core.L l12, io.reactivex.rxjava3.core.I i12) {
            this.f403255b = l12;
            this.f403256c = i12;
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            if (DisposableHelper.e(this, dVar)) {
                this.f403255b.b(this);
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
            this.f403256c.a(new C11471a(this.f403255b, this));
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return DisposableHelper.b(get());
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void onError(Throwable th2) {
            this.f403255b.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void onSuccess(T t12) {
            this.f403255b.onSuccess(t12);
        }
    }

    public j0(io.reactivex.rxjava3.core.q qVar, io.reactivex.rxjava3.core.I i12) {
        this.f403253b = qVar;
        this.f403254c = i12;
    }

    @Override // io.reactivex.rxjava3.core.I
    public final void y(io.reactivex.rxjava3.core.L<? super T> l12) {
        this.f403253b.a(new a(l12, this.f403254c));
    }
}
