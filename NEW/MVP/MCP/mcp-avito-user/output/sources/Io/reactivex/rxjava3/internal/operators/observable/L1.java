package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import s41.C47998a;

/* compiled from: ObservableWindowBoundary.java */
/* loaded from: classes8.dex */
public final class L1<T, B> extends AbstractC41932a<T, io.reactivex.rxjava3.core.z<T>> {

    /* compiled from: ObservableWindowBoundary.java */
    public static final class a<T, B> extends io.reactivex.rxjava3.observers.e<B> {

        /* renamed from: c, reason: collision with root package name */
        public final b<T, B> f403705c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f403706d;

        public a(b<T, B> bVar) {
            this.f403705c = bVar;
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void e() {
            if (this.f403706d) {
                return;
            }
            this.f403706d = true;
            b<T, B> bVar = this.f403705c;
            DisposableHelper.a(bVar.f403710d);
            bVar.f403715i = true;
            bVar.a();
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onError(Throwable th2) {
            if (this.f403706d) {
                C47998a.b(th2);
                return;
            }
            this.f403706d = true;
            b<T, B> bVar = this.f403705c;
            DisposableHelper.a(bVar.f403710d);
            if (bVar.f403713g.b(th2)) {
                bVar.f403715i = true;
                bVar.a();
            }
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onNext(B b12) {
            if (this.f403706d) {
                return;
            }
            Object obj = b.f403707k;
            b<T, B> bVar = this.f403705c;
            bVar.f403712f.offer(obj);
            bVar.a();
        }
    }

    /* compiled from: ObservableWindowBoundary.java */
    public static final class b<T, B> extends AtomicInteger implements io.reactivex.rxjava3.core.G<T>, io.reactivex.rxjava3.disposables.d, Runnable {

        /* renamed from: k, reason: collision with root package name */
        public static final Object f403707k = new Object();
        private static final long serialVersionUID = 2233020065421370272L;

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.G<? super io.reactivex.rxjava3.core.z<T>> f403708b;

        /* renamed from: c, reason: collision with root package name */
        public final a<T, B> f403709c = new a<>(this);

        /* renamed from: d, reason: collision with root package name */
        public final AtomicReference<io.reactivex.rxjava3.disposables.d> f403710d = new AtomicReference<>();

        /* renamed from: e, reason: collision with root package name */
        public final AtomicInteger f403711e = new AtomicInteger(1);

        /* renamed from: f, reason: collision with root package name */
        public final io.reactivex.rxjava3.internal.queue.a<Object> f403712f = new io.reactivex.rxjava3.internal.queue.a<>();

        /* renamed from: g, reason: collision with root package name */
        public final io.reactivex.rxjava3.internal.util.b f403713g = new io.reactivex.rxjava3.internal.util.b();

        /* renamed from: h, reason: collision with root package name */
        public final AtomicBoolean f403714h = new AtomicBoolean();

        /* renamed from: i, reason: collision with root package name */
        public volatile boolean f403715i;

        /* renamed from: j, reason: collision with root package name */
        public io.reactivex.rxjava3.subjects.j<T> f403716j;

        public b(io.reactivex.rxjava3.core.G g12) {
            this.f403708b = g12;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void a() {
            if (getAndIncrement() != 0) {
                return;
            }
            io.reactivex.rxjava3.core.G<? super io.reactivex.rxjava3.core.z<T>> g12 = this.f403708b;
            io.reactivex.rxjava3.internal.queue.a<Object> aVar = this.f403712f;
            io.reactivex.rxjava3.internal.util.b bVar = this.f403713g;
            int iAddAndGet = 1;
            while (this.f403711e.get() != 0) {
                io.reactivex.rxjava3.subjects.j<T> jVar = this.f403716j;
                boolean z12 = this.f403715i;
                if (z12 && bVar.get() != null) {
                    aVar.clear();
                    Throwable thD = io.reactivex.rxjava3.internal.util.h.d(bVar);
                    if (jVar != 0) {
                        this.f403716j = null;
                        jVar.onError(thD);
                    }
                    g12.onError(thD);
                    return;
                }
                Object objPoll = aVar.poll();
                boolean z13 = objPoll == null;
                if (z12 && z13) {
                    bVar.getClass();
                    Throwable thD2 = io.reactivex.rxjava3.internal.util.h.d(bVar);
                    if (thD2 == null) {
                        if (jVar != 0) {
                            this.f403716j = null;
                            jVar.e();
                        }
                        g12.e();
                        return;
                    }
                    if (jVar != 0) {
                        this.f403716j = null;
                        jVar.onError(thD2);
                    }
                    g12.onError(thD2);
                    return;
                }
                if (z13) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else if (objPoll != f403707k) {
                    jVar.onNext(objPoll);
                } else {
                    if (jVar != 0) {
                        this.f403716j = null;
                        jVar.e();
                    }
                    if (!this.f403714h.get()) {
                        io.reactivex.rxjava3.subjects.j<T> jVarN0 = io.reactivex.rxjava3.subjects.j.N0(this);
                        this.f403716j = jVarN0;
                        this.f403711e.getAndIncrement();
                        N1 n12 = new N1(jVarN0);
                        g12.onNext(n12);
                        if (n12.M0()) {
                            jVarN0.e();
                        }
                    }
                }
            }
            aVar.clear();
            this.f403716j = null;
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            if (DisposableHelper.e(this.f403710d, dVar)) {
                this.f403712f.offer(f403707k);
                a();
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            if (this.f403714h.compareAndSet(false, true)) {
                this.f403709c.dispose();
                if (this.f403711e.decrementAndGet() == 0) {
                    DisposableHelper.a(this.f403710d);
                }
            }
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void e() {
            this.f403709c.dispose();
            this.f403715i = true;
            a();
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return this.f403714h.get();
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onError(Throwable th2) {
            this.f403709c.dispose();
            if (this.f403713g.b(th2)) {
                this.f403715i = true;
                a();
            }
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onNext(T t12) {
            this.f403712f.offer(t12);
            a();
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f403711e.decrementAndGet() == 0) {
                DisposableHelper.a(this.f403710d);
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(io.reactivex.rxjava3.core.G<? super io.reactivex.rxjava3.core.z<T>> g12) {
        g12.b(new b(g12));
        throw null;
    }
}
