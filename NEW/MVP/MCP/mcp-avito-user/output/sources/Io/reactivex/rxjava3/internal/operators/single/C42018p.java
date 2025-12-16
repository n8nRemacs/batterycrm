package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;
import l41.InterfaceC43543a;
import s41.C47998a;

/* compiled from: SingleDoOnDispose.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.single.p, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42018p<T> extends io.reactivex.rxjava3.core.I<T> {

    /* renamed from: b, reason: collision with root package name */
    public final io.reactivex.rxjava3.core.I f404624b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC43543a f404625c;

    /* compiled from: SingleDoOnDispose.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.single.p$a */
    public static final class a<T> extends AtomicReference<InterfaceC43543a> implements io.reactivex.rxjava3.core.L<T>, io.reactivex.rxjava3.disposables.d {
        private static final long serialVersionUID = -8583764624474935784L;

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.L<? super T> f404626b;

        /* renamed from: c, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f404627c;

        public a(io.reactivex.rxjava3.core.L<? super T> l12, InterfaceC43543a interfaceC43543a) {
            this.f404626b = l12;
            lazySet(interfaceC43543a);
        }

        @Override // io.reactivex.rxjava3.core.L
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            if (DisposableHelper.f(this.f404627c, dVar)) {
                this.f404627c = dVar;
                this.f404626b.b(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            InterfaceC43543a andSet = getAndSet(null);
            if (andSet != null) {
                try {
                    andSet.run();
                } catch (Throwable th2) {
                    io.reactivex.rxjava3.exceptions.a.a(th2);
                    C47998a.b(th2);
                }
                this.f404627c.dispose();
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return this.f404627c.getF318621e();
        }

        @Override // io.reactivex.rxjava3.core.L
        public final void onError(Throwable th2) {
            this.f404626b.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.L
        public final void onSuccess(T t12) {
            this.f404626b.onSuccess(t12);
        }
    }

    public C42018p(io.reactivex.rxjava3.core.I i12, InterfaceC43543a interfaceC43543a) {
        this.f404624b = i12;
        this.f404625c = interfaceC43543a;
    }

    @Override // io.reactivex.rxjava3.core.I
    public final void y(io.reactivex.rxjava3.core.L<? super T> l12) {
        this.f404624b.a(new a(l12, this.f404625c));
    }
}
