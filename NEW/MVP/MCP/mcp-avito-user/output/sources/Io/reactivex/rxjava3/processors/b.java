package io.reactivex.rxjava3.processors;

import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.NotificationLite;
import io.reactivex.rxjava3.internal.util.a;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import s41.C47998a;

/* compiled from: BehaviorProcessor.java */
/* loaded from: classes8.dex */
public final class b<T> extends c<T> {

    /* renamed from: i, reason: collision with root package name */
    public static final Object[] f404894i = new Object[0];

    /* renamed from: j, reason: collision with root package name */
    public static final a[] f404895j = new a[0];

    /* renamed from: k, reason: collision with root package name */
    public static final a[] f404896k = new a[0];

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReference<a<T>[]> f404897c;

    /* renamed from: d, reason: collision with root package name */
    public final Lock f404898d;

    /* renamed from: e, reason: collision with root package name */
    public final Lock f404899e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicReference<Object> f404900f = new AtomicReference<>();

    /* renamed from: g, reason: collision with root package name */
    public final AtomicReference<Throwable> f404901g;

    /* renamed from: h, reason: collision with root package name */
    public long f404902h;

    /* compiled from: BehaviorProcessor.java */
    public static final class a<T> extends AtomicLong implements org.reactivestreams.e, a.InterfaceC11520a<Object> {
        private static final long serialVersionUID = 3293175281126227086L;

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC41782o f404903b;

        /* renamed from: c, reason: collision with root package name */
        public final b<T> f404904c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f404905d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f404906e;

        /* renamed from: f, reason: collision with root package name */
        public io.reactivex.rxjava3.internal.util.a<Object> f404907f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f404908g;

        /* renamed from: h, reason: collision with root package name */
        public volatile boolean f404909h;

        /* renamed from: i, reason: collision with root package name */
        public long f404910i;

        public a(InterfaceC41782o interfaceC41782o, b bVar) {
            this.f404903b = interfaceC41782o;
            this.f404904c = bVar;
        }

