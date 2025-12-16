package hu.akarnokd.rxjava3.operators;

import io.reactivex.rxjava3.core.AbstractC41768a;
import io.reactivex.rxjava3.core.InterfaceC41771d;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: SingleFlatMapSignalCompletable.java */
/* loaded from: classes8.dex */
final class p0<T> extends AbstractC41768a implements io.reactivex.rxjava3.core.J<T, AbstractC41768a> {

    /* compiled from: SingleFlatMapSignalCompletable.java */
    public static final class a<T> implements io.reactivex.rxjava3.core.L<T>, io.reactivex.rxjava3.disposables.d {

        /* renamed from: b, reason: collision with root package name */
        public final C11343a f398101b;

        /* compiled from: SingleFlatMapSignalCompletable.java */
        /* renamed from: hu.akarnokd.rxjava3.operators.p0$a$a, reason: collision with other inner class name */
        public static final class C11343a extends AtomicReference<io.reactivex.rxjava3.disposables.d> implements InterfaceC41771d {
            private static final long serialVersionUID = 314442824941893429L;

            /* renamed from: b, reason: collision with root package name */
            public final InterfaceC41771d f398102b;

            public C11343a(InterfaceC41771d interfaceC41771d) {
                this.f398102b = interfaceC41771d;
            }

            @Override // io.reactivex.rxjava3.core.InterfaceC41771d
            public final void b(io.reactivex.rxjava3.disposables.d dVar) {
                DisposableHelper.c(this, dVar);
            }

            @Override // io.reactivex.rxjava3.core.InterfaceC41771d
            public final void e() {
                this.f398102b.e();
            }

            @Override // io.reactivex.rxjava3.core.InterfaceC41771d
            public final void onError(Throwable th2) {
                this.f398102b.onError(th2);
            }
        }

        public a(InterfaceC41771d interfaceC41771d) {
            this.f398101b = new C11343a(interfaceC41771d);
        }

        @Override // io.reactivex.rxjava3.core.L
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            C11343a c11343a = this.f398101b;
            if (DisposableHelper.f(c11343a.get(), dVar)) {
                c11343a.lazySet(dVar);
                c11343a.f398102b.b(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            DisposableHelper.a(this.f398101b);
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return DisposableHelper.b(this.f398101b.get());
        }

        @Override // io.reactivex.rxjava3.core.L
        public final void onError(Throwable th2) {
            try {
                throw null;
            } catch (Throwable th3) {
                io.reactivex.rxjava3.exceptions.a.a(th3);
                this.f398101b.onError(th3);
            }
        }

        @Override // io.reactivex.rxjava3.core.L
        public final void onSuccess(T t12) {
            try {
                throw null;
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                this.f398101b.onError(th2);
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41768a
    public final void w(InterfaceC41771d interfaceC41771d) {
        new a(interfaceC41771d);
        throw null;
    }
}
