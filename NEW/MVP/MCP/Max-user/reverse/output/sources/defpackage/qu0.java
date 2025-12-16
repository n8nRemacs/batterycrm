package defpackage;

import androidx.work.WorkRequest;
import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import ru.ok.android.onelog.impl.BuildConfig;

/* loaded from: classes.dex */
public final class qu0 implements wv0, vv0, Cloneable, ByteChannel {
    public w9e a;
    public long b;

    @Override // defpackage.vv0
    public final /* bridge */ /* synthetic */ vv0 E(int i, byte[] bArr) {
        n0(i, bArr);
        return this;
    }

    @Override // defpackage.wv0
    public final long H(ux uxVar) {
        long j = this.b;
        if (j > 0) {
            uxVar.L(this, j);
        }
        return j;
    }

    @Override // defpackage.vv0
    public final /* bridge */ /* synthetic */ vv0 I(String str) {
        w0(str);
        return this;
    }

    @Override // defpackage.vv0
    public final /* bridge */ /* synthetic */ vv0 K(xx0 xx0Var) {
        o0(xx0Var);
        return this;
    }

    @Override // defpackage.b4f
    public final void L(qu0 qu0Var, long j) {
        w9e w9eVarB;
        if (qu0Var == this) {
            throw new IllegalArgumentException("source == this");
        }
        qoi.a(qu0Var.b, 0L, j);
        while (j > 0) {
            w9e w9eVar = qu0Var.a;
            int i = w9eVar.c;
            int i2 = w9eVar.b;
            if (j < i - i2) {
                w9e w9eVar2 = this.a;
                w9e w9eVar3 = w9eVar2 != null ? w9eVar2.g : null;
                if (w9eVar3 != null && w9eVar3.e) {
                    if ((w9eVar3.c + j) - (w9eVar3.d ? 0 : w9eVar3.b) <= 8192) {
                        w9eVar.d(w9eVar3, (int) j);
                        qu0Var.b -= j;
                        this.b += j;
                        return;
                    }
                }
                int i3 = (int) j;
                if (i3 <= 0 || i3 > i - i2) {
                    throw new IllegalArgumentException("byteCount out of range");
                }
                if (i3 >= 1024) {
                    w9eVarB = w9eVar.c();
                } else {
                    w9eVarB = oae.b();
                    byte[] bArr = w9eVar.a;
                    byte[] bArr2 = w9eVarB.a;
                    int i4 = w9eVar.b;
                    ys.n(bArr, i4, bArr2, i4 + i3);
                }
                w9eVarB.c = w9eVarB.b + i3;
                w9eVar.b += i3;
                w9eVar.g.b(w9eVarB);
                qu0Var.a = w9eVarB;
            }
            w9e w9eVar4 = qu0Var.a;
            long j2 = w9eVar4.c - w9eVar4.b;
            qu0Var.a = w9eVar4.a();
            w9e w9eVar5 = this.a;
            if (w9eVar5 == null) {
                this.a = w9eVar4;
                w9eVar4.g = w9eVar4;
                w9eVar4.f = w9eVar4;
            } else {
                w9eVar5.g.b(w9eVar4);
                w9e w9eVar6 = w9eVar4.g;
                if (w9eVar6 == w9eVar4) {
                    throw new IllegalStateException("cannot compact");
                }
                if (w9eVar6.e) {
                    int i5 = w9eVar4.c - w9eVar4.b;
                    if (i5 <= (8192 - w9eVar6.c) + (w9eVar6.d ? 0 : w9eVar6.b)) {
                        w9eVar4.d(w9eVar6, i5);
                        w9eVar4.a();
                        oae.a(w9eVar4);
                    }
                }
            }
            qu0Var.b -= j2;
            this.b += j2;
            j -= j2;
        }
    }

    @Override // defpackage.wv0
    public final String M(Charset charset) {
        return j0(this.b, charset);
    }

    @Override // defpackage.vv0
    public final /* bridge */ /* synthetic */ vv0 N(long j) {
        s0(j);
        return this;
    }

    @Override // defpackage.wv0
    public final void O(qu0 qu0Var, long j) throws EOFException {
        long j2 = this.b;
        if (j2 >= j) {
            qu0Var.L(this, j);
        } else {
            qu0Var.L(this, j2);
            throw new EOFException();
        }
    }

    public final boolean P() {
        return this.b == 0;
    }

