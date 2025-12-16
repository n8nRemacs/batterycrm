package io.reactivex.rxjava3.subjects;

import io.reactivex.rxjava3.core.G;
import io.reactivex.rxjava3.internal.util.NotificationLite;
import io.reactivex.rxjava3.internal.util.a;
import j41.InterfaceC42196c;
import java.io.Serializable;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import s41.C47998a;

/* compiled from: BehaviorSubject.java */
/* loaded from: classes8.dex */
public final class b<T> extends i<T> {

    /* renamed from: h, reason: collision with root package name */
    public static final a[] f404967h = new a[0];

    /* renamed from: i, reason: collision with root package name */
    public static final a[] f404968i = new a[0];

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference<Object> f404969b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReference<a<T>[]> f404970c;

    /* renamed from: d, reason: collision with root package name */
    public final Lock f404971d;

    /* renamed from: e, reason: collision with root package name */
    public final Lock f404972e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicReference<Throwable> f404973f;

    /* renamed from: g, reason: collision with root package name */
    public long f404974g;

    /* compiled from: BehaviorSubject.java */
    public static final class a<T> implements io.reactivex.rxjava3.disposables.d, a.InterfaceC11520a<Object> {

        /* renamed from: b, reason: collision with root package name */
        public final G<? super T> f404975b;

        /* renamed from: c, reason: collision with root package name */
        public final b<T> f404976c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f404977d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f404978e;

        /* renamed from: f, reason: collision with root package name */
        public io.reactivex.rxjava3.internal.util.a<Object> f404979f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f404980g;

        /* renamed from: h, reason: collision with root package name */
        public volatile boolean f404981h;

        /* renamed from: i, reason: collision with root package name */
        public long f404982i;

        public a(G<? super T> g12, b<T> bVar) {
            this.f404975b = g12;
            this.f404976c = bVar;
        }

