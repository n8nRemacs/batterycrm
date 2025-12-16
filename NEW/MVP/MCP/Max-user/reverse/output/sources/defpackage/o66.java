package defpackage;

import io.reactivex.rxjava3.exceptions.QueueOverflowException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class o66 extends AtomicInteger implements cof, q76 {
    public volatile boolean X;
    public volatile boolean Y;
    public boolean Z;
    public o1f d;
    public cof o;
    public final aof s0;
    public final fgf t0;
    public long w0;
    public int x0;
    public Object y0;
    public volatile int z0;
    public final int c = 1;
    public final wy a = new wy();
    public final int b = 2;
    public final AtomicLong u0 = new AtomicLong();
    public final n66 v0 = new n66(this, 0);

    public o66(aof aofVar, fgf fgfVar) {
        this.s0 = aofVar;
        this.t0 = fgfVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:
    
        r3.clear();
        r17.y0 = null;
        r4.f(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0040, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            r17 = this;
            r1 = r17
            int r0 = r1.getAndIncrement()
            if (r0 == 0) goto La
            goto Lc4
        La:
            aof r2 = r1.s0
            int r0 = r1.c
            o1f r3 = r1.d
            wy r4 = r1.a
            java.util.concurrent.atomic.AtomicLong r5 = r1.u0
            int r6 = r1.b
            int r7 = r6 >> 1
            int r6 = r6 - r7
            boolean r7 = r1.Z
            r8 = 1
            r9 = r8
        L1d:
            boolean r10 = r1.Y
            r11 = 0
            if (r10 == 0) goto L29
            r3.clear()
            r1.y0 = r11
            goto Lbd
        L29:
            int r10 = r1.z0
            java.lang.Object r12 = r4.get()
            r13 = 2
            if (r12 == 0) goto L41
            if (r0 == r8) goto L38
            if (r0 != r13) goto L41
            if (r10 != 0) goto L41
        L38:
            r3.clear()
            r1.y0 = r11
            r4.f(r2)
            return
        L41:
            r12 = 0
            if (r10 != 0) goto La1
            boolean r10 = r1.X
            java.lang.Object r11 = r3.poll()     // Catch: java.lang.Throwable -> L91
            if (r11 != 0) goto L4e
            r13 = r8
            goto L4f
        L4e:
            r13 = r12
        L4f:
            if (r10 == 0) goto L57
            if (r13 == 0) goto L57
            r4.f(r2)
            return
        L57:
            if (r13 == 0) goto L5a
            goto Lbd
        L5a:
            if (r7 != 0) goto L6c
            int r10 = r1.x0
            int r10 = r10 + r8
            if (r10 != r6) goto L6a
            r1.x0 = r12
            cof r10 = r1.o
            long r12 = (long) r6
            r10.g(r12)
            goto L6c
        L6a:
            r1.x0 = r10
        L6c:
            fgf r10 = r1.t0     // Catch: java.lang.Throwable -> L7e
            java.lang.Object r10 = r10.apply(r11)     // Catch: java.lang.Throwable -> L7e
            m3f r10 = (defpackage.m3f) r10     // Catch: java.lang.Throwable -> L7e
            r1.z0 = r8
            n66 r11 = r1.v0
            e2f r10 = (defpackage.e2f) r10
            r10.k(r11)
            goto Lbd
        L7e:
            r0 = move-exception
            defpackage.raj.c(r0)
            cof r5 = r1.o
            r5.cancel()
            r3.clear()
            r4.b(r0)
            r4.f(r2)
            return
        L91:
            r0 = move-exception
            defpackage.raj.c(r0)
            cof r3 = r1.o
            r3.cancel()
            r4.b(r0)
            r4.f(r2)
            return
        La1:
            if (r10 != r13) goto Lbd
            long r13 = r1.w0
            long r15 = r5.get()
            int r10 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r10 == 0) goto Lbd
            java.lang.Object r10 = r1.y0
            r1.y0 = r11
            r2.f(r10)
            r10 = 1
            long r13 = r13 + r10
            r1.w0 = r13
            r1.z0 = r12
            goto L1d
        Lbd:
            int r9 = -r9
            int r9 = r1.addAndGet(r9)
            if (r9 != 0) goto L1d
        Lc4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o66.a():void");
    }

    @Override // defpackage.aof
    public final void b() {
        this.X = true;
        a();
    }

    @Override // defpackage.cof
    public final void cancel() {
        this.Y = true;
        this.o.cancel();
        n66 n66Var = this.v0;
        n66Var.getClass();
        ty4.a(n66Var);
        this.a.c();
        if (getAndIncrement() == 0) {
            this.d.clear();
            this.y0 = null;
        }
    }

    @Override // defpackage.aof
    public final void d(cof cofVar) {
        if (fof.h(this.o, cofVar)) {
            this.o = cofVar;
            if (cofVar instanceof qsc) {
                qsc qscVar = (qsc) cofVar;
                int iH = qscVar.h(7);
                if (iH == 1) {
                    this.d = qscVar;
                    this.Z = true;
                    this.X = true;
                    this.s0.d(this);
                    a();
                    return;
                }
                if (iH == 2) {
                    this.d = qscVar;
                    this.s0.d(this);
                    this.o.g(this.b);
                    return;
                }
            }
            this.d = new q8f(this.b);
            this.s0.d(this);
            this.o.g(this.b);
        }
    }

    @Override // defpackage.aof
    public final void f(Object obj) {
        if (obj == null || this.d.offer(obj)) {
            a();
        } else {
            this.o.cancel();
            onError(new QueueOverflowException());
        }
    }

    @Override // defpackage.cof
    public final void g(long j) {
        nui.a(this.u0, j);
        a();
    }

    @Override // defpackage.aof
    public final void onError(Throwable th) {
        if (this.a.b(th)) {
            if (this.c == 1) {
                n66 n66Var = this.v0;
                n66Var.getClass();
                ty4.a(n66Var);
            }
            this.X = true;
            a();
        }
    }
}
