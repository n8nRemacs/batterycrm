package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.AbstractC41777j;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import s41.C47998a;

/* compiled from: ObservableBufferBoundary.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.observable.n, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41971n<T, U extends Collection<? super T>, Open, Close> extends AbstractC41932a<T, U> {

    /* compiled from: ObservableBufferBoundary.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.observable.n$a */
    public static final class a<T, C extends Collection<? super T>, Open, Close> extends AtomicInteger implements io.reactivex.rxjava3.core.G<T>, io.reactivex.rxjava3.disposables.d {
        private static final long serialVersionUID = -8466418554264089604L;

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.G<? super C> f404147b;

        /* renamed from: f, reason: collision with root package name */
        public volatile boolean f404151f;

        /* renamed from: h, reason: collision with root package name */
        public volatile boolean f404153h;

        /* renamed from: g, reason: collision with root package name */
        public final q41.i<C> f404152g = new q41.i<>(AbstractC41777j.f401972b);

        /* renamed from: c, reason: collision with root package name */
        public final io.reactivex.rxjava3.disposables.c f404148c = new io.reactivex.rxjava3.disposables.c();

        /* renamed from: d, reason: collision with root package name */
        public final AtomicReference<io.reactivex.rxjava3.disposables.d> f404149d = new AtomicReference<>();

        /* renamed from: i, reason: collision with root package name */
        public LinkedHashMap f404154i = new LinkedHashMap();

        /* renamed from: e, reason: collision with root package name */
        public final io.reactivex.rxjava3.internal.util.b f404150e = new io.reactivex.rxjava3.internal.util.b();

        /* compiled from: ObservableBufferBoundary.java */
        /* renamed from: io.reactivex.rxjava3.internal.operators.observable.n$a$a, reason: collision with other inner class name */
        public static final class C11502a<Open> extends AtomicReference<io.reactivex.rxjava3.disposables.d> implements io.reactivex.rxjava3.core.G<Open>, io.reactivex.rxjava3.disposables.d {
            private static final long serialVersionUID = -8498650778633225126L;

            /* renamed from: b, reason: collision with root package name */
            public final a<?, ?, Open, ?> f404155b;

            public C11502a(a<?, ?, Open, ?> aVar) {
                this.f404155b = aVar;
            }

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
                lazySet(DisposableHelper.f401986b);
                a<?, ?, Open, ?> aVar = this.f404155b;
                aVar.f404148c.c(this);
                if (aVar.f404148c.g() == 0) {
                    DisposableHelper.a(aVar.f404149d);
                    aVar.f404151f = true;
                    aVar.c();
                }
            }

            @Override // io.reactivex.rxjava3.disposables.d
            /* renamed from: i */
            public final boolean getF318621e() {
                return get() == DisposableHelper.f401986b;
            }

            @Override // io.reactivex.rxjava3.core.G
            public final void onError(Throwable th2) {
                lazySet(DisposableHelper.f401986b);
                a<?, ?, Open, ?> aVar = this.f404155b;
                DisposableHelper.a(aVar.f404149d);
                aVar.f404148c.c(this);
                aVar.onError(th2);
            }

            @Override // io.reactivex.rxjava3.core.G
            public final void onNext(Open open) {
                a<?, ?, Open, ?> aVar = this.f404155b;
                aVar.getClass();
                try {
                    throw null;
                } catch (Throwable th2) {
                    io.reactivex.rxjava3.exceptions.a.a(th2);
                    DisposableHelper.a(aVar.f404149d);
                    aVar.onError(th2);
                }
            }
        }

        public a(io.reactivex.rxjava3.core.G g12) {
            this.f404147b = g12;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void a(b<T, C> bVar, long j12) {
            boolean z12;
            this.f404148c.c(bVar);
            if (this.f404148c.g() == 0) {
                DisposableHelper.a(this.f404149d);
                z12 = true;
            } else {
                z12 = false;
            }
            synchronized (this) {
                try {
                    LinkedHashMap linkedHashMap = this.f404154i;
                    if (linkedHashMap == null) {
                        return;
                    }
                    this.f404152g.offer(linkedHashMap.remove(Long.valueOf(j12)));
                    if (z12) {
                        this.f404151f = true;
                    }
                    c();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            if (DisposableHelper.e(this.f404149d, dVar)) {
                this.f404148c.b(new C11502a(this));
                throw null;
            }
        }

        public final void c() {
            if (getAndIncrement() != 0) {
                return;
            }
            io.reactivex.rxjava3.core.G<? super C> g12 = this.f404147b;
            q41.i<C> iVar = this.f404152g;
            int iAddAndGet = 1;
            while (!this.f404153h) {
                boolean z12 = this.f404151f;
                if (z12 && this.f404150e.get() != null) {
                    iVar.clear();
                    this.f404150e.e(g12);
                    return;
                }
                C cPoll = iVar.poll();
                boolean z13 = cPoll == null;
                if (z12 && z13) {
                    g12.e();
                    return;
                } else if (z13) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    g12.onNext(cPoll);
                }
            }
            iVar.clear();
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            if (DisposableHelper.a(this.f404149d)) {
                this.f404153h = true;
                this.f404148c.dispose();
                synchronized (this) {
                    this.f404154i = null;
                }
                if (getAndIncrement() != 0) {
                    this.f404152g.clear();
                }
            }
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void e() {
            this.f404148c.dispose();
            synchronized (this) {
                try {
                    LinkedHashMap linkedHashMap = this.f404154i;
                    if (linkedHashMap == null) {
                        return;
                    }
                    Iterator it = linkedHashMap.values().iterator();
                    while (it.hasNext()) {
                        this.f404152g.offer((Collection) it.next());
                    }
                    this.f404154i = null;
                    this.f404151f = true;
                    c();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return DisposableHelper.b(this.f404149d.get());
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onError(Throwable th2) {
            if (this.f404150e.b(th2)) {
                this.f404148c.dispose();
                synchronized (this) {
                    this.f404154i = null;
                }
                this.f404151f = true;
                c();
            }
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onNext(T t12) {
            synchronized (this) {
                try {
                    LinkedHashMap linkedHashMap = this.f404154i;
                    if (linkedHashMap == null) {
                        return;
                    }
                    Iterator it = linkedHashMap.values().iterator();
                    while (it.hasNext()) {
                        ((Collection) it.next()).add(t12);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* compiled from: ObservableBufferBoundary.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.observable.n$b */
    public static final class b<T, C extends Collection<? super T>> extends AtomicReference<io.reactivex.rxjava3.disposables.d> implements io.reactivex.rxjava3.core.G<Object>, io.reactivex.rxjava3.disposables.d {
        private static final long serialVersionUID = -8498650778633225126L;

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
            io.reactivex.rxjava3.disposables.d dVar = get();
            DisposableHelper disposableHelper = DisposableHelper.f401986b;
            if (dVar == disposableHelper) {
                return;
            }
            lazySet(disposableHelper);
            throw null;
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return get() == DisposableHelper.f401986b;
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onError(Throwable th2) {
            io.reactivex.rxjava3.disposables.d dVar = get();
            DisposableHelper disposableHelper = DisposableHelper.f401986b;
            if (dVar == disposableHelper) {
                C47998a.b(th2);
            } else {
                lazySet(disposableHelper);
                throw null;
            }
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onNext(Object obj) {
            io.reactivex.rxjava3.disposables.d dVar = get();
            DisposableHelper disposableHelper = DisposableHelper.f401986b;
            if (dVar == disposableHelper) {
                return;
            }
            lazySet(disposableHelper);
            dVar.dispose();
            throw null;
        }
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(io.reactivex.rxjava3.core.G<? super U> g12) {
        a aVar = new a(g12);
        g12.b(aVar);
        this.f403951b.c(aVar);
    }
}
