package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p41.AbstractC46895b;

/* compiled from: ObservableGroupBy.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.observable.o0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41975o0<T, K, V> extends AbstractC41932a<T, AbstractC46895b<K, V>> {

    /* renamed from: c, reason: collision with root package name */
    public final l41.o<? super T, ? extends K> f404165c;

    /* renamed from: d, reason: collision with root package name */
    public final l41.o<? super T, ? extends V> f404166d;

    /* renamed from: e, reason: collision with root package name */
    public final int f404167e;

    /* compiled from: ObservableGroupBy.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.observable.o0$a */
    public static final class a<T, K, V> extends AtomicInteger implements io.reactivex.rxjava3.core.G<T>, io.reactivex.rxjava3.disposables.d {

        /* renamed from: i, reason: collision with root package name */
        public static final Object f404168i = new Object();
        private static final long serialVersionUID = -3688291656102519502L;

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.G<? super AbstractC46895b<K, V>> f404169b;

        /* renamed from: c, reason: collision with root package name */
        public final l41.o<? super T, ? extends K> f404170c;

        /* renamed from: d, reason: collision with root package name */
        public final l41.o<? super T, ? extends V> f404171d;

        /* renamed from: e, reason: collision with root package name */
        public final int f404172e;

        /* renamed from: g, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f404174g;

        /* renamed from: h, reason: collision with root package name */
        public final AtomicBoolean f404175h = new AtomicBoolean();

        /* renamed from: f, reason: collision with root package name */
        public final ConcurrentHashMap f404173f = new ConcurrentHashMap();

        public a(io.reactivex.rxjava3.core.G g12, l41.o oVar, l41.o oVar2, int i12) {
            this.f404169b = g12;
            this.f404170c = oVar;
            this.f404171d = oVar2;
            this.f404172e = i12;
            lazySet(1);
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            if (DisposableHelper.f(this.f404174g, dVar)) {
                this.f404174g = dVar;
                this.f404169b.b(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            if (this.f404175h.compareAndSet(false, true) && decrementAndGet() == 0) {
                this.f404174g.dispose();
            }
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void e() {
            ConcurrentHashMap concurrentHashMap = this.f404173f;
            ArrayList arrayList = new ArrayList(concurrentHashMap.values());
            concurrentHashMap.clear();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((b) it.next()).e();
            }
            this.f404169b.e();
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return this.f404175h.get();
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onError(Throwable th2) {
            ArrayList arrayList = new ArrayList(this.f404173f.values());
            this.f404173f.clear();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                c<T, K> cVar = ((b) it.next()).f404176c;
                cVar.f404181f = th2;
                cVar.f404180e = true;
                cVar.a();
            }
            this.f404169b.onError(th2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.rxjava3.core.G
        public final void onNext(T t12) {
            boolean z12;
            io.reactivex.rxjava3.core.G<? super AbstractC46895b<K, V>> g12 = this.f404169b;
            try {
                K kApply = this.f404170c.apply(t12);
                Object obj = f404168i;
                K k12 = kApply != null ? kApply : obj;
                ConcurrentHashMap concurrentHashMap = this.f404173f;
                b bVar = (b) concurrentHashMap.get(k12);
                if (bVar != null) {
                    z12 = false;
                } else {
                    if (this.f404175h.get()) {
                        return;
                    }
                    b bVar2 = new b(kApply, new c(this.f404172e, this, kApply));
                    concurrentHashMap.put(k12, bVar2);
                    getAndIncrement();
                    z12 = true;
                    bVar = bVar2;
                }
                try {
                    c<T, K> cVar = bVar.f404176c;
                    this.f404171d.apply(t12);
                    Objects.requireNonNull(t12, "The value supplied is null");
                    cVar.f404178c.offer(t12);
                    cVar.a();
                    if (z12) {
                        g12.onNext(bVar);
                        AtomicInteger atomicInteger = cVar.f404184i;
                        if (atomicInteger.get() == 0 && atomicInteger.compareAndSet(0, 2)) {
                            if (kApply == null) {
                                kApply = obj;
                            }
                            concurrentHashMap.remove(kApply);
                            if (decrementAndGet() == 0) {
                                this.f404174g.dispose();
                            }
                            bVar.e();
                        }
                    }
                } catch (Throwable th2) {
                    io.reactivex.rxjava3.exceptions.a.a(th2);
                    this.f404174g.dispose();
                    if (z12) {
                        g12.onNext(bVar);
                    }
                    onError(th2);
                }
            } catch (Throwable th3) {
                io.reactivex.rxjava3.exceptions.a.a(th3);
                this.f404174g.dispose();
                onError(th3);
            }
        }
    }

    /* compiled from: ObservableGroupBy.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.observable.o0$b */
    public static final class b<K, T> extends AbstractC46895b<K, T> {

        /* renamed from: c, reason: collision with root package name */
        public final c<T, K> f404176c;

        public b(K k12, c<T, K> cVar) {
            super(k12);
            this.f404176c = cVar;
        }

        public final void e() {
            c<T, K> cVar = this.f404176c;
            cVar.f404180e = true;
            cVar.a();
        }

        @Override // io.reactivex.rxjava3.core.z
        public final void w0(io.reactivex.rxjava3.core.G<? super T> g12) {
            this.f404176c.c(g12);
        }
    }

    /* compiled from: ObservableGroupBy.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.observable.o0$c */
    public static final class c<T, K> extends AtomicInteger implements io.reactivex.rxjava3.disposables.d, io.reactivex.rxjava3.core.E<T> {
        private static final long serialVersionUID = -3852313036005250360L;

        /* renamed from: b, reason: collision with root package name */
        public final K f404177b;

        /* renamed from: c, reason: collision with root package name */
        public final q41.i<T> f404178c;

        /* renamed from: d, reason: collision with root package name */
        public final a<?, K, T> f404179d;

        /* renamed from: e, reason: collision with root package name */
        public volatile boolean f404180e;

        /* renamed from: f, reason: collision with root package name */
        public Throwable f404181f;

        /* renamed from: g, reason: collision with root package name */
        public final AtomicBoolean f404182g = new AtomicBoolean();

        /* renamed from: h, reason: collision with root package name */
        public final AtomicReference<io.reactivex.rxjava3.core.G<? super T>> f404183h = new AtomicReference<>();

        /* renamed from: i, reason: collision with root package name */
        public final AtomicInteger f404184i = new AtomicInteger();

        /* JADX WARN: Multi-variable type inference failed */
        public c(int i12, a aVar, Object obj) {
            this.f404178c = new q41.i<>(i12);
            this.f404179d = aVar;
            this.f404177b = obj;
        }

        public final void a() {
            if (getAndIncrement() != 0) {
                return;
            }
            q41.i<T> iVar = this.f404178c;
            io.reactivex.rxjava3.core.G<? super T> g12 = this.f404183h.get();
            int iAddAndGet = 1;
            while (true) {
                if (g12 != null) {
                    while (true) {
                        boolean z12 = this.f404180e;
                        T tPoll = iVar.poll();
                        boolean z13 = tPoll == null;
                        boolean z14 = this.f404182g.get();
                        q41.i<T> iVar2 = this.f404178c;
                        AtomicReference<io.reactivex.rxjava3.core.G<? super T>> atomicReference = this.f404183h;
                        if (z14) {
                            iVar2.clear();
                            atomicReference.lazySet(null);
                            if ((this.f404184i.get() & 2) == 0) {
                                a<?, K, T> aVar = this.f404179d;
                                aVar.getClass();
                                Object obj = this.f404177b;
                                if (obj == null) {
                                    obj = a.f404168i;
                                }
                                aVar.f404173f.remove(obj);
                                if (aVar.decrementAndGet() == 0) {
                                    aVar.f404174g.dispose();
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        if (z12) {
                            Throwable th2 = this.f404181f;
                            if (th2 != null) {
                                iVar2.clear();
                                atomicReference.lazySet(null);
                                g12.onError(th2);
                                return;
                            } else if (z13) {
                                atomicReference.lazySet(null);
                                g12.e();
                                return;
                            }
                        }
                        if (z13) {
                            break;
                        } else {
                            g12.onNext(tPoll);
                        }
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
                if (g12 == null) {
                    g12 = this.f404183h.get();
                }
            }
        }

        @Override // io.reactivex.rxjava3.core.E
        public final void c(io.reactivex.rxjava3.core.G<? super T> g12) {
            AtomicInteger atomicInteger;
            int i12;
            do {
                atomicInteger = this.f404184i;
                i12 = atomicInteger.get();
                if ((i12 & 1) != 0) {
                    EmptyDisposable.d(new IllegalStateException("Only one Observer allowed!"), g12);
                    return;
                }
            } while (!atomicInteger.compareAndSet(i12, i12 | 1));
            g12.b(this);
            AtomicReference<io.reactivex.rxjava3.core.G<? super T>> atomicReference = this.f404183h;
            atomicReference.lazySet(g12);
            if (this.f404182g.get()) {
                atomicReference.lazySet(null);
            } else {
                a();
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            if (this.f404182g.compareAndSet(false, true) && getAndIncrement() == 0) {
                this.f404183h.lazySet(null);
                if ((this.f404184i.get() & 2) == 0) {
                    a<?, K, T> aVar = this.f404179d;
                    aVar.getClass();
                    Object obj = this.f404177b;
                    if (obj == null) {
                        obj = a.f404168i;
                    }
                    aVar.f404173f.remove(obj);
                    if (aVar.decrementAndGet() == 0) {
                        aVar.f404174g.dispose();
                    }
                }
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return this.f404182g.get();
        }
    }

    public C41975o0(io.reactivex.rxjava3.core.z zVar, l41.o oVar, l41.o oVar2, int i12) {
        super(zVar);
        this.f404165c = oVar;
        this.f404166d = oVar2;
        this.f404167e = i12;
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(io.reactivex.rxjava3.core.G<? super AbstractC46895b<K, V>> g12) {
        this.f403951b.c(new a(g12, this.f404165c, this.f404166d, this.f404167e));
    }
}
