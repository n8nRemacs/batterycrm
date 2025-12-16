package hu.akarnokd.rxjava3.operators;

import io.reactivex.rxjava3.core.AbstractC41768a;
import io.reactivex.rxjava3.core.InterfaceC41771d;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: MaybeFlatMapSignalCompletable.java */
/* loaded from: classes8.dex */
final class W<T> extends AbstractC41768a implements io.reactivex.rxjava3.core.r<T, AbstractC41768a> {

    /* compiled from: MaybeFlatMapSignalCompletable.java */
    public static final class a<T> implements io.reactivex.rxjava3.core.t<T>, io.reactivex.rxjava3.disposables.d {

        /* renamed from: b, reason: collision with root package name */
        public final C11326a f397987b;

        /* compiled from: MaybeFlatMapSignalCompletable.java */
        /* renamed from: hu.akarnokd.rxjava3.operators.W$a$a, reason: collision with other inner class name */
        public static final class C11326a extends AtomicReference<io.reactivex.rxjava3.disposables.d> implements InterfaceC41771d {
            private static final long serialVersionUID = 314442824941893429L;

            /* renamed from: b, reason: collision with root package name */
            public final InterfaceC41771d f397988b;

            public C11326a(InterfaceC41771d interfaceC41771d) {
                this.f397988b = interfaceC41771d;
            }

            @Override // io.reactivex.rxjava3.core.InterfaceC41771d
            public final void b(io.reactivex.rxjava3.disposables.d dVar) {
                DisposableHelper.c(this, dVar);
            }

            @Override // io.reactivex.rxjava3.core.InterfaceC41771d
            public final void e() {
                this.f397988b.e();
            }

            @Override // io.reactivex.rxjava3.core.InterfaceC41771d
            public final void onError(Throwable th2) {
                this.f397988b.onError(th2);
            }
        }

        public a(InterfaceC41771d interfaceC41771d) {
            this.f397987b = new C11326a(interfaceC41771d);
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            C11326a c11326a = this.f397987b;
            if (DisposableHelper.f(c11326a.get(), dVar)) {
                c11326a.lazySet(dVar);
                c11326a.f397988b.b(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            DisposableHelper.a(this.f397987b);
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void e() {
            try {
                throw null;
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                this.f397987b.onError(th2);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return DisposableHelper.b(this.f397987b.get());
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void onError(Throwable th2) {
            try {
                throw null;
            } catch (Throwable th3) {
                io.reactivex.rxjava3.exceptions.a.a(th3);
                this.f397987b.onError(th3);
            }
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void onSuccess(T t12) {
            try {
                throw null;
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                this.f397987b.onError(th2);
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41768a
    public final void w(InterfaceC41771d interfaceC41771d) {
        new a(interfaceC41771d);
        throw null;
    }
}
