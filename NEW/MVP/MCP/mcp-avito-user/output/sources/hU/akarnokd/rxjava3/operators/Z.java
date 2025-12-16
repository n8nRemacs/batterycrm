package hu.akarnokd.rxjava3.operators;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: MaybeFlatMapSignalObservable.java */
/* loaded from: classes8.dex */
final class Z<T, R> extends io.reactivex.rxjava3.core.z<R> implements io.reactivex.rxjava3.core.r<T, io.reactivex.rxjava3.core.z<R>> {

    /* compiled from: MaybeFlatMapSignalObservable.java */
    public static final class a<T, R> implements io.reactivex.rxjava3.core.t<T>, io.reactivex.rxjava3.disposables.d {

        /* renamed from: b, reason: collision with root package name */
        public final C11329a<R> f397995b;

        /* compiled from: MaybeFlatMapSignalObservable.java */
        /* renamed from: hu.akarnokd.rxjava3.operators.Z$a$a, reason: collision with other inner class name */
        public static final class C11329a<R> extends AtomicReference<io.reactivex.rxjava3.disposables.d> implements io.reactivex.rxjava3.core.G<R> {
            private static final long serialVersionUID = 314442824941893429L;

            /* renamed from: b, reason: collision with root package name */
            public final io.reactivex.rxjava3.core.G<? super R> f397996b;

            public C11329a(io.reactivex.rxjava3.core.G<? super R> g12) {
                this.f397996b = g12;
            }

            @Override // io.reactivex.rxjava3.core.G
            public final void b(io.reactivex.rxjava3.disposables.d dVar) {
                DisposableHelper.c(this, dVar);
            }

            @Override // io.reactivex.rxjava3.core.G
            public final void e() {
                this.f397996b.e();
            }

            @Override // io.reactivex.rxjava3.core.G
            public final void onError(Throwable th2) {
                this.f397996b.onError(th2);
            }

            @Override // io.reactivex.rxjava3.core.G
            public final void onNext(R r12) {
                this.f397996b.onNext(r12);
            }
        }

        public a(io.reactivex.rxjava3.core.G g12) {
            this.f397995b = new C11329a<>(g12);
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            C11329a<R> c11329a = this.f397995b;
            if (DisposableHelper.f(c11329a.get(), dVar)) {
                c11329a.lazySet(dVar);
                c11329a.f397996b.b(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            DisposableHelper.a(this.f397995b);
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void e() {
            try {
                throw null;
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                this.f397995b.onError(th2);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return DisposableHelper.b(this.f397995b.get());
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void onError(Throwable th2) {
            try {
                throw null;
            } catch (Throwable th3) {
                io.reactivex.rxjava3.exceptions.a.a(th3);
                this.f397995b.onError(th3);
            }
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void onSuccess(T t12) {
            try {
                throw null;
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                this.f397995b.onError(th2);
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(io.reactivex.rxjava3.core.G<? super R> g12) {
        new a(g12);
        throw null;
    }
}
