package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.H;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.observers.AbstractC41805c;
import q41.InterfaceC47199b;
import s41.C47998a;

/* compiled from: ObservableObserveOn.java */
/* loaded from: classes8.dex */
public final class I0<T> extends AbstractC41932a<T, T> {

    /* renamed from: c, reason: collision with root package name */
    public final io.reactivex.rxjava3.core.H f403655c;

    /* renamed from: d, reason: collision with root package name */
    public final int f403656d;

    /* compiled from: ObservableObserveOn.java */
    public static final class a<T> extends AbstractC41805c<T> implements io.reactivex.rxjava3.core.G<T>, Runnable {
        private static final long serialVersionUID = 6576896619930983584L;

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.G<? super T> f403657b;

        /* renamed from: c, reason: collision with root package name */
        public final H.c f403658c;

        /* renamed from: d, reason: collision with root package name */
        public final int f403659d;

        /* renamed from: e, reason: collision with root package name */
        public q41.g<T> f403660e;

        /* renamed from: f, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f403661f;

        /* renamed from: g, reason: collision with root package name */
        public Throwable f403662g;

        /* renamed from: h, reason: collision with root package name */
        public volatile boolean f403663h;

        /* renamed from: i, reason: collision with root package name */
        public volatile boolean f403664i;

        /* renamed from: j, reason: collision with root package name */
        public int f403665j;

        /* renamed from: k, reason: collision with root package name */
        public boolean f403666k;

        public a(io.reactivex.rxjava3.core.G g12, H.c cVar, int i12) {
            this.f403657b = g12;
            this.f403658c = cVar;
            this.f403659d = i12;
        }

        public final boolean a(boolean z12, boolean z13, io.reactivex.rxjava3.core.G<? super T> g12) {
            if (this.f403664i) {
                this.f403660e.clear();
                return true;
            }
            if (!z12) {
                return false;
            }
            Throwable th2 = this.f403662g;
            if (th2 != null) {
                this.f403664i = true;
                this.f403660e.clear();
                g12.onError(th2);
                this.f403658c.dispose();
                return true;
            }
            if (!z13) {
                return false;
            }
            this.f403664i = true;
            g12.e();
            this.f403658c.dispose();
            return true;
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            if (DisposableHelper.f(this.f403661f, dVar)) {
                this.f403661f = dVar;
                if (dVar instanceof InterfaceC47199b) {
                    InterfaceC47199b interfaceC47199b = (InterfaceC47199b) dVar;
                    int iV2 = interfaceC47199b.v(7);
                    if (iV2 == 1) {
                        this.f403665j = iV2;
                        this.f403660e = interfaceC47199b;
                        this.f403663h = true;
                        this.f403657b.b(this);
                        if (getAndIncrement() == 0) {
                            this.f403658c.b(this);
                            return;
                        }
                        return;
                    }
                    if (iV2 == 2) {
                        this.f403665j = iV2;
                        this.f403660e = interfaceC47199b;
                        this.f403657b.b(this);
                        return;
                    }
                }
                this.f403660e = new q41.i(this.f403659d);
                this.f403657b.b(this);
            }
        }

