package io.reactivex.rxjava3.internal.operators.completable;

import io.reactivex.rxjava3.core.AbstractC41768a;
import io.reactivex.rxjava3.core.InterfaceC41771d;

/* compiled from: CompletableToSingle.java */
/* loaded from: classes8.dex */
public final class T<T> extends io.reactivex.rxjava3.core.I<T> {

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC41768a f402207b;

    /* renamed from: c, reason: collision with root package name */
    public final l41.s<? extends T> f402208c;

    /* renamed from: d, reason: collision with root package name */
    public final T f402209d;

    /* compiled from: CompletableToSingle.java */
    public final class a implements InterfaceC41771d {

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.L<? super T> f402210b;

        public a(io.reactivex.rxjava3.core.L<? super T> l12) {
            this.f402210b = l12;
        }

        @Override // io.reactivex.rxjava3.core.InterfaceC41771d
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            this.f402210b.b(dVar);
        }

        @Override // io.reactivex.rxjava3.core.InterfaceC41771d
        public final void e() {
            T t12;
            T t13 = T.this;
            l41.s<? extends T> sVar = t13.f402208c;
            io.reactivex.rxjava3.core.L<? super T> l12 = this.f402210b;
            if (sVar != null) {
                try {
                    t12 = sVar.get();
                } catch (Throwable th2) {
                    io.reactivex.rxjava3.exceptions.a.a(th2);
                    l12.onError(th2);
                    return;
                }
            } else {
                t12 = t13.f402209d;
            }
            if (t12 == null) {
                l12.onError(new NullPointerException("The value supplied is null"));
            } else {
                l12.onSuccess(t12);
            }
        }

        @Override // io.reactivex.rxjava3.core.InterfaceC41771d
        public final void onError(Throwable th2) {
            this.f402210b.onError(th2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public T(AbstractC41768a abstractC41768a, l41.s sVar, Object obj) {
        this.f402207b = abstractC41768a;
        this.f402209d = obj;
        this.f402208c = sVar;
    }

    @Override // io.reactivex.rxjava3.core.I
    public final void y(io.reactivex.rxjava3.core.L<? super T> l12) {
        this.f402207b.a(new a(l12));
    }
}
