package io.reactivex.rxjava3.internal.operators.completable;

import io.reactivex.rxjava3.core.AbstractC41768a;
import io.reactivex.rxjava3.core.InterfaceC41771d;
import io.reactivex.rxjava3.exceptions.CompositeException;

/* compiled from: CompletableOnErrorComplete.java */
/* loaded from: classes8.dex */
public final class I extends AbstractC41768a {

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC41768a f402161b;

    /* renamed from: c, reason: collision with root package name */
    public final l41.r<? super Throwable> f402162c;

    /* compiled from: CompletableOnErrorComplete.java */
    public final class a implements InterfaceC41771d {

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC41771d f402163b;

        public a(InterfaceC41771d interfaceC41771d) {
            this.f402163b = interfaceC41771d;
        }

        @Override // io.reactivex.rxjava3.core.InterfaceC41771d
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            this.f402163b.b(dVar);
        }

        @Override // io.reactivex.rxjava3.core.InterfaceC41771d
        public final void e() {
            this.f402163b.e();
        }

        @Override // io.reactivex.rxjava3.core.InterfaceC41771d
        public final void onError(Throwable th2) {
            InterfaceC41771d interfaceC41771d = this.f402163b;
            try {
                I.this.f402162c.test(th2);
                interfaceC41771d.e();
            } catch (Throwable th3) {
                io.reactivex.rxjava3.exceptions.a.a(th3);
                interfaceC41771d.onError(new CompositeException(th2, th3));
            }
        }
    }

    public I(AbstractC41768a abstractC41768a, l41.r rVar) {
        this.f402161b = abstractC41768a;
        this.f402162c = rVar;
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41768a
    public final void w(InterfaceC41771d interfaceC41771d) {
        this.f402161b.a(new a(interfaceC41771d));
    }
}
