package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.HashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import tech.kwik.core.impl.ImplementationError;

/* loaded from: classes3.dex */
public class qlf extends nlf implements c36 {
    public final w7c X;
    public long Y;
    public boolean Z;
    public final ctc a;
    public final Object b = new Object();
    public final zce c;
    public final bh8 d;
    public final int o;
    public volatile boolean s0;
    public volatile boolean t0;
    public volatile long u0;
    public long v0;
    public final b36 w0;
    public volatile boolean x0;

    public qlf(ctc ctcVar, b36 b36Var, bh8 bh8Var) {
        long j;
        this.a = ctcVar;
        this.w0 = b36Var;
        zce zceVar = new zce();
        this.c = zceVar;
        this.d = bh8Var;
        this.o = zceVar.c;
        w7c w7cVar = new w7c();
        w7cVar.a = new ConcurrentLinkedQueue();
        this.X = w7cVar;
        b36Var.getClass();
        int i = ctcVar.a;
        synchronized (b36Var) {
            try {
                if (!b36Var.g.containsKey(Integer.valueOf(i))) {
                    HashMap map = b36Var.g;
                    Integer numValueOf = Integer.valueOf(i);
                    if (ctcVar.d()) {
                        j = b36Var.d;
                    } else {
                        int i2 = ctcVar.a & 3;
                        if (i2 == 0) {
                            j = b36Var.c;
                        } else {
                            if (i2 != 1) {
                                throw new ImplementationError();
                            }
                            j = b36Var.b;
                        }
                    }
                    map.put(numValueOf, Long.valueOf(j));
                    b36Var.h.put(Integer.valueOf(i), 0L);
                }
                if (i > b36Var.k) {
                    b36Var.k = i;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        b36Var.j.put(Integer.valueOf(ctcVar.a), this);
    }

    public static atc P(qlf qlfVar) {
        b36 b36Var = qlfVar.w0;
        ctc ctcVar = qlfVar.a;
        b36Var.getClass();
        int i = ctcVar.a;
        HashMap map = b36Var.g;
        int i2 = 3;
        if (map.containsKey(Integer.valueOf(i))) {
            if (((Long) b36Var.h.get(Integer.valueOf(i))).equals(map.get(Integer.valueOf(i)))) {
                i2 = 2;
            } else if (b36Var.e == b36Var.f) {
                i2 = 1;
            }
        }
        int iV = az1.v(i2);
        if (iV == 0) {
            long j = b36Var.e;
            zd4 zd4Var = new zd4(0);
            zd4Var.b = j;
            return zd4Var;
        }
        if (iV != 1) {
            return null;
        }
        int i3 = ctcVar.a;
        long j2 = qlfVar.Y;
        mr8 mr8Var = new mr8(2);
        mr8Var.b = i3;
        mr8Var.c = j2;
        return mr8Var;
    }

    public static void y(qlf qlfVar, atc atcVar) {
        if (qlfVar.t0) {
            return;
        }
        ((ConcurrentLinkedQueue) qlfVar.X.a).add((dlf) atcVar);
        int i = 1;
        qlfVar.a.b.l(new olf(qlfVar, i), 20, qlfVar.h0(), new plf(qlfVar, i), true);
    }

    public final void Q() throws IOException {
        if (this.Z || this.t0) {
            throw new IOException("output stream ".concat(this.Z ? "already closed" : "is reset"));
        }
        if (this.x0) {
            throw new IOException("output aborted because connection is closed");
        }
    }

    public void Z() {
        this.w0.j.remove(Integer.valueOf(this.a.a));
        b36 b36Var = this.w0;
        ctc ctcVar = this.a;
        b36Var.getClass();
        int i = ctcVar.a;
        synchronized (b36Var) {
            b36Var.h.remove(Integer.valueOf(i));
            b36Var.g.remove(Integer.valueOf(i));
        }
        this.a.e();
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.Z || this.x0 || this.t0) {
            return;
        }
        zce zceVar = this.c;
        zceVar.a.add(zceVar.b);
        this.Z = true;
        synchronized (this.b) {
            try {
                if (!this.s0) {
                    this.s0 = true;
                    this.a.b.l(new olf(this, 1), 20, h0(), new plf(this, 1), true);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        Q();
    }

    public hf5 h0() {
        return hf5.d;
    }

    public final void i0() {
        long j = this.Y;
        StringBuilder sb = new StringBuilder();
        ctc ctcVar = this.a;
        sb.append(ctcVar);
        sb.append(" unblocked at ");
        sb.append(j);
        this.d.stream(sb.toString());
        int i = 1;
        ctcVar.b.l(new olf(this, i), 20, h0(), new plf(this, i), false);
    }

    @Override // defpackage.nlf
    public final void l() {
        this.x0 = true;
        Thread thread = this.c.g;
        if (thread != null) {
            thread.interrupt();
        }
    }

    @Override // defpackage.nlf
    public final void w(long j) {
        if (this.Z || this.t0) {
            return;
        }
        this.t0 = true;
        this.u0 = j;
        zce zceVar = this.c;
        zceVar.a.clear();
        zceVar.d.set(0);
        this.a.b.l(new olf(this, 2), epi.a(j) + epi.a(r1.a) + 1 + 8, hf5.d, new plf(this, 2), true);
        Thread thread = this.c.g;
        if (thread != null) {
            thread.interrupt();
        }
        this.a.e();
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        Q();
        try {
            int i3 = this.o;
            if (i2 <= i3) {
                this.c.a(bArr, i, i2);
                synchronized (this.b) {
                    try {
                        if (!this.s0) {
                            this.s0 = true;
                            this.a.b.l(new olf(this, 1), 20, h0(), new plf(this, 1), true);
                        }
                    } finally {
                    }
                }
                return;
            }
            int i4 = i3 / 2;
            int i5 = i2 / i4;
            for (int i6 = 0; i6 < i5; i6++) {
                write(bArr, (i6 * i4) + i, i4);
            }
            int i7 = i2 % i4;
            if (i7 > 0) {
                write(bArr, (i5 * i4) + i, i7);
            }
        } catch (InterruptedException unused) {
            throw new InterruptedIOException("write failed because stream was ".concat(!this.Z ? this.t0 ? "reset" : "aborted" : "closed"));
        }
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        write(new byte[]{(byte) i}, 0, 1);
    }
}
