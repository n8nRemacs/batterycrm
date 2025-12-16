package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ts0;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;
import kotlin.C42833p;
import okio.C44800j;

/* loaded from: classes8.dex */
public final class bx0 implements th {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final bq0 f384097a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final ry0 f384098b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f384099c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    private final gx0 f384100d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    private final zs f384101e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    private final c f384102f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    private final AtomicBoolean f384103g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    private Object f384104h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    private ft f384105i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    private cx0 f384106j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f384107k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    private dt f384108l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f384109m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f384110n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f384111o;

    /* renamed from: p, reason: collision with root package name */
    private volatile boolean f384112p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.l
    private volatile dt f384113q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.l
    private volatile cx0 f384114r;

    public final class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        private final bi f384115b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        private volatile AtomicInteger f384116c = new AtomicInteger(0);

        public a(bi biVar) {
            this.f384115b = biVar;
        }

        public final void a(@Y61.k a aVar) {
            this.f384116c = aVar.f384116c;
        }

        @Y61.k
        public final AtomicInteger b() {
            return this.f384116c;
        }

        @Y61.k
        public final String c() {
            return bx0.this.h().h().g();
        }

        @Override // java.lang.Runnable
        public final void run() {
            bq0 bq0VarC;
            StringBuilder sbA = Cif.a("OkHttp ");
            sbA.append(bx0.this.k());
            String string = sbA.toString();
            bx0 bx0Var = bx0.this;
            Thread threadCurrentThread = Thread.currentThread();
            String name = threadCurrentThread.getName();
            threadCurrentThread.setName(string);
            try {
                bx0Var.f384102f.enter();
                boolean z12 = false;
                try {
                    try {
                    } catch (Throwable th2) {
                        bx0Var.c().i().b(this);
                        throw th2;
                    }
                } catch (IOException e12) {
                    e = e12;
                } catch (Throwable th3) {
                    th = th3;
                }
                try {
                    this.f384115b.a(bx0Var.i());
                    bq0VarC = bx0Var.c();
                } catch (IOException e13) {
                    e = e13;
                    z12 = true;
                    if (z12) {
                        int i12 = ts0.f390303c;
                        ts0 ts0VarB = ts0.a.b();
                        String str = "Callback failure for " + bx0.b(bx0Var);
                        ts0VarB.getClass();
                        ts0.a(4, str, e);
                    } else {
                        this.f384115b.a(e);
                    }
                    bq0VarC = bx0Var.c();
                    bq0VarC.i().b(this);
                } catch (Throwable th4) {
                    th = th4;
                    z12 = true;
                    bx0Var.a();
                    if (!z12) {
                        IOException iOException = new IOException("canceled due to " + th);
                        C42833p.a(iOException, th);
                        this.f384115b.a(iOException);
                    }
                    throw th;
                }
                bq0VarC.i().b(this);
            } finally {
                threadCurrentThread.setName(name);
            }
        }

        @Y61.k
        public final bx0 a() {
            return bx0.this;
        }

