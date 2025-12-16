package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.AbstractC41777j;
import io.reactivex.rxjava3.internal.operators.observable.C41978p0;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import s41.C47998a;

/* compiled from: ObservableJoin.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.observable.w0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41996w0<TLeft, TRight, TLeftEnd, TRightEnd, R> extends AbstractC41932a<TLeft, R> {

    /* compiled from: ObservableJoin.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.observable.w0$a */
    public static final class a<TLeft, TRight, TLeftEnd, TRightEnd, R> extends AtomicInteger implements io.reactivex.rxjava3.disposables.d, C41978p0.b {
        private static final long serialVersionUID = -6071216598687999801L;

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.G<? super R> f404383b;

        /* renamed from: i, reason: collision with root package name */
        public int f404390i;

        /* renamed from: j, reason: collision with root package name */
        public int f404391j;

        /* renamed from: k, reason: collision with root package name */
        public volatile boolean f404392k;

        /* renamed from: d, reason: collision with root package name */
        public final io.reactivex.rxjava3.disposables.c f404385d = new io.reactivex.rxjava3.disposables.c();

        /* renamed from: c, reason: collision with root package name */
        public final q41.i<Object> f404384c = new q41.i<>(AbstractC41777j.f401972b);

        /* renamed from: e, reason: collision with root package name */
        public final LinkedHashMap f404386e = new LinkedHashMap();

        /* renamed from: f, reason: collision with root package name */
        public final LinkedHashMap f404387f = new LinkedHashMap();

        /* renamed from: g, reason: collision with root package name */
        public final AtomicReference<Throwable> f404388g = new AtomicReference<>();

        /* renamed from: h, reason: collision with root package name */
        public final AtomicInteger f404389h = new AtomicInteger(2);

        public a(io.reactivex.rxjava3.core.G g12) {
            this.f404383b = g12;
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.C41978p0.b
        public final void a(Throwable th2) {
            if (!io.reactivex.rxjava3.internal.util.h.a(this.f404388g, th2)) {
                C47998a.b(th2);
            } else {
                this.f404389h.decrementAndGet();
                f();
            }
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.C41978p0.b
        public final void b(Throwable th2) {
            if (io.reactivex.rxjava3.internal.util.h.a(this.f404388g, th2)) {
                f();
            } else {
                C47998a.b(th2);
            }
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.C41978p0.b
        public final void c(Object obj, boolean z12) {
            synchronized (this) {
                this.f404384c.a(z12 ? 1 : 2, obj);
            }
            f();
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.C41978p0.b
        public final void d(C41978p0.d dVar) {
            this.f404385d.c(dVar);
            this.f404389h.decrementAndGet();
            f();
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            if (this.f404392k) {
                return;
            }
            this.f404392k = true;
            this.f404385d.dispose();
            if (getAndIncrement() == 0) {
                this.f404384c.clear();
            }
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.C41978p0.b
        public final void e(boolean z12, C41978p0.c cVar) {
            synchronized (this) {
                this.f404384c.a(z12 ? 3 : 4, cVar);
            }
            f();
        }

        public final void f() {
            if (getAndIncrement() != 0) {
                return;
            }
            q41.i<?> iVar = this.f404384c;
            io.reactivex.rxjava3.core.G<? super R> g12 = this.f404383b;
            int iAddAndGet = 1;
            while (!this.f404392k) {
                if (this.f404388g.get() != null) {
                    iVar.clear();
                    this.f404385d.dispose();
                    g(g12);
                    return;
                }
                boolean z12 = this.f404389h.get() == 0;
                Integer num = (Integer) iVar.poll();
                boolean z13 = num == null;
                if (z12 && z13) {
                    this.f404386e.clear();
                    this.f404387f.clear();
                    this.f404385d.dispose();
                    g12.e();
                    return;
                }
                if (z13) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    Object objPoll = iVar.poll();
                    if (num == 1) {
                        int i12 = this.f404390i;
                        this.f404390i = i12 + 1;
                        this.f404386e.put(Integer.valueOf(i12), objPoll);
                        try {
                            throw null;
                        } catch (Throwable th2) {
                            h(th2, g12, iVar);
                            return;
                        }
                    }
                    if (num == 2) {
                        int i13 = this.f404391j;
                        this.f404391j = i13 + 1;
                        this.f404387f.put(Integer.valueOf(i13), objPoll);
                        try {
                            throw null;
                        } catch (Throwable th3) {
                            h(th3, g12, iVar);
                            return;
                        }
                    }
                    if (num == 3) {
                        C41978p0.c cVar = (C41978p0.c) objPoll;
                        LinkedHashMap linkedHashMap = this.f404386e;
                        cVar.getClass();
                        linkedHashMap.remove(0);
                        this.f404385d.a(cVar);
                    } else {
                        C41978p0.c cVar2 = (C41978p0.c) objPoll;
                        LinkedHashMap linkedHashMap2 = this.f404387f;
                        cVar2.getClass();
                        linkedHashMap2.remove(0);
                        this.f404385d.a(cVar2);
                    }
                }
            }
            iVar.clear();
        }

        public final void g(io.reactivex.rxjava3.core.G<?> g12) {
            Throwable thD = io.reactivex.rxjava3.internal.util.h.d(this.f404388g);
            this.f404386e.clear();
            this.f404387f.clear();
            g12.onError(thD);
        }

        public final void h(Throwable th2, io.reactivex.rxjava3.core.G<?> g12, q41.i<?> iVar) {
            io.reactivex.rxjava3.exceptions.a.a(th2);
            io.reactivex.rxjava3.internal.util.h.a(this.f404388g, th2);
            iVar.clear();
            this.f404385d.dispose();
            g(g12);
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return this.f404392k;
        }
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(io.reactivex.rxjava3.core.G<? super R> g12) {
        a aVar = new a(g12);
        g12.b(aVar);
        C41978p0.d dVar = new C41978p0.d(aVar, true);
        io.reactivex.rxjava3.disposables.c cVar = aVar.f404385d;
        cVar.b(dVar);
        cVar.b(new C41978p0.d(aVar, false));
        this.f403951b.c(dVar);
        throw null;
    }
}
