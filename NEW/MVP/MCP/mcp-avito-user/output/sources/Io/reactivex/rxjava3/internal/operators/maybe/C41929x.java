package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import s41.C47998a;

/* compiled from: MaybeEqualSingle.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.maybe.x, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41929x<T> extends io.reactivex.rxjava3.core.I<Boolean> {

    /* compiled from: MaybeEqualSingle.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.maybe.x$a */
    public static final class a<T> extends AtomicInteger implements io.reactivex.rxjava3.disposables.d {

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.L<? super Boolean> f403336b;

        /* renamed from: c, reason: collision with root package name */
        public final b<T> f403337c;

        /* renamed from: d, reason: collision with root package name */
        public final b<T> f403338d;

        public a(io.reactivex.rxjava3.core.L l12) {
            super(2);
            this.f403336b = l12;
            this.f403337c = new b<>(this);
            this.f403338d = new b<>(this);
        }

        public final void a() {
            if (decrementAndGet() == 0) {
                Object obj = this.f403337c.f403340c;
                Object obj2 = this.f403338d.f403340c;
                io.reactivex.rxjava3.core.L<? super Boolean> l12 = this.f403336b;
                if (obj == null || obj2 == null) {
                    l12.onSuccess(Boolean.valueOf(obj == null && obj2 == null));
                    return;
                }
                try {
                    throw null;
                } catch (Throwable th2) {
                    io.reactivex.rxjava3.exceptions.a.a(th2);
                    l12.onError(th2);
                }
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            b<T> bVar = this.f403337c;
            bVar.getClass();
            DisposableHelper.a(bVar);
            b<T> bVar2 = this.f403338d;
            bVar2.getClass();
            DisposableHelper.a(bVar2);
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return DisposableHelper.b(this.f403337c.get());
        }
    }

    /* compiled from: MaybeEqualSingle.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.maybe.x$b */
    public static final class b<T> extends AtomicReference<io.reactivex.rxjava3.disposables.d> implements io.reactivex.rxjava3.core.t<T> {
        private static final long serialVersionUID = -3031974433025990931L;

        /* renamed from: b, reason: collision with root package name */
        public final a<T> f403339b;

        /* renamed from: c, reason: collision with root package name */
        public Object f403340c;

        public b(a<T> aVar) {
            this.f403339b = aVar;
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            DisposableHelper.e(this, dVar);
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void e() {
            this.f403339b.a();
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void onError(Throwable th2) {
            a<T> aVar = this.f403339b;
            if (aVar.getAndSet(0) <= 0) {
                C47998a.b(th2);
                return;
            }
            b<T> bVar = aVar.f403337c;
            if (this == bVar) {
                b<T> bVar2 = aVar.f403338d;
                bVar2.getClass();
                DisposableHelper.a(bVar2);
            } else {
                bVar.getClass();
                DisposableHelper.a(bVar);
            }
            aVar.f403336b.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void onSuccess(T t12) {
            this.f403340c = t12;
            this.f403339b.a();
        }
    }

    @Override // io.reactivex.rxjava3.core.I
    public final void y(io.reactivex.rxjava3.core.L<? super Boolean> l12) {
        l12.b(new a(l12));
        throw null;
    }
}
