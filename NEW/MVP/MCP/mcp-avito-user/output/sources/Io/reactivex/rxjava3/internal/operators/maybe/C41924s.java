package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicInteger;
import s41.C47998a;

/* compiled from: MaybeDoFinally.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.maybe.s, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41924s<T> extends AbstractC41907a<T, T> {

    /* compiled from: MaybeDoFinally.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.maybe.s$a */
    public static final class a<T> extends AtomicInteger implements io.reactivex.rxjava3.core.t<T>, io.reactivex.rxjava3.disposables.d {
        private static final long serialVersionUID = 4109457741734051389L;

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.t<? super T> f403315b;

        /* renamed from: c, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f403316c;

        public a(io.reactivex.rxjava3.core.t tVar) {
            this.f403315b = tVar;
        }

        public final void a() {
            if (compareAndSet(0, 1)) {
                try {
                    throw null;
                } catch (Throwable th2) {
                    io.reactivex.rxjava3.exceptions.a.a(th2);
                    C47998a.b(th2);
                }
            }
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            if (DisposableHelper.f(this.f403316c, dVar)) {
                this.f403316c = dVar;
                this.f403315b.b(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            this.f403316c.dispose();
            a();
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void e() {
            this.f403315b.e();
            a();
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return this.f403316c.getF318621e();
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void onError(Throwable th2) {
            this.f403315b.onError(th2);
            a();
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void onSuccess(T t12) {
            this.f403315b.onSuccess(t12);
            a();
        }
    }

    @Override // io.reactivex.rxjava3.core.q
    public final void o(io.reactivex.rxjava3.core.t<? super T> tVar) {
        this.f403189b.a(new a(tVar));
    }
}
