package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.AbstractC41777j;
import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.internal.subscriptions.EmptySubscription;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.Iterator;
import java.util.Objects;
import o41.AbstractC44584d;
import q41.InterfaceC47198a;

/* compiled from: FlowableFromIterable.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.flowable.o0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41873o0<T> extends AbstractC41777j<T> {

    /* renamed from: c, reason: collision with root package name */
    public final Iterable<? extends T> f402920c;

    /* compiled from: FlowableFromIterable.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.flowable.o0$a */
    public static abstract class a<T> extends AbstractC44584d<T> {
        private static final long serialVersionUID = -2252972430506210021L;

        /* renamed from: b, reason: collision with root package name */
        public Iterator<? extends T> f402921b;

        /* renamed from: c, reason: collision with root package name */
        public volatile boolean f402922c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f402923d;

        public a(Iterator<? extends T> it) {
            this.f402921b = it;
        }

        public abstract void a();

        public abstract void b(long j12);

        @Override // org.reactivestreams.e
        public final void cancel() {
            this.f402922c = true;
        }

        @Override // q41.g
        public final void clear() {
            this.f402921b = null;
        }

        @Override // q41.g
        public final boolean isEmpty() {
            Iterator<? extends T> it = this.f402921b;
            if (it == null) {
                return true;
            }
            if (!this.f402923d || it.hasNext()) {
                return false;
            }
            this.f402921b = null;
            return true;
        }

        @Override // q41.g
        @j41.f
        public final T poll() {
            Iterator<? extends T> it = this.f402921b;
            if (it == null) {
                return null;
            }
            if (!this.f402923d) {
                this.f402923d = true;
            } else if (!it.hasNext()) {
                return null;
            }
            T next = this.f402921b.next();
            Objects.requireNonNull(next, "Iterator.next() returned a null value");
            return next;
        }

        @Override // org.reactivestreams.e
        public final void request(long j12) {
            if (SubscriptionHelper.h(j12) && io.reactivex.rxjava3.internal.util.c.a(this, j12) == 0) {
                if (j12 == Long.MAX_VALUE) {
                    a();
                } else {
                    b(j12);
                }
            }
        }

        @Override // q41.InterfaceC47200c
        public final int v(int i12) {
            return i12 & 1;
        }
    }

    /* compiled from: FlowableFromIterable.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.flowable.o0$b */
    public static final class b<T> extends a<T> {
        private static final long serialVersionUID = -6022804456014692607L;

        /* renamed from: e, reason: collision with root package name */
        public final InterfaceC47198a<? super T> f402924e;

        public b(InterfaceC47198a<? super T> interfaceC47198a, Iterator<? extends T> it) {
            super(it);
            this.f402924e = interfaceC47198a;
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.C41873o0.a
        public final void a() {
            Iterator<? extends T> it = this.f402921b;
            InterfaceC47198a<? super T> interfaceC47198a = this.f402924e;
            while (!this.f402922c) {
                try {
                    T next = it.next();
                    if (this.f402922c) {
                        return;
                    }
                    if (next == null) {
                        interfaceC47198a.onError(new NullPointerException("Iterator.next() returned a null value"));
                        return;
                    }
                    interfaceC47198a.P(next);
                    if (this.f402922c) {
                        return;
                    }
                    try {
                        if (!it.hasNext()) {
                            if (this.f402922c) {
                                return;
                            }
                            interfaceC47198a.e();
                            return;
                        }
                    } catch (Throwable th2) {
                        io.reactivex.rxjava3.exceptions.a.a(th2);
                        interfaceC47198a.onError(th2);
                        return;
                    }
                } catch (Throwable th3) {
                    io.reactivex.rxjava3.exceptions.a.a(th3);
                    interfaceC47198a.onError(th3);
                    return;
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:35:0x005b, code lost:
        
            r9 = addAndGet(-r4);
         */
        @Override // io.reactivex.rxjava3.internal.operators.flowable.C41873o0.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void b(long r9) {
            /*
                r8 = this;
                java.util.Iterator<? extends T> r0 = r8.f402921b
                q41.a<? super T> r1 = r8.f402924e
                r2 = 0
            L6:
                r4 = r2
            L7:
                int r6 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
                if (r6 == 0) goto L53
                boolean r6 = r8.f402922c
                if (r6 == 0) goto L10
                return
            L10:
                java.lang.Object r6 = r0.next()     // Catch: java.lang.Throwable -> L4b
                boolean r7 = r8.f402922c
                if (r7 == 0) goto L19
                return
            L19:
                if (r6 != 0) goto L26
                java.lang.NullPointerException r9 = new java.lang.NullPointerException
                java.lang.String r10 = "Iterator.next() returned a null value"
                r9.<init>(r10)
                r1.onError(r9)
                return
            L26:
                boolean r6 = r1.P(r6)
                boolean r7 = r8.f402922c
                if (r7 == 0) goto L2f
                return
            L2f:
                boolean r7 = r0.hasNext()     // Catch: java.lang.Throwable -> L43
                if (r7 != 0) goto L3d
                boolean r9 = r8.f402922c
                if (r9 != 0) goto L3c
                r1.e()
            L3c:
                return
            L3d:
                if (r6 == 0) goto L7
                r6 = 1
                long r4 = r4 + r6
                goto L7
            L43:
                r9 = move-exception
                io.reactivex.rxjava3.exceptions.a.a(r9)
                r1.onError(r9)
                return
            L4b:
                r9 = move-exception
                io.reactivex.rxjava3.exceptions.a.a(r9)
                r1.onError(r9)
                return
            L53:
                long r9 = r8.get()
                int r6 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
                if (r6 != 0) goto L7
                long r9 = -r4
                long r9 = r8.addAndGet(r9)
                int r4 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
                if (r4 != 0) goto L6
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.rxjava3.internal.operators.flowable.C41873o0.b.b(long):void");
        }
    }

    /* compiled from: FlowableFromIterable.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.flowable.o0$c */
    public static final class c<T> extends a<T> {
        private static final long serialVersionUID = -6022804456014692607L;

        /* renamed from: e, reason: collision with root package name */
        public final InterfaceC41782o f402925e;

        public c(InterfaceC41782o interfaceC41782o, Iterator it) {
            super(it);
            this.f402925e = interfaceC41782o;
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.C41873o0.a
        public final void a() {
            Iterator<? extends T> it = this.f402921b;
            InterfaceC41782o interfaceC41782o = this.f402925e;
            while (!this.f402922c) {
                try {
                    T next = it.next();
                    if (this.f402922c) {
                        return;
                    }
                    if (next == null) {
                        interfaceC41782o.onError(new NullPointerException("Iterator.next() returned a null value"));
                        return;
                    }
                    interfaceC41782o.onNext(next);
                    if (this.f402922c) {
                        return;
                    }
                    try {
                        if (!it.hasNext()) {
                            if (this.f402922c) {
                                return;
                            }
                            interfaceC41782o.e();
                            return;
                        }
                    } catch (Throwable th2) {
                        io.reactivex.rxjava3.exceptions.a.a(th2);
                        interfaceC41782o.onError(th2);
                        return;
                    }
                } catch (Throwable th3) {
                    io.reactivex.rxjava3.exceptions.a.a(th3);
                    interfaceC41782o.onError(th3);
                    return;
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:34:0x0058, code lost:
        
            r9 = addAndGet(-r4);
         */
        @Override // io.reactivex.rxjava3.internal.operators.flowable.C41873o0.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void b(long r9) {
            /*
                r8 = this;
                java.util.Iterator<? extends T> r0 = r8.f402921b
                io.reactivex.rxjava3.core.o r1 = r8.f402925e
                r2 = 0
            L6:
                r4 = r2
            L7:
                int r6 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
                if (r6 == 0) goto L50
                boolean r6 = r8.f402922c
                if (r6 == 0) goto L10
                return
            L10:
                java.lang.Object r6 = r0.next()     // Catch: java.lang.Throwable -> L48
                boolean r7 = r8.f402922c
                if (r7 == 0) goto L19
                return
            L19:
                if (r6 != 0) goto L26
                java.lang.NullPointerException r9 = new java.lang.NullPointerException
                java.lang.String r10 = "Iterator.next() returned a null value"
                r9.<init>(r10)
                r1.onError(r9)
                return
            L26:
                r1.onNext(r6)
                boolean r6 = r8.f402922c
                if (r6 == 0) goto L2e
                return
            L2e:
                boolean r6 = r0.hasNext()     // Catch: java.lang.Throwable -> L40
                if (r6 != 0) goto L3c
                boolean r9 = r8.f402922c
                if (r9 != 0) goto L3b
                r1.e()
            L3b:
                return
            L3c:
                r6 = 1
                long r4 = r4 + r6
                goto L7
            L40:
                r9 = move-exception
                io.reactivex.rxjava3.exceptions.a.a(r9)
                r1.onError(r9)
                return
            L48:
                r9 = move-exception
                io.reactivex.rxjava3.exceptions.a.a(r9)
                r1.onError(r9)
                return
            L50:
                long r9 = r8.get()
                int r6 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
                if (r6 != 0) goto L7
                long r9 = -r4
                long r9 = r8.addAndGet(r9)
                int r4 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
                if (r4 != 0) goto L6
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.rxjava3.internal.operators.flowable.C41873o0.c.b(long):void");
        }
    }

    public C41873o0(Iterable<? extends T> iterable) {
        this.f402920c = iterable;
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super T> dVar) {
        try {
            Iterator<? extends T> it = this.f402920c.iterator();
            InterfaceC41782o interfaceC41782o = (InterfaceC41782o) dVar;
            try {
                if (!it.hasNext()) {
                    EmptySubscription.a(interfaceC41782o);
                } else if (interfaceC41782o instanceof InterfaceC47198a) {
                    interfaceC41782o.K(new b((InterfaceC47198a) interfaceC41782o, it));
                } else {
                    interfaceC41782o.K(new c(interfaceC41782o, it));
                }
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                EmptySubscription.b(th2, interfaceC41782o);
            }
        } catch (Throwable th3) {
            io.reactivex.rxjava3.exceptions.a.a(th3);
            EmptySubscription.b(th3, dVar);
        }
    }
}
