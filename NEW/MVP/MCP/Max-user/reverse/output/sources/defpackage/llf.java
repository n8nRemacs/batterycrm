package defpackage;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.Consumer;
import java.util.function.Function;
import tech.kwik.core.impl.ImplementationError;

/* loaded from: classes3.dex */
public final class llf {
    public static final sb3 B = new sb3(15);
    public long A;
    public final ysc b;
    public final ExecutorService c;
    public volatile b36 d;
    public final bh8 e;
    public volatile jr3 f;
    public volatile int g;
    public volatile int h;
    public volatile Long j;
    public volatile Long k;
    public volatile boolean n;
    public volatile boolean o;
    public volatile long p;
    public long q;
    public long r;
    public final AtomicInteger u;
    public final AtomicInteger v;
    public volatile int w;
    public volatile int x;
    public long y;
    public long z;
    public final ConcurrentHashMap a = new ConcurrentHashMap();
    public final Semaphore l = new Semaphore(0);
    public final Semaphore m = new Semaphore(0);
    public volatile Consumer i = B;
    public final ReentrantLock s = new ReentrantLock();
    public final ReentrantLock t = new ReentrantLock();

    public llf(ysc yscVar, bh8 bh8Var, db3 db3Var, ExecutorService executorService) {
        this.b = yscVar;
        this.e = bh8Var;
        AtomicInteger atomicInteger = new AtomicInteger();
        this.u = atomicInteger;
        AtomicInteger atomicInteger2 = new AtomicInteger();
        this.v = atomicInteger2;
        atomicInteger.set(0);
        atomicInteger2.set(2);
        this.w = 3;
        this.x = 1;
        this.c = executorService;
        g(db3Var);
    }

    public static int b(int i, int i2, boolean z) {
        if (i < 0) {
            return 0;
        }
        int i3 = (i2 == 1 && z) ? 0 : Integer.MIN_VALUE;
        if (i2 == 2 && z) {
            i3 = 1;
        }
        if (i2 == 1 && !z) {
            i3 = 2;
        }
        if (i2 == 2 && !z) {
            i3 = 3;
        }
        int i4 = (i * 4) + i3;
        if (i4 > 0) {
            return i4;
        }
        return Integer.MAX_VALUE;
    }

    public final void a() {
        this.a.values().stream().forEach(new sb3(14));
    }

    public final nr8 c(int i) {
        if (i < 9) {
            throw new ImplementationError();
        }
        try {
            this.s.lock();
            this.o = false;
            this.s.unlock();
            return new nr8(this.h / 4, true);
        } catch (Throwable th) {
            this.s.unlock();
            throw th;
        }
    }

    public final nr8 d(int i) {
        if (i < 9) {
            throw new ImplementationError();
        }
        try {
            this.s.lock();
            this.n = false;
            this.s.unlock();
            return new nr8(this.g / 4, false);
        } catch (Throwable th) {
            this.s.unlock();
            throw th;
        }
    }

    public final void e(int i, int i2, Runnable runnable) {
        if (i < i2) {
            this.e.warn("Receiving data for already closed peer-initiated stream " + i + " (ignoring)");
            return;
        }
        for (int i3 = i2; i3 <= i; i3 += 4) {
            ctc ctcVar = new ctc(i3, this.b, this, this.d, this.e);
            this.a.put(Integer.valueOf(i3), ctcVar);
            this.c.submit(new aee(this, 17, ctcVar));
        }
        runnable.run();
    }

    public final ctc f(boolean z, long j, TimeUnit timeUnit, u4e u4eVar) throws TimeoutException {
        try {
            if (!(z ? this.l.tryAcquire(j, timeUnit) : this.m.tryAcquire(j, timeUnit))) {
                throw new TimeoutException();
            }
            int andAdd = z ? this.u.getAndAdd(4) : this.v.getAndAdd(4);
            llf llfVar = (llf) u4eVar.b;
            llfVar.getClass();
            ctc ctcVar = new ctc(andAdd, llfVar.b, llfVar, llfVar.d, llfVar.e);
            this.a.put(Integer.valueOf(andAdd), ctcVar);
            return ctcVar;
        } catch (InterruptedException unused) {
            this.e.debug("blocked createStream operation is interrupted");
            throw new TimeoutException("operation interrupted");
        }
    }

    public final void g(jr3 jr3Var) {
        this.f = jr3Var;
        this.g = b(jr3Var.h(), 2, false);
        this.h = b(jr3Var.f(), 2, true);
        this.z = b((int) Long.min(2147483647L, jr3Var.b()), 2, false);
        this.A = b((int) Long.min(2147483647L, jr3Var.d()), 2, true);
        this.p = jr3Var.g();
        this.q = this.p;
        this.r = this.p / 10;
    }

