package oX0;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.io.n;
import com.fasterxml.jackson.core.l;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.io.InputStream;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;

/* compiled from: WriterBasedJsonGenerator.java */
/* renamed from: oX0.k, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C44711k extends AbstractC44703c {

    /* renamed from: v, reason: collision with root package name */
    public static final char[] f419899v = (char[]) com.fasterxml.jackson.core.io.b.f341144a.clone();

    /* renamed from: n, reason: collision with root package name */
    public final Writer f419900n;

    /* renamed from: o, reason: collision with root package name */
    public final char f419901o;

    /* renamed from: p, reason: collision with root package name */
    public char[] f419902p;

    /* renamed from: q, reason: collision with root package name */
    public int f419903q;

    /* renamed from: r, reason: collision with root package name */
    public int f419904r;

    /* renamed from: s, reason: collision with root package name */
    public final int f419905s;

    /* renamed from: t, reason: collision with root package name */
    public char[] f419906t;

    /* renamed from: u, reason: collision with root package name */
    public l f419907u;

    public C44711k(com.fasterxml.jackson.core.io.f fVar, int i12, ObjectMapper objectMapper, Writer writer, char c12) {
        super(fVar, i12, objectMapper);
        this.f419900n = writer;
        com.fasterxml.jackson.core.io.f.a(fVar.f341169j);
        char[] cArrB = fVar.f341164e.b(1, 0);
        fVar.f341169j = cArrB;
        this.f419902p = cArrB;
        this.f419905s = cArrB.length;
        this.f419901o = c12;
        if (c12 != '\"') {
            this.f419822i = com.fasterxml.jackson.core.io.b.a(c12);
        }
    }

    public static int y0(InputStream inputStream, byte[] bArr, int i12, int i13, int i14) throws IOException {
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
            if (this.f419904r >= this.f419905s) {
                v0();
            }
            char[] cArr = this.f419902p;
            int i12 = this.f419904r;
            this.f419904r = i12 + 1;
            cArr[i12] = ']';
        }
        C44705e c44705e = this.f413836f;
        c44705e.f419837g = null;
        this.f413836f = c44705e.f419833c;
    }

    public final int A0(Base64Variant base64Variant, InputStream inputStream, byte[] bArr, int i12) throws IOException {
        int iY02;
        int i13 = this.f419905s - 6;
        int i14 = 2;
        int i15 = base64Variant.f341007g >> 2;
        int i16 = -3;
        int i17 = 0;
        int iY03 = 0;
        while (true) {
            if (i12 <= 2) {
                break;
            }
            if (i17 > i16) {
                iY03 = y0(inputStream, bArr, i17, iY03, i12);
                if (iY03 < 3) {
                    i17 = 0;
                    break;
                }
                i16 = iY03 - 3;
                i17 = 0;
            }
            if (this.f419904r > i13) {
                v0();
            }
            int i18 = i17 + 2;
            int i19 = ((bArr[i17 + 1] & 255) | (bArr[i17] << 8)) << 8;
            i17 += 3;
            i12 -= 3;
            int iG2 = base64Variant.g(this.f419902p, (bArr[i18] & 255) | i19, this.f419904r);
            this.f419904r = iG2;
            i15--;
            if (i15 <= 0) {
                char[] cArr = this.f419902p;
                int i22 = iG2 + 1;
                this.f419904r = i22;
                cArr[iG2] = '\\';
                this.f419904r = iG2 + 2;
                cArr[i22] = 'n';
                i15 = base64Variant.f341007g >> 2;
            }
        }
        if (i12 <= 0 || (iY02 = y0(inputStream, bArr, i17, iY03, i12)) <= 0) {
            return i12;
        }
        if (this.f419904r > i13) {
            v0();
        }
        int i23 = bArr[0] << 16;
        if (1 < iY02) {
            i23 |= (bArr[1] & 255) << 8;
        } else {
            i14 = 1;
        }
        this.f419904r = base64Variant.i(i23, i14, this.f419902p, this.f419904r);
        return i12 - i14;
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
            if (this.f419904r >= this.f419905s) {
                v0();
            }
            char[] cArr = this.f419902p;
            int i12 = this.f419904r;
            this.f419904r = i12 + 1;
            cArr[i12] = '}';
        }
        C44705e c44705e = this.f413836f;
        c44705e.f419837g = null;
        this.f413836f = c44705e.f419833c;
    }

    public final void B0() throws IOException {
        if (this.f419904r + 4 >= this.f419905s) {
            v0();
        }
        int i12 = this.f419904r;
        char[] cArr = this.f419902p;
        cArr[i12] = 'n';
        cArr[i12 + 1] = 'u';
        cArr[i12 + 2] = 'l';
        cArr[i12 + 3] = 'l';
        this.f419904r = i12 + 4;
    }

    public final void D0(String str) throws IOException {
        int i12 = this.f419904r;
        int i13 = this.f419905s;
        if (i12 >= i13) {
            v0();
        }
        char[] cArr = this.f419902p;
        int i14 = this.f419904r;
        this.f419904r = i14 + 1;
        char c12 = this.f419901o;
        cArr[i14] = c12;
        X(str);
        if (this.f419904r >= i13) {
            v0();
        }
        char[] cArr2 = this.f419902p;
        int i15 = this.f419904r;
        this.f419904r = i15 + 1;
        cArr2[i15] = c12;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x00e8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void E0(java.lang.String r20) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: oX0.C44711k.E0(java.lang.String):void");
    }

    @Override // lX0.AbstractC43698a, com.fasterxml.jackson.core.JsonGenerator
    public final void F(l lVar) throws IOException {
        int iM2 = this.f413836f.m(lVar.getValue());
        if (iM2 == 4) {
            a("Can not write a field name, expecting a value");
            throw null;
        }
        boolean z12 = iM2 == 1;
        com.fasterxml.jackson.core.k kVar = this.f341039b;
        char c12 = this.f419901o;
        int i12 = this.f419905s;
        if (kVar != null) {
            if (z12) {
                kVar.k(this);
            } else {
                kVar.i(this);
            }
            char[] cArrA = lVar.a();
            if (this.f419825l) {
                V(cArrA.length, cArrA);
                return;
            }
            if (this.f419904r >= i12) {
                v0();
            }
            char[] cArr = this.f419902p;
            int i13 = this.f419904r;
            this.f419904r = i13 + 1;
            cArr[i13] = c12;
            V(cArrA.length, cArrA);
            if (this.f419904r >= i12) {
                v0();
            }
            char[] cArr2 = this.f419902p;
            int i14 = this.f419904r;
            this.f419904r = i14 + 1;
            cArr2[i14] = c12;
            return;
        }
        if (this.f419904r + 1 >= i12) {
            v0();
        }
        if (z12) {
            char[] cArr3 = this.f419902p;
            int i15 = this.f419904r;
            this.f419904r = i15 + 1;
            cArr3[i15] = ',';
        }
        if (this.f419825l) {
            char[] cArrA2 = lVar.a();
            V(cArrA2.length, cArrA2);
            return;
        }
        char[] cArr4 = this.f419902p;
        int i16 = this.f419904r;
        int i17 = i16 + 1;
        this.f419904r = i17;
        cArr4[i16] = c12;
        int iB2 = lVar.b(i17, cArr4);
        if (iB2 < 0) {
            char[] cArrA3 = lVar.a();
            V(cArrA3.length, cArrA3);
            if (this.f419904r >= i12) {
                v0();
            }
            char[] cArr5 = this.f419902p;
            int i18 = this.f419904r;
            this.f419904r = i18 + 1;
            cArr5[i18] = c12;
            return;
        }
        int i19 = this.f419904r + iB2;
        this.f419904r = i19;
        if (i19 >= i12) {
            v0();
        }
        char[] cArr6 = this.f419902p;
        int i22 = this.f419904r;
        this.f419904r = i22 + 1;
        cArr6[i22] = c12;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void G(String str) throws IOException {
        int iM2 = this.f413836f.m(str);
        if (iM2 == 4) {
            a("Can not write a field name, expecting a value");
            throw null;
        }
        boolean z12 = iM2 == 1;
        com.fasterxml.jackson.core.k kVar = this.f341039b;
        char c12 = this.f419901o;
        int i12 = this.f419905s;
        if (kVar != null) {
            if (z12) {
                kVar.k(this);
            } else {
                kVar.i(this);
            }
            if (this.f419825l) {
                E0(str);
                return;
            }
            if (this.f419904r >= i12) {
                v0();
            }
            char[] cArr = this.f419902p;
            int i13 = this.f419904r;
            this.f419904r = i13 + 1;
            cArr[i13] = c12;
            E0(str);
            if (this.f419904r >= i12) {
                v0();
            }
            char[] cArr2 = this.f419902p;
            int i14 = this.f419904r;
            this.f419904r = i14 + 1;
            cArr2[i14] = c12;
            return;
        }
        if (this.f419904r + 1 >= i12) {
            v0();
        }
        if (z12) {
            char[] cArr3 = this.f419902p;
            int i15 = this.f419904r;
            this.f419904r = i15 + 1;
            cArr3[i15] = ',';
        }
        if (this.f419825l) {
            E0(str);
            return;
        }
        char[] cArr4 = this.f419902p;
        int i16 = this.f419904r;
        this.f419904r = i16 + 1;
        cArr4[i16] = c12;
        E0(str);
        if (this.f419904r >= i12) {
            v0();
        }
        char[] cArr5 = this.f419902p;
        int i17 = this.f419904r;
        this.f419904r = i17 + 1;
        cArr5[i17] = c12;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void H() throws IOException {
        o0("write a null");
        B0();
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void I(double d12) throws IOException {
        if (!this.f413835e) {
            String str = com.fasterxml.jackson.core.io.k.f341181a;
            if ((!Double.isNaN(d12) && !Double.isInfinite(d12)) || !i(JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS)) {
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
            if ((!Float.isNaN(f12) && !Float.isInfinite(f12)) || !i(JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS)) {
                o0("write a number");
                X(String.valueOf(f12));
                return;
            }
        }
        i0(String.valueOf(f12));
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void L(int i12) throws IOException {
        o0("write a number");
        boolean z12 = this.f413835e;
        int i13 = this.f419905s;
        if (!z12) {
            if (this.f419904r + 11 >= i13) {
                v0();
            }
            this.f419904r = com.fasterxml.jackson.core.io.k.h(this.f419902p, i12, this.f419904r);
            return;
        }
        if (this.f419904r + 13 >= i13) {
            v0();
        }
        char[] cArr = this.f419902p;
        int i14 = this.f419904r;
        int i15 = i14 + 1;
        this.f419904r = i15;
        char c12 = this.f419901o;
        cArr[i14] = c12;
        int iH2 = com.fasterxml.jackson.core.io.k.h(cArr, i12, i15);
        char[] cArr2 = this.f419902p;
        this.f419904r = iH2 + 1;
        cArr2[iH2] = c12;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void M(long j12) throws IOException {
        o0("write a number");
        boolean z12 = this.f413835e;
        int i12 = this.f419905s;
        if (!z12) {
            if (this.f419904r + 21 >= i12) {
                v0();
            }
            this.f419904r = com.fasterxml.jackson.core.io.k.i(this.f419904r, j12, this.f419902p);
            return;
        }
        if (this.f419904r + 23 >= i12) {
            v0();
        }
        char[] cArr = this.f419902p;
        int i13 = this.f419904r;
        int i14 = i13 + 1;
        this.f419904r = i14;
        char c12 = this.f419901o;
        cArr[i13] = c12;
        int i15 = com.fasterxml.jackson.core.io.k.i(i14, j12, cArr);
        char[] cArr2 = this.f419902p;
        this.f419904r = i15 + 1;
        cArr2[i15] = c12;
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
        boolean z12 = this.f413835e;
        int i12 = this.f419905s;
        if (!z12) {
            if (this.f419904r + 6 >= i12) {
                v0();
            }
            this.f419904r = com.fasterxml.jackson.core.io.k.h(this.f419902p, s5, this.f419904r);
            return;
        }
        if (this.f419904r + 8 >= i12) {
            v0();
        }
        char[] cArr = this.f419902p;
        int i13 = this.f419904r;
        int i14 = i13 + 1;
        this.f419904r = i14;
        char c12 = this.f419901o;
        cArr[i13] = c12;
        int iH2 = com.fasterxml.jackson.core.io.k.h(cArr, s5, i14);
        char[] cArr2 = this.f419902p;
        this.f419904r = iH2 + 1;
        cArr2[iH2] = c12;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void U(char c12) throws IOException {
        if (this.f419904r >= this.f419905s) {
            v0();
        }
        char[] cArr = this.f419902p;
        int i12 = this.f419904r;
        this.f419904r = i12 + 1;
        cArr[i12] = c12;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void V(int i12, char[] cArr) throws IOException {
        if (i12 >= 32) {
            v0();
            this.f419900n.write(cArr, 0, i12);
        } else {
            if (i12 > this.f419905s - this.f419904r) {
                v0();
            }
            System.arraycopy(cArr, 0, this.f419902p, this.f419904r, i12);
            this.f419904r += i12;
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void W(l lVar) throws IOException {
        int iE2 = lVar.e(this.f419904r, this.f419902p);
        if (iE2 < 0) {
            X(lVar.getValue());
        } else {
            this.f419904r += iE2;
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void X(String str) throws IOException {
        int length = str.length();
        int i12 = this.f419904r;
        int i13 = this.f419905s;
        int i14 = i13 - i12;
        if (i14 == 0) {
            v0();
            i14 = i13 - this.f419904r;
        }
        if (i14 >= length) {
            str.getChars(0, length, this.f419902p, this.f419904r);
            this.f419904r += length;
            return;
        }
        int i15 = this.f419904r;
        int i16 = i13 - i15;
        str.getChars(0, i16, this.f419902p, i15);
        this.f419904r += i16;
        v0();
        int length2 = str.length() - i16;
        while (length2 > i13) {
            int i17 = i16 + i13;
            str.getChars(i16, i17, this.f419902p, 0);
            this.f419903q = 0;
            this.f419904r = i13;
            v0();
            length2 -= i13;
            i16 = i17;
        }
        str.getChars(i16, i16 + length2, this.f419902p, 0);
        this.f419903q = 0;
        this.f419904r = length2;
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
        if (this.f419904r >= this.f419905s) {
            v0();
        }
        char[] cArr = this.f419902p;
        int i12 = this.f419904r;
        this.f419904r = i12 + 1;
        cArr[i12] = '[';
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
        if (this.f419904r >= this.f419905s) {
            v0();
        }
        char[] cArr = this.f419902p;
        int i13 = this.f419904r;
        this.f419904r = i13 + 1;
        cArr[i13] = '[';
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
        if (this.f419904r >= this.f419905s) {
            v0();
        }
        char[] cArr = this.f419902p;
        int i12 = this.f419904r;
        this.f419904r = i12 + 1;
        cArr[i12] = '[';
    }

    @Override // lX0.AbstractC43698a, com.fasterxml.jackson.core.JsonGenerator, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f419902p != null && i(JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT)) {
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
        v0();
        this.f419903q = 0;
        this.f419904r = 0;
        com.fasterxml.jackson.core.io.f fVar = this.f419821h;
        Writer writer = this.f419900n;
        if (writer != null) {
            if (fVar.f341163d || i(JsonGenerator.Feature.AUTO_CLOSE_TARGET)) {
                writer.close();
            } else if (i(JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM)) {
                writer.flush();
            }
        }
        char[] cArr = this.f419902p;
        if (cArr != null) {
            this.f419902p = null;
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
        if (this.f419904r >= this.f419905s) {
            v0();
        }
        char[] cArr = this.f419902p;
        int i12 = this.f419904r;
        this.f419904r = i12 + 1;
        cArr[i12] = '{';
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
        if (this.f419904r >= this.f419905s) {
            v0();
        }
        char[] cArr = this.f419902p;
        int i12 = this.f419904r;
        this.f419904r = i12 + 1;
        cArr[i12] = '{';
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator, java.io.Flushable
    public final void flush() throws IOException {
        v0();
        Writer writer = this.f419900n;
        if (writer == null || !i(JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM)) {
            return;
        }
        writer.flush();
    }

    @Override // lX0.AbstractC43698a, com.fasterxml.jackson.core.JsonGenerator
    public final void h0(l lVar) throws IOException {
        o0("write a string");
        int i12 = this.f419904r;
        int i13 = this.f419905s;
        if (i12 >= i13) {
            v0();
        }
        char[] cArr = this.f419902p;
        int i14 = this.f419904r;
        int i15 = i14 + 1;
        this.f419904r = i15;
        char c12 = this.f419901o;
        cArr[i14] = c12;
        int iB2 = lVar.b(i15, cArr);
        if (iB2 >= 0) {
            int i16 = this.f419904r + iB2;
            this.f419904r = i16;
            if (i16 >= i13) {
                v0();
            }
            char[] cArr2 = this.f419902p;
            int i17 = this.f419904r;
            this.f419904r = i17 + 1;
            cArr2[i17] = c12;
            return;
        }
        char[] cArrA = lVar.a();
        int length = cArrA.length;
        if (length < 32) {
            if (length > i13 - this.f419904r) {
                v0();
            }
            System.arraycopy(cArrA, 0, this.f419902p, this.f419904r, length);
            this.f419904r += length;
        } else {
            v0();
            this.f419900n.write(cArrA, 0, length);
        }
        if (this.f419904r >= i13) {
            v0();
        }
        char[] cArr3 = this.f419902p;
        int i18 = this.f419904r;
        this.f419904r = i18 + 1;
        cArr3[i18] = c12;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void i0(String str) throws IOException {
        o0("write a string");
        if (str == null) {
            B0();
            return;
        }
        int i12 = this.f419904r;
        int i13 = this.f419905s;
        if (i12 >= i13) {
            v0();
        }
        char[] cArr = this.f419902p;
        int i14 = this.f419904r;
        this.f419904r = i14 + 1;
        char c12 = this.f419901o;
        cArr[i14] = c12;
        E0(str);
        if (this.f419904r >= i13) {
            v0();
        }
        char[] cArr2 = this.f419902p;
        int i15 = this.f419904r;
        this.f419904r = i15 + 1;
        cArr2[i15] = c12;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0045 A[PHI: r11
  0x0045: PHI (r11v6 int) = (r11v3 int), (r11v7 int) binds: [B:15:0x0041, B:13:0x003e] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.fasterxml.jackson.core.JsonGenerator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j0(char[] r17, int r18, int r19) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: oX0.C44711k.j0(char[], int, int):void");
    }

    @Override // lX0.AbstractC43698a
    public final void o0(String str) throws IOException {
        char c12;
        int iN2 = this.f413836f.n();
        if (this.f341039b != null) {
            s0(iN2, str);
            return;
        }
        if (iN2 == 1) {
            c12 = ',';
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
                    X(nVar.f341186b);
                    return;
                }
                return;
            }
            c12 = ':';
        }
        if (this.f419904r >= this.f419905s) {
            v0();
        }
        char[] cArr = this.f419902p;
        int i12 = this.f419904r;
        this.f419904r = i12 + 1;
        cArr[i12] = c12;
    }

    public final char[] t0() {
        char[] cArr = {'\\', 0, '\\', 'u', '0', '0', 0, 0, '\\', 'u', 0, 0, 0, 0};
        this.f419906t = cArr;
        return cArr;
    }

    @Override // lX0.AbstractC43698a, com.fasterxml.jackson.core.JsonGenerator
    public final int u(Base64Variant base64Variant, InputStream inputStream, int i12) throws IOException {
        o0("write a binary value");
        int i13 = this.f419904r;
        int i14 = this.f419905s;
        if (i13 >= i14) {
            v0();
        }
        char[] cArr = this.f419902p;
        int i15 = this.f419904r;
        this.f419904r = i15 + 1;
        char c12 = this.f419901o;
        cArr[i15] = c12;
        com.fasterxml.jackson.core.io.f fVar = this.f419821h;
        byte[] bArrB = fVar.b();
        try {
            if (i12 < 0) {
                i12 = z0(base64Variant, inputStream, bArrB);
            } else {
                int iA02 = A0(base64Variant, inputStream, bArrB, i12);
                if (iA02 > 0) {
                    a("Too few bytes available: missing " + iA02 + " bytes (out of " + i12 + ")");
                    throw null;
                }
            }
            fVar.d(bArrB);
            if (this.f419904r >= i14) {
                v0();
            }
            char[] cArr2 = this.f419902p;
            int i16 = this.f419904r;
            this.f419904r = i16 + 1;
            cArr2[i16] = c12;
            return i12;
        } catch (Throwable th2) {
            fVar.d(bArrB);
            throw th2;
        }
    }

    public final void u0(char c12, int i12) throws IOException {
        int i13;
        int i14 = this.f419905s;
        if (i12 >= 0) {
            if (this.f419904r + 2 > i14) {
                v0();
            }
            char[] cArr = this.f419902p;
            int i15 = this.f419904r;
            int i16 = i15 + 1;
            this.f419904r = i16;
            cArr[i15] = '\\';
            this.f419904r = i15 + 2;
            cArr[i16] = (char) i12;
            return;
        }
        if (i12 == -2) {
            l lVar = this.f419907u;
            lVar.getClass();
            String value = lVar.getValue();
            this.f419907u = null;
            int length = value.length();
            if (this.f419904r + length > i14) {
                v0();
                if (length > i14) {
                    this.f419900n.write(value);
                    return;
                }
            }
            value.getChars(0, length, this.f419902p, this.f419904r);
            this.f419904r += length;
            return;
        }
        if (this.f419904r + 5 >= i14) {
            v0();
        }
        int i17 = this.f419904r;
        char[] cArr2 = this.f419902p;
        cArr2[i17] = '\\';
        int i18 = i17 + 2;
        cArr2[i17 + 1] = 'u';
        char[] cArr3 = f419899v;
        if (c12 > 255) {
            int i19 = c12 >> '\b';
            int i22 = i17 + 3;
            cArr2[i18] = cArr3[(i19 & 255) >> 4];
            i13 = i17 + 4;
            cArr2[i22] = cArr3[i19 & 15];
            c12 = (char) (c12 & 255);
        } else {
            int i23 = i17 + 3;
            cArr2[i18] = '0';
            i13 = i17 + 4;
            cArr2[i23] = '0';
        }
        cArr2[i13] = cArr3[c12 >> 4];
        cArr2[i13 + 1] = cArr3[c12 & 15];
        this.f419904r = i13 + 2;
    }

    public final void v0() throws IOException {
        int i12 = this.f419904r;
        int i13 = this.f419903q;
        int i14 = i12 - i13;
        if (i14 > 0) {
            this.f419903q = 0;
            this.f419904r = 0;
            this.f419900n.write(this.f419902p, i13, i14);
        }
    }

    public final int w0(char[] cArr, int i12, int i13, char c12, int i14) throws IOException {
        int i15;
        Writer writer = this.f419900n;
        if (i14 >= 0) {
            if (i12 > 1 && i12 < i13) {
                int i16 = i12 - 2;
                cArr[i16] = '\\';
                cArr[i12 - 1] = (char) i14;
                return i16;
            }
            char[] cArrT0 = this.f419906t;
            if (cArrT0 == null) {
                cArrT0 = t0();
            }
            cArrT0[1] = (char) i14;
            writer.write(cArrT0, 0, 2);
            return i12;
        }
        if (i14 == -2) {
            l lVar = this.f419907u;
            lVar.getClass();
            String value = lVar.getValue();
            this.f419907u = null;
            int length = value.length();
            if (i12 < length || i12 >= i13) {
                writer.write(value);
                return i12;
            }
            int i17 = i12 - length;
            value.getChars(0, length, cArr, i17);
            return i17;
        }
        char[] cArr2 = f419899v;
        if (i12 <= 5 || i12 >= i13) {
            char[] cArrT02 = this.f419906t;
            if (cArrT02 == null) {
                cArrT02 = t0();
            }
            this.f419903q = this.f419904r;
            if (c12 <= 255) {
                cArrT02[6] = cArr2[c12 >> 4];
                cArrT02[7] = cArr2[c12 & 15];
                writer.write(cArrT02, 2, 6);
                return i12;
            }
            int i18 = c12 >> '\b';
            cArrT02[10] = cArr2[(i18 & 255) >> 4];
            cArrT02[11] = cArr2[i18 & 15];
            cArrT02[12] = cArr2[(c12 & 255) >> 4];
            cArrT02[13] = cArr2[c12 & 15];
            writer.write(cArrT02, 8, 6);
            return i12;
        }
        cArr[i12 - 6] = '\\';
        int i19 = i12 - 4;
        cArr[i12 - 5] = 'u';
        if (c12 > 255) {
            int i22 = c12 >> '\b';
            int i23 = i12 - 3;
            cArr[i19] = cArr2[(i22 & 255) >> 4];
            i15 = i12 - 2;
            cArr[i23] = cArr2[i22 & 15];
            c12 = (char) (c12 & 255);
        } else {
            int i24 = i12 - 3;
            cArr[i19] = '0';
            i15 = i12 - 2;
            cArr[i24] = '0';
        }
        cArr[i15] = cArr2[c12 >> 4];
        cArr[i15 + 1] = cArr2[c12 & 15];
        return i15 - 4;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void x(Base64Variant base64Variant, byte[] bArr, int i12, int i13) throws IOException {
        int iG2;
        o0("write a binary value");
        int i14 = this.f419904r;
        int i15 = this.f419905s;
        if (i14 >= i15) {
            v0();
        }
        char[] cArr = this.f419902p;
        int i16 = this.f419904r;
        this.f419904r = i16 + 1;
        char c12 = this.f419901o;
        cArr[i16] = c12;
        int i17 = i13 + i12;
        int i18 = i17 - 3;
        int i19 = i15 - 6;
        int i22 = base64Variant.f341007g;
        loop0: while (true) {
            int i23 = i22 >> 2;
            while (i12 <= i18) {
                if (this.f419904r > i19) {
                    v0();
                }
                int i24 = i12 + 2;
                int i25 = ((bArr[i12 + 1] & 255) | (bArr[i12] << 8)) << 8;
                i12 += 3;
                iG2 = base64Variant.g(this.f419902p, i25 | (bArr[i24] & 255), this.f419904r);
                this.f419904r = iG2;
                i23--;
                if (i23 <= 0) {
                    break;
                }
            }
            char[] cArr2 = this.f419902p;
            int i26 = iG2 + 1;
            this.f419904r = i26;
            cArr2[iG2] = '\\';
            this.f419904r = iG2 + 2;
            cArr2[i26] = 'n';
            i22 = base64Variant.f341007g;
        }
        int i27 = i17 - i12;
        if (i27 > 0) {
            if (this.f419904r > i19) {
                v0();
            }
            int i28 = i12 + 1;
            int i29 = bArr[i12] << 16;
            if (i27 == 2) {
                i29 |= (bArr[i28] & 255) << 8;
            }
            this.f419904r = base64Variant.i(i29, i27, this.f419902p, this.f419904r);
        }
        if (this.f419904r >= i15) {
            v0();
        }
        char[] cArr3 = this.f419902p;
        int i32 = this.f419904r;
        this.f419904r = i32 + 1;
        cArr3[i32] = c12;
    }

    public final void x0(char c12, int i12) throws IOException {
        int i13;
        Writer writer = this.f419900n;
        if (i12 >= 0) {
            int i14 = this.f419904r;
            if (i14 >= 2) {
                int i15 = i14 - 2;
                this.f419903q = i15;
                char[] cArr = this.f419902p;
                cArr[i15] = '\\';
                cArr[i14 - 1] = (char) i12;
                return;
            }
            char[] cArrT0 = this.f419906t;
            if (cArrT0 == null) {
                cArrT0 = t0();
            }
            this.f419903q = this.f419904r;
            cArrT0[1] = (char) i12;
            writer.write(cArrT0, 0, 2);
            return;
        }
        if (i12 == -2) {
            l lVar = this.f419907u;
            lVar.getClass();
            String value = lVar.getValue();
            this.f419907u = null;
            int length = value.length();
            int i16 = this.f419904r;
            if (i16 < length) {
                this.f419903q = i16;
                writer.write(value);
                return;
            } else {
                int i17 = i16 - length;
                this.f419903q = i17;
                value.getChars(0, length, this.f419902p, i17);
                return;
            }
        }
        int i18 = this.f419904r;
        char[] cArr2 = f419899v;
        if (i18 < 6) {
            char[] cArrT02 = this.f419906t;
            if (cArrT02 == null) {
                cArrT02 = t0();
            }
            this.f419903q = this.f419904r;
            if (c12 <= 255) {
                cArrT02[6] = cArr2[c12 >> 4];
                cArrT02[7] = cArr2[c12 & 15];
                writer.write(cArrT02, 2, 6);
                return;
            } else {
                int i19 = c12 >> '\b';
                cArrT02[10] = cArr2[(i19 & 255) >> 4];
                cArrT02[11] = cArr2[i19 & 15];
                cArrT02[12] = cArr2[(c12 & 255) >> 4];
                cArrT02[13] = cArr2[c12 & 15];
                writer.write(cArrT02, 8, 6);
                return;
            }
        }
        char[] cArr3 = this.f419902p;
        int i22 = i18 - 6;
        this.f419903q = i22;
        cArr3[i22] = '\\';
        cArr3[i18 - 5] = 'u';
        if (c12 > 255) {
            int i23 = c12 >> '\b';
            cArr3[i18 - 4] = cArr2[(i23 & 255) >> 4];
            i13 = i18 - 3;
            cArr3[i13] = cArr2[i23 & 15];
            c12 = (char) (c12 & 255);
        } else {
            cArr3[i18 - 4] = '0';
            i13 = i18 - 3;
            cArr3[i13] = '0';
        }
        cArr3[i13 + 1] = cArr2[c12 >> 4];
        cArr3[i13 + 2] = cArr2[c12 & 15];
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void y(boolean z12) throws IOException {
        int i12;
        o0("write a boolean value");
        if (this.f419904r + 5 >= this.f419905s) {
            v0();
        }
        int i13 = this.f419904r;
        char[] cArr = this.f419902p;
        if (z12) {
            cArr[i13] = 't';
            cArr[i13 + 1] = 'r';
            cArr[i13 + 2] = 'u';
            i12 = i13 + 3;
            cArr[i12] = 'e';
        } else {
            cArr[i13] = 'f';
            cArr[i13 + 1] = 'a';
            cArr[i13 + 2] = 'l';
            cArr[i13 + 3] = 's';
            i12 = i13 + 4;
            cArr[i12] = 'e';
        }
        this.f419904r = i12 + 1;
    }

    public final int z0(Base64Variant base64Variant, InputStream inputStream, byte[] bArr) throws IOException {
        int i12 = this.f419905s - 6;
        int i13 = 2;
        int i14 = base64Variant.f341007g >> 2;
        int i15 = -3;
        int i16 = 0;
        int iY02 = 0;
        int i17 = 0;
        while (true) {
            if (i16 > i15) {
                iY02 = y0(inputStream, bArr, i16, iY02, bArr.length);
                if (iY02 < 3) {
                    break;
                }
                i15 = iY02 - 3;
                i16 = 0;
            }
            if (this.f419904r > i12) {
                v0();
            }
            int i18 = i16 + 2;
            int i19 = ((bArr[i16 + 1] & 255) | (bArr[i16] << 8)) << 8;
            i16 += 3;
            i17 += 3;
            int iG2 = base64Variant.g(this.f419902p, (bArr[i18] & 255) | i19, this.f419904r);
            this.f419904r = iG2;
            i14--;
            if (i14 <= 0) {
                char[] cArr = this.f419902p;
                int i22 = iG2 + 1;
                this.f419904r = i22;
                cArr[iG2] = '\\';
                this.f419904r = iG2 + 2;
                cArr[i22] = 'n';
                i14 = base64Variant.f341007g >> 2;
            }
        }
        if (iY02 <= 0) {
            return i17;
        }
        if (this.f419904r > i12) {
            v0();
        }
        int i23 = bArr[0] << 16;
        if (1 < iY02) {
            i23 |= (bArr[1] & 255) << 8;
        } else {
            i13 = 1;
        }
        int i24 = i17 + i13;
        this.f419904r = base64Variant.i(i23, i13, this.f419902p, this.f419904r);
        return i24;
    }
}
