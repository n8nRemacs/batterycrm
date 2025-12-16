package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.H;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.util.ArrayListSupplier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p41.AbstractC46895b;

/* compiled from: ObservableBufferTimed.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.observable.p, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41977p<T, U extends Collection<? super T>> extends AbstractC41932a<T, U> {

    /* renamed from: c, reason: collision with root package name */
    public final long f404187c;

    /* renamed from: d, reason: collision with root package name */
    public final long f404188d;

    /* renamed from: e, reason: collision with root package name */
    public final TimeUnit f404189e;

    /* renamed from: f, reason: collision with root package name */
    public final io.reactivex.rxjava3.core.H f404190f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayListSupplier f404191g;

    /* renamed from: h, reason: collision with root package name */
    public final int f404192h;

    /* compiled from: ObservableBufferTimed.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.observable.p$a */
    public static final class a<T, U extends Collection<? super T>> extends io.reactivex.rxjava3.internal.observers.z<T, U, U> implements Runnable, io.reactivex.rxjava3.disposables.d {

        /* renamed from: g, reason: collision with root package name */
        public final ArrayListSupplier f404193g;

        /* renamed from: h, reason: collision with root package name */
        public final long f404194h;

        /* renamed from: i, reason: collision with root package name */
        public final TimeUnit f404195i;

        /* renamed from: j, reason: collision with root package name */
        public final int f404196j;

        /* renamed from: k, reason: collision with root package name */
        public final H.c f404197k;

        /* renamed from: l, reason: collision with root package name */
        public U f404198l;

        /* renamed from: m, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f404199m;

        /* renamed from: n, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f404200n;

        /* renamed from: o, reason: collision with root package name */
        public long f404201o;

        /* renamed from: p, reason: collision with root package name */
        public long f404202p;

        public a(io.reactivex.rxjava3.observers.m mVar, ArrayListSupplier arrayListSupplier, long j12, TimeUnit timeUnit, int i12, H.c cVar) {
            super(mVar, new io.reactivex.rxjava3.internal.queue.a());
            this.f404193g = arrayListSupplier;
            this.f404194h = j12;
            this.f404195i = timeUnit;
            this.f404196j = i12;
            this.f404197k = cVar;
        }

        @Override // io.reactivex.rxjava3.internal.observers.z, io.reactivex.rxjava3.internal.util.l
        public final void a(io.reactivex.rxjava3.observers.m mVar, Object obj) {
            mVar.onNext((Collection) obj);
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            io.reactivex.rxjava3.observers.m mVar = this.f402138c;
            if (DisposableHelper.f(this.f404200n, dVar)) {
                this.f404200n = dVar;
                try {
                    this.f404193g.getClass();
                    this.f404198l = new ArrayList();
                    mVar.b(this);
                    TimeUnit timeUnit = this.f404195i;
                    H.c cVar = this.f404197k;
                    long j12 = this.f404194h;
                    this.f404199m = cVar.d(this, j12, j12, timeUnit);
                } catch (Throwable th2) {
                    io.reactivex.rxjava3.exceptions.a.a(th2);
                    dVar.dispose();
                    EmptyDisposable.d(th2, mVar);
                    this.f404197k.dispose();
                }
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            if (this.f402140e) {
                return;
            }
            this.f402140e = true;
            this.f404200n.dispose();
            this.f404197k.dispose();
            synchronized (this) {
                this.f404198l = null;
            }
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void e() {
            U u12;
            this.f404197k.dispose();
            synchronized (this) {
                u12 = this.f404198l;
                this.f404198l = null;
            }
            if (u12 != null) {
                this.f402139d.offer(u12);
                this.f402141f = true;
                if (c()) {
                    io.reactivex.rxjava3.internal.util.p.b(this.f402139d, this.f402138c, this, this);
                }
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return this.f402140e;
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onError(Throwable th2) {
            synchronized (this) {
                this.f404198l = null;
            }
            this.f402138c.onError(th2);
            this.f404197k.dispose();
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onNext(T t12) {
            synchronized (this) {
                try {
                    U u12 = this.f404198l;
                    if (u12 == null) {
                        return;
                    }
                    u12.add(t12);
                    if (u12.size() < this.f404196j) {
                        return;
                    }
                    this.f404198l = null;
                    this.f404201o++;
                    f(u12, this);
                    try {
                        this.f404193g.getClass();
                        ArrayList arrayList = new ArrayList();
                        synchronized (this) {
                            this.f404198l = arrayList;
                            this.f404202p++;
                        }
                    } catch (Throwable th2) {
                        io.reactivex.rxjava3.exceptions.a.a(th2);
                        this.f402138c.onError(th2);
                        dispose();
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                this.f404193g.getClass();
                ArrayList arrayList = new ArrayList();
                synchronized (this) {
                    U u12 = this.f404198l;
                    if (u12 != null && this.f404201o == this.f404202p) {
                        this.f404198l = arrayList;
                        f(u12, this);
                    }
                }
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                dispose();
                this.f402138c.onError(th2);
            }
        }
    }

    /* compiled from: ObservableBufferTimed.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.observable.p$b */
    public static final class b<T, U extends Collection<? super T>> extends io.reactivex.rxjava3.internal.observers.z<T, U, U> implements Runnable, io.reactivex.rxjava3.disposables.d {

        /* renamed from: g, reason: collision with root package name */
        public final ArrayListSupplier f404203g;

        /* renamed from: h, reason: collision with root package name */
        public final long f404204h;

        /* renamed from: i, reason: collision with root package name */
        public final TimeUnit f404205i;

        /* renamed from: j, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.H f404206j;

        /* renamed from: k, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f404207k;

        /* renamed from: l, reason: collision with root package name */
        public U f404208l;

        /* renamed from: m, reason: collision with root package name */
        public final AtomicReference<io.reactivex.rxjava3.disposables.d> f404209m;

        public b(io.reactivex.rxjava3.observers.m mVar, ArrayListSupplier arrayListSupplier, long j12, TimeUnit timeUnit, io.reactivex.rxjava3.core.H h12) {
            super(mVar, new io.reactivex.rxjava3.internal.queue.a());
            this.f404209m = new AtomicReference<>();
            this.f404203g = arrayListSupplier;
            this.f404204h = j12;
            this.f404205i = timeUnit;
            this.f404206j = h12;
        }

        @Override // io.reactivex.rxjava3.internal.observers.z, io.reactivex.rxjava3.internal.util.l
        public final void a(io.reactivex.rxjava3.observers.m mVar, Object obj) {
            this.f402138c.onNext((Collection) obj);
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            io.reactivex.rxjava3.observers.m mVar = this.f402138c;
            if (DisposableHelper.f(this.f404207k, dVar)) {
                this.f404207k = dVar;
                try {
                    this.f404203g.getClass();
                    this.f404208l = new ArrayList();
                    mVar.b(this);
                    AtomicReference<io.reactivex.rxjava3.disposables.d> atomicReference = this.f404209m;
                    if (DisposableHelper.b(atomicReference.get())) {
                        return;
                    }
                    TimeUnit timeUnit = this.f404205i;
                    io.reactivex.rxjava3.core.H h12 = this.f404206j;
                    long j12 = this.f404204h;
                    DisposableHelper.d(atomicReference, h12.f(this, j12, j12, timeUnit));
                } catch (Throwable th2) {
                    io.reactivex.rxjava3.exceptions.a.a(th2);
                    dispose();
                    EmptyDisposable.d(th2, mVar);
                }
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            DisposableHelper.a(this.f404209m);
            this.f404207k.dispose();
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void e() {
            U u12;
            synchronized (this) {
                u12 = this.f404208l;
                this.f404208l = null;
            }
            if (u12 != null) {
                this.f402139d.offer(u12);
                this.f402141f = true;
                if (c()) {
                    io.reactivex.rxjava3.internal.util.p.b(this.f402139d, this.f402138c, null, this);
                }
            }
            DisposableHelper.a(this.f404209m);
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return this.f404209m.get() == DisposableHelper.f401986b;
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onError(Throwable th2) {
            synchronized (this) {
                this.f404208l = null;
            }
            this.f402138c.onError(th2);
            DisposableHelper.a(this.f404209m);
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onNext(T t12) {
            synchronized (this) {
                try {
                    U u12 = this.f404208l;
                    if (u12 == null) {
                        return;
                    }
                    u12.add(t12);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            U u12;
            try {
                this.f404203g.getClass();
                ArrayList arrayList = new ArrayList();
                synchronized (this) {
                    try {
                        u12 = this.f404208l;
                        if (u12 != null) {
                            this.f404208l = arrayList;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (u12 == null) {
                    DisposableHelper.a(this.f404209m);
                } else {
                    d(u12, this);
                }
            } catch (Throwable th3) {
                io.reactivex.rxjava3.exceptions.a.a(th3);
                this.f402138c.onError(th3);
                dispose();
            }
        }
    }

    /* compiled from: ObservableBufferTimed.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.observable.p$c */
    public static final class c<T, U extends Collection<? super T>> extends io.reactivex.rxjava3.internal.observers.z<T, U, U> implements Runnable, io.reactivex.rxjava3.disposables.d {

        /* renamed from: g, reason: collision with root package name */
        public final ArrayListSupplier f404210g;

        /* renamed from: h, reason: collision with root package name */
        public final long f404211h;

        /* renamed from: i, reason: collision with root package name */
        public final long f404212i;

        /* renamed from: j, reason: collision with root package name */
        public final TimeUnit f404213j;

        /* renamed from: k, reason: collision with root package name */
        public final H.c f404214k;

        /* renamed from: l, reason: collision with root package name */
        public final LinkedList f404215l;

        /* renamed from: m, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f404216m;

        /* compiled from: ObservableBufferTimed.java */
        /* renamed from: io.reactivex.rxjava3.internal.operators.observable.p$c$a */
        public final class a implements Runnable {

            /* renamed from: b, reason: collision with root package name */
            public final U f404217b;

            public a(U u12) {
                this.f404217b = u12;
            }

            @Override // java.lang.Runnable
            public final void run() {
                synchronized (c.this) {
                    c.this.f404215l.remove(this.f404217b);
                }
                c cVar = c.this;
                cVar.f(this.f404217b, cVar.f404214k);
            }
        }

        /* compiled from: ObservableBufferTimed.java */
        /* renamed from: io.reactivex.rxjava3.internal.operators.observable.p$c$b */
        public final class b implements Runnable {

            /* renamed from: b, reason: collision with root package name */
            public final U f404219b;

            public b(U u12) {
                this.f404219b = u12;
            }

            @Override // java.lang.Runnable
            public final void run() {
                synchronized (c.this) {
                    c.this.f404215l.remove(this.f404219b);
                }
                c cVar = c.this;
                cVar.f(this.f404219b, cVar.f404214k);
            }
        }

        public c(io.reactivex.rxjava3.observers.m mVar, ArrayListSupplier arrayListSupplier, long j12, long j13, TimeUnit timeUnit, H.c cVar) {
            super(mVar, new io.reactivex.rxjava3.internal.queue.a());
            this.f404210g = arrayListSupplier;
            this.f404211h = j12;
            this.f404212i = j13;
            this.f404213j = timeUnit;
            this.f404214k = cVar;
            this.f404215l = new LinkedList();
        }

        @Override // io.reactivex.rxjava3.internal.observers.z, io.reactivex.rxjava3.internal.util.l
        public final void a(io.reactivex.rxjava3.observers.m mVar, Object obj) {
            mVar.onNext((Collection) obj);
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            H.c cVar = this.f404214k;
            io.reactivex.rxjava3.observers.m mVar = this.f402138c;
            if (DisposableHelper.f(this.f404216m, dVar)) {
                this.f404216m = dVar;
                try {
                    this.f404210g.getClass();
                    ArrayList arrayList = new ArrayList();
                    this.f404215l.add(arrayList);
                    mVar.b(this);
                    TimeUnit timeUnit = this.f404213j;
                    H.c cVar2 = this.f404214k;
                    long j12 = this.f404212i;
                    cVar2.d(this, j12, j12, timeUnit);
                    cVar.c(new b(arrayList), this.f404211h, this.f404213j);
                } catch (Throwable th2) {
                    io.reactivex.rxjava3.exceptions.a.a(th2);
                    dVar.dispose();
                    EmptyDisposable.d(th2, mVar);
                    cVar.dispose();
                }
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            if (this.f402140e) {
                return;
            }
            this.f402140e = true;
            synchronized (this) {
                this.f404215l.clear();
            }
            this.f404216m.dispose();
            this.f404214k.dispose();
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void e() {
            ArrayList arrayList;
            synchronized (this) {
                arrayList = new ArrayList(this.f404215l);
                this.f404215l.clear();
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                this.f402139d.offer((Collection) it.next());
            }
            this.f402141f = true;
            if (c()) {
                io.reactivex.rxjava3.internal.util.p.b(this.f402139d, this.f402138c, this.f404214k, this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return this.f402140e;
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onError(Throwable th2) {
            this.f402141f = true;
            synchronized (this) {
                this.f404215l.clear();
            }
            this.f402138c.onError(th2);
            this.f404214k.dispose();
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onNext(T t12) {
            synchronized (this) {
                try {
                    Iterator it = this.f404215l.iterator();
                    while (it.hasNext()) {
                        ((Collection) it.next()).add(t12);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f402140e) {
                return;
            }
            try {
                this.f404210g.getClass();
                ArrayList arrayList = new ArrayList();
                synchronized (this) {
                    try {
                        if (this.f402140e) {
                            return;
                        }
                        this.f404215l.add(arrayList);
                        this.f404214k.c(new a(arrayList), this.f404211h, this.f404213j);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                io.reactivex.rxjava3.exceptions.a.a(th3);
                this.f402138c.onError(th3);
                dispose();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41977p(AbstractC46895b abstractC46895b, TimeUnit timeUnit, io.reactivex.rxjava3.core.H h12) {
        super(abstractC46895b);
        ArrayListSupplier arrayListSupplier = ArrayListSupplier.f404815b;
        this.f404187c = 500L;
        this.f404188d = 500L;
        this.f404189e = timeUnit;
        this.f404190f = h12;
        this.f404191g = arrayListSupplier;
        this.f404192h = Integer.MAX_VALUE;
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(io.reactivex.rxjava3.core.G<? super U> g12) {
        long j12 = this.f404187c;
        long j13 = this.f404188d;
        io.reactivex.rxjava3.core.E<T> e12 = this.f403951b;
        if (j12 == j13 && this.f404192h == Integer.MAX_VALUE) {
            e12.c(new b(new io.reactivex.rxjava3.observers.m(g12), this.f404191g, j12, this.f404189e, this.f404190f));
            return;
        }
        H.c cVarB = this.f404190f.b();
        long j14 = this.f404187c;
        long j15 = this.f404188d;
        if (j14 == j15) {
            e12.c(new a(new io.reactivex.rxjava3.observers.m(g12), this.f404191g, j14, this.f404189e, this.f404192h, cVarB));
        } else {
            e12.c(new c(new io.reactivex.rxjava3.observers.m(g12), this.f404191g, j14, j15, this.f404189e, cVarB));
        }
    }
}
