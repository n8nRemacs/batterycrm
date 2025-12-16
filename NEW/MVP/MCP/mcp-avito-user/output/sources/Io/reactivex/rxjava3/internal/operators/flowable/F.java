package io.reactivex.rxjava3.internal.operators.flowable;

import android.net.Uri;
import android.os.Handler;
import com.avito.android.photo_cache.c;
import io.reactivex.rxjava3.core.AbstractC41777j;
import io.reactivex.rxjava3.core.BackpressureStrategy;
import io.reactivex.rxjava3.core.InterfaceC41779l;
import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import s41.C47998a;

/* compiled from: FlowableCreate.java */
/* loaded from: classes8.dex */
public final class F<T> extends AbstractC41777j<T> {

    /* renamed from: c, reason: collision with root package name */
    public final FX0.b f402318c;

    /* renamed from: d, reason: collision with root package name */
    public final BackpressureStrategy f402319d;

    /* compiled from: FlowableCreate.java */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f402320a;

        static {
            int[] iArr = new int[BackpressureStrategy.values().length];
            f402320a = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f402320a[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f402320a[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f402320a[4] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: FlowableCreate.java */
    public static final class c<T> extends b<T> {
        private static final long serialVersionUID = 2427151001689639875L;

        /* renamed from: d, reason: collision with root package name */
        public final q41.i<T> f402323d;

        /* renamed from: e, reason: collision with root package name */
        public Throwable f402324e;

        /* renamed from: f, reason: collision with root package name */
        public volatile boolean f402325f;

        /* renamed from: g, reason: collision with root package name */
        public final AtomicInteger f402326g;

        public c(InterfaceC41782o interfaceC41782o, int i12) {
            super(interfaceC41782o);
            this.f402323d = new q41.i<>(i12);
            this.f402326g = new AtomicInteger();
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.F.b
        public final void d() {
            l();
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.F.b, io.reactivex.rxjava3.core.InterfaceC41776i
        public final void e() {
            this.f402325f = true;
            l();
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.F.b
        public final void h() {
            if (this.f402326g.getAndIncrement() == 0) {
                this.f402323d.clear();
            }
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.F.b
        public final boolean k(Throwable th2) {
            if (this.f402325f || this.f402322c.getF318621e()) {
                return false;
            }
            this.f402324e = th2;
            this.f402325f = true;
            l();
            return true;
        }

        public final void l() {
            if (this.f402326g.getAndIncrement() != 0) {
                return;
            }
            InterfaceC41782o interfaceC41782o = this.f402321b;
            q41.i<T> iVar = this.f402323d;
            int iAddAndGet = 1;
            do {
                long j12 = get();
                long j13 = 0;
                while (j13 != j12) {
                    if (this.f402322c.getF318621e()) {
                        iVar.clear();
                        return;
                    }
                    boolean z12 = this.f402325f;
                    T tPoll = iVar.poll();
                    boolean z13 = tPoll == null;
                    if (z12 && z13) {
                        Throwable th2 = this.f402324e;
                        if (th2 != null) {
                            c(th2);
                            return;
                        } else {
                            b();
                            return;
                        }
                    }
                    if (z13) {
                        break;
                    }
                    interfaceC41782o.onNext(tPoll);
                    j13++;
                }
                if (j13 == j12) {
                    if (this.f402322c.getF318621e()) {
                        iVar.clear();
                        return;
                    }
                    boolean z14 = this.f402325f;
                    boolean zIsEmpty = iVar.isEmpty();
                    if (z14 && zIsEmpty) {
                        Throwable th3 = this.f402324e;
                        if (th3 != null) {
                            c(th3);
                            return;
                        } else {
                            b();
                            return;
                        }
                    }
                }
                if (j13 != 0) {
                    io.reactivex.rxjava3.internal.util.c.e(this, j13);
                }
                iAddAndGet = this.f402326g.addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // io.reactivex.rxjava3.core.InterfaceC41776i
        public final void onNext(T t12) {
            if (this.f402325f || this.f402322c.getF318621e()) {
                return;
            }
            if (t12 == null) {
                onError(io.reactivex.rxjava3.internal.util.h.b("onNext called with a null value."));
            } else {
                this.f402323d.offer(t12);
                l();
            }
        }
    }

    /* compiled from: FlowableCreate.java */
    public static final class e<T> extends h<T> {
        private static final long serialVersionUID = 338953216916120960L;

        public e() {
            throw null;
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.F.h
        public final void l() {
            onError(new MissingBackpressureException("create: could not emit value due to lack of requests"));
        }
    }

    /* compiled from: FlowableCreate.java */
    public static final class f<T> extends b<T> {
        private static final long serialVersionUID = 4023437720691792495L;

        /* renamed from: d, reason: collision with root package name */
        public final AtomicReference<T> f402327d;

        /* renamed from: e, reason: collision with root package name */
        public Throwable f402328e;

        /* renamed from: f, reason: collision with root package name */
        public volatile boolean f402329f;

        /* renamed from: g, reason: collision with root package name */
        public final AtomicInteger f402330g;

        public f(InterfaceC41782o interfaceC41782o) {
            super(interfaceC41782o);
            this.f402327d = new AtomicReference<>();
            this.f402330g = new AtomicInteger();
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.F.b
        public final void d() {
            l();
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.F.b, io.reactivex.rxjava3.core.InterfaceC41776i
        public final void e() {
            this.f402329f = true;
            l();
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.F.b
        public final void h() {
            if (this.f402330g.getAndIncrement() == 0) {
                this.f402327d.lazySet(null);
            }
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.F.b
        public final boolean k(Throwable th2) {
            if (this.f402329f || this.f402322c.getF318621e()) {
                return false;
            }
            this.f402328e = th2;
            this.f402329f = true;
            l();
            return true;
        }

        /* JADX WARN: Code restructure failed: missing block: B:27:0x0051, code lost:
        
            if (r9 != r5) goto L42;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0059, code lost:
        
            if (r17.f402322c.getF318621e() == false) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x005b, code lost:
        
            r2.lazySet(null);
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x005e, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x005f, code lost:
        
            r5 = r17.f402329f;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x0065, code lost:
        
            if (r2.get() != null) goto L35;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x0067, code lost:
        
            r12 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x0068, code lost:
        
            if (r5 == false) goto L42;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x006a, code lost:
        
            if (r12 == false) goto L42;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x006c, code lost:
        
            r1 = r17.f402328e;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x006e, code lost:
        
            if (r1 == null) goto L40;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x0070, code lost:
        
            c(r1);
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x0074, code lost:
        
            b();
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x0077, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x007a, code lost:
        
            if (r9 == 0) goto L45;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x007c, code lost:
        
            io.reactivex.rxjava3.internal.util.c.e(r17, r9);
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x007f, code lost:
        
            r4 = r17.f402330g.addAndGet(-r4);
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:?, code lost:
        
            return;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void l() {
            /*
                r17 = this;
                r0 = r17
                java.util.concurrent.atomic.AtomicInteger r1 = r0.f402330g
                int r1 = r1.getAndIncrement()
                if (r1 == 0) goto Lb
                return
            Lb:
                io.reactivex.rxjava3.core.o r1 = r0.f402321b
                java.util.concurrent.atomic.AtomicReference<T> r2 = r0.f402327d
                r3 = 1
                r4 = r3
            L11:
                long r5 = r17.get()
                r7 = 0
                r9 = r7
            L18:
                int r11 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
                r12 = 0
                r13 = 0
                if (r11 == 0) goto L51
                m41.d r14 = r0.f402322c
                boolean r14 = r14.getF318621e()
                if (r14 == 0) goto L2a
                r2.lazySet(r13)
                return
            L2a:
                boolean r14 = r0.f402329f
                java.lang.Object r15 = r2.getAndSet(r13)
                if (r15 != 0) goto L35
                r16 = r3
                goto L37
            L35:
                r16 = r12
            L37:
                if (r14 == 0) goto L47
                if (r16 == 0) goto L47
                java.lang.Throwable r1 = r0.f402328e
                if (r1 == 0) goto L43
                r0.c(r1)
                goto L46
            L43:
                r17.b()
            L46:
                return
            L47:
                if (r16 == 0) goto L4a
                goto L51
            L4a:
                r1.onNext(r15)
                r11 = 1
                long r9 = r9 + r11
                goto L18
            L51:
                if (r11 != 0) goto L78
                m41.d r5 = r0.f402322c
                boolean r5 = r5.getF318621e()
                if (r5 == 0) goto L5f
                r2.lazySet(r13)
                return
            L5f:
                boolean r5 = r0.f402329f
                java.lang.Object r6 = r2.get()
                if (r6 != 0) goto L68
                r12 = r3
            L68:
                if (r5 == 0) goto L78
                if (r12 == 0) goto L78
                java.lang.Throwable r1 = r0.f402328e
                if (r1 == 0) goto L74
                r0.c(r1)
                goto L77
            L74:
                r17.b()
            L77:
                return
            L78:
                int r5 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
                if (r5 == 0) goto L7f
                io.reactivex.rxjava3.internal.util.c.e(r0, r9)
            L7f:
                java.util.concurrent.atomic.AtomicInteger r5 = r0.f402330g
                int r4 = -r4
                int r4 = r5.addAndGet(r4)
                if (r4 != 0) goto L11
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.rxjava3.internal.operators.flowable.F.f.l():void");
        }

        @Override // io.reactivex.rxjava3.core.InterfaceC41776i
        public final void onNext(T t12) {
            if (this.f402329f || this.f402322c.getF318621e()) {
                return;
            }
            if (t12 == null) {
                onError(io.reactivex.rxjava3.internal.util.h.b("onNext called with a null value."));
            } else {
                this.f402327d.set(t12);
                l();
            }
        }
    }

    /* compiled from: FlowableCreate.java */
    public static final class g<T> extends b<T> {
        private static final long serialVersionUID = 3776720187248809713L;

        public g() {
            throw null;
        }

        @Override // io.reactivex.rxjava3.core.InterfaceC41776i
        public final void onNext(T t12) {
            long j12;
            if (this.f402322c.getF318621e()) {
                return;
            }
            if (t12 == null) {
                onError(io.reactivex.rxjava3.internal.util.h.b("onNext called with a null value."));
                return;
            }
            this.f402321b.onNext(t12);
            do {
                j12 = get();
                if (j12 == 0) {
                    return;
                }
            } while (!compareAndSet(j12, j12 - 1));
        }
    }

    /* compiled from: FlowableCreate.java */
    public static abstract class h<T> extends b<T> {
        private static final long serialVersionUID = 4127754106204442833L;

        public h() {
            throw null;
        }

        public abstract void l();

        @Override // io.reactivex.rxjava3.core.InterfaceC41776i
        public final void onNext(T t12) {
            if (this.f402322c.getF318621e()) {
                return;
            }
            if (t12 == null) {
                onError(io.reactivex.rxjava3.internal.util.h.b("onNext called with a null value."));
            } else if (get() == 0) {
                l();
            } else {
                this.f402321b.onNext(t12);
                io.reactivex.rxjava3.internal.util.c.e(this, 1L);
            }
        }
    }

    /* compiled from: FlowableCreate.java */
    public static final class i<T> extends AtomicInteger implements InterfaceC41779l<T> {
        private static final long serialVersionUID = 4883307006032401862L;

        @Override // io.reactivex.rxjava3.core.InterfaceC41776i
        public final void e() {
            throw null;
        }

        @Override // io.reactivex.rxjava3.core.InterfaceC41776i
        public final void onError(Throwable th2) {
            throw null;
        }

        @Override // io.reactivex.rxjava3.core.InterfaceC41776i
        public final void onNext(T t12) {
            throw null;
        }

        @Override // java.util.concurrent.atomic.AtomicInteger
        public final String toString() {
            throw null;
        }
    }

    public F(FX0.b bVar) {
        BackpressureStrategy backpressureStrategy = BackpressureStrategy.f401955d;
        this.f402318c = bVar;
        this.f402319d = backpressureStrategy;
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super T> dVar) {
        b gVar;
        int iOrdinal = this.f402319d.ordinal();
        if (iOrdinal == 0) {
            gVar = new g((InterfaceC41782o) dVar);
        } else if (iOrdinal == 1) {
            gVar = new e((InterfaceC41782o) dVar);
        } else if (iOrdinal == 3) {
            gVar = new d((InterfaceC41782o) dVar);
        } else if (iOrdinal != 4) {
            gVar = new c((InterfaceC41782o) dVar, AbstractC41777j.f401972b);
        } else {
            gVar = new f((InterfaceC41782o) dVar);
        }
        dVar.K(gVar);
        try {
            FX0.b bVar = this.f402318c;
            com.avito.android.photo_cache.c cVar = (com.avito.android.photo_cache.c) bVar.f4734c;
            Handler handler = cVar.f216315d;
            c.C6488c c6488c = (c.C6488c) bVar.f4736e;
            com.avito.android.photo_cache.e eVar = new com.avito.android.photo_cache.e(gVar, c6488c, handler);
            cVar.f216313b.registerContentObserver((Uri) bVar.f4735d, true, eVar);
            io.reactivex.rxjava3.disposables.d dVarQ = io.reactivex.rxjava3.disposables.d.Q(new GL.a(17, cVar, eVar));
            m41.d dVar2 = gVar.f402322c;
            dVar2.getClass();
            DisposableHelper.d(dVar2, dVarQ);
            gVar.onNext(c6488c);
        } catch (Throwable th2) {
            io.reactivex.rxjava3.exceptions.a.a(th2);
            gVar.onError(th2);
        }
    }

    /* compiled from: FlowableCreate.java */
    public static abstract class b<T> extends AtomicLong implements InterfaceC41779l<T>, org.reactivestreams.e {
        private static final long serialVersionUID = 7326289992464377023L;

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC41782o f402321b;

        /* renamed from: c, reason: collision with root package name */
        public final m41.d f402322c = new m41.d();

        public b(InterfaceC41782o interfaceC41782o) {
            this.f402321b = interfaceC41782o;
        }

        public final void b() {
            m41.d dVar = this.f402322c;
            if (dVar.getF318621e()) {
                return;
            }
            try {
                this.f402321b.e();
            } finally {
                DisposableHelper.a(dVar);
            }
        }

        public final boolean c(Throwable th2) {
            m41.d dVar = this.f402322c;
            if (dVar.getF318621e()) {
                return false;
            }
            try {
                this.f402321b.onError(th2);
                DisposableHelper.a(dVar);
                return true;
            } catch (Throwable th3) {
                DisposableHelper.a(dVar);
                throw th3;
            }
        }

        @Override // org.reactivestreams.e
        public final void cancel() {
            m41.d dVar = this.f402322c;
            dVar.getClass();
            DisposableHelper.a(dVar);
            h();
        }

        @Override // io.reactivex.rxjava3.core.InterfaceC41776i
        public void e() {
            b();
        }

        public boolean k(Throwable th2) {
            return c(th2);
        }

        @Override // io.reactivex.rxjava3.core.InterfaceC41776i
        public final void onError(Throwable th2) {
            if (k(th2)) {
                return;
            }
            C47998a.b(th2);
        }

        @Override // org.reactivestreams.e
        public final void request(long j12) {
            if (SubscriptionHelper.h(j12)) {
                io.reactivex.rxjava3.internal.util.c.a(this, j12);
                d();
            }
        }

        @Override // java.util.concurrent.atomic.AtomicLong
        public final String toString() {
            return androidx.media3.exoplayer.analytics.m.l(getClass().getSimpleName(), "{", super.toString(), "}");
        }

        public void d() {
        }

        public void h() {
        }
    }

    /* compiled from: FlowableCreate.java */
    public static final class d<T> extends h<T> {
        private static final long serialVersionUID = 8360058422307496563L;

        public d() {
            throw null;
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.F.h
        public final void l() {
        }
    }
}
