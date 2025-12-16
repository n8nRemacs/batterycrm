package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: CodedInputStream.java */
/* loaded from: classes8.dex */
public final class e {

    /* renamed from: c, reason: collision with root package name */
    public int f409341c;

    /* renamed from: e, reason: collision with root package name */
    public final InputStream f409343e;

    /* renamed from: f, reason: collision with root package name */
    public int f409344f;

    /* renamed from: i, reason: collision with root package name */
    public int f409347i;

    /* renamed from: h, reason: collision with root package name */
    public int f409346h = Integer.MAX_VALUE;

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f409339a = new byte[4096];

    /* renamed from: b, reason: collision with root package name */
    public int f409340b = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f409342d = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f409345g = 0;

    /* compiled from: CodedInputStream.java */
    public interface a {
    }

    public e(InputStream inputStream) {
        this.f409343e = inputStream;
    }

    public final void a(int i12) throws InvalidProtocolBufferException {
        if (this.f409344f != i12) {
            throw new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
        }
    }

    public final int b() {
        int i12 = this.f409346h;
        if (i12 == Integer.MAX_VALUE) {
            return -1;
        }
        return i12 - (this.f409345g + this.f409342d);
    }

    public final void c(int i12) {
        this.f409346h = i12;
        o();
    }

    public final int d(int i12) throws InvalidProtocolBufferException {
        if (i12 < 0) {
            throw new InvalidProtocolBufferException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i13 = this.f409345g + this.f409342d + i12;
        int i14 = this.f409346h;
        if (i13 > i14) {
            throw InvalidProtocolBufferException.a();
        }
        this.f409346h = i13;
        o();
        return i14;
    }

    public final d e() {
        int iK2 = k();
        int i12 = this.f409340b;
        int i13 = this.f409342d;
        if (iK2 > i12 - i13 || iK2 <= 0) {
            return iK2 == 0 ? d.f409332b : new n(h(iK2));
        }
        d dVar = d.f409332b;
        byte[] bArr = new byte[iK2];
        System.arraycopy(this.f409339a, i13, bArr, 0, iK2);
        n nVar = new n(bArr);
        this.f409342d += iK2;
        return nVar;
    }

    public final int f() {
        return k();
    }

    public final <T extends o> T g(q<T> qVar, f fVar) throws InvalidProtocolBufferException {
        int iK2 = k();
        if (this.f409347i >= 64) {
            throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int iD2 = d(iK2);
        this.f409347i++;
        T tA2 = qVar.a(this, fVar);
        a(0);
        this.f409347i--;
        c(iD2);
        return tA2;
    }

    public final byte[] h(int i12) throws InvalidProtocolBufferException {
        if (i12 <= 0) {
            if (i12 == 0) {
                return i.f409374a;
            }
            throw new InvalidProtocolBufferException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i13 = this.f409345g;
        int i14 = this.f409342d;
        int i15 = i13 + i14 + i12;
        int i16 = this.f409346h;
        if (i15 > i16) {
            r((i16 - i13) - i14);
            throw InvalidProtocolBufferException.a();
        }
        byte[] bArr = this.f409339a;
        if (i12 < 4096) {
            byte[] bArr2 = new byte[i12];
            int i17 = this.f409340b - i14;
            System.arraycopy(bArr, i14, bArr2, 0, i17);
            this.f409342d = this.f409340b;
            int i18 = i12 - i17;
            if (i18 > 0) {
                p(i18);
            }
            System.arraycopy(bArr, 0, bArr2, i17, i18);
            this.f409342d = i18;
            return bArr2;
        }
        int i19 = this.f409340b;
        this.f409345g = i13 + i19;
        this.f409342d = 0;
        this.f409340b = 0;
        int length = i19 - i14;
        int i22 = i12 - length;
        ArrayList arrayList = new ArrayList();
        while (i22 > 0) {
            int iMin = Math.min(i22, 4096);
            byte[] bArr3 = new byte[iMin];
            int i23 = 0;
            while (i23 < iMin) {
                InputStream inputStream = this.f409343e;
                int i24 = inputStream == null ? -1 : inputStream.read(bArr3, i23, iMin - i23);
                if (i24 == -1) {
                    throw InvalidProtocolBufferException.a();
                }
                this.f409345g += i24;
                i23 += i24;
            }
            i22 -= iMin;
            arrayList.add(bArr3);
        }
        byte[] bArr4 = new byte[i12];
        System.arraycopy(bArr, i14, bArr4, 0, length);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            byte[] bArr5 = (byte[]) it.next();
            System.arraycopy(bArr5, 0, bArr4, length, bArr5.length);
            length += bArr5.length;
        }
        return bArr4;
    }

    public final int i() throws InvalidProtocolBufferException {
        int i12 = this.f409342d;
        if (this.f409340b - i12 < 4) {
            p(4);
            i12 = this.f409342d;
        }
        this.f409342d = i12 + 4;
        byte[] bArr = this.f409339a;
        return ((bArr[i12 + 3] & 255) << 24) | (bArr[i12] & 255) | ((bArr[i12 + 1] & 255) << 8) | ((bArr[i12 + 2] & 255) << 16);
    }

    public final long j() throws InvalidProtocolBufferException {
        int i12 = this.f409342d;
        if (this.f409340b - i12 < 8) {
            p(8);
            i12 = this.f409342d;
        }
        this.f409342d = i12 + 8;
        byte[] bArr = this.f409339a;
        return ((bArr[i12 + 7] & 255) << 56) | (bArr[i12] & 255) | ((bArr[i12 + 1] & 255) << 8) | ((bArr[i12 + 2] & 255) << 16) | ((bArr[i12 + 3] & 255) << 24) | ((bArr[i12 + 4] & 255) << 32) | ((bArr[i12 + 5] & 255) << 40) | ((bArr[i12 + 6] & 255) << 48);
    }

    public final int k() {
        int i12;
        int i13 = this.f409342d;
        int i14 = this.f409340b;
        if (i14 != i13) {
            int i15 = i13 + 1;
            byte[] bArr = this.f409339a;
            byte b12 = bArr[i13];
            if (b12 >= 0) {
                this.f409342d = i15;
                return b12;
            }
            if (i14 - i15 >= 9) {
                int i16 = i13 + 2;
                int i17 = (bArr[i15] << 7) ^ b12;
                long j12 = i17;
                if (j12 < 0) {
                    i12 = (int) ((-128) ^ j12);
                } else {
                    int i18 = i13 + 3;
                    int i19 = (bArr[i16] << 14) ^ i17;
                    long j13 = i19;
                    if (j13 >= 0) {
                        i12 = (int) (16256 ^ j13);
                    } else {
                        int i22 = i13 + 4;
                        long j14 = i19 ^ (bArr[i18] << 21);
                        if (j14 < 0) {
                            i12 = (int) ((-2080896) ^ j14);
                        } else {
                            i18 = i13 + 5;
                            int i23 = (int) ((r1 ^ (r2 << 28)) ^ 266354560);
                            if (bArr[i22] < 0) {
                                i22 = i13 + 6;
                                if (bArr[i18] < 0) {
                                    i18 = i13 + 7;
                                    if (bArr[i22] < 0) {
                                        i22 = i13 + 8;
                                        if (bArr[i18] < 0) {
                                            i18 = i13 + 9;
                                            if (bArr[i22] < 0) {
                                                int i24 = i13 + 10;
                                                if (bArr[i18] >= 0) {
                                                    i16 = i24;
                                                    i12 = i23;
                                                }
                                            }
                                        }
                                    }
                                }
                                i12 = i23;
                            }
                            i12 = i23;
                        }
                        i16 = i22;
                    }
                    i16 = i18;
                }
                this.f409342d = i16;
                return i12;
            }
        }
        return (int) m();
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b6, code lost:
    
        if (r3[r2] < 0) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long l() {
        /*
            Method dump skipped, instructions count: 196
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.protobuf.e.l():long");
    }

    public final long m() throws InvalidProtocolBufferException {
        long j12 = 0;
        for (int i12 = 0; i12 < 64; i12 += 7) {
            if (this.f409342d == this.f409340b) {
                p(1);
            }
            int i13 = this.f409342d;
            this.f409342d = i13 + 1;
            j12 |= (r3 & 127) << i12;
            if ((this.f409339a[i13] & 128) == 0) {
                return j12;
            }
        }
        throw new InvalidProtocolBufferException("CodedInputStream encountered a malformed varint.");
    }

    public final int n() throws InvalidProtocolBufferException {
        if (this.f409342d == this.f409340b && !s(1)) {
            this.f409344f = 0;
            return 0;
        }
        int iK2 = k();
        this.f409344f = iK2;
        if ((iK2 >>> 3) != 0) {
            return iK2;
        }
        throw new InvalidProtocolBufferException("Protocol message contained an invalid tag (zero).");
    }

    public final void o() {
        int i12 = this.f409340b + this.f409341c;
        this.f409340b = i12;
        int i13 = this.f409345g + i12;
        int i14 = this.f409346h;
        if (i13 <= i14) {
            this.f409341c = 0;
            return;
        }
        int i15 = i13 - i14;
        this.f409341c = i15;
        this.f409340b = i12 - i15;
    }

    public final void p(int i12) throws InvalidProtocolBufferException {
        if (!s(i12)) {
            throw InvalidProtocolBufferException.a();
        }
    }

    public final boolean q(int i12, CodedOutputStream codedOutputStream) throws IOException {
        int iN2;
        int i13 = i12 & 7;
        if (i13 == 0) {
            long jL2 = l();
            codedOutputStream.v(i12);
            codedOutputStream.w(jL2);
            return true;
        }
        if (i13 == 1) {
            long j12 = j();
            codedOutputStream.v(i12);
            codedOutputStream.u(j12);
            return true;
        }
        if (i13 == 2) {
            d dVarE = e();
            codedOutputStream.v(i12);
            codedOutputStream.v(dVarE.size());
            codedOutputStream.r(dVarE);
            return true;
        }
        if (i13 != 3) {
            if (i13 == 4) {
                return false;
            }
            if (i13 != 5) {
                throw new InvalidProtocolBufferException("Protocol message tag had invalid wire type.");
            }
            int i14 = i();
            codedOutputStream.v(i12);
            codedOutputStream.t(i14);
            return true;
        }
        codedOutputStream.v(i12);
        do {
            iN2 = n();
            if (iN2 == 0) {
                break;
            }
        } while (q(iN2, codedOutputStream));
        int i15 = ((i12 >>> 3) << 3) | 4;
        a(i15);
        codedOutputStream.v(i15);
        return true;
    }

    public final void r(int i12) throws InvalidProtocolBufferException {
        int i13 = this.f409340b;
        int i14 = this.f409342d;
        int i15 = i13 - i14;
        if (i12 <= i15 && i12 >= 0) {
            this.f409342d = i14 + i12;
            return;
        }
        if (i12 < 0) {
            throw new InvalidProtocolBufferException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i16 = this.f409345g;
        int i17 = i16 + i14 + i12;
        int i18 = this.f409346h;
        if (i17 > i18) {
            r((i18 - i16) - i14);
            throw InvalidProtocolBufferException.a();
        }
        this.f409342d = i13;
        p(1);
        while (true) {
            int i19 = i12 - i15;
            int i22 = this.f409340b;
            if (i19 <= i22) {
                this.f409342d = i19;
                return;
            } else {
                i15 += i22;
                this.f409342d = i22;
                p(1);
            }
        }
    }

    public final boolean s(int i12) throws IOException {
        InputStream inputStream;
        int i13 = this.f409342d;
        int i14 = i13 + i12;
        int i15 = this.f409340b;
        if (i14 <= i15) {
            StringBuilder sb2 = new StringBuilder(77);
            sb2.append("refillBuffer() called when ");
            sb2.append(i12);
            sb2.append(" bytes were already available in buffer");
            throw new IllegalStateException(sb2.toString());
        }
        if (this.f409345g + i13 + i12 <= this.f409346h && (inputStream = this.f409343e) != null) {
            byte[] bArr = this.f409339a;
            if (i13 > 0) {
                if (i15 > i13) {
                    System.arraycopy(bArr, i13, bArr, 0, i15 - i13);
                }
                this.f409345g += i13;
                this.f409340b -= i13;
                this.f409342d = 0;
            }
            int i16 = this.f409340b;
            int i17 = inputStream.read(bArr, i16, bArr.length - i16);
            if (i17 == 0 || i17 < -1 || i17 > bArr.length) {
                StringBuilder sb3 = new StringBuilder(102);
                sb3.append("InputStream#read(byte[]) returned invalid result: ");
                sb3.append(i17);
                sb3.append("\nThe InputStream implementation is buggy.");
                throw new IllegalStateException(sb3.toString());
            }
            if (i17 > 0) {
                this.f409340b += i17;
                if ((this.f409345g + i12) - 67108864 > 0) {
                    throw new InvalidProtocolBufferException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
                }
                o();
                if (this.f409340b >= i12) {
                    return true;
                }
                return s(i12);
            }
        }
        return false;
    }
}
