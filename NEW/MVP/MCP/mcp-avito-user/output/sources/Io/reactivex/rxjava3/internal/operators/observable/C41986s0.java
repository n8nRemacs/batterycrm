package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.AbstractC41768a;
import io.reactivex.rxjava3.core.InterfaceC41771d;
import n41.InterfaceC44188e;

/* compiled from: ObservableIgnoreElementsCompletable.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.observable.s0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41986s0<T> extends AbstractC41768a implements InterfaceC44188e<T> {

    /* renamed from: b, reason: collision with root package name */
    public final io.reactivex.rxjava3.core.z f404273b;

    public C41986s0(io.reactivex.rxjava3.core.z zVar) {
        this.f404273b = zVar;
    }

    @Override // n41.InterfaceC44188e
    public final io.reactivex.rxjava3.core.z<T> d() {
        return new C41983r0(this.f404273b);
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41768a
    public final void w(InterfaceC41771d interfaceC41771d) {
        this.f404273b.c(new a(interfaceC41771d));
    }

    /* compiled from: ObservableIgnoreElementsCompletable.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.observable.s0$a */
    public static final class a<T> implements io.reactivex.rxjava3.core.G<T>, io.reactivex.rxjava3.disposables.d {

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC41771d f404274b;

        /* renamed from: c, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f404275c;

        public a(InterfaceC41771d interfaceC41771d) {
            this.f404274b = interfaceC41771d;
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            this.f404275c = dVar;
            this.f404274b.b(this);
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            this.f404275c.dispose();
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void e() {
            this.f404274b.e();
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return this.f404275c.getF318621e();
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onError(Throwable th2) {
            this.f404274b.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onNext(T t12) {
        }
    }
}
