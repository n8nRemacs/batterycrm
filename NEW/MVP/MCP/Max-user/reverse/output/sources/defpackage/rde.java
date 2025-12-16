package defpackage;

import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.time.Clock;
import java.time.Duration;
import java.time.Instant;
import java.time.temporal.Temporal;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;
import java.util.function.Function;
import ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader;

/* loaded from: classes3.dex */
public final class rde {
    public static final sb3 A = new sb3(4);
    public final Clock a;
    public volatile int b;
    public volatile DatagramSocket c;
    public final InetSocketAddress d;
    public final ysc e;
    public final yga f;
    public final xud g;
    public final bh8 h;
    public final vqc i;
    public final mde[] j;
    public final pa5 k;
    public final t9f l;
    public final lhd m;
    public final vc7 n;
    public final Thread o;
    public final boolean[] p;
    public fs3 q;
    public final Object r;
    public boolean s;
    public volatile boolean t;
    public volatile boolean u;
    public volatile int v;
    public volatile long w;
    public final AtomicInteger x;
    public volatile boolean y;
    public volatile int z;

    public rde(final qje qjeVar, int i, DatagramSocket datagramSocket, InetSocketAddress inetSocketAddress, ysc yscVar, bh8 bh8Var) {
        Clock clockSystemUTC = Clock.systemUTC();
        mde[] mdeVarArr = new mde[hf5.values().length];
        this.j = mdeVarArr;
        this.p = new boolean[m5c.values().length];
        this.r = new Object();
        this.x = new AtomicInteger();
        this.y = false;
        this.z = -1;
        this.a = clockSystemUTC;
        this.b = i;
        this.c = datagramSocket;
        this.d = inetSocketAddress;
        this.e = yscVar;
        this.h = bh8Var;
        this.i = bh8Var.getQLog();
        Arrays.stream(hf5.values()).forEach(new oe5(this, 4, clockSystemUTC));
        final t9f t9fVar = new t9f(19);
        t9fVar.b = new b6[m5c.values().length];
        Arrays.stream(m5c.values()).forEach(new oe5(t9fVar, 1, this));
        this.l = t9fVar;
        final pa5 pa5Var = new pa5();
        pa5Var.b = new olb[hf5.values().length];
        pa5Var.a = mdeVarArr;
        final n7 n7Var = new n7();
        Arrays.stream(hf5.values()).forEach(new Consumer() { // from class: kv6
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                b6 xpaVar;
                pa5 pa5Var2 = pa5Var;
                t9f t9fVar2 = t9fVar;
                qje qjeVar2 = qjeVar;
                n7 n7Var2 = n7Var;
                hf5 hf5Var = (hf5) obj;
                int iOrdinal = hf5Var.ordinal();
                if (hf5Var != hf5.b) {
                    xpaVar = ((b6[]) t9fVar2.b)[hf5Var.a().ordinal()];
                } else {
                    xpaVar = new xpa(null, null);
                }
                b6 b6Var = xpaVar;
                int iOrdinal2 = hf5Var.ordinal();
                if (iOrdinal2 == 0) {
                    ((olb[]) pa5Var2.b)[iOrdinal] = new pl7(qjeVar2, hf5.a, ((mde[]) pa5Var2.a)[iOrdinal], b6Var);
                } else if (iOrdinal2 == 1 || iOrdinal2 == 3) {
                    ((olb[]) pa5Var2.b)[iOrdinal] = new olb(qjeVar2, hf5Var, ((mde[]) pa5Var2.a)[iOrdinal], b6Var, n7Var2);
                } else {
                    ((olb[]) pa5Var2.b)[iOrdinal] = new olb(qjeVar2, hf5Var, ((mde[]) pa5Var2.a)[iOrdinal], b6Var);
                }
            }
        });
        pa5Var.c = new hf5[]{hf5.a, hf5.b, hf5.c};
        this.k = pa5Var;
        yga ygaVar = new yga(bh8Var, this);
        this.f = ygaVar;
        xud xudVar = new xud(bh8Var);
        this.g = xudVar;
        lhd lhdVar = new lhd(yscVar.b, xudVar, ygaVar, this, bh8Var);
        this.m = lhdVar;
        yscVar.Z.add(lhdVar);
        yscVar.w0 = lhdVar;
        this.n = yscVar.t0;
        Thread thread = new Thread(new ghd(this, 1), wy1.h("sender", ""));
        this.o = thread;
        thread.setDaemon(true);
    }

    public final long a() {
        pa5 pa5Var = this.k;
        Optional optionalFindFirst = Arrays.stream((hf5[]) pa5Var.c).map(new ni(14, pa5Var)).map(new m0(21)).filter(new gb3(17)).findFirst();
        if (!optionalFindFirst.isPresent()) {
            return MultiFileUploader.UPLOAD_NEXT_INTERVAL;
        }
        long jMax = Long.max(Duration.between(this.a.instant(), (Temporal) optionalFindFirst.get()).toMillis(), 0L);
        if (jMax > 0) {
            this.x.set(0);
            this.y = false;
            return jMax;
        }
        if (this.y) {
            int iIncrementAndGet = this.x.incrementAndGet();
            if (iIncrementAndGet % 20 == 3) {
                this.h.error("possible bug: sender is looping in busy wait; got " + iIncrementAndGet + " iterations");
            }
            if (iIncrementAndGet > 10003) {
                return 8000L;
            }
        }
        this.y = true;
        return 0L;
    }

    public final void b(m5c m5cVar, String str) {
        synchronized (this.p) {
            try {
                if (!this.p[m5cVar.ordinal()]) {
                    pa5 pa5Var = this.k;
                    olb olbVar = ((olb[]) pa5Var.b)[m5cVar.a().ordinal()];
                    olbVar.g = new oe5(pa5Var, 2, m5cVar);
                    olbVar.c.b(false);
                    olbVar.f = true;
                    lhd lhdVar = this.m;
                    if (!lhdVar.p) {
                        lhdVar.e[m5cVar.ordinal()].a();
                        lhdVar.m = 0;
                        lhdVar.k();
                    }
                    this.h.recovery("Discarding pn space " + m5cVar + " because " + str);
                    ((b6[]) this.l.b)[m5cVar.ordinal()] = new xpa(null, null);
                    this.p[m5cVar.ordinal()] = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c2  */
    /* JADX WARN: Type inference failed for: r0v39, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 664
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rde.c():void");
    }

    public final int d() {
        return (this.g.a() * 4) + this.g.b() + this.v;
    }

    public final void e(ir3 ir3Var, hf5 hf5Var) {
        this.j[hf5Var.ordinal()].a(ir3Var, new sb3(4));
    }

    public final void f(atc atcVar, hf5 hf5Var, Consumer consumer) {
        this.j[hf5Var.ordinal()].a(atcVar, consumer);
    }

    public final void g(Function function, int i, hf5 hf5Var, Consumer consumer) {
        ConcurrentLinkedDeque concurrentLinkedDeque = this.j[hf5Var.ordinal()].c;
        gk6 gk6Var = new gk6();
        gk6Var.a = i;
        gk6Var.b = function;
        gk6Var.c = consumer;
        concurrentLinkedDeque.addLast(gk6Var);
    }

    public final void h(m5c m5cVar, int i) {
        mde mdeVar = this.j[m5cVar.a().ordinal()];
        Instant instantPlusMillis = mdeVar.a.instant().plusMillis(i);
        synchronized (mdeVar.e) {
            try {
                Instant instant = mdeVar.f;
                if (instant == null || instantPlusMillis.isBefore(instant)) {
                    mdeVar.f = instantPlusMillis;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void i(List list, hf5 hf5Var) {
        synchronized (this.p) {
            try {
                if (this.p[hf5Var.a().ordinal()]) {
                    this.h.warn("Attempt to send probe on discarded space (" + hf5Var.a() + ") => ignoring");
                } else {
                    this.j[hf5Var.ordinal()].d.addLast(list);
                    k();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void j() {
        Arrays.stream(this.j).forEach(new sb3(7));
        lhd lhdVar = this.m;
        if (lhdVar.p) {
            return;
        }
        lhdVar.p = true;
        lhdVar.k.cancel(true);
        lhdVar.n = null;
        lhdVar.h.shutdown();
        for (m5c m5cVar : m5c.values()) {
            lhdVar.e[m5cVar.ordinal()].a();
        }
    }

    public final void k() {
        synchronized (this.r) {
            this.s = true;
            this.r.notify();
        }
    }
}
