package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes.dex */
public final class d84 extends Thread {
    public static final /* synthetic */ AtomicIntegerFieldUpdater s0 = AtomicIntegerFieldUpdater.newUpdater(d84.class, "workerCtl$volatile");
    public int X;
    public boolean Y;
    public final /* synthetic */ e84 Z;
    public final m5i a;
    public final uid b;
    public int c;
    public long d;
    private volatile int indexInArray;
    private volatile Object nextParkedWorker;
    public long o;
    private volatile /* synthetic */ int workerCtl$volatile;

    public d84(e84 e84Var, int i) {
        this.Z = e84Var;
        setDaemon(true);
        setContextClassLoader(e84.class.getClassLoader());
        this.a = new m5i();
        this.b = new uid();
        this.c = 4;
        this.nextParkedWorker = e84.u0;
        int iNanoTime = (int) System.nanoTime();
        this.X = iNanoTime == 0 ? 42 : iNanoTime;
        f(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0043, code lost:
    
        r11 = defpackage.m5i.d.get(r9);
        r0 = defpackage.m5i.c.get(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004f, code lost:
    
        if (r11 == r0) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0057, code lost:
    
        if (defpackage.m5i.e.get(r9) != 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005a, code lost:
    
        r0 = r0 - 1;
        r1 = r9.c(r0, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0060, code lost:
    
        if (r1 == null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0062, code lost:
    
        r7 = r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.l2g a(boolean r11) {
        /*
            r10 = this;
            int r0 = r10.c
            e84 r2 = r10.Z
            r7 = 0
            r8 = 1
            m5i r9 = r10.a
            if (r0 != r8) goto Lc
            goto L86
        Lc:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = defpackage.e84.s0
        Le:
            long r3 = r0.get(r2)
            r5 = 9223367638808264704(0x7ffffc0000000000, double:NaN)
            long r5 = r5 & r3
            r1 = 42
            long r5 = r5 >> r1
            int r1 = (int) r5
            if (r1 != 0) goto L75
            r9.getClass()
        L21:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r11 = defpackage.m5i.b
            java.lang.Object r0 = r11.get(r9)
            l2g r0 = (defpackage.l2g) r0
            if (r0 != 0) goto L2c
            goto L43
        L2c:
            p2g r1 = r0.taskContext
            l16 r1 = (defpackage.l16) r1
            int r1 = r1.b
            if (r1 != r8) goto L43
        L34:
            boolean r1 = r11.compareAndSet(r9, r0, r7)
            if (r1 == 0) goto L3c
            r7 = r0
            goto L63
        L3c:
            java.lang.Object r1 = r11.get(r9)
            if (r1 == r0) goto L34
            goto L21
        L43:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r11 = defpackage.m5i.d
            int r11 = r11.get(r9)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = defpackage.m5i.c
            int r0 = r0.get(r9)
        L4f:
            if (r11 == r0) goto L63
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = defpackage.m5i.e
            int r1 = r1.get(r9)
            if (r1 != 0) goto L5a
            goto L63
        L5a:
            int r0 = r0 + (-1)
            l2g r1 = r9.c(r0, r8)
            if (r1 == 0) goto L4f
            r7 = r1
        L63:
            if (r7 != 0) goto L74
            mv6 r11 = r2.X
            java.lang.Object r11 = r11.removeFirstOrNull()
            l2g r11 = (defpackage.l2g) r11
            if (r11 != 0) goto L73
            l2g r11 = r10.i(r8)
        L73:
            return r11
        L74:
            return r7
        L75:
            r5 = 4398046511104(0x40000000000, double:2.1729236899484E-311)
            long r5 = r3 - r5
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = defpackage.e84.s0
            boolean r1 = r1.compareAndSet(r2, r3, r5)
            if (r1 == 0) goto Le
            r10.c = r8
        L86:
            if (r11 == 0) goto Lba
            int r11 = r2.a
            int r11 = r11 * 2
            int r11 = r10.d(r11)
            if (r11 != 0) goto L93
            goto L94
        L93:
            r8 = 0
        L94:
            if (r8 == 0) goto L9d
            l2g r11 = r10.e()
            if (r11 == 0) goto L9d
            return r11
        L9d:
            r9.getClass()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r11 = defpackage.m5i.b
            java.lang.Object r11 = r11.getAndSet(r9, r7)
            l2g r11 = (defpackage.l2g) r11
            if (r11 != 0) goto Lae
            l2g r11 = r9.b()
        Lae:
            if (r11 == 0) goto Lb1
            return r11
        Lb1:
            if (r8 != 0) goto Lc1
            l2g r11 = r10.e()
            if (r11 == 0) goto Lc1
            return r11
        Lba:
            l2g r11 = r10.e()
            if (r11 == 0) goto Lc1
            return r11
        Lc1:
            r11 = 3
            l2g r11 = r10.i(r11)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d84.a(boolean):l2g");
    }

    public final int b() {
        return this.indexInArray;
    }

    public final Object c() {
        return this.nextParkedWorker;
    }

    public final int d(int i) {
        int i2 = this.X;
        int i3 = i2 ^ (i2 << 13);
        int i4 = i3 ^ (i3 >> 17);
        int i5 = i4 ^ (i4 << 5);
        this.X = i5;
        int i6 = i - 1;
        return (i6 & i) == 0 ? i5 & i6 : (i5 & Integer.MAX_VALUE) % i;
    }

    public final l2g e() {
        int iD = d(2);
        e84 e84Var = this.Z;
        if (iD == 0) {
            l2g l2gVar = (l2g) e84Var.o.removeFirstOrNull();
            return l2gVar != null ? l2gVar : (l2g) e84Var.X.removeFirstOrNull();
        }
        l2g l2gVar2 = (l2g) e84Var.X.removeFirstOrNull();
        return l2gVar2 != null ? l2gVar2 : (l2g) e84Var.o.removeFirstOrNull();
    }

    public final void f(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.Z.d);
        sb.append("-worker-");
        sb.append(i == 0 ? "TERMINATED" : String.valueOf(i));
        setName(sb.toString());
        this.indexInArray = i;
    }

    public final void g(Object obj) {
        this.nextParkedWorker = obj;
    }

    public final boolean h(int i) {
        int i2 = this.c;
        boolean z = i2 == 1;
        if (z) {
            e84.s0.addAndGet(this.Z, 4398046511104L);
        }
        if (i2 != i) {
            this.c = i;
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x006b, code lost:
    
        r7 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a3, code lost:
    
        r7 = -2;
        r5 = r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.l2g i(int r26) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d84.i(int):l2g");
    }

    /* JADX WARN: Code restructure failed: missing block: B:119:0x0004, code lost:
    
        continue;
     */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 391
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d84.run():void");
    }
}