    public final byte Q(long j) {
        qoi.a(this.b, j, 1L);
        w9e w9eVar = this.a;
        w9eVar.getClass();
        long j2 = this.b;
        if (j2 - j < j) {
            while (j2 > j) {
                w9eVar = w9eVar.g;
                j2 -= w9eVar.c - w9eVar.b;
            }
            return w9eVar.a[(int) ((w9eVar.b + j) - j2)];
        }
        long j3 = 0;
        while (true) {
            int i = w9eVar.c;
            int i2 = w9eVar.b;
            long j4 = (i - i2) + j3;
            if (j4 > j) {
                return w9eVar.a[(int) ((i2 + j) - j3)];
            }
            w9eVar = w9eVar.f;
            j3 = j4;
        }
    }

    @Override // defpackage.wv0
    public final String T() {
        return j(BuildConfig.MAX_TIME_TO_UPLOAD);
    }

    @Override // defpackage.wv0
    public final int Y(ejb ejbVar) throws EOFException {
        int iB = bv0.b(this, ejbVar, false);
        if (iB == -1) {
            return -1;
        }
        skip(ejbVar.a[iB].d());
        return iB;
    }

    public final long Z(byte b, long j, long j2) {
        w9e w9eVar;
        long j3 = j;
        long j4 = j2;
        long j5 = 0;
        if (!(0 <= j3 && j4 >= j3)) {
            StringBuilder sb = new StringBuilder("size=");
            sb.append(this.b);
            az1.r(j3, " fromIndex=", " toIndex=", sb);
            sb.append(j4);
            throw new IllegalArgumentException(sb.toString().toString());
        }
        long j6 = this.b;
        if (j4 > j6) {
            j4 = j6;
        }
        long j7 = -1;
        if (j3 != j4 && (w9eVar = this.a) != null) {
            if (j6 - j3 < j3) {
                while (j6 > j3) {
                    w9eVar = w9eVar.g;
                    j6 -= w9eVar.c - w9eVar.b;
                }
                while (j6 < j4) {
                    byte[] bArr = w9eVar.a;
                    long j8 = j7;
                    int iMin = (int) Math.min(w9eVar.c, (w9eVar.b + j4) - j6);
                    for (int i = (int) ((w9eVar.b + j3) - j6); i < iMin; i++) {
                        if (bArr[i] == b) {
                            return (i - w9eVar.b) + j6;
                        }
                    }
                    j6 += w9eVar.c - w9eVar.b;
                    w9eVar = w9eVar.f;
                    j7 = j8;
                    j3 = j6;
                }
                return j7;
            }
            while (true) {
                long j9 = (w9eVar.c - w9eVar.b) + j5;
                if (j9 > j3) {
                    break;
                }
                w9eVar = w9eVar.f;
                j5 = j9;
            }
            while (j5 < j4) {
                byte[] bArr2 = w9eVar.a;
                int iMin2 = (int) Math.min(w9eVar.c, (w9eVar.b + j4) - j5);
                for (int i2 = (int) ((w9eVar.b + j3) - j5); i2 < iMin2; i2++) {
                    if (bArr2[i2] == b) {
                        return (i2 - w9eVar.b) + j5;
                    }
                }
                j5 += w9eVar.c - w9eVar.b;
                w9eVar = w9eVar.f;
                j3 = j5;
            }
            return -1L;
        }
        return -1L;
    }

    @Override // defpackage.x6f
    public final long b(qu0 qu0Var, long j) {
        if (!(j >= 0)) {
            throw new IllegalArgumentException(vb9.e(j, "byteCount < 0: ").toString());
        }
        long j2 = this.b;
        if (j2 == 0) {
            return -1L;
        }
        if (j > j2) {
            j = j2;
        }
        qu0Var.L(this, j);
        return j;
    }

