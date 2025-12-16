package defpackage;

import java.io.IOException;
import java.net.SocketTimeoutException;
import java.nio.ByteBuffer;
import java.time.Duration;
import java.time.Instant;
import ru.ok.android.onelog.impl.BuildConfig;
import tech.kwik.core.impl.TransportError;

/* loaded from: classes3.dex */
public final class glf extends elf {
    public long Z;
    public final ctc a;
    public final bh8 b;
    public volatile boolean c;
    public volatile boolean d;
    public volatile Thread o;
    public final long s0;
    public long t0;
    public long u0;
    public volatile boolean v0;
    public final Object Y = new Object();
    public volatile long w0 = -1;
    public final acd X = new acd();

    public glf(ctc ctcVar, long j, bh8 bh8Var) {
        this.a = ctcVar;
        this.b = bh8Var;
        this.u0 = j;
        this.Z = j;
        this.s0 = (long) (j * 0.1f);
    }

    public static void Z(glf glfVar, atc atcVar) {
        ctc ctcVar = glfVar.a;
        ctcVar.b.k(new mr8(ctcVar.a, glfVar.u0), new flf(glfVar, 0), false);
        ctcVar.d.recovery("Retransmitted max stream data, because lost frame " + atcVar);
    }

    @Override // defpackage.elf
    public final long P() {
        return this.t0;
    }

    @Override // defpackage.elf
    public final long Q(long j) throws TransportError {
        if (this.w0 >= 0 && j != this.w0) {
            throw new TransportError(7);
        }
        long j2 = this.t0;
        if (j < j2) {
            throw new TransportError(7);
        }
        long j3 = j - j2;
        if (this.w0 < 0) {
            this.w0 = j;
        }
        if (!this.v0 && !this.c && !this.d) {
            this.d = true;
            this.a.f((int) (this.w0 - this.X.d));
            acd acdVar = this.X;
            acdVar.g = true;
            acdVar.a.clear();
            acdVar.b.clear();
            Thread thread = this.o;
            if (thread != null) {
                thread.interrupt();
            }
            this.a.b();
        }
        return j3;
    }

    @Override // java.io.InputStream
    public final int available() {
        acd acdVar = this.X;
        long j = acdVar.c - acdVar.d;
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) j;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        w(0L);
    }

    public final void h0(int i) {
        this.u0 += i;
        ctc ctcVar = this.a;
        ctcVar.f(i);
        long j = this.u0;
        if (j - this.Z > this.s0) {
            ctcVar.b.k(new mr8(ctcVar.a, j), new flf(this, 0), true);
            this.Z = this.u0;
        }
    }

    @Override // defpackage.elf
    public final void l() {
        this.v0 = true;
        Thread thread = this.o;
        if (thread != null) {
            thread.interrupt();
        }
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        byte[] bArr = new byte[1];
        int i = read(bArr, 0, 1);
        if (i == 1) {
            return bArr[0] & 255;
        }
        if (i < 0) {
            return -1;
        }
        throw new RuntimeException();
    }

    @Override // defpackage.elf
    public final void w(long j) {
        acd acdVar = this.X;
        if (acdVar.e < 0 || acdVar.c != acdVar.e) {
            ctc ctcVar = this.a;
            ysc yscVar = ctcVar.b;
            int i = ctcVar.a;
            mr8 mr8Var = new mr8(1);
            mr8Var.b = i;
            mr8Var.c = j;
            yscVar.k(mr8Var, new flf(this, 1), true);
        }
        this.c = true;
        acd acdVar2 = this.X;
        acdVar2.g = true;
        acdVar2.a.clear();
        acdVar2.b.clear();
        Thread thread = this.o;
        if (thread != null) {
            thread.interrupt();
        }
        this.a.b();
    }

    @Override // defpackage.elf
    public final long y(dlf dlfVar) throws TransportError {
        long jMax;
        if (this.w0 >= 0 && dlfVar.b() > this.w0) {
            throw new TransportError(7);
        }
        if (this.w0 >= 0 && dlfVar.X && dlfVar.b() != this.w0) {
            throw new TransportError(7);
        }
        if (dlfVar.X) {
            this.w0 = dlfVar.b();
        }
        if (this.v0 || this.c || this.d) {
            return 0L;
        }
        synchronized (this.Y) {
            try {
                if (dlfVar.b() > this.u0) {
                    this.b.error("Flow control error on stream " + this.a.a + ": frame up to offset " + dlfVar.b() + " exceeds flow control limit " + this.u0);
                    throw new TransportError(4);
                }
                this.X.a(dlfVar);
                jMax = Long.max(0L, dlfVar.b() - this.t0);
                this.t0 = Long.max(this.t0, dlfVar.b());
                this.Y.notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
        return jMax;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        Instant instantNow = Instant.now();
        long jMax = Long.MAX_VALUE;
        while (!this.v0 && !this.c && !this.d) {
            synchronized (this.Y) {
                try {
                    this.o = Thread.currentThread();
                    int iD = this.X.d(ByteBuffer.wrap(bArr, i, i2));
                    if (iD > 0) {
                        h0(iD);
                        return iD;
                    }
                    if (iD < 0) {
                        this.a.b();
                        return -1;
                    }
                    try {
                        this.Y.wait(jMax);
                    } catch (InterruptedException unused) {
                    }
                    acd acdVar = this.X;
                    if (acdVar.c - acdVar.d == 0) {
                        long millis = Duration.between(instantNow, Instant.now()).toMillis();
                        if (millis <= BuildConfig.MAX_TIME_TO_UPLOAD) {
                            jMax = Long.max(1L, BuildConfig.MAX_TIME_TO_UPLOAD - millis);
                        } else {
                            throw new SocketTimeoutException("Read timeout on stream " + this.a.a + "; read up to " + this.X.d);
                        }
                    }
                } finally {
                    this.o = null;
                }
            }
        }
        throw new IOException(!this.v0 ? this.c ? "Stream closed" : "Stream reset by peer" : "Connection closed");
    }
}
