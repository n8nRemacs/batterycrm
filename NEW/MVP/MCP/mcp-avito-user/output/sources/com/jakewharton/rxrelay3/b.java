package com.jakewharton.rxrelay3;

import com.jakewharton.rxrelay3.a;
import io.reactivex.rxjava3.core.G;
import j41.InterfaceC42196c;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: BehaviorRelay.java */
/* loaded from: classes7.dex */
public final class b<T> extends d<T> {

    /* renamed from: g, reason: collision with root package name */
    public static final Object[] f364264g = new Object[0];

    /* renamed from: h, reason: collision with root package name */
    public static final a[] f364265h = new a[0];

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference<T> f364266b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReference<a<T>[]> f364267c;

    /* renamed from: d, reason: collision with root package name */
    public final Lock f364268d;

    /* renamed from: e, reason: collision with root package name */
    public final Lock f364269e;

    /* renamed from: f, reason: collision with root package name */
    public long f364270f;

    /* compiled from: BehaviorRelay.java */
    public static final class a<T> implements io.reactivex.rxjava3.disposables.d, a.InterfaceC10779a<T> {

        /* renamed from: b, reason: collision with root package name */
        public final G<? super T> f364271b;

        /* renamed from: c, reason: collision with root package name */
        public final b<T> f364272c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f364273d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f364274e;

        /* renamed from: f, reason: collision with root package name */
        public com.jakewharton.rxrelay3.a<T> f364275f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f364276g;

        /* renamed from: h, reason: collision with root package name */
        public volatile boolean f364277h;

        /* renamed from: i, reason: collision with root package name */
        public long f364278i;

        public a(G<? super T> g12, b<T> bVar) {
            this.f364271b = g12;
            this.f364272c = bVar;
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            if (this.f364277h) {
                return;
            }
            this.f364277h = true;
            this.f364272c.O0(this);
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final boolean i() {
            return this.f364277h;
        }

        @Override // l41.r
        public final boolean test(T t12) {
            if (this.f364277h) {
                return false;
            }
            this.f364271b.onNext(t12);
            return false;
        }
    }

    public b() {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f364268d = reentrantReadWriteLock.readLock();
        this.f364269e = reentrantReadWriteLock.writeLock();
        this.f364267c = new AtomicReference<>(f364265h);
        this.f364266b = new AtomicReference<>();
    }

    @j41.e
    @InterfaceC42196c
    public static <T> b<T> N0(T t12) {
        b<T> bVar = new b<>();
        if (t12 == null) {
            throw new NullPointerException("defaultValue == null");
        }
        bVar.f364266b.lazySet(t12);
        return bVar;
    }

