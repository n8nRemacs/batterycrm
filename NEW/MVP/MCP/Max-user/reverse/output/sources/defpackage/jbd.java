package defpackage;

import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import org.apache.http.HttpStatus;
import ru.ok.android.onelog.impl.BuildConfig;

/* loaded from: classes.dex */
public final class jbd implements wv0 {
    public final qu0 a = new qu0();
    public boolean b;
    public final x6f c;

    public jbd(x6f x6fVar) {
        this.c = x6fVar;
    }

    @Override // defpackage.wv0
    public final long H(ux uxVar) {
        qu0 qu0Var;
        long j = 0;
        while (true) {
            x6f x6fVar = this.c;
            qu0Var = this.a;
            if (x6fVar.b(qu0Var, 8192) == -1) {
                break;
            }
            long jW = qu0Var.w();
            if (jW > 0) {
                j += jW;
                uxVar.L(qu0Var, jW);
            }
        }
        long j2 = qu0Var.b;
        if (j2 <= 0) {
            return j;
        }
        long j3 = j + j2;
        uxVar.L(qu0Var, j2);
        return j3;
    }

    @Override // defpackage.wv0
    public final String M(Charset charset) {
        x6f x6fVar = this.c;
        qu0 qu0Var = this.a;
        qu0Var.p0(x6fVar);
        return qu0Var.j0(qu0Var.b, charset);
    }

    @Override // defpackage.wv0
    public final void O(qu0 qu0Var, long j) throws EOFException {
        qu0 qu0Var2 = this.a;
        try {
            d0(j);
            qu0Var2.O(qu0Var, j);
        } catch (EOFException e) {
            qu0Var.p0(qu0Var2);
            throw e;
        }
    }

    public final boolean P(long j) {
        qu0 qu0Var;
        if (j < 0) {
            throw new IllegalArgumentException(vb9.e(j, "byteCount < 0: ").toString());
        }
        if (this.b) {
            throw new IllegalStateException("closed");
        }
        do {
            qu0Var = this.a;
            if (qu0Var.b >= j) {
                return true;
            }
        } while (this.c.b(qu0Var, 8192) != -1);
        return false;
    }

    @Override // defpackage.wv0
    public final String T() {
        return j(BuildConfig.MAX_TIME_TO_UPLOAD);
    }

    @Override // defpackage.wv0
    public final int Y(ejb ejbVar) throws EOFException {
        if (this.b) {
            throw new IllegalStateException("closed");
        }
        while (true) {
            qu0 qu0Var = this.a;
            int iB = bv0.b(qu0Var, ejbVar, true);
            if (iB == -2) {
                if (this.c.b(qu0Var, 8192) == -1) {
                    break;
                }
            } else if (iB != -1) {
                qu0Var.skip(ejbVar.a[iB].d());
                return iB;
            }
        }
        return -1;
    }

    @Override // defpackage.x6f
    public final long b(qu0 qu0Var, long j) {
        if (j < 0) {
            throw new IllegalArgumentException(vb9.e(j, "byteCount < 0: ").toString());
        }
        if (this.b) {
            throw new IllegalStateException("closed");
        }
        qu0 qu0Var2 = this.a;
        if (qu0Var2.b == 0) {
            if (this.c.b(qu0Var2, 8192) == -1) {
                return -1L;
            }
        }
        return qu0Var2.b(qu0Var, Math.min(j, qu0Var2.b));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        if (this.b) {
            return;
        }
        this.b = true;
        this.c.close();
        this.a.l();
    }

    @Override // defpackage.wv0
    public final void d0(long j) throws EOFException {
        if (!P(j)) {
            throw new EOFException();
        }
    }

    @Override // defpackage.wv0
    public final xx0 e(long j) throws EOFException {
        d0(j);
        return this.a.e(j);
    }

