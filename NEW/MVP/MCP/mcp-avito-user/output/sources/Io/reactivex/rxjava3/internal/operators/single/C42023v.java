package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.exceptions.CompositeException;
import l41.InterfaceC43543a;

/* compiled from: SingleDoOnTerminate.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.single.v, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42023v<T> extends io.reactivex.rxjava3.core.I<T> {

    /* renamed from: b, reason: collision with root package name */
    public final io.reactivex.rxjava3.core.I f404646b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC43543a f404647c;

    /* compiled from: SingleDoOnTerminate.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.single.v$a */
    public final class a implements io.reactivex.rxjava3.core.L<T> {

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.L<? super T> f404648b;

        public a(io.reactivex.rxjava3.core.L<? super T> l12) {
            this.f404648b = l12;
        }

        @Override // io.reactivex.rxjava3.core.L
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            this.f404648b.b(dVar);
        }

        @Override // io.reactivex.rxjava3.core.L
        public final void onError(Throwable th2) {
            try {
                C42023v.this.f404647c.run();
            } catch (Throwable th3) {
                io.reactivex.rxjava3.exceptions.a.a(th3);
                th2 = new CompositeException(th2, th3);
            }
            this.f404648b.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.L
        public final void onSuccess(T t12) {
            io.reactivex.rxjava3.core.L<? super T> l12 = this.f404648b;
            try {
                C42023v.this.f404647c.run();
                l12.onSuccess(t12);
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                l12.onError(th2);
            }
        }
    }

    public C42023v(io.reactivex.rxjava3.core.I i12, InterfaceC43543a interfaceC43543a) {
        this.f404646b = i12;
        this.f404647c = interfaceC43543a;
    }

    @Override // io.reactivex.rxjava3.core.I
    public final void y(io.reactivex.rxjava3.core.L<? super T> l12) {
        this.f404646b.a(new a(l12));
    }
}