    public final void O0(a<T> aVar) {
        a<T>[] aVarArr;
        while (true) {
            AtomicReference<a<T>[]> atomicReference = this.f364267c;
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
                aVarArr = f364265h;
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

    @Override // l41.g
    public final void accept(T t12) {
        if (t12 == null) {
            throw new NullPointerException("value == null");
        }
        Lock lock = this.f364269e;
        lock.lock();
        this.f364270f++;
        this.f364266b.lazySet(t12);
        lock.unlock();
        for (a<T> aVar : this.f364267c.get()) {
            long j12 = this.f364270f;
            if (!aVar.f364277h) {
                if (aVar.f364276g) {
                    aVar.test(t12);
                } else {
                    synchronized (aVar) {
                        try {
                            if (!aVar.f364277h) {
                                if (aVar.f364278i != j12) {
                                    if (aVar.f364274e) {
                                        com.jakewharton.rxrelay3.a<T> aVar2 = aVar.f364275f;
                                        if (aVar2 == null) {
                                            aVar2 = new com.jakewharton.rxrelay3.a<>();
                                            aVar.f364275f = aVar2;
                                        }
                                        aVar2.a(t12);
                                    } else {
                                        aVar.f364273d = true;
                                        aVar.f364276g = true;
                                        aVar.test(t12);
                                    }
                                }
                            }
                        } finally {
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x006d, code lost:
    
        r0.f364274e = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0077, code lost:
    
        r6 = r6.f364261a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0079, code lost:
    
        if (r6 == null) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x007b, code lost:
    
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x007d, code lost:
    
        if (r1 >= 4) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x007f, code lost:
    
        r3 = r6[r1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0081, code lost:
    
        if (r3 != null) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0084, code lost:
    
        r0.test(r3);
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x008a, code lost:
    
        r6 = r6[4];
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.reactivex.rxjava3.core.z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void w0(io.reactivex.rxjava3.core.G<? super T> r6) {
        /*
            r5 = this;
            com.jakewharton.rxrelay3.b$a r0 = new com.jakewharton.rxrelay3.b$a
            r0.<init>(r6, r5)
            r6.b(r0)
        L8:
            java.util.concurrent.atomic.AtomicReference<com.jakewharton.rxrelay3.b$a<T>[]> r6 = r5.f364267c
            java.lang.Object r1 = r6.get()
            com.jakewharton.rxrelay3.b$a[] r1 = (com.jakewharton.rxrelay3.b.a[]) r1
            int r2 = r1.length
            int r3 = r2 + 1
            com.jakewharton.rxrelay3.b$a[] r3 = new com.jakewharton.rxrelay3.b.a[r3]
            r4 = 0
            java.lang.System.arraycopy(r1, r4, r3, r4, r2)
            r3[r2] = r0
        L1b:
            boolean r2 = r6.compareAndSet(r1, r3)
            if (r2 == 0) goto L94
            boolean r6 = r0.f364277h
            if (r6 == 0) goto L2a
            r5.O0(r0)
            goto L91
        L2a:
            boolean r6 = r0.f364277h
            if (r6 == 0) goto L30
            goto L91
        L30:
            monitor-enter(r0)
            boolean r6 = r0.f364277h     // Catch: java.lang.Throwable -> L37
            if (r6 == 0) goto L39
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L37
            goto L91
        L37:
            r6 = move-exception
            goto L92
        L39:
            boolean r6 = r0.f364273d     // Catch: java.lang.Throwable -> L37
            if (r6 == 0) goto L3f
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L37
            goto L91
        L3f:
            com.jakewharton.rxrelay3.b<T> r6 = r0.f364272c     // Catch: java.lang.Throwable -> L37
            java.util.concurrent.locks.Lock r1 = r6.f364268d     // Catch: java.lang.Throwable -> L37
            r1.lock()     // Catch: java.lang.Throwable -> L37
            long r2 = r6.f364270f     // Catch: java.lang.Throwable -> L37
            r0.f364278i = r2     // Catch: java.lang.Throwable -> L37
            java.util.concurrent.atomic.AtomicReference<T> r6 = r6.f364266b     // Catch: java.lang.Throwable -> L37
            java.lang.Object r6 = r6.get()     // Catch: java.lang.Throwable -> L37
            r1.unlock()     // Catch: java.lang.Throwable -> L37
            r1 = 1
            if (r6 == 0) goto L58
            r2 = r1
            goto L59
        L58:
            r2 = r4
        L59:
            r0.f364274e = r2     // Catch: java.lang.Throwable -> L37
            r0.f364273d = r1     // Catch: java.lang.Throwable -> L37
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L37
            if (r6 == 0) goto L91
            r0.test(r6)
        L63:
            boolean r6 = r0.f364277h
            if (r6 == 0) goto L68
            goto L91
        L68:
            monitor-enter(r0)
            com.jakewharton.rxrelay3.a<T> r6 = r0.f364275f     // Catch: java.lang.Throwable -> L71
            if (r6 != 0) goto L73
            r0.f364274e = r4     // Catch: java.lang.Throwable -> L71
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L71
            goto L91
        L71:
            r6 = move-exception
            goto L8f
        L73:
            r1 = 0
            r0.f364275f = r1     // Catch: java.lang.Throwable -> L71
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L71
            java.lang.Object[] r6 = r6.f364261a
        L79:
            if (r6 == 0) goto L63
            r1 = r4
        L7c:
            r2 = 4
            if (r1 >= r2) goto L8a
            r3 = r6[r1]
            if (r3 != 0) goto L84
            goto L8a
        L84:
            r0.test(r3)
            int r1 = r1 + 1
            goto L7c
        L8a:
            r6 = r6[r2]
            java.lang.Object[] r6 = (java.lang.Object[]) r6
            goto L79
        L8f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L71
            throw r6
        L91:
            return
        L92:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L37
            throw r6
        L94:
            java.lang.Object r2 = r6.get()
            if (r2 == r1) goto L1b
            goto L8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.jakewharton.rxrelay3.b.w0(io.reactivex.rxjava3.core.G):void");
    }
}
