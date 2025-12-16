package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import q41.InterfaceC47199b;
import s41.C47998a;

/* compiled from: ObservableSwitchMap.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.observable.s1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41987s1<T, R> extends AbstractC41932a<T, R> {

    /* renamed from: c, reason: collision with root package name */
    public final l41.o<? super T, ? extends io.reactivex.rxjava3.core.E<? extends R>> f404276c;

    /* renamed from: d, reason: collision with root package name */
    public final int f404277d;

    /* compiled from: ObservableSwitchMap.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.observable.s1$a */
    public static final class a<T, R> extends AtomicReference<io.reactivex.rxjava3.disposables.d> implements io.reactivex.rxjava3.core.G<R> {
        private static final long serialVersionUID = 3837284832786408377L;

        /* renamed from: b, reason: collision with root package name */
        public final b<T, R> f404278b;

        /* renamed from: c, reason: collision with root package name */
        public final long f404279c;

        /* renamed from: d, reason: collision with root package name */
        public final int f404280d;

        /* renamed from: e, reason: collision with root package name */
        public volatile q41.g<R> f404281e;

        /* renamed from: f, reason: collision with root package name */
        public volatile boolean f404282f;

        public a(b<T, R> bVar, long j12, int i12) {
            this.f404278b = bVar;
            this.f404279c = j12;
            this.f404280d = i12;
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            if (DisposableHelper.e(this, dVar)) {
                if (dVar instanceof InterfaceC47199b) {
                    InterfaceC47199b interfaceC47199b = (InterfaceC47199b) dVar;
                    int iV2 = interfaceC47199b.v(7);
                    if (iV2 == 1) {
                        this.f404281e = interfaceC47199b;
                        this.f404282f = true;
                        this.f404278b.a();
                        return;
                    } else if (iV2 == 2) {
                        this.f404281e = interfaceC47199b;
                        return;
                    }
                }
                this.f404281e = new q41.i(this.f404280d);
            }
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void e() {
            if (this.f404279c == this.f404278b.f404292j) {
                this.f404282f = true;
                this.f404278b.a();
            }
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onError(Throwable th2) {
            b<T, R> bVar = this.f404278b;
            bVar.getClass();
            if (this.f404279c == bVar.f404292j) {
                io.reactivex.rxjava3.internal.util.b bVar2 = bVar.f404287e;
                bVar2.getClass();
                if (io.reactivex.rxjava3.internal.util.h.a(bVar2, th2)) {
                    bVar.f404290h.dispose();
                    bVar.f404288f = true;
                    this.f404282f = true;
                    bVar.a();
                    return;
                }
            }
            C47998a.b(th2);
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onNext(R r12) {
            if (this.f404279c == this.f404278b.f404292j) {
                if (r12 != null) {
                    this.f404281e.offer(r12);
                }
                this.f404278b.a();
            }
        }
    }

    /* compiled from: ObservableSwitchMap.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.observable.s1$b */
    public static final class b<T, R> extends AtomicInteger implements io.reactivex.rxjava3.core.G<T>, io.reactivex.rxjava3.disposables.d {

        /* renamed from: k, reason: collision with root package name */
        public static final a<Object, Object> f404283k;
        private static final long serialVersionUID = -3491074160481096299L;

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.G<? super R> f404284b;

        /* renamed from: c, reason: collision with root package name */
        public final l41.o<? super T, ? extends io.reactivex.rxjava3.core.E<? extends R>> f404285c;

        /* renamed from: d, reason: collision with root package name */
        public final int f404286d;

        /* renamed from: f, reason: collision with root package name */
        public volatile boolean f404288f;

        /* renamed from: g, reason: collision with root package name */
        public volatile boolean f404289g;

        /* renamed from: h, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f404290h;

        /* renamed from: j, reason: collision with root package name */
        public volatile long f404292j;

        /* renamed from: i, reason: collision with root package name */
        public final AtomicReference<a<T, R>> f404291i = new AtomicReference<>();

        /* renamed from: e, reason: collision with root package name */
        public final io.reactivex.rxjava3.internal.util.b f404287e = new io.reactivex.rxjava3.internal.util.b();

        static {
            a<Object, Object> aVar = new a<>(null, -1L, 1);
            f404283k = aVar;
            DisposableHelper.a(aVar);
        }

        public b(io.reactivex.rxjava3.core.G g12, l41.o oVar, int i12) {
            this.f404284b = g12;
            this.f404285c = oVar;
            this.f404286d = i12;
        }

        /* JADX WARN: Removed duplicated region for block: B:78:0x00b7 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:81:0x000d A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void a() {
            /*
                r12 = this;
                int r0 = r12.getAndIncrement()
                if (r0 == 0) goto L7
                return
            L7:
                io.reactivex.rxjava3.core.G<? super R> r0 = r12.f404284b
                java.util.concurrent.atomic.AtomicReference<io.reactivex.rxjava3.internal.operators.observable.s1$a<T, R>> r1 = r12.f404291i
                r2 = 1
                r3 = r2
            Ld:
                boolean r4 = r12.f404289g
                if (r4 == 0) goto L12
                return
            L12:
                boolean r4 = r12.f404288f
                r5 = 0
                if (r4 == 0) goto L36
                java.lang.Object r4 = r1.get()
                if (r4 != 0) goto L1f
                r4 = r2
                goto L20
            L1f:
                r4 = r5
            L20:
                io.reactivex.rxjava3.internal.util.b r6 = r12.f404287e
                java.lang.Object r6 = r6.get()
                java.lang.Throwable r6 = (java.lang.Throwable) r6
                if (r6 == 0) goto L30
                io.reactivex.rxjava3.internal.util.b r1 = r12.f404287e
                r1.e(r0)
                return
            L30:
                if (r4 == 0) goto L36
                r0.e()
                return
            L36:
                java.lang.Object r4 = r1.get()
                io.reactivex.rxjava3.internal.operators.observable.s1$a r4 = (io.reactivex.rxjava3.internal.operators.observable.C41987s1.a) r4
                if (r4 == 0) goto Lb7
                q41.g<R> r6 = r4.f404281e
                if (r6 == 0) goto Lb7
                r7 = r5
            L43:
                boolean r8 = r12.f404289g
                if (r8 == 0) goto L48
                return
            L48:
                java.lang.Object r8 = r1.get()
                if (r4 == r8) goto L50
            L4e:
                r7 = r2
                goto Laf
            L50:
                io.reactivex.rxjava3.internal.util.b r8 = r12.f404287e
                java.lang.Object r8 = r8.get()
                java.lang.Throwable r8 = (java.lang.Throwable) r8
                if (r8 == 0) goto L60
                io.reactivex.rxjava3.internal.util.b r1 = r12.f404287e
                r1.e(r0)
                return
            L60:
                boolean r8 = r4.f404282f
                r9 = 0
                java.lang.Object r10 = r6.poll()     // Catch: java.lang.Throwable -> L68
                goto L96
            L68:
                r7 = move-exception
                io.reactivex.rxjava3.exceptions.a.a(r7)
                io.reactivex.rxjava3.internal.util.b r10 = r12.f404287e
                r10.b(r7)
            L71:
                boolean r7 = r1.compareAndSet(r4, r9)
                if (r7 == 0) goto L78
                goto L7e
            L78:
                java.lang.Object r7 = r1.get()
                if (r7 == r4) goto L71
            L7e:
                java.util.concurrent.atomic.AtomicReference<io.reactivex.rxjava3.internal.operators.observable.s1$a<T, R>> r7 = r12.f404291i
                io.reactivex.rxjava3.internal.operators.observable.s1$a<java.lang.Object, java.lang.Object> r10 = io.reactivex.rxjava3.internal.operators.observable.C41987s1.b.f404283k
                java.lang.Object r7 = r7.getAndSet(r10)
                io.reactivex.rxjava3.internal.operators.observable.s1$a r7 = (io.reactivex.rxjava3.internal.operators.observable.C41987s1.a) r7
                if (r7 == 0) goto L8d
                io.reactivex.rxjava3.internal.disposables.DisposableHelper.a(r7)
            L8d:
                io.reactivex.rxjava3.disposables.d r7 = r12.f404290h
                r7.dispose()
                r12.f404288f = r2
                r7 = r2
                r10 = r9
            L96:
                if (r10 != 0) goto L9a
                r11 = r2
                goto L9b
            L9a:
                r11 = r5
            L9b:
                if (r8 == 0) goto Lad
                if (r11 == 0) goto Lad
            L9f:
                boolean r5 = r1.compareAndSet(r4, r9)
                if (r5 == 0) goto La6
                goto Lac
            La6:
                java.lang.Object r5 = r1.get()
                if (r5 == r4) goto L9f
            Lac:
                goto L4e
            Lad:
                if (r11 == 0) goto Lb3
            Laf:
                if (r7 == 0) goto Lb7
                goto Ld
            Lb3:
                r0.onNext(r10)
                goto L43
            Lb7:
                int r3 = -r3
                int r3 = r12.addAndGet(r3)
                if (r3 != 0) goto Ld
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.rxjava3.internal.operators.observable.C41987s1.b.a():void");
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            if (DisposableHelper.f(this.f404290h, dVar)) {
                this.f404290h = dVar;
                this.f404284b.b(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            if (this.f404289g) {
                return;
            }
            this.f404289g = true;
            this.f404290h.dispose();
            a aVar = (a) this.f404291i.getAndSet(f404283k);
            if (aVar != null) {
                DisposableHelper.a(aVar);
            }
            this.f404287e.c();
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void e() {
            if (this.f404288f) {
                return;
            }
            this.f404288f = true;
            a();
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return this.f404289g;
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onError(Throwable th2) {
            if (!this.f404288f) {
                io.reactivex.rxjava3.internal.util.b bVar = this.f404287e;
                bVar.getClass();
                if (io.reactivex.rxjava3.internal.util.h.a(bVar, th2)) {
                    a aVar = (a) this.f404291i.getAndSet(f404283k);
                    if (aVar != null) {
                        DisposableHelper.a(aVar);
                    }
                    this.f404288f = true;
                    a();
                    return;
                }
            }
            C47998a.b(th2);
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onNext(T t12) {
            long j12 = this.f404292j + 1;
            this.f404292j = j12;
            a<T, R> aVar = this.f404291i.get();
            if (aVar != null) {
                DisposableHelper.a(aVar);
            }
            try {
                io.reactivex.rxjava3.core.E<? extends R> eApply = this.f404285c.apply(t12);
                Objects.requireNonNull(eApply, "The ObservableSource returned is null");
                io.reactivex.rxjava3.core.E<? extends R> e12 = eApply;
                a<T, R> aVar2 = new a<>(this, j12, this.f404286d);
                while (true) {
                    a<T, R> aVar3 = this.f404291i.get();
                    if (aVar3 == f404283k) {
                        return;
                    }
                    AtomicReference<a<T, R>> atomicReference = this.f404291i;
                    while (!atomicReference.compareAndSet(aVar3, aVar2)) {
                        if (atomicReference.get() != aVar3) {
                            break;
                        }
                    }
                    e12.c(aVar2);
                    return;
                }
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                this.f404290h.dispose();
                onError(th2);
            }
        }
    }

    public C41987s1(io.reactivex.rxjava3.core.z zVar, l41.o oVar, int i12) {
        super(zVar);
        this.f404276c = oVar;
        this.f404277d = i12;
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(io.reactivex.rxjava3.core.G<? super R> g12) {
        io.reactivex.rxjava3.core.E<T> e12 = this.f403951b;
        l41.o<? super T, ? extends io.reactivex.rxjava3.core.E<? extends R>> oVar = this.f404276c;
        if (C41943d1.b(e12, g12, oVar)) {
            return;
        }
        e12.c(new b(g12, oVar, this.f404277d));
    }
}