        public final void a(@Y61.k ThreadPoolExecutor threadPoolExecutor) {
            gq gqVarI = bx0.this.c().i();
            if (qc1.f389148f && Thread.holdsLock(gqVarI)) {
                StringBuilder sbA = Cif.a("Thread ");
                sbA.append(Thread.currentThread().getName());
                sbA.append(" MUST NOT hold lock on ");
                sbA.append(gqVarI);
                throw new AssertionError(sbA.toString());
            }
            try {
                try {
                    threadPoolExecutor.execute(this);
                } catch (RejectedExecutionException e12) {
                    InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                    interruptedIOException.initCause(e12);
                    bx0.this.b(interruptedIOException);
                    this.f384115b.a(interruptedIOException);
                    bx0.this.c().i().b(this);
                }
            } catch (Throwable th2) {
                bx0.this.c().i().b(this);
                throw th2;
            }
        }
    }

    public static final class b extends WeakReference<bx0> {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        private final Object f384118a;

        public b(@Y61.k bx0 bx0Var, @Y61.l Object obj) {
            super(bx0Var);
            this.f384118a = obj;
        }

        @Y61.l
        public final Object a() {
            return this.f384118a;
        }
    }

    public static final class c extends C44800j {
        public c() {
        }

        @Override // okio.C44800j
        public final void timedOut() {
            bx0.this.a();
        }
    }

    public bx0(@Y61.k bq0 bq0Var, @Y61.k ry0 ry0Var, boolean z12) {
        this.f384097a = bq0Var;
        this.f384098b = ry0Var;
        this.f384099c = z12;
        this.f384100d = bq0Var.f().a();
        this.f384101e = bq0Var.k().a(this);
        c cVar = new c();
        cVar.timeout(0, TimeUnit.MILLISECONDS);
        this.f384102f = cVar;
        this.f384103g = new AtomicBoolean();
        this.f384111o = true;
    }

    public final void b(@Y61.l cx0 cx0Var) {
        this.f384114r = cx0Var;
    }

    @Y61.k
    public final bq0 c() {
        return this.f384097a;
    }

    public final Object clone() {
        return new bx0(this.f384097a, this.f384098b, this.f384099c);
    }

    @Y61.l
    public final cx0 d() {
        return this.f384106j;
    }

    @Y61.k
    public final zs e() {
        return this.f384101e;
    }

    public final boolean f() {
        return this.f384099c;
    }

    @Y61.l
    public final dt g() {
        return this.f384108l;
    }

    @Y61.k
    public final ry0 h() {
        return this.f384098b;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0096  */
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.yandex.mobile.ads.impl.iz0 i() throws java.lang.Throwable {
        /*
            r11 = this;
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            com.yandex.mobile.ads.impl.bq0 r0 = r11.f384097a
            java.util.List r0 = r0.p()
            kotlin.collections.C42745f0.h(r0, r2)
            com.yandex.mobile.ads.impl.wz0 r0 = new com.yandex.mobile.ads.impl.wz0
            com.yandex.mobile.ads.impl.bq0 r1 = r11.f384097a
            r0.<init>(r1)
            r2.add(r0)
            com.yandex.mobile.ads.impl.lg r0 = new com.yandex.mobile.ads.impl.lg
            com.yandex.mobile.ads.impl.bq0 r1 = r11.f384097a
            com.yandex.mobile.ads.impl.em r1 = r1.h()
            r0.<init>(r1)
            r2.add(r0)
            com.yandex.mobile.ads.impl.jh r0 = new com.yandex.mobile.ads.impl.jh
            com.yandex.mobile.ads.impl.bq0 r1 = r11.f384097a
            r1.getClass()
            r0.<init>()
            r2.add(r0)
            com.yandex.mobile.ads.impl.fl r0 = com.yandex.mobile.ads.impl.fl.f385407a
            r2.add(r0)
            boolean r0 = r11.f384099c
            if (r0 != 0) goto L45
            com.yandex.mobile.ads.impl.bq0 r0 = r11.f384097a
            java.util.List r0 = r0.q()
            kotlin.collections.C42745f0.h(r0, r2)
        L45:
            com.yandex.mobile.ads.impl.uh r0 = new com.yandex.mobile.ads.impl.uh
            boolean r1 = r11.f384099c
            r0.<init>(r1)
            r2.add(r0)
            com.yandex.mobile.ads.impl.hx0 r9 = new com.yandex.mobile.ads.impl.hx0
            com.yandex.mobile.ads.impl.ry0 r5 = r11.f384098b
            com.yandex.mobile.ads.impl.bq0 r0 = r11.f384097a
            int r6 = r0.e()
            com.yandex.mobile.ads.impl.bq0 r0 = r11.f384097a
            int r7 = r0.u()
            com.yandex.mobile.ads.impl.bq0 r0 = r11.f384097a
            int r8 = r0.z()
            r3 = 0
            r4 = 0
            r0 = r9
            r1 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r0 = 0
            r1 = 0
            com.yandex.mobile.ads.impl.ry0 r2 = r11.f384098b     // Catch: java.lang.Throwable -> L87 java.io.IOException -> L89
            com.yandex.mobile.ads.impl.iz0 r2 = r9.a(r2)     // Catch: java.lang.Throwable -> L87 java.io.IOException -> L89
            boolean r3 = r11.f384112p     // Catch: java.lang.Throwable -> L87 java.io.IOException -> L89
            if (r3 != 0) goto L7c
            r11.b(r0)
            return r2
        L7c:
            com.yandex.mobile.ads.impl.qc1.a(r2)     // Catch: java.lang.Throwable -> L87 java.io.IOException -> L89
            java.io.IOException r2 = new java.io.IOException     // Catch: java.lang.Throwable -> L87 java.io.IOException -> L89
            java.lang.String r3 = "Canceled"
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L87 java.io.IOException -> L89
            throw r2     // Catch: java.lang.Throwable -> L87 java.io.IOException -> L89
        L87:
            r2 = move-exception
            goto L94
        L89:
            r1 = move-exception
            r2 = 1
            java.io.IOException r1 = r11.b(r1)     // Catch: java.lang.Throwable -> L90
            throw r1     // Catch: java.lang.Throwable -> L90
        L90:
            r1 = move-exception
            r10 = r2
            r2 = r1
            r1 = r10
        L94:
            if (r1 != 0) goto L99
            r11.b(r0)
        L99:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.bx0.i():com.yandex.mobile.ads.impl.iz0");
    }

    public final boolean j() {
        return this.f384112p;
    }

    @Y61.k
    public final String k() {
        return this.f384098b.h().k();
    }

    @Y61.l
    public final Socket l() {
        cx0 cx0Var = this.f384106j;
        if (qc1.f389148f && !Thread.holdsLock(cx0Var)) {
            StringBuilder sbA = Cif.a("Thread ");
            sbA.append(Thread.currentThread().getName());
            sbA.append(" MUST hold lock on ");
            sbA.append(cx0Var);
            throw new AssertionError(sbA.toString());
        }
        ArrayList arrayListB = cx0Var.b();
        Iterator it = arrayListB.iterator();
        int i12 = 0;
        while (true) {
            if (!it.hasNext()) {
                i12 = -1;
                break;
            }
            if (kotlin.jvm.internal.L.f(((Reference) it.next()).get(), this)) {
                break;
            }
            i12++;
        }
        if (i12 == -1) {
            throw new IllegalStateException("Check failed.");
        }
        arrayListB.remove(i12);
        this.f384106j = null;
        if (arrayListB.isEmpty()) {
            cx0Var.a(System.nanoTime());
            if (this.f384100d.a(cx0Var)) {
                return cx0Var.m();
            }
        }
        return null;
    }

    public final boolean m() {
        return this.f384105i.b();
    }

    public final void n() {
        if (this.f384107k) {
            throw new IllegalStateException("Check failed.");
        }
        this.f384107k = true;
        this.f384102f.exit();
    }

    public final void a() {
        if (this.f384112p) {
            return;
        }
        this.f384112p = true;
        dt dtVar = this.f384113q;
        if (dtVar != null) {
            dtVar.a();
        }
        cx0 cx0Var = this.f384114r;
        if (cx0Var != null) {
            cx0Var.a();
        }
        this.f384101e.getClass();
        zs.c((th) this);
    }

    @Y61.k
    public final iz0 b() {
        if (!this.f384103g.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        this.f384102f.enter();
        this.f384104h = ts0.f390301a.b();
        this.f384101e.getClass();
        zs.b((th) this);
        try {
            this.f384097a.i().a(this);
            return i();
        } finally {
            this.f384097a.i().b(this);
        }
    }

    public final void a(@Y61.k bi biVar) {
        if (this.f384103g.compareAndSet(false, true)) {
            this.f384104h = ts0.f390301a.b();
            this.f384101e.getClass();
            zs.b((th) this);
            this.f384097a.i().a(new a(biVar));
            return;
        }
        throw new IllegalStateException("Already Executed");
    }

    @Y61.l
    public final IOException b(@Y61.l IOException iOException) {
        boolean z12;
        synchronized (this) {
            try {
                z12 = false;
                if (this.f384111o) {
                    this.f384111o = false;
                    if (!this.f384109m && !this.f384110n) {
                        z12 = true;
                    }
                }
                kotlin.G0 g02 = kotlin.G0.f406611a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z12 ? a((bx0) iOException) : iOException;
    }

    public final void a(@Y61.k ry0 ry0Var, boolean z12) {
        SSLSocketFactory sSLSocketFactoryX;
        aq0 aq0VarO;
        ki kiVarD;
        if (this.f384108l == null) {
            synchronized (this) {
                if (!this.f384110n) {
                    if (!this.f384109m) {
                        kotlin.G0 g02 = kotlin.G0.f406611a;
                    } else {
                        throw new IllegalStateException("Check failed.");
                    }
                } else {
                    throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()");
                }
            }
            if (z12) {
                gx0 gx0Var = this.f384100d;
                s10 s10VarH = ry0Var.h();
                if (s10VarH.h()) {
                    sSLSocketFactoryX = this.f384097a.x();
                    aq0VarO = this.f384097a.o();
                    kiVarD = this.f384097a.d();
                } else {
                    sSLSocketFactoryX = null;
                    aq0VarO = null;
                    kiVarD = null;
                }
                String strG = s10VarH.g();
                int i12 = s10VarH.i();
                lr lrVarJ = this.f384097a.j();
                SocketFactory socketFactoryW = this.f384097a.w();
                wc wcVarS = this.f384097a.s();
                this.f384097a.getClass();
                this.f384105i = new ft(gx0Var, new r7(strG, i12, lrVarJ, socketFactoryW, sSLSocketFactoryX, aq0VarO, kiVarD, wcVarS, this.f384097a.r(), this.f384097a.g(), this.f384097a.t()), this, this.f384101e);
                return;
            }
            return;
        }
        throw new IllegalStateException("Check failed.");
    }

    public static final String b(bx0 bx0Var) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(bx0Var.f384112p ? "canceled " : "");
        sb2.append(bx0Var.f384099c ? "web socket" : "call");
        sb2.append(" to ");
        sb2.append(bx0Var.k());
        return sb2.toString();
    }

    @Y61.k
    public final dt a(@Y61.k hx0 hx0Var) throws IOException {
        synchronized (this) {
            if (this.f384111o) {
                if (!this.f384110n) {
                    if (!this.f384109m) {
                        kotlin.G0 g02 = kotlin.G0.f406611a;
                    } else {
                        throw new IllegalStateException("Check failed.");
                    }
                } else {
                    throw new IllegalStateException("Check failed.");
                }
            } else {
                throw new IllegalStateException("released");
            }
        }
        ft ftVar = this.f384105i;
        dt dtVar = new dt(this, this.f384101e, ftVar, ftVar.a(this.f384097a, hx0Var));
        this.f384108l = dtVar;
        this.f384113q = dtVar;
        synchronized (this) {
            this.f384109m = true;
            this.f384110n = true;
        }
        if (this.f384112p) {
            throw new IOException("Canceled");
        }
        return dtVar;
    }

    public final <E extends IOException> E a(@Y61.k dt dtVar, boolean z12, boolean z13, E e12) {
        boolean z14;
        boolean z15;
        if (!dtVar.equals(this.f384113q)) {
            return e12;
        }
        synchronized (this) {
            z14 = false;
            if (z12) {
                try {
                    if (!this.f384109m) {
                        if (z13 || !this.f384110n) {
                            z15 = false;
                        }
                    }
                    if (z12) {
                        this.f384109m = false;
                    }
                    if (z13) {
                        this.f384110n = false;
                    }
                    boolean z16 = this.f384109m;
                    boolean z17 = (z16 || this.f384110n) ? false : true;
                    if (!z16 && !this.f384110n && !this.f384111o) {
                        z14 = true;
                    }
                    z15 = z14;
                    z14 = z17;
                } catch (Throwable th2) {
                    throw th2;
                }
            } else {
                if (z13) {
                }
                z15 = false;
            }
            kotlin.G0 g02 = kotlin.G0.f406611a;
        }
        if (z14) {
            this.f384113q = null;
            cx0 cx0Var = this.f384106j;
            if (cx0Var != null) {
                cx0Var.g();
            }
        }
        return z15 ? (E) a((bx0) e12) : e12;
    }

    public final void a(boolean z12) {
        dt dtVar;
        synchronized (this) {
            if (this.f384111o) {
                kotlin.G0 g02 = kotlin.G0.f406611a;
            } else {
                throw new IllegalStateException("released");
            }
        }
        if (z12 && (dtVar = this.f384113q) != null) {
            dtVar.b();
        }
        this.f384108l = null;
    }

    public final void a(@Y61.k cx0 cx0Var) {
        if (qc1.f389148f && !Thread.holdsLock(cx0Var)) {
            StringBuilder sbA = Cif.a("Thread ");
            sbA.append(Thread.currentThread().getName());
            sbA.append(" MUST hold lock on ");
            sbA.append(cx0Var);
            throw new AssertionError(sbA.toString());
        }
        if (this.f384106j == null) {
            this.f384106j = cx0Var;
            cx0Var.b().add(new b(this, this.f384104h));
            return;
        }
        throw new IllegalStateException("Check failed.");
    }

    private final <E extends IOException> E a(E e12) throws IOException {
        E interruptedIOException;
        Socket socketL;
        boolean z12 = qc1.f389148f;
        if (z12 && Thread.holdsLock(this)) {
            StringBuilder sbA = Cif.a("Thread ");
            sbA.append(Thread.currentThread().getName());
            sbA.append(" MUST NOT hold lock on ");
            sbA.append(this);
            throw new AssertionError(sbA.toString());
        }
        cx0 cx0Var = this.f384106j;
        if (cx0Var != null) {
            if (z12 && Thread.holdsLock(cx0Var)) {
                StringBuilder sbA2 = Cif.a("Thread ");
                sbA2.append(Thread.currentThread().getName());
                sbA2.append(" MUST NOT hold lock on ");
                sbA2.append(cx0Var);
                throw new AssertionError(sbA2.toString());
            }
            synchronized (cx0Var) {
                socketL = l();
            }
            if (this.f384106j == null) {
                if (socketL != null) {
                    qc1.a(socketL);
                }
                this.f384101e.getClass();
                zs.a((th) this, cx0Var);
            } else if (socketL != null) {
                throw new IllegalStateException("Check failed.");
            }
        }
        if (!this.f384107k && this.f384102f.exit()) {
            interruptedIOException = new InterruptedIOException("timeout");
            if (e12 != null) {
                interruptedIOException.initCause(e12);
            }
        } else {
            interruptedIOException = e12;
        }
        if (e12 != null) {
            this.f384101e.getClass();
            zs.a((th) this, (IOException) interruptedIOException);
        } else {
            this.f384101e.getClass();
            zs.a((th) this);
        }
        return interruptedIOException;
    }
}
