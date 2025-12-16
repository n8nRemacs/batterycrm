package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public final class m87 implements Closeable {
    public static final yme J0;
    public yme A0;
    public long B0;
    public long C0;
    public long D0;
    public long E0;
    public final Socket F0;
    public final u87 G0;
    public final vu2 H0;
    public final LinkedHashSet I0;
    public boolean X;
    public final b3g Y;
    public final y2g Z;
    public final f87 a;
    public final String c;
    public int d;
    public final y2g s0;
    public final y2g t0;
    public final tha u0;
    public long v0;
    public long w0;
    public long x0;
    public long y0;
    public final yme z0;
    public final LinkedHashMap b = new LinkedHashMap();
    public int o = 3;

    static {
        yme ymeVar = new yme();
        ymeVar.b(7, 65535);
        ymeVar.b(5, 16384);
        J0 = ymeVar;
    }

    public m87(goh gohVar) {
        this.a = (f87) gohVar.e;
        this.c = (String) gohVar.a;
        b3g b3gVar = (b3g) gohVar.f;
        this.Y = b3gVar;
        this.Z = b3gVar.e();
        this.s0 = b3gVar.e();
        this.t0 = b3gVar.e();
        this.u0 = tha.x0;
        yme ymeVar = new yme();
        ymeVar.b(7, 16777216);
        this.z0 = ymeVar;
        this.A0 = J0;
        this.E0 = r0.a();
        this.F0 = (Socket) gohVar.b;
        this.G0 = new u87((ibd) gohVar.d);
        this.H0 = new vu2(this, new p87((jbd) gohVar.c));
        this.I0 = new LinkedHashSet();
    }

    public final void P(int i, int i2) {
        this.Z.c(new h87(this.c + '[' + i + "] writeSynReset", this, i, i2, 1), 0L);
    }

    public final void Q(int i, long j) {
        this.Z.c(new l87(this.c + '[' + i + "] windowUpdate", this, i, j), 0L);
    }

    public final void c(int i, int i2, IOException iOException) throws IOException {
        int i3;
        t87[] t87VarArr;
        byte[] bArr = yxg.a;
        try {
            l(i);
        } catch (IOException unused) {
        }
        synchronized (this) {
            try {
                if (this.b.isEmpty()) {
                    t87VarArr = null;
                } else {
                    Object[] array = this.b.values().toArray(new t87[0]);
                    if (array == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                    }
                    t87VarArr = (t87[]) array;
                    this.b.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (t87VarArr != null) {
            for (t87 t87Var : t87VarArr) {
                try {
                    t87Var.c(i2, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.G0.close();
        } catch (IOException unused3) {
        }
        try {
            this.F0.close();
        } catch (IOException unused4) {
        }
        this.Z.e();
        this.s0.e();
        this.t0.e();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        c(1, 9, null);
    }

    public final synchronized t87 d(int i) {
        return (t87) this.b.get(Integer.valueOf(i));
    }

    public final void flush() {
        this.G0.flush();
    }

    public final synchronized t87 i(int i) {
        t87 t87Var;
        t87Var = (t87) this.b.remove(Integer.valueOf(i));
        notifyAll();
        return t87Var;
    }

    public final void l(int i) {
        synchronized (this.G0) {
            synchronized (this) {
                if (this.X) {
                    return;
                }
                this.X = true;
                this.G0.l(this.d, yxg.a, i);
            }
        }
    }

    public final synchronized void w(long j) {
        long j2 = this.B0 + j;
        this.B0 = j2;
        long j3 = j2 - this.C0;
        if (j3 >= this.z0.a() / 2) {
            Q(0, j3);
            this.C0 += j3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0035, code lost:
    
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r6 - r4), r8.G0.b);
        r6 = r2;
        r8.D0 += r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void y(int r9, boolean r10, defpackage.qu0 r11, long r12) {
        /*
            r8 = this;
            r0 = 0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            r3 = 0
            if (r2 != 0) goto Ld
            u87 r12 = r8.G0
            r12.d(r10, r9, r11, r3)
            return
        Ld:
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 <= 0) goto L68
            monitor-enter(r8)
        L12:
            long r4 = r8.D0     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            long r6 = r8.E0     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 < 0) goto L34
            java.util.LinkedHashMap r2 = r8.b     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            boolean r2 = r2.containsKey(r4)     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            if (r2 == 0) goto L2c
            r8.wait()     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            goto L12
        L2a:
            r9 = move-exception
            goto L66
        L2c:
            java.io.IOException r9 = new java.io.IOException     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            throw r9     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
        L34:
            long r6 = r6 - r4
            long r4 = java.lang.Math.min(r12, r6)     // Catch: java.lang.Throwable -> L2a
            int r2 = (int) r4     // Catch: java.lang.Throwable -> L2a
            u87 r4 = r8.G0     // Catch: java.lang.Throwable -> L2a
            int r4 = r4.b     // Catch: java.lang.Throwable -> L2a
            int r2 = java.lang.Math.min(r2, r4)     // Catch: java.lang.Throwable -> L2a
            long r4 = r8.D0     // Catch: java.lang.Throwable -> L2a
            long r6 = (long) r2     // Catch: java.lang.Throwable -> L2a
            long r4 = r4 + r6
            r8.D0 = r4     // Catch: java.lang.Throwable -> L2a
            monitor-exit(r8)
            long r12 = r12 - r6
            u87 r4 = r8.G0
            if (r10 == 0) goto L54
            int r5 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r5 != 0) goto L54
            r5 = 1
            goto L55
        L54:
            r5 = r3
        L55:
            r4.d(r5, r9, r11, r2)
            goto Ld
        L59:
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L2a
            r9.interrupt()     // Catch: java.lang.Throwable -> L2a
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L2a
            r9.<init>()     // Catch: java.lang.Throwable -> L2a
            throw r9     // Catch: java.lang.Throwable -> L2a
        L66:
            monitor-exit(r8)
            throw r9
        L68:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m87.y(int, boolean, qu0, long):void");
    }
}
