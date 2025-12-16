package oX0;

import androidx.compose.foundation.H;
import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.io.n;
import com.fasterxml.jackson.core.l;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.math.BigInteger;
import shark.AndroidResourceIdNames;

/* compiled from: UTF8JsonGenerator.java */
/* renamed from: oX0.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C44709i extends AbstractC44703c {

    /* renamed from: w, reason: collision with root package name */
    public static final byte[] f419866w = (byte[]) com.fasterxml.jackson.core.io.b.f341145b.clone();

    /* renamed from: x, reason: collision with root package name */
    public static final byte[] f419867x = {110, 117, 108, 108};

    /* renamed from: y, reason: collision with root package name */
    public static final byte[] f419868y = {116, 114, 117, 101};

    /* renamed from: z, reason: collision with root package name */
    public static final byte[] f419869z = {102, 97, 108, 115, 101};

    /* renamed from: n, reason: collision with root package name */
    public final OutputStream f419870n;

    /* renamed from: o, reason: collision with root package name */
    public final byte f419871o;

    /* renamed from: p, reason: collision with root package name */
    public byte[] f419872p;

    /* renamed from: q, reason: collision with root package name */
    public int f419873q;

    /* renamed from: r, reason: collision with root package name */
    public final int f419874r;

    /* renamed from: s, reason: collision with root package name */
    public final int f419875s;

    /* renamed from: t, reason: collision with root package name */
    public char[] f419876t;

    /* renamed from: u, reason: collision with root package name */
    public final int f419877u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f419878v;

    public C44709i(com.fasterxml.jackson.core.io.f fVar, int i12, ObjectMapper objectMapper, OutputStream outputStream, char c12) {
        super(fVar, i12, objectMapper);
        this.f419870n = outputStream;
        this.f419871o = (byte) c12;
        if (c12 != '\"') {
            this.f419822i = com.fasterxml.jackson.core.io.b.a(c12);
        }
        this.f419878v = true;
        com.fasterxml.jackson.core.io.f.a(fVar.f341166g);
        com.fasterxml.jackson.core.util.a aVar = fVar.f341164e;
        byte[] bArrA = aVar.a(1);
        fVar.f341166g = bArrA;
        this.f419872p = bArrA;
        int length = bArrA.length;
        this.f419874r = length;
        this.f419875s = length >> 3;
        com.fasterxml.jackson.core.io.f.a(fVar.f341169j);
        char[] cArrB = aVar.b(1, 0);
        fVar.f341169j = cArrB;
        this.f419876t = cArrB;
        this.f419877u = cArrB.length;
        if (i(JsonGenerator.Feature.ESCAPE_NON_ASCII)) {
            k(127);
        }
    }

    public static int w0(InputStream inputStream, byte[] bArr, int i12, int i13, int i14) throws IOException {
        int i15 = 0;
        while (i12 < i13) {
            bArr[i15] = bArr[i12];
            i15++;
            i12++;
        }
        int iMin = Math.min(i14, bArr.length);
        do {
            int i16 = iMin - i15;
            if (i16 == 0) {
                break;
            }
            int i17 = inputStream.read(bArr, i15, i16);
            if (i17 < 0) {
                return i15;
            }
            i15 += i17;
        } while (i15 < 3);
        return i15;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void A() throws IOException {
        if (!this.f413836f.d()) {
            a("Current context not Array but ".concat(this.f413836f.h()));
            throw null;
        }
        com.fasterxml.jackson.core.k kVar = this.f341039b;
        if (kVar != null) {
            kVar.e(this, this.f413836f.f341142b + 1);
        } else {
            if (this.f419873q >= this.f419874r) {
                t0();
            }
            byte[] bArr = this.f419872p;
            int i12 = this.f419873q;
            this.f419873q = i12 + 1;
            bArr[i12] = 93;
        }
        C44705e c44705e = this.f413836f;
        c44705e.f419837g = null;
        this.f413836f = c44705e.f419833c;
    }

    public final int A0(int i12, int i13) {
        int i14;
        byte[] bArr = this.f419872p;
        bArr[i13] = 92;
        int i15 = i13 + 2;
        bArr[i13 + 1] = 117;
        byte[] bArr2 = f419866w;
        if (i12 > 255) {
            int i16 = i12 >> 8;
            int i17 = i13 + 3;
            bArr[i15] = bArr2[(i16 & 255) >> 4];
            i14 = i13 + 4;
            bArr[i17] = bArr2[i16 & 15];
            i12 &= 255;
        } else {
            int i18 = i13 + 3;
            bArr[i15] = 48;
            i14 = i13 + 4;
            bArr[i18] = 48;
        }
        int i19 = i14 + 1;
        bArr[i14] = bArr2[i12 >> 4];
        int i22 = i14 + 2;
        bArr[i19] = bArr2[i12 & 15];
        return i22;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void B() throws IOException {
        if (!this.f413836f.e()) {
            a("Current context not Object but ".concat(this.f413836f.h()));
            throw null;
        }
        com.fasterxml.jackson.core.k kVar = this.f341039b;
        if (kVar != null) {
            kVar.f(this, this.f413836f.f341142b + 1);
        } else {
            if (this.f419873q >= this.f419874r) {
                t0();
            }
            byte[] bArr = this.f419872p;
            int i12 = this.f419873q;
            this.f419873q = i12 + 1;
            bArr[i12] = 125;
        }
        C44705e c44705e = this.f413836f;
        c44705e.f419837g = null;
        this.f413836f = c44705e.f419833c;
    }

    public final void B0() throws IOException {
        if (this.f419873q + 4 >= this.f419874r) {
            t0();
        }
        System.arraycopy(f419867x, 0, this.f419872p, this.f419873q, 4);
        this.f419873q += 4;
    }

    public final void D0(String str) throws IOException {
        int i12 = this.f419873q;
        int i13 = this.f419874r;
        if (i12 >= i13) {
            t0();
        }
        byte[] bArr = this.f419872p;
        int i14 = this.f419873q;
        this.f419873q = i14 + 1;
        byte b12 = this.f419871o;
        bArr[i14] = b12;
        X(str);
        if (this.f419873q >= i13) {
            t0();
        }
        byte[] bArr2 = this.f419872p;
        int i15 = this.f419873q;
        this.f419873q = i15 + 1;
        bArr2[i15] = b12;
    }

    public final void E0(int i12, int i13, String str) throws IOException {
        char cCharAt;
        int i14 = i13 + i12;
        int i15 = this.f419873q;
        byte[] bArr = this.f419872p;
        int[] iArr = this.f419822i;
        while (i12 < i14 && (cCharAt = str.charAt(i12)) <= 127 && iArr[cCharAt] == 0) {
            bArr[i15] = (byte) cCharAt;
            i12++;
            i15++;
        }
        this.f419873q = i15;
        if (i12 < i14) {
            int i16 = this.f419823j;
            int i17 = this.f419874r;
            if (i16 == 0) {
                if (H.b(i14, i12, 6, i15) > i17) {
                    t0();
                }
                int iU02 = this.f419873q;
                byte[] bArr2 = this.f419872p;
                int[] iArr2 = this.f419822i;
                while (i12 < i14) {
                    int i18 = i12 + 1;
                    char cCharAt2 = str.charAt(i12);
                    if (cCharAt2 <= 127) {
                        int i19 = iArr2[cCharAt2];
                        if (i19 == 0) {
                            bArr2[iU02] = (byte) cCharAt2;
                            i12 = i18;
                            iU02++;
                        } else if (i19 > 0) {
                            int i22 = iU02 + 1;
                            bArr2[iU02] = 92;
                            iU02 += 2;
                            bArr2[i22] = (byte) i19;
                        } else {
                            iU02 = A0(cCharAt2, iU02);
                        }
                    } else if (cCharAt2 <= 2047) {
                        int i23 = iU02 + 1;
                        bArr2[iU02] = (byte) ((cCharAt2 >> 6) | 192);
                        iU02 += 2;
                        bArr2[i23] = (byte) ((cCharAt2 & '?') | 128);
                    } else {
                        iU02 = u0(cCharAt2, iU02);
                    }
                    i12 = i18;
                }
                this.f419873q = iU02;
                return;
            }
            if (H.b(i14, i12, 6, i15) > i17) {
                t0();
            }
            int iU03 = this.f419873q;
            byte[] bArr3 = this.f419872p;
            int[] iArr3 = this.f419822i;
            int i24 = this.f419823j;
            while (i12 < i14) {
                int i25 = i12 + 1;
                char cCharAt3 = str.charAt(i12);
                if (cCharAt3 <= 127) {
                    int i26 = iArr3[cCharAt3];
                    if (i26 == 0) {
                        bArr3[iU03] = (byte) cCharAt3;
                        i12 = i25;
                        iU03++;
                    } else if (i26 > 0) {
                        int i27 = iU03 + 1;
                        bArr3[iU03] = 92;
                        iU03 += 2;
                        bArr3[i27] = (byte) i26;
                    } else {
                        iU03 = A0(cCharAt3, iU03);
                    }
                } else if (cCharAt3 > i24) {
                    iU03 = A0(cCharAt3, iU03);
                } else if (cCharAt3 <= 2047) {
                    int i28 = iU03 + 1;
                    bArr3[iU03] = (byte) ((cCharAt3 >> 6) | 192);
                    iU03 += 2;
                    bArr3[i28] = (byte) ((cCharAt3 & '?') | 128);
                } else {
                    iU03 = u0(cCharAt3, iU03);
                }
                i12 = i25;
            }
            this.f419873q = iU03;
        }
    }

    @Override // lX0.AbstractC43698a, com.fasterxml.jackson.core.JsonGenerator
    public final void F(l lVar) throws IOException {
        com.fasterxml.jackson.core.k kVar = this.f341039b;
        byte b12 = this.f419871o;
        int i12 = this.f419874r;
        if (kVar != null) {
            int iM2 = this.f413836f.m(lVar.getValue());
            if (iM2 == 4) {
                a("Can not write a field name, expecting a value");
                throw null;
            }
            if (iM2 == 1) {
                this.f341039b.k(this);
            } else {
                this.f341039b.i(this);
            }
            boolean z12 = this.f419825l;
            if (!z12) {
                if (this.f419873q >= i12) {
                    t0();
                }
                byte[] bArr = this.f419872p;
                int i13 = this.f419873q;
                this.f419873q = i13 + 1;
                bArr[i13] = b12;
            }
            int iD2 = lVar.d(this.f419873q, this.f419872p);
            if (iD2 < 0) {
                z0(lVar.f());
            } else {
                this.f419873q += iD2;
            }
            if (z12) {
                return;
            }
            if (this.f419873q >= i12) {
                t0();
            }
            byte[] bArr2 = this.f419872p;
            int i14 = this.f419873q;
            this.f419873q = i14 + 1;
            bArr2[i14] = b12;
            return;
        }
        int iM3 = this.f413836f.m(lVar.getValue());
        if (iM3 == 4) {
            a("Can not write a field name, expecting a value");
            throw null;
        }
        if (iM3 == 1) {
            if (this.f419873q >= i12) {
                t0();
            }
            byte[] bArr3 = this.f419872p;
            int i15 = this.f419873q;
            this.f419873q = i15 + 1;
            bArr3[i15] = 44;
        }
        if (this.f419825l) {
            int iD3 = lVar.d(this.f419873q, this.f419872p);
            if (iD3 < 0) {
                z0(lVar.f());
                return;
            } else {
                this.f419873q += iD3;
                return;
            }
        }
        if (this.f419873q >= i12) {
            t0();
        }
        byte[] bArr4 = this.f419872p;
        int i16 = this.f419873q;
        int i17 = i16 + 1;
        this.f419873q = i17;
        bArr4[i16] = b12;
        int iD4 = lVar.d(i17, bArr4);
        if (iD4 < 0) {
            z0(lVar.f());
        } else {
            this.f419873q += iD4;
        }
        if (this.f419873q >= i12) {
            t0();
        }
        byte[] bArr5 = this.f419872p;
        int i18 = this.f419873q;
        this.f419873q = i18 + 1;
        bArr5[i18] = b12;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void G(String str) throws IOException {
        com.fasterxml.jackson.core.k kVar = this.f341039b;
        byte b12 = this.f419871o;
        int i12 = this.f419877u;
        int i13 = this.f419875s;
        int i14 = 0;
        int i15 = this.f419874r;
        if (kVar != null) {
            int iM2 = this.f413836f.m(str);
            if (iM2 == 4) {
                a("Can not write a field name, expecting a value");
                throw null;
            }
            if (iM2 == 1) {
                this.f341039b.k(this);
            } else {
                this.f341039b.i(this);
            }
            if (this.f419825l) {
                H0(str, false);
                return;
            }
            int length = str.length();
            if (length > i12) {
                H0(str, true);
                return;
            }
            if (this.f419873q >= i15) {
                t0();
            }
            byte[] bArr = this.f419872p;
            int i16 = this.f419873q;
            this.f419873q = i16 + 1;
            bArr[i16] = b12;
            str.getChars(0, length, this.f419876t, 0);
            if (length <= i13) {
                if (this.f419873q + length > i15) {
                    t0();
                }
                G0(this.f419876t, 0, length);
            } else {
                J0(this.f419876t, 0, length);
            }
            if (this.f419873q >= i15) {
                t0();
            }
            byte[] bArr2 = this.f419872p;
            int i17 = this.f419873q;
            this.f419873q = i17 + 1;
            bArr2[i17] = b12;
            return;
        }
        int iM3 = this.f413836f.m(str);
        if (iM3 == 4) {
            a("Can not write a field name, expecting a value");
            throw null;
        }
        if (iM3 == 1) {
            if (this.f419873q >= i15) {
                t0();
            }
            byte[] bArr3 = this.f419872p;
            int i18 = this.f419873q;
            this.f419873q = i18 + 1;
            bArr3[i18] = 44;
        }
        if (this.f419825l) {
            H0(str, false);
            return;
        }
        int length2 = str.length();
        if (length2 > i12) {
            H0(str, true);
            return;
        }
        if (this.f419873q >= i15) {
            t0();
        }
        byte[] bArr4 = this.f419872p;
        int i19 = this.f419873q;
        int i22 = i19 + 1;
        this.f419873q = i22;
        bArr4[i19] = b12;
        if (length2 <= i13) {
            if (i22 + length2 > i15) {
                t0();
            }
            E0(0, length2, str);
        } else {
            do {
                int iMin = Math.min(i13, length2);
                if (this.f419873q + iMin > i15) {
                    t0();
                }
                E0(i14, iMin, str);
                i14 += iMin;
                length2 -= iMin;
            } while (length2 > 0);
        }
        if (this.f419873q >= i15) {
            t0();
        }
        byte[] bArr5 = this.f419872p;
        int i23 = this.f419873q;
        this.f419873q = i23 + 1;
        bArr5[i23] = b12;
    }

    public final void G0(char[] cArr, int i12, int i13) throws IOException {
        char c12;
        int i14 = i13 + i12;
        int i15 = this.f419873q;
        byte[] bArr = this.f419872p;
        int[] iArr = this.f419822i;
        while (i12 < i14 && (c12 = cArr[i12]) <= 127 && iArr[c12] == 0) {
            bArr[i15] = (byte) c12;
            i12++;
            i15++;
        }
        this.f419873q = i15;
        if (i12 < i14) {
            int i16 = this.f419823j;
            int i17 = this.f419874r;
            if (i16 == 0) {
                if (H.b(i14, i12, 6, i15) > i17) {
                    t0();
                }
                int iU02 = this.f419873q;
                byte[] bArr2 = this.f419872p;
                int[] iArr2 = this.f419822i;
                while (i12 < i14) {
                    int i18 = i12 + 1;
                    char c13 = cArr[i12];
                    if (c13 <= 127) {
                        int i19 = iArr2[c13];
                        if (i19 == 0) {
                            bArr2[iU02] = (byte) c13;
                            i12 = i18;
                            iU02++;
                        } else if (i19 > 0) {
                            int i22 = iU02 + 1;
                            bArr2[iU02] = 92;
                            iU02 += 2;
                            bArr2[i22] = (byte) i19;
                        } else {
                            iU02 = A0(c13, iU02);
                        }
                    } else if (c13 <= 2047) {
                        int i23 = iU02 + 1;
                        bArr2[iU02] = (byte) ((c13 >> 6) | 192);
                        iU02 += 2;
                        bArr2[i23] = (byte) ((c13 & '?') | 128);
                    } else {
                        iU02 = u0(c13, iU02);
                    }
                    i12 = i18;
                }
                this.f419873q = iU02;
                return;
            }
            if (H.b(i14, i12, 6, i15) > i17) {
                t0();
            }
            int iU03 = this.f419873q;
            byte[] bArr3 = this.f419872p;
            int[] iArr3 = this.f419822i;
            int i24 = this.f419823j;
            while (i12 < i14) {
                int i25 = i12 + 1;
                char c14 = cArr[i12];
                if (c14 <= 127) {
                    int i26 = iArr3[c14];
                    if (i26 == 0) {
                        bArr3[iU03] = (byte) c14;
                        i12 = i25;
                        iU03++;
                    } else if (i26 > 0) {
                        int i27 = iU03 + 1;
                        bArr3[iU03] = 92;
                        iU03 += 2;
                        bArr3[i27] = (byte) i26;
                    } else {
                        iU03 = A0(c14, iU03);
                    }
                } else if (c14 > i24) {
                    iU03 = A0(c14, iU03);
                } else if (c14 <= 2047) {
                    int i28 = iU03 + 1;
                    bArr3[iU03] = (byte) ((c14 >> 6) | 192);
                    iU03 += 2;
                    bArr3[i28] = (byte) ((c14 & '?') | 128);
                } else {
                    iU03 = u0(c14, iU03);
                }
                i12 = i25;
            }
            this.f419873q = iU03;
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void H() throws IOException {
        o0("write a null");
        B0();
    }

    public final void H0(String str, boolean z12) throws IOException {
        byte b12 = this.f419871o;
        int i12 = this.f419874r;
        if (z12) {
            if (this.f419873q >= i12) {
                t0();
            }
            byte[] bArr = this.f419872p;
            int i13 = this.f419873q;
            this.f419873q = i13 + 1;
            bArr[i13] = b12;
        }
        int length = str.length();
        int i14 = 0;
        while (length > 0) {
            int iMin = Math.min(this.f419875s, length);
            if (this.f419873q + iMin > i12) {
                t0();
            }
            E0(i14, iMin, str);
            i14 += iMin;
            length -= iMin;
        }
        if (z12) {
            if (this.f419873q >= i12) {
                t0();
            }
            byte[] bArr2 = this.f419872p;
            int i15 = this.f419873q;
            this.f419873q = i15 + 1;
            bArr2[i15] = b12;
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void I(double d12) throws IOException {
        if (!this.f413835e) {
            String str = com.fasterxml.jackson.core.io.k.f341181a;
            if ((!Double.isNaN(d12) && !Double.isInfinite(d12)) || !JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS.b(this.f413834d)) {
                o0("write a number");
                X(String.valueOf(d12));
                return;
            }
        }
        i0(String.valueOf(d12));
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void J(float f12) throws IOException {
        if (!this.f413835e) {
            String str = com.fasterxml.jackson.core.io.k.f341181a;
            if ((!Float.isNaN(f12) && !Float.isInfinite(f12)) || !JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS.b(this.f413834d)) {
                o0("write a number");
                X(String.valueOf(f12));
                return;
            }
        }
        i0(String.valueOf(f12));
    }

    public final void J0(char[] cArr, int i12, int i13) throws IOException {
        do {
            int iMin = Math.min(this.f419875s, i13);
            if (this.f419873q + iMin > this.f419874r) {
                t0();
            }
            G0(cArr, i12, iMin);
            i12 += iMin;
            i13 -= iMin;
        } while (i13 > 0);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void L(int i12) throws IOException {
        o0("write a number");
        int i13 = this.f419873q + 11;
        int i14 = this.f419874r;
        if (i13 >= i14) {
            t0();
        }
        if (!this.f413835e) {
            this.f419873q = com.fasterxml.jackson.core.io.k.g(i12, this.f419873q, this.f419872p);
            return;
        }
        if (this.f419873q + 13 >= i14) {
            t0();
        }
        byte[] bArr = this.f419872p;
        int i15 = this.f419873q;
        int i16 = i15 + 1;
        this.f419873q = i16;
        byte b12 = this.f419871o;
        bArr[i15] = b12;
        int iG2 = com.fasterxml.jackson.core.io.k.g(i12, i16, bArr);
        byte[] bArr2 = this.f419872p;
        this.f419873q = iG2 + 1;
        bArr2[iG2] = b12;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void M(long j12) throws IOException {
        o0("write a number");
        boolean z12 = this.f413835e;
        int i12 = this.f419874r;
        if (!z12) {
            if (this.f419873q + 21 >= i12) {
                t0();
            }
            this.f419873q = com.fasterxml.jackson.core.io.k.j(this.f419873q, this.f419872p, j12);
            return;
        }
        if (this.f419873q + 23 >= i12) {
            t0();
        }
        byte[] bArr = this.f419872p;
        int i13 = this.f419873q;
        int i14 = i13 + 1;
        this.f419873q = i14;
        byte b12 = this.f419871o;
        bArr[i13] = b12;
        int iJ2 = com.fasterxml.jackson.core.io.k.j(i14, bArr, j12);
        byte[] bArr2 = this.f419872p;
        this.f419873q = iJ2 + 1;
        bArr2[iJ2] = b12;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void N(String str) throws IOException {
        o0("write a number");
        if (str == null) {
            B0();
        } else if (this.f413835e) {
            D0(str);
        } else {
            X(str);
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void O(BigDecimal bigDecimal) throws IOException {
        o0("write a number");
        if (bigDecimal == null) {
            B0();
        } else if (this.f413835e) {
            D0(m0(bigDecimal));
        } else {
            X(m0(bigDecimal));
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void P(BigInteger bigInteger) throws IOException {
        o0("write a number");
        if (bigInteger == null) {
            B0();
        } else if (this.f413835e) {
            D0(bigInteger.toString());
        } else {
            X(bigInteger.toString());
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void Q(short s5) throws IOException {
        o0("write a number");
        int i12 = this.f419873q + 6;
        int i13 = this.f419874r;
        if (i12 >= i13) {
            t0();
        }
        if (!this.f413835e) {
            this.f419873q = com.fasterxml.jackson.core.io.k.g(s5, this.f419873q, this.f419872p);
            return;
        }
        if (this.f419873q + 8 >= i13) {
            t0();
        }
        byte[] bArr = this.f419872p;
        int i14 = this.f419873q;
        int i15 = i14 + 1;
        this.f419873q = i15;
        byte b12 = this.f419871o;
        bArr[i14] = b12;
        int iG2 = com.fasterxml.jackson.core.io.k.g(s5, i15, bArr);
        byte[] bArr2 = this.f419872p;
        this.f419873q = iG2 + 1;
        bArr2[iG2] = b12;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void U(char c12) throws IOException {
        if (this.f419873q + 3 >= this.f419874r) {
            t0();
        }
        byte[] bArr = this.f419872p;
        if (c12 <= 127) {
            int i12 = this.f419873q;
            this.f419873q = i12 + 1;
            bArr[i12] = (byte) c12;
        } else {
            if (c12 >= 2048) {
                v0(c12, 0, null, 0);
                return;
            }
            int i13 = this.f419873q;
            int i14 = i13 + 1;
            this.f419873q = i14;
            bArr[i13] = (byte) ((c12 >> 6) | 192);
            this.f419873q = i13 + 2;
            bArr[i14] = (byte) ((c12 & '?') | 128);
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void V(int i12, char[] cArr) throws IOException {
        int i13 = i12 + i12 + i12;
        int i14 = this.f419873q + i13;
        int iV02 = 0;
        int i15 = this.f419874r;
        if (i14 > i15) {
            if (i15 < i13) {
                byte[] bArr = this.f419872p;
                while (iV02 < i12) {
                    do {
                        char c12 = cArr[iV02];
                        if (c12 >= 128) {
                            if (this.f419873q + 3 >= i15) {
                                t0();
                            }
                            int iV03 = iV02 + 1;
                            char c13 = cArr[iV02];
                            if (c13 < 2048) {
                                int i16 = this.f419873q;
                                int i17 = i16 + 1;
                                this.f419873q = i17;
                                bArr[i16] = (byte) ((c13 >> 6) | 192);
                                this.f419873q = i16 + 2;
                                bArr[i17] = (byte) ((c13 & '?') | 128);
                            } else {
                                iV03 = v0(c13, iV03, cArr, i12);
                            }
                            iV02 = iV03;
                        } else {
                            if (this.f419873q >= i15) {
                                t0();
                            }
                            int i18 = this.f419873q;
                            this.f419873q = i18 + 1;
                            bArr[i18] = (byte) c12;
                            iV02++;
                        }
                    } while (iV02 < i12);
                    return;
                }
                return;
            }
            t0();
        }
        while (iV02 < i12) {
            do {
                char c14 = cArr[iV02];
                if (c14 > 127) {
                    iV02++;
                    if (c14 < 2048) {
                        byte[] bArr2 = this.f419872p;
                        int i19 = this.f419873q;
                        int i22 = i19 + 1;
                        this.f419873q = i22;
                        bArr2[i19] = (byte) ((c14 >> 6) | 192);
                        this.f419873q = i19 + 2;
                        bArr2[i22] = (byte) ((c14 & '?') | 128);
                    } else {
                        iV02 = v0(c14, iV02, cArr, i12);
                    }
                } else {
                    byte[] bArr3 = this.f419872p;
                    int i23 = this.f419873q;
                    this.f419873q = i23 + 1;
                    bArr3[i23] = (byte) c14;
                    iV02++;
                }
            } while (iV02 < i12);
            return;
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void W(l lVar) throws IOException {
        int iC2 = lVar.c(this.f419873q, this.f419872p);
        if (iC2 < 0) {
            z0(lVar.g());
        } else {
            this.f419873q += iC2;
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void X(String str) throws IOException {
        char c12;
        int length = str.length();
        char[] cArr = this.f419876t;
        if (length <= cArr.length) {
            str.getChars(0, length, cArr, 0);
            V(length, cArr);
            return;
        }
        int length2 = cArr.length;
        if (length <= length2) {
            str.getChars(0, length, cArr, 0);
            V(length, cArr);
            return;
        }
        int i12 = this.f419874r;
        int iMin = Math.min(length2, (i12 >> 2) + (i12 >> 4));
        int i13 = iMin * 3;
        int i14 = 0;
        while (length > 0) {
            int iMin2 = Math.min(iMin, length);
            str.getChars(i14, i14 + iMin2, cArr, 0);
            if (this.f419873q + i13 > i12) {
                t0();
            }
            if (iMin2 > 1 && (c12 = cArr[iMin2 - 1]) >= 55296 && c12 <= 56319) {
                iMin2--;
            }
            int iV02 = 0;
            while (iV02 < iMin2) {
                do {
                    char c13 = cArr[iV02];
                    if (c13 > 127) {
                        iV02++;
                        if (c13 < 2048) {
                            byte[] bArr = this.f419872p;
                            int i15 = this.f419873q;
                            int i16 = i15 + 1;
                            this.f419873q = i16;
                            bArr[i15] = (byte) ((c13 >> 6) | 192);
                            this.f419873q = i15 + 2;
                            bArr[i16] = (byte) ((c13 & '?') | 128);
                        } else {
                            iV02 = v0(c13, iV02, cArr, iMin2);
                        }
                    } else {
                        byte[] bArr2 = this.f419872p;
                        int i17 = this.f419873q;
                        this.f419873q = i17 + 1;
                        bArr2[i17] = (byte) c13;
                        iV02++;
                    }
                } while (iV02 < iMin2);
                i14 += iMin2;
                length -= iMin2;
            }
            i14 += iMin2;
            length -= iMin2;
        }
    }

    @Override // lX0.AbstractC43698a, com.fasterxml.jackson.core.JsonGenerator
    public final void Y(l lVar) throws IOException {
        o0("write a raw (unencoded) value");
        int iC2 = lVar.c(this.f419873q, this.f419872p);
        if (iC2 < 0) {
            z0(lVar.g());
        } else {
            this.f419873q += iC2;
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void a0() throws IOException {
        o0("start an array");
        this.f413836f = this.f413836f.i();
        com.fasterxml.jackson.core.k kVar = this.f341039b;
        if (kVar != null) {
            kVar.d(this);
            return;
        }
        if (this.f419873q >= this.f419874r) {
            t0();
        }
        byte[] bArr = this.f419872p;
        int i12 = this.f419873q;
        this.f419873q = i12 + 1;
        bArr[i12] = 91;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void b0(int i12, Object obj) throws IOException {
        o0("start an array");
        this.f413836f = this.f413836f.j(obj);
        com.fasterxml.jackson.core.k kVar = this.f341039b;
        if (kVar != null) {
            kVar.d(this);
            return;
        }
        if (this.f419873q >= this.f419874r) {
            t0();
        }
        byte[] bArr = this.f419872p;
        int i13 = this.f419873q;
        this.f419873q = i13 + 1;
        bArr[i13] = 91;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void c0(Object obj) throws IOException {
        o0("start an array");
        this.f413836f = this.f413836f.j(obj);
        com.fasterxml.jackson.core.k kVar = this.f341039b;
        if (kVar != null) {
            kVar.d(this);
            return;
        }
        if (this.f419873q >= this.f419874r) {
            t0();
        }
        byte[] bArr = this.f419872p;
        int i12 = this.f419873q;
        this.f419873q = i12 + 1;
        bArr[i12] = 91;
    }

    @Override // lX0.AbstractC43698a, com.fasterxml.jackson.core.JsonGenerator, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f419872p != null && i(JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT)) {
            while (true) {
                C44705e c44705e = this.f413836f;
                if (!c44705e.d()) {
                    if (!c44705e.e()) {
                        break;
                    } else {
                        B();
                    }
                } else {
                    A();
                }
            }
        }
        t0();
        this.f419873q = 0;
        com.fasterxml.jackson.core.io.f fVar = this.f419821h;
        OutputStream outputStream = this.f419870n;
        if (outputStream != null) {
            if (fVar.f341163d || i(JsonGenerator.Feature.AUTO_CLOSE_TARGET)) {
                outputStream.close();
            } else if (i(JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM)) {
                outputStream.flush();
            }
        }
        byte[] bArr = this.f419872p;
        if (bArr != null && this.f419878v) {
            this.f419872p = null;
            byte[] bArr2 = fVar.f341166g;
            if (bArr != bArr2 && bArr.length < bArr2.length) {
                throw new IllegalArgumentException("Trying to release buffer smaller than original");
            }
            fVar.f341166g = null;
            fVar.f341164e.f341279a.set(1, bArr);
        }
        char[] cArr = this.f419876t;
        if (cArr != null) {
            this.f419876t = null;
            char[] cArr2 = fVar.f341169j;
            if (cArr != cArr2 && cArr.length < cArr2.length) {
                throw new IllegalArgumentException("Trying to release buffer smaller than original");
            }
            fVar.f341169j = null;
            fVar.f341164e.f341280b.set(1, cArr);
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void e0() throws IOException {
        o0("start an object");
        this.f413836f = this.f413836f.k();
        com.fasterxml.jackson.core.k kVar = this.f341039b;
        if (kVar != null) {
            kVar.h(this);
            return;
        }
        if (this.f419873q >= this.f419874r) {
            t0();
        }
        byte[] bArr = this.f419872p;
        int i12 = this.f419873q;
        this.f419873q = i12 + 1;
        bArr[i12] = 123;
    }

    @Override // lX0.AbstractC43698a, com.fasterxml.jackson.core.JsonGenerator
    public final void f0(Object obj) throws IOException {
        o0("start an object");
        this.f413836f = this.f413836f.l(obj);
        com.fasterxml.jackson.core.k kVar = this.f341039b;
        if (kVar != null) {
            kVar.h(this);
            return;
        }
        if (this.f419873q >= this.f419874r) {
            t0();
        }
        byte[] bArr = this.f419872p;
        int i12 = this.f419873q;
        this.f419873q = i12 + 1;
        bArr[i12] = 123;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator, java.io.Flushable
    public final void flush() throws IOException {
        t0();
        OutputStream outputStream = this.f419870n;
        if (outputStream == null || !i(JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM)) {
            return;
        }
        outputStream.flush();
    }

    @Override // lX0.AbstractC43698a, com.fasterxml.jackson.core.JsonGenerator
    public final void h0(l lVar) throws IOException {
        o0("write a string");
        int i12 = this.f419873q;
        int i13 = this.f419874r;
        if (i12 >= i13) {
            t0();
        }
        byte[] bArr = this.f419872p;
        int i14 = this.f419873q;
        int i15 = i14 + 1;
        this.f419873q = i15;
        byte b12 = this.f419871o;
        bArr[i14] = b12;
        int iD2 = lVar.d(i15, bArr);
        if (iD2 < 0) {
            z0(lVar.f());
        } else {
            this.f419873q += iD2;
        }
        if (this.f419873q >= i13) {
            t0();
        }
        byte[] bArr2 = this.f419872p;
        int i16 = this.f419873q;
        this.f419873q = i16 + 1;
        bArr2[i16] = b12;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void i0(String str) throws IOException {
        o0("write a string");
        if (str == null) {
            B0();
            return;
        }
        int length = str.length();
        if (length > this.f419875s) {
            H0(str, true);
            return;
        }
        int i12 = this.f419873q + length;
        int i13 = this.f419874r;
        if (i12 >= i13) {
            t0();
        }
        byte[] bArr = this.f419872p;
        int i14 = this.f419873q;
        this.f419873q = i14 + 1;
        byte b12 = this.f419871o;
        bArr[i14] = b12;
        E0(0, length, str);
        if (this.f419873q >= i13) {
            t0();
        }
        byte[] bArr2 = this.f419872p;
        int i15 = this.f419873q;
        this.f419873q = i15 + 1;
        bArr2[i15] = b12;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void j0(char[] cArr, int i12, int i13) throws IOException {
        o0("write a string");
        int i14 = this.f419873q;
        int i15 = this.f419874r;
        if (i14 >= i15) {
            t0();
        }
        byte[] bArr = this.f419872p;
        int i16 = this.f419873q;
        int i17 = i16 + 1;
        this.f419873q = i17;
        byte b12 = this.f419871o;
        bArr[i16] = b12;
        if (i13 <= this.f419875s) {
            if (i17 + i13 > i15) {
                t0();
            }
            G0(cArr, i12, i13);
        } else {
            J0(cArr, i12, i13);
        }
        if (this.f419873q >= i15) {
            t0();
        }
        byte[] bArr2 = this.f419872p;
        int i18 = this.f419873q;
        this.f419873q = i18 + 1;
        bArr2[i18] = b12;
    }

    @Override // lX0.AbstractC43698a
    public final void o0(String str) throws IOException {
        byte b12;
        int iN2 = this.f413836f.n();
        if (this.f341039b != null) {
            s0(iN2, str);
            return;
        }
        if (iN2 == 1) {
            b12 = 44;
        } else {
            if (iN2 != 2) {
                if (iN2 != 3) {
                    if (iN2 != 5) {
                        return;
                    }
                    r0(str);
                    throw null;
                }
                n nVar = this.f419824k;
                if (nVar != null) {
                    byte[] bArrG = nVar.g();
                    if (bArrG.length > 0) {
                        z0(bArrG);
                        return;
                    }
                    return;
                }
                return;
            }
            b12 = 58;
        }
        if (this.f419873q >= this.f419874r) {
            t0();
        }
        byte[] bArr = this.f419872p;
        int i12 = this.f419873q;
        this.f419873q = i12 + 1;
        bArr[i12] = b12;
    }

    public final void t0() throws IOException {
        int i12 = this.f419873q;
        if (i12 > 0) {
            this.f419873q = 0;
            this.f419870n.write(this.f419872p, 0, i12);
        }
    }

    @Override // lX0.AbstractC43698a, com.fasterxml.jackson.core.JsonGenerator
    public final int u(Base64Variant base64Variant, InputStream inputStream, int i12) throws IOException {
        o0("write a binary value");
        int i13 = this.f419873q;
        int i14 = this.f419874r;
        if (i13 >= i14) {
            t0();
        }
        byte[] bArr = this.f419872p;
        int i15 = this.f419873q;
        this.f419873q = i15 + 1;
        byte b12 = this.f419871o;
        bArr[i15] = b12;
        com.fasterxml.jackson.core.io.f fVar = this.f419821h;
        byte[] bArrB = fVar.b();
        try {
            if (i12 < 0) {
                i12 = x0(base64Variant, inputStream, bArrB);
            } else {
                int iY02 = y0(base64Variant, inputStream, bArrB, i12);
                if (iY02 > 0) {
                    a("Too few bytes available: missing " + iY02 + " bytes (out of " + i12 + ")");
                    throw null;
                }
            }
            fVar.d(bArrB);
            if (this.f419873q >= i14) {
                t0();
            }
            byte[] bArr2 = this.f419872p;
            int i16 = this.f419873q;
            this.f419873q = i16 + 1;
            bArr2[i16] = b12;
            return i12;
        } catch (Throwable th2) {
            fVar.d(bArrB);
            throw th2;
        }
    }

    public final int u0(int i12, int i13) {
        byte[] bArr = this.f419872p;
        if (i12 < 55296 || i12 > 57343) {
            bArr[i13] = (byte) ((i12 >> 12) | 224);
            int i14 = i13 + 2;
            bArr[i13 + 1] = (byte) (((i12 >> 6) & 63) | 128);
            int i15 = i13 + 3;
            bArr[i14] = (byte) ((i12 & 63) | 128);
            return i15;
        }
        bArr[i13] = 92;
        bArr[i13 + 1] = 117;
        byte[] bArr2 = f419866w;
        bArr[i13 + 2] = bArr2[(i12 >> 12) & 15];
        bArr[i13 + 3] = bArr2[(i12 >> 8) & 15];
        int i16 = i13 + 5;
        bArr[i13 + 4] = bArr2[(i12 >> 4) & 15];
        int i17 = i13 + 6;
        bArr[i16] = bArr2[i12 & 15];
        return i17;
    }

    public final int v0(int i12, int i13, char[] cArr, int i14) throws IOException {
        if (i12 < 55296 || i12 > 57343) {
            byte[] bArr = this.f419872p;
            int i15 = this.f419873q;
            int i16 = i15 + 1;
            this.f419873q = i16;
            bArr[i15] = (byte) ((i12 >> 12) | 224);
            int i17 = i15 + 2;
            this.f419873q = i17;
            bArr[i16] = (byte) (((i12 >> 6) & 63) | 128);
            this.f419873q = i15 + 3;
            bArr[i17] = (byte) ((i12 & 63) | 128);
            return i13;
        }
        if (i13 >= i14 || cArr == null) {
            a(String.format("Split surrogate on writeRaw() input (last character): first character 0x%4x", Integer.valueOf(i12)));
            throw null;
        }
        char c12 = cArr[i13];
        if (c12 < 56320 || c12 > 57343) {
            a(String.format("Incomplete surrogate pair: first char 0x%04X, second 0x%04X", Integer.valueOf(i12), Integer.valueOf(c12)));
            throw null;
        }
        int i18 = (c12 - 56320) + ((i12 - 55296) << 10) + AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR;
        if (this.f419873q + 4 > this.f419874r) {
            t0();
        }
        byte[] bArr2 = this.f419872p;
        int i19 = this.f419873q;
        int i22 = i19 + 1;
        this.f419873q = i22;
        bArr2[i19] = (byte) ((i18 >> 18) | 240);
        int i23 = i19 + 2;
        this.f419873q = i23;
        bArr2[i22] = (byte) (((i18 >> 12) & 63) | 128);
        int i24 = i19 + 3;
        this.f419873q = i24;
        bArr2[i23] = (byte) (((i18 >> 6) & 63) | 128);
        this.f419873q = i19 + 4;
        bArr2[i24] = (byte) ((i18 & 63) | 128);
        return i13 + 1;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void x(Base64Variant base64Variant, byte[] bArr, int i12, int i13) throws IOException {
        int iF2;
        o0("write a binary value");
        int i14 = this.f419873q;
        int i15 = this.f419874r;
        if (i14 >= i15) {
            t0();
        }
        byte[] bArr2 = this.f419872p;
        int i16 = this.f419873q;
        this.f419873q = i16 + 1;
        byte b12 = this.f419871o;
        bArr2[i16] = b12;
        int i17 = i13 + i12;
        int i18 = i17 - 3;
        int i19 = i15 - 6;
        int i22 = base64Variant.f341007g;
        loop0: while (true) {
            int i23 = i22 >> 2;
            while (i12 <= i18) {
                if (this.f419873q > i19) {
                    t0();
                }
                int i24 = i12 + 2;
                int i25 = ((bArr[i12 + 1] & 255) | (bArr[i12] << 8)) << 8;
                i12 += 3;
                iF2 = base64Variant.f(i25 | (bArr[i24] & 255), this.f419873q, this.f419872p);
                this.f419873q = iF2;
                i23--;
                if (i23 <= 0) {
                    break;
                }
            }
            byte[] bArr3 = this.f419872p;
            int i26 = iF2 + 1;
            this.f419873q = i26;
            bArr3[iF2] = 92;
            this.f419873q = iF2 + 2;
            bArr3[i26] = 110;
            i22 = base64Variant.f341007g;
        }
        int i27 = i17 - i12;
        if (i27 > 0) {
            if (this.f419873q > i19) {
                t0();
            }
            int i28 = i12 + 1;
            int i29 = bArr[i12] << 16;
            if (i27 == 2) {
                i29 |= (bArr[i28] & 255) << 8;
            }
            this.f419873q = base64Variant.h(i29, i27, this.f419873q, this.f419872p);
        }
        if (this.f419873q >= i15) {
            t0();
        }
        byte[] bArr4 = this.f419872p;
        int i32 = this.f419873q;
        this.f419873q = i32 + 1;
        bArr4[i32] = b12;
    }

    public final int x0(Base64Variant base64Variant, InputStream inputStream, byte[] bArr) throws IOException {
        int i12 = this.f419874r - 6;
        int i13 = 2;
        int i14 = base64Variant.f341007g >> 2;
        int i15 = -3;
        int i16 = 0;
        int iW02 = 0;
        int i17 = 0;
        while (true) {
            if (i16 > i15) {
                iW02 = w0(inputStream, bArr, i16, iW02, bArr.length);
                if (iW02 < 3) {
                    break;
                }
                i15 = iW02 - 3;
                i16 = 0;
            }
            if (this.f419873q > i12) {
                t0();
            }
            int i18 = i16 + 2;
            int i19 = ((bArr[i16 + 1] & 255) | (bArr[i16] << 8)) << 8;
            i16 += 3;
            i17 += 3;
            int iF2 = base64Variant.f((bArr[i18] & 255) | i19, this.f419873q, this.f419872p);
            this.f419873q = iF2;
            i14--;
            if (i14 <= 0) {
                byte[] bArr2 = this.f419872p;
                int i22 = iF2 + 1;
                this.f419873q = i22;
                bArr2[iF2] = 92;
                this.f419873q = iF2 + 2;
                bArr2[i22] = 110;
                i14 = base64Variant.f341007g >> 2;
            }
        }
        if (iW02 <= 0) {
            return i17;
        }
        if (this.f419873q > i12) {
            t0();
        }
        int i23 = bArr[0] << 16;
        if (1 < iW02) {
            i23 |= (bArr[1] & 255) << 8;
        } else {
            i13 = 1;
        }
        int i24 = i17 + i13;
        this.f419873q = base64Variant.h(i23, i13, this.f419873q, this.f419872p);
        return i24;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void y(boolean z12) throws IOException {
        o0("write a boolean value");
        if (this.f419873q + 5 >= this.f419874r) {
            t0();
        }
        byte[] bArr = z12 ? f419868y : f419869z;
        int length = bArr.length;
        System.arraycopy(bArr, 0, this.f419872p, this.f419873q, length);
        this.f419873q += length;
    }

    public final int y0(Base64Variant base64Variant, InputStream inputStream, byte[] bArr, int i12) throws IOException {
        int iW02;
        int i13 = this.f419874r - 6;
        int i14 = 2;
        int i15 = base64Variant.f341007g >> 2;
        int i16 = -3;
        int i17 = 0;
        int iW03 = 0;
        while (true) {
            if (i12 <= 2) {
                break;
            }
            if (i17 > i16) {
                iW03 = w0(inputStream, bArr, i17, iW03, i12);
                if (iW03 < 3) {
                    i17 = 0;
                    break;
                }
                i16 = iW03 - 3;
                i17 = 0;
            }
            if (this.f419873q > i13) {
                t0();
            }
            int i18 = i17 + 2;
            int i19 = ((bArr[i17 + 1] & 255) | (bArr[i17] << 8)) << 8;
            i17 += 3;
            i12 -= 3;
            int iF2 = base64Variant.f((bArr[i18] & 255) | i19, this.f419873q, this.f419872p);
            this.f419873q = iF2;
            i15--;
            if (i15 <= 0) {
                byte[] bArr2 = this.f419872p;
                int i22 = iF2 + 1;
                this.f419873q = i22;
                bArr2[iF2] = 92;
                this.f419873q = iF2 + 2;
                bArr2[i22] = 110;
                i15 = base64Variant.f341007g >> 2;
            }
        }
        if (i12 <= 0 || (iW02 = w0(inputStream, bArr, i17, iW03, i12)) <= 0) {
            return i12;
        }
        if (this.f419873q > i13) {
            t0();
        }
        int i23 = bArr[0] << 16;
        if (1 < iW02) {
            i23 |= (bArr[1] & 255) << 8;
        } else {
            i14 = 1;
        }
        this.f419873q = base64Variant.h(i23, i14, this.f419873q, this.f419872p);
        return i12 - i14;
    }

    public final void z0(byte[] bArr) throws IOException {
        int length = bArr.length;
        if (this.f419873q + length > this.f419874r) {
            t0();
            if (length > 512) {
                this.f419870n.write(bArr, 0, length);
                return;
            }
        }
        System.arraycopy(bArr, 0, this.f419872p, this.f419873q, length);
        this.f419873q += length;
    }
}
