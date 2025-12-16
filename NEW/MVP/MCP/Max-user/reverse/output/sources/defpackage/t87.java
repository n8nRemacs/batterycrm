package defpackage;

import java.io.IOException;
import java.util.ArrayDeque;
import okhttp3.internal.http2.StreamResetException;

/* loaded from: classes.dex */
public final class t87 {
    public long a;
    public long b;
    public long c;
    public long d;
    public final ArrayDeque e;
    public boolean f;
    public final r87 g;
    public final q87 h;
    public final s87 i;
    public final s87 j;
    public int k;
    public IOException l;
    public final int m;
    public final m87 n;

    public t87(int i, m87 m87Var, boolean z, boolean z2, j17 j17Var) {
        this.m = i;
        this.n = m87Var;
        this.d = m87Var.A0.a();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.e = arrayDeque;
        this.g = new r87(this, m87Var.z0.a(), z2);
        this.h = new q87(this, z);
        int i2 = 0;
        this.i = new s87(i2, this);
        this.j = new s87(i2, this);
        if (j17Var == null) {
            if (!h()) {
                throw new IllegalStateException("remotely-initiated streams should have headers");
            }
        } else {
            if (h()) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
            }
            arrayDeque.add(j17Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            r2 = this;
            byte[] r0 = defpackage.yxg.a
            monitor-enter(r2)
            r87 r0 = r2.g     // Catch: java.lang.Throwable -> L18
            boolean r1 = r0.o     // Catch: java.lang.Throwable -> L18
            if (r1 != 0) goto L1c
            boolean r0 = r0.c     // Catch: java.lang.Throwable -> L18
            if (r0 == 0) goto L1c
            q87 r0 = r2.h     // Catch: java.lang.Throwable -> L18
            boolean r1 = r0.c     // Catch: java.lang.Throwable -> L18
            if (r1 != 0) goto L1a
            boolean r0 = r0.b     // Catch: java.lang.Throwable -> L18
            if (r0 == 0) goto L1c
            goto L1a
        L18:
            r0 = move-exception
            goto L35
        L1a:
            r0 = 1
            goto L1d
        L1c:
            r0 = 0
        L1d:
            boolean r1 = r2.i()     // Catch: java.lang.Throwable -> L18
            monitor-exit(r2)
            if (r0 == 0) goto L2b
            r0 = 9
            r1 = 0
            r2.c(r0, r1)
            return
        L2b:
            if (r1 != 0) goto L34
            m87 r0 = r2.n
            int r1 = r2.m
            r0.i(r1)
        L34:
            return
        L35:
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t87.a():void");
    }

    public final void b() throws IOException {
        q87 q87Var = this.h;
        if (q87Var.b) {
            throw new IOException("stream closed");
        }
        if (q87Var.c) {
            throw new IOException("stream finished");
        }
        if (this.k != 0) {
            IOException iOException = this.l;
            if (iOException == null) {
                throw new StreamResetException(this.k);
            }
        }
    }

    public final void c(int i, IOException iOException) {
        if (d(i, iOException)) {
            this.n.G0.P(this.m, i);
        }
    }

    public final boolean d(int i, IOException iOException) {
        byte[] bArr = yxg.a;
        synchronized (this) {
            if (this.k != 0) {
                return false;
            }
            if (this.g.o && this.h.c) {
                return false;
            }
            this.k = i;
            this.l = iOException;
            notifyAll();
            this.n.i(this.m);
            return true;
        }
    }

    public final void e(int i) {
        if (d(i, null)) {
            this.n.P(this.m, i);
        }
    }

    public final synchronized int f() {
        return this.k;
    }

    public final q87 g() {
        synchronized (this) {
            if (!this.f && !h()) {
                throw new IllegalStateException("reply before requesting the sink");
            }
        }
        return this.h;
    }

    public final boolean h() {
        boolean z = (this.m & 1) == 1;
        this.n.getClass();
        return true == z;
    }

    public final synchronized boolean i() {
        try {
            if (this.k != 0) {
                return false;
            }
            r87 r87Var = this.g;
            if (r87Var.o || r87Var.c) {
                q87 q87Var = this.h;
                if (q87Var.c || q87Var.b) {
                    if (this.f) {
                        return false;
                    }
                }
            }
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void j(j17 j17Var, boolean z) {
        boolean zI;
        byte[] bArr = yxg.a;
        synchronized (this) {
            try {
                if (this.f && z) {
                    this.g.getClass();
                } else {
                    this.f = true;
                    this.e.add(j17Var);
                }
                if (z) {
                    this.g.o = true;
                }
                zI = i();
                notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zI) {
            return;
        }
        this.n.i(this.m);
    }
}
