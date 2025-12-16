package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.AbstractC22934w;
import androidx.datastore.preferences.protobuf.K1;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: CodedInputStream.java */
/* renamed from: androidx.datastore.preferences.protobuf.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC22940z {

    /* renamed from: a, reason: collision with root package name */
    public int f45948a;

    /* renamed from: b, reason: collision with root package name */
    public final int f45949b;

    /* renamed from: c, reason: collision with root package name */
    public final int f45950c;

    /* renamed from: d, reason: collision with root package name */
    public A f45951d;

    /* compiled from: CodedInputStream.java */
    /* renamed from: androidx.datastore.preferences.protobuf.z$b */
    public static final class b extends AbstractC22940z {

        /* renamed from: e, reason: collision with root package name */
        public final byte[] f45952e;

        /* renamed from: f, reason: collision with root package name */
        public int f45953f;

        /* renamed from: g, reason: collision with root package name */
        public int f45954g;

        /* renamed from: h, reason: collision with root package name */
        public int f45955h;

        /* renamed from: i, reason: collision with root package name */
        public final int f45956i;

        /* renamed from: j, reason: collision with root package name */
        public int f45957j;

        /* renamed from: k, reason: collision with root package name */
        public int f45958k;

        public b(byte[] bArr, int i12, int i13, boolean z12, a aVar) {
            super();
            this.f45958k = Integer.MAX_VALUE;
            this.f45952e = bArr;
            this.f45953f = i13 + i12;
            this.f45955h = i12;
            this.f45956i = i12;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22940z
        public final boolean A(int i12) throws InvalidProtocolBufferException {
            int iX2;
            int i13 = i12 & 7;
            int i14 = 0;
            if (i13 == 0) {
                int i15 = this.f45953f - this.f45955h;
                byte[] bArr = this.f45952e;
                if (i15 >= 10) {
                    while (i14 < 10) {
                        int i16 = this.f45955h;
                        this.f45955h = i16 + 1;
                        if (bArr[i16] < 0) {
                            i14++;
                        }
                    }
                    throw InvalidProtocolBufferException.e();
                }
                while (i14 < 10) {
                    int i17 = this.f45955h;
                    if (i17 == this.f45953f) {
                        throw InvalidProtocolBufferException.h();
                    }
                    this.f45955h = i17 + 1;
                    if (bArr[i17] < 0) {
                        i14++;
                    }
                }
                throw InvalidProtocolBufferException.e();
                return true;
            }
            if (i13 == 1) {
                H(8);
                return true;
            }
            if (i13 == 2) {
                H(D());
                return true;
            }
            if (i13 != 3) {
                if (i13 == 4) {
                    return false;
                }
                if (i13 != 5) {
                    throw InvalidProtocolBufferException.d();
                }
                H(4);
                return true;
            }
            do {
                iX2 = x();
                if (iX2 == 0) {
                    break;
                }
            } while (A(iX2));
            a(((i12 >>> 3) << 3) | 4);
            return true;
        }

        public final int B() throws InvalidProtocolBufferException {
            int i12 = this.f45955h;
            if (this.f45953f - i12 < 4) {
                throw InvalidProtocolBufferException.h();
            }
            this.f45955h = i12 + 4;
            byte[] bArr = this.f45952e;
            return ((bArr[i12 + 3] & 255) << 24) | (bArr[i12] & 255) | ((bArr[i12 + 1] & 255) << 8) | ((bArr[i12 + 2] & 255) << 16);
        }

        public final long C() throws InvalidProtocolBufferException {
            int i12 = this.f45955h;
            if (this.f45953f - i12 < 8) {
                throw InvalidProtocolBufferException.h();
            }
            this.f45955h = i12 + 8;
            byte[] bArr = this.f45952e;
            return ((bArr[i12 + 7] & 255) << 56) | (bArr[i12] & 255) | ((bArr[i12 + 1] & 255) << 8) | ((bArr[i12 + 2] & 255) << 16) | ((bArr[i12 + 3] & 255) << 24) | ((bArr[i12 + 4] & 255) << 32) | ((bArr[i12 + 5] & 255) << 40) | ((bArr[i12 + 6] & 255) << 48);
        }

        public final int D() {
            int i12;
            int i13 = this.f45955h;
            int i14 = this.f45953f;
            if (i14 != i13) {
                int i15 = i13 + 1;
                byte[] bArr = this.f45952e;
                byte b12 = bArr[i13];
                if (b12 >= 0) {
                    this.f45955h = i15;
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
                    this.f45955h = i16;
                    return i12;
                }
            }
            return (int) F();
        }

        public final long E() {
            long j12;
            long j13;
            long j14;
            long j15;
            int i12 = this.f45955h;
            int i13 = this.f45953f;
            if (i13 != i12) {
                int i14 = i12 + 1;
                byte[] bArr = this.f45952e;
                byte b12 = bArr[i12];
                if (b12 >= 0) {
                    this.f45955h = i14;
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
                    this.f45955h = i15;
                    return j12;
                }
            }
            return F();
        }

        public final long F() throws InvalidProtocolBufferException {
            long j12 = 0;
            for (int i12 = 0; i12 < 64; i12 += 7) {
                int i13 = this.f45955h;
                if (i13 == this.f45953f) {
                    throw InvalidProtocolBufferException.h();
                }
                this.f45955h = i13 + 1;
                j12 |= (r3 & 127) << i12;
                if ((this.f45952e[i13] & 128) == 0) {
                    return j12;
                }
            }
            throw InvalidProtocolBufferException.e();
        }

        public final void G() {
            int i12 = this.f45953f + this.f45954g;
            this.f45953f = i12;
            int i13 = i12 - this.f45956i;
            int i14 = this.f45958k;
            if (i13 <= i14) {
                this.f45954g = 0;
                return;
            }
            int i15 = i13 - i14;
            this.f45954g = i15;
            this.f45953f = i12 - i15;
        }

        public final void H(int i12) throws InvalidProtocolBufferException {
            if (i12 >= 0) {
                int i13 = this.f45953f;
                int i14 = this.f45955h;
                if (i12 <= i13 - i14) {
                    this.f45955h = i14 + i12;
                    return;
                }
            }
            if (i12 >= 0) {
                throw InvalidProtocolBufferException.h();
            }
            throw InvalidProtocolBufferException.f();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22940z
        public final void a(int i12) throws InvalidProtocolBufferException {
            if (this.f45957j != i12) {
                throw InvalidProtocolBufferException.a();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22940z
        public final int d() {
            return this.f45955h - this.f45956i;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22940z
        public final boolean e() {
            return this.f45955h == this.f45953f;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22940z
        public final void g(int i12) {
            this.f45958k = i12;
            G();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22940z
        public final int h(int i12) {
            if (i12 < 0) {
                throw InvalidProtocolBufferException.f();
            }
            int iD2 = i12 + d();
            int i13 = this.f45958k;
            if (iD2 > i13) {
                throw InvalidProtocolBufferException.h();
            }
            this.f45958k = iD2;
            G();
            return i13;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22940z
        public final boolean i() {
            return E() != 0;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
        @Override // androidx.datastore.preferences.protobuf.AbstractC22940z
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final androidx.datastore.preferences.protobuf.AbstractC22934w j() throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
            /*
                r4 = this;
                int r0 = r4.D()
                byte[] r1 = r4.f45952e
                if (r0 <= 0) goto L19
                int r2 = r4.f45953f
                int r3 = r4.f45955h
                int r2 = r2 - r3
                if (r0 > r2) goto L19
                androidx.datastore.preferences.protobuf.w r1 = androidx.datastore.preferences.protobuf.AbstractC22934w.h(r3, r0, r1)
                int r2 = r4.f45955h
                int r2 = r2 + r0
                r4.f45955h = r2
                return r1
            L19:
                if (r0 != 0) goto L1e
                androidx.datastore.preferences.protobuf.w r0 = androidx.datastore.preferences.protobuf.AbstractC22934w.f45925c
                return r0
            L1e:
                if (r0 <= 0) goto L2f
                int r2 = r4.f45953f
                int r3 = r4.f45955h
                int r2 = r2 - r3
                if (r0 > r2) goto L2f
                int r0 = r0 + r3
                r4.f45955h = r0
                byte[] r0 = java.util.Arrays.copyOfRange(r1, r3, r0)
                goto L35
            L2f:
                if (r0 > 0) goto L42
                if (r0 != 0) goto L3d
                byte[] r0 = androidx.datastore.preferences.protobuf.C22914m0.f45875b
            L35:
                androidx.datastore.preferences.protobuf.w r1 = androidx.datastore.preferences.protobuf.AbstractC22934w.f45925c
                androidx.datastore.preferences.protobuf.w$j r1 = new androidx.datastore.preferences.protobuf.w$j
                r1.<init>(r0)
                return r1
            L3d:
                androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r0 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.f()
                throw r0
            L42:
                androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r0 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.h()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.AbstractC22940z.b.j():androidx.datastore.preferences.protobuf.w");
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22940z
        public final double k() {
            return Double.longBitsToDouble(C());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22940z
        public final int l() {
            return D();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22940z
        public final int m() {
            return B();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22940z
        public final long n() {
            return C();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22940z
        public final float o() {
            return Float.intBitsToFloat(B());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22940z
        public final int p() {
            return D();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22940z
        public final long q() {
            return E();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22940z
        public final int r() {
            return B();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22940z
        public final long s() {
            return C();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22940z
        public final int t() {
            return AbstractC22940z.b(D());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22940z
        public final long u() {
            return AbstractC22940z.c(E());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22940z
        public final String v() throws InvalidProtocolBufferException {
            int iD2 = D();
            if (iD2 > 0) {
                int i12 = this.f45953f;
                int i13 = this.f45955h;
                if (iD2 <= i12 - i13) {
                    String str = new String(this.f45952e, i13, iD2, C22914m0.f45874a);
                    this.f45955h += iD2;
                    return str;
                }
            }
            if (iD2 == 0) {
                return "";
            }
            if (iD2 < 0) {
                throw InvalidProtocolBufferException.f();
            }
            throw InvalidProtocolBufferException.h();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22940z
        public final String w() throws InvalidProtocolBufferException {
            int iD2 = D();
            if (iD2 > 0) {
                int i12 = this.f45953f;
                int i13 = this.f45955h;
                if (iD2 <= i12 - i13) {
                    String strA = L1.f45728a.a(this.f45952e, i13, iD2);
                    this.f45955h += iD2;
                    return strA;
                }
            }
            if (iD2 == 0) {
                return "";
            }
            if (iD2 <= 0) {
                throw InvalidProtocolBufferException.f();
            }
            throw InvalidProtocolBufferException.h();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22940z
        public final int x() throws InvalidProtocolBufferException {
            if (e()) {
                this.f45957j = 0;
                return 0;
            }
            int iD2 = D();
            this.f45957j = iD2;
            if ((iD2 >>> 3) != 0) {
                return iD2;
            }
            throw InvalidProtocolBufferException.b();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22940z
        public final int y() {
            return D();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22940z
        public final long z() {
            return E();
        }
    }

    /* compiled from: CodedInputStream.java */
    /* renamed from: androidx.datastore.preferences.protobuf.z$c */
    public static final class c extends AbstractC22940z {

        /* renamed from: e, reason: collision with root package name */
        public final Iterable<ByteBuffer> f45959e;

        /* renamed from: f, reason: collision with root package name */
        public final Iterator<ByteBuffer> f45960f;

        /* renamed from: g, reason: collision with root package name */
        public ByteBuffer f45961g;

        /* renamed from: h, reason: collision with root package name */
        public int f45962h;

        /* renamed from: i, reason: collision with root package name */
        public int f45963i;

        /* renamed from: j, reason: collision with root package name */
        public int f45964j;

        /* renamed from: k, reason: collision with root package name */
        public int f45965k;

        /* renamed from: l, reason: collision with root package name */
        public int f45966l;

        /* renamed from: m, reason: collision with root package name */
        public long f45967m;

        /* renamed from: n, reason: collision with root package name */
        public long f45968n;

        /* renamed from: o, reason: collision with root package name */
        public long f45969o;

        public c() {
            throw null;
        }

        public c(Iterable iterable, int i12, boolean z12, a aVar) {
            super();
            this.f45964j = Integer.MAX_VALUE;
            this.f45962h = i12;
            this.f45959e = iterable;
            this.f45960f = iterable.iterator();
            this.f45966l = 0;
            if (i12 != 0) {
                L();
                return;
            }
            this.f45961g = C22914m0.f45876c;
            this.f45967m = 0L;
            this.f45968n = 0L;
            this.f45969o = 0L;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22940z
        public final boolean A(int i12) throws InvalidProtocolBufferException {
            int iX2;
            int i13 = i12 & 7;
            if (i13 == 0) {
                for (int i14 = 0; i14 < 10; i14++) {
                    if (C() >= 0) {
                        return true;
                    }
                }
                throw InvalidProtocolBufferException.e();
            }
            if (i13 == 1) {
                K(8);
                return true;
            }
            if (i13 == 2) {
                K(G());
                return true;
            }
            if (i13 != 3) {
                if (i13 == 4) {
                    return false;
                }
                if (i13 != 5) {
                    throw InvalidProtocolBufferException.d();
                }
                K(4);
                return true;
            }
            do {
                iX2 = x();
                if (iX2 == 0) {
                    break;
                }
            } while (A(iX2));
            a(((i12 >>> 3) << 3) | 4);
            return true;
        }

        public final long B() {
            return this.f45969o - this.f45967m;
        }

        public final byte C() throws InvalidProtocolBufferException {
            if (B() == 0) {
                if (!this.f45960f.hasNext()) {
                    throw InvalidProtocolBufferException.h();
                }
                L();
            }
            long j12 = this.f45967m;
            this.f45967m = 1 + j12;
            return K1.f45720d.f(j12);
        }

        public final void D(int i12, byte[] bArr) throws InvalidProtocolBufferException {
            if (i12 < 0 || i12 > J()) {
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
                if (B() == 0) {
                    if (!this.f45960f.hasNext()) {
                        throw InvalidProtocolBufferException.h();
                    }
                    L();
                }
                int iMin = Math.min(i13, (int) B());
                long j12 = iMin;
                K1.f45720d.c(this.f45967m, bArr, i12 - i13, j12);
                i13 -= iMin;
                this.f45967m += j12;
            }
        }

        public final int E() {
            if (B() < 4) {
                return (C() & 255) | ((C() & 255) << 8) | ((C() & 255) << 16) | ((C() & 255) << 24);
            }
            long j12 = this.f45967m;
            this.f45967m = 4 + j12;
            K1.e eVar = K1.f45720d;
            return ((eVar.f(j12 + 3) & 255) << 24) | (eVar.f(j12) & 255) | ((eVar.f(1 + j12) & 255) << 8) | ((eVar.f(2 + j12) & 255) << 16);
        }

        public final long F() throws InvalidProtocolBufferException {
            long jC2;
            byte bC2;
            if (B() >= 8) {
                long j12 = this.f45967m;
                this.f45967m = 8 + j12;
                jC2 = (r1.f(j12) & 255) | ((r1.f(j12 + 1) & 255) << 8) | ((r1.f(2 + j12) & 255) << 16) | ((r1.f(3 + j12) & 255) << 24) | ((r1.f(4 + j12) & 255) << 32) | ((r1.f(5 + j12) & 255) << 40) | ((r1.f(6 + j12) & 255) << 48);
                bC2 = K1.f45720d.f(j12 + 7);
            } else {
                jC2 = (C() & 255) | ((C() & 255) << 8) | ((C() & 255) << 16) | ((C() & 255) << 24) | ((C() & 255) << 32) | ((C() & 255) << 40) | ((C() & 255) << 48);
                bC2 = C();
            }
            return ((bC2 & 255) << 56) | jC2;
        }

        public final int G() {
            int i12;
            long j12 = this.f45967m;
            if (this.f45969o != j12) {
                long j13 = j12 + 1;
                K1.e eVar = K1.f45720d;
                byte bF2 = eVar.f(j12);
                if (bF2 >= 0) {
                    this.f45967m++;
                    return bF2;
                }
                if (this.f45969o - this.f45967m >= 10) {
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
                    this.f45967m = j14;
                    return i12;
                }
            }
            return (int) I();
        }

        public final long H() {
            long j12;
            long j13;
            long j14;
            long j15 = this.f45967m;
            if (this.f45969o != j15) {
                long j16 = j15 + 1;
                K1.e eVar = K1.f45720d;
                byte bF2 = eVar.f(j15);
                if (bF2 >= 0) {
                    this.f45967m++;
                    return bF2;
                }
                if (this.f45969o - this.f45967m >= 10) {
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
                    this.f45967m = j17;
                    return j12;
                }
            }
            return I();
        }

        public final long I() throws InvalidProtocolBufferException {
            long j12 = 0;
            for (int i12 = 0; i12 < 64; i12 += 7) {
                j12 |= (r3 & 127) << i12;
                if ((C() & 128) == 0) {
                    return j12;
                }
            }
            throw InvalidProtocolBufferException.e();
        }

        public final int J() {
            return (int) (((this.f45962h - this.f45966l) - this.f45967m) + this.f45968n);
        }

        public final void K(int i12) throws InvalidProtocolBufferException {
            if (i12 < 0 || i12 > ((this.f45962h - this.f45966l) - this.f45967m) + this.f45968n) {
                if (i12 >= 0) {
                    throw InvalidProtocolBufferException.h();
                }
                throw InvalidProtocolBufferException.f();
            }
            while (i12 > 0) {
                if (B() == 0) {
                    if (!this.f45960f.hasNext()) {
                        throw InvalidProtocolBufferException.h();
                    }
                    L();
                }
                int iMin = Math.min(i12, (int) B());
                i12 -= iMin;
                this.f45967m += iMin;
            }
        }

        public final void L() {
            ByteBuffer next = this.f45960f.next();
            this.f45961g = next;
            this.f45966l += (int) (this.f45967m - this.f45968n);
            long jPosition = next.position();
            this.f45967m = jPosition;
            this.f45968n = jPosition;
            this.f45969o = this.f45961g.limit();
            long jA2 = K1.a(this.f45961g);
            this.f45967m += jA2;
            this.f45968n += jA2;
            this.f45969o += jA2;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22940z
        public final void a(int i12) throws InvalidProtocolBufferException {
            if (this.f45965k != i12) {
                throw InvalidProtocolBufferException.a();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22940z
        public final int d() {
            return (int) ((this.f45966l + this.f45967m) - this.f45968n);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22940z
        public final boolean e() {
            return (((long) this.f45966l) + this.f45967m) - this.f45968n == ((long) this.f45962h);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22940z
        public final void g(int i12) {
            this.f45964j = i12;
            int i13 = this.f45962h + this.f45963i;
            this.f45962h = i13;
            if (i13 <= i12) {
                this.f45963i = 0;
                return;
            }
            int i14 = i13 - i12;
            this.f45963i = i14;
            this.f45962h = i13 - i14;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22940z
        public final int h(int i12) throws InvalidProtocolBufferException {
            if (i12 < 0) {
                throw InvalidProtocolBufferException.f();
            }
            int iD2 = i12 + d();
            int i13 = this.f45964j;
            if (iD2 > i13) {
                throw InvalidProtocolBufferException.h();
            }
            this.f45964j = iD2;
            int i14 = this.f45962h + this.f45963i;
            this.f45962h = i14;
            if (i14 > iD2) {
                int i15 = i14 - iD2;
                this.f45963i = i15;
                this.f45962h = i14 - i15;
            } else {
                this.f45963i = 0;
            }
            return i13;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22940z
        public final boolean i() {
            return H() != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22940z
        public final AbstractC22934w j() throws InvalidProtocolBufferException {
            int iG2 = G();
            if (iG2 > 0) {
                long j12 = iG2;
                long j13 = this.f45969o;
                long j14 = this.f45967m;
                if (j12 <= j13 - j14) {
                    byte[] bArr = new byte[iG2];
                    K1.f45720d.c(j14, bArr, 0L, j12);
                    this.f45967m += j12;
                    AbstractC22934w abstractC22934w = AbstractC22934w.f45925c;
                    return new AbstractC22934w.j(bArr);
                }
            }
            if (iG2 > 0 && iG2 <= J()) {
                byte[] bArr2 = new byte[iG2];
                D(iG2, bArr2);
                AbstractC22934w abstractC22934w2 = AbstractC22934w.f45925c;
                return new AbstractC22934w.j(bArr2);
            }
            if (iG2 == 0) {
                return AbstractC22934w.f45925c;
            }
            if (iG2 < 0) {
                throw InvalidProtocolBufferException.f();
            }
            throw InvalidProtocolBufferException.h();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22940z
        public final double k() {
            return Double.longBitsToDouble(F());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22940z
        public final int l() {
            return G();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22940z
        public final int m() {
            return E();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22940z
        public final long n() {
            return F();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22940z
        public final float o() {
            return Float.intBitsToFloat(E());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22940z
        public final int p() {
            return G();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22940z
        public final long q() {
            return H();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22940z
        public final int r() {
            return E();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22940z
        public final long s() {
            return F();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22940z
        public final int t() {
            return AbstractC22940z.b(G());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22940z
        public final long u() {
            return AbstractC22940z.c(H());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22940z
        public final String v() throws InvalidProtocolBufferException {
            int iG2 = G();
            if (iG2 > 0) {
                long j12 = iG2;
                long j13 = this.f45969o;
                long j14 = this.f45967m;
                if (j12 <= j13 - j14) {
                    byte[] bArr = new byte[iG2];
                    K1.f45720d.c(j14, bArr, 0L, j12);
                    String str = new String(bArr, C22914m0.f45874a);
                    this.f45967m += j12;
                    return str;
                }
            }
            if (iG2 > 0 && iG2 <= J()) {
                byte[] bArr2 = new byte[iG2];
                D(iG2, bArr2);
                return new String(bArr2, C22914m0.f45874a);
            }
            if (iG2 == 0) {
                return "";
            }
            if (iG2 < 0) {
                throw InvalidProtocolBufferException.f();
            }
            throw InvalidProtocolBufferException.h();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22940z
        public final String w() throws InvalidProtocolBufferException {
            int iG2 = G();
            if (iG2 > 0) {
                long j12 = iG2;
                long j13 = this.f45969o;
                long j14 = this.f45967m;
                if (j12 <= j13 - j14) {
                    String strC = L1.c(this.f45961g, (int) (j14 - this.f45968n), iG2);
                    this.f45967m += j12;
                    return strC;
                }
            }
            if (iG2 >= 0 && iG2 <= J()) {
                byte[] bArr = new byte[iG2];
                D(iG2, bArr);
                return L1.f45728a.a(bArr, 0, iG2);
            }
            if (iG2 == 0) {
                return "";
            }
            if (iG2 <= 0) {
                throw InvalidProtocolBufferException.f();
            }
            throw InvalidProtocolBufferException.h();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22940z
        public final int x() throws InvalidProtocolBufferException {
            if (e()) {
                this.f45965k = 0;
                return 0;
            }
            int iG2 = G();
            this.f45965k = iG2;
            if ((iG2 >>> 3) != 0) {
                return iG2;
            }
            throw InvalidProtocolBufferException.b();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22940z
        public final int y() {
            return G();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22940z
        public final long z() {
            return H();
        }
    }

    /* compiled from: CodedInputStream.java */
    /* renamed from: androidx.datastore.preferences.protobuf.z$d */
    public static final class d extends AbstractC22940z {

        /* renamed from: e, reason: collision with root package name */
        public final InputStream f45970e;

        /* renamed from: f, reason: collision with root package name */
        public final byte[] f45971f;

        /* renamed from: g, reason: collision with root package name */
        public int f45972g;

        /* renamed from: h, reason: collision with root package name */
        public int f45973h;

        /* renamed from: i, reason: collision with root package name */
        public int f45974i;

        /* renamed from: j, reason: collision with root package name */
        public int f45975j;

        /* renamed from: k, reason: collision with root package name */
        public int f45976k;

        /* renamed from: l, reason: collision with root package name */
        public int f45977l;

        /* compiled from: CodedInputStream.java */
        /* renamed from: androidx.datastore.preferences.protobuf.z$d$a */
        public interface a {
        }

        /* compiled from: CodedInputStream.java */
        /* renamed from: androidx.datastore.preferences.protobuf.z$d$b */
        public class b implements a {
        }

        public d(InputStream inputStream, int i12, a aVar) {
            super();
            this.f45977l = Integer.MAX_VALUE;
            C22914m0.a(inputStream, "input");
            this.f45970e = inputStream;
            this.f45971f = new byte[i12];
            this.f45972g = 0;
            this.f45974i = 0;
            this.f45976k = 0;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22940z
        public final boolean A(int i12) throws InvalidProtocolBufferException {
            int iX2;
            int i13 = i12 & 7;
            int i14 = 0;
            if (i13 == 0) {
                int i15 = this.f45972g - this.f45974i;
                byte[] bArr = this.f45971f;
                if (i15 >= 10) {
                    while (i14 < 10) {
                        int i16 = this.f45974i;
                        this.f45974i = i16 + 1;
                        if (bArr[i16] < 0) {
                            i14++;
                        }
                    }
                    throw InvalidProtocolBufferException.e();
                }
                while (i14 < 10) {
                    if (this.f45974i == this.f45972g) {
                        K(1);
                    }
                    int i17 = this.f45974i;
                    this.f45974i = i17 + 1;
                    if (bArr[i17] < 0) {
                        i14++;
                    }
                }
                throw InvalidProtocolBufferException.e();
                return true;
            }
            if (i13 == 1) {
                L(8);
                return true;
            }
            if (i13 == 2) {
                L(G());
                return true;
            }
            if (i13 != 3) {
                if (i13 == 4) {
                    return false;
                }
                if (i13 != 5) {
                    throw InvalidProtocolBufferException.d();
                }
                L(4);
                return true;
            }
            do {
                iX2 = x();
                if (iX2 == 0) {
                    break;
                }
            } while (A(iX2));
            a(((i12 >>> 3) << 3) | 4);
            return true;
        }

        public final byte[] B(int i12) throws IOException {
            byte[] bArrC = C(i12);
            if (bArrC != null) {
                return bArrC;
            }
            int i13 = this.f45974i;
            int i14 = this.f45972g;
            int length = i14 - i13;
            this.f45976k += i14;
            this.f45974i = 0;
            this.f45972g = 0;
            ArrayList arrayListD = D(i12 - length);
            byte[] bArr = new byte[i12];
            System.arraycopy(this.f45971f, i13, bArr, 0, length);
            Iterator it = arrayListD.iterator();
            while (it.hasNext()) {
                byte[] bArr2 = (byte[]) it.next();
                System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
                length += bArr2.length;
            }
            return bArr;
        }

        public final byte[] C(int i12) throws IOException {
            if (i12 == 0) {
                return C22914m0.f45875b;
            }
            if (i12 < 0) {
                throw InvalidProtocolBufferException.f();
            }
            int i13 = this.f45976k;
            int i14 = this.f45974i;
            int i15 = i13 + i14 + i12;
            if (i15 - this.f45950c > 0) {
                throw new InvalidProtocolBufferException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
            }
            int i16 = this.f45977l;
            if (i15 > i16) {
                L((i16 - i13) - i14);
                throw InvalidProtocolBufferException.h();
            }
            int i17 = this.f45972g - i14;
            int i18 = i12 - i17;
            InputStream inputStream = this.f45970e;
            if (i18 >= 4096 && i18 > inputStream.available()) {
                return null;
            }
            byte[] bArr = new byte[i12];
            System.arraycopy(this.f45971f, this.f45974i, bArr, 0, i17);
            this.f45976k += this.f45972g;
            this.f45974i = 0;
            this.f45972g = 0;
            while (i17 < i12) {
                int i19 = inputStream.read(bArr, i17, i12 - i17);
                if (i19 == -1) {
                    throw InvalidProtocolBufferException.h();
                }
                this.f45976k += i19;
                i17 += i19;
            }
            return bArr;
        }

        public final ArrayList D(int i12) throws IOException {
            ArrayList arrayList = new ArrayList();
            while (i12 > 0) {
                int iMin = Math.min(i12, 4096);
                byte[] bArr = new byte[iMin];
                int i13 = 0;
                while (i13 < iMin) {
                    int i14 = this.f45970e.read(bArr, i13, iMin - i13);
                    if (i14 == -1) {
                        throw InvalidProtocolBufferException.h();
                    }
                    this.f45976k += i14;
                    i13 += i14;
                }
                i12 -= iMin;
                arrayList.add(bArr);
            }
            return arrayList;
        }

        public final int E() throws InvalidProtocolBufferException {
            int i12 = this.f45974i;
            if (this.f45972g - i12 < 4) {
                K(4);
                i12 = this.f45974i;
            }
            this.f45974i = i12 + 4;
            byte[] bArr = this.f45971f;
            return ((bArr[i12 + 3] & 255) << 24) | (bArr[i12] & 255) | ((bArr[i12 + 1] & 255) << 8) | ((bArr[i12 + 2] & 255) << 16);
        }

        public final long F() throws InvalidProtocolBufferException {
            int i12 = this.f45974i;
            if (this.f45972g - i12 < 8) {
                K(8);
                i12 = this.f45974i;
            }
            this.f45974i = i12 + 8;
            byte[] bArr = this.f45971f;
            return ((bArr[i12 + 7] & 255) << 56) | (bArr[i12] & 255) | ((bArr[i12 + 1] & 255) << 8) | ((bArr[i12 + 2] & 255) << 16) | ((bArr[i12 + 3] & 255) << 24) | ((bArr[i12 + 4] & 255) << 32) | ((bArr[i12 + 5] & 255) << 40) | ((bArr[i12 + 6] & 255) << 48);
        }

        public final int G() {
            int i12;
            int i13 = this.f45974i;
            int i14 = this.f45972g;
            if (i14 != i13) {
                int i15 = i13 + 1;
                byte[] bArr = this.f45971f;
                byte b12 = bArr[i13];
                if (b12 >= 0) {
                    this.f45974i = i15;
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
                    this.f45974i = i16;
                    return i12;
                }
            }
            return (int) I();
        }

        public final long H() {
            long j12;
            long j13;
            long j14;
            long j15;
            int i12 = this.f45974i;
            int i13 = this.f45972g;
            if (i13 != i12) {
                int i14 = i12 + 1;
                byte[] bArr = this.f45971f;
                byte b12 = bArr[i12];
                if (b12 >= 0) {
                    this.f45974i = i14;
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
                    this.f45974i = i15;
                    return j12;
                }
            }
            return I();
        }

        public final long I() throws InvalidProtocolBufferException {
            long j12 = 0;
            for (int i12 = 0; i12 < 64; i12 += 7) {
                if (this.f45974i == this.f45972g) {
                    K(1);
                }
                int i13 = this.f45974i;
                this.f45974i = i13 + 1;
                j12 |= (r3 & 127) << i12;
                if ((this.f45971f[i13] & 128) == 0) {
                    return j12;
                }
            }
            throw InvalidProtocolBufferException.e();
        }

        public final void J() {
            int i12 = this.f45972g + this.f45973h;
            this.f45972g = i12;
            int i13 = this.f45976k + i12;
            int i14 = this.f45977l;
            if (i13 <= i14) {
                this.f45973h = 0;
                return;
            }
            int i15 = i13 - i14;
            this.f45973h = i15;
            this.f45972g = i12 - i15;
        }

        public final void K(int i12) throws InvalidProtocolBufferException {
            if (M(i12)) {
                return;
            }
            if (i12 <= (this.f45950c - this.f45976k) - this.f45974i) {
                throw InvalidProtocolBufferException.h();
            }
            throw new InvalidProtocolBufferException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }

        public final void L(int i12) throws InvalidProtocolBufferException {
            int i13 = this.f45972g;
            int i14 = this.f45974i;
            if (i12 <= i13 - i14 && i12 >= 0) {
                this.f45974i = i14 + i12;
                return;
            }
            InputStream inputStream = this.f45970e;
            if (i12 < 0) {
                throw InvalidProtocolBufferException.f();
            }
            int i15 = this.f45976k;
            int i16 = i15 + i14;
            int i17 = i16 + i12;
            int i18 = this.f45977l;
            if (i17 > i18) {
                L((i18 - i15) - i14);
                throw InvalidProtocolBufferException.h();
            }
            this.f45976k = i16;
            int i19 = i13 - i14;
            this.f45972g = 0;
            this.f45974i = 0;
            while (i19 < i12) {
                long j12 = i12 - i19;
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
                } finally {
                    this.f45976k += i19;
                    J();
                }
            }
            if (i19 >= i12) {
                return;
            }
            int i22 = this.f45972g;
            int i23 = i22 - this.f45974i;
            this.f45974i = i22;
            K(1);
            while (true) {
                int i24 = i12 - i23;
                int i25 = this.f45972g;
                if (i24 <= i25) {
                    this.f45974i = i24;
                    return;
                } else {
                    i23 += i25;
                    this.f45974i = i25;
                    K(1);
                }
            }
        }

        public final boolean M(int i12) throws IOException {
            int i13 = this.f45974i;
            int i14 = i13 + i12;
            int i15 = this.f45972g;
            if (i14 <= i15) {
                throw new IllegalStateException(androidx.camera.camera2.internal.G.e(i12, "refillBuffer() called when ", " bytes were already available in buffer"));
            }
            int i16 = this.f45976k;
            int i17 = this.f45950c;
            if (i12 > (i17 - i16) - i13 || i16 + i13 + i12 > this.f45977l) {
                return false;
            }
            byte[] bArr = this.f45971f;
            if (i13 > 0) {
                if (i15 > i13) {
                    System.arraycopy(bArr, i13, bArr, 0, i15 - i13);
                }
                this.f45976k += i13;
                this.f45972g -= i13;
                this.f45974i = 0;
            }
            int i18 = this.f45972g;
            int iMin = Math.min(bArr.length - i18, (i17 - this.f45976k) - i18);
            InputStream inputStream = this.f45970e;
            int i19 = inputStream.read(bArr, i18, iMin);
            if (i19 == 0 || i19 < -1 || i19 > bArr.length) {
                throw new IllegalStateException(inputStream.getClass() + "#read(byte[]) returned invalid result: " + i19 + "\nThe InputStream implementation is buggy.");
            }
            if (i19 <= 0) {
                return false;
            }
            this.f45972g += i19;
            J();
            if (this.f45972g >= i12) {
                return true;
            }
            return M(i12);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22940z
        public final void a(int i12) throws InvalidProtocolBufferException {
            if (this.f45975j != i12) {
                throw InvalidProtocolBufferException.a();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22940z
        public final int d() {
            return this.f45976k + this.f45974i;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22940z
        public final boolean e() {
            return this.f45974i == this.f45972g && !M(1);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22940z
        public final void g(int i12) {
            this.f45977l = i12;
            J();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22940z
        public final int h(int i12) throws InvalidProtocolBufferException {
            if (i12 < 0) {
                throw InvalidProtocolBufferException.f();
            }
            int i13 = this.f45976k + this.f45974i + i12;
            int i14 = this.f45977l;
            if (i13 > i14) {
                throw InvalidProtocolBufferException.h();
            }
            this.f45977l = i13;
            J();
            return i14;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22940z
        public final boolean i() {
            return H() != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22940z
        public final AbstractC22934w j() throws IOException {
            int iG2 = G();
            int i12 = this.f45972g;
            int i13 = this.f45974i;
            int i14 = i12 - i13;
            byte[] bArr = this.f45971f;
            if (iG2 <= i14 && iG2 > 0) {
                AbstractC22934w abstractC22934wH = AbstractC22934w.h(i13, iG2, bArr);
                this.f45974i += iG2;
                return abstractC22934wH;
            }
            if (iG2 == 0) {
                return AbstractC22934w.f45925c;
            }
            byte[] bArrC = C(iG2);
            if (bArrC != null) {
                return AbstractC22934w.h(0, bArrC.length, bArrC);
            }
            int i15 = this.f45974i;
            int i16 = this.f45972g;
            int length = i16 - i15;
            this.f45976k += i16;
            this.f45974i = 0;
            this.f45972g = 0;
            ArrayList arrayListD = D(iG2 - length);
            byte[] bArr2 = new byte[iG2];
            System.arraycopy(bArr, i15, bArr2, 0, length);
            Iterator it = arrayListD.iterator();
            while (it.hasNext()) {
                byte[] bArr3 = (byte[]) it.next();
                System.arraycopy(bArr3, 0, bArr2, length, bArr3.length);
                length += bArr3.length;
            }
            AbstractC22934w abstractC22934w = AbstractC22934w.f45925c;
            return new AbstractC22934w.j(bArr2);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22940z
        public final double k() {
            return Double.longBitsToDouble(F());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22940z
        public final int l() {
            return G();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22940z
        public final int m() {
            return E();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22940z
        public final long n() {
            return F();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22940z
        public final float o() {
            return Float.intBitsToFloat(E());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22940z
        public final int p() {
            return G();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22940z
        public final long q() {
            return H();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22940z
        public final int r() {
            return E();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22940z
        public final long s() {
            return F();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22940z
        public final int t() {
            return AbstractC22940z.b(G());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22940z
        public final long u() {
            return AbstractC22940z.c(H());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22940z
        public final String v() throws InvalidProtocolBufferException {
            int iG2 = G();
            byte[] bArr = this.f45971f;
            if (iG2 > 0) {
                int i12 = this.f45972g;
                int i13 = this.f45974i;
                if (iG2 <= i12 - i13) {
                    String str = new String(bArr, i13, iG2, C22914m0.f45874a);
                    this.f45974i += iG2;
                    return str;
                }
            }
            if (iG2 == 0) {
                return "";
            }
            if (iG2 > this.f45972g) {
                return new String(B(iG2), C22914m0.f45874a);
            }
            K(iG2);
            String str2 = new String(bArr, this.f45974i, iG2, C22914m0.f45874a);
            this.f45974i += iG2;
            return str2;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22940z
        public final String w() throws IOException {
            int iG2 = G();
            int i12 = this.f45974i;
            int i13 = this.f45972g;
            int i14 = i13 - i12;
            byte[] bArrB = this.f45971f;
            if (iG2 <= i14 && iG2 > 0) {
                this.f45974i = i12 + iG2;
            } else {
                if (iG2 == 0) {
                    return "";
                }
                i12 = 0;
                if (iG2 <= i13) {
                    K(iG2);
                    this.f45974i = iG2;
                } else {
                    bArrB = B(iG2);
                }
            }
            return L1.f45728a.a(bArrB, i12, iG2);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22940z
        public final int x() throws InvalidProtocolBufferException {
            if (e()) {
                this.f45975j = 0;
                return 0;
            }
            int iG2 = G();
            this.f45975j = iG2;
            if ((iG2 >>> 3) != 0) {
                return iG2;
            }
            throw InvalidProtocolBufferException.b();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22940z
        public final int y() {
            return G();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22940z
        public final long z() {
            return H();
        }
    }

    /* compiled from: CodedInputStream.java */
    /* renamed from: androidx.datastore.preferences.protobuf.z$e */
    public static final class e extends AbstractC22940z {

        /* renamed from: e, reason: collision with root package name */
        public final ByteBuffer f45978e;

        /* renamed from: f, reason: collision with root package name */
        public final long f45979f;

        /* renamed from: g, reason: collision with root package name */
        public long f45980g;

        /* renamed from: h, reason: collision with root package name */
        public long f45981h;

        /* renamed from: i, reason: collision with root package name */
        public final long f45982i;

        /* renamed from: j, reason: collision with root package name */
        public int f45983j;

        /* renamed from: k, reason: collision with root package name */
        public int f45984k;

        /* renamed from: l, reason: collision with root package name */
        public int f45985l;

        public e(ByteBuffer byteBuffer, boolean z12, a aVar) {
            super();
            this.f45985l = Integer.MAX_VALUE;
            this.f45978e = byteBuffer;
            long jA2 = K1.a(byteBuffer);
            this.f45979f = jA2;
            this.f45980g = byteBuffer.limit() + jA2;
            long jPosition = jA2 + byteBuffer.position();
            this.f45981h = jPosition;
            this.f45982i = jPosition;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22940z
        public final boolean A(int i12) throws InvalidProtocolBufferException {
            int iX2;
            int i13 = i12 & 7;
            int i14 = 0;
            if (i13 == 0) {
                if (((int) (this.f45980g - this.f45981h)) >= 10) {
                    while (i14 < 10) {
                        long j12 = this.f45981h;
                        this.f45981h = j12 + 1;
                        if (K1.f45720d.f(j12) < 0) {
                            i14++;
                        }
                    }
                    throw InvalidProtocolBufferException.e();
                }
                while (i14 < 10) {
                    long j13 = this.f45981h;
                    if (j13 == this.f45980g) {
                        throw InvalidProtocolBufferException.h();
                    }
                    this.f45981h = j13 + 1;
                    if (K1.f45720d.f(j13) < 0) {
                        i14++;
                    }
                }
                throw InvalidProtocolBufferException.e();
                return true;
            }
            if (i13 == 1) {
                H(8);
                return true;
            }
            if (i13 == 2) {
                H(D());
                return true;
            }
            if (i13 != 3) {
                if (i13 == 4) {
                    return false;
                }
                if (i13 != 5) {
                    throw InvalidProtocolBufferException.d();
                }
                H(4);
                return true;
            }
            do {
                iX2 = x();
                if (iX2 == 0) {
                    break;
                }
            } while (A(iX2));
            a(((i12 >>> 3) << 3) | 4);
            return true;
        }

        public final int B() throws InvalidProtocolBufferException {
            long j12 = this.f45981h;
            if (this.f45980g - j12 < 4) {
                throw InvalidProtocolBufferException.h();
            }
            this.f45981h = 4 + j12;
            K1.e eVar = K1.f45720d;
            return ((eVar.f(j12 + 3) & 255) << 24) | (eVar.f(j12) & 255) | ((eVar.f(1 + j12) & 255) << 8) | ((eVar.f(2 + j12) & 255) << 16);
        }

        public final long C() throws InvalidProtocolBufferException {
            long j12 = this.f45981h;
            if (this.f45980g - j12 < 8) {
                throw InvalidProtocolBufferException.h();
            }
            this.f45981h = 8 + j12;
            K1.e eVar = K1.f45720d;
            return ((eVar.f(j12 + 7) & 255) << 56) | (eVar.f(j12) & 255) | ((eVar.f(1 + j12) & 255) << 8) | ((eVar.f(2 + j12) & 255) << 16) | ((eVar.f(3 + j12) & 255) << 24) | ((eVar.f(4 + j12) & 255) << 32) | ((eVar.f(5 + j12) & 255) << 40) | ((eVar.f(6 + j12) & 255) << 48);
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x0091, code lost:
        
            if (r4.f(r8) < 0) goto L34;
         */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0099 A[PHI: r6
  0x0099: PHI (r6v7 long) = (r6v6 long), (r6v8 long), (r6v10 long) binds: [B:25:0x006d, B:29:0x0080, B:33:0x0091] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final int D() {
            /*
                r12 = this;
                long r0 = r12.f45981h
                long r2 = r12.f45980g
                int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r2 != 0) goto La
                goto L93
            La:
                r2 = 1
                long r2 = r2 + r0
                androidx.datastore.preferences.protobuf.K1$e r4 = androidx.datastore.preferences.protobuf.K1.f45720d
                byte r5 = r4.f(r0)
                if (r5 < 0) goto L18
                r12.f45981h = r2
                return r5
            L18:
                long r6 = r12.f45980g
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
                long r0 = r12.F()
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
                r12.f45981h = r6
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.AbstractC22940z.e.D():int");
        }

        public final long E() {
            long j12;
            long j13;
            long j14;
            int i12;
            long j15 = this.f45981h;
            if (this.f45980g != j15) {
                long j16 = 1 + j15;
                K1.e eVar = K1.f45720d;
                byte bF2 = eVar.f(j15);
                if (bF2 >= 0) {
                    this.f45981h = j16;
                    return bF2;
                }
                if (this.f45980g - j16 >= 9) {
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
                                                this.f45981h = j17;
                                                return j12;
                                            }
                                            j13 = -558586000294016L;
                                        }
                                    }
                                    j12 = j13 ^ jF3;
                                    j17 = j19;
                                    this.f45981h = j17;
                                    return j12;
                                }
                                j14 = 266354560;
                                j12 = j14 ^ jF2;
                            }
                        }
                        j17 = j18;
                        this.f45981h = j17;
                        return j12;
                    }
                    i12 = iF2 ^ (-128);
                    j12 = i12;
                    this.f45981h = j17;
                    return j12;
                }
            }
            return F();
        }

        public final long F() throws InvalidProtocolBufferException {
            long j12 = 0;
            for (int i12 = 0; i12 < 64; i12 += 7) {
                long j13 = this.f45981h;
                if (j13 == this.f45980g) {
                    throw InvalidProtocolBufferException.h();
                }
                this.f45981h = 1 + j13;
                j12 |= (r3 & 127) << i12;
                if ((K1.f45720d.f(j13) & 128) == 0) {
                    return j12;
                }
            }
            throw InvalidProtocolBufferException.e();
        }

        public final void G() {
            long j12 = this.f45980g + this.f45983j;
            this.f45980g = j12;
            int i12 = (int) (j12 - this.f45982i);
            int i13 = this.f45985l;
            if (i12 <= i13) {
                this.f45983j = 0;
                return;
            }
            int i14 = i12 - i13;
            this.f45983j = i14;
            this.f45980g = j12 - i14;
        }

        public final void H(int i12) throws InvalidProtocolBufferException {
            if (i12 >= 0) {
                long j12 = this.f45980g;
                long j13 = this.f45981h;
                if (i12 <= ((int) (j12 - j13))) {
                    this.f45981h = j13 + i12;
                    return;
                }
            }
            if (i12 >= 0) {
                throw InvalidProtocolBufferException.h();
            }
            throw InvalidProtocolBufferException.f();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22940z
        public final void a(int i12) throws InvalidProtocolBufferException {
            if (this.f45984k != i12) {
                throw InvalidProtocolBufferException.a();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22940z
        public final int d() {
            return (int) (this.f45981h - this.f45982i);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22940z
        public final boolean e() {
            return this.f45981h == this.f45980g;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22940z
        public final void g(int i12) {
            this.f45985l = i12;
            G();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22940z
        public final int h(int i12) throws InvalidProtocolBufferException {
            if (i12 < 0) {
                throw InvalidProtocolBufferException.f();
            }
            int iD2 = i12 + d();
            int i13 = this.f45985l;
            if (iD2 > i13) {
                throw InvalidProtocolBufferException.h();
            }
            this.f45985l = iD2;
            G();
            return i13;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22940z
        public final boolean i() {
            return E() != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22940z
        public final AbstractC22934w j() throws InvalidProtocolBufferException {
            int iD2 = D();
            if (iD2 > 0) {
                long j12 = this.f45980g;
                long j13 = this.f45981h;
                if (iD2 <= ((int) (j12 - j13))) {
                    byte[] bArr = new byte[iD2];
                    long j14 = iD2;
                    K1.f45720d.c(j13, bArr, 0L, j14);
                    this.f45981h += j14;
                    AbstractC22934w abstractC22934w = AbstractC22934w.f45925c;
                    return new AbstractC22934w.j(bArr);
                }
            }
            if (iD2 == 0) {
                return AbstractC22934w.f45925c;
            }
            if (iD2 < 0) {
                throw InvalidProtocolBufferException.f();
            }
            throw InvalidProtocolBufferException.h();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22940z
        public final double k() {
            return Double.longBitsToDouble(C());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22940z
        public final int l() {
            return D();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22940z
        public final int m() {
            return B();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22940z
        public final long n() {
            return C();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22940z
        public final float o() {
            return Float.intBitsToFloat(B());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22940z
        public final int p() {
            return D();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22940z
        public final long q() {
            return E();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22940z
        public final int r() {
            return B();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22940z
        public final long s() {
            return C();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22940z
        public final int t() {
            return AbstractC22940z.b(D());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22940z
        public final long u() {
            return AbstractC22940z.c(E());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22940z
        public final String v() throws InvalidProtocolBufferException {
            int iD2 = D();
            if (iD2 > 0) {
                long j12 = this.f45980g;
                long j13 = this.f45981h;
                if (iD2 <= ((int) (j12 - j13))) {
                    byte[] bArr = new byte[iD2];
                    long j14 = iD2;
                    K1.f45720d.c(j13, bArr, 0L, j14);
                    String str = new String(bArr, C22914m0.f45874a);
                    this.f45981h += j14;
                    return str;
                }
            }
            if (iD2 == 0) {
                return "";
            }
            if (iD2 < 0) {
                throw InvalidProtocolBufferException.f();
            }
            throw InvalidProtocolBufferException.h();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22940z
        public final String w() throws InvalidProtocolBufferException {
            int iD2 = D();
            if (iD2 > 0) {
                long j12 = this.f45980g;
                long j13 = this.f45981h;
                if (iD2 <= ((int) (j12 - j13))) {
                    String strC = L1.c(this.f45978e, (int) (j13 - this.f45979f), iD2);
                    this.f45981h += iD2;
                    return strC;
                }
            }
            if (iD2 == 0) {
                return "";
            }
            if (iD2 <= 0) {
                throw InvalidProtocolBufferException.f();
            }
            throw InvalidProtocolBufferException.h();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22940z
        public final int x() throws InvalidProtocolBufferException {
            if (e()) {
                this.f45984k = 0;
                return 0;
            }
            int iD2 = D();
            this.f45984k = iD2;
            if ((iD2 >>> 3) != 0) {
                return iD2;
            }
            throw InvalidProtocolBufferException.b();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22940z
        public final int y() {
            return D();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22940z
        public final long z() {
            return E();
        }
    }

    public static int b(int i12) {
        return (-(i12 & 1)) ^ (i12 >>> 1);
    }

    public static long c(long j12) {
        return (-(j12 & 1)) ^ (j12 >>> 1);
    }

    public static AbstractC22940z f(InputStream inputStream) {
        return new d(inputStream, 4096, null);
    }

    public abstract boolean A(int i12);

    public abstract void a(int i12);

    public abstract int d();

    public abstract boolean e();

    public abstract void g(int i12);

    public abstract int h(int i12);

    public abstract boolean i();

    public abstract AbstractC22934w j();

    public abstract double k();

    public abstract int l();

    public abstract int m();

    public abstract long n();

    public abstract float o();

    public abstract int p();

    public abstract long q();

    public abstract int r();

    public abstract long s();

    public abstract int t();

    public abstract long u();

    public abstract String v();

    public abstract String w();

    public abstract int x();

    public abstract int y();

    public abstract long z();

    public AbstractC22940z() {
        this.f45949b = 100;
        this.f45950c = Integer.MAX_VALUE;
    }
}
