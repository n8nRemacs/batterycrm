package io.reactivex.rxjava3.internal.operators.completable;

import io.reactivex.rxjava3.core.AbstractC41768a;
import io.reactivex.rxjava3.core.InterfaceC41771d;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: CompletableAndThenCompletable.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.completable.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41811b extends AbstractC41768a {

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC41768a f402214b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC41768a f402215c;

    /* compiled from: CompletableAndThenCompletable.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.completable.b$a */
    public static final class a implements InterfaceC41771d {

        /* renamed from: b, reason: collision with root package name */
        public final AtomicReference<io.reactivex.rxjava3.disposables.d> f402216b;

        /* renamed from: c, reason: collision with root package name */
        public final InterfaceC41771d f402217c;

        public a(AtomicReference<io.reactivex.rxjava3.disposables.d> atomicReference, InterfaceC41771d interfaceC41771d) {
            this.f402216b = atomicReference;
            this.f402217c = interfaceC41771d;
        }

        @Override // io.reactivex.rxjava3.core.InterfaceC41771d
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            DisposableHelper.c(this.f402216b, dVar);
        }

        @Override // io.reactivex.rxjava3.core.InterfaceC41771d
        public final void e() {
            this.f402217c.e();
        }

        @Override // io.reactivex.rxjava3.core.InterfaceC41771d
        public final void onError(Throwable th2) {
            this.f402217c.onError(th2);
        }
    }

    /* compiled from: CompletableAndThenCompletable.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.completable.b$b, reason: collision with other inner class name */
    public static final class C11447b extends AtomicReference<io.reactivex.rxjava3.disposables.d> implements InterfaceC41771d, io.reactivex.rxjava3.disposables.d {
        private static final long serialVersionUID = -4101678820158072998L;

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC41771d f402218b;

        /* renamed from: c, reason: collision with root package name */
        public final AbstractC41768a f402219c;

        public C11447b(InterfaceC41771d interfaceC41771d, AbstractC41768a abstractC41768a) {
            this.f402218b = interfaceC41771d;
            this.f402219c = abstractC41768a;
        }

        @Override // io.reactivex.rxjava3.core.InterfaceC41771d
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            if (DisposableHelper.e(this, dVar)) {
                this.f402218b.b(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            DisposableHelper.a(this);
        }

        @Override // io.reactivex.rxjava3.core.InterfaceC41771d
        public final void e() {
            this.f402219c.a(new a(this, this.f402218b));
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return DisposableHelper.b(get());
        }

        @Override // io.reactivex.rxjava3.core.InterfaceC41771d
        public final void onError(Throwable th2) {
            this.f402218b.onError(th2);
        }
    }

    public C41811b(AbstractC41768a abstractC41768a, AbstractC41768a abstractC41768a2) {
        this.f402214b = abstractC41768a;
        this.f402215c = abstractC41768a2;
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41768a
    public final void w(InterfaceC41771d interfaceC41771d) {
        this.f402214b.a(new C11447b(interfaceC41771d, this.f402215c));
    }
}
