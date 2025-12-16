package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.core.AbstractC41777j;
import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;
import o41.AbstractC44583c;

/* compiled from: SingleFlatMapIterableFlowable.java */
/* loaded from: classes8.dex */
public final class B<T, R> extends AbstractC41777j<R> {

    /* compiled from: SingleFlatMapIterableFlowable.java */
    public static final class a<T, R> extends AbstractC44583c<R> implements io.reactivex.rxjava3.core.L<T> {
        private static final long serialVersionUID = -8938804753851907758L;

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC41782o f404478b;

        /* renamed from: c, reason: collision with root package name */
        public final AtomicLong f404479c = new AtomicLong();

        /* renamed from: d, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f404480d;

        /* renamed from: e, reason: collision with root package name */
        public volatile Iterator<? extends R> f404481e;

        /* renamed from: f, reason: collision with root package name */
        public volatile boolean f404482f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f404483g;

        public a(InterfaceC41782o interfaceC41782o) {
            this.f404478b = interfaceC41782o;
        }

        @Override // io.reactivex.rxjava3.core.L
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            if (DisposableHelper.f(this.f404480d, dVar)) {
                this.f404480d = dVar;
                this.f404478b.K(this);
            }
        }

        @Override // org.reactivestreams.e
        public final void cancel() {
            this.f404482f = true;
            this.f404480d.dispose();
            this.f404480d = DisposableHelper.f401986b;
        }

        @Override // q41.g
        public final void clear() {
            this.f404481e = null;
        }

        @Override // q41.g
        public final boolean isEmpty() {
            return this.f404481e == null;
        }

        @Override // io.reactivex.rxjava3.core.L
        public final void onError(Throwable th2) {
            this.f404480d = DisposableHelper.f401986b;
            this.f404478b.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.L
        public final void onSuccess(T t12) {
            try {
                throw null;
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                this.f404478b.onError(th2);
            }
        }

        @Override // q41.g
        @j41.f
        public final R poll() {
            Iterator<? extends R> it = this.f404481e;
            if (it == null) {
                return null;
            }
            R next = it.next();
            Objects.requireNonNull(next, "The iterator returned a null value");
            if (!it.hasNext()) {
                this.f404481e = null;
            }
            return next;
        }

        @Override // org.reactivestreams.e
        public final void request(long j12) {
            if (!SubscriptionHelper.h(j12)) {
                return;
            }
            io.reactivex.rxjava3.internal.util.c.a(this.f404479c, j12);
            if (getAndIncrement() != 0) {
                return;
            }
            InterfaceC41782o interfaceC41782o = this.f404478b;
            Iterator<? extends R> it = this.f404481e;
            if (this.f404483g && it != null) {
                interfaceC41782o.onNext(null);
                interfaceC41782o.e();
                return;
            }
            int iAddAndGet = 1;
            while (true) {
                if (it != null) {
                    long j13 = this.f404479c.get();
                    if (j13 == Long.MAX_VALUE) {
                        while (!this.f404482f) {
                            try {
                                interfaceC41782o.onNext(it.next());
                                if (this.f404482f) {
                                    return;
                                }
                                try {
                                    if (!it.hasNext()) {
                                        interfaceC41782o.e();
                                        return;
                                    }
                                } catch (Throwable th2) {
                                    io.reactivex.rxjava3.exceptions.a.a(th2);
                                    interfaceC41782o.onError(th2);
                                    return;
                                }
                            } catch (Throwable th3) {
                                io.reactivex.rxjava3.exceptions.a.a(th3);
                                interfaceC41782o.onError(th3);
                                return;
                            }
                        }
                        return;
                    }
                    long j14 = 0;
                    while (j14 != j13) {
                        if (this.f404482f) {
                            return;
                        }
                        try {
                            R next = it.next();
                            Objects.requireNonNull(next, "The iterator returned a null value");
                            interfaceC41782o.onNext(next);
                            if (this.f404482f) {
                                return;
                            }
                            j14++;
                            try {
                                if (!it.hasNext()) {
                                    interfaceC41782o.e();
                                    return;
                                }
                            } catch (Throwable th4) {
                                io.reactivex.rxjava3.exceptions.a.a(th4);
                                interfaceC41782o.onError(th4);
                                return;
                            }
                        } catch (Throwable th5) {
                            io.reactivex.rxjava3.exceptions.a.a(th5);
                            interfaceC41782o.onError(th5);
                            return;
                        }
                    }
                    if (j14 != 0) {
                        io.reactivex.rxjava3.internal.util.c.e(this.f404479c, j14);
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
                if (it == null) {
                    it = this.f404481e;
                }
            }
        }

        @Override // q41.InterfaceC47200c
        public final int v(int i12) {
            if ((i12 & 2) == 0) {
                return 0;
            }
            this.f404483g = true;
            return 2;
        }
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super R> dVar) {
        new a((InterfaceC41782o) dVar);
        throw null;
    }
}
