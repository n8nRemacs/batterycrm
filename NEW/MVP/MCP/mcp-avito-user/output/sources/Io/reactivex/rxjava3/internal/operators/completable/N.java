package io.reactivex.rxjava3.internal.operators.completable;

import io.reactivex.rxjava3.core.AbstractC41768a;
import io.reactivex.rxjava3.core.InterfaceC41771d;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import s41.C47998a;

/* compiled from: CompletableTakeUntilCompletable.java */
/* loaded from: classes8.dex */
public final class N extends AbstractC41768a {

    /* compiled from: CompletableTakeUntilCompletable.java */
    public static final class a extends AtomicReference<io.reactivex.rxjava3.disposables.d> implements InterfaceC41771d, io.reactivex.rxjava3.disposables.d {
        private static final long serialVersionUID = 3533011714830024923L;

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC41771d f402186b;

        /* renamed from: c, reason: collision with root package name */
        public final C11444a f402187c = new C11444a(this);

        /* renamed from: d, reason: collision with root package name */
        public final AtomicBoolean f402188d = new AtomicBoolean();

        /* compiled from: CompletableTakeUntilCompletable.java */
        /* renamed from: io.reactivex.rxjava3.internal.operators.completable.N$a$a, reason: collision with other inner class name */
        public static final class C11444a extends AtomicReference<io.reactivex.rxjava3.disposables.d> implements InterfaceC41771d {
            private static final long serialVersionUID = 5176264485428790318L;

            /* renamed from: b, reason: collision with root package name */
            public final a f402189b;

            public C11444a(a aVar) {
                this.f402189b = aVar;
            }

            @Override // io.reactivex.rxjava3.core.InterfaceC41771d
            public final void b(io.reactivex.rxjava3.disposables.d dVar) {
                DisposableHelper.e(this, dVar);
            }

            @Override // io.reactivex.rxjava3.core.InterfaceC41771d
            public final void e() {
                a aVar = this.f402189b;
                if (aVar.f402188d.compareAndSet(false, true)) {
                    DisposableHelper.a(aVar);
                    aVar.f402186b.e();
                }
            }

            @Override // io.reactivex.rxjava3.core.InterfaceC41771d
            public final void onError(Throwable th2) {
                a aVar = this.f402189b;
                if (!aVar.f402188d.compareAndSet(false, true)) {
                    C47998a.b(th2);
                } else {
                    DisposableHelper.a(aVar);
                    aVar.f402186b.onError(th2);
                }
            }
        }

        public a(InterfaceC41771d interfaceC41771d) {
            this.f402186b = interfaceC41771d;
        }

        @Override // io.reactivex.rxjava3.core.InterfaceC41771d
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            DisposableHelper.e(this, dVar);
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            if (this.f402188d.compareAndSet(false, true)) {
                DisposableHelper.a(this);
                DisposableHelper.a(this.f402187c);
            }
        }

        @Override // io.reactivex.rxjava3.core.InterfaceC41771d
        public final void e() {
            if (this.f402188d.compareAndSet(false, true)) {
                DisposableHelper.a(this.f402187c);
                this.f402186b.e();
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return this.f402188d.get();
        }

        @Override // io.reactivex.rxjava3.core.InterfaceC41771d
        public final void onError(Throwable th2) {
            if (!this.f402188d.compareAndSet(false, true)) {
                C47998a.b(th2);
            } else {
                DisposableHelper.a(this.f402187c);
                this.f402186b.onError(th2);
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41768a
    public final void w(InterfaceC41771d interfaceC41771d) {
        interfaceC41771d.b(new a(interfaceC41771d));
        throw null;
    }
}
