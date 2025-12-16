package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import okhttp3.internal.http2.StreamResetException;

/* loaded from: classes.dex */
public final class r87 implements x6f {
    public final /* synthetic */ t87 X;
    public final qu0 a = new qu0();
    public final qu0 b = new qu0();
    public boolean c;
    public final long d;
    public boolean o;

    public r87(t87 t87Var, long j, boolean z) {
        this.X = t87Var;
        this.d = j;
        this.o = z;
    }

    @Override // defpackage.x6f
    public final long b(qu0 qu0Var, long j) throws Throwable {
        Throwable streamResetException;
        boolean z;
        long jB;
        long j2 = 0;
        if (j < 0) {
            throw new IllegalArgumentException(vb9.e(j, "byteCount < 0: ").toString());
        }
        while (true) {
            synchronized (this.X) {
                this.X.i.i();
                try {
                    if (this.X.f() != 0) {
                        streamResetException = this.X.l;
                        if (streamResetException == null) {
                            streamResetException = new StreamResetException(this.X.f());
                        }
                    } else {
                        streamResetException = null;
                    }
                    if (this.c) {
                        throw new IOException("stream closed");
                    }
                    qu0 qu0Var2 = this.b;
                    long j3 = qu0Var2.b;
                    z = false;
                    if (j3 > j2) {
                        jB = qu0Var2.b(qu0Var, Math.min(j, j3));
                        t87 t87Var = this.X;
                        long j4 = t87Var.a + jB;
                        t87Var.a = j4;
                        long j5 = j4 - t87Var.b;
                        if (streamResetException == null && j5 >= t87Var.n.z0.a() / 2) {
                            t87 t87Var2 = this.X;
                            t87Var2.n.Q(t87Var2.m, j5);
                            t87 t87Var3 = this.X;
                            t87Var3.b = t87Var3.a;
                        }
                    } else {
                        if (!this.o && streamResetException == null) {
                            try {
                                this.X.wait();
                                z = true;
                            } catch (InterruptedException unused) {
                                Thread.currentThread().interrupt();
                                throw new InterruptedIOException();
                            }
                        }
                        jB = -1;
                    }
                    this.X.i.l();
                } catch (Throwable th) {
                    this.X.i.l();
                    throw th;
                }
            }
            if (!z) {
                if (jB != -1) {
                    c(jB);
                    return jB;
                }
                if (streamResetException == null) {
                    return -1L;
                }
                throw streamResetException;
            }
            j2 = 0;
        }
    }

    public final void c(long j) {
        byte[] bArr = yxg.a;
        this.X.n.w(j);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        long j;
        synchronized (this.X) {
            this.c = true;
            qu0 qu0Var = this.b;
            j = qu0Var.b;
            qu0Var.l();
            t87 t87Var = this.X;
            if (t87Var == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.Object");
            }
            t87Var.notifyAll();
        }
        if (j > 0) {
            c(j);
        }
        this.X.a();
    }

    @Override // defpackage.x6f
    public final u9g m() {
        return this.X.i;
    }
}