        public final void a(long j12, Object obj) {
            if (this.f404909h) {
                return;
            }
            if (!this.f404908g) {
                synchronized (this) {
                    try {
                        if (this.f404909h) {
                            return;
                        }
                        if (this.f404910i == j12) {
                            return;
                        }
                        if (this.f404906e) {
                            io.reactivex.rxjava3.internal.util.a<Object> aVar = this.f404907f;
                            if (aVar == null) {
                                aVar = new io.reactivex.rxjava3.internal.util.a<>();
                                this.f404907f = aVar;
                            }
                            aVar.b(obj);
                            return;
                        }
                        this.f404905d = true;
                        this.f404908g = true;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            test(obj);
        }

        @Override // org.reactivestreams.e
        public final void cancel() {
            if (this.f404909h) {
                return;
            }
            this.f404909h = true;
            this.f404904c.A(this);
        }

        @Override // org.reactivestreams.e
        public final void request(long j12) {
            if (SubscriptionHelper.h(j12)) {
                io.reactivex.rxjava3.internal.util.c.a(this, j12);
            }
        }

        @Override // l41.r
        public final boolean test(Object obj) {
            if (this.f404909h) {
                return true;
            }
            if (NotificationLite.h(obj)) {
                this.f404903b.e();
                return true;
            }
            if (NotificationLite.i(obj)) {
                this.f404903b.onError(NotificationLite.f(obj));
                return true;
            }
            long j12 = get();
            if (j12 == 0) {
                cancel();
                this.f404903b.onError(new MissingBackpressureException("Could not deliver value due to lack of requests"));
                return true;
            }
            this.f404903b.onNext(obj);
            if (j12 == Long.MAX_VALUE) {
                return false;
            }
            decrementAndGet();
            return false;
        }
    }

    public b() {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f404898d = reentrantReadWriteLock.readLock();
        this.f404899e = reentrantReadWriteLock.writeLock();
        this.f404897c = new AtomicReference<>(f404895j);
        this.f404901g = new AtomicReference<>();
    }

    public final void A(a<T> aVar) {
        a<T>[] aVarArr;
        while (true) {
            AtomicReference<a<T>[]> atomicReference = this.f404897c;
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
                aVarArr = f404895j;
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

    @Override // org.reactivestreams.d
    public final void K(@j41.e org.reactivestreams.e eVar) {
        if (this.f404901g.get() != null) {
            eVar.cancel();
        } else {
            eVar.request(Long.MAX_VALUE);
        }
    }

    @Override // org.reactivestreams.d
    public final void e() {
        AtomicReference<Throwable> atomicReference = this.f404901g;
        Throwable th2 = io.reactivex.rxjava3.internal.util.h.f404834a;
        while (!atomicReference.compareAndSet(null, th2)) {
            if (atomicReference.get() != null) {
                return;
            }
        }
        NotificationLite notificationLite = NotificationLite.f404825b;
        Lock lock = this.f404899e;
        lock.lock();
        this.f404902h++;
        this.f404900f.lazySet(notificationLite);
        lock.unlock();
        for (a<T> aVar : this.f404897c.getAndSet(f404896k)) {
            aVar.a(this.f404902h, notificationLite);
        }
    }

    @Override // org.reactivestreams.d
    public final void onError(@j41.e Throwable th2) {
        io.reactivex.rxjava3.internal.util.h.c(th2, "onError called with a null Throwable.");
        AtomicReference<Throwable> atomicReference = this.f404901g;
        while (!atomicReference.compareAndSet(null, th2)) {
            if (atomicReference.get() != null) {
                C47998a.b(th2);
                return;
            }
        }
        Object objE = NotificationLite.e(th2);
        Lock lock = this.f404899e;
        lock.lock();
        this.f404902h++;
        this.f404900f.lazySet((Serializable) objE);
        lock.unlock();
        for (a<T> aVar : this.f404897c.getAndSet(f404896k)) {
            aVar.a(this.f404902h, objE);
        }
    }

    @Override // org.reactivestreams.d
    public final void onNext(@j41.e T t12) {
        io.reactivex.rxjava3.internal.util.h.c(t12, "onNext called with a null value.");
        if (this.f404901g.get() != null) {
            return;
        }
        Lock lock = this.f404899e;
        lock.lock();
        this.f404902h++;
        this.f404900f.lazySet(t12);
        lock.unlock();
        for (a<T> aVar : this.f404897c.get()) {
            aVar.a(this.f404902h, t12);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x008c, code lost:
    
        r0.f404906e = false;
     */
    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void u(@j41.e org.reactivestreams.d<? super T> r7) {
        /*
            r6 = this;
            io.reactivex.rxjava3.processors.b$a r0 = new io.reactivex.rxjava3.processors.b$a
            r1 = r7
            io.reactivex.rxjava3.core.o r1 = (io.reactivex.rxjava3.core.InterfaceC41782o) r1
            r0.<init>(r1, r6)
            r7.K(r0)
        Lb:
            java.util.concurrent.atomic.AtomicReference<io.reactivex.rxjava3.processors.b$a<T>[]> r1 = r6.f404897c
            java.lang.Object r2 = r1.get()
            io.reactivex.rxjava3.processors.b$a[] r2 = (io.reactivex.rxjava3.processors.b.a[]) r2
            io.reactivex.rxjava3.processors.b$a[] r3 = io.reactivex.rxjava3.processors.b.f404896k
            if (r2 != r3) goto L2d
            java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> r0 = r6.f404901g
            java.lang.Object r0 = r0.get()
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            java.lang.Throwable r1 = io.reactivex.rxjava3.internal.util.h.f404834a
            if (r0 != r1) goto L28
            r7.e()
            goto L9c
        L28:
            r7.onError(r0)
            goto L9c
        L2d:
            int r3 = r2.length
            int r4 = r3 + 1
            io.reactivex.rxjava3.processors.b$a[] r4 = new io.reactivex.rxjava3.processors.b.a[r4]
            r5 = 0
            java.lang.System.arraycopy(r2, r5, r4, r5, r3)
            r4[r3] = r0
        L38:
            boolean r3 = r1.compareAndSet(r2, r4)
            if (r3 == 0) goto L9f
            boolean r7 = r0.f404909h
            if (r7 == 0) goto L46
            r6.A(r0)
            goto L9c
        L46:
            boolean r7 = r0.f404909h
            if (r7 == 0) goto L4b
            goto L9c
        L4b:
            monitor-enter(r0)
            boolean r7 = r0.f404909h     // Catch: java.lang.Throwable -> L52
            if (r7 == 0) goto L54
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L52
            goto L9c
        L52:
            r7 = move-exception
            goto L9d
        L54:
            boolean r7 = r0.f404905d     // Catch: java.lang.Throwable -> L52
            if (r7 == 0) goto L5a
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L52
            goto L9c
        L5a:
            io.reactivex.rxjava3.processors.b<T> r7 = r0.f404904c     // Catch: java.lang.Throwable -> L52
            java.util.concurrent.locks.Lock r1 = r7.f404898d     // Catch: java.lang.Throwable -> L52
            r1.lock()     // Catch: java.lang.Throwable -> L52
            long r2 = r7.f404902h     // Catch: java.lang.Throwable -> L52
            r0.f404910i = r2     // Catch: java.lang.Throwable -> L52
            java.util.concurrent.atomic.AtomicReference<java.lang.Object> r7 = r7.f404900f     // Catch: java.lang.Throwable -> L52
            java.lang.Object r7 = r7.get()     // Catch: java.lang.Throwable -> L52
            r1.unlock()     // Catch: java.lang.Throwable -> L52
            r1 = 1
            if (r7 == 0) goto L73
            r2 = r1
            goto L74
        L73:
            r2 = r5
        L74:
            r0.f404906e = r2     // Catch: java.lang.Throwable -> L52
            r0.f404905d = r1     // Catch: java.lang.Throwable -> L52
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L52
            if (r7 == 0) goto L9c
            boolean r7 = r0.test(r7)
            if (r7 == 0) goto L82
            goto L9c
        L82:
            boolean r7 = r0.f404909h
            if (r7 == 0) goto L87
            goto L9c
        L87:
            monitor-enter(r0)
            io.reactivex.rxjava3.internal.util.a<java.lang.Object> r7 = r0.f404907f     // Catch: java.lang.Throwable -> L90
            if (r7 != 0) goto L92
            r0.f404906e = r5     // Catch: java.lang.Throwable -> L90
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L90
            goto L9c
        L90:
            r7 = move-exception
            goto L9a
        L92:
            r1 = 0
            r0.f404907f = r1     // Catch: java.lang.Throwable -> L90
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L90
            r7.c(r0)
            goto L82
        L9a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L90
            throw r7
        L9c:
            return
        L9d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L52
            throw r7
        L9f:
            java.lang.Object r3 = r1.get()
            if (r3 == r2) goto L38
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: io.reactivex.rxjava3.processors.b.u(org.reactivestreams.d):void");
    }
}