        @Override // q41.g
        public final void clear() {
            this.f403660e.clear();
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            if (this.f403664i) {
                return;
            }
            this.f403664i = true;
            this.f403661f.dispose();
            this.f403658c.dispose();
            if (this.f403666k || getAndIncrement() != 0) {
                return;
            }
            this.f403660e.clear();
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void e() {
            if (this.f403663h) {
                return;
            }
            this.f403663h = true;
            if (getAndIncrement() == 0) {
                this.f403658c.b(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return this.f403664i;
        }

        @Override // q41.g
        public final boolean isEmpty() {
            return this.f403660e.isEmpty();
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onError(Throwable th2) {
            if (this.f403663h) {
                C47998a.b(th2);
                return;
            }
            this.f403662g = th2;
            this.f403663h = true;
            if (getAndIncrement() == 0) {
                this.f403658c.b(this);
            }
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onNext(T t12) {
            if (this.f403663h) {
                return;
            }
            if (this.f403665j != 2) {
                this.f403660e.offer(t12);
            }
            if (getAndIncrement() == 0) {
                this.f403658c.b(this);
            }
        }

        @Override // q41.g
        @j41.f
        public final T poll() {
            return this.f403660e.poll();
        }

        /* JADX WARN: Code restructure failed: missing block: B:35:0x0071, code lost:
        
            r3 = addAndGet(-r3);
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x0076, code lost:
        
            if (r3 != 0) goto L52;
         */
        /* JADX WARN: Code restructure failed: missing block: B:59:?, code lost:
        
            return;
         */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void run() {
            /*
                r7 = this;
                boolean r0 = r7.f403666k
                r1 = 1
                if (r0 == 0) goto L4b
                r0 = r1
            L6:
                boolean r2 = r7.f403664i
                if (r2 == 0) goto Lc
                goto L93
            Lc:
                boolean r2 = r7.f403663h
                java.lang.Throwable r3 = r7.f403662g
                if (r2 == 0) goto L24
                if (r3 == 0) goto L24
                r7.f403664i = r1
                io.reactivex.rxjava3.core.G<? super T> r0 = r7.f403657b
                java.lang.Throwable r1 = r7.f403662g
                r0.onError(r1)
                io.reactivex.rxjava3.core.H$c r0 = r7.f403658c
                r0.dispose()
                goto L93
            L24:
                io.reactivex.rxjava3.core.G<? super T> r3 = r7.f403657b
                r4 = 0
                r3.onNext(r4)
                if (r2 == 0) goto L43
                r7.f403664i = r1
                java.lang.Throwable r0 = r7.f403662g
                if (r0 == 0) goto L38
                io.reactivex.rxjava3.core.G<? super T> r1 = r7.f403657b
                r1.onError(r0)
                goto L3d
            L38:
                io.reactivex.rxjava3.core.G<? super T> r0 = r7.f403657b
                r0.e()
            L3d:
                io.reactivex.rxjava3.core.H$c r0 = r7.f403658c
                r0.dispose()
                goto L93
            L43:
                int r0 = -r0
                int r0 = r7.addAndGet(r0)
                if (r0 != 0) goto L6
                goto L93
            L4b:
                q41.g<T> r0 = r7.f403660e
                io.reactivex.rxjava3.core.G<? super T> r2 = r7.f403657b
                r3 = r1
            L50:
                boolean r4 = r7.f403663h
                boolean r5 = r0.isEmpty()
                boolean r4 = r7.a(r4, r5, r2)
                if (r4 == 0) goto L5d
                goto L93
            L5d:
                boolean r4 = r7.f403663h
                java.lang.Object r5 = r0.poll()     // Catch: java.lang.Throwable -> L7d
                if (r5 != 0) goto L67
                r6 = r1
                goto L68
            L67:
                r6 = 0
            L68:
                boolean r4 = r7.a(r4, r6, r2)
                if (r4 == 0) goto L6f
                goto L93
            L6f:
                if (r6 == 0) goto L79
                int r3 = -r3
                int r3 = r7.addAndGet(r3)
                if (r3 != 0) goto L50
                goto L93
            L79:
                r2.onNext(r5)
                goto L5d
            L7d:
                r3 = move-exception
                io.reactivex.rxjava3.exceptions.a.a(r3)
                r7.f403664i = r1
                io.reactivex.rxjava3.disposables.d r1 = r7.f403661f
                r1.dispose()
                r0.clear()
                r2.onError(r3)
                io.reactivex.rxjava3.core.H$c r0 = r7.f403658c
                r0.dispose()
            L93:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.rxjava3.internal.operators.observable.I0.a.run():void");
        }

        @Override // q41.InterfaceC47200c
        public final int v(int i12) {
            this.f403666k = true;
            return 2;
        }
    }

    public I0(io.reactivex.rxjava3.core.z zVar, io.reactivex.rxjava3.core.H h12, int i12) {
        super(zVar);
        this.f403655c = h12;
        this.f403656d = i12;
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(io.reactivex.rxjava3.core.G<? super T> g12) {
        io.reactivex.rxjava3.core.H h12 = this.f403655c;
        boolean z12 = h12 instanceof io.reactivex.rxjava3.internal.schedulers.s;
        io.reactivex.rxjava3.core.E<T> e12 = this.f403951b;
        if (z12) {
            e12.c(g12);
        } else {
            e12.c(new a(g12, h12.b(), this.f403656d));
        }
    }
}
