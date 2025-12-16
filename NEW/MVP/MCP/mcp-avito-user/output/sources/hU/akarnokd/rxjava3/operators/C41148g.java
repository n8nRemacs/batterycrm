package hu.akarnokd.rxjava3.operators;

import io.reactivex.rxjava3.core.InterfaceC41769b;
import io.reactivex.rxjava3.core.InterfaceC41771d;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: CompletableFlatMapSignalSingle.java */
/* renamed from: hu.akarnokd.rxjava3.operators.g, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C41148g<R> extends io.reactivex.rxjava3.core.I<R> implements InterfaceC41769b<io.reactivex.rxjava3.core.I<R>> {

    /* compiled from: CompletableFlatMapSignalSingle.java */
    /* renamed from: hu.akarnokd.rxjava3.operators.g$a */
    public static final class a<R> implements InterfaceC41771d, io.reactivex.rxjava3.disposables.d {

        /* renamed from: b, reason: collision with root package name */
        public final C11338a<R> f398036b;

        /* compiled from: CompletableFlatMapSignalSingle.java */
        /* renamed from: hu.akarnokd.rxjava3.operators.g$a$a, reason: collision with other inner class name */
        public static final class C11338a<R> extends AtomicReference<io.reactivex.rxjava3.disposables.d> implements io.reactivex.rxjava3.core.L<R> {
            private static final long serialVersionUID = 314442824941893429L;

            /* renamed from: b, reason: collision with root package name */
            public final io.reactivex.rxjava3.core.L<? super R> f398037b;

            public C11338a(io.reactivex.rxjava3.core.L<? super R> l12) {
                this.f398037b = l12;
            }

            @Override // io.reactivex.rxjava3.core.L
            public final void b(io.reactivex.rxjava3.disposables.d dVar) {
                DisposableHelper.c(this, dVar);
            }

            @Override // io.reactivex.rxjava3.core.L
            public final void onError(Throwable th2) {
                this.f398037b.onError(th2);
            }

            @Override // io.reactivex.rxjava3.core.L
            public final void onSuccess(R r12) {
                this.f398037b.onSuccess(r12);
            }
        }

        public a(io.reactivex.rxjava3.core.L l12) {
            this.f398036b = new C11338a<>(l12);
        }

        @Override // io.reactivex.rxjava3.core.InterfaceC41771d
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            C11338a<R> c11338a = this.f398036b;
            if (DisposableHelper.f(c11338a.get(), dVar)) {
                c11338a.lazySet(dVar);
                c11338a.f398037b.b(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            DisposableHelper.a(this.f398036b);
        }

        @Override // io.reactivex.rxjava3.core.InterfaceC41771d
        public final void e() {
            try {
                throw null;
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                this.f398036b.onError(th2);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return DisposableHelper.b(this.f398036b.get());
        }

        @Override // io.reactivex.rxjava3.core.InterfaceC41771d
        public final void onError(Throwable th2) {
            try {
                throw null;
            } catch (Throwable th3) {
                io.reactivex.rxjava3.exceptions.a.a(th3);
                this.f398036b.onError(th3);
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.I
    public final void y(io.reactivex.rxjava3.core.L<? super R> l12) {
        new a(l12);
        throw null;
    }
}
