package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import s41.C47998a;

/* compiled from: ObservableWindowBoundarySelector.java */
/* loaded from: classes8.dex */
public final class M1<T, B, V> extends AbstractC41932a<T, io.reactivex.rxjava3.core.z<T>> {

    /* compiled from: ObservableWindowBoundarySelector.java */
    public static final class a<T, B, V> extends AtomicInteger implements io.reactivex.rxjava3.core.G<T>, io.reactivex.rxjava3.disposables.d, Runnable {
        private static final long serialVersionUID = 8646217640096099753L;

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.G<? super io.reactivex.rxjava3.core.z<T>> f403728b;

        /* renamed from: i, reason: collision with root package name */
        public volatile boolean f403735i;

        /* renamed from: j, reason: collision with root package name */
        public volatile boolean f403736j;

        /* renamed from: k, reason: collision with root package name */
        public volatile boolean f403737k;

        /* renamed from: m, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f403739m;

        /* renamed from: f, reason: collision with root package name */
        public final io.reactivex.rxjava3.internal.queue.a f403732f = new io.reactivex.rxjava3.internal.queue.a();

        /* renamed from: c, reason: collision with root package name */
        public final io.reactivex.rxjava3.disposables.c f403729c = new io.reactivex.rxjava3.disposables.c();

        /* renamed from: e, reason: collision with root package name */
        public final ArrayList f403731e = new ArrayList();

        /* renamed from: g, reason: collision with root package name */
        public final AtomicLong f403733g = new AtomicLong(1);

        /* renamed from: h, reason: collision with root package name */
        public final AtomicBoolean f403734h = new AtomicBoolean();

        /* renamed from: l, reason: collision with root package name */
        public final io.reactivex.rxjava3.internal.util.b f403738l = new io.reactivex.rxjava3.internal.util.b();

        /* renamed from: d, reason: collision with root package name */
        public final c<B> f403730d = new c<>(this);

        /* compiled from: ObservableWindowBoundarySelector.java */
        /* renamed from: io.reactivex.rxjava3.internal.operators.observable.M1$a$a, reason: collision with other inner class name */
        public static final class C11494a<T, V> extends io.reactivex.rxjava3.core.z<T> implements io.reactivex.rxjava3.core.G<V>, io.reactivex.rxjava3.disposables.d {
            @Override // io.reactivex.rxjava3.core.G
            public final void b(io.reactivex.rxjava3.disposables.d dVar) {
                DisposableHelper.e(null, dVar);
            }

            @Override // io.reactivex.rxjava3.disposables.d
            public final void dispose() {
                DisposableHelper.a(null);
            }

            @Override // io.reactivex.rxjava3.core.G
            public final void e() {
                throw null;
            }

            @Override // io.reactivex.rxjava3.disposables.d
            /* renamed from: i */
            public final boolean getF318621e() {
                throw null;
            }

            @Override // io.reactivex.rxjava3.core.G
            public final void onError(Throwable th2) {
                if (!getF318621e()) {
                    throw null;
                }
                C47998a.b(th2);
            }

            @Override // io.reactivex.rxjava3.core.G
            public final void onNext(V v12) {
                if (DisposableHelper.a(null)) {
                    throw null;
                }
            }

            @Override // io.reactivex.rxjava3.core.z
            public final void w0(io.reactivex.rxjava3.core.G<? super T> g12) {
                throw null;
            }
        }

        /* compiled from: ObservableWindowBoundarySelector.java */
        public static final class b<B> {

            /* renamed from: a, reason: collision with root package name */
            public final B f403740a;

            public b(B b12) {
                this.f403740a = b12;
            }
        }

        /* compiled from: ObservableWindowBoundarySelector.java */
        public static final class c<B> extends AtomicReference<io.reactivex.rxjava3.disposables.d> implements io.reactivex.rxjava3.core.G<B> {
            private static final long serialVersionUID = -3326496781427702834L;

            /* renamed from: b, reason: collision with root package name */
            public final a<?, B, ?> f403741b;

            public c(a<?, B, ?> aVar) {
                this.f403741b = aVar;
            }

            @Override // io.reactivex.rxjava3.core.G
            public final void b(io.reactivex.rxjava3.disposables.d dVar) {
                DisposableHelper.e(this, dVar);
            }

            @Override // io.reactivex.rxjava3.core.G
            public final void e() {
                a<?, B, ?> aVar = this.f403741b;
                aVar.f403737k = true;
                aVar.a();
            }

            @Override // io.reactivex.rxjava3.core.G
            public final void onError(Throwable th2) {
                a<?, B, ?> aVar = this.f403741b;
                aVar.f403739m.dispose();
                aVar.f403729c.dispose();
                if (aVar.f403738l.b(th2)) {
                    aVar.f403736j = true;
                    aVar.a();
                }
            }