        public final void a(long j12, Object obj) {
            if (this.f404981h) {
                return;
            }
            if (!this.f404980g) {
                synchronized (this) {
                    try {
                        if (this.f404981h) {
                            return;
                        }
                        if (this.f404982i == j12) {
                            return;
                        }
                        if (this.f404978e) {
                            io.reactivex.rxjava3.internal.util.a<Object> aVar = this.f404979f;
                            if (aVar == null) {
                                aVar = new io.reactivex.rxjava3.internal.util.a<>();
                                this.f404979f = aVar;
                            }
                            aVar.b(obj);
                            return;
                        }
                        this.f404977d = true;
                        this.f404980g = true;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            test(obj);
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            if (this.f404981h) {
                return;
            }
            this.f404981h = true;
            this.f404976c.Q0(this);
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final boolean i() {
            return this.f404981h;
        }

        @Override // l41.r
        public final boolean test(Object obj) {
            return this.f404981h || NotificationLite.a(this.f404975b, obj);
        }
    }

    public b(T t12) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f404971d = reentrantReadWriteLock.readLock();
        this.f404972e = reentrantReadWriteLock.writeLock();
        this.f404970c = new AtomicReference<>(f404967h);
        this.f404969b = new AtomicReference<>(t12);
        this.f404973f = new AtomicReference<>();
    }

    @j41.e
    @InterfaceC42196c
    public static <T> b<T> N0() {
        return new b<>(null);
    }

    @j41.e
    @InterfaceC42196c
    public static <T> b<T> O0(T t12) {
        Objects.requireNonNull(t12, "defaultValue is null");
        return new b<>(t12);
    }

    @j41.f
    @InterfaceC42196c
    public final T P0() {
        T t12 = (T) this.f404969b.get();
        if (NotificationLite.h(t12) || NotificationLite.i(t12)) {
            return null;
        }
        return t12;
    }

    public final void Q0(a<T> aVar) {
        a<T>[] aVarArr;
        while (true) {
            AtomicReference<a<T>[]> atomicReference = this.f404970c;
            a<T>[] aVarArr2 = atomicReference.get();
            int length = aVarArr2.length;
            if (length == 0) {
                return;
            }
            int i12 = 0;
            while (true) {
                if (i12 >= length) {
                    i12 = -1;
                    break;
                } else if (aVarArr2[i12] == aVar) {
                    break;
                } else {
                    i12++;
                }
            }
            if (i12 < 0) {
                return;
            }
            if (length == 1) {
                aVarArr = f404967h;
            } else {
                a<T>[] aVarArr3 = new a[length - 1];
                System.arraycopy(aVarArr2, 0, aVarArr3, 0, i12);
                System.arraycopy(aVarArr2, i12 + 1, aVarArr3, i12, (length - i12) - 1);
                aVarArr = aVarArr3;
            }
            while (!atomicReference.compareAndSet(aVarArr2, aVarArr)) {
                if (atomicReference.get() != aVarArr2) {
                    break;
                }
            }
            return;
        }
    }

    @Override // io.reactivex.rxjava3.core.G
    public final void b(io.reactivex.rxjava3.disposables.d dVar) {
        if (this.f404973f.get() != null) {
            dVar.dispose();
        }
    }

    @Override // io.reactivex.rxjava3.core.G
    public final void e() {
        AtomicReference<Throwable> atomicReference = this.f404973f;
        Throwable th2 = io.reactivex.rxjava3.internal.util.h.f404834a;
        while (!atomicReference.compareAndSet(null, th2)) {
            if (atomicReference.get() != null) {
                return;
            }
        }
        NotificationLite notificationLite = NotificationLite.f404825b;
        Lock lock = this.f404972e;
        lock.lock();
        this.f404974g++;
        this.f404969b.lazySet(notificationLite);
        lock.unlock();
        for (a<T> aVar : this.f404970c.getAndSet(f404968i)) {
            aVar.a(this.f404974g, notificationLite);
        }
    }

    @Override // io.reactivex.rxjava3.core.G
    public final void onError(Throwable th2) {
        io.reactivex.rxjava3.internal.util.h.c(th2, "onError called with a null Throwable.");
        AtomicReference<Throwable> atomicReference = this.f404973f;
        while (!atomicReference.compareAndSet(null, th2)) {
            if (atomicReference.get() != null) {
                C47998a.b(th2);
                return;
            }
        }
        Object objE = NotificationLite.e(th2);
        Lock lock = this.f404972e;
        lock.lock();
        this.f404974g++;
        this.f404969b.lazySet((Serializable) objE);
        lock.unlock();
        for (a<T> aVar : this.f404970c.getAndSet(f404968i)) {
            aVar.a(this.f404974g, objE);
        }
    }

    @Override // io.reactivex.rxjava3.core.G
    public final void onNext(T t12) {
        io.reactivex.rxjava3.internal.util.h.c(t12, "onNext called with a null value.");
        if (this.f404973f.get() != null) {
            return;
        }
        Lock lock = this.f404972e;
        lock.lock();
        this.f404974g++;
        this.f404969b.lazySet(t12);
        lock.unlock();
        for (a<T> aVar : this.f404970c.get()) {
            aVar.a(this.f404974g, t12);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0089, code lost:
    
        r0.f404978e = false;
     */
    @Override // io.reactivex.rxjava3.core.z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void w0(io.reactivex.rxjava3.core.G<? super T> r7) {
        /*
            r6 = this;
            io.reactivex.rxjava3.subjects.b$a r0 = new io.reactivex.rxjava3.subjects.b$a
            r0.<init>(r7, r6)
            r7.b(r0)
        L8:
            java.util.concurrent.atomic.AtomicReference<io.reactivex.rxjava3.subjects.b$a<T>[]> r1 = r6.f404970c
            java.lang.Object r2 = r1.get()
            io.reactivex.rxjava3.subjects.b$a[] r2 = (io.reactivex.rxjava3.subjects.b.a[]) r2
            io.reactivex.rxjava3.subjects.b$a[] r3 = io.reactivex.rxjava3.subjects.b.f404968i
            if (r2 != r3) goto L2a
            java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> r0 = r6.f404973f
            java.lang.Object r0 = r0.get()
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            java.lang.Throwable r1 = io.reactivex.rxjava3.internal.util.h.f404834a
            if (r0 != r1) goto L25
            r7.e()
            goto L99
        L25:
            r7.onError(r0)
            goto L99
        L2a:
            int r3 = r2.length
            int r4 = r3 + 1
            io.reactivex.rxjava3.subjects.b$a[] r4 = new io.reactivex.rxjava3.subjects.b.a[r4]
            r5 = 0
            java.lang.System.arraycopy(r2, r5, r4, r5, r3)
            r4[r3] = r0
        L35:
            boolean r3 = r1.compareAndSet(r2, r4)
            if (r3 == 0) goto L9c
            boolean r7 = r0.f404981h
            if (r7 == 0) goto L43
            r6.Q0(r0)
            goto L99
        L43:
            boolean r7 = r0.f404981h
            if (r7 == 0) goto L48
            goto L99
        L48:
            monitor-enter(r0)
            boolean r7 = r0.f404981h     // Catch: java.lang.Throwable -> L4f
            if (r7 == 0) goto L51
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4f
            goto L99
        L4f:
            r7 = move-exception
            goto L9a
        L51:
            boolean r7 = r0.f404977d     // Catch: java.lang.Throwable -> L4f
            if (r7 == 0) goto L57
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4f
            goto L99
        L57:
            io.reactivex.rxjava3.subjects.b<T> r7 = r0.f404976c     // Catch: java.lang.Throwable -> L4f
            java.util.concurrent.locks.Lock r1 = r7.f404971d     // Catch: java.lang.Throwable -> L4f
            r1.lock()     // Catch: java.lang.Throwable -> L4f
            long r2 = r7.f404974g     // Catch: java.lang.Throwable -> L4f
            r0.f404982i = r2     // Catch: java.lang.Throwable -> L4f
            java.util.concurrent.atomic.AtomicReference<java.lang.Object> r7 = r7.f404969b     // Catch: java.lang.Throwable -> L4f
            java.lang.Object r7 = r7.get()     // Catch: java.lang.Throwable -> L4f
            r1.unlock()     // Catch: java.lang.Throwable -> L4f
            r1 = 1
            if (r7 == 0) goto L70
            r2 = r1
            goto L71
        L70:
            r2 = r5
        L71:
            r0.f404978e = r2     // Catch: java.lang.Throwable -> L4f
            r0.f404977d = r1     // Catch: java.lang.Throwable -> L4f
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4f
            if (r7 == 0) goto L99
            boolean r7 = r0.test(r7)
            if (r7 == 0) goto L7f
            goto L99
        L7f:
            boolean r7 = r0.f404981h
            if (r7 == 0) goto L84
            goto L99
        L84:
            monitor-enter(r0)
            io.reactivex.rxjava3.internal.util.a<java.lang.Object> r7 = r0.f404979f     // Catch: java.lang.Throwable -> L8d
            if (r7 != 0) goto L8f
            r0.f404978e = r5     // Catch: java.lang.Throwable -> L8d
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8d
            goto L99
        L8d:
            r7 = move-exception
            goto L97
        L8f:
            r1 = 0
            r0.f404979f = r1     // Catch: java.lang.Throwable -> L8d
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8d
            r7.c(r0)
            goto L7f
        L97:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8d
            throw r7
        L99:
            return
        L9a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4f
            throw r7
        L9c:
            java.lang.Object r3 = r1.get()
            if (r3 == r2) goto L35
            goto L8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.reactivex.rxjava3.subjects.b.w0(io.reactivex.rxjava3.core.G):void");
    }
}