    public final Object clone() {
        qu0 qu0Var = new qu0();
        if (this.b == 0) {
            return qu0Var;
        }
        w9e w9eVar = this.a;
        w9e w9eVarC = w9eVar.c();
        qu0Var.a = w9eVarC;
        w9eVarC.g = w9eVarC;
        w9eVarC.f = w9eVarC;
        for (w9e w9eVar2 = w9eVar.f; w9eVar2 != w9eVar; w9eVar2 = w9eVar2.f) {
            w9eVarC.g.b(w9eVar2.c());
        }
        qu0Var.b = this.b;
        return qu0Var;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, defpackage.b4f
    public final void close() {
    }

    @Override // defpackage.wv0
    public final void d0(long j) throws EOFException {
        if (this.b < j) {
            throw new EOFException();
        }
    }

    @Override // defpackage.wv0
    public final xx0 e(long j) throws EOFException {
        if (!(j >= 0 && j <= ((long) Integer.MAX_VALUE))) {
            throw new IllegalArgumentException(vb9.e(j, "byteCount: ").toString());
        }
        if (this.b < j) {
            throw new EOFException();
        }
        if (j < 4096) {
            return new xx0(i0(j));
        }
        xx0 xx0VarL0 = l0((int) j);
        skip(j);
        return xx0VarL0;
    }

    @Override // defpackage.vv0
    public final /* bridge */ /* synthetic */ vv0 e0(long j) {
        r0(j);
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qu0)) {
            return false;
        }
        long j = this.b;
        qu0 qu0Var = (qu0) obj;
        if (j != qu0Var.b) {
            return false;
        }
        if (j == 0) {
            return true;
        }
        w9e w9eVar = this.a;
        w9e w9eVar2 = qu0Var.a;
        int i = w9eVar.b;
        int i2 = w9eVar2.b;
        long j2 = 0;
        while (j2 < this.b) {
            long jMin = Math.min(w9eVar.c - i, w9eVar2.c - i2);
            long j3 = 0;
            while (j3 < jMin) {
                int i3 = i + 1;
                int i4 = i2 + 1;
                if (w9eVar.a[i] != w9eVar2.a[i2]) {
                    return false;
                }
                j3++;
                i = i3;
                i2 = i4;
            }
            if (i == w9eVar.c) {
                w9eVar = w9eVar.f;
                i = w9eVar.b;
            }
            if (i2 == w9eVar2.c) {
                w9eVar2 = w9eVar2.f;
                i2 = w9eVar2.b;
            }
            j2 += jMin;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a6 A[EDGE_INSN: B:44:0x00a6->B:38:0x00a6 BREAK  A[LOOP:0: B:5:0x000c->B:46:?], SYNTHETIC] */
    @Override // defpackage.wv0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long f0() throws java.io.EOFException {
        /*
            r15 = this;
            long r0 = r15.b
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Lad
            r0 = 0
            r1 = r0
            r6 = r1
            r4 = r2
        Lc:
            w9e r7 = r15.a
            byte[] r8 = r7.a
            int r9 = r7.b
            int r10 = r7.c
        L14:
            if (r9 >= r10) goto L92
            r11 = r8[r9]
            r12 = 48
            byte r12 = (byte) r12
            if (r11 < r12) goto L25
            r13 = 57
            byte r13 = (byte) r13
            if (r11 > r13) goto L25
            int r12 = r11 - r12
            goto L3f
        L25:
            r12 = 97
            byte r12 = (byte) r12
            if (r11 < r12) goto L34
            r13 = 102(0x66, float:1.43E-43)
            byte r13 = (byte) r13
            if (r11 > r13) goto L34
        L2f:
            int r12 = r11 - r12
            int r12 = r12 + 10
            goto L3f
        L34:
            r12 = 65
            byte r12 = (byte) r12
            if (r11 < r12) goto L6a
            r13 = 70
            byte r13 = (byte) r13
            if (r11 > r13) goto L6a
            goto L2f
        L3f:
            r13 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r13 = r13 & r4
            int r13 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r13 != 0) goto L4f
            r11 = 4
            long r4 = r4 << r11
            long r11 = (long) r12
            long r4 = r4 | r11
            int r9 = r9 + 1
            int r1 = r1 + 1
            goto L14
        L4f:
            qu0 r0 = new qu0
            r0.<init>()
            r0.s0(r4)
            r0.q0(r11)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.String r0 = r0.k0()
            java.lang.String r2 = "Number too large: "
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r0)
            throw r1
        L6a:
            r6 = 1
            if (r1 == 0) goto L6e
            goto L92
        L6e:
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            int r2 = r11 >> 4
            r2 = r2 & 15
            char[] r3 = defpackage.rz3.a
            char r2 = r3[r2]
            r4 = r11 & 15
            char r3 = r3[r4]
            r4 = 2
            char[] r4 = new char[r4]
            r4[r0] = r2
            r4[r6] = r3
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4)
            java.lang.String r2 = "Expected leading [0-9a-fA-F] character but was 0x"
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r0)
            throw r1
        L92:
            if (r9 != r10) goto L9e
            w9e r8 = r7.a()
            r15.a = r8
            defpackage.oae.a(r7)
            goto La0
        L9e:
            r7.b = r9
        La0:
            if (r6 != 0) goto La6
            w9e r7 = r15.a
            if (r7 != 0) goto Lc
        La6:
            long r2 = r15.b
            long r0 = (long) r1
            long r2 = r2 - r0
            r15.b = r2
            return r4
        Lad:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qu0.f0():long");
    }

    @Override // defpackage.vv0, defpackage.b4f, java.io.Flushable
    public final void flush() {
    }

    @Override // defpackage.wv0
    public final InputStream g0() {
        return new ju0(this, 0);
    }

    @Override // defpackage.vv0
    public final qu0 getBuffer() {
        return this;
    }

    public final void h0(iu0 iu0Var) {
        if (iu0Var.a != null) {
            throw new IllegalStateException("already attached to a buffer");
        }
        iu0Var.a = this;
        iu0Var.b = true;
    }

    public final int hashCode() {
        w9e w9eVar = this.a;
        if (w9eVar == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = w9eVar.c;
            for (int i3 = w9eVar.b; i3 < i2; i3++) {
                i = (i * 31) + w9eVar.a[i3];
            }
            w9eVar = w9eVar.f;
        } while (w9eVar != this.a);
        return i;
    }

    public final byte[] i0(long j) throws EOFException {
        if (!(j >= 0 && j <= ((long) Integer.MAX_VALUE))) {
            throw new IllegalArgumentException(vb9.e(j, "byteCount: ").toString());
        }
        if (this.b < j) {
            throw new EOFException();
        }
        byte[] bArr = new byte[(int) j];
        readFully(bArr);
        return bArr;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    @Override // defpackage.wv0
    public final String j(long j) throws EOFException {
        if (j < 0) {
            throw new IllegalArgumentException(vb9.e(j, "limit < 0: ").toString());
        }
        long j2 = BuildConfig.MAX_TIME_TO_UPLOAD;
        if (j != BuildConfig.MAX_TIME_TO_UPLOAD) {
            j2 = j + 1;
        }
        long j3 = j2;
        byte b = (byte) 10;
        long jZ = Z(b, 0L, j3);
        if (jZ != -1) {
            return bv0.a(this, jZ);
        }
        if (j3 < this.b && Q(j3 - 1) == ((byte) 13) && Q(j3) == b) {
            return bv0.a(this, j3);
        }
        qu0 qu0Var = new qu0();
        y(qu0Var, 0L, Math.min(32, this.b));
        throw new EOFException("\\n not found: limit=" + Math.min(this.b, j) + " content=" + qu0Var.e(qu0Var.b).e() + (char) 8230);
    }

    public final String j0(long j, Charset charset) throws EOFException {
        if (!(j >= 0 && j <= ((long) Integer.MAX_VALUE))) {
            throw new IllegalArgumentException(vb9.e(j, "byteCount: ").toString());
        }
        if (this.b < j) {
            throw new EOFException();
        }
        if (j == 0) {
            return "";
        }
        w9e w9eVar = this.a;
        int i = w9eVar.b;
        if (i + j > w9eVar.c) {
            return new String(i0(j), charset);
        }
        int i2 = (int) j;
        String str = new String(w9eVar.a, i, i2, charset);
        int i3 = w9eVar.b + i2;
        w9eVar.b = i3;
        this.b -= j;
        if (i3 == w9eVar.c) {
            this.a = w9eVar.a();
            oae.a(w9eVar);
        }
        return str;
    }

    public final String k0() {
        return j0(this.b, lb2.a);
    }

    public final void l() throws EOFException {
        skip(this.b);
    }

    public final xx0 l0(int i) {
        if (i == 0) {
            return xx0.d;
        }
        qoi.a(this.b, 0L, i);
        w9e w9eVar = this.a;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            int i5 = w9eVar.c;
            int i6 = w9eVar.b;
            if (i5 == i6) {
                throw new AssertionError("s.limit == s.pos");
            }
            i3 += i5 - i6;
            i4++;
            w9eVar = w9eVar.f;
        }
        byte[][] bArr = new byte[i4][];
        int[] iArr = new int[i4 * 2];
        w9e w9eVar2 = this.a;
        int i7 = 0;
        while (i2 < i) {
            bArr[i7] = w9eVar2.a;
            i2 += w9eVar2.c - w9eVar2.b;
            iArr[i7] = Math.min(i2, i);
            iArr[i7 + i4] = w9eVar2.b;
            w9eVar2.d = true;
            i7++;
            w9eVar2 = w9eVar2.f;
        }
        return new pae(bArr, iArr);
    }

    @Override // defpackage.x6f
    public final u9g m() {
        return u9g.d;
    }

    public final w9e m0(int i) {
        if (i < 1 || i > 8192) {
            throw new IllegalArgumentException("unexpected capacity");
        }
        w9e w9eVar = this.a;
        if (w9eVar == null) {
            w9e w9eVarB = oae.b();
            this.a = w9eVarB;
            w9eVarB.g = w9eVarB;
            w9eVarB.f = w9eVarB;
            return w9eVarB;
        }
        w9e w9eVar2 = w9eVar.g;
        if (w9eVar2.c + i <= 8192 && w9eVar2.e) {
            return w9eVar2;
        }
        w9e w9eVarB2 = oae.b();
        w9eVar2.b(w9eVarB2);
        return w9eVarB2;
    }

    public final void n0(int i, byte[] bArr) {
        int i2 = 0;
        long j = i;
        qoi.a(bArr.length, 0, j);
        while (i2 < i) {
            w9e w9eVarM0 = m0(1);
            int iMin = Math.min(i - i2, 8192 - w9eVarM0.c);
            int i3 = i2 + iMin;
            System.arraycopy(bArr, i2, w9eVarM0.a, w9eVarM0.c, i3 - i2);
            w9eVarM0.c += iMin;
            i2 = i3;
        }
        this.b += j;
    }

    public final void o0(xx0 xx0Var) {
        xx0Var.m(this, xx0Var.d());
    }

    public final void p0(x6f x6fVar) {
        while (x6fVar.b(this, 8192) != -1) {
        }
    }

    public final void q0(int i) {
        w9e w9eVarM0 = m0(1);
        byte[] bArr = w9eVarM0.a;
        int i2 = w9eVarM0.c;
        w9eVarM0.c = i2 + 1;
        bArr[i2] = (byte) i;
        this.b++;
    }

    public final void r0(long j) {
        int i;
        if (j == 0) {
            q0(48);
            return;
        }
        boolean z = false;
        int i2 = 1;
        if (j < 0) {
            j = -j;
            if (j < 0) {
                v0(0, 20, "-9223372036854775808");
                return;
            }
            z = true;
        }
        if (j < 100000000) {
            if (j >= WorkRequest.MIN_BACKOFF_MILLIS) {
                i = j < 1000000 ? j < 100000 ? 5 : 6 : j < 10000000 ? 7 : 8;
            } else if (j >= 100) {
                i = j < 1000 ? 3 : 4;
            } else if (j >= 10) {
                i2 = 2;
            }
            i2 = i;
        } else if (j < 1000000000000L) {
            if (j < 10000000000L) {
                i2 = j < 1000000000 ? 9 : 10;
            } else {
                i = j < 100000000000L ? 11 : 12;
                i2 = i;
            }
        } else if (j >= 1000000000000000L) {
            i2 = j < 100000000000000000L ? j < 10000000000000000L ? 16 : 17 : j < 1000000000000000000L ? 18 : 19;
        } else if (j < 10000000000000L) {
            i2 = 13;
        } else {
            i = j < 100000000000000L ? 14 : 15;
            i2 = i;
        }
        if (z) {
            i2++;
        }
        w9e w9eVarM0 = m0(i2);
        byte[] bArr = w9eVarM0.a;
        int i3 = w9eVarM0.c + i2;
        while (j != 0) {
            long j2 = 10;
            i3--;
            bArr[i3] = bv0.a[(int) (j % j2)];
            j /= j2;
        }
        if (z) {
            bArr[i3 - 1] = (byte) 45;
        }
        w9eVarM0.c += i2;
        this.b += i2;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        w9e w9eVar = this.a;
        if (w9eVar == null) {
            return -1;
        }
        int iMin = Math.min(byteBuffer.remaining(), w9eVar.c - w9eVar.b);
        byteBuffer.put(w9eVar.a, w9eVar.b, iMin);
        int i = w9eVar.b + iMin;
        w9eVar.b = i;
        this.b -= iMin;
        if (i == w9eVar.c) {
            this.a = w9eVar.a();
            oae.a(w9eVar);
        }
        return iMin;
    }

    @Override // defpackage.wv0
    public final byte readByte() throws EOFException {
        long j = this.b;
        if (j == 0) {
            throw new EOFException();
        }
        w9e w9eVar = this.a;
        int i = w9eVar.b;
        int i2 = w9eVar.c;
        int i3 = i + 1;
        byte b = w9eVar.a[i];
        this.b = j - 1;
        if (i3 != i2) {
            w9eVar.b = i3;
            return b;
        }
        this.a = w9eVar.a();
        oae.a(w9eVar);
        return b;
    }

    @Override // defpackage.wv0
    public final void readFully(byte[] bArr) throws EOFException {
        int i = 0;
        while (i < bArr.length) {
            int i2 = read(bArr, i, bArr.length - i);
            if (i2 == -1) {
                throw new EOFException();
            }
            i += i2;
        }
    }

    @Override // defpackage.wv0
    public final int readInt() throws EOFException {
        long j = this.b;
        if (j < 4) {
            throw new EOFException();
        }
        w9e w9eVar = this.a;
        int i = w9eVar.b;
        int i2 = w9eVar.c;
        if (i2 - i < 4) {
            return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
        }
        byte[] bArr = w9eVar.a;
        int i3 = i + 3;
        int i4 = ((bArr[i + 1] & 255) << 16) | ((bArr[i] & 255) << 24) | ((bArr[i + 2] & 255) << 8);
        int i5 = i + 4;
        int i6 = (bArr[i3] & 255) | i4;
        this.b = j - 4;
        if (i5 != i2) {
            w9eVar.b = i5;
            return i6;
        }
        this.a = w9eVar.a();
        oae.a(w9eVar);
        return i6;
    }

    @Override // defpackage.wv0
    public final long readLong() throws EOFException {
        long j = this.b;
        if (j < 8) {
            throw new EOFException();
        }
        w9e w9eVar = this.a;
        int i = w9eVar.b;
        int i2 = w9eVar.c;
        if (i2 - i < 8) {
            return ((readInt() & 4294967295L) << 32) | (4294967295L & readInt());
        }
        byte[] bArr = w9eVar.a;
        int i3 = i + 7;
        long j2 = ((bArr[i + 1] & 255) << 48) | ((bArr[i] & 255) << 56) | ((bArr[i + 2] & 255) << 40) | ((bArr[i + 3] & 255) << 32) | ((bArr[i + 4] & 255) << 24) | ((bArr[i + 5] & 255) << 16) | ((bArr[i + 6] & 255) << 8);
        int i4 = i + 8;
        long j3 = j2 | (bArr[i3] & 255);
        this.b = j - 8;
        if (i4 != i2) {
            w9eVar.b = i4;
            return j3;
        }
        this.a = w9eVar.a();
        oae.a(w9eVar);
        return j3;
    }

    @Override // defpackage.wv0
    public final short readShort() throws EOFException {
        long j = this.b;
        if (j < 2) {
            throw new EOFException();
        }
        w9e w9eVar = this.a;
        int i = w9eVar.b;
        int i2 = w9eVar.c;
        if (i2 - i < 2) {
            return (short) (((readByte() & 255) << 8) | (readByte() & 255));
        }
        byte[] bArr = w9eVar.a;
        int i3 = i + 1;
        int i4 = (bArr[i] & 255) << 8;
        int i5 = i + 2;
        int i6 = (bArr[i3] & 255) | i4;
        this.b = j - 2;
        if (i5 == i2) {
            this.a = w9eVar.a();
            oae.a(w9eVar);
        } else {
            w9eVar.b = i5;
        }
        return (short) i6;
    }

    public final void s0(long j) {
        if (j == 0) {
            q0(48);
            return;
        }
        long j2 = (j >>> 1) | j;
        long j3 = j2 | (j2 >>> 2);
        long j4 = j3 | (j3 >>> 4);
        long j5 = j4 | (j4 >>> 8);
        long j6 = j5 | (j5 >>> 16);
        long j7 = j6 | (j6 >>> 32);
        long j8 = j7 - ((j7 >>> 1) & 6148914691236517205L);
        long j9 = ((j8 >>> 2) & 3689348814741910323L) + (j8 & 3689348814741910323L);
        long j10 = ((j9 >>> 4) + j9) & 1085102592571150095L;
        long j11 = j10 + (j10 >>> 8);
        long j12 = j11 + (j11 >>> 16);
        int i = (int) ((((j12 & 63) + ((j12 >>> 32) & 63)) + 3) / 4);
        w9e w9eVarM0 = m0(i);
        byte[] bArr = w9eVarM0.a;
        int i2 = w9eVarM0.c;
        for (int i3 = (i2 + i) - 1; i3 >= i2; i3--) {
            bArr[i3] = bv0.a[(int) (15 & j)];
            j >>>= 4;
        }
        w9eVarM0.c += i;
        this.b += i;
    }

    @Override // defpackage.wv0
    public final void skip(long j) throws EOFException {
        while (j > 0) {
            w9e w9eVar = this.a;
            if (w9eVar == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j, w9eVar.c - w9eVar.b);
            long j2 = iMin;
            this.b -= j2;
            j -= j2;
            int i = w9eVar.b + iMin;
            w9eVar.b = i;
            if (i == w9eVar.c) {
                this.a = w9eVar.a();
                oae.a(w9eVar);
            }
        }
    }

    public final void t0(int i) {
        w9e w9eVarM0 = m0(4);
        byte[] bArr = w9eVarM0.a;
        int i2 = w9eVarM0.c;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        bArr[i2 + 1] = (byte) ((i >>> 16) & 255);
        bArr[i2 + 2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 3] = (byte) (i & 255);
        w9eVarM0.c = i2 + 4;
        this.b += 4;
    }

    public final String toString() {
        long j = this.b;
        if (j <= Integer.MAX_VALUE) {
            return l0((int) j).toString();
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + this.b).toString());
    }

    @Override // defpackage.vv0
    public final vv0 u() {
        return this;
    }

    public final void u0(int i) {
        w9e w9eVarM0 = m0(2);
        byte[] bArr = w9eVarM0.a;
        int i2 = w9eVarM0.c;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 1] = (byte) (i & 255);
        w9eVarM0.c = i2 + 2;
        this.b += 2;
    }

    public final void v0(int i, int i2, String str) {
        if (i < 0) {
            throw new IllegalArgumentException(ho7.f(i, "beginIndex < 0: ").toString());
        }
        if (i2 < i) {
            throw new IllegalArgumentException(ho7.g("endIndex < beginIndex: ", i2, i, " < ").toString());
        }
        if (i2 > str.length()) {
            StringBuilder sbM = ho7.m(i2, "endIndex > string.length: ", " > ");
            sbM.append(str.length());
            throw new IllegalArgumentException(sbM.toString().toString());
        }
        while (i < i2) {
            char cCharAt = str.charAt(i);
            if (cCharAt < 128) {
                w9e w9eVarM0 = m0(1);
                byte[] bArr = w9eVarM0.a;
                int i3 = w9eVarM0.c - i;
                int iMin = Math.min(i2, 8192 - i3);
                int i4 = i + 1;
                bArr[i + i3] = (byte) cCharAt;
                while (i4 < iMin) {
                    char cCharAt2 = str.charAt(i4);
                    if (cCharAt2 >= 128) {
                        break;
                    }
                    bArr[i4 + i3] = (byte) cCharAt2;
                    i4++;
                }
                int i5 = w9eVarM0.c;
                int i6 = (i3 + i4) - i5;
                w9eVarM0.c = i5 + i6;
                this.b += i6;
                i = i4;
            } else {
                if (cCharAt < 2048) {
                    w9e w9eVarM02 = m0(2);
                    byte[] bArr2 = w9eVarM02.a;
                    int i7 = w9eVarM02.c;
                    bArr2[i7] = (byte) ((cCharAt >> 6) | 192);
                    bArr2[i7 + 1] = (byte) ((cCharAt & '?') | 128);
                    w9eVarM02.c = i7 + 2;
                    this.b += 2;
                } else if (cCharAt < 55296 || cCharAt > 57343) {
                    w9e w9eVarM03 = m0(3);
                    byte[] bArr3 = w9eVarM03.a;
                    int i8 = w9eVarM03.c;
                    bArr3[i8] = (byte) ((cCharAt >> '\f') | 224);
                    bArr3[i8 + 1] = (byte) ((63 & (cCharAt >> 6)) | 128);
                    bArr3[i8 + 2] = (byte) ((cCharAt & '?') | 128);
                    w9eVarM03.c = i8 + 3;
                    this.b += 3;
                } else {
                    int i9 = i + 1;
                    char cCharAt3 = i9 < i2 ? str.charAt(i9) : (char) 0;
                    if (cCharAt > 56319 || 56320 > cCharAt3 || 57343 < cCharAt3) {
                        q0(63);
                        i = i9;
                    } else {
                        int i10 = (((cCharAt & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
                        w9e w9eVarM04 = m0(4);
                        byte[] bArr4 = w9eVarM04.a;
                        int i11 = w9eVarM04.c;
                        bArr4[i11] = (byte) ((i10 >> 18) | 240);
                        bArr4[i11 + 1] = (byte) (((i10 >> 12) & 63) | 128);
                        bArr4[i11 + 2] = (byte) (((i10 >> 6) & 63) | 128);
                        bArr4[i11 + 3] = (byte) ((i10 & 63) | 128);
                        w9eVarM04.c = i11 + 4;
                        this.b += 4;
                        i += 2;
                    }
                }
                i++;
            }
        }
    }

    public final long w() {
        long j = this.b;
        if (j == 0) {
            return 0L;
        }
        w9e w9eVar = this.a.g;
        return (w9eVar.c >= 8192 || !w9eVar.e) ? j : j - (r3 - w9eVar.b);
    }

    public final void w0(String str) {
        v0(0, str.length(), str);
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        int iRemaining = byteBuffer.remaining();
        int i = iRemaining;
        while (i > 0) {
            w9e w9eVarM0 = m0(1);
            int iMin = Math.min(i, 8192 - w9eVarM0.c);
            byteBuffer.get(w9eVarM0.a, w9eVarM0.c, iMin);
            i -= iMin;
            w9eVarM0.c += iMin;
        }
        this.b += iRemaining;
        return iRemaining;
    }

    @Override // defpackage.vv0
    public final /* bridge */ /* synthetic */ vv0 writeByte(int i) {
        q0(i);
        return this;
    }

    @Override // defpackage.vv0
    public final /* bridge */ /* synthetic */ vv0 writeInt(int i) {
        t0(i);
        return this;
    }

    @Override // defpackage.vv0
    public final /* bridge */ /* synthetic */ vv0 writeShort(int i) {
        u0(i);
        return this;
    }

    public final void x0(int i) {
        String str;
        if (i < 128) {
            q0(i);
            return;
        }
        if (i < 2048) {
            w9e w9eVarM0 = m0(2);
            byte[] bArr = w9eVarM0.a;
            int i2 = w9eVarM0.c;
            bArr[i2] = (byte) ((i >> 6) | 192);
            bArr[i2 + 1] = (byte) ((i & 63) | 128);
            w9eVarM0.c = i2 + 2;
            this.b += 2;
            return;
        }
        if (55296 <= i && 57343 >= i) {
            q0(63);
            return;
        }
        if (i < 65536) {
            w9e w9eVarM02 = m0(3);
            byte[] bArr2 = w9eVarM02.a;
            int i3 = w9eVarM02.c;
            bArr2[i3] = (byte) ((i >> 12) | 224);
            bArr2[i3 + 1] = (byte) (((i >> 6) & 63) | 128);
            bArr2[i3 + 2] = (byte) ((i & 63) | 128);
            w9eVarM02.c = i3 + 3;
            this.b += 3;
            return;
        }
        if (i <= 1114111) {
            w9e w9eVarM03 = m0(4);
            byte[] bArr3 = w9eVarM03.a;
            int i4 = w9eVarM03.c;
            bArr3[i4] = (byte) ((i >> 18) | 240);
            bArr3[i4 + 1] = (byte) (((i >> 12) & 63) | 128);
            bArr3[i4 + 2] = (byte) (((i >> 6) & 63) | 128);
            bArr3[i4 + 3] = (byte) ((i & 63) | 128);
            w9eVarM03.c = i4 + 4;
            this.b += 4;
            return;
        }
        StringBuilder sb = new StringBuilder("Unexpected code point: 0x");
        if (i != 0) {
            char[] cArr = rz3.a;
            char[] cArr2 = {cArr[(i >> 28) & 15], cArr[(i >> 24) & 15], cArr[(i >> 20) & 15], cArr[(i >> 16) & 15], cArr[(i >> 12) & 15], cArr[(i >> 8) & 15], cArr[(i >> 4) & 15], cArr[i & 15]};
            int i5 = 0;
            while (i5 < 8 && cArr2[i5] == '0') {
                i5++;
            }
            str = new String(cArr2, i5, 8 - i5);
        } else {
            str = "0";
        }
        sb.append(str);
        throw new IllegalArgumentException(sb.toString());
    }

    public final void y(qu0 qu0Var, long j, long j2) {
        long j3 = j;
        qoi.a(this.b, j3, j2);
        if (j2 == 0) {
            return;
        }
        qu0Var.b += j2;
        w9e w9eVar = this.a;
        while (true) {
            long j4 = w9eVar.c - w9eVar.b;
            if (j3 < j4) {
                break;
            }
            j3 -= j4;
            w9eVar = w9eVar.f;
        }
        w9e w9eVar2 = w9eVar;
        long j5 = j2;
        while (j5 > 0) {
            w9e w9eVarC = w9eVar2.c();
            int i = w9eVarC.b + ((int) j3);
            w9eVarC.b = i;
            w9eVarC.c = Math.min(i + ((int) j5), w9eVarC.c);
            w9e w9eVar3 = qu0Var.a;
            if (w9eVar3 == null) {
                w9eVarC.g = w9eVarC;
                w9eVarC.f = w9eVarC;
                qu0Var.a = w9eVarC;
            } else {
                w9eVar3.g.b(w9eVarC);
            }
            j5 -= w9eVarC.c - w9eVarC.b;
            w9eVar2 = w9eVar2.f;
            j3 = 0;
        }
    }

    @Override // defpackage.vv0
    public final vv0 write(byte[] bArr) {
        n0(bArr.length, bArr);
        return this;
    }

    public final int read(byte[] bArr, int i, int i2) {
        qoi.a(bArr.length, i, i2);
        w9e w9eVar = this.a;
        if (w9eVar == null) {
            return -1;
        }
        int iMin = Math.min(i2, w9eVar.c - w9eVar.b);
        byte[] bArr2 = w9eVar.a;
        int i3 = w9eVar.b;
        System.arraycopy(bArr2, i3, bArr, i, (i3 + iMin) - i3);
        int i4 = w9eVar.b + iMin;
        w9eVar.b = i4;
        this.b -= iMin;
        if (i4 == w9eVar.c) {
            this.a = w9eVar.a();
            oae.a(w9eVar);
        }
        return iMin;
    }
}
