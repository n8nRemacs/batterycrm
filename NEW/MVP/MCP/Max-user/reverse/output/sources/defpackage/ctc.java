package defpackage;

import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes3.dex */
public class ctc {
    public final int a;
    public final ysc b;
    public final llf c;
    public final bh8 d;
    public final elf e;
    public final nlf f;
    public volatile boolean g;
    public volatile boolean h;
    public final ReentrantLock i;

    /* JADX WARN: Removed duplicated region for block: B:13:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ctc(int r4, defpackage.ysc r5, defpackage.llf r6, defpackage.b36 r7, defpackage.bh8 r8) {
        /*
            r3 = this;
            r3.<init>()
            r3.a = r4
            r3.b = r5
            r3.c = r6
            r3.d = r8
            boolean r5 = r3.c()
            r0 = 1
            if (r5 != 0) goto L2a
            boolean r5 = r3.d()
            if (r5 == 0) goto L22
            r5 = r4 & 1
            if (r5 == 0) goto L1e
            r5 = 0
            goto L1f
        L1e:
            r5 = r0
        L1f:
            if (r5 != 0) goto L22
            goto L2a
        L22:
            zpa r5 = new zpa
            r5.<init>()
            r3.e = r5
            goto L44
        L2a:
            glf r5 = new glf
            boolean r1 = r3.c()
            if (r1 == 0) goto L39
            jr3 r6 = r6.f
            long r1 = r6.a()
            goto L3f
        L39:
            jr3 r6 = r6.f
            long r1 = r6.c()
        L3f:
            r5.<init>(r3, r1, r8)
            r3.e = r5
        L44:
            boolean r5 = r3.c()
            if (r5 != 0) goto L5b
            boolean r5 = r3.d()
            if (r5 == 0) goto L53
            r4 = r4 & r0
            if (r4 == 0) goto L5b
        L53:
            aqa r4 = new aqa
            r4.<init>()
            r3.f = r4
            goto L64
        L5b:
            qlf r4 = new qlf
            bh8 r5 = r3.d
            r4.<init>(r3, r7, r5)
            r3.f = r4
        L64:
            java.util.concurrent.locks.ReentrantLock r4 = new java.util.concurrent.locks.ReentrantLock
            r4.<init>()
            r3.i = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ctc.<init>(int, ysc, llf, b36, bh8):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0013, code lost:
    
        if (((r2.a & 1) == 0) == false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long a(defpackage.dlf r3) throws tech.kwik.core.impl.TransportError {
        /*
            r2 = this;
            boolean r0 = r2.c()
            if (r0 != 0) goto L1d
            boolean r0 = r2.d()
            if (r0 == 0) goto L16
            int r0 = r2.a
            r1 = 1
            r0 = r0 & r1
            if (r0 == 0) goto L13
            r1 = 0
        L13:
            if (r1 != 0) goto L16
            goto L1d
        L16:
            tech.kwik.core.impl.TransportError r3 = new tech.kwik.core.impl.TransportError
            r0 = 6
            r3.<init>(r0)
            throw r3
        L1d:
            elf r0 = r2.e
            long r0 = r0.y(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ctc.a(dlf):long");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001b A[Catch: all -> 0x0013, TRY_LEAVE, TryCatch #0 {all -> 0x0013, blocks: (B:2:0x0000, B:4:0x000e, B:11:0x001b, B:9:0x0015), top: B:16:0x0000 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            r2 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r2.i     // Catch: java.lang.Throwable -> L13
            r0.lock()     // Catch: java.lang.Throwable -> L13
            r0 = 1
            r2.h = r0     // Catch: java.lang.Throwable -> L13
            boolean r0 = r2.c()     // Catch: java.lang.Throwable -> L13
            if (r0 == 0) goto L15
            boolean r0 = r2.g     // Catch: java.lang.Throwable -> L13
            if (r0 != 0) goto L1b
            goto L15
        L13:
            r0 = move-exception
            goto L28
        L15:
            boolean r0 = r2.d()     // Catch: java.lang.Throwable -> L13
            if (r0 == 0) goto L22
        L1b:
            llf r0 = r2.c     // Catch: java.lang.Throwable -> L13
            int r1 = r2.a     // Catch: java.lang.Throwable -> L13
            r0.j(r1)     // Catch: java.lang.Throwable -> L13
        L22:
            java.util.concurrent.locks.ReentrantLock r0 = r2.i
            r0.unlock()
            return
        L28:
            java.util.concurrent.locks.ReentrantLock r1 = r2.i
            r1.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ctc.b():void");
    }

    public boolean c() {
        return !d();
    }

    public final boolean d() {
        return (this.a & 2) == 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001b A[Catch: all -> 0x0013, TRY_LEAVE, TryCatch #0 {all -> 0x0013, blocks: (B:2:0x0000, B:4:0x000e, B:11:0x001b, B:9:0x0015), top: B:16:0x0000 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e() {
        /*
            r2 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r2.i     // Catch: java.lang.Throwable -> L13
            r0.lock()     // Catch: java.lang.Throwable -> L13
            r0 = 1
            r2.g = r0     // Catch: java.lang.Throwable -> L13
            boolean r0 = r2.c()     // Catch: java.lang.Throwable -> L13
            if (r0 == 0) goto L15
            boolean r0 = r2.h     // Catch: java.lang.Throwable -> L13
            if (r0 != 0) goto L1b
            goto L15
        L13:
            r0 = move-exception
            goto L28
        L15:
            boolean r0 = r2.d()     // Catch: java.lang.Throwable -> L13
            if (r0 == 0) goto L22
        L1b:
            llf r0 = r2.c     // Catch: java.lang.Throwable -> L13
            int r1 = r2.a     // Catch: java.lang.Throwable -> L13
            r0.j(r1)     // Catch: java.lang.Throwable -> L13
        L22:
            java.util.concurrent.locks.ReentrantLock r0 = r2.i
            r0.unlock()
            return
        L28:
            java.util.concurrent.locks.ReentrantLock r1 = r2.i
            r1.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ctc.e():void");
    }

    public final void f(int i) {
        llf llfVar = this.c;
        llfVar.getClass();
        try {
            llfVar.t.lock();
            llfVar.p += i;
            if (llfVar.p - llfVar.q > llfVar.r) {
                ysc yscVar = llfVar.b;
                long j = llfVar.p;
                zd4 zd4Var = new zd4(1);
                zd4Var.b = j;
                yscVar.k(zd4Var, new sb3(4), true);
                llfVar.q = llfVar.p;
            }
        } finally {
            llfVar.t.unlock();
        }
    }

    public final String toString() {
        return ho7.f(this.a, "Stream ");
    }
}
