package io.reactivex.rxjava3.internal.jdk8;

import io.reactivex.rxjava3.core.AbstractC41777j;
import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.core.L;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Stream;
import o41.AbstractC44583c;
import s41.C47998a;

/* compiled from: MaybeFlattenStreamAsFlowable.java */
/* loaded from: classes8.dex */
public final class m<T, R> extends AbstractC41777j<R> {

    /* compiled from: MaybeFlattenStreamAsFlowable.java */
    public static final class a<T, R> extends AbstractC44583c<R> implements io.reactivex.rxjava3.core.t<T>, L<T> {
        private static final long serialVersionUID = 7363336003027148283L;

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC41782o f402056b;

        /* renamed from: c, reason: collision with root package name */
        public final AtomicLong f402057c = new AtomicLong();

        /* renamed from: d, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f402058d;

        /* renamed from: e, reason: collision with root package name */
        public volatile Iterator<? extends R> f402059e;

        /* renamed from: f, reason: collision with root package name */
        public Stream f402060f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f402061g;

        /* renamed from: h, reason: collision with root package name */
        public volatile boolean f402062h;

        /* renamed from: i, reason: collision with root package name */
        public boolean f402063i;

        /* renamed from: j, reason: collision with root package name */
        public long f402064j;

        public a(InterfaceC41782o interfaceC41782o) {
            this.f402056b = interfaceC41782o;
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void b(@j41.e io.reactivex.rxjava3.disposables.d dVar) {
            if (DisposableHelper.f(this.f402058d, dVar)) {
                this.f402058d = dVar;
                this.f402056b.K(this);
            }
        }

        public final void c() {
            if (getAndIncrement() != 0) {
                return;
            }
            InterfaceC41782o interfaceC41782o = this.f402056b;
            long j12 = this.f402064j;
            long j13 = this.f402057c.get();
            Iterator<? extends R> it = this.f402059e;
            int iAddAndGet = 1;
            while (true) {
                if (this.f402062h) {
                    clear();
                } else if (this.f402063i) {
                    if (it != null) {
                        interfaceC41782o.onNext(null);
                        interfaceC41782o.e();
                    }
                } else if (it != null && j12 != j13) {
                    try {
                        R next = it.next();
                        if (!this.f402062h) {
                            interfaceC41782o.onNext(next);
                            j12++;
                            if (!this.f402062h) {
                                try {
                                    boolean zHasNext = it.hasNext();
                                    if (!this.f402062h && !zHasNext) {
                                        interfaceC41782o.e();
                                        this.f402062h = true;
                                    }
                                } catch (Throwable th2) {
                                    io.reactivex.rxjava3.exceptions.a.a(th2);
                                    interfaceC41782o.onError(th2);
                                    this.f402062h = true;
                                }
                            }
                        }
                    } catch (Throwable th3) {
                        io.reactivex.rxjava3.exceptions.a.a(th3);
                        interfaceC41782o.onError(th3);
                        this.f402062h = true;
                    }
                }
                this.f402064j = j12;
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
                j13 = this.f402057c.get();
                if (it == null) {
                    it = this.f402059e;
                }
            }
        }

        @Override // org.reactivestreams.e
        public final void cancel() {
            this.f402062h = true;
            this.f402058d.dispose();
            if (this.f402063i) {
                return;
            }
            c();
        }

        @Override // q41.g
        public final void clear() {
            this.f402059e = null;
            Stream stream = this.f402060f;
            this.f402060f = null;
            if (stream != null) {
                try {
                    stream.close();
                } catch (Throwable th2) {
                    io.reactivex.rxjava3.exceptions.a.a(th2);
                    C47998a.b(th2);
                }
            }
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void e() {
            this.f402056b.e();
        }

        @Override // q41.g
        public final boolean isEmpty() {
            Iterator<? extends R> it = this.f402059e;
            if (it == null) {
                return true;
            }
            if (!this.f402061g || it.hasNext()) {
                return false;
            }
            clear();
            return true;
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void onError(@j41.e Throwable th2) {
            this.f402056b.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void onSuccess(@j41.e T t12) {
            try {
                throw null;
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                this.f402056b.onError(th2);
            }
        }

        @Override // q41.g
        @j41.f
        public final R poll() {
            Iterator<? extends R> it = this.f402059e;
            if (it == null) {
                return null;
            }
            if (!this.f402061g) {
                this.f402061g = true;
            } else if (!it.hasNext()) {
                clear();
                return null;
            }
            return it.next();
        }

        @Override // org.reactivestreams.e
        public final void request(long j12) {
            if (SubscriptionHelper.h(j12)) {
                io.reactivex.rxjava3.internal.util.c.a(this.f402057c, j12);
                c();
            }
        }

        @Override // q41.InterfaceC47200c
        public final int v(int i12) {
            if ((i12 & 2) == 0) {
                return 0;
            }
            this.f402063i = true;
            return 2;
        }
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(@j41.e org.reactivestreams.d<? super R> dVar) {
        new a((InterfaceC41782o) dVar);
        throw null;
    }
}
