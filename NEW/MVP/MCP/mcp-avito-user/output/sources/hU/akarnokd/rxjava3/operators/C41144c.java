package hu.akarnokd.rxjava3.operators;

import io.reactivex.rxjava3.core.AbstractC41768a;
import io.reactivex.rxjava3.core.InterfaceC41771d;
import io.reactivex.rxjava3.core.InterfaceC41775h;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: CompletableFlatMapSignalCompletable.java */
/* renamed from: hu.akarnokd.rxjava3.operators.c, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C41144c extends AbstractC41768a implements InterfaceC41775h {

    /* compiled from: CompletableFlatMapSignalCompletable.java */
    /* renamed from: hu.akarnokd.rxjava3.operators.c$a */
    public static final class a implements InterfaceC41771d, io.reactivex.rxjava3.disposables.d {

        /* renamed from: b, reason: collision with root package name */
        public final C11331a f398000b;

        /* compiled from: CompletableFlatMapSignalCompletable.java */
        /* renamed from: hu.akarnokd.rxjava3.operators.c$a$a, reason: collision with other inner class name */
        public static final class C11331a extends AtomicReference<io.reactivex.rxjava3.disposables.d> implements InterfaceC41771d {
            private static final long serialVersionUID = 314442824941893429L;

            /* renamed from: b, reason: collision with root package name */
            public final InterfaceC41771d f398001b;

            public C11331a(InterfaceC41771d interfaceC41771d) {
                this.f398001b = interfaceC41771d;
            }

            @Override // io.reactivex.rxjava3.core.InterfaceC41771d
            public final void b(io.reactivex.rxjava3.disposables.d dVar) {
                DisposableHelper.c(this, dVar);
            }

            @Override // io.reactivex.rxjava3.core.InterfaceC41771d
            public final void e() {
                this.f398001b.e();
            }

            @Override // io.reactivex.rxjava3.core.InterfaceC41771d
            public final void onError(Throwable th2) {
                this.f398001b.onError(th2);
            }
        }

        public a(InterfaceC41771d interfaceC41771d) {
            this.f398000b = new C11331a(interfaceC41771d);
        }

        @Override // io.reactivex.rxjava3.core.InterfaceC41771d
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            C11331a c11331a = this.f398000b;
            if (DisposableHelper.f(c11331a.get(), dVar)) {
                c11331a.lazySet(dVar);
                c11331a.f398001b.b(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            DisposableHelper.a(this.f398000b);
        }

        @Override // io.reactivex.rxjava3.core.InterfaceC41771d
        public final void e() {
            try {
                throw null;
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                this.f398000b.onError(th2);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return DisposableHelper.b(this.f398000b.get());
        }

        @Override // io.reactivex.rxjava3.core.InterfaceC41771d
        public final void onError(Throwable th2) {
            try {
                throw null;
            } catch (Throwable th3) {
                io.reactivex.rxjava3.exceptions.a.a(th3);
                this.f398000b.onError(th3);
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41768a
    public final void w(InterfaceC41771d interfaceC41771d) {
        new a(interfaceC41771d);
        throw null;
    }
}