    @Override // defpackage.wv0
    public final long f0() throws EOFException {
        qu0 qu0Var;
        byte bQ;
        d0(1L);
        int i = 0;
        while (true) {
            int i2 = i + 1;
            boolean zP = P(i2);
            qu0Var = this.a;
            if (!zP) {
                break;
            }
            bQ = qu0Var.Q(i);
            if ((bQ < ((byte) 48) || bQ > ((byte) 57)) && ((bQ < ((byte) 97) || bQ > ((byte) HttpStatus.SC_PROCESSING)) && (bQ < ((byte) 65) || bQ > ((byte) 70)))) {
                break;
            }
            i = i2;
        }
        if (i == 0) {
            ozi.a(16);
            ozi.a(16);
            throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(Integer.toString(bQ, 16)));
        }
        return qu0Var.f0();
    }

    @Override // defpackage.wv0
    public final InputStream g0() {
        return new ju0(this, 1);
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.b;
    }

    @Override // defpackage.wv0
    public final String j(long j) throws EOFException {
        if (j < 0) {
            throw new IllegalArgumentException(vb9.e(j, "limit < 0: ").toString());
        }
        long j2 = j == BuildConfig.MAX_TIME_TO_UPLOAD ? Long.MAX_VALUE : j + 1;
        byte b = (byte) 10;
        long jW = w(b, 0L, j2);
        qu0 qu0Var = this.a;
        if (jW != -1) {
            return bv0.a(qu0Var, jW);
        }
        if (j2 < BuildConfig.MAX_TIME_TO_UPLOAD && P(j2) && qu0Var.Q(j2 - 1) == ((byte) 13) && P(j2 + 1) && qu0Var.Q(j2) == b) {
            return bv0.a(qu0Var, j2);
        }
        qu0 qu0Var2 = new qu0();
        qu0Var.y(qu0Var2, 0L, Math.min(32, qu0Var.b));
        throw new EOFException("\\n not found: limit=" + Math.min(qu0Var.b, j) + " content=" + qu0Var2.e(qu0Var2.b).e() + "…");
    }

    public final boolean l() {
        if (this.b) {
            throw new IllegalStateException("closed");
        }
        qu0 qu0Var = this.a;
        if (qu0Var.P()) {
            return this.c.b(qu0Var, (long) 8192) == -1;
        }
        return false;
    }

    @Override // defpackage.x6f
    public final u9g m() {
        return this.c.m();
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        qu0 qu0Var = this.a;
        if (qu0Var.b == 0) {
            if (this.c.b(qu0Var, 8192) == -1) {
                return -1;
            }
        }
        return qu0Var.read(byteBuffer);
    }

    @Override // defpackage.wv0
    public final byte readByte() throws EOFException {
        d0(1L);
        return this.a.readByte();
    }

    @Override // defpackage.wv0
    public final void readFully(byte[] bArr) throws EOFException {
        qu0 qu0Var = this.a;
        try {
            d0(bArr.length);
            qu0Var.readFully(bArr);
        } catch (EOFException e) {
            int i = 0;
            while (true) {
                long j = qu0Var.b;
                if (j <= 0) {
                    throw e;
                }
                int i2 = qu0Var.read(bArr, i, (int) j);
                if (i2 == -1) {
                    throw new AssertionError();
                }
                i += i2;
            }
        }
    }

    @Override // defpackage.wv0
    public final int readInt() throws EOFException {
        d0(4L);
        return this.a.readInt();
    }

    @Override // defpackage.wv0
    public final long readLong() throws EOFException {
        d0(8L);
        return this.a.readLong();
    }

    @Override // defpackage.wv0
    public final short readShort() throws EOFException {
        d0(2L);
        return this.a.readShort();
    }

    @Override // defpackage.wv0
    public final void skip(long j) throws EOFException {
        if (this.b) {
            throw new IllegalStateException("closed");
        }
        while (j > 0) {
            qu0 qu0Var = this.a;
            if (qu0Var.b == 0) {
                if (this.c.b(qu0Var, 8192) == -1) {
                    throw new EOFException();
                }
            }
            long jMin = Math.min(j, qu0Var.b);
            qu0Var.skip(jMin);
            j -= jMin;
        }
    }

    public final String toString() {
        return "buffer(" + this.c + ')';
    }

    public final long w(byte b, long j, long j2) {
        if (this.b) {
            throw new IllegalStateException("closed");
        }
        if (j2 < 0) {
            throw new IllegalArgumentException(vb9.e(j2, "fromIndex=0 toIndex=").toString());
        }
        long jMax = 0;
        while (jMax < j2) {
            qu0 qu0Var = this.a;
            byte b2 = b;
            long j3 = j2;
            long jZ = qu0Var.Z(b2, jMax, j3);
            if (jZ == -1) {
                long j4 = qu0Var.b;
                if (j4 >= j3) {
                    break;
                }
                if (this.c.b(qu0Var, 8192) == -1) {
                    break;
                }
                jMax = Math.max(jMax, j4);
                b = b2;
                j2 = j3;
            } else {
                return jZ;
            }
        }
        return -1L;
    }

    public final int y() throws EOFException {
        d0(4L);
        int i = this.a.readInt();
        return ((i & 255) << 24) | (((-16777216) & i) >>> 24) | ((16711680 & i) >>> 8) | ((65280 & i) << 8);
    }
}
