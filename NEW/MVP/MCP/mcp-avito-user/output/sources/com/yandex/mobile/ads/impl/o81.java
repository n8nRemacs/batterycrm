package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

/* loaded from: classes8.dex */
public final class o81 {

    /* renamed from: h, reason: collision with root package name */
    @X41.f
    @Y61.k
    public static final o81 f388458h = new o81(new c(qc1.a(qc1.f389149g + " TaskRunner", true)));

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    private static final Logger f388459i = Logger.getLogger(o81.class.getName());

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final a f388460a;

    /* renamed from: c, reason: collision with root package name */
    private boolean f388462c;

    /* renamed from: d, reason: collision with root package name */
    private long f388463d;

    /* renamed from: b, reason: collision with root package name */
    private int f388461b = 10000;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    private final ArrayList f388464e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    private final ArrayList f388465f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    private final p81 f388466g = new p81(this);

    public interface a {
        long a();

        void a(@Y61.k o81 o81Var);

        void a(@Y61.k o81 o81Var, long j12);

        void execute(@Y61.k Runnable runnable);
    }

    public static final class b {
        @Y61.k
        public static Logger a() {
            return o81.f388459i;
        }
    }

    public static final class c implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        private final ThreadPoolExecutor f388467a;

        public c(@Y61.k ThreadFactory threadFactory) {
            this.f388467a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), threadFactory);
        }

        @Override // com.yandex.mobile.ads.impl.o81.a
        public final long a() {
            return System.nanoTime();
        }

        @Override // com.yandex.mobile.ads.impl.o81.a
        public final void execute(@Y61.k Runnable runnable) {
            this.f388467a.execute(runnable);
        }

        @Override // com.yandex.mobile.ads.impl.o81.a
        public final void a(@Y61.k o81 o81Var, long j12) throws InterruptedException {
            long j13 = j12 / 1000000;
            long j14 = j12 - (1000000 * j13);
            if (j13 > 0 || j12 > 0) {
                o81Var.wait(j13, (int) j14);
            }
        }

        @Override // com.yandex.mobile.ads.impl.o81.a
        public final void a(@Y61.k o81 o81Var) {
            o81Var.notify();
        }
    }

    public o81(@Y61.k c cVar) {
        this.f388460a = cVar;
    }

    @Y61.l
    public final k81 b() {
        boolean z12;
        if (qc1.f389148f && !Thread.holdsLock(this)) {
            StringBuilder sbA = Cif.a("Thread ");
            sbA.append(Thread.currentThread().getName());
            sbA.append(" MUST hold lock on ");
            sbA.append(this);
            throw new AssertionError(sbA.toString());
        }
        while (!this.f388465f.isEmpty()) {
            long jA2 = this.f388460a.a();
            Iterator it = this.f388465f.iterator();
            long jMin = Long.MAX_VALUE;
            k81 k81Var = null;
            while (true) {
                if (!it.hasNext()) {
                    z12 = false;
                    break;
                }
                k81 k81Var2 = (k81) ((n81) it.next()).e().get(0);
                long jMax = Math.max(0L, k81Var2.c() - jA2);
                if (jMax > 0) {
                    jMin = Math.min(jMax, jMin);
                } else {
                    if (k81Var != null) {
                        z12 = true;
                        break;
                    }
                    k81Var = k81Var2;
                }
            }
            if (k81Var != null) {
                if (qc1.f389148f && !Thread.holdsLock(this)) {
                    StringBuilder sbA2 = Cif.a("Thread ");
                    sbA2.append(Thread.currentThread().getName());
                    sbA2.append(" MUST hold lock on ");
                    sbA2.append(this);
                    throw new AssertionError(sbA2.toString());
                }
                k81Var.a(-1L);
                n81 n81VarD = k81Var.d();
                n81VarD.e().remove(k81Var);
                this.f388465f.remove(n81VarD);
                n81VarD.a(k81Var);
                this.f388464e.add(n81VarD);
                if (z12 || (!this.f388462c && !this.f388465f.isEmpty())) {
                    this.f388460a.execute(this.f388466g);
                }
                return k81Var;
            }
            if (this.f388462c) {
                if (jMin < this.f388463d - jA2) {
                    this.f388460a.a(this);
                }
                return null;
            }
            this.f388462c = true;
            this.f388463d = jA2 + jMin;
            try {
                try {
                    this.f388460a.a(this, jMin);
                } catch (InterruptedException unused) {
                    c();
                }
            } finally {
                this.f388462c = false;
            }
        }
        return null;
    }

    public final void c() {
        int size = this.f388464e.size();
        while (true) {
            size--;
            if (-1 >= size) {
                break;
            } else {
                ((n81) this.f388464e.get(size)).b();
            }
        }
        for (int size2 = this.f388465f.size() - 1; -1 < size2; size2--) {
            n81 n81Var = (n81) this.f388465f.get(size2);
            n81Var.b();
            if (n81Var.e().isEmpty()) {
                this.f388465f.remove(size2);
            }
        }
    }

    @Y61.k
    public final a d() {
        return this.f388460a;
    }

    @Y61.k
    public final n81 e() {
        int i12;
        synchronized (this) {
            i12 = this.f388461b;
            this.f388461b = i12 + 1;
        }
        return new n81(this, AK.c.g(i12, "Q"));
    }

    public static final void a(o81 o81Var, k81 k81Var) {
        o81Var.getClass();
        if (qc1.f389148f && Thread.holdsLock(o81Var)) {
            StringBuilder sbA = Cif.a("Thread ");
            sbA.append(Thread.currentThread().getName());
            sbA.append(" MUST NOT hold lock on ");
            sbA.append(o81Var);
            throw new AssertionError(sbA.toString());
        }
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        threadCurrentThread.setName(k81Var.b());
        try {
            long jE2 = k81Var.e();
            synchronized (o81Var) {
                o81Var.a(k81Var, jE2);
                kotlin.G0 g02 = kotlin.G0.f406611a;
            }
            threadCurrentThread.setName(name);
        } catch (Throwable th2) {
            synchronized (o81Var) {
                o81Var.a(k81Var, -1L);
                kotlin.G0 g03 = kotlin.G0.f406611a;
                threadCurrentThread.setName(name);
                throw th2;
            }
        }
    }

    public final void a(@Y61.k n81 n81Var) {
        if (qc1.f389148f && !Thread.holdsLock(this)) {
            StringBuilder sbA = Cif.a("Thread ");
            sbA.append(Thread.currentThread().getName());
            sbA.append(" MUST hold lock on ");
            sbA.append(this);
            throw new AssertionError(sbA.toString());
        }
        if (n81Var.c() == null) {
            if (!n81Var.e().isEmpty()) {
                qc1.a(this.f388465f, n81Var);
            } else {
                this.f388465f.remove(n81Var);
            }
        }
        if (this.f388462c) {
            this.f388460a.a(this);
        } else {
            this.f388460a.execute(this.f388466g);
        }
    }

    private final void a(k81 k81Var, long j12) {
        if (qc1.f389148f && !Thread.holdsLock(this)) {
            StringBuilder sbA = Cif.a("Thread ");
            sbA.append(Thread.currentThread().getName());
            sbA.append(" MUST hold lock on ");
            sbA.append(this);
            throw new AssertionError(sbA.toString());
        }
        n81 n81VarD = k81Var.d();
        if (n81VarD.c() == k81Var) {
            boolean zD2 = n81VarD.d();
            n81VarD.i();
            n81VarD.a(null);
            this.f388464e.remove(n81VarD);
            if (j12 != -1 && !zD2 && !n81VarD.g()) {
                n81VarD.a(k81Var, j12, true);
            }
            if (n81VarD.e().isEmpty()) {
                return;
            }
            this.f388465f.add(n81VarD);
            return;
        }
        throw new IllegalStateException("Check failed.");
    }
}