    public final boolean h(int i) {
        return i % 2 == 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(defpackage.dlf r11) {
        /*
            r10 = this;
            int r0 = r11.b
            java.util.concurrent.ConcurrentHashMap r1 = r10.a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            java.lang.Object r1 = r1.get(r2)
            ctc r1 = (defpackage.ctc) r1
            r2 = 2
            r3 = 1
            if (r1 != 0) goto L28
            int r4 = r11.b
            boolean r5 = r10.h(r4)
            if (r5 == 0) goto L72
            int r5 = r4 % 4
            if (r5 <= r3) goto L22
            int r6 = r10.w
            if (r4 >= r6) goto L28
        L22:
            if (r5 >= r2) goto L72
            int r5 = r10.x
            if (r4 < r5) goto L72
        L28:
            if (r1 == 0) goto L31
            elf r4 = r1.e
            long r4 = r4.P()
            goto L33
        L31:
            r4 = 0
        L33:
            long r6 = r11.b()
            int r6 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r6 <= 0) goto L72
            long r6 = r11.b()
            long r6 = r6 - r4
            long r4 = r10.y
            long r4 = r4 + r6
            long r8 = r10.p
            int r4 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r4 > 0) goto L4a
            goto L72
        L4a:
            bh8 r0 = r10.e
            int r11 = r11.b
            long r1 = r10.y
            long r3 = r10.p
            java.lang.String r5 = "Flow control error on stream: "
            java.lang.String r8 = ":"
            java.lang.StringBuilder r11 = defpackage.u45.m(r11, r1, r5, r8)
            java.lang.String r1 = " + "
            java.lang.String r2 = " > "
            defpackage.az1.r(r6, r1, r2, r11)
            r11.append(r3)
            java.lang.String r11 = r11.toString()
            r0.error(r11)
            tech.kwik.core.impl.TransportError r11 = new tech.kwik.core.impl.TransportError
            r0 = 4
            r11.<init>(r0)
            throw r11
        L72:
            if (r1 == 0) goto L7e
            long r2 = r10.y
            long r0 = r1.a(r11)
            long r0 = r0 + r2
            r10.y = r0
            return
        L7e:
            boolean r1 = r10.h(r0)
            if (r1 == 0) goto Lca
            int r1 = r0 % 4
            if (r1 <= r3) goto L8c
            int r4 = r10.g
            if (r0 < r4) goto L92
        L8c:
            if (r1 >= r2) goto Lc3
            int r2 = r10.h
            if (r0 >= r2) goto Lc3
        L92:
            if (r1 <= r3) goto La0
            int r1 = r10.w
            jlf r2 = new jlf
            r3 = 0
            r2.<init>(r10)
            r10.e(r0, r1, r2)
            goto Lab
        La0:
            int r1 = r10.x
            jlf r2 = new jlf
            r3 = 1
            r2.<init>(r10)
            r10.e(r0, r1, r2)
        Lab:
            java.util.concurrent.ConcurrentHashMap r1 = r10.a
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r0 = r1.get(r0)
            ctc r0 = (defpackage.ctc) r0
            if (r0 == 0) goto Lc2
            long r1 = r10.y
            long r3 = r0.a(r11)
            long r3 = r3 + r1
            r10.y = r3
        Lc2:
            return
        Lc3:
            tech.kwik.core.impl.TransportError r11 = new tech.kwik.core.impl.TransportError
            r0 = 5
            r11.<init>(r0)
            throw r11
        Lca:
            bh8 r11 = r10.e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Receiving frame for non-existent stream "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r11.warn(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.llf.i(dlf):void");
    }

    public final void j(int i) {
        this.a.remove(Integer.valueOf(i));
        if (h(i)) {
            hf5 hf5Var = hf5.d;
            try {
                this.s.lock();
                if (!(i % 4 > 1) || this.g + 4 >= this.z) {
                    if ((i % 4 < 2) && this.h + 4 < this.A) {
                        this.h += 4;
                        if (!this.o) {
                            final int i2 = 1;
                            this.b.L0.g(new Function(this) { // from class: klf
                                public final /* synthetic */ llf b;

                                {
                                    this.b = this;
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj) {
                                    int i3 = i2;
                                    int iIntValue = ((Integer) obj).intValue();
                                    switch (i3) {
                                        case 0:
                                            return this.b.d(iIntValue);
                                        default:
                                            return this.b.c(iIntValue);
                                    }
                                }
                            }, 9, hf5Var, new m4(22, this));
                            this.o = true;
                        }
                    }
                } else {
                    this.g += 4;
                    if (!this.n) {
                        final int i3 = 0;
                        this.b.L0.g(new Function(this) { // from class: klf
                            public final /* synthetic */ llf b;

                            {
                                this.b = this;
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                int i32 = i3;
                                int iIntValue = ((Integer) obj).intValue();
                                switch (i32) {
                                    case 0:
                                        return this.b.d(iIntValue);
                                    default:
                                        return this.b.c(iIntValue);
                                }
                            }
                        }, 9, hf5Var, new m4(22, this));
                        this.n = true;
                    }
                }
                this.s.unlock();
            } catch (Throwable th) {
                this.s.unlock();
                throw th;
            }
        }
    }
}
