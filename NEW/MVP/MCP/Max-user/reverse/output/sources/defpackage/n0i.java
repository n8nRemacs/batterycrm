package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.util.Random;
import java.util.zip.Deflater;

/* loaded from: classes.dex */
public final class n0i implements Closeable {
    public final vv0 Y;
    public final Random Z;
    public final qu0 b;
    public boolean c;
    public ti9 d;
    public final boolean s0;
    public final boolean t0;
    public final long u0;
    public final qu0 a = new qu0();
    public final byte[] o = new byte[4];
    public final iu0 X = new iu0();

    public n0i(vv0 vv0Var, Random random, boolean z, boolean z2, long j) {
        this.Y = vv0Var;
        this.Z = random;
        this.s0 = z;
        this.t0 = z2;
        this.u0 = j;
        this.b = vv0Var.getBuffer();
    }

    public final void c(int i, xx0 xx0Var) throws IOException {
        if (this.c) {
            throw new IOException("closed");
        }
        int iD = xx0Var.d();
        if (iD > 125) {
            throw new IllegalArgumentException("Payload size must be less than or equal to 125");
        }
        qu0 qu0Var = this.b;
        qu0Var.q0(i | 128);
        qu0Var.q0(iD | 128);
        Random random = this.Z;
        byte[] bArr = this.o;
        random.nextBytes(bArr);
        qu0Var.n0(bArr.length, bArr);
        if (iD > 0) {
            long j = qu0Var.b;
            xx0Var.m(qu0Var, xx0Var.d());
            iu0 iu0Var = this.X;
            qu0Var.h0(iu0Var);
            iu0Var.d(j);
            ori.b(iu0Var, bArr);
            iu0Var.close();
        }
        this.Y.flush();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        ti9 ti9Var = this.d;
        if (ti9Var != null) {
            ti9Var.close();
        }
    }

    public final void d(xx0 xx0Var) throws IOException {
        int i;
        if (this.c) {
            throw new IOException("closed");
        }
        int iD = xx0Var.d();
        qu0 qu0Var = this.a;
        xx0Var.m(qu0Var, iD);
        if (!this.s0 || xx0Var.c.length < this.u0) {
            i = 129;
        } else {
            ti9 ti9Var = this.d;
            if (ti9Var == null) {
                ti9Var = new ti9(this.t0, 0);
                this.d = ti9Var;
            }
            ls4 ls4Var = (ls4) ti9Var.o;
            qu0 qu0Var2 = ti9Var.b;
            if (qu0Var2.b != 0) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (ti9Var.c) {
                ((Deflater) ti9Var.d).reset();
            }
            ls4Var.L(qu0Var, qu0Var.b);
            ls4Var.flush();
            xx0 xx0Var2 = ui9.a;
            long j = qu0Var2.b;
            byte[] bArr = xx0Var2.c;
            long length = j - bArr.length;
            int length2 = bArr.length;
            if (length < 0 || length2 < 0 || j - length < length2 || bArr.length < length2) {
                qu0Var2.q0(0);
                qu0Var.L(qu0Var2, qu0Var2.b);
                i = 193;
            } else {
                for (int i2 = 0; i2 < length2; i2++) {
                    if (qu0Var2.Q(i2 + length) != xx0Var2.c[i2]) {
                        qu0Var2.q0(0);
                        break;
                    }
                }
                long j2 = qu0Var2.b - 4;
                iu0 iu0Var = new iu0();
                qu0Var2.h0(iu0Var);
                try {
                    iu0Var.c(j2);
                    iu0Var.close();
                    qu0Var.L(qu0Var2, qu0Var2.b);
                    i = 193;
                } finally {
                }
            }
        }
        long j3 = qu0Var.b;
        qu0 qu0Var3 = this.b;
        qu0Var3.q0(i);
        if (j3 <= 125) {
            qu0Var3.q0(((int) j3) | 128);
        } else if (j3 <= 65535) {
            qu0Var3.q0(254);
            qu0Var3.u0((int) j3);
        } else {
            qu0Var3.q0(255);
            w9e w9eVarM0 = qu0Var3.m0(8);
            byte[] bArr2 = w9eVarM0.a;
            int i3 = w9eVarM0.c;
            bArr2[i3] = (byte) ((j3 >>> 56) & 255);
            bArr2[i3 + 1] = (byte) ((j3 >>> 48) & 255);
            bArr2[i3 + 2] = (byte) ((j3 >>> 40) & 255);
            bArr2[i3 + 3] = (byte) ((j3 >>> 32) & 255);
            bArr2[i3 + 4] = (byte) ((j3 >>> 24) & 255);
            bArr2[i3 + 5] = (byte) ((j3 >>> 16) & 255);
            bArr2[i3 + 6] = (byte) ((j3 >>> 8) & 255);
            bArr2[i3 + 7] = (byte) (j3 & 255);
            w9eVarM0.c = i3 + 8;
            qu0Var3.b += 8;
        }
        Random random = this.Z;
        byte[] bArr3 = this.o;
        random.nextBytes(bArr3);
        qu0Var3.n0(bArr3.length, bArr3);
        if (j3 > 0) {
            iu0 iu0Var2 = this.X;
            qu0Var.h0(iu0Var2);
            iu0Var2.d(0L);
            ori.b(iu0Var2, bArr3);
            iu0Var2.close();
        }
        qu0Var3.L(qu0Var, j3);
        this.Y.u();
    }
}
