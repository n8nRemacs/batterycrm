package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class u87 implements Closeable {
    public static final Logger X = Logger.getLogger(d87.class.getName());
    public final qu0 a;
    public int b;
    public boolean c;
    public final v77 d;
    public final vv0 o;

    public u87(ibd ibdVar) {
        this.o = ibdVar;
        qu0 qu0Var = new qu0();
        this.a = qu0Var;
        this.b = 16384;
        this.d = new v77(qu0Var);
    }

    public final synchronized void P(int i, int i2) {
        if (this.c) {
            throw new IOException("closed");
        }
        if (az1.v(i2) == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        i(i, 4, 3, 0);
        this.o.writeInt(az1.v(i2));
        this.o.flush();
    }

    public final synchronized void Q(int i, long j) {
        if (this.c) {
            throw new IOException("closed");
        }
        if (j == 0 || j > 2147483647L) {
            throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j).toString());
        }
        i(i, 4, 8, 0);
        this.o.writeInt((int) j);
        this.o.flush();
    }

    public final synchronized void c(yme ymeVar) {
        try {
            if (this.c) {
                throw new IOException("closed");
            }
            int i = this.b;
            int i2 = ymeVar.a;
            if ((i2 & 32) != 0) {
                i = ymeVar.b[5];
            }
            this.b = i;
            if (((i2 & 2) != 0 ? ymeVar.b[1] : -1) != -1) {
                v77 v77Var = this.d;
                int iMin = Math.min((i2 & 2) != 0 ? ymeVar.b[1] : -1, 16384);
                int i3 = v77Var.c;
                if (i3 != iMin) {
                    if (iMin < i3) {
                        v77Var.a = Math.min(v77Var.a, iMin);
                    }
                    v77Var.b = true;
                    v77Var.c = iMin;
                    int i4 = v77Var.g;
                    if (iMin < i4) {
                        if (iMin == 0) {
                            c17[] c17VarArr = v77Var.d;
                            Arrays.fill(c17VarArr, 0, c17VarArr.length, (Object) null);
                            v77Var.e = v77Var.d.length - 1;
                            v77Var.f = 0;
                            v77Var.g = 0;
                        } else {
                            v77Var.a(i4 - iMin);
                        }
                    }
                }
            }
            i(0, 0, 4, 1);
            this.o.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.c = true;
        this.o.close();
    }

    public final synchronized void d(boolean z, int i, qu0 qu0Var, int i2) {
        if (this.c) {
            throw new IOException("closed");
        }
        i(i, i2, 0, z ? 1 : 0);
        if (i2 > 0) {
            this.o.L(qu0Var, i2);
        }
    }

    public final synchronized void flush() {
        if (this.c) {
            throw new IOException("closed");
        }
        this.o.flush();
    }

    public final void i(int i, int i2, int i3, int i4) {
        Level level = Level.FINE;
        Logger logger = X;
        if (logger.isLoggable(level)) {
            logger.fine(d87.a(false, i, i2, i3, i4));
        }
        if (i2 > this.b) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.b + ": " + i2).toString());
        }
        if ((((int) 2147483648L) & i) != 0) {
            throw new IllegalArgumentException(ho7.f(i, "reserved bit set: ").toString());
        }
        byte[] bArr = yxg.a;
        vv0 vv0Var = this.o;
        vv0Var.writeByte((i2 >>> 16) & 255);
        vv0Var.writeByte((i2 >>> 8) & 255);
        vv0Var.writeByte(i2 & 255);
        vv0Var.writeByte(i3 & 255);
        vv0Var.writeByte(i4 & 255);
        vv0Var.writeInt(i & Integer.MAX_VALUE);
    }

    public final synchronized void l(int i, byte[] bArr, int i2) {
        if (this.c) {
            throw new IOException("closed");
        }
        if (az1.v(i2) == -1) {
            throw new IllegalArgumentException("errorCode.httpCode == -1");
        }
        i(0, bArr.length + 8, 7, 0);
        this.o.writeInt(i);
        this.o.writeInt(az1.v(i2));
        if (bArr.length != 0) {
            this.o.write(bArr);
        }
        this.o.flush();
    }

    public final synchronized void w(int i, ArrayList arrayList, boolean z) {
        if (this.c) {
            throw new IOException("closed");
        }
        this.d.d(arrayList);
        long j = this.a.b;
        long jMin = Math.min(this.b, j);
        int i2 = j == jMin ? 4 : 0;
        if (z) {
            i2 |= 1;
        }
        i(i, (int) jMin, 1, i2);
        this.o.L(this.a, jMin);
        if (j > jMin) {
            long j2 = j - jMin;
            while (j2 > 0) {
                long jMin2 = Math.min(this.b, j2);
                j2 -= jMin2;
                i(i, (int) jMin2, 9, j2 == 0 ? 4 : 0);
                this.o.L(this.a, jMin2);
            }
        }
    }

    public final synchronized void y(int i, int i2, boolean z) {
        if (this.c) {
            throw new IOException("closed");
        }
        i(0, 8, 6, z ? 1 : 0);
        this.o.writeInt(i);
        this.o.writeInt(i2);
        this.o.flush();
    }
}
