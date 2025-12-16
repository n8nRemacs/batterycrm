package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.AbstractC41777j;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import s41.C47998a;

/* compiled from: ObservableGroupJoin.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.observable.p0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41978p0<TLeft, TRight, TLeftEnd, TRightEnd, R> extends AbstractC41932a<TLeft, R> {

    /* compiled from: ObservableGroupJoin.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.observable.p0$a */
    public static final class a<TLeft, TRight, TLeftEnd, TRightEnd, R> extends AtomicInteger implements io.reactivex.rxjava3.disposables.d, b {
        private static final long serialVersionUID = -6071216598687999801L;

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.G<? super R> f404221b;

        /* renamed from: i, reason: collision with root package name */
        public int f404228i;

        /* renamed from: j, reason: collision with root package name */
        public int f404229j;

        /* renamed from: k, reason: collision with root package name */
        public volatile boolean f404230k;

        /* renamed from: d, reason: collision with root package name */
        public final io.reactivex.rxjava3.disposables.c f404223d = new io.reactivex.rxjava3.disposables.c();

        /* renamed from: c, reason: collision with root package name */
        public final q41.i<Object> f404222c = new q41.i<>(AbstractC41777j.f401972b);

        /* renamed from: e, reason: collision with root package name */
        public final LinkedHashMap f404224e = new LinkedHashMap();

        /* renamed from: f, reason: collision with root package name */
        public final LinkedHashMap f404225f = new LinkedHashMap();

        /* renamed from: g, reason: collision with root package name */
        public final AtomicReference<Throwable> f404226g = new AtomicReference<>();

        /* renamed from: h, reason: collision with root package name */
        public final AtomicInteger f404227h = new AtomicInteger(2);

        public a(io.reactivex.rxjava3.core.G g12) {
            this.f404221b = g12;
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.C41978p0.b
        public final void a(Throwable th2) {
            if (!io.reactivex.rxjava3.internal.util.h.a(this.f404226g, th2)) {
                C47998a.b(th2);
            } else {
                this.f404227h.decrementAndGet();
                f();
            }
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.C41978p0.b
        public final void b(Throwable th2) {
            if (io.reactivex.rxjava3.internal.util.h.a(this.f404226g, th2)) {
                f();
            } else {
                C47998a.b(th2);
            }
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.C41978p0.b
        public final void c(Object obj, boolean z12) {
            synchronized (this) {
                this.f404222c.a(z12 ? 1 : 2, obj);
            }
            f();
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.C41978p0.b
        public final void d(d dVar) {
            this.f404223d.c(dVar);
            this.f404227h.decrementAndGet();
            f();
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            if (this.f404230k) {
                return;
            }
            this.f404230k = true;
            this.f404223d.dispose();
            if (getAndIncrement() == 0) {
                this.f404222c.clear();
            }
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.C41978p0.b
        public final void e(boolean z12, c cVar) {
            synchronized (this) {
                this.f404222c.a(z12 ? 3 : 4, cVar);
            }
            f();
        }

        public final void f() {
            if (getAndIncrement() != 0) {
                return;
            }
            q41.i<?> iVar = this.f404222c;
            io.reactivex.rxjava3.core.G<? super R> g12 = this.f404221b;
            int iAddAndGet = 1;
            while (!this.f404230k) {
                if (this.f404226g.get() != null) {
                    iVar.clear();
                    this.f404223d.dispose();
                    g(g12);
                    return;
                }
                boolean z12 = this.f404227h.get() == 0;
                Integer num = (Integer) iVar.poll();
                boolean z13 = num == null;
                if (z12 && z13) {
                    Iterator it = this.f404224e.values().iterator();
                    while (it.hasNext()) {
                        ((io.reactivex.rxjava3.subjects.j) it.next()).e();
                    }
                    this.f404224e.clear();
                    this.f404225f.clear();
                    this.f404223d.dispose();
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
                        io.reactivex.rxjava3.subjects.j jVar = new io.reactivex.rxjava3.subjects.j(AbstractC41777j.f401972b, null);
                        int i12 = this.f404228i;
                        this.f404228i = i12 + 1;
                        this.f404224e.put(Integer.valueOf(i12), jVar);
                        try {
                            throw null;
                        } catch (Throwable th2) {
                            h(th2, g12, iVar);
                            return;
                        }
                    }
                    if (num == 2) {
                        int i13 = this.f404229j;
                        this.f404229j = i13 + 1;
                        this.f404225f.put(Integer.valueOf(i13), objPoll);
                        try {
                            throw null;
                        } catch (Throwable th3) {
                            h(th3, g12, iVar);
                            return;
                        }
                    }
                    if (num == 3) {
                        c cVar = (c) objPoll;
                        LinkedHashMap linkedHashMap = this.f404224e;
                        cVar.getClass();
                        io.reactivex.rxjava3.subjects.j jVar2 = (io.reactivex.rxjava3.subjects.j) linkedHashMap.remove(0);
                        this.f404223d.a(cVar);
                        if (jVar2 != null) {
                            jVar2.e();
                        }
                    } else {
                        c cVar2 = (c) objPoll;
                        LinkedHashMap linkedHashMap2 = this.f404225f;
                        cVar2.getClass();
                        linkedHashMap2.remove(0);
                        this.f404223d.a(cVar2);
                    }
                }
            }
            iVar.clear();
        }

        public final void g(io.reactivex.rxjava3.core.G<?> g12) {
            Throwable thD = io.reactivex.rxjava3.internal.util.h.d(this.f404226g);
            LinkedHashMap linkedHashMap = this.f404224e;
            Iterator it = linkedHashMap.values().iterator();
            while (it.hasNext()) {
                ((io.reactivex.rxjava3.subjects.j) it.next()).onError(thD);
            }
            linkedHashMap.clear();
            this.f404225f.clear();
            g12.onError(thD);
        }

        public final void h(Throwable th2, io.reactivex.rxjava3.core.G<?> g12, q41.i<?> iVar) {
            io.reactivex.rxjava3.exceptions.a.a(th2);
            io.reactivex.rxjava3.internal.util.h.a(this.f404226g, th2);
            iVar.clear();
            this.f404223d.dispose();
            g(g12);
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return this.f404230k;
        }
    }

    /* compiled from: ObservableGroupJoin.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.observable.p0$b */
    public interface b {
        void a(Throwable th2);

        void b(Throwable th2);

        void c(Object obj, boolean z12);

        void d(d dVar);

        void e(boolean z12, c cVar);
    }

    /* compiled from: ObservableGroupJoin.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.observable.p0$c */
    public static final class c extends AtomicReference<io.reactivex.rxjava3.disposables.d> implements io.reactivex.rxjava3.core.G<Object>, io.reactivex.rxjava3.disposables.d {
        private static final long serialVersionUID = 1883890389173668373L;

        @Override // io.reactivex.rxjava3.core.G
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            DisposableHelper.e(this, dVar);
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            DisposableHelper.a(this);
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void e() {
            throw null;
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return DisposableHelper.b(get());
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onError(Throwable th2) {
            throw null;
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onNext(Object obj) {
            if (DisposableHelper.a(this)) {
                throw null;
            }
        }
    }

    /* compiled from: ObservableGroupJoin.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.observable.p0$d */
    public static final class d extends AtomicReference<io.reactivex.rxjava3.disposables.d> implements io.reactivex.rxjava3.core.G<Object>, io.reactivex.rxjava3.disposables.d {
        private static final long serialVersionUID = 1883890389173668373L;

        /* renamed from: b, reason: collision with root package name */
        public final AtomicInteger f404231b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f404232c;

        /* JADX WARN: Multi-variable type inference failed */
        public d(b bVar, boolean z12) {
            this.f404231b = (AtomicInteger) bVar;
            this.f404232c = z12;
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            DisposableHelper.e(this, dVar);
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            DisposableHelper.a(this);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [io.reactivex.rxjava3.internal.operators.observable.p0$b, java.util.concurrent.atomic.AtomicInteger] */
        @Override // io.reactivex.rxjava3.core.G
        public final void e() {
            this.f404231b.d(this);
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return DisposableHelper.b(get());
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [io.reactivex.rxjava3.internal.operators.observable.p0$b, java.util.concurrent.atomic.AtomicInteger] */
        @Override // io.reactivex.rxjava3.core.G
        public final void onError(Throwable th2) {
            this.f404231b.a(th2);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [io.reactivex.rxjava3.internal.operators.observable.p0$b, java.util.concurrent.atomic.AtomicInteger] */
        @Override // io.reactivex.rxjava3.core.G
        public final void onNext(Object obj) {
            this.f404231b.c(obj, this.f404232c);
        }
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(io.reactivex.rxjava3.core.G<? super R> g12) {
        a aVar = new a(g12);
        g12.b(aVar);
        d dVar = new d(aVar, true);
        io.reactivex.rxjava3.disposables.c cVar = aVar.f404223d;
        cVar.b(dVar);
        cVar.b(new d(aVar, false));
        this.f403951b.c(dVar);
        throw null;
    }
}
