package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.exceptions.CompositeException;
import l41.InterfaceC43544b;

/* compiled from: SingleDoOnEvent.java */
/* loaded from: classes8.dex */
public final class r<T> extends io.reactivex.rxjava3.core.I<T> {

    /* renamed from: b, reason: collision with root package name */
    public final io.reactivex.rxjava3.core.I f404632b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC43544b<? super T, ? super Throwable> f404633c;

    /* compiled from: SingleDoOnEvent.java */
    public final class a implements io.reactivex.rxjava3.core.L<T> {

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.L<? super T> f404634b;

        public a(io.reactivex.rxjava3.core.L<? super T> l12) {
            this.f404634b = l12;
        }

        @Override // io.reactivex.rxjava3.core.L
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            this.f404634b.b(dVar);
        }

        @Override // io.reactivex.rxjava3.core.L
        public final void onError(Throwable th2) {
            try {
                r.this.f404633c.accept(null, th2);
            } catch (Throwable th3) {
                io.reactivex.rxjava3.exceptions.a.a(th3);
                th2 = new CompositeException(th2, th3);
            }
            this.f404634b.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.L
        public final void onSuccess(T t12) {
            io.reactivex.rxjava3.core.L<? super T> l12 = this.f404634b;
            try {
                r.this.f404633c.accept(t12, null);
                l12.onSuccess(t12);
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                l12.onError(th2);
            }
        }
    }

    public r(io.reactivex.rxjava3.core.I i12, InterfaceC43544b interfaceC43544b) {
        this.f404632b = i12;
        this.f404633c = interfaceC43544b;
    }

    @Override // io.reactivex.rxjava3.core.I
    public final void y(io.reactivex.rxjava3.core.L<? super T> l12) {
        this.f404632b.a(new a(l12));
    }
}