            @Override // io.reactivex.rxjava3.core.G
            public final void onNext(B b12) {
                a<?, B, ?> aVar = this.f403741b;
                aVar.f403732f.offer(new b(b12));
                aVar.a();
            }
        }

        public a(io.reactivex.rxjava3.core.G g12) {
            this.f403728b = g12;
            new AtomicLong();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void a() {
            if (getAndIncrement() != 0) {
                return;
            }
            io.reactivex.rxjava3.core.G<? super io.reactivex.rxjava3.core.z<T>> g12 = this.f403728b;
            io.reactivex.rxjava3.internal.queue.a aVar = this.f403732f;
            ArrayList arrayList = this.f403731e;
            int iAddAndGet = 1;
            while (true) {
                if (this.f403735i) {
                    aVar.clear();
                    arrayList.clear();
                } else {
                    boolean z12 = this.f403736j;
                    Object objPoll = aVar.poll();
                    boolean z13 = objPoll == null;
                    if (z12 && (z13 || this.f403738l.get() != null)) {
                        c(g12);
                        this.f403735i = true;
                    } else if (z13) {
                        if (this.f403737k && arrayList.size() == 0) {
                            this.f403739m.dispose();
                            c<B> cVar = this.f403730d;
                            cVar.getClass();
                            DisposableHelper.a(cVar);
                            this.f403729c.dispose();
                            c(g12);
                            this.f403735i = true;
                        }
                    } else if (objPoll instanceof b) {
                        if (this.f403734h.get()) {
                            continue;
                        } else {
                            B b12 = ((b) objPoll).f403740a;
                            try {
                                throw null;
                            } catch (Throwable th2) {
                                io.reactivex.rxjava3.exceptions.a.a(th2);
                                this.f403739m.dispose();
                                c<B> cVar2 = this.f403730d;
                                cVar2.getClass();
                                DisposableHelper.a(cVar2);
                                this.f403729c.dispose();
                                io.reactivex.rxjava3.exceptions.a.a(th2);
                                this.f403738l.b(th2);
                                this.f403736j = true;
                            }
                        }
                    } else {
                        if (objPoll instanceof C11494a) {
                            ((C11494a) objPoll).getClass();
                            arrayList.remove((Object) null);
                            this.f403729c.c((io.reactivex.rxjava3.disposables.d) objPoll);
                            throw null;
                        }
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ((io.reactivex.rxjava3.subjects.j) it.next()).onNext(objPoll);
                        }
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            if (DisposableHelper.f(this.f403739m, dVar)) {
                this.f403739m = dVar;
                this.f403728b.b(this);
                throw null;
            }
        }

        public final void c(io.reactivex.rxjava3.core.G<?> g12) {
            io.reactivex.rxjava3.internal.util.b bVar = this.f403738l;
            bVar.getClass();
            Throwable thD = io.reactivex.rxjava3.internal.util.h.d(bVar);
            ArrayList arrayList = this.f403731e;
            if (thD == null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((io.reactivex.rxjava3.subjects.j) it.next()).e();
                }
                g12.e();
                return;
            }
            if (thD != io.reactivex.rxjava3.internal.util.h.f404834a) {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ((io.reactivex.rxjava3.subjects.j) it2.next()).onError(thD);
                }
                g12.onError(thD);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            if (this.f403734h.compareAndSet(false, true)) {
                if (this.f403733g.decrementAndGet() != 0) {
                    c<B> cVar = this.f403730d;
                    cVar.getClass();
                    DisposableHelper.a(cVar);
                    return;
                }
                this.f403739m.dispose();
                c<B> cVar2 = this.f403730d;
                cVar2.getClass();
                DisposableHelper.a(cVar2);
                this.f403729c.dispose();
                this.f403738l.c();
                this.f403735i = true;
                a();
            }
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void e() {
            c<B> cVar = this.f403730d;
            cVar.getClass();
            DisposableHelper.a(cVar);
            this.f403729c.dispose();
            this.f403736j = true;
            a();
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return this.f403734h.get();
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onError(Throwable th2) {
            c<B> cVar = this.f403730d;
            cVar.getClass();
            DisposableHelper.a(cVar);
            this.f403729c.dispose();
            if (this.f403738l.b(th2)) {
                this.f403736j = true;
                a();
            }
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onNext(T t12) {
            this.f403732f.offer(t12);
            a();
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f403733g.decrementAndGet() == 0) {
                this.f403739m.dispose();
                c<B> cVar = this.f403730d;
                cVar.getClass();
                DisposableHelper.a(cVar);
                this.f403729c.dispose();
                this.f403738l.c();
                this.f403735i = true;
                a();
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(io.reactivex.rxjava3.core.G<? super io.reactivex.rxjava3.core.z<T>> g12) {
        this.f403951b.c(new a(g12));
    }
}
