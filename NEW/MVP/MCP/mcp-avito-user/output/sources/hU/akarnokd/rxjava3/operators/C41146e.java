package hu.akarnokd.rxjava3.operators;

import io.reactivex.rxjava3.core.InterfaceC41769b;
import io.reactivex.rxjava3.core.InterfaceC41771d;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: CompletableFlatMapSignalMaybe.java */
/* renamed from: hu.akarnokd.rxjava3.operators.e, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C41146e<R> extends io.reactivex.rxjava3.core.q<R> implements InterfaceC41769b<io.reactivex.rxjava3.core.q<R>> {

    /* compiled from: CompletableFlatMapSignalMaybe.java */
    /* renamed from: hu.akarnokd.rxjava3.operators.e$a */
    public static final class a<R> implements InterfaceC41771d, io.reactivex.rxjava3.disposables.d {

        /* renamed from: b, reason: collision with root package name */
        public final C11334a<R> f398013b;

        /* compiled from: CompletableFlatMapSignalMaybe.java */
        /* renamed from: hu.akarnokd.rxjava3.operators.e$a$a, reason: collision with other inner class name */
        public static final class C11334a<R> extends AtomicReference<io.reactivex.rxjava3.disposables.d> implements io.reactivex.rxjava3.core.t<R> {
            private static final long serialVersionUID = 314442824941893429L;

            /* renamed from: b, reason: collision with root package name */
            public final io.reactivex.rxjava3.core.t<? super R> f398014b;

            public C11334a(io.reactivex.rxjava3.core.t<? super R> tVar) {
                this.f398014b = tVar;
            }

            @Override // io.reactivex.rxjava3.core.t
            public final void b(io.reactivex.rxjava3.disposables.d dVar) {
                DisposableHelper.c(this, dVar);
            }

            @Override // io.reactivex.rxjava3.core.t
            public final void e() {
                this.f398014b.e();
            }

            @Override // io.reactivex.rxjava3.core.t
            public final void onError(Throwable th2) {
                this.f398014b.onError(th2);
            }

            @Override // io.reactivex.rxjava3.core.t
            public final void onSuccess(R r12) {
                this.f398014b.onSuccess(r12);
            }
        }

        public a(io.reactivex.rxjava3.core.t tVar) {
            this.f398013b = new C11334a<>(tVar);
        }

        @Override // io.reactivex.rxjava3.core.InterfaceC41771d
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            C11334a<R> c11334a = this.f398013b;
            if (DisposableHelper.f(c11334a.get(), dVar)) {
                c11334a.lazySet(dVar);
                c11334a.f398014b.b(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            DisposableHelper.a(this.f398013b);
        }

        @Override // io.reactivex.rxjava3.core.InterfaceC41771d
        public final void e() {
            try {
                throw null;
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                this.f398013b.onError(th2);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return DisposableHelper.b(this.f398013b.get());
        }

        @Override // io.reactivex.rxjava3.core.InterfaceC41771d
        public final void onError(Throwable th2) {
            try {
                throw null;
            } catch (Throwable th3) {
                io.reactivex.rxjava3.exceptions.a.a(th3);
                this.f398013b.onError(th3);
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.q
    public final void o(io.reactivex.rxjava3.core.t<? super R> tVar) {
        new a(tVar);
        throw null;
    }
}
