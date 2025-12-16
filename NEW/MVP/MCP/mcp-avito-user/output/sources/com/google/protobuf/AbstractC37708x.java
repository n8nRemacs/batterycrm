package com.google.protobuf;

import com.google.protobuf.AbstractC37700t;
import com.google.protobuf.InterfaceC37707w0;
import com.google.protobuf.r1;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: CodedInputStream.java */
/* renamed from: com.google.protobuf.x, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC37708x {

    /* renamed from: a, reason: collision with root package name */
    public int f362967a;

    /* renamed from: b, reason: collision with root package name */
    public final int f362968b;

    /* renamed from: c, reason: collision with root package name */
    public final int f362969c;

    /* renamed from: d, reason: collision with root package name */
    public C37710y f362970d;

    /* compiled from: CodedInputStream.java */
    /* renamed from: com.google.protobuf.x$b */
    public static final class b extends AbstractC37708x {

        /* renamed from: e, reason: collision with root package name */
        public final byte[] f362971e;

        /* renamed from: f, reason: collision with root package name */
        public int f362972f;

        /* renamed from: g, reason: collision with root package name */
        public int f362973g;

        /* renamed from: h, reason: collision with root package name */
        public int f362974h;

        /* renamed from: i, reason: collision with root package name */
        public final int f362975i;

        /* renamed from: j, reason: collision with root package name */
        public int f362976j;

        /* renamed from: k, reason: collision with root package name */
        public int f362977k;

        public b(byte[] bArr, int i12, int i13, boolean z12, a aVar) {
            super();
            this.f362977k = Integer.MAX_VALUE;
            this.f362971e = bArr;
            this.f362972f = i13 + i12;
            this.f362974h = i12;
            this.f362975i = i12;
        }

        @Override // com.google.protobuf.AbstractC37708x
        public final long A() {
            return K();
        }

        @Override // com.google.protobuf.AbstractC37708x
        public final int B() {
            return AbstractC37708x.c(x());
        }

        @Override // com.google.protobuf.AbstractC37708x
        public final long C() {
            return AbstractC37708x.d(L());
        }

        @Override // com.google.protobuf.AbstractC37708x
        public final String D() throws InvalidProtocolBufferException {
            int iX2 = x();
            if (iX2 > 0) {
                int i12 = this.f362972f;
                int i13 = this.f362974h;
                if (iX2 <= i12 - i13) {
                    String str = new String(this.f362971e, i13, iX2, C37670d0.f362857a);
                    this.f362974h += iX2;
                    return str;
                }
            }
            if (iX2 == 0) {
                return "";
            }
            if (iX2 < 0) {
                throw InvalidProtocolBufferException.f();
            }
            throw InvalidProtocolBufferException.h();
        }

        @Override // com.google.protobuf.AbstractC37708x
        public final String E() throws InvalidProtocolBufferException {
            int iX2 = x();
            if (iX2 > 0) {
                int i12 = this.f362972f;
                int i13 = this.f362974h;
                if (iX2 <= i12 - i13) {
                    String strA = s1.f362953a.a(this.f362971e, i13, iX2);
                    this.f362974h += iX2;
                    return strA;
                }
            }
            if (iX2 == 0) {
                return "";
            }
            if (iX2 <= 0) {
                throw InvalidProtocolBufferException.f();
            }
            throw InvalidProtocolBufferException.h();
        }

        @Override // com.google.protobuf.AbstractC37708x
        public final int F() throws InvalidProtocolBufferException {
            if (g()) {
                this.f362976j = 0;
                return 0;
            }
            int iX2 = x();
            this.f362976j = iX2;
            if ((iX2 >>> 3) != 0) {
                return iX2;
            }
            throw InvalidProtocolBufferException.b();
        }

        @Override // com.google.protobuf.AbstractC37708x
        public final int G() {
            return x();
        }

        @Override // com.google.protobuf.AbstractC37708x
        public final long H() {
            return L();
        }

        @Override // com.google.protobuf.AbstractC37708x
        public final boolean I(int i12) throws InvalidProtocolBufferException {
            int iF2;
            int i13 = i12 & 7;
            int i14 = 0;
            if (i13 == 0) {
                int i15 = this.f362972f - this.f362974h;
                byte[] bArr = this.f362971e;
                if (i15 >= 10) {
                    while (i14 < 10) {
                        int i16 = this.f362974h;
                        this.f362974h = i16 + 1;
                        if (bArr[i16] < 0) {
                            i14++;
                        }
                    }
                    throw InvalidProtocolBufferException.e();
                }
                while (i14 < 10) {
                    int i17 = this.f362974h;
                    if (i17 == this.f362972f) {
                        throw InvalidProtocolBufferException.h();
                    }
                    this.f362974h = i17 + 1;
                    if (bArr[i17] < 0) {
                        i14++;
                    }
                }
                throw InvalidProtocolBufferException.e();
                return true;
            }
            if (i13 == 1) {
                O(8);
                return true;
            }
            if (i13 == 2) {
                O(x());
                return true;
            }
            if (i13 != 3) {
                if (i13 == 4) {
                    return false;
                }
                if (i13 != 5) {
                    throw InvalidProtocolBufferException.d();
                }
                O(4);
                return true;
            }
            do {
                iF2 = F();
                if (iF2 == 0) {
                    break;
                }
            } while (I(iF2));
            a(((i12 >>> 3) << 3) | 4);
            return true;
        }

        public final int J() throws InvalidProtocolBufferException {
            int i12 = this.f362974h;
            if (this.f362972f - i12 < 4) {
                throw InvalidProtocolBufferException.h();
            }
            this.f362974h = i12 + 4;
            byte[] bArr = this.f362971e;
            return ((bArr[i12 + 3] & 255) << 24) | (bArr[i12] & 255) | ((bArr[i12 + 1] & 255) << 8) | ((bArr[i12 + 2] & 255) << 16);
        }

        public final long K() throws InvalidProtocolBufferException {
            int i12 = this.f362974h;
            if (this.f362972f - i12 < 8) {
                throw InvalidProtocolBufferException.h();
            }
            this.f362974h = i12 + 8;
            byte[] bArr = this.f362971e;
            return ((bArr[i12 + 7] & 255) << 56) | (bArr[i12] & 255) | ((bArr[i12 + 1] & 255) << 8) | ((bArr[i12 + 2] & 255) << 16) | ((bArr[i12 + 3] & 255) << 24) | ((bArr[i12 + 4] & 255) << 32) | ((bArr[i12 + 5] & 255) << 40) | ((bArr[i12 + 6] & 255) << 48);
        }

        public final long L() {
            long j12;
            long j13;
            long j14;
            long j15;
            int i12 = this.f362974h;
            int i13 = this.f362972f;
            if (i13 != i12) {
                int i14 = i12 + 1;
                byte[] bArr = this.f362971e;
                byte b12 = bArr[i12];
                if (b12 >= 0) {
                    this.f362974h = i14;
                    return b12;
                }
                if (i13 - i14 >= 9) {
                    int i15 = i12 + 2;
                    int i16 = (bArr[i14] << 7) ^ b12;
                    if (i16 < 0) {
                        j12 = i16 ^ (-128);
                    } else {
                        int i17 = i12 + 3;
                        int i18 = (bArr[i15] << 14) ^ i16;
                        if (i18 >= 0) {
                            j12 = i18 ^ 16256;
                            i15 = i17;
                        } else {
                            int i19 = i12 + 4;
                            int i22 = i18 ^ (bArr[i17] << 21);
                            if (i22 < 0) {
                                j15 = (-2080896) ^ i22;
                            } else {
                                long j16 = i22;
                                i15 = i12 + 5;
                                long j17 = j16 ^ (bArr[i19] << 28);
                                if (j17 >= 0) {
                                    j14 = 266354560;
                                } else {
                                    i19 = i12 + 6;
                                    long j18 = j17 ^ (bArr[i15] << 35);
                                    if (j18 < 0) {
                                        j13 = -34093383808L;
                                    } else {
                                        i15 = i12 + 7;
                                        j17 = j18 ^ (bArr[i19] << 42);
                                        if (j17 >= 0) {
                                            j14 = 4363953127296L;
                                        } else {
                                            i19 = i12 + 8;
                                            j18 = j17 ^ (bArr[i15] << 49);
                                            if (j18 < 0) {
                                                j13 = -558586000294016L;
                                            } else {
                                                i15 = i12 + 9;
                                                long j19 = (j18 ^ (bArr[i19] << 56)) ^ 71499008037633920L;
                                                if (j19 < 0) {
                                                    int i23 = i12 + 10;
                                                    if (bArr[i15] >= 0) {
                                                        i15 = i23;
                                                    }
                                                }
                                                j12 = j19;
                                            }
                                        }
                                    }
                                    j15 = j13 ^ j18;
                                }
                                j12 = j14 ^ j17;
                            }
                            i15 = i19;
                            j12 = j15;
                        }
                    }
                    this.f362974h = i15;
                    return j12;
                }
            }
            return M();
        }

        public final long M() throws InvalidProtocolBufferException {
            long j12 = 0;
            for (int i12 = 0; i12 < 64; i12 += 7) {
                int i13 = this.f362974h;
                if (i13 == this.f362972f) {
                    throw InvalidProtocolBufferException.h();
                }
                this.f362974h = i13 + 1;
                j12 |= (r3 & 127) << i12;
                if ((this.f362971e[i13] & 128) == 0) {
                    return j12;
                }
            }
            throw InvalidProtocolBufferException.e();
        }

        public final void N() {
            int i12 = this.f362972f + this.f362973g;
            this.f362972f = i12;
            int i13 = i12 - this.f362975i;
            int i14 = this.f362977k;
            if (i13 <= i14) {
                this.f362973g = 0;
                return;
            }
            int i15 = i13 - i14;
            this.f362973g = i15;
            this.f362972f = i12 - i15;
        }

        public final void O(int i12) throws InvalidProtocolBufferException {
            if (i12 >= 0) {
                int i13 = this.f362972f;
                int i14 = this.f362974h;
                if (i12 <= i13 - i14) {
                    this.f362974h = i14 + i12;
                    return;
                }
            }
            if (i12 >= 0) {
                throw InvalidProtocolBufferException.h();
            }
            throw InvalidProtocolBufferException.f();
        }

        @Override // com.google.protobuf.AbstractC37708x
        public final void a(int i12) throws InvalidProtocolBufferException {
            if (this.f362976j != i12) {
                throw InvalidProtocolBufferException.a();
            }
        }

        @Override // com.google.protobuf.AbstractC37708x
        public final int e() {
            int i12 = this.f362977k;
            if (i12 == Integer.MAX_VALUE) {
                return -1;
            }
            return i12 - f();
        }

        @Override // com.google.protobuf.AbstractC37708x
        public final int f() {
            return this.f362974h - this.f362975i;
        }

        @Override // com.google.protobuf.AbstractC37708x
        public final boolean g() {
            return this.f362974h == this.f362972f;
        }

        @Override // com.google.protobuf.AbstractC37708x
        public final void k(int i12) {
            this.f362977k = i12;
            N();
        }

        @Override // com.google.protobuf.AbstractC37708x
        public final int l(int i12) throws InvalidProtocolBufferException {
            if (i12 < 0) {
                throw InvalidProtocolBufferException.f();
            }
            int iF2 = i12 + f();
            if (iF2 < 0) {
                throw InvalidProtocolBufferException.g();
            }
            int i13 = this.f362977k;
            if (iF2 > i13) {
                throw InvalidProtocolBufferException.h();
            }
            this.f362977k = iF2;
            N();
            return i13;
        }

        @Override // com.google.protobuf.AbstractC37708x
        public final boolean m() {
            return L() != 0;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
        @Override // com.google.protobuf.AbstractC37708x
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final com.google.protobuf.AbstractC37700t n() throws com.google.protobuf.InvalidProtocolBufferException {
            /*
                r4 = this;
                int r0 = r4.x()
                byte[] r1 = r4.f362971e
                if (r0 <= 0) goto L19
                int r2 = r4.f362972f
                int r3 = r4.f362974h
                int r2 = r2 - r3
                if (r0 > r2) goto L19
                com.google.protobuf.t r1 = com.google.protobuf.AbstractC37700t.h(r3, r0, r1)
                int r2 = r4.f362974h
                int r2 = r2 + r0
                r4.f362974h = r2
                return r1
            L19:
                if (r0 != 0) goto L1e
                com.google.protobuf.t r0 = com.google.protobuf.AbstractC37700t.f362954c
                return r0
            L1e:
                if (r0 <= 0) goto L2f
                int r2 = r4.f362972f
                int r3 = r4.f362974h
                int r2 = r2 - r3
                if (r0 > r2) goto L2f
                int r0 = r0 + r3
                r4.f362974h = r0
                byte[] r0 = java.util.Arrays.copyOfRange(r1, r3, r0)
                goto L35
            L2f:
                if (r0 > 0) goto L42
                if (r0 != 0) goto L3d
                byte[] r0 = com.google.protobuf.C37670d0.f362858b
            L35:
                com.google.protobuf.t r1 = com.google.protobuf.AbstractC37700t.f362954c
                com.google.protobuf.t$j r1 = new com.google.protobuf.t$j
                r1.<init>(r0)
                return r1
            L3d:
                com.google.protobuf.InvalidProtocolBufferException r0 = com.google.protobuf.InvalidProtocolBufferException.f()
                throw r0
            L42:
                com.google.protobuf.InvalidProtocolBufferException r0 = com.google.protobuf.InvalidProtocolBufferException.h()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.AbstractC37708x.b.n():com.google.protobuf.t");
        }

        @Override // com.google.protobuf.AbstractC37708x
        public final double o() {
            return Double.longBitsToDouble(K());
        }

        @Override // com.google.protobuf.AbstractC37708x
        public final int p() {
            return x();
        }

        @Override // com.google.protobuf.AbstractC37708x
        public final int q() {
            return J();
        }

        @Override // com.google.protobuf.AbstractC37708x
        public final long r() {
            return K();
        }

        @Override // com.google.protobuf.AbstractC37708x
        public final float s() {
            return Float.intBitsToFloat(J());
        }

        @Override // com.google.protobuf.AbstractC37708x
        public final void t(int i12, InterfaceC37707w0.a aVar, M m12) throws InvalidProtocolBufferException {
            b();
            this.f362967a++;
            aVar.m2(this, m12);
            a((i12 << 3) | 4);
            this.f362967a--;
        }

        @Override // com.google.protobuf.AbstractC37708x
        public final int u() {
            return x();
        }

        @Override // com.google.protobuf.AbstractC37708x
        public final long v() {
            return L();
        }

        @Override // com.google.protobuf.AbstractC37708x
        public final void w(InterfaceC37707w0.a aVar, M m12) throws InvalidProtocolBufferException {
            int iX2 = x();
            b();
            int iL2 = l(iX2);
            this.f362967a++;
            aVar.m2(this, m12);
            a(0);
            this.f362967a--;
            if (e() != 0) {
                throw InvalidProtocolBufferException.h();
            }
            k(iL2);
        }

        @Override // com.google.protobuf.AbstractC37708x
        public final int x() {
            int i12;
            int i13 = this.f362974h;
            int i14 = this.f362972f;
            if (i14 != i13) {
                int i15 = i13 + 1;
                byte[] bArr = this.f362971e;
                byte b12 = bArr[i13];
                if (b12 >= 0) {
                    this.f362974h = i15;
                    return b12;
                }
                if (i14 - i15 >= 9) {
                    int i16 = i13 + 2;
                    int i17 = (bArr[i15] << 7) ^ b12;
                    if (i17 < 0) {
                        i12 = i17 ^ (-128);
                    } else {
                        int i18 = i13 + 3;
                        int i19 = (bArr[i16] << 14) ^ i17;
                        if (i19 >= 0) {
                            i12 = i19 ^ 16256;
                        } else {
                            int i22 = i13 + 4;
                            int i23 = i19 ^ (bArr[i18] << 21);
                            if (i23 < 0) {
                                i12 = (-2080896) ^ i23;
                            } else {
                                i18 = i13 + 5;
                                byte b13 = bArr[i22];
                                int i24 = (i23 ^ (b13 << 28)) ^ 266354560;
                                if (b13 < 0) {
                                    i22 = i13 + 6;
                                    if (bArr[i18] < 0) {
                                        i18 = i13 + 7;
                                        if (bArr[i22] < 0) {
                                            i22 = i13 + 8;
                                            if (bArr[i18] < 0) {
                                                i18 = i13 + 9;
                                                if (bArr[i22] < 0) {
                                                    int i25 = i13 + 10;
                                                    if (bArr[i18] >= 0) {
                                                        i16 = i25;
                                                        i12 = i24;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i12 = i24;
                                }
                                i12 = i24;
                            }
                            i16 = i22;
                        }
                        i16 = i18;
                    }
                    this.f362974h = i16;
                    return i12;
                }
            }
            return (int) M();
        }

        @Override // com.google.protobuf.AbstractC37708x
        public final int z() {
            return J();
        }
    }

    /* compiled from: CodedInputStream.java */
    /* renamed from: com.google.protobuf.x$c */
    public static final class c extends AbstractC37708x {

        /* renamed from: e, reason: collision with root package name */
        public final Iterable<ByteBuffer> f362978e;

        /* renamed from: f, reason: collision with root package name */
        public final Iterator<ByteBuffer> f362979f;

        /* renamed from: g, reason: collision with root package name */
        public ByteBuffer f362980g;

        /* renamed from: h, reason: collision with root package name */
        public int f362981h;

        /* renamed from: i, reason: collision with root package name */
        public int f362982i;

        /* renamed from: j, reason: collision with root package name */
        public int f362983j;

        /* renamed from: k, reason: collision with root package name */
        public int f362984k;

        /* renamed from: l, reason: collision with root package name */
        public int f362985l;

        /* renamed from: m, reason: collision with root package name */
        public long f362986m;

        /* renamed from: n, reason: collision with root package name */
        public long f362987n;

        /* renamed from: o, reason: collision with root package name */
        public long f362988o;

        public c() {
            throw null;
        }

        public c(Iterable iterable, int i12, boolean z12, a aVar) {
            super();
            this.f362983j = Integer.MAX_VALUE;
            this.f362981h = i12;
            this.f362978e = iterable;
            this.f362979f = iterable.iterator();
            this.f362985l = 0;
            if (i12 != 0) {
                S();
                return;
            }
            this.f362980g = C37670d0.f362859c;
            this.f362986m = 0L;
            this.f362987n = 0L;
            this.f362988o = 0L;
        }

        @Override // com.google.protobuf.AbstractC37708x
        public final long A() {
            return N();
        }

        @Override // com.google.protobuf.AbstractC37708x
        public final int B() {
            return AbstractC37708x.c(x());
        }

        @Override // com.google.protobuf.AbstractC37708x
        public final long C() {
            return AbstractC37708x.d(O());
        }

        @Override // com.google.protobuf.AbstractC37708x
        public final String D() throws InvalidProtocolBufferException {
            int iX2 = x();
            if (iX2 > 0) {
                long j12 = iX2;
                long j13 = this.f362988o;
                long j14 = this.f362986m;
                if (j12 <= j13 - j14) {
                    byte[] bArr = new byte[iX2];
                    r1.f362946c.c(j14, bArr, 0L, j12);
                    String str = new String(bArr, C37670d0.f362857a);
                    this.f362986m += j12;
                    return str;
                }
            }
            if (iX2 > 0 && iX2 <= Q()) {
                byte[] bArr2 = new byte[iX2];
                L(iX2, bArr2);
                return new String(bArr2, C37670d0.f362857a);
            }
            if (iX2 == 0) {
                return "";
            }
            if (iX2 < 0) {
                throw InvalidProtocolBufferException.f();
            }
            throw InvalidProtocolBufferException.h();
        }

        @Override // com.google.protobuf.AbstractC37708x
        public final String E() throws InvalidProtocolBufferException {
            int iX2 = x();
            if (iX2 > 0) {
                long j12 = iX2;
                long j13 = this.f362988o;
                long j14 = this.f362986m;
                if (j12 <= j13 - j14) {
                    String strC = s1.c(this.f362980g, (int) (j14 - this.f362987n), iX2);
                    this.f362986m += j12;
                    return strC;
                }
            }
            if (iX2 >= 0 && iX2 <= Q()) {
                byte[] bArr = new byte[iX2];
                L(iX2, bArr);
                return s1.f362953a.a(bArr, 0, iX2);
            }
            if (iX2 == 0) {
                return "";
            }
            if (iX2 <= 0) {
                throw InvalidProtocolBufferException.f();
            }
            throw InvalidProtocolBufferException.h();
        }

        @Override // com.google.protobuf.AbstractC37708x
        public final int F() throws InvalidProtocolBufferException {
            if (g()) {
                this.f362984k = 0;
                return 0;
            }
            int iX2 = x();
            this.f362984k = iX2;
            if ((iX2 >>> 3) != 0) {
                return iX2;
            }
            throw InvalidProtocolBufferException.b();
        }

        @Override // com.google.protobuf.AbstractC37708x
        public final int G() {
            return x();
        }

        @Override // com.google.protobuf.AbstractC37708x
        public final long H() {
            return O();
        }

        @Override // com.google.protobuf.AbstractC37708x
        public final boolean I(int i12) throws InvalidProtocolBufferException {
            int iF2;
            int i13 = i12 & 7;
            if (i13 == 0) {
                for (int i14 = 0; i14 < 10; i14++) {
                    if (K() >= 0) {
                        return true;
                    }
                }
                throw InvalidProtocolBufferException.e();
            }
            if (i13 == 1) {
                R(8);
                return true;
            }
            if (i13 == 2) {
                R(x());
                return true;
            }
            if (i13 != 3) {
                if (i13 == 4) {
                    return false;
                }
                if (i13 != 5) {
                    throw InvalidProtocolBufferException.d();
                }
                R(4);
                return true;
            }
            do {
                iF2 = F();
                if (iF2 == 0) {
                    break;
                }
            } while (I(iF2));
            a(((i12 >>> 3) << 3) | 4);
            return true;
        }

        public final long J() {
            return this.f362988o - this.f362986m;
        }

        public final byte K() throws InvalidProtocolBufferException {
            if (J() == 0) {
                if (!this.f362979f.hasNext()) {
                    throw InvalidProtocolBufferException.h();
                }
                S();
            }
            long j12 = this.f362986m;
            this.f362986m = 1 + j12;
            return r1.f362946c.f(j12);
        }

        public final void L(int i12, byte[] bArr) throws InvalidProtocolBufferException {
            if (i12 < 0 || i12 > Q()) {
                if (i12 > 0) {
                    throw InvalidProtocolBufferException.h();
                }
                if (i12 != 0) {
                    throw InvalidProtocolBufferException.f();
                }
                return;
            }
            int i13 = i12;
            while (i13 > 0) {
                if (J() == 0) {
                    if (!this.f362979f.hasNext()) {
                        throw InvalidProtocolBufferException.h();
                    }
                    S();
                }
                int iMin = Math.min(i13, (int) J());
                long j12 = iMin;
                r1.f362946c.c(this.f362986m, bArr, i12 - i13, j12);
                i13 -= iMin;
                this.f362986m += j12;
            }
        }

        public final int M() {
            if (J() < 4) {
                return (K() & 255) | ((K() & 255) << 8) | ((K() & 255) << 16) | ((K() & 255) << 24);
            }
            long j12 = this.f362986m;
            this.f362986m = 4 + j12;
            r1.e eVar = r1.f362946c;
            return ((eVar.f(j12 + 3) & 255) << 24) | (eVar.f(j12) & 255) | ((eVar.f(1 + j12) & 255) << 8) | ((eVar.f(2 + j12) & 255) << 16);
        }

        public final long N() throws InvalidProtocolBufferException {
            long jK2;
            byte bK2;
            if (J() >= 8) {
                long j12 = this.f362986m;
                this.f362986m = 8 + j12;
                jK2 = (r1.f(j12) & 255) | ((r1.f(j12 + 1) & 255) << 8) | ((r1.f(2 + j12) & 255) << 16) | ((r1.f(3 + j12) & 255) << 24) | ((r1.f(4 + j12) & 255) << 32) | ((r1.f(5 + j12) & 255) << 40) | ((r1.f(6 + j12) & 255) << 48);
                bK2 = r1.f362946c.f(j12 + 7);
            } else {
                jK2 = (K() & 255) | ((K() & 255) << 8) | ((K() & 255) << 16) | ((K() & 255) << 24) | ((K() & 255) << 32) | ((K() & 255) << 40) | ((K() & 255) << 48);
                bK2 = K();
            }
            return ((bK2 & 255) << 56) | jK2;
        }

        public final long O() {
            long j12;
            long j13;
            long j14;
            long j15 = this.f362986m;
            if (this.f362988o != j15) {
                long j16 = j15 + 1;
                r1.e eVar = r1.f362946c;
                byte bF2 = eVar.f(j15);
                if (bF2 >= 0) {
                    this.f362986m++;
                    return bF2;
                }
                if (this.f362988o - this.f362986m >= 10) {
                    long j17 = 2 + j15;
                    int iF2 = (eVar.f(j16) << 7) ^ bF2;
                    if (iF2 < 0) {
                        j12 = iF2 ^ (-128);
                    } else {
                        long j18 = 3 + j15;
                        int iF3 = (eVar.f(j17) << 14) ^ iF2;
                        if (iF3 >= 0) {
                            j12 = iF3 ^ 16256;
                        } else {
                            long j19 = 4 + j15;
                            int iF4 = iF3 ^ (eVar.f(j18) << 21);
                            if (iF4 < 0) {
                                j12 = (-2080896) ^ iF4;
                                j17 = j19;
                            } else {
                                long j22 = 5 + j15;
                                long jF2 = (eVar.f(j19) << 28) ^ iF4;
                                if (jF2 >= 0) {
                                    j14 = 266354560;
                                } else {
                                    j18 = 6 + j15;
                                    long jF3 = jF2 ^ (eVar.f(j22) << 35);
                                    if (jF3 < 0) {
                                        j13 = -34093383808L;
                                    } else {
                                        j22 = 7 + j15;
                                        jF2 = jF3 ^ (eVar.f(j18) << 42);
                                        if (jF2 >= 0) {
                                            j14 = 4363953127296L;
                                        } else {
                                            j18 = 8 + j15;
                                            jF3 = jF2 ^ (eVar.f(j22) << 49);
                                            if (jF3 < 0) {
                                                j13 = -558586000294016L;
                                            } else {
                                                j22 = 9 + j15;
                                                long jF4 = (jF3 ^ (eVar.f(j18) << 56)) ^ 71499008037633920L;
                                                if (jF4 < 0) {
                                                    long j23 = j15 + 10;
                                                    if (eVar.f(j22) >= 0) {
                                                        j12 = jF4;
                                                        j17 = j23;
                                                    }
                                                } else {
                                                    j12 = jF4;
                                                    j17 = j22;
                                                }
                                            }
                                        }
                                    }
                                    j12 = j13 ^ jF3;
                                }
                                j12 = j14 ^ jF2;
                                j17 = j22;
                            }
                        }
                        j17 = j18;
                    }
                    this.f362986m = j17;
                    return j12;
                }
            }
            return P();
        }

        public final long P() throws InvalidProtocolBufferException {
            long j12 = 0;
            for (int i12 = 0; i12 < 64; i12 += 7) {
                j12 |= (r3 & 127) << i12;
                if ((K() & 128) == 0) {
                    return j12;
                }
            }
            throw InvalidProtocolBufferException.e();
        }

        public final int Q() {
            return (int) (((this.f362981h - this.f362985l) - this.f362986m) + this.f362987n);
        }

        public final void R(int i12) throws InvalidProtocolBufferException {
            if (i12 < 0 || i12 > ((this.f362981h - this.f362985l) - this.f362986m) + this.f362987n) {
                if (i12 >= 0) {
                    throw InvalidProtocolBufferException.h();
                }
                throw InvalidProtocolBufferException.f();
            }
            while (i12 > 0) {
                if (J() == 0) {
                    if (!this.f362979f.hasNext()) {
                        throw InvalidProtocolBufferException.h();
                    }
                    S();
                }
                int iMin = Math.min(i12, (int) J());
                i12 -= iMin;
                this.f362986m += iMin;
            }
        }

        public final void S() {
            ByteBuffer next = this.f362979f.next();
            this.f362980g = next;
            this.f362985l += (int) (this.f362986m - this.f362987n);
            long jPosition = next.position();
            this.f362986m = jPosition;
            this.f362987n = jPosition;
            this.f362988o = this.f362980g.limit();
            long jB2 = r1.b(this.f362980g);
            this.f362986m += jB2;
            this.f362987n += jB2;
            this.f362988o += jB2;
        }

        @Override // com.google.protobuf.AbstractC37708x
        public final void a(int i12) throws InvalidProtocolBufferException {
            if (this.f362984k != i12) {
                throw InvalidProtocolBufferException.a();
            }
        }

        @Override // com.google.protobuf.AbstractC37708x
        public final int e() {
            int i12 = this.f362983j;
            if (i12 == Integer.MAX_VALUE) {
                return -1;
            }
            return i12 - f();
        }

        @Override // com.google.protobuf.AbstractC37708x
        public final int f() {
            return (int) ((this.f362985l + this.f362986m) - this.f362987n);
        }

        @Override // com.google.protobuf.AbstractC37708x
        public final boolean g() {
            return (((long) this.f362985l) + this.f362986m) - this.f362987n == ((long) this.f362981h);
        }

        @Override // com.google.protobuf.AbstractC37708x
        public final void k(int i12) {
            this.f362983j = i12;
            int i13 = this.f362981h + this.f362982i;
            this.f362981h = i13;
            if (i13 <= i12) {
                this.f362982i = 0;
                return;
            }
            int i14 = i13 - i12;
            this.f362982i = i14;
            this.f362981h = i13 - i14;
        }

        @Override // com.google.protobuf.AbstractC37708x
        public final int l(int i12) throws InvalidProtocolBufferException {
            if (i12 < 0) {
                throw InvalidProtocolBufferException.f();
            }
            int iF2 = i12 + f();
            int i13 = this.f362983j;
            if (iF2 > i13) {
                throw InvalidProtocolBufferException.h();
            }
            this.f362983j = iF2;
            int i14 = this.f362981h + this.f362982i;
            this.f362981h = i14;
            if (i14 > iF2) {
                int i15 = i14 - iF2;
                this.f362982i = i15;
                this.f362981h = i14 - i15;
            } else {
                this.f362982i = 0;
            }
            return i13;
        }

        @Override // com.google.protobuf.AbstractC37708x
        public final boolean m() {
            return O() != 0;
        }

        @Override // com.google.protobuf.AbstractC37708x
        public final AbstractC37700t n() throws InvalidProtocolBufferException {
            int iX2 = x();
            if (iX2 > 0) {
                long j12 = iX2;
                long j13 = this.f362988o;
                long j14 = this.f362986m;
                if (j12 <= j13 - j14) {
                    byte[] bArr = new byte[iX2];
                    r1.f362946c.c(j14, bArr, 0L, j12);
                    this.f362986m += j12;
                    AbstractC37700t abstractC37700t = AbstractC37700t.f362954c;
                    return new AbstractC37700t.j(bArr);
                }
            }
            if (iX2 > 0 && iX2 <= Q()) {
                byte[] bArr2 = new byte[iX2];
                L(iX2, bArr2);
                AbstractC37700t abstractC37700t2 = AbstractC37700t.f362954c;
                return new AbstractC37700t.j(bArr2);
            }
            if (iX2 == 0) {
                return AbstractC37700t.f362954c;
            }
            if (iX2 < 0) {
                throw InvalidProtocolBufferException.f();
            }
            throw InvalidProtocolBufferException.h();
        }

        @Override // com.google.protobuf.AbstractC37708x
        public final double o() {
            return Double.longBitsToDouble(N());
        }

        @Override // com.google.protobuf.AbstractC37708x
        public final int p() {
            return x();
        }

        @Override // com.google.protobuf.AbstractC37708x
        public final int q() {
            return M();
        }

        @Override // com.google.protobuf.AbstractC37708x
        public final long r() {
            return N();
        }

        @Override // com.google.protobuf.AbstractC37708x
        public final float s() {
            return Float.intBitsToFloat(M());
        }

        @Override // com.google.protobuf.AbstractC37708x
        public final void t(int i12, InterfaceC37707w0.a aVar, M m12) throws InvalidProtocolBufferException {
            b();
            this.f362967a++;
            aVar.m2(this, m12);
            a((i12 << 3) | 4);
            this.f362967a--;
        }

        @Override // com.google.protobuf.AbstractC37708x
        public final int u() {
            return x();
        }

        @Override // com.google.protobuf.AbstractC37708x
        public final long v() {
            return O();
        }

        @Override // com.google.protobuf.AbstractC37708x
        public final void w(InterfaceC37707w0.a aVar, M m12) throws InvalidProtocolBufferException {
            int iX2 = x();
            b();
            int iL2 = l(iX2);
            this.f362967a++;
            aVar.m2(this, m12);
            a(0);
            this.f362967a--;
            if (e() != 0) {
                throw InvalidProtocolBufferException.h();
            }
            k(iL2);
        }

        @Override // com.google.protobuf.AbstractC37708x
        public final int x() {
            int i12;
            long j12 = this.f362986m;
            if (this.f362988o != j12) {
                long j13 = j12 + 1;
                r1.e eVar = r1.f362946c;
                byte bF2 = eVar.f(j12);
                if (bF2 >= 0) {
                    this.f362986m++;
                    return bF2;
                }
                if (this.f362988o - this.f362986m >= 10) {
                    long j14 = 2 + j12;
                    int iF2 = (eVar.f(j13) << 7) ^ bF2;
                    if (iF2 < 0) {
                        i12 = iF2 ^ (-128);
                    } else {
                        long j15 = 3 + j12;
                        int iF3 = (eVar.f(j14) << 14) ^ iF2;
                        if (iF3 >= 0) {
                            i12 = iF3 ^ 16256;
                        } else {
                            long j16 = 4 + j12;
                            int iF4 = iF3 ^ (eVar.f(j15) << 21);
                            if (iF4 < 0) {
                                i12 = (-2080896) ^ iF4;
                            } else {
                                j15 = 5 + j12;
                                byte bF3 = eVar.f(j16);
                                int i13 = (iF4 ^ (bF3 << 28)) ^ 266354560;
                                if (bF3 < 0) {
                                    j16 = 6 + j12;
                                    if (eVar.f(j15) < 0) {
                                        j15 = 7 + j12;
                                        if (eVar.f(j16) < 0) {
                                            j16 = 8 + j12;
                                            if (eVar.f(j15) < 0) {
                                                j15 = 9 + j12;
                                                if (eVar.f(j16) < 0) {
                                                    long j17 = j12 + 10;
                                                    if (eVar.f(j15) >= 0) {
                                                        i12 = i13;
                                                        j14 = j17;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i12 = i13;
                                }
                                i12 = i13;
                            }
                            j14 = j16;
                        }
                        j14 = j15;
                    }
                    this.f362986m = j14;
                    return i12;
                }
            }
            return (int) P();
        }

        @Override // com.google.protobuf.AbstractC37708x
        public final int z() {
            return M();
        }
    }

    /* compiled from: CodedInputStream.java */
    /* renamed from: com.google.protobuf.x$d */
    public static final class d extends AbstractC37708x {

        /* renamed from: e, reason: collision with root package name */
        public final InputStream f362989e;

        /* renamed from: f, reason: collision with root package name */
        public final byte[] f362990f;

        /* renamed from: g, reason: collision with root package name */
        public int f362991g;

        /* renamed from: h, reason: collision with root package name */
        public int f362992h;

        /* renamed from: i, reason: collision with root package name */
        public int f362993i;

        /* renamed from: j, reason: collision with root package name */
        public int f362994j;

        /* renamed from: k, reason: collision with root package name */
        public int f362995k;

        /* renamed from: l, reason: collision with root package name */
        public int f362996l;

        /* compiled from: CodedInputStream.java */
        /* renamed from: com.google.protobuf.x$d$a */
        public interface a {
        }

        /* compiled from: CodedInputStream.java */
        /* renamed from: com.google.protobuf.x$d$b */
        public class b implements a {
        }

        public d(InputStream inputStream, int i12, a aVar) {
            super();
            this.f362996l = Integer.MAX_VALUE;
            C37670d0.a(inputStream, "input");
            this.f362989e = inputStream;
            this.f362990f = new byte[i12];
            this.f362991g = 0;
            this.f362993i = 0;
            this.f362995k = 0;
        }

        @Override // com.google.protobuf.AbstractC37708x
        public final long A() {
            return N();
        }

        @Override // com.google.protobuf.AbstractC37708x
        public final int B() {
            return AbstractC37708x.c(x());
        }

        @Override // com.google.protobuf.AbstractC37708x
        public final long C() {
            return AbstractC37708x.d(O());
        }

        @Override // com.google.protobuf.AbstractC37708x
        public final String D() throws InvalidProtocolBufferException {
            int iX2 = x();
            byte[] bArr = this.f362990f;
            if (iX2 > 0) {
                int i12 = this.f362991g;
                int i13 = this.f362993i;
                if (iX2 <= i12 - i13) {
                    String str = new String(bArr, i13, iX2, C37670d0.f362857a);
                    this.f362993i += iX2;
                    return str;
                }
            }
            if (iX2 == 0) {
                return "";
            }
            if (iX2 > this.f362991g) {
                return new String(J(iX2), C37670d0.f362857a);
            }
            R(iX2);
            String str2 = new String(bArr, this.f362993i, iX2, C37670d0.f362857a);
            this.f362993i += iX2;
            return str2;
        }

        @Override // com.google.protobuf.AbstractC37708x
        public final String E() throws IOException {
            int iX2 = x();
            int i12 = this.f362993i;
            int i13 = this.f362991g;
            int i14 = i13 - i12;
            byte[] bArrJ = this.f362990f;
            if (iX2 <= i14 && iX2 > 0) {
                this.f362993i = i12 + iX2;
            } else {
                if (iX2 == 0) {
                    return "";
                }
                i12 = 0;
                if (iX2 <= i13) {
                    R(iX2);
                    this.f362993i = iX2;
                } else {
                    bArrJ = J(iX2);
                }
            }
            return s1.f362953a.a(bArrJ, i12, iX2);
        }

        @Override // com.google.protobuf.AbstractC37708x
        public final int F() throws InvalidProtocolBufferException {
            if (g()) {
                this.f362994j = 0;
                return 0;
            }
            int iX2 = x();
            this.f362994j = iX2;
            if ((iX2 >>> 3) != 0) {
                return iX2;
            }
            throw InvalidProtocolBufferException.b();
        }

        @Override // com.google.protobuf.AbstractC37708x
        public final int G() {
            return x();
        }

        @Override // com.google.protobuf.AbstractC37708x
        public final long H() {
            return O();
        }

        @Override // com.google.protobuf.AbstractC37708x
        public final boolean I(int i12) throws InvalidProtocolBufferException {
            int iF2;
            int i13 = i12 & 7;
            int i14 = 0;
            if (i13 == 0) {
                int i15 = this.f362991g - this.f362993i;
                byte[] bArr = this.f362990f;
                if (i15 >= 10) {
                    while (i14 < 10) {
                        int i16 = this.f362993i;
                        this.f362993i = i16 + 1;
                        if (bArr[i16] < 0) {
                            i14++;
                        }
                    }
                    throw InvalidProtocolBufferException.e();
                }
                while (i14 < 10) {
                    if (this.f362993i == this.f362991g) {
                        R(1);
                    }
                    int i17 = this.f362993i;
                    this.f362993i = i17 + 1;
                    if (bArr[i17] < 0) {
                        i14++;
                    }
                }
                throw InvalidProtocolBufferException.e();
                return true;
            }
            if (i13 == 1) {
                S(8);
                return true;
            }
            if (i13 == 2) {
                S(x());
                return true;
            }
            if (i13 != 3) {
                if (i13 == 4) {
                    return false;
                }
                if (i13 != 5) {
                    throw InvalidProtocolBufferException.d();
                }
                S(4);
                return true;
            }
            do {
                iF2 = F();
                if (iF2 == 0) {
                    break;
                }
            } while (I(iF2));
            a(((i12 >>> 3) << 3) | 4);
            return true;
        }

        public final byte[] J(int i12) throws IOException {
            byte[] bArrK = K(i12);
            if (bArrK != null) {
                return bArrK;
            }
            int i13 = this.f362993i;
            int i14 = this.f362991g;
            int length = i14 - i13;
            this.f362995k += i14;
            this.f362993i = 0;
            this.f362991g = 0;
            ArrayList arrayListL = L(i12 - length);
            byte[] bArr = new byte[i12];
            System.arraycopy(this.f362990f, i13, bArr, 0, length);
            Iterator it = arrayListL.iterator();
            while (it.hasNext()) {
                byte[] bArr2 = (byte[]) it.next();
                System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
                length += bArr2.length;
            }
            return bArr;
        }

        public final byte[] K(int i12) throws IOException {
            if (i12 == 0) {
                return C37670d0.f362858b;
            }
            if (i12 < 0) {
                throw InvalidProtocolBufferException.f();
            }
            int i13 = this.f362995k;
            int i14 = this.f362993i;
            int i15 = i13 + i14 + i12;
            if (i15 - this.f362969c > 0) {
                throw new InvalidProtocolBufferException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
            }
            int i16 = this.f362996l;
            if (i15 > i16) {
                S((i16 - i13) - i14);
                throw InvalidProtocolBufferException.h();
            }
            int i17 = this.f362991g - i14;
            int i18 = i12 - i17;
            InputStream inputStream = this.f362989e;
            if (i18 >= 4096) {
                try {
                    if (i18 > inputStream.available()) {
                        return null;
                    }
                } catch (InvalidProtocolBufferException e12) {
                    e12.f362695b = true;
                    throw e12;
                }
            }
            byte[] bArr = new byte[i12];
            System.arraycopy(this.f362990f, this.f362993i, bArr, 0, i17);
            this.f362995k += this.f362991g;
            this.f362993i = 0;
            this.f362991g = 0;
            while (i17 < i12) {
                try {
                    int i19 = inputStream.read(bArr, i17, i12 - i17);
                    if (i19 == -1) {
                        throw InvalidProtocolBufferException.h();
                    }
                    this.f362995k += i19;
                    i17 += i19;
                } catch (InvalidProtocolBufferException e13) {
                    e13.f362695b = true;
                    throw e13;
                }
            }
            return bArr;
        }

        public final ArrayList L(int i12) throws IOException {
            ArrayList arrayList = new ArrayList();
            while (i12 > 0) {
                int iMin = Math.min(i12, 4096);
                byte[] bArr = new byte[iMin];
                int i13 = 0;
                while (i13 < iMin) {
                    int i14 = this.f362989e.read(bArr, i13, iMin - i13);
                    if (i14 == -1) {
                        throw InvalidProtocolBufferException.h();
                    }
                    this.f362995k += i14;
                    i13 += i14;
                }
                i12 -= iMin;
                arrayList.add(bArr);
            }
            return arrayList;
        }

        public final int M() throws InvalidProtocolBufferException {
            int i12 = this.f362993i;
            if (this.f362991g - i12 < 4) {
                R(4);
                i12 = this.f362993i;
            }
            this.f362993i = i12 + 4;
            byte[] bArr = this.f362990f;
            return ((bArr[i12 + 3] & 255) << 24) | (bArr[i12] & 255) | ((bArr[i12 + 1] & 255) << 8) | ((bArr[i12 + 2] & 255) << 16);
        }

        public final long N() throws InvalidProtocolBufferException {
            int i12 = this.f362993i;
            if (this.f362991g - i12 < 8) {
                R(8);
                i12 = this.f362993i;
            }
            this.f362993i = i12 + 8;
            byte[] bArr = this.f362990f;
            return ((bArr[i12 + 7] & 255) << 56) | (bArr[i12] & 255) | ((bArr[i12 + 1] & 255) << 8) | ((bArr[i12 + 2] & 255) << 16) | ((bArr[i12 + 3] & 255) << 24) | ((bArr[i12 + 4] & 255) << 32) | ((bArr[i12 + 5] & 255) << 40) | ((bArr[i12 + 6] & 255) << 48);
        }

        public final long O() {
            long j12;
            long j13;
            long j14;
            long j15;
            int i12 = this.f362993i;
            int i13 = this.f362991g;
            if (i13 != i12) {
                int i14 = i12 + 1;
                byte[] bArr = this.f362990f;
                byte b12 = bArr[i12];
                if (b12 >= 0) {
                    this.f362993i = i14;
                    return b12;
                }
                if (i13 - i14 >= 9) {
                    int i15 = i12 + 2;
                    int i16 = (bArr[i14] << 7) ^ b12;
                    if (i16 < 0) {
                        j12 = i16 ^ (-128);
                    } else {
                        int i17 = i12 + 3;
                        int i18 = (bArr[i15] << 14) ^ i16;
                        if (i18 >= 0) {
                            j12 = i18 ^ 16256;
                            i15 = i17;
                        } else {
                            int i19 = i12 + 4;
                            int i22 = i18 ^ (bArr[i17] << 21);
                            if (i22 < 0) {
                                j15 = (-2080896) ^ i22;
                            } else {
                                long j16 = i22;
                                i15 = i12 + 5;
                                long j17 = j16 ^ (bArr[i19] << 28);
                                if (j17 >= 0) {
                                    j14 = 266354560;
                                } else {
                                    i19 = i12 + 6;
                                    long j18 = j17 ^ (bArr[i15] << 35);
                                    if (j18 < 0) {
                                        j13 = -34093383808L;
                                    } else {
                                        i15 = i12 + 7;
                                        j17 = j18 ^ (bArr[i19] << 42);
                                        if (j17 >= 0) {
                                            j14 = 4363953127296L;
                                        } else {
                                            i19 = i12 + 8;
                                            j18 = j17 ^ (bArr[i15] << 49);
                                            if (j18 < 0) {
                                                j13 = -558586000294016L;
                                            } else {
                                                i15 = i12 + 9;
                                                long j19 = (j18 ^ (bArr[i19] << 56)) ^ 71499008037633920L;
                                                if (j19 < 0) {
                                                    int i23 = i12 + 10;
                                                    if (bArr[i15] >= 0) {
                                                        i15 = i23;
                                                    }
                                                }
                                                j12 = j19;
                                            }
                                        }
                                    }
                                    j15 = j13 ^ j18;
                                }
                                j12 = j14 ^ j17;
                            }
                            i15 = i19;
                            j12 = j15;
                        }
                    }
                    this.f362993i = i15;
                    return j12;
                }
            }
            return P();
        }

        public final long P() throws InvalidProtocolBufferException {
            long j12 = 0;
            for (int i12 = 0; i12 < 64; i12 += 7) {
                if (this.f362993i == this.f362991g) {
                    R(1);
                }
                int i13 = this.f362993i;
                this.f362993i = i13 + 1;
                j12 |= (r3 & 127) << i12;
                if ((this.f362990f[i13] & 128) == 0) {
                    return j12;
                }
            }
            throw InvalidProtocolBufferException.e();
        }

        public final void Q() {
            int i12 = this.f362991g + this.f362992h;
            this.f362991g = i12;
            int i13 = this.f362995k + i12;
            int i14 = this.f362996l;
            if (i13 <= i14) {
                this.f362992h = 0;
                return;
            }
            int i15 = i13 - i14;
            this.f362992h = i15;
            this.f362991g = i12 - i15;
        }

        public final void R(int i12) throws InvalidProtocolBufferException {
            if (T(i12)) {
                return;
            }
            if (i12 <= (this.f362969c - this.f362995k) - this.f362993i) {
                throw InvalidProtocolBufferException.h();
            }
            throw new InvalidProtocolBufferException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }

        public final void S(int i12) throws InvalidProtocolBufferException {
            int i13 = this.f362991g;
            int i14 = this.f362993i;
            if (i12 <= i13 - i14 && i12 >= 0) {
                this.f362993i = i14 + i12;
                return;
            }
            InputStream inputStream = this.f362989e;
            if (i12 < 0) {
                throw InvalidProtocolBufferException.f();
            }
            int i15 = this.f362995k;
            int i16 = i15 + i14;
            int i17 = i16 + i12;
            int i18 = this.f362996l;
            if (i17 > i18) {
                S((i18 - i15) - i14);
                throw InvalidProtocolBufferException.h();
            }
            this.f362995k = i16;
            int i19 = i13 - i14;
            this.f362991g = 0;
            this.f362993i = 0;
            while (i19 < i12) {
                long j12 = i12 - i19;
                try {
                    try {
                        long jSkip = inputStream.skip(j12);
                        if (jSkip < 0 || jSkip > j12) {
                            throw new IllegalStateException(inputStream.getClass() + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
                        }
                        if (jSkip == 0) {
                            break;
                        } else {
                            i19 += (int) jSkip;
                        }
                    } catch (InvalidProtocolBufferException e12) {
                        e12.f362695b = true;
                        throw e12;
                    }
                } catch (Throwable th2) {
                    this.f362995k += i19;
                    Q();
                    throw th2;
                }
            }
            this.f362995k += i19;
            Q();
            if (i19 >= i12) {
                return;
            }
            int i22 = this.f362991g;
            int i23 = i22 - this.f362993i;
            this.f362993i = i22;
            R(1);
            while (true) {
                int i24 = i12 - i23;
                int i25 = this.f362991g;
                if (i24 <= i25) {
                    this.f362993i = i24;
                    return;
                } else {
                    i23 += i25;
                    this.f362993i = i25;
                    R(1);
                }
            }
        }

        public final boolean T(int i12) throws IOException {
            int i13 = this.f362993i;
            int i14 = i13 + i12;
            int i15 = this.f362991g;
            if (i14 <= i15) {
                throw new IllegalStateException(androidx.camera.camera2.internal.G.e(i12, "refillBuffer() called when ", " bytes were already available in buffer"));
            }
            int i16 = this.f362995k;
            int i17 = this.f362969c;
            if (i12 > (i17 - i16) - i13 || i16 + i13 + i12 > this.f362996l) {
                return false;
            }
            byte[] bArr = this.f362990f;
            if (i13 > 0) {
                if (i15 > i13) {
                    System.arraycopy(bArr, i13, bArr, 0, i15 - i13);
                }
                this.f362995k += i13;
                this.f362991g -= i13;
                this.f362993i = 0;
            }
            int i18 = this.f362991g;
            int iMin = Math.min(bArr.length - i18, (i17 - this.f362995k) - i18);
            InputStream inputStream = this.f362989e;
            try {
                int i19 = inputStream.read(bArr, i18, iMin);
                if (i19 == 0 || i19 < -1 || i19 > bArr.length) {
                    throw new IllegalStateException(inputStream.getClass() + "#read(byte[]) returned invalid result: " + i19 + "\nThe InputStream implementation is buggy.");
                }
                if (i19 <= 0) {
                    return false;
                }
                this.f362991g += i19;
                Q();
                if (this.f362991g >= i12) {
                    return true;
                }
                return T(i12);
            } catch (InvalidProtocolBufferException e12) {
                e12.f362695b = true;
                throw e12;
            }
        }

        @Override // com.google.protobuf.AbstractC37708x
        public final void a(int i12) throws InvalidProtocolBufferException {
            if (this.f362994j != i12) {
                throw InvalidProtocolBufferException.a();
            }
        }

        @Override // com.google.protobuf.AbstractC37708x
        public final int e() {
            int i12 = this.f362996l;
            if (i12 == Integer.MAX_VALUE) {
                return -1;
            }
            return i12 - (this.f362995k + this.f362993i);
        }

        @Override // com.google.protobuf.AbstractC37708x
        public final int f() {
            return this.f362995k + this.f362993i;
        }

        @Override // com.google.protobuf.AbstractC37708x
        public final boolean g() {
            return this.f362993i == this.f362991g && !T(1);
        }

        @Override // com.google.protobuf.AbstractC37708x
        public final void k(int i12) {
            this.f362996l = i12;
            Q();
        }

        @Override // com.google.protobuf.AbstractC37708x
        public final int l(int i12) throws InvalidProtocolBufferException {
            if (i12 < 0) {
                throw InvalidProtocolBufferException.f();
            }
            int i13 = this.f362995k + this.f362993i + i12;
            int i14 = this.f362996l;
            if (i13 > i14) {
                throw InvalidProtocolBufferException.h();
            }
            this.f362996l = i13;
            Q();
            return i14;
        }

        @Override // com.google.protobuf.AbstractC37708x
        public final boolean m() {
            return O() != 0;
        }

        @Override // com.google.protobuf.AbstractC37708x
        public final AbstractC37700t n() throws IOException {
            int iX2 = x();
            int i12 = this.f362991g;
            int i13 = this.f362993i;
            int i14 = i12 - i13;
            byte[] bArr = this.f362990f;
            if (iX2 <= i14 && iX2 > 0) {
                AbstractC37700t abstractC37700tH = AbstractC37700t.h(i13, iX2, bArr);
                this.f362993i += iX2;
                return abstractC37700tH;
            }
            if (iX2 == 0) {
                return AbstractC37700t.f362954c;
            }
            byte[] bArrK = K(iX2);
            if (bArrK != null) {
                return AbstractC37700t.h(0, bArrK.length, bArrK);
            }
            int i15 = this.f362993i;
            int i16 = this.f362991g;
            int length = i16 - i15;
            this.f362995k += i16;
            this.f362993i = 0;
            this.f362991g = 0;
            ArrayList arrayListL = L(iX2 - length);
            byte[] bArr2 = new byte[iX2];
            System.arraycopy(bArr, i15, bArr2, 0, length);
            Iterator it = arrayListL.iterator();
            while (it.hasNext()) {
                byte[] bArr3 = (byte[]) it.next();
                System.arraycopy(bArr3, 0, bArr2, length, bArr3.length);
                length += bArr3.length;
            }
            AbstractC37700t abstractC37700t = AbstractC37700t.f362954c;
            return new AbstractC37700t.j(bArr2);
        }

        @Override // com.google.protobuf.AbstractC37708x
        public final double o() {
            return Double.longBitsToDouble(N());
        }

        @Override // com.google.protobuf.AbstractC37708x
        public final int p() {
            return x();
        }

        @Override // com.google.protobuf.AbstractC37708x
        public final int q() {
            return M();
        }

        @Override // com.google.protobuf.AbstractC37708x
        public final long r() {
            return N();
        }

        @Override // com.google.protobuf.AbstractC37708x
        public final float s() {
            return Float.intBitsToFloat(M());
        }

        @Override // com.google.protobuf.AbstractC37708x
        public final void t(int i12, InterfaceC37707w0.a aVar, M m12) throws InvalidProtocolBufferException {
            b();
            this.f362967a++;
            aVar.m2(this, m12);
            a((i12 << 3) | 4);
            this.f362967a--;
        }

        @Override // com.google.protobuf.AbstractC37708x
        public final int u() {
            return x();
        }

        @Override // com.google.protobuf.AbstractC37708x
        public final long v() {
            return O();
        }

        @Override // com.google.protobuf.AbstractC37708x
        public final void w(InterfaceC37707w0.a aVar, M m12) throws InvalidProtocolBufferException {
            int iX2 = x();
            b();
            int iL2 = l(iX2);
            this.f362967a++;
            aVar.m2(this, m12);
            a(0);
            this.f362967a--;
            if (e() != 0) {
                throw InvalidProtocolBufferException.h();
            }
            k(iL2);
        }

        @Override // com.google.protobuf.AbstractC37708x
        public final int x() {
            int i12;
            int i13 = this.f362993i;
            int i14 = this.f362991g;
            if (i14 != i13) {
                int i15 = i13 + 1;
                byte[] bArr = this.f362990f;
                byte b12 = bArr[i13];
                if (b12 >= 0) {
                    this.f362993i = i15;
                    return b12;
                }
                if (i14 - i15 >= 9) {
                    int i16 = i13 + 2;
                    int i17 = (bArr[i15] << 7) ^ b12;
                    if (i17 < 0) {
                        i12 = i17 ^ (-128);
                    } else {
                        int i18 = i13 + 3;
                        int i19 = (bArr[i16] << 14) ^ i17;
                        if (i19 >= 0) {
                            i12 = i19 ^ 16256;
                        } else {
                            int i22 = i13 + 4;
                            int i23 = i19 ^ (bArr[i18] << 21);
                            if (i23 < 0) {
                                i12 = (-2080896) ^ i23;
                            } else {
                                i18 = i13 + 5;
                                byte b13 = bArr[i22];
                                int i24 = (i23 ^ (b13 << 28)) ^ 266354560;
                                if (b13 < 0) {
                                    i22 = i13 + 6;
                                    if (bArr[i18] < 0) {
                                        i18 = i13 + 7;
                                        if (bArr[i22] < 0) {
                                            i22 = i13 + 8;
                                            if (bArr[i18] < 0) {
                                                i18 = i13 + 9;
                                                if (bArr[i22] < 0) {
                                                    int i25 = i13 + 10;
                                                    if (bArr[i18] >= 0) {
                                                        i16 = i25;
                                                        i12 = i24;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i12 = i24;
                                }
                                i12 = i24;
                            }
                            i16 = i22;
                        }
                        i16 = i18;
                    }
                    this.f362993i = i16;
                    return i12;
                }
            }
            return (int) P();
        }

        @Override // com.google.protobuf.AbstractC37708x
        public final int z() {
            return M();
        }
    }

    /* compiled from: CodedInputStream.java */
    /* renamed from: com.google.protobuf.x$e */
    public static final class e extends AbstractC37708x {

        /* renamed from: e, reason: collision with root package name */
        public final ByteBuffer f362997e;

        /* renamed from: f, reason: collision with root package name */
        public final long f362998f;

        /* renamed from: g, reason: collision with root package name */
        public long f362999g;

        /* renamed from: h, reason: collision with root package name */
        public long f363000h;

        /* renamed from: i, reason: collision with root package name */
        public final long f363001i;

        /* renamed from: j, reason: collision with root package name */
        public int f363002j;

        /* renamed from: k, reason: collision with root package name */
        public int f363003k;

        /* renamed from: l, reason: collision with root package name */
        public int f363004l;

        public e(ByteBuffer byteBuffer, boolean z12, a aVar) {
            super();
            this.f363004l = Integer.MAX_VALUE;
            this.f362997e = byteBuffer;
            long jB2 = r1.b(byteBuffer);
            this.f362998f = jB2;
            this.f362999g = byteBuffer.limit() + jB2;
            long jPosition = jB2 + byteBuffer.position();
            this.f363000h = jPosition;
            this.f363001i = jPosition;
        }

        @Override // com.google.protobuf.AbstractC37708x
        public final long A() {
            return K();
        }

        @Override // com.google.protobuf.AbstractC37708x
        public final int B() {
            return AbstractC37708x.c(x());
        }

        @Override // com.google.protobuf.AbstractC37708x
        public final long C() {
            return AbstractC37708x.d(L());
        }

        @Override // com.google.protobuf.AbstractC37708x
        public final String D() throws InvalidProtocolBufferException {
            int iX2 = x();
            if (iX2 > 0) {
                long j12 = this.f362999g;
                long j13 = this.f363000h;
                if (iX2 <= ((int) (j12 - j13))) {
                    byte[] bArr = new byte[iX2];
                    long j14 = iX2;
                    r1.f362946c.c(j13, bArr, 0L, j14);
                    String str = new String(bArr, C37670d0.f362857a);
                    this.f363000h += j14;
                    return str;
                }
            }
            if (iX2 == 0) {
                return "";
            }
            if (iX2 < 0) {
                throw InvalidProtocolBufferException.f();
            }
            throw InvalidProtocolBufferException.h();
        }

        @Override // com.google.protobuf.AbstractC37708x
        public final String E() throws InvalidProtocolBufferException {
            int iX2 = x();
            if (iX2 > 0) {
                long j12 = this.f362999g;
                long j13 = this.f363000h;
                if (iX2 <= ((int) (j12 - j13))) {
                    String strC = s1.c(this.f362997e, (int) (j13 - this.f362998f), iX2);
                    this.f363000h += iX2;
                    return strC;
                }
            }
            if (iX2 == 0) {
                return "";
            }
            if (iX2 <= 0) {
                throw InvalidProtocolBufferException.f();
            }
            throw InvalidProtocolBufferException.h();
        }

        @Override // com.google.protobuf.AbstractC37708x
        public final int F() throws InvalidProtocolBufferException {
            if (g()) {
                this.f363003k = 0;
                return 0;
            }
            int iX2 = x();
            this.f363003k = iX2;
            if ((iX2 >>> 3) != 0) {
                return iX2;
            }
            throw InvalidProtocolBufferException.b();
        }

        @Override // com.google.protobuf.AbstractC37708x
        public final int G() {
            return x();
        }

        @Override // com.google.protobuf.AbstractC37708x
        public final long H() {
            return L();
        }

        @Override // com.google.protobuf.AbstractC37708x
        public final boolean I(int i12) throws InvalidProtocolBufferException {
            int iF2;
            int i13 = i12 & 7;
            int i14 = 0;
            if (i13 == 0) {
                if (((int) (this.f362999g - this.f363000h)) >= 10) {
                    while (i14 < 10) {
                        long j12 = this.f363000h;
                        this.f363000h = j12 + 1;
                        if (r1.f362946c.f(j12) < 0) {
                            i14++;
                        }
                    }
                    throw InvalidProtocolBufferException.e();
                }
                while (i14 < 10) {
                    long j13 = this.f363000h;
                    if (j13 == this.f362999g) {
                        throw InvalidProtocolBufferException.h();
                    }
                    this.f363000h = j13 + 1;
                    if (r1.f362946c.f(j13) < 0) {
                        i14++;
                    }
                }
                throw InvalidProtocolBufferException.e();
                return true;
            }
            if (i13 == 1) {
                O(8);
                return true;
            }
            if (i13 == 2) {
                O(x());
                return true;
            }
            if (i13 != 3) {
                if (i13 == 4) {
                    return false;
                }
                if (i13 != 5) {
                    throw InvalidProtocolBufferException.d();
                }
                O(4);
                return true;
            }
            do {
                iF2 = F();
                if (iF2 == 0) {
                    break;
                }
            } while (I(iF2));
            a(((i12 >>> 3) << 3) | 4);
            return true;
        }

        public final int J() throws InvalidProtocolBufferException {
            long j12 = this.f363000h;
            if (this.f362999g - j12 < 4) {
                throw InvalidProtocolBufferException.h();
            }
            this.f363000h = 4 + j12;
            r1.e eVar = r1.f362946c;
            return ((eVar.f(j12 + 3) & 255) << 24) | (eVar.f(j12) & 255) | ((eVar.f(1 + j12) & 255) << 8) | ((eVar.f(2 + j12) & 255) << 16);
        }

        public final long K() throws InvalidProtocolBufferException {
            long j12 = this.f363000h;
            if (this.f362999g - j12 < 8) {
                throw InvalidProtocolBufferException.h();
            }
            this.f363000h = 8 + j12;
            r1.e eVar = r1.f362946c;
            return ((eVar.f(j12 + 7) & 255) << 56) | (eVar.f(j12) & 255) | ((eVar.f(1 + j12) & 255) << 8) | ((eVar.f(2 + j12) & 255) << 16) | ((eVar.f(3 + j12) & 255) << 24) | ((eVar.f(4 + j12) & 255) << 32) | ((eVar.f(5 + j12) & 255) << 40) | ((eVar.f(6 + j12) & 255) << 48);
        }

        public final long L() {
            long j12;
            long j13;
            long j14;
            int i12;
            long j15 = this.f363000h;
            if (this.f362999g != j15) {
                long j16 = 1 + j15;
                r1.e eVar = r1.f362946c;
                byte bF2 = eVar.f(j15);
                if (bF2 >= 0) {
                    this.f363000h = j16;
                    return bF2;
                }
                if (this.f362999g - j16 >= 9) {
                    long j17 = 2 + j15;
                    int iF2 = (eVar.f(j16) << 7) ^ bF2;
                    if (iF2 >= 0) {
                        long j18 = 3 + j15;
                        int iF3 = iF2 ^ (eVar.f(j17) << 14);
                        if (iF3 >= 0) {
                            j12 = iF3 ^ 16256;
                        } else {
                            j17 = j15 + 4;
                            int iF4 = iF3 ^ (eVar.f(j18) << 21);
                            if (iF4 < 0) {
                                i12 = (-2080896) ^ iF4;
                            } else {
                                j18 = 5 + j15;
                                long jF2 = iF4 ^ (eVar.f(j17) << 28);
                                if (jF2 < 0) {
                                    long j19 = 6 + j15;
                                    long jF3 = jF2 ^ (eVar.f(j18) << 35);
                                    if (jF3 < 0) {
                                        j13 = -34093383808L;
                                    } else {
                                        j18 = 7 + j15;
                                        jF2 = jF3 ^ (eVar.f(j19) << 42);
                                        if (jF2 >= 0) {
                                            j14 = 4363953127296L;
                                        } else {
                                            j19 = 8 + j15;
                                            jF3 = jF2 ^ (eVar.f(j18) << 49);
                                            if (jF3 >= 0) {
                                                long j22 = j15 + 9;
                                                long jF4 = (jF3 ^ (eVar.f(j19) << 56)) ^ 71499008037633920L;
                                                if (jF4 < 0) {
                                                    long j23 = j15 + 10;
                                                    if (eVar.f(j22) >= 0) {
                                                        j17 = j23;
                                                        j12 = jF4;
                                                    }
                                                } else {
                                                    j12 = jF4;
                                                    j17 = j22;
                                                }
                                                this.f363000h = j17;
                                                return j12;
                                            }
                                            j13 = -558586000294016L;
                                        }
                                    }
                                    j12 = j13 ^ jF3;
                                    j17 = j19;
                                    this.f363000h = j17;
                                    return j12;
                                }
                                j14 = 266354560;
                                j12 = j14 ^ jF2;
                            }
                        }
                        j17 = j18;
                        this.f363000h = j17;
                        return j12;
                    }
                    i12 = iF2 ^ (-128);
                    j12 = i12;
                    this.f363000h = j17;
                    return j12;
                }
            }
            return M();
        }

        public final long M() throws InvalidProtocolBufferException {
            long j12 = 0;
            for (int i12 = 0; i12 < 64; i12 += 7) {
                long j13 = this.f363000h;
                if (j13 == this.f362999g) {
                    throw InvalidProtocolBufferException.h();
                }
                this.f363000h = 1 + j13;
                j12 |= (r3 & 127) << i12;
                if ((r1.f362946c.f(j13) & 128) == 0) {
                    return j12;
                }
            }
            throw InvalidProtocolBufferException.e();
        }

        public final void N() {
            long j12 = this.f362999g + this.f363002j;
            this.f362999g = j12;
            int i12 = (int) (j12 - this.f363001i);
            int i13 = this.f363004l;
            if (i12 <= i13) {
                this.f363002j = 0;
                return;
            }
            int i14 = i12 - i13;
            this.f363002j = i14;
            this.f362999g = j12 - i14;
        }

        public final void O(int i12) throws InvalidProtocolBufferException {
            if (i12 >= 0) {
                long j12 = this.f362999g;
                long j13 = this.f363000h;
                if (i12 <= ((int) (j12 - j13))) {
                    this.f363000h = j13 + i12;
                    return;
                }
            }
            if (i12 >= 0) {
                throw InvalidProtocolBufferException.h();
            }
            throw InvalidProtocolBufferException.f();
        }

        @Override // com.google.protobuf.AbstractC37708x
        public final void a(int i12) throws InvalidProtocolBufferException {
            if (this.f363003k != i12) {
                throw InvalidProtocolBufferException.a();
            }
        }

        @Override // com.google.protobuf.AbstractC37708x
        public final int e() {
            int i12 = this.f363004l;
            if (i12 == Integer.MAX_VALUE) {
                return -1;
            }
            return i12 - f();
        }

        @Override // com.google.protobuf.AbstractC37708x
        public final int f() {
            return (int) (this.f363000h - this.f363001i);
        }

        @Override // com.google.protobuf.AbstractC37708x
        public final boolean g() {
            return this.f363000h == this.f362999g;
        }

        @Override // com.google.protobuf.AbstractC37708x
        public final void k(int i12) {
            this.f363004l = i12;
            N();
        }

        @Override // com.google.protobuf.AbstractC37708x
        public final int l(int i12) throws InvalidProtocolBufferException {
            if (i12 < 0) {
                throw InvalidProtocolBufferException.f();
            }
            int iF2 = i12 + f();
            int i13 = this.f363004l;
            if (iF2 > i13) {
                throw InvalidProtocolBufferException.h();
            }
            this.f363004l = iF2;
            N();
            return i13;
        }

        @Override // com.google.protobuf.AbstractC37708x
        public final boolean m() {
            return L() != 0;
        }

        @Override // com.google.protobuf.AbstractC37708x
        public final AbstractC37700t n() throws InvalidProtocolBufferException {
            int iX2 = x();
            if (iX2 > 0) {
                long j12 = this.f362999g;
                long j13 = this.f363000h;
                if (iX2 <= ((int) (j12 - j13))) {
                    byte[] bArr = new byte[iX2];
                    long j14 = iX2;
                    r1.f362946c.c(j13, bArr, 0L, j14);
                    this.f363000h += j14;
                    AbstractC37700t abstractC37700t = AbstractC37700t.f362954c;
                    return new AbstractC37700t.j(bArr);
                }
            }
            if (iX2 == 0) {
                return AbstractC37700t.f362954c;
            }
            if (iX2 < 0) {
                throw InvalidProtocolBufferException.f();
            }
            throw InvalidProtocolBufferException.h();
        }

        @Override // com.google.protobuf.AbstractC37708x
        public final double o() {
            return Double.longBitsToDouble(K());
        }

        @Override // com.google.protobuf.AbstractC37708x
        public final int p() {
            return x();
        }

        @Override // com.google.protobuf.AbstractC37708x
        public final int q() {
            return J();
        }

        @Override // com.google.protobuf.AbstractC37708x
        public final long r() {
            return K();
        }

        @Override // com.google.protobuf.AbstractC37708x
        public final float s() {
            return Float.intBitsToFloat(J());
        }

        @Override // com.google.protobuf.AbstractC37708x
        public final void t(int i12, InterfaceC37707w0.a aVar, M m12) throws InvalidProtocolBufferException {
            b();
            this.f362967a++;
            aVar.m2(this, m12);
            a((i12 << 3) | 4);
            this.f362967a--;
        }

        @Override // com.google.protobuf.AbstractC37708x
        public final int u() {
            return x();
        }

        @Override // com.google.protobuf.AbstractC37708x
        public final long v() {
            return L();
        }

        @Override // com.google.protobuf.AbstractC37708x
        public final void w(InterfaceC37707w0.a aVar, M m12) throws InvalidProtocolBufferException {
            int iX2 = x();
            b();
            int iL2 = l(iX2);
            this.f362967a++;
            aVar.m2(this, m12);
            a(0);
            this.f362967a--;
            if (e() != 0) {
                throw InvalidProtocolBufferException.h();
            }
            k(iL2);
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x0091, code lost:
        
            if (r4.f(r8) < 0) goto L34;
         */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0099 A[PHI: r6
  0x0099: PHI (r6v7 long) = (r6v6 long), (r6v8 long), (r6v10 long) binds: [B:25:0x006d, B:29:0x0080, B:33:0x0091] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // com.google.protobuf.AbstractC37708x
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final int x() {
            /*
                r12 = this;
                long r0 = r12.f363000h
                long r2 = r12.f362999g
                int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r2 != 0) goto La
                goto L93
            La:
                r2 = 1
                long r2 = r2 + r0
                com.google.protobuf.r1$e r4 = com.google.protobuf.r1.f362946c
                byte r5 = r4.f(r0)
                if (r5 < 0) goto L18
                r12.f363000h = r2
                return r5
            L18:
                long r6 = r12.f362999g
                long r6 = r6 - r2
                r8 = 9
                int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                if (r6 >= 0) goto L23
                goto L93
            L23:
                r6 = 2
                long r6 = r6 + r0
                byte r2 = r4.f(r2)
                int r2 = r2 << 7
                r2 = r2 ^ r5
                if (r2 >= 0) goto L33
                r0 = r2 ^ (-128(0xffffffffffffff80, float:NaN))
                goto La0
            L33:
                r10 = 3
                long r10 = r10 + r0
                byte r3 = r4.f(r6)
                int r3 = r3 << 14
                r2 = r2 ^ r3
                if (r2 < 0) goto L43
                r0 = r2 ^ 16256(0x3f80, float:2.278E-41)
            L41:
                r6 = r10
                goto La0
            L43:
                r5 = 4
                long r6 = r0 + r5
                byte r3 = r4.f(r10)
                int r3 = r3 << 21
                r2 = r2 ^ r3
                if (r2 >= 0) goto L55
                r0 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto La0
            L55:
                r10 = 5
                long r10 = r10 + r0
                byte r3 = r4.f(r6)
                int r5 = r3 << 28
                r2 = r2 ^ r5
                r5 = 266354560(0xfe03f80, float:2.2112565E-29)
                r2 = r2 ^ r5
                if (r3 >= 0) goto L9e
                r5 = 6
                long r6 = r0 + r5
                byte r3 = r4.f(r10)
                if (r3 >= 0) goto L99
                r10 = 7
                long r10 = r10 + r0
                byte r3 = r4.f(r6)
                if (r3 >= 0) goto L9e
                r5 = 8
                long r6 = r0 + r5
                byte r3 = r4.f(r10)
                if (r3 >= 0) goto L99
                long r8 = r8 + r0
                byte r3 = r4.f(r6)
                if (r3 >= 0) goto L9b
                r5 = 10
                long r6 = r0 + r5
                byte r0 = r4.f(r8)
                if (r0 >= 0) goto L99
            L93:
                long r0 = r12.M()
                int r0 = (int) r0
                return r0
            L99:
                r0 = r2
                goto La0
            L9b:
                r0 = r2
                r6 = r8
                goto La0
            L9e:
                r0 = r2
                goto L41
            La0:
                r12.f363000h = r6
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.AbstractC37708x.e.x():int");
        }

        @Override // com.google.protobuf.AbstractC37708x
        public final int z() {
            return J();
        }
    }

    public static int c(int i12) {
        return (-(i12 & 1)) ^ (i12 >>> 1);
    }

    public static long d(long j12) {
        return (-(j12 & 1)) ^ (j12 >>> 1);
    }

    public static AbstractC37708x h(InputStream inputStream) {
        if (inputStream != null) {
            return new d(inputStream, 4096, null);
        }
        byte[] bArr = C37670d0.f362858b;
        return j(bArr, 0, bArr.length, false);
    }

    public static AbstractC37708x i(ByteBuffer byteBuffer, boolean z12) {
        if (byteBuffer.hasArray()) {
            return j(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), byteBuffer.remaining(), z12);
        }
        if (byteBuffer.isDirect() && r1.f362947d) {
            return new e(byteBuffer, z12, null);
        }
        int iRemaining = byteBuffer.remaining();
        byte[] bArr = new byte[iRemaining];
        byteBuffer.duplicate().get(bArr);
        return j(bArr, 0, iRemaining, true);
    }

    public static AbstractC37708x j(byte[] bArr, int i12, int i13, boolean z12) {
        b bVar = new b(bArr, i12, i13, z12, null);
        try {
            bVar.l(i13);
            return bVar;
        } catch (InvalidProtocolBufferException e12) {
            throw new IllegalArgumentException(e12);
        }
    }

    public static int y(int i12, InputStream inputStream) throws IOException {
        if ((i12 & 128) == 0) {
            return i12;
        }
        int i13 = i12 & 127;
        int i14 = 7;
        while (i14 < 32) {
            int i15 = inputStream.read();
            if (i15 == -1) {
                throw InvalidProtocolBufferException.h();
            }
            i13 |= (i15 & 127) << i14;
            if ((i15 & 128) == 0) {
                return i13;
            }
            i14 += 7;
        }
        while (i14 < 64) {
            int i16 = inputStream.read();
            if (i16 == -1) {
                throw InvalidProtocolBufferException.h();
            }
            if ((i16 & 128) == 0) {
                return i13;
            }
            i14 += 7;
        }
        throw InvalidProtocolBufferException.e();
    }

    public abstract long A();

    public abstract int B();

    public abstract long C();

    public abstract String D();

    public abstract String E();

    public abstract int F();

    public abstract int G();

    public abstract long H();

    public abstract boolean I(int i12);

    public abstract void a(int i12);

    public final void b() throws InvalidProtocolBufferException {
        if (this.f362967a >= this.f362968b) {
            throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
    }

    public abstract int e();

    public abstract int f();

    public abstract boolean g();

    public abstract void k(int i12);

    public abstract int l(int i12);

    public abstract boolean m();

    public abstract AbstractC37700t n();

    public abstract double o();

    public abstract int p();

    public abstract int q();

    public abstract long r();

    public abstract float s();

    public abstract void t(int i12, InterfaceC37707w0.a aVar, M m12);

    public abstract int u();

    public abstract long v();

    public abstract void w(InterfaceC37707w0.a aVar, M m12);

    public abstract int x();

    public abstract int z();

    public AbstractC37708x() {
        this.f362968b = 100;
        this.f362969c = Integer.MAX_VALUE;
    }
}
