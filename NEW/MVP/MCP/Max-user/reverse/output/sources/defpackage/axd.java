package defpackage;

import android.media.MediaCodec;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class axd {
    public final /* synthetic */ int a = 0;
    public final int b;
    public long c;
    public final Object d;
    public final Object e;
    public Object f;
    public Object g;
    public Object h;

    public axd(qi4 qi4Var) {
        this.d = qi4Var;
        int i = qi4Var.b;
        this.b = i;
        this.e = new qyg(32);
        dt0 dt0Var = new dt0(i, 4, 0L);
        this.f = dt0Var;
        this.g = dt0Var;
        this.h = dt0Var;
    }

    public static dt0 e(dt0 dt0Var, long j, ByteBuffer byteBuffer, int i) {
        while (j >= dt0Var.c) {
            dt0Var = (dt0) dt0Var.o;
        }
        while (i > 0) {
            int iMin = Math.min(i, (int) (dt0Var.c - j));
            yc ycVar = (yc) dt0Var.d;
            byteBuffer.put(ycVar.a, ((int) (j - dt0Var.b)) + ycVar.b, iMin);
            i -= iMin;
            j += iMin;
            if (j == dt0Var.c) {
                dt0Var = (dt0) dt0Var.o;
            }
        }
        return dt0Var;
    }

    public static dt0 f(dt0 dt0Var, long j, byte[] bArr, int i) {
        while (j >= dt0Var.c) {
            dt0Var = (dt0) dt0Var.o;
        }
        int i2 = i;
        while (i2 > 0) {
            int iMin = Math.min(i2, (int) (dt0Var.c - j));
            yc ycVar = (yc) dt0Var.d;
            System.arraycopy(ycVar.a, ((int) (j - dt0Var.b)) + ycVar.b, bArr, i - i2, iMin);
            i2 -= iMin;
            j += iMin;
            if (j == dt0Var.c) {
                dt0Var = (dt0) dt0Var.o;
            }
        }
        return dt0Var;
    }

    public static dt0 g(dt0 dt0Var, long j, ByteBuffer byteBuffer, int i) {
        while (j >= dt0Var.c) {
            dt0Var = (dt0) dt0Var.o;
        }
        while (i > 0) {
            int iMin = Math.min(i, (int) (dt0Var.c - j));
            zc zcVar = (zc) dt0Var.d;
            byteBuffer.put(zcVar.a, ((int) (j - dt0Var.b)) + zcVar.b, iMin);
            i -= iMin;
            j += iMin;
            if (j == dt0Var.c) {
                dt0Var = (dt0) dt0Var.o;
            }
        }
        return dt0Var;
    }

    public static dt0 h(dt0 dt0Var, long j, byte[] bArr, int i) {
        while (j >= dt0Var.c) {
            dt0Var = (dt0) dt0Var.o;
        }
        int i2 = i;
        while (i2 > 0) {
            int iMin = Math.min(i2, (int) (dt0Var.c - j));
            zc zcVar = (zc) dt0Var.d;
            System.arraycopy(zcVar.a, ((int) (j - dt0Var.b)) + zcVar.b, bArr, i - i2, iMin);
            i2 -= iMin;
            j += iMin;
            if (j == dt0Var.c) {
                dt0Var = (dt0) dt0Var.o;
            }
        }
        return dt0Var;
    }

    public static dt0 i(dt0 dt0Var, oh4 oh4Var, c32 c32Var, qyg qygVar) {
        if (oh4Var.j(1073741824)) {
            long j = c32Var.c;
            int iX = 1;
            qygVar.B(1);
            dt0 dt0VarF = f(dt0Var, j, qygVar.a, 1);
            long j2 = j + 1;
            byte b = qygVar.a[0];
            boolean z = (b & 128) != 0;
            int i = b & 127;
            za4 za4Var = oh4Var.c;
            byte[] bArr = (byte[]) za4Var.a;
            if (bArr == null) {
                za4Var.a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            dt0Var = f(dt0VarF, j2, (byte[]) za4Var.a, i);
            long j3 = j2 + i;
            if (z) {
                qygVar.B(2);
                dt0Var = f(dt0Var, j3, qygVar.a, 2);
                j3 += 2;
                iX = qygVar.x();
            }
            int[] iArr = (int[]) za4Var.d;
            if (iArr == null || iArr.length < iX) {
                iArr = new int[iX];
            }
            int[] iArr2 = (int[]) za4Var.e;
            if (iArr2 == null || iArr2.length < iX) {
                iArr2 = new int[iX];
            }
            if (z) {
                int i2 = iX * 6;
                qygVar.B(i2);
                dt0Var = f(dt0Var, j3, qygVar.a, i2);
                j3 += i2;
                qygVar.E(0);
                for (int i3 = 0; i3 < iX; i3++) {
                    iArr[i3] = qygVar.x();
                    iArr2[i3] = qygVar.v();
                }
            } else {
                iArr[0] = 0;
                iArr2[0] = c32Var.b - ((int) (j3 - c32Var.c));
            }
            pfg pfgVar = (pfg) c32Var.d;
            int i4 = xxg.a;
            byte[] bArr2 = pfgVar.b;
            byte[] bArr3 = (byte[]) za4Var.a;
            int i5 = pfgVar.a;
            int i6 = pfgVar.c;
            int i7 = pfgVar.d;
            za4Var.f = iX;
            za4Var.d = iArr;
            za4Var.e = iArr2;
            za4Var.b = bArr2;
            za4Var.a = bArr3;
            za4Var.c = i5;
            za4Var.g = i6;
            za4Var.h = i7;
            MediaCodec.CryptoInfo cryptoInfo = (MediaCodec.CryptoInfo) za4Var.i;
            cryptoInfo.numSubSamples = iX;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr2;
            cryptoInfo.iv = bArr3;
            cryptoInfo.mode = i5;
            if (xxg.a >= 24) {
                xo8 xo8Var = (xo8) za4Var.j;
                xo8Var.getClass();
                MediaCodec.CryptoInfo.Pattern pattern = (MediaCodec.CryptoInfo.Pattern) xo8Var.c;
                pattern.set(i6, i7);
                ((MediaCodec.CryptoInfo) xo8Var.b).setPattern(pattern);
            }
            long j4 = c32Var.c;
            int i8 = (int) (j3 - j4);
            c32Var.c = j4 + i8;
            c32Var.b -= i8;
        }
        if (!oh4Var.j(268435456)) {
            oh4Var.y(c32Var.b);
            return e(dt0Var, c32Var.c, oh4Var.d, c32Var.b);
        }
        qygVar.B(4);
        dt0 dt0VarF2 = f(dt0Var, c32Var.c, qygVar.a, 4);
        int iV = qygVar.v();
        c32Var.c += 4;
        c32Var.b -= 4;
        oh4Var.y(iV);
        dt0 dt0VarE = e(dt0VarF2, c32Var.c, oh4Var.d, iV);
        c32Var.c += iV;
        int i9 = c32Var.b - iV;
        c32Var.b = i9;
        ByteBuffer byteBuffer = oh4Var.Y;
        if (byteBuffer == null || byteBuffer.capacity() < i9) {
            oh4Var.Y = ByteBuffer.allocate(i9);
        } else {
            oh4Var.Y.clear();
        }
        return e(dt0VarE, c32Var.c, oh4Var.Y, c32Var.b);
    }

    public static dt0 j(dt0 dt0Var, ph4 ph4Var, c32 c32Var, umb umbVar) {
        if (ph4Var.j(1073741824)) {
            long j = c32Var.c;
            int iD = 1;
            umbVar.G(1);
            dt0 dt0VarH = h(dt0Var, j, umbVar.a, 1);
            long j2 = j + 1;
            byte b = umbVar.a[0];
            boolean z = (b & 128) != 0;
            int i = b & 127;
            za4 za4Var = ph4Var.d;
            byte[] bArr = (byte[]) za4Var.a;
            if (bArr == null) {
                za4Var.a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            dt0Var = h(dt0VarH, j2, (byte[]) za4Var.a, i);
            long j3 = j2 + i;
            if (z) {
                umbVar.G(2);
                dt0Var = h(dt0Var, j3, umbVar.a, 2);
                j3 += 2;
                iD = umbVar.D();
            }
            int[] iArr = (int[]) za4Var.d;
            if (iArr == null || iArr.length < iD) {
                iArr = new int[iD];
            }
            int[] iArr2 = (int[]) za4Var.e;
            if (iArr2 == null || iArr2.length < iD) {
                iArr2 = new int[iD];
            }
            if (z) {
                int i2 = iD * 6;
                umbVar.G(i2);
                dt0Var = h(dt0Var, j3, umbVar.a, i2);
                j3 += i2;
                umbVar.J(0);
                for (int i3 = 0; i3 < iD; i3++) {
                    iArr[i3] = umbVar.D();
                    iArr2[i3] = umbVar.B();
                }
            } else {
                iArr[0] = 0;
                iArr2[0] = c32Var.b - ((int) (j3 - c32Var.c));
            }
            qfg qfgVar = (qfg) c32Var.d;
            String str = zxg.a;
            byte[] bArr2 = qfgVar.b;
            byte[] bArr3 = (byte[]) za4Var.a;
            int i4 = qfgVar.a;
            int i5 = qfgVar.c;
            int i6 = qfgVar.d;
            za4Var.f = iD;
            za4Var.d = iArr;
            za4Var.e = iArr2;
            za4Var.b = bArr2;
            za4Var.a = bArr3;
            za4Var.c = i4;
            za4Var.g = i5;
            za4Var.h = i6;
            MediaCodec.CryptoInfo cryptoInfo = (MediaCodec.CryptoInfo) za4Var.i;
            cryptoInfo.numSubSamples = iD;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr2;
            cryptoInfo.iv = bArr3;
            cryptoInfo.mode = i4;
            py0 py0Var = (py0) za4Var.j;
            py0Var.getClass();
            MediaCodec.CryptoInfo.Pattern pattern = (MediaCodec.CryptoInfo.Pattern) py0Var.c;
            pattern.set(i5, i6);
            ((MediaCodec.CryptoInfo) py0Var.b).setPattern(pattern);
            long j4 = c32Var.c;
            int i7 = (int) (j3 - j4);
            c32Var.c = j4 + i7;
            c32Var.b -= i7;
        }
        if (!ph4Var.j(268435456)) {
            ph4Var.y(c32Var.b);
            return g(dt0Var, c32Var.c, ph4Var.o, c32Var.b);
        }
        umbVar.G(4);
        dt0 dt0VarH2 = h(dt0Var, c32Var.c, umbVar.a, 4);
        int iB = umbVar.B();
        c32Var.c += 4;
        c32Var.b -= 4;
        ph4Var.y(iB);
        dt0 dt0VarG = g(dt0VarH2, c32Var.c, ph4Var.o, iB);
        c32Var.c += iB;
        int i8 = c32Var.b - iB;
        c32Var.b = i8;
        ByteBuffer byteBuffer = ph4Var.Z;
        if (byteBuffer == null || byteBuffer.capacity() < i8) {
            ph4Var.Z = ByteBuffer.allocate(i8);
        } else {
            ph4Var.Z.clear();
        }
        return g(dt0VarG, c32Var.c, ph4Var.Z, c32Var.b);
    }

    public void a(dt0 dt0Var) {
        if (((yc) dt0Var.d) == null) {
            return;
        }
        qi4 qi4Var = (qi4) this.d;
        synchronized (qi4Var) {
            dt0 dt0Var2 = dt0Var;
            while (dt0Var2 != null) {
                try {
                    yc[] ycVarArr = qi4Var.f;
                    int i = qi4Var.e;
                    qi4Var.e = i + 1;
                    yc ycVar = (yc) dt0Var2.d;
                    ycVar.getClass();
                    ycVarArr[i] = ycVar;
                    qi4Var.d--;
                    dt0Var2 = (dt0) dt0Var2.o;
                    if (dt0Var2 == null || ((yc) dt0Var2.d) == null) {
                        dt0Var2 = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            qi4Var.notifyAll();
        }
        dt0Var.d = null;
        dt0Var.o = null;
    }

    public void b(dt0 dt0Var) {
        if (((zc) dt0Var.d) == null) {
            return;
        }
        ri4 ri4Var = (ri4) this.d;
        synchronized (ri4Var) {
            dt0 dt0Var2 = dt0Var;
            while (dt0Var2 != null) {
                try {
                    zc[] zcVarArr = ri4Var.g;
                    int i = ri4Var.f;
                    ri4Var.f = i + 1;
                    zc zcVar = (zc) dt0Var2.d;
                    zcVar.getClass();
                    zcVarArr[i] = zcVar;
                    ri4Var.e--;
                    dt0Var2 = (dt0) dt0Var2.o;
                    if (dt0Var2 == null || ((zc) dt0Var2.d) == null) {
                        dt0Var2 = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            ri4Var.notifyAll();
        }
        dt0Var.d = null;
        dt0Var.o = null;
    }

    public final void c(long j) {
        switch (this.a) {
            case 0:
                if (j == -1) {
                    return;
                }
                while (true) {
                    dt0 dt0Var = (dt0) this.f;
                    if (j < dt0Var.c) {
                        if (((dt0) this.g).b < dt0Var.b) {
                            this.g = dt0Var;
                            return;
                        }
                        return;
                    }
                    qi4 qi4Var = (qi4) this.d;
                    yc ycVar = (yc) dt0Var.d;
                    synchronized (qi4Var) {
                        yc[] ycVarArr = qi4Var.f;
                        int i = qi4Var.e;
                        qi4Var.e = i + 1;
                        ycVarArr[i] = ycVar;
                        qi4Var.d--;
                        qi4Var.notifyAll();
                    }
                    dt0 dt0Var2 = (dt0) this.f;
                    dt0Var2.d = null;
                    dt0 dt0Var3 = (dt0) dt0Var2.o;
                    dt0Var2.o = null;
                    this.f = dt0Var3;
                }
            default:
                if (j == -1) {
                    return;
                }
                while (true) {
                    dt0 dt0Var4 = (dt0) this.f;
                    if (j < dt0Var4.c) {
                        if (((dt0) this.g).b < dt0Var4.b) {
                            this.g = dt0Var4;
                            return;
                        }
                        return;
                    }
                    ri4 ri4Var = (ri4) this.d;
                    zc zcVar = (zc) dt0Var4.d;
                    synchronized (ri4Var) {
                        zc[] zcVarArr = ri4Var.g;
                        int i2 = ri4Var.f;
                        ri4Var.f = i2 + 1;
                        zcVarArr[i2] = zcVar;
                        ri4Var.e--;
                        ri4Var.notifyAll();
                    }
                    dt0 dt0Var5 = (dt0) this.f;
                    dt0Var5.d = null;
                    dt0 dt0Var6 = (dt0) dt0Var5.o;
                    dt0Var5.o = null;
                    this.f = dt0Var6;
                }
        }
    }

    public final int d(int i) {
        yc ycVar;
        zc zcVar;
        switch (this.a) {
            case 0:
                dt0 dt0Var = (dt0) this.h;
                if (((yc) dt0Var.d) == null) {
                    qi4 qi4Var = (qi4) this.d;
                    synchronized (qi4Var) {
                        try {
                            int i2 = qi4Var.d + 1;
                            qi4Var.d = i2;
                            int i3 = qi4Var.e;
                            if (i3 > 0) {
                                yc[] ycVarArr = qi4Var.f;
                                int i4 = i3 - 1;
                                qi4Var.e = i4;
                                ycVar = ycVarArr[i4];
                                ycVar.getClass();
                                qi4Var.f[qi4Var.e] = null;
                            } else {
                                yc ycVar2 = new yc(0, new byte[qi4Var.b]);
                                yc[] ycVarArr2 = qi4Var.f;
                                if (i2 > ycVarArr2.length) {
                                    qi4Var.f = (yc[]) Arrays.copyOf(ycVarArr2, ycVarArr2.length * 2);
                                }
                                ycVar = ycVar2;
                            }
                        } finally {
                        }
                    }
                    dt0 dt0Var2 = new dt0(this.b, 4, ((dt0) this.h).c);
                    dt0Var.d = ycVar;
                    dt0Var.o = dt0Var2;
                }
                return Math.min(i, (int) (((dt0) this.h).c - this.c));
            default:
                dt0 dt0Var3 = (dt0) this.h;
                if (((zc) dt0Var3.d) == null) {
                    ri4 ri4Var = (ri4) this.d;
                    synchronized (ri4Var) {
                        try {
                            int i5 = ri4Var.e + 1;
                            ri4Var.e = i5;
                            int i6 = ri4Var.f;
                            if (i6 > 0) {
                                zc[] zcVarArr = ri4Var.g;
                                int i7 = i6 - 1;
                                ri4Var.f = i7;
                                zcVar = zcVarArr[i7];
                                zcVar.getClass();
                                ri4Var.g[ri4Var.f] = null;
                            } else {
                                zc zcVar2 = new zc(0, new byte[ri4Var.b]);
                                zc[] zcVarArr2 = ri4Var.g;
                                if (i5 > zcVarArr2.length) {
                                    ri4Var.g = (zc[]) Arrays.copyOf(zcVarArr2, zcVarArr2.length * 2);
                                }
                                zcVar = zcVar2;
                            }
                        } finally {
                        }
                    }
                    dt0 dt0Var4 = new dt0(this.b, 5, ((dt0) this.h).c);
                    dt0Var3.d = zcVar;
                    dt0Var3.o = dt0Var4;
                }
                return Math.min(i, (int) (((dt0) this.h).c - this.c));
        }
    }

    public axd(ri4 ri4Var) {
        this.d = ri4Var;
        int i = ri4Var.b;
        this.b = i;
        this.e = new umb(32);
        dt0 dt0Var = new dt0(i, 5, 0L);
        this.f = dt0Var;
        this.g = dt0Var;
        this.h = dt0Var;
    }
}
