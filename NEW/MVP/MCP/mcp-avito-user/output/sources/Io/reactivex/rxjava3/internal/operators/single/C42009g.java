package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.core.AbstractC41768a;
import io.reactivex.rxjava3.core.InterfaceC41771d;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: SingleDelayWithCompletable.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.single.g, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42009g<T> extends io.reactivex.rxjava3.core.I<T> {

    /* renamed from: b, reason: collision with root package name */
    public final io.reactivex.rxjava3.core.I f404593b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC41768a f404594c;

    /* compiled from: SingleDelayWithCompletable.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.single.g$a */
    public static final class a<T> extends AtomicReference<io.reactivex.rxjava3.disposables.d> implements InterfaceC41771d, io.reactivex.rxjava3.disposables.d {
        private static final long serialVersionUID = -8565274649390031272L;

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.L<? super T> f404595b;

        /* renamed from: c, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.I f404596c;

        public a(io.reactivex.rxjava3.core.L l12, io.reactivex.rxjava3.core.I i12) {
            this.f404595b = l12;
            this.f404596c = i12;
        }

        @Override // io.reactivex.rxjava3.core.InterfaceC41771d
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            if (DisposableHelper.e(this, dVar)) {
                this.f404595b.b(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            DisposableHelper.a(this);
        }

        @Override // io.reactivex.rxjava3.core.InterfaceC41771d
        public final void e() {
            this.f404596c.a(new io.reactivex.rxjava3.internal.observers.D(this.f404595b, this));
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return DisposableHelper.b(get());
        }

        @Override // io.reactivex.rxjava3.core.InterfaceC41771d
        public final void onError(Throwable th2) {
            this.f404595b.onError(th2);
        }
    }

    public C42009g(io.reactivex.rxjava3.core.I i12, AbstractC41768a abstractC41768a) {
        this.f404593b = i12;
        this.f404594c = abstractC41768a;
    }

    @Override // io.reactivex.rxjava3.core.I
    public final void y(io.reactivex.rxjava3.core.L<? super T> l12) {
        this.f404594c.a(new a(l12, this.f404593b));
    }
}
