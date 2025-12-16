package defpackage;

import java.io.Closeable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class iu0 implements Closeable {
    public qu0 a;
    public boolean b;
    public w9e c;
    public byte[] o;
    public long d = -1;
    public int X = -1;
    public int Y = -1;

    public final void c(long j) {
        qu0 qu0Var = this.a;
        if (qu0Var == null) {
            throw new IllegalStateException("not attached to a buffer");
        }
        if (!this.b) {
            throw new IllegalStateException("resizeBuffer() only permitted for read/write buffers");
        }
        long j2 = qu0Var.b;
        if (j <= j2) {
            if (j < 0) {
                throw new IllegalArgumentException(vb9.e(j, "newSize < 0: ").toString());
            }
            long j3 = j2 - j;
            while (true) {
                if (j3 <= 0) {
                    break;
                }
                w9e w9eVar = qu0Var.a.g;
                int i = w9eVar.c;
                long j4 = i - w9eVar.b;
                if (j4 > j3) {
                    w9eVar.c = i - ((int) j3);
                    break;
                } else {
                    qu0Var.a = w9eVar.a();
                    oae.a(w9eVar);
                    j3 -= j4;
                }
            }
            this.c = null;
            this.d = j;
            this.o = null;
            this.X = -1;
            this.Y = -1;
        } else if (j > j2) {
            long j5 = j - j2;
            int i2 = 1;
            boolean z = true;
            for (long j6 = 0; j5 > j6; j6 = 0) {
                w9e w9eVarM0 = qu0Var.m0(i2);
                int iMin = (int) Math.min(j5, 8192 - w9eVarM0.c);
                int i3 = w9eVarM0.c + iMin;
                w9eVarM0.c = i3;
                j5 -= iMin;
                if (z) {
                    this.c = w9eVarM0;
                    this.d = j2;
                    this.o = w9eVarM0.a;
                    this.X = i3 - iMin;
                    this.Y = i3;
                    z = false;
                }
                i2 = 1;
            }
        }
        qu0Var.b = j;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (!(this.a != null)) {
            throw new IllegalStateException("not attached to a buffer");
        }
        this.a = null;
        this.c = null;
        this.d = -1L;
        this.o = null;
        this.X = -1;
        this.Y = -1;
    }

    public final int d(long j) {
        qu0 qu0Var = this.a;
        if (qu0Var == null) {
            throw new IllegalStateException("not attached to a buffer");
        }
        if (j >= -1) {
            long j2 = qu0Var.b;
            if (j <= j2) {
                if (j == -1 || j == j2) {
                    this.c = null;
                    this.d = j;
                    this.o = null;
                    this.X = -1;
                    this.Y = -1;
                    return -1;
                }
                w9e w9eVar = qu0Var.a;
                w9e w9eVar2 = this.c;
                long j3 = 0;
                if (w9eVar2 != null) {
                    long j4 = this.d - (this.X - w9eVar2.b);
                    if (j4 > j) {
                        w9eVar2 = w9eVar;
                        w9eVar = w9eVar2;
                        j2 = j4;
                    } else {
                        j3 = j4;
                    }
                } else {
                    w9eVar2 = w9eVar;
                }
                if (j2 - j > j - j3) {
                    while (true) {
                        long j5 = (w9eVar2.c - w9eVar2.b) + j3;
                        if (j < j5) {
                            break;
                        }
                        w9eVar2 = w9eVar2.f;
                        j3 = j5;
                    }
                } else {
                    while (j2 > j) {
                        w9eVar = w9eVar.g;
                        j2 -= w9eVar.c - w9eVar.b;
                    }
                    w9eVar2 = w9eVar;
                    j3 = j2;
                }
                if (this.b && w9eVar2.d) {
                    byte[] bArr = w9eVar2.a;
                    w9e w9eVar3 = new w9e(Arrays.copyOf(bArr, bArr.length), w9eVar2.b, w9eVar2.c, false, true);
                    if (qu0Var.a == w9eVar2) {
                        qu0Var.a = w9eVar3;
                    }
                    w9eVar2.b(w9eVar3);
                    w9eVar3.g.a();
                    w9eVar2 = w9eVar3;
                }
                this.c = w9eVar2;
                this.d = j;
                this.o = w9eVar2.a;
                int i = w9eVar2.b + ((int) (j - j3));
                this.X = i;
                int i2 = w9eVar2.c;
                this.Y = i2;
                return i2 - i;
            }
        }
        throw new ArrayIndexOutOfBoundsException(String.format("offset=%s > size=%s", Arrays.copyOf(new Object[]{Long.valueOf(j), Long.valueOf(qu0Var.b)}, 2)));
    }
}
