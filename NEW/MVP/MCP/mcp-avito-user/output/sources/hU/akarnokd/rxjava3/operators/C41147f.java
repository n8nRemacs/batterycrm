package hu.akarnokd.rxjava3.operators;

import io.reactivex.rxjava3.core.InterfaceC41769b;
import io.reactivex.rxjava3.core.InterfaceC41771d;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: CompletableFlatMapSignalObservable.java */
/* renamed from: hu.akarnokd.rxjava3.operators.f, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C41147f<R> extends io.reactivex.rxjava3.core.z<R> implements InterfaceC41769b<io.reactivex.rxjava3.core.z<R>> {

    /* compiled from: CompletableFlatMapSignalObservable.java */
    /* renamed from: hu.akarnokd.rxjava3.operators.f$a */
    public static final class a<R> implements InterfaceC41771d, io.reactivex.rxjava3.disposables.d {

        /* renamed from: b, reason: collision with root package name */
        public final C11336a<R> f398026b;

        /* compiled from: CompletableFlatMapSignalObservable.java */
        /* renamed from: hu.akarnokd.rxjava3.operators.f$a$a, reason: collision with other inner class name */
        public static final class C11336a<R> extends AtomicReference<io.reactivex.rxjava3.disposables.d> implements io.reactivex.rxjava3.core.G<R> {
            private static final long serialVersionUID = 314442824941893429L;

            /* renamed from: b, reason: collision with root package name */
            public final io.reactivex.rxjava3.core.G<? super R> f398027b;

            public C11336a(io.reactivex.rxjava3.core.G<? super R> g12) {
                this.f398027b = g12;
            }

            @Override // io.reactivex.rxjava3.core.G
            public final void b(io.reactivex.rxjava3.disposables.d dVar) {
                DisposableHelper.c(this, dVar);
            }

            @Override // io.reactivex.rxjava3.core.G
            public final void e() {
                this.f398027b.e();
            }

            @Override // io.reactivex.rxjava3.core.G
            public final void onError(Throwable th2) {
                this.f398027b.onError(th2);
            }

            @Override // io.reactivex.rxjava3.core.G
            public final void onNext(R r12) {
                this.f398027b.onNext(r12);
            }
        }

        public a(io.reactivex.rxjava3.core.G g12) {
            this.f398026b = new C11336a<>(g12);
        }

        @Override // io.reactivex.rxjava3.core.InterfaceC41771d
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            C11336a<R> c11336a = this.f398026b;
            if (DisposableHelper.f(c11336a.get(), dVar)) {
                c11336a.lazySet(dVar);
                c11336a.f398027b.b(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            DisposableHelper.a(this.f398026b);
        }

        @Override // io.reactivex.rxjava3.core.InterfaceC41771d
        public final void e() {
            try {
                throw null;
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                this.f398026b.onError(th2);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return DisposableHelper.b(this.f398026b.get());
        }

        @Override // io.reactivex.rxjava3.core.InterfaceC41771d
        public final void onError(Throwable th2) {
            try {
                throw null;
            } catch (Throwable th3) {
                io.reactivex.rxjava3.exceptions.a.a(th3);
                this.f398026b.onError(th3);
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(io.reactivex.rxjava3.core.G<? super R> g12) {
        new a(g12);
        throw null;
    }
}
