package oX0;

import androidx.appcompat.app.r;
import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.StreamReadCapability;
import com.fasterxml.jackson.core.exc.InputCoercionException;
import com.fasterxml.jackson.core.json.JsonReadFeature;
import com.fasterxml.jackson.core.util.p;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.util.C36500f;
import java.io.IOException;
import java.io.InputStream;
import lX0.AbstractC43699b;
import lX0.AbstractC43700c;
import shark.AndroidResourceIdNames;

/* compiled from: UTF8StreamJsonParser.java */
/* renamed from: oX0.j, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C44710j extends AbstractC43699b {

    /* renamed from: X, reason: collision with root package name */
    public static final int f419879X = JsonParser.Feature.ALLOW_TRAILING_COMMA.f341073c;

    /* renamed from: Y, reason: collision with root package name */
    public static final int f419880Y = JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS.f341073c;

    /* renamed from: Z, reason: collision with root package name */
    public static final int f419881Z = JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS.f341073c;

    /* renamed from: a0, reason: collision with root package name */
    public static final int f419882a0 = JsonParser.Feature.ALLOW_MISSING_VALUES.f341073c;

    /* renamed from: b0, reason: collision with root package name */
    public static final int f419883b0 = JsonParser.Feature.ALLOW_SINGLE_QUOTES.f341073c;

    /* renamed from: c0, reason: collision with root package name */
    public static final int f419884c0 = JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES.f341073c;

    /* renamed from: d0, reason: collision with root package name */
    public static final int f419885d0 = JsonParser.Feature.ALLOW_COMMENTS.f341073c;

    /* renamed from: e0, reason: collision with root package name */
    public static final int f419886e0 = JsonParser.Feature.ALLOW_YAML_COMMENTS.f341073c;

    /* renamed from: f0, reason: collision with root package name */
    public static final int[] f419887f0 = com.fasterxml.jackson.core.io.b.f341147d;

    /* renamed from: g0, reason: collision with root package name */
    public static final int[] f419888g0 = com.fasterxml.jackson.core.io.b.f341146c;

    /* renamed from: N, reason: collision with root package name */
    public final ObjectMapper f419889N;

    /* renamed from: O, reason: collision with root package name */
    public final com.fasterxml.jackson.core.sym.a f419890O;

    /* renamed from: P, reason: collision with root package name */
    public int[] f419891P;

    /* renamed from: Q, reason: collision with root package name */
    public boolean f419892Q;

    /* renamed from: R, reason: collision with root package name */
    public int f419893R;

    /* renamed from: S, reason: collision with root package name */
    public int f419894S;

    /* renamed from: T, reason: collision with root package name */
    public int f419895T;

    /* renamed from: U, reason: collision with root package name */
    public InputStream f419896U;

    /* renamed from: V, reason: collision with root package name */
    public byte[] f419897V;

    /* renamed from: W, reason: collision with root package name */
    public final boolean f419898W;

    public C44710j(com.fasterxml.jackson.core.io.f fVar, int i12, InputStream inputStream, ObjectMapper objectMapper, com.fasterxml.jackson.core.sym.a aVar, byte[] bArr, int i13, int i14, int i15, boolean z12) {
        super(fVar, i12);
        this.f419891P = new int[16];
        this.f419896U = inputStream;
        this.f419889N = objectMapper;
        this.f419890O = aVar;
        this.f419897V = bArr;
        this.f413852p = i13;
        this.f413853q = i14;
        this.f413856t = i13 - i15;
        this.f413854r = (-i13) + i15;
        this.f419898W = z12;
    }

    public static final int N1(int i12, int i13) {
        return i13 == 4 ? i12 : i12 | ((-1) << (i13 << 3));
    }

    public final void A1() throws JsonParseException {
        int i12;
        int i13 = this.f413852p;
        if (i13 + 4 < this.f413853q) {
            byte[] bArr = this.f419897V;
            int i14 = i13 + 1;
            if (bArr[i13] == 97) {
                int i15 = i13 + 2;
                if (bArr[i14] == 108) {
                    int i16 = i13 + 3;
                    if (bArr[i15] == 115) {
                        int i17 = i13 + 4;
                        if (bArr[i16] == 101 && ((i12 = bArr[i17] & 255) < 48 || i12 == 93 || i12 == 125)) {
                            this.f413852p = i17;
                            return;
                        }
                    }
                }
            }
        }
        H1(1, "false");
    }

    public final int A2() throws JsonParseException {
        if (this.f413852p >= this.f413853q && !x1()) {
            o0();
            return -1;
        }
        byte[] bArr = this.f419897V;
        int i12 = this.f413852p;
        int i13 = i12 + 1;
        this.f413852p = i13;
        int i14 = bArr[i12] & 255;
        if (i14 > 32) {
            if (i14 != 47 && i14 != 35) {
                return i14;
            }
            this.f413852p = i12;
            return B2();
        }
        if (i14 != 32) {
            if (i14 == 10) {
                this.f413855s++;
                this.f413856t = i13;
            } else if (i14 == 13) {
                l2();
            } else if (i14 != 9) {
                w0(i14);
                throw null;
            }
        }
        while (true) {
            int i15 = this.f413852p;
            if (i15 >= this.f413853q) {
                return B2();
            }
            byte[] bArr2 = this.f419897V;
            int i16 = i15 + 1;
            this.f413852p = i16;
            int i17 = bArr2[i15] & 255;
            if (i17 > 32) {
                if (i17 != 47 && i17 != 35) {
                    return i17;
                }
                this.f413852p = i15;
                return B2();
            }
            if (i17 != 32) {
                if (i17 == 10) {
                    this.f413855s++;
                    this.f413856t = i16;
                } else if (i17 == 13) {
                    l2();
                } else if (i17 != 9) {
                    w0(i17);
                    throw null;
                }
            }
        }
    }

    @Override // lX0.AbstractC43699b
    public final void B0() throws IOException {
        if (this.f419896U != null) {
            if (this.f413850n.f341163d || JsonParser.Feature.AUTO_CLOSE_SOURCE.a(this.f341055b)) {
                this.f419896U.close();
            }
            this.f419896U = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003a, code lost:
    
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int B2() throws com.fasterxml.jackson.core.JsonParseException {
        /*
            r3 = this;
        L0:
            int r0 = r3.f413852p
            int r1 = r3.f413853q
            if (r0 < r1) goto L12
            boolean r0 = r3.x1()
            if (r0 == 0) goto Ld
            goto L12
        Ld:
            r3.o0()
            r0 = -1
            return r0
        L12:
            byte[] r0 = r3.f419897V
            int r1 = r3.f413852p
            int r2 = r1 + 1
            r3.f413852p = r2
            r0 = r0[r1]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = 32
            if (r0 <= r1) goto L3b
            r1 = 47
            if (r0 != r1) goto L2a
            r3.p2()
            goto L0
        L2a:
            r1 = 35
            if (r0 != r1) goto L3a
            int r1 = r3.f341055b
            int r2 = oX0.C44710j.f419886e0
            r1 = r1 & r2
            if (r1 != 0) goto L36
            goto L3a
        L36:
            r3.q2()
            goto L0
        L3a:
            return r0
        L3b:
            if (r0 == r1) goto L0
            r1 = 10
            if (r0 != r1) goto L4a
            int r0 = r3.f413855s
            int r0 = r0 + 1
            r3.f413855s = r0
            r3.f413856t = r2
            goto L0
        L4a:
            r1 = 13
            if (r0 != r1) goto L52
            r3.l2()
            goto L0
        L52:
            r1 = 9
            if (r0 != r1) goto L57
            goto L0
        L57:
            r3.w0(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: oX0.C44710j.B2():int");
    }

    public final void C2() {
        this.f413858v = this.f413855s;
        int i12 = this.f413852p;
        this.f413857u = this.f413854r + i12;
        this.f413859w = i12 - this.f413856t;
    }

    public final void D1() throws JsonParseException {
        int i12;
        int i13 = this.f413852p;
        if (i13 + 3 < this.f413853q) {
            byte[] bArr = this.f419897V;
            int i14 = i13 + 1;
            if (bArr[i13] == 117) {
                int i15 = i13 + 2;
                if (bArr[i14] == 108) {
                    int i16 = i13 + 3;
                    if (bArr[i15] == 108 && ((i12 = bArr[i16] & 255) < 48 || i12 == 93 || i12 == 125)) {
                        this.f413852p = i16;
                        return;
                    }
                }
            }
        }
        H1(1, "null");
    }

    public final int D2() throws JsonParseException {
        if (this.f413852p >= this.f413853q && !x1()) {
            return 48;
        }
        byte[] bArr = this.f419897V;
        int i12 = this.f413852p;
        int i13 = bArr[i12] & 255;
        if (i13 < 48 || i13 > 57) {
            return 48;
        }
        if ((this.f341055b & f419880Y) == 0) {
            throw new JsonParseException(this, "Invalid numeric value: Leading zeroes not allowed");
        }
        this.f413852p = i12 + 1;
        if (i13 == 48) {
            do {
                if (this.f413852p >= this.f413853q && !x1()) {
                    break;
                }
                byte[] bArr2 = this.f419897V;
                int i14 = this.f413852p;
                i13 = bArr2[i14] & 255;
                if (i13 < 48 || i13 > 57) {
                    return 48;
                }
                this.f413852p = i14 + 1;
            } while (i13 == 48);
        }
        return i13;
    }

    public final void F1(int i12, String str) throws JsonParseException {
        int length = str.length();
        if (this.f413852p + length >= this.f413853q) {
            H1(i12, str);
            return;
        }
        while (this.f419897V[this.f413852p] == str.charAt(i12)) {
            int i13 = this.f413852p + 1;
            this.f413852p = i13;
            i12++;
            if (i12 >= length) {
                int i14 = this.f419897V[i13] & 255;
                if (i14 < 48 || i14 == 93 || i14 == 125 || !Character.isJavaIdentifierPart((char) j1(i14))) {
                    return;
                }
                k2(str.substring(0, i12), R0());
                throw null;
            }
        }
        k2(str.substring(0, i12), R0());
        throw null;
    }

    public final void F2(int i12) throws JsonParseException {
        int i13 = this.f413852p + 1;
        this.f413852p = i13;
        if (i12 != 9) {
            if (i12 == 10) {
                this.f413855s++;
                this.f413856t = i13;
            } else if (i12 == 13) {
                l2();
            } else {
                if (i12 == 32) {
                    return;
                }
                v0(i12, "Expected space separating root-level values");
                throw null;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0106 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String G2(int r21, int r22, int[] r23) throws com.fasterxml.jackson.core.JsonParseException {
        /*
            Method dump skipped, instructions count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: oX0.C44710j.G2(int, int, int[]):java.lang.String");
    }

    @Override // lX0.AbstractC43699b
    public final char H0() throws JsonParseException {
        if (this.f413852p >= this.f413853q && !x1()) {
            JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
            t0(" in character escape sequence");
            throw null;
        }
        byte[] bArr = this.f419897V;
        int i12 = this.f413852p;
        this.f413852p = i12 + 1;
        byte b12 = bArr[i12];
        if (b12 == 34 || b12 == 47 || b12 == 92) {
            return (char) b12;
        }
        if (b12 == 98) {
            return '\b';
        }
        if (b12 == 102) {
            return '\f';
        }
        if (b12 == 110) {
            return '\n';
        }
        if (b12 == 114) {
            return '\r';
        }
        if (b12 == 116) {
            return '\t';
        }
        if (b12 != 117) {
            char cJ1 = (char) j1(b12);
            K0(cJ1);
            return cJ1;
        }
        int i13 = 0;
        for (int i14 = 0; i14 < 4; i14++) {
            if (this.f413852p >= this.f413853q && !x1()) {
                JsonToken jsonToken2 = JsonToken.NOT_AVAILABLE;
                t0(" in character escape sequence");
                throw null;
            }
            byte[] bArr2 = this.f419897V;
            int i15 = this.f413852p;
            this.f413852p = i15 + 1;
            int i16 = bArr2[i15] & 255;
            int i17 = com.fasterxml.jackson.core.io.b.f341152i[i16];
            if (i17 < 0) {
                v0(i16, "expected a hex-digit for character escape sequence");
                throw null;
            }
            i13 = (i13 << 4) | i17;
        }
        return (char) i13;
    }

    public final void H1(int i12, String str) throws JsonParseException {
        int i13;
        int i14;
        int length = str.length();
        do {
            if ((this.f413852p >= this.f413853q && !x1()) || this.f419897V[this.f413852p] != str.charAt(i12)) {
                k2(str.substring(0, i12), R0());
                throw null;
            }
            i13 = this.f413852p + 1;
            this.f413852p = i13;
            i12++;
        } while (i12 < length);
        if ((i13 < this.f413853q || x1()) && (i14 = this.f419897V[this.f413852p] & 255) >= 48 && i14 != 93 && i14 != 125 && Character.isJavaIdentifierPart((char) j1(i14))) {
            k2(str.substring(0, i12), R0());
            throw null;
        }
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final com.fasterxml.jackson.core.util.i<StreamReadCapability> I() {
        return AbstractC43699b.f413837M;
    }

    public final void I1() throws JsonParseException {
        int i12;
        int i13 = this.f413852p;
        if (i13 + 3 < this.f413853q) {
            byte[] bArr = this.f419897V;
            int i14 = i13 + 1;
            if (bArr[i13] == 114) {
                int i15 = i13 + 2;
                if (bArr[i14] == 117) {
                    int i16 = i13 + 3;
                    if (bArr[i15] == 101 && ((i12 = bArr[i16] & 255) < 48 || i12 == 93 || i12 == 125)) {
                        this.f413852p = i16;
                        return;
                    }
                }
            }
        }
        H1(1, "true");
    }

    public final String I2(int i12, int i13) {
        int iN1 = N1(i12, i13);
        String strJ = this.f419890O.j(iN1);
        if (strJ != null) {
            return strJ;
        }
        int[] iArr = this.f419891P;
        iArr[0] = iN1;
        return G2(1, i13, iArr);
    }

    public final String J2(int i12, int i13, int i14) {
        int iN1 = N1(i13, i14);
        String strK = this.f419890O.k(i12, iN1);
        if (strK != null) {
            return strK;
        }
        int[] iArr = this.f419891P;
        iArr[0] = i12;
        iArr[1] = iN1;
        return G2(2, i14, iArr);
    }

    public final JsonToken K1() {
        this.f413839B = false;
        JsonToken jsonToken = this.f413861y;
        this.f413861y = null;
        if (jsonToken == JsonToken.START_ARRAY) {
            this.f413860x = this.f413860x.i(this.f413858v, this.f413859w);
        } else if (jsonToken == JsonToken.START_OBJECT) {
            this.f413860x = this.f413860x.j(this.f413858v, this.f413859w);
        }
        this.f413872d = jsonToken;
        return jsonToken;
    }

    public final String K2(int i12, int i13, int i14, int i15) {
        int iN1 = N1(i14, i15);
        String strL = this.f419890O.l(i12, i13, iN1);
        if (strL != null) {
            return strL;
        }
        int[] iArr = this.f419891P;
        iArr[0] = i12;
        iArr[1] = i13;
        iArr[2] = N1(iN1, i15);
        return G2(3, i15, iArr);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final String L() {
        JsonToken jsonToken = this.f413872d;
        JsonToken jsonToken2 = JsonToken.VALUE_STRING;
        p pVar = this.f413862z;
        if (jsonToken == jsonToken2) {
            if (!this.f419892Q) {
                return pVar.g();
            }
            this.f419892Q = false;
            return s1();
        }
        if (jsonToken == null) {
            return null;
        }
        int i12 = jsonToken.f341099e;
        return i12 != 5 ? (i12 == 6 || i12 == 7 || i12 == 8) ? pVar.g() : jsonToken.f341096b : this.f413860x.f419829f;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final char[] M() throws JsonParseException {
        JsonToken jsonToken = this.f413872d;
        if (jsonToken == null) {
            return null;
        }
        int i12 = jsonToken.f341099e;
        if (i12 != 5) {
            if (i12 != 6) {
                if (i12 != 7 && i12 != 8) {
                    return jsonToken.f341097c;
                }
            } else if (this.f419892Q) {
                this.f419892Q = false;
                t1();
            }
            return this.f413862z.m();
        }
        if (!this.f413839B) {
            String str = this.f413860x.f419829f;
            int length = str.length();
            char[] cArr = this.f413838A;
            if (cArr == null) {
                this.f413838A = this.f413850n.c(length);
            } else if (cArr.length < length) {
                this.f413838A = new char[length];
            }
            str.getChars(0, length, this.f413838A, 0);
            this.f413839B = true;
        }
        return this.f413838A;
    }

    public final JsonToken M1(int i12) throws JsonParseException {
        if (i12 == 34) {
            this.f419892Q = true;
            JsonToken jsonToken = JsonToken.VALUE_STRING;
            this.f413872d = jsonToken;
            return jsonToken;
        }
        if (i12 == 45) {
            JsonToken jsonTokenT1 = T1();
            this.f413872d = jsonTokenT1;
            return jsonTokenT1;
        }
        if (i12 == 46) {
            JsonToken jsonTokenR1 = R1();
            this.f413872d = jsonTokenR1;
            return jsonTokenR1;
        }
        if (i12 == 91) {
            this.f413860x = this.f413860x.i(this.f413858v, this.f413859w);
            JsonToken jsonToken2 = JsonToken.START_ARRAY;
            this.f413872d = jsonToken2;
            return jsonToken2;
        }
        if (i12 == 102) {
            A1();
            JsonToken jsonToken3 = JsonToken.VALUE_FALSE;
            this.f413872d = jsonToken3;
            return jsonToken3;
        }
        if (i12 == 110) {
            D1();
            JsonToken jsonToken4 = JsonToken.VALUE_NULL;
            this.f413872d = jsonToken4;
            return jsonToken4;
        }
        if (i12 == 116) {
            I1();
            JsonToken jsonToken5 = JsonToken.VALUE_TRUE;
            this.f413872d = jsonToken5;
            return jsonToken5;
        }
        if (i12 == 123) {
            this.f413860x = this.f413860x.j(this.f413858v, this.f413859w);
            JsonToken jsonToken6 = JsonToken.START_OBJECT;
            this.f413872d = jsonToken6;
            return jsonToken6;
        }
        switch (i12) {
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
                JsonToken jsonTokenY1 = Y1(i12);
                this.f413872d = jsonTokenY1;
                return jsonTokenY1;
            default:
                JsonToken jsonTokenW1 = w1(i12);
                this.f413872d = jsonTokenW1;
                return jsonTokenW1;
        }
    }

    public final String M2(int[] iArr, int i12, int i13, int i14) {
        if (i12 >= iArr.length) {
            iArr = AbstractC43699b.V0(iArr.length, iArr);
            this.f419891P = iArr;
        }
        int i15 = i12 + 1;
        iArr[i12] = N1(i13, i14);
        String strM = this.f419890O.m(i15, iArr);
        return strM == null ? G2(i15, i14, iArr) : strM;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final int N() throws JsonParseException {
        JsonToken jsonToken = this.f413872d;
        if (jsonToken == null) {
            return 0;
        }
        int i12 = jsonToken.f341099e;
        if (i12 == 5) {
            return this.f413860x.f419829f.length();
        }
        if (i12 != 6) {
            if (i12 != 7 && i12 != 8) {
                return jsonToken.f341097c.length;
            }
        } else if (this.f419892Q) {
            this.f419892Q = false;
            t1();
        }
        return this.f413862z.q();
    }

    @Override // lX0.AbstractC43699b
    public final void N0() {
        byte[] bArr;
        byte[] bArr2;
        super.N0();
        this.f419890O.p();
        if (!this.f419898W || (bArr = this.f419897V) == null || bArr == (bArr2 = AbstractC43700c.f413863e)) {
            return;
        }
        this.f419897V = bArr2;
        this.f413850n.e(bArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x000f, code lost:
    
        if (r0 != 8) goto L16;
     */
    @Override // com.fasterxml.jackson.core.JsonParser
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int O() throws com.fasterxml.jackson.core.JsonParseException {
        /*
            r3 = this;
            com.fasterxml.jackson.core.JsonToken r0 = r3.f413872d
            r1 = 0
            if (r0 == 0) goto L22
            r2 = 6
            int r0 = r0.f341099e
            if (r0 == r2) goto L12
            r2 = 7
            if (r0 == r2) goto L1b
            r2 = 8
            if (r0 == r2) goto L1b
            goto L22
        L12:
            boolean r0 = r3.f419892Q
            if (r0 == 0) goto L1b
            r3.f419892Q = r1
            r3.t1()
        L1b:
            com.fasterxml.jackson.core.util.p r0 = r3.f413862z
            int r0 = r0.n()
            return r0
        L22:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: oX0.C44710j.O():int");
    }

    public final int O2() {
        if (this.f413852p >= this.f413853q) {
            y1();
        }
        byte[] bArr = this.f419897V;
        int i12 = this.f413852p;
        this.f413852p = i12 + 1;
        return bArr[i12] & 255;
    }

    @Override // lX0.AbstractC43699b, lX0.AbstractC43700c, com.fasterxml.jackson.core.JsonParser
    public final com.fasterxml.jackson.core.e P() {
        if (this.f413872d != JsonToken.FIELD_NAME) {
            return new com.fasterxml.jackson.core.e(D0(), this.f413857u - 1, -1L, this.f413858v, this.f413859w);
        }
        return new com.fasterxml.jackson.core.e(D0(), this.f413854r + (this.f419893R - 1), -1L, this.f419894S, this.f419895T);
    }

    public final JsonToken P1(char[] cArr, int i12, int i13, boolean z12, int i14) throws JsonParseException {
        char[] cArrK;
        int i15;
        int i16;
        boolean z13;
        int i17 = i13;
        p pVar = this.f413862z;
        int i18 = 0;
        if (i17 == 46) {
            cArrK = cArr;
            int i19 = i12;
            if (i19 >= cArrK.length) {
                cArrK = pVar.k();
                i19 = 0;
            }
            int i22 = i19 + 1;
            cArrK[i19] = (char) i17;
            int i23 = 0;
            while (true) {
                if (this.f413852p >= this.f413853q && !x1()) {
                    z13 = true;
                    break;
                }
                byte[] bArr = this.f419897V;
                int i24 = this.f413852p;
                this.f413852p = i24 + 1;
                i17 = bArr[i24] & 255;
                if (i17 < 48 || i17 > 57) {
                    break;
                }
                i23++;
                if (i22 >= cArrK.length) {
                    cArrK = pVar.k();
                    i22 = 0;
                }
                cArrK[i22] = (char) i17;
                i22++;
            }
            z13 = false;
            if (i23 == 0) {
                A0(i17, "Decimal point not followed by a digit");
                throw null;
            }
            int i25 = i23;
            i15 = i22;
            i16 = i25;
        } else {
            cArrK = cArr;
            i15 = i12;
            i16 = 0;
            z13 = false;
        }
        if (i17 == 101 || i17 == 69) {
            if (i15 >= cArrK.length) {
                cArrK = pVar.k();
                i15 = 0;
            }
            int i26 = i15 + 1;
            cArrK[i15] = (char) i17;
            if (this.f413852p >= this.f413853q) {
                y1();
            }
            byte[] bArr2 = this.f419897V;
            int i27 = this.f413852p;
            this.f413852p = i27 + 1;
            i17 = bArr2[i27] & 255;
            if (i17 == 45 || i17 == 43) {
                if (i26 >= cArrK.length) {
                    cArrK = pVar.k();
                    i26 = 0;
                }
                int i28 = i26 + 1;
                cArrK[i26] = (char) i17;
                if (this.f413852p >= this.f413853q) {
                    y1();
                }
                byte[] bArr3 = this.f419897V;
                int i29 = this.f413852p;
                this.f413852p = i29 + 1;
                i17 = bArr3[i29] & 255;
                i26 = i28;
            }
            int i32 = 0;
            while (i17 >= 48 && i17 <= 57) {
                i32++;
                if (i26 >= cArrK.length) {
                    cArrK = pVar.k();
                    i26 = 0;
                }
                int i33 = i26 + 1;
                cArrK[i26] = (char) i17;
                if (this.f413852p >= this.f413853q && !x1()) {
                    z13 = true;
                    i18 = i32;
                    i15 = i33;
                    break;
                }
                byte[] bArr4 = this.f419897V;
                int i34 = this.f413852p;
                this.f413852p = i34 + 1;
                i17 = bArr4[i34] & 255;
                i26 = i33;
            }
            i18 = i32;
            i15 = i26;
            if (i18 == 0) {
                A0(i17, "Exponent indicator not followed by a digit");
                throw null;
            }
        }
        if (!z13) {
            this.f413852p--;
            if (this.f413860x.f()) {
                F2(i17);
            }
        }
        pVar.f341321i = i15;
        return a1(i14, i16, i18, z12);
    }

    public final String P2(int[] iArr, int i12, int i13, int i14, int i15) throws JsonParseException {
        int i16;
        int i17;
        while (true) {
            if (f419888g0[i14] != 0) {
                if (i14 == 34) {
                    if (i15 > 0) {
                        if (i12 >= iArr.length) {
                            iArr = AbstractC43699b.V0(iArr.length, iArr);
                            this.f419891P = iArr;
                        }
                        iArr[i12] = N1(i13, i15);
                        i12 = 1 + i12;
                    }
                    String strM = this.f419890O.m(i12, iArr);
                    return strM == null ? G2(i12, i15, iArr) : strM;
                }
                if (i14 != 92) {
                    Q0(i14, "name");
                } else {
                    i14 = H0();
                }
                if (i14 > 127) {
                    int i18 = 0;
                    if (i15 >= 4) {
                        if (i12 >= iArr.length) {
                            iArr = AbstractC43699b.V0(iArr.length, iArr);
                            this.f419891P = iArr;
                        }
                        iArr[i12] = i13;
                        i12++;
                        i13 = 0;
                        i15 = 0;
                    }
                    if (i14 < 2048) {
                        i16 = i13 << 8;
                        i17 = (i14 >> 6) | 192;
                    } else {
                        int i19 = (i13 << 8) | (i14 >> 12) | 224;
                        i15++;
                        if (i15 >= 4) {
                            if (i12 >= iArr.length) {
                                iArr = AbstractC43699b.V0(iArr.length, iArr);
                                this.f419891P = iArr;
                            }
                            iArr[i12] = i19;
                            i12++;
                            i15 = 0;
                        } else {
                            i18 = i19;
                        }
                        i16 = i18 << 8;
                        i17 = ((i14 >> 6) & 63) | 128;
                    }
                    i13 = i16 | i17;
                    i15++;
                    i14 = (i14 & 63) | 128;
                }
            }
            if (i15 < 4) {
                i15++;
                i13 = (i13 << 8) | i14;
            } else {
                if (i12 >= iArr.length) {
                    iArr = AbstractC43699b.V0(iArr.length, iArr);
                    this.f419891P = iArr;
                }
                iArr[i12] = i13;
                i13 = i14;
                i12++;
                i15 = 1;
            }
            if (this.f413852p >= this.f413853q && !x1()) {
                JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
                t0(" in field name");
                throw null;
            }
            byte[] bArr = this.f419897V;
            int i22 = this.f413852p;
            this.f413852p = i22 + 1;
            i14 = bArr[i22] & 255;
        }
    }

    public final String Q2(int i12, int i13, int i14, int i15, int i16) {
        int[] iArr = this.f419891P;
        iArr[0] = i12;
        iArr[1] = i13;
        return P2(iArr, 2, i14, i15, i16);
    }

    @Override // lX0.AbstractC43700c, com.fasterxml.jackson.core.JsonParser
    public final int R() throws InputCoercionException {
        JsonToken jsonToken = this.f413872d;
        if (jsonToken != JsonToken.VALUE_NUMBER_INT && jsonToken != JsonToken.VALUE_NUMBER_FLOAT) {
            return super.S();
        }
        int i12 = this.f413842E;
        int i13 = i12 & 1;
        if (i13 == 0) {
            if (i12 == 0) {
                return L0();
            }
            if (i13 == 0) {
                T0();
            }
        }
        return this.f413843F;
    }

    public final JsonToken R1() {
        return !JsonReadFeature.ALLOW_LEADING_DECIMAL_POINT_FOR_NUMBERS.f341209c.a(this.f341055b) ? w1(46) : P1(this.f413862z.h(), 0, 46, false, 0);
    }

    @Override // lX0.AbstractC43700c, com.fasterxml.jackson.core.JsonParser
    public final int S() throws InputCoercionException {
        JsonToken jsonToken = this.f413872d;
        if (jsonToken != JsonToken.VALUE_NUMBER_INT && jsonToken != JsonToken.VALUE_NUMBER_FLOAT) {
            return super.S();
        }
        int i12 = this.f413842E;
        int i13 = i12 & 1;
        if (i13 == 0) {
            if (i12 == 0) {
                return L0();
            }
            if (i13 == 0) {
                T0();
            }
        }
        return this.f413843F;
    }

    public final String S1(int i12) throws JsonParseException {
        String strM;
        int i13 = i12;
        int[] iArr = f419888g0;
        int i14 = 0;
        if (i13 != 34) {
            com.fasterxml.jackson.core.sym.a aVar = this.f419890O;
            if (i13 != 39 || (this.f341055b & f419883b0) == 0) {
                if ((this.f341055b & f419884c0) == 0) {
                    v0((char) j1(i12), "was expecting double-quote to start field name");
                    throw null;
                }
                int[] iArr2 = com.fasterxml.jackson.core.io.b.f341149f;
                if (iArr2[i13] != 0) {
                    v0(i13, "was expecting either valid name character (for unquoted name) or double-quote (for quoted) to start field name");
                    throw null;
                }
                int[] iArrV0 = this.f419891P;
                int i15 = 0;
                int i16 = 0;
                while (true) {
                    if (i14 < 4) {
                        i14++;
                        i16 = i13 | (i16 << 8);
                    } else {
                        if (i15 >= iArrV0.length) {
                            iArrV0 = AbstractC43699b.V0(iArrV0.length, iArrV0);
                            this.f419891P = iArrV0;
                        }
                        iArrV0[i15] = i16;
                        i16 = i13;
                        i15++;
                        i14 = 1;
                    }
                    if (this.f413852p >= this.f413853q && !x1()) {
                        JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
                        t0(" in field name");
                        throw null;
                    }
                    byte[] bArr = this.f419897V;
                    int i17 = this.f413852p;
                    i13 = bArr[i17] & 255;
                    if (iArr2[i13] != 0) {
                        if (i14 > 0) {
                            if (i15 >= iArrV0.length) {
                                iArrV0 = AbstractC43699b.V0(iArrV0.length, iArrV0);
                                this.f419891P = iArrV0;
                            }
                            iArrV0[i15] = i16;
                            i15++;
                        }
                        strM = aVar.m(i15, iArrV0);
                        if (strM == null) {
                            strM = G2(i15, i14, iArrV0);
                        }
                    } else {
                        this.f413852p = i17 + 1;
                    }
                }
            } else {
                if (this.f413852p >= this.f413853q && !x1()) {
                    JsonToken jsonToken2 = JsonToken.NOT_AVAILABLE;
                    t0(": was expecting closing ''' for field name");
                    throw null;
                }
                byte[] bArr2 = this.f419897V;
                int i18 = this.f413852p;
                this.f413852p = i18 + 1;
                int iH02 = bArr2[i18] & 255;
                if (iH02 == 39) {
                    return "";
                }
                int[] iArrV02 = this.f419891P;
                int i19 = 0;
                int i22 = 0;
                int i23 = 0;
                for (int i24 = 39; iH02 != i24; i24 = 39) {
                    if (iArr[iH02] != 0 && iH02 != 34) {
                        if (iH02 != 92) {
                            Q0(iH02, "name");
                        } else {
                            iH02 = H0();
                        }
                        if (iH02 > 127) {
                            if (i19 >= 4) {
                                if (i22 >= iArrV02.length) {
                                    iArrV02 = AbstractC43699b.V0(iArrV02.length, iArrV02);
                                    this.f419891P = iArrV02;
                                }
                                iArrV02[i22] = i23;
                                i23 = 0;
                                i22++;
                                i19 = 0;
                            }
                            if (iH02 < 2048) {
                                i23 = (i23 << 8) | (iH02 >> 6) | 192;
                                i19++;
                            } else {
                                int i25 = (i23 << 8) | (iH02 >> 12) | 224;
                                int i26 = i19 + 1;
                                if (i26 >= 4) {
                                    if (i22 >= iArrV02.length) {
                                        iArrV02 = AbstractC43699b.V0(iArrV02.length, iArrV02);
                                        this.f419891P = iArrV02;
                                    }
                                    iArrV02[i22] = i25;
                                    i25 = 0;
                                    i22++;
                                    i26 = 0;
                                }
                                i23 = (i25 << 8) | ((iH02 >> 6) & 63) | 128;
                                i19 = i26 + 1;
                            }
                            iH02 = (iH02 & 63) | 128;
                        }
                    }
                    if (i19 < 4) {
                        i19++;
                        i23 = iH02 | (i23 << 8);
                    } else {
                        if (i22 >= iArrV02.length) {
                            iArrV02 = AbstractC43699b.V0(iArrV02.length, iArrV02);
                            this.f419891P = iArrV02;
                        }
                        iArrV02[i22] = i23;
                        i23 = iH02;
                        i22++;
                        i19 = 1;
                    }
                    if (this.f413852p >= this.f413853q && !x1()) {
                        JsonToken jsonToken3 = JsonToken.NOT_AVAILABLE;
                        t0(" in field name");
                        throw null;
                    }
                    byte[] bArr3 = this.f419897V;
                    int i27 = this.f413852p;
                    this.f413852p = i27 + 1;
                    iH02 = bArr3[i27] & 255;
                }
                if (i19 > 0) {
                    if (i22 >= iArrV02.length) {
                        iArrV02 = AbstractC43699b.V0(iArrV02.length, iArrV02);
                        this.f419891P = iArrV02;
                    }
                    iArrV02[i22] = N1(i23, i19);
                    i22++;
                }
                strM = aVar.m(i22, iArrV02);
                if (strM == null) {
                    strM = G2(i22, i19, iArrV02);
                }
            }
            return strM;
        }
        int i28 = this.f413852p;
        int i29 = i28 + 13;
        int i32 = this.f413853q;
        if (i29 > i32) {
            if (i28 >= i32 && !x1()) {
                JsonToken jsonToken4 = JsonToken.NOT_AVAILABLE;
                t0(": was expecting closing '\"' for name");
                throw null;
            }
            byte[] bArr4 = this.f419897V;
            int i33 = this.f413852p;
            this.f413852p = i33 + 1;
            int i34 = bArr4[i33] & 255;
            return i34 == 34 ? "" : P2(this.f419891P, 0, 0, i34, 0);
        }
        byte[] bArr5 = this.f419897V;
        int i35 = i28 + 1;
        this.f413852p = i35;
        int i36 = bArr5[i28] & 255;
        if (iArr[i36] != 0) {
            return i36 == 34 ? "" : P2(this.f419891P, 0, 0, i36, 0);
        }
        int i37 = i28 + 2;
        this.f413852p = i37;
        int i38 = bArr5[i35] & 255;
        if (iArr[i38] != 0) {
            return i38 == 34 ? I2(i36, 1) : P2(this.f419891P, 0, i36, i38, 1);
        }
        int i39 = i38 | (i36 << 8);
        int i42 = i28 + 3;
        this.f413852p = i42;
        int i43 = bArr5[i37] & 255;
        if (iArr[i43] != 0) {
            return i43 == 34 ? I2(i39, 2) : P2(this.f419891P, 0, i39, i43, 2);
        }
        int i44 = (i39 << 8) | i43;
        int i45 = i28 + 4;
        this.f413852p = i45;
        int i46 = bArr5[i42] & 255;
        if (iArr[i46] != 0) {
            return i46 == 34 ? I2(i44, 3) : P2(this.f419891P, 0, i44, i46, 3);
        }
        int i47 = (i44 << 8) | i46;
        int i48 = i28 + 5;
        this.f413852p = i48;
        int i49 = bArr5[i45] & 255;
        if (iArr[i49] != 0) {
            return i49 == 34 ? I2(i47, 4) : P2(this.f419891P, 0, i47, i49, 4);
        }
        int i52 = i28 + 6;
        this.f413852p = i52;
        int i53 = bArr5[i48] & 255;
        if (iArr[i53] != 0) {
            if (i53 == 34) {
                return J2(i47, i49, 1);
            }
            int[] iArr3 = this.f419891P;
            iArr3[0] = i47;
            return P2(iArr3, 1, i49, i53, 1);
        }
        int i54 = (i49 << 8) | i53;
        int i55 = i28 + 7;
        this.f413852p = i55;
        int i56 = bArr5[i52] & 255;
        if (iArr[i56] != 0) {
            if (i56 == 34) {
                return J2(i47, i54, 2);
            }
            int[] iArr4 = this.f419891P;
            iArr4[0] = i47;
            return P2(iArr4, 1, i54, i56, 2);
        }
        int i57 = (i54 << 8) | i56;
        int i58 = i28 + 8;
        this.f413852p = i58;
        int i59 = bArr5[i55] & 255;
        if (iArr[i59] != 0) {
            if (i59 == 34) {
                return J2(i47, i57, 3);
            }
            int[] iArr5 = this.f419891P;
            iArr5[0] = i47;
            return P2(iArr5, 1, i57, i59, 3);
        }
        int i62 = (i57 << 8) | i59;
        int i63 = i28 + 9;
        this.f413852p = i63;
        int i64 = bArr5[i58] & 255;
        if (iArr[i64] != 0) {
            if (i64 == 34) {
                return J2(i47, i62, 4);
            }
            int[] iArr6 = this.f419891P;
            iArr6[0] = i47;
            return P2(iArr6, 1, i62, i64, 4);
        }
        int i65 = i28 + 10;
        this.f413852p = i65;
        int i66 = bArr5[i63] & 255;
        if (iArr[i66] != 0) {
            return i66 == 34 ? K2(i47, i62, i64, 1) : Q2(i47, i62, i64, i66, 1);
        }
        int i67 = i66 | (i64 << 8);
        int i68 = i28 + 11;
        this.f413852p = i68;
        int i69 = bArr5[i65] & 255;
        if (iArr[i69] != 0) {
            return i69 == 34 ? K2(i47, i62, i67, 2) : Q2(i47, i62, i67, i69, 2);
        }
        int i72 = (i67 << 8) | i69;
        int i73 = i28 + 12;
        this.f413852p = i73;
        int i74 = bArr5[i68] & 255;
        if (iArr[i74] != 0) {
            return i74 == 34 ? K2(i47, i62, i72, 3) : Q2(i47, i62, i72, i74, 3);
        }
        int i75 = (i72 << 8) | i74;
        this.f413852p = i29;
        int i76 = bArr5[i73] & 255;
        if (iArr[i76] != 0) {
            return i76 == 34 ? K2(i47, i62, i75, 4) : Q2(i47, i62, i75, i76, 4);
        }
        int[] iArr7 = this.f419891P;
        iArr7[0] = i47;
        iArr7[1] = i62;
        iArr7[2] = i75;
        int i77 = 3;
        while (true) {
            int i78 = this.f413852p;
            int i79 = i78 + 4;
            if (i79 > this.f413853q) {
                return P2(this.f419891P, i77, 0, i76, 0);
            }
            int i82 = i78 + 1;
            this.f413852p = i82;
            int i83 = bArr5[i78] & 255;
            if (iArr[i83] != 0) {
                return i83 == 34 ? M2(this.f419891P, i77, i76, 1) : P2(this.f419891P, i77, i76, i83, 1);
            }
            int i84 = (i76 << 8) | i83;
            int i85 = i78 + 2;
            this.f413852p = i85;
            int i86 = bArr5[i82] & 255;
            if (iArr[i86] != 0) {
                return i86 == 34 ? M2(this.f419891P, i77, i84, 2) : P2(this.f419891P, i77, i84, i86, 2);
            }
            int i87 = (i84 << 8) | i86;
            int i88 = i78 + 3;
            this.f413852p = i88;
            int i89 = bArr5[i85] & 255;
            if (iArr[i89] != 0) {
                return i89 == 34 ? M2(this.f419891P, i77, i87, 3) : P2(this.f419891P, i77, i87, i89, 3);
            }
            int i92 = (i87 << 8) | i89;
            this.f413852p = i79;
            int i93 = bArr5[i88] & 255;
            if (iArr[i93] != 0) {
                return i93 == 34 ? M2(this.f419891P, i77, i92, 4) : P2(this.f419891P, i77, i92, i93, 4);
            }
            int[] iArr8 = this.f419891P;
            if (i77 >= iArr8.length) {
                this.f419891P = AbstractC43699b.V0(i77, iArr8);
            }
            this.f419891P[i77] = i92;
            i76 = i93;
            i77++;
        }
    }

    public final JsonToken T1() throws JsonParseException {
        int i12;
        int i13;
        p pVar = this.f413862z;
        char[] cArrH = pVar.h();
        cArrH[0] = '-';
        if (this.f413852p >= this.f413853q) {
            y1();
        }
        byte[] bArr = this.f419897V;
        int i14 = this.f413852p;
        this.f413852p = i14 + 1;
        int iD2 = bArr[i14] & 255;
        if (iD2 <= 48) {
            if (iD2 != 48) {
                return v1(iD2, true);
            }
            iD2 = D2();
        } else if (iD2 > 57) {
            return v1(iD2, true);
        }
        cArrH[1] = (char) iD2;
        int i15 = 2;
        int iMin = Math.min(this.f413853q, (this.f413852p + cArrH.length) - 2);
        int i16 = 1;
        while (true) {
            i12 = this.f413852p;
            if (i12 >= iMin) {
                return U1(cArrH, i15, true, i16);
            }
            byte[] bArr2 = this.f419897V;
            this.f413852p = i12 + 1;
            i13 = bArr2[i12] & 255;
            if (i13 < 48 || i13 > 57) {
                break;
            }
            i16++;
            cArrH[i15] = (char) i13;
            i15++;
        }
        if (i13 == 46 || i13 == 101 || i13 == 69) {
            return P1(cArrH, i15, i13, true, i16);
        }
        this.f413852p = i12;
        pVar.f341321i = i15;
        if (this.f413860x.f()) {
            F2(i13);
        }
        return d1(i16, true);
    }

    public final JsonToken U1(char[] cArr, int i12, boolean z12, int i13) throws JsonParseException {
        p pVar;
        int i14;
        int i15;
        char[] cArrK = cArr;
        int i16 = i12;
        int i17 = i13;
        while (true) {
            int i18 = this.f413852p;
            int i19 = this.f413853q;
            pVar = this.f413862z;
            if (i18 >= i19 && !x1()) {
                pVar.f341321i = i16;
                return d1(i17, z12);
            }
            byte[] bArr = this.f419897V;
            i14 = this.f413852p;
            this.f413852p = i14 + 1;
            i15 = bArr[i14] & 255;
            if (i15 > 57 || i15 < 48) {
                break;
            }
            if (i16 >= cArrK.length) {
                i16 = 0;
                cArrK = pVar.k();
            }
            cArrK[i16] = (char) i15;
            i17++;
            i16++;
        }
        if (i15 == 46 || i15 == 101 || i15 == 69) {
            return P1(cArrK, i16, i15, z12, i17);
        }
        this.f413852p = i14;
        pVar.f341321i = i16;
        if (this.f413860x.f()) {
            F2(this.f419897V[this.f413852p] & 255);
        }
        return d1(i17, z12);
    }

    @Override // lX0.AbstractC43700c, com.fasterxml.jackson.core.JsonParser
    public final String V() {
        JsonToken jsonToken = this.f413872d;
        if (jsonToken != JsonToken.VALUE_STRING) {
            return jsonToken == JsonToken.FIELD_NAME ? n() : super.W();
        }
        if (!this.f419892Q) {
            return this.f413862z.g();
        }
        this.f419892Q = false;
        return s1();
    }

    @Override // lX0.AbstractC43700c, com.fasterxml.jackson.core.JsonParser
    public final String W() {
        JsonToken jsonToken = this.f413872d;
        if (jsonToken != JsonToken.VALUE_STRING) {
            return jsonToken == JsonToken.FIELD_NAME ? n() : super.W();
        }
        if (!this.f419892Q) {
            return this.f413862z.g();
        }
        this.f419892Q = false;
        return s1();
    }

    public final JsonToken Y1(int i12) throws JsonParseException {
        int i13;
        int i14;
        p pVar = this.f413862z;
        char[] cArrH = pVar.h();
        if (i12 == 48) {
            i12 = D2();
        }
        cArrH[0] = (char) i12;
        int i15 = 1;
        int iMin = Math.min(this.f413853q, (this.f413852p + cArrH.length) - 1);
        int i16 = 1;
        while (true) {
            i13 = this.f413852p;
            if (i13 >= iMin) {
                return U1(cArrH, i15, false, i16);
            }
            byte[] bArr = this.f419897V;
            this.f413852p = i13 + 1;
            i14 = bArr[i13] & 255;
            if (i14 < 48 || i14 > 57) {
                break;
            }
            i16++;
            cArrH[i15] = (char) i14;
            i15++;
        }
        if (i14 == 46 || i14 == 101 || i14 == 69) {
            return P1(cArrH, i15, i14, false, i16);
        }
        this.f413852p = i13;
        pVar.f341321i = i15;
        if (this.f413860x.f()) {
            F2(i14);
        }
        return d1(i16, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00ee A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r18v0, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int Z1(com.fasterxml.jackson.core.Base64Variant r17, java.io.OutputStream r18, byte[] r19) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: oX0.C44710j.Z1(com.fasterxml.jackson.core.Base64Variant, java.io.OutputStream, byte[]):int");
    }

    public final void d2(int i12) throws JsonParseException {
        if (i12 < 32) {
            w0(i12);
            throw null;
        }
        g2(i12);
        throw null;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final String e0() throws JsonParseException {
        JsonToken jsonTokenT1;
        this.f413842E = 0;
        JsonToken jsonToken = this.f413872d;
        JsonToken jsonToken2 = JsonToken.FIELD_NAME;
        if (jsonToken == jsonToken2) {
            K1();
            return null;
        }
        if (this.f419892Q) {
            r2();
        }
        int iA2 = A2();
        if (iA2 < 0) {
            close();
            this.f413872d = null;
            return null;
        }
        this.f413841D = null;
        if (iA2 == 93) {
            e1();
            this.f413872d = JsonToken.END_ARRAY;
            return null;
        }
        if (iA2 == 125) {
            f1();
            this.f413872d = JsonToken.END_OBJECT;
            return null;
        }
        if (this.f413860x.k()) {
            if (iA2 != 44) {
                v0(iA2, "was expecting comma to separate " + this.f413860x.h() + " entries");
                throw null;
            }
            iA2 = y2();
            if ((this.f341055b & f419879X) != 0 && (iA2 == 93 || iA2 == 125)) {
                if (iA2 == 125) {
                    f1();
                    this.f413872d = JsonToken.END_OBJECT;
                } else {
                    e1();
                    this.f413872d = JsonToken.END_ARRAY;
                }
                return null;
            }
        }
        if (!this.f413860x.e()) {
            C2();
            M1(iA2);
            return null;
        }
        this.f419894S = this.f413855s;
        int i12 = this.f413852p;
        this.f419893R = i12;
        this.f419895T = i12 - this.f413856t;
        String strS1 = S1(iA2);
        this.f413860x.l(strS1);
        this.f413872d = jsonToken2;
        int iM2 = m2();
        C2();
        if (iM2 == 34) {
            this.f419892Q = true;
            this.f413861y = JsonToken.VALUE_STRING;
            return strS1;
        }
        if (iM2 == 45) {
            jsonTokenT1 = T1();
        } else if (iM2 == 46) {
            jsonTokenT1 = R1();
        } else if (iM2 == 91) {
            jsonTokenT1 = JsonToken.START_ARRAY;
        } else if (iM2 == 102) {
            A1();
            jsonTokenT1 = JsonToken.VALUE_FALSE;
        } else if (iM2 == 110) {
            D1();
            jsonTokenT1 = JsonToken.VALUE_NULL;
        } else if (iM2 == 116) {
            I1();
            jsonTokenT1 = JsonToken.VALUE_TRUE;
        } else if (iM2 != 123) {
            switch (iM2) {
                case 48:
                case 49:
                case 50:
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                    jsonTokenT1 = Y1(iM2);
                    break;
                default:
                    jsonTokenT1 = w1(iM2);
                    break;
            }
        } else {
            jsonTokenT1 = JsonToken.START_OBJECT;
        }
        this.f413861y = jsonTokenT1;
        return strS1;
    }

    public final void e1() throws JsonParseException {
        C2();
        if (!this.f413860x.d()) {
            P0('}', 93);
            throw null;
        }
        C44704d c44704d = this.f413860x;
        c44704d.f419830g = null;
        this.f413860x = c44704d.f419826c;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final String f0() {
        if (this.f413872d != JsonToken.FIELD_NAME) {
            if (g0() == JsonToken.VALUE_STRING) {
                return L();
            }
            return null;
        }
        this.f413839B = false;
        JsonToken jsonToken = this.f413861y;
        this.f413861y = null;
        this.f413872d = jsonToken;
        if (jsonToken == JsonToken.VALUE_STRING) {
            if (!this.f419892Q) {
                return this.f413862z.g();
            }
            this.f419892Q = false;
            return s1();
        }
        if (jsonToken == JsonToken.START_ARRAY) {
            this.f413860x = this.f413860x.i(this.f413858v, this.f413859w);
        } else if (jsonToken == JsonToken.START_OBJECT) {
            this.f413860x = this.f413860x.j(this.f413858v, this.f413859w);
        }
        return null;
    }

    public final void f1() throws JsonParseException {
        C2();
        if (!this.f413860x.e()) {
            P0(']', 125);
            throw null;
        }
        C44704d c44704d = this.f413860x;
        c44704d.f419830g = null;
        this.f413860x = c44704d.f419826c;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final JsonToken g0() throws JsonParseException {
        JsonToken jsonTokenT1;
        JsonToken jsonToken = this.f413872d;
        JsonToken jsonToken2 = JsonToken.FIELD_NAME;
        if (jsonToken == jsonToken2) {
            return K1();
        }
        this.f413842E = 0;
        if (this.f419892Q) {
            r2();
        }
        int iA2 = A2();
        if (iA2 < 0) {
            close();
            this.f413872d = null;
            return null;
        }
        this.f413841D = null;
        if (iA2 == 93) {
            e1();
            JsonToken jsonToken3 = JsonToken.END_ARRAY;
            this.f413872d = jsonToken3;
            return jsonToken3;
        }
        if (iA2 == 125) {
            f1();
            JsonToken jsonToken4 = JsonToken.END_OBJECT;
            this.f413872d = jsonToken4;
            return jsonToken4;
        }
        if (this.f413860x.k()) {
            if (iA2 != 44) {
                v0(iA2, "was expecting comma to separate " + this.f413860x.h() + " entries");
                throw null;
            }
            iA2 = y2();
            if ((this.f341055b & f419879X) != 0 && (iA2 == 93 || iA2 == 125)) {
                if (iA2 == 125) {
                    f1();
                    JsonToken jsonToken5 = JsonToken.END_OBJECT;
                    this.f413872d = jsonToken5;
                    return jsonToken5;
                }
                e1();
                JsonToken jsonToken6 = JsonToken.END_ARRAY;
                this.f413872d = jsonToken6;
                return jsonToken6;
            }
        }
        if (!this.f413860x.e()) {
            C2();
            return M1(iA2);
        }
        this.f419894S = this.f413855s;
        int i12 = this.f413852p;
        this.f419893R = i12;
        this.f419895T = i12 - this.f413856t;
        this.f413860x.l(S1(iA2));
        this.f413872d = jsonToken2;
        int iM2 = m2();
        C2();
        if (iM2 == 34) {
            this.f419892Q = true;
            this.f413861y = JsonToken.VALUE_STRING;
            return this.f413872d;
        }
        if (iM2 == 45) {
            jsonTokenT1 = T1();
        } else if (iM2 == 46) {
            jsonTokenT1 = R1();
        } else if (iM2 == 91) {
            jsonTokenT1 = JsonToken.START_ARRAY;
        } else if (iM2 == 102) {
            A1();
            jsonTokenT1 = JsonToken.VALUE_FALSE;
        } else if (iM2 == 110) {
            D1();
            jsonTokenT1 = JsonToken.VALUE_NULL;
        } else if (iM2 == 116) {
            I1();
            jsonTokenT1 = JsonToken.VALUE_TRUE;
        } else if (iM2 != 123) {
            switch (iM2) {
                case 48:
                case 49:
                case 50:
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                    jsonTokenT1 = Y1(iM2);
                    break;
                default:
                    jsonTokenT1 = w1(iM2);
                    break;
            }
        } else {
            jsonTokenT1 = JsonToken.START_OBJECT;
        }
        this.f413861y = jsonTokenT1;
        return this.f413872d;
    }

    public final void g2(int i12) throws JsonParseException {
        throw new JsonParseException(this, r.m(i12, new StringBuilder("Invalid UTF-8 start byte 0x")));
    }

    @Override // lX0.AbstractC43699b, com.fasterxml.jackson.core.JsonParser
    public final byte[] i(Base64Variant base64Variant) throws JsonParseException {
        JsonToken jsonToken = this.f413872d;
        if (jsonToken != JsonToken.VALUE_STRING && (jsonToken != JsonToken.VALUE_EMBEDDED_OBJECT || this.f413841D == null)) {
            throw new JsonParseException(this, "Current token (" + this.f413872d + ") not VALUE_STRING or VALUE_EMBEDDED_OBJECT, can not access as binary");
        }
        if (this.f419892Q) {
            try {
                this.f413841D = i1(base64Variant);
                this.f419892Q = false;
            } catch (IllegalArgumentException e12) {
                throw new JsonParseException(this, "Failed to decode VALUE_STRING as base64 (" + base64Variant + "): " + e12.getMessage());
            }
        } else if (this.f413841D == null) {
            com.fasterxml.jackson.core.util.c cVarJ0 = J0();
            m0(L(), cVarJ0, base64Variant);
            this.f413841D = cVarJ0.g();
        }
        return this.f413841D;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final int i0(Base64Variant base64Variant, C36500f c36500f) throws IOException {
        if (!this.f419892Q || this.f413872d != JsonToken.VALUE_STRING) {
            byte[] bArrI = i(base64Variant);
            c36500f.write(bArrI);
            return bArrI.length;
        }
        com.fasterxml.jackson.core.io.f fVar = this.f413850n;
        byte[] bArrB = fVar.b();
        try {
            return Z1(base64Variant, c36500f, bArrB);
        } finally {
            fVar.d(bArrB);
        }
    }

    public final byte[] i1(Base64Variant base64Variant) throws JsonParseException {
        com.fasterxml.jackson.core.util.c cVarJ0 = J0();
        while (true) {
            if (this.f413852p >= this.f413853q) {
                y1();
            }
            byte[] bArr = this.f419897V;
            int i12 = this.f413852p;
            this.f413852p = i12 + 1;
            int i13 = bArr[i12] & 255;
            if (i13 > 32) {
                int iD2 = base64Variant.d(i13);
                if (iD2 < 0) {
                    if (i13 == 34) {
                        return cVarJ0.g();
                    }
                    iD2 = G0(base64Variant, i13, 0);
                    if (iD2 < 0) {
                        continue;
                    }
                }
                if (this.f413852p >= this.f413853q) {
                    y1();
                }
                byte[] bArr2 = this.f419897V;
                int i14 = this.f413852p;
                this.f413852p = i14 + 1;
                int i15 = bArr2[i14] & 255;
                int iD3 = base64Variant.d(i15);
                if (iD3 < 0) {
                    iD3 = G0(base64Variant, i15, 1);
                }
                int i16 = (iD2 << 6) | iD3;
                if (this.f413852p >= this.f413853q) {
                    y1();
                }
                byte[] bArr3 = this.f419897V;
                int i17 = this.f413852p;
                this.f413852p = i17 + 1;
                int i18 = bArr3[i17] & 255;
                int iD4 = base64Variant.d(i18);
                boolean z12 = base64Variant.f341008h;
                if (iD4 < 0) {
                    if (iD4 != -2) {
                        if (i18 == 34) {
                            cVarJ0.b(i16 >> 4);
                            if (!z12) {
                                return cVarJ0.g();
                            }
                            this.f413852p--;
                            throw new JsonParseException(this, base64Variant.k());
                        }
                        iD4 = G0(base64Variant, i18, 2);
                    }
                    if (iD4 == -2) {
                        if (this.f413852p >= this.f413853q) {
                            y1();
                        }
                        byte[] bArr4 = this.f419897V;
                        int i19 = this.f413852p;
                        this.f413852p = i19 + 1;
                        int i22 = bArr4[i19] & 255;
                        char c12 = base64Variant.f341006f;
                        if (i22 != c12 && G0(base64Variant, i22, 3) != -2) {
                            throw AbstractC43699b.Y0(base64Variant, i22, 3, "expected padding character '" + c12 + "'");
                        }
                        cVarJ0.b(i16 >> 4);
                    }
                }
                int i23 = (i16 << 6) | iD4;
                if (this.f413852p >= this.f413853q) {
                    y1();
                }
                byte[] bArr5 = this.f419897V;
                int i24 = this.f413852p;
                this.f413852p = i24 + 1;
                int i25 = bArr5[i24] & 255;
                int iD5 = base64Variant.d(i25);
                if (iD5 < 0) {
                    if (iD5 != -2) {
                        if (i25 == 34) {
                            cVarJ0.d(i23 >> 2);
                            if (!z12) {
                                return cVarJ0.g();
                            }
                            this.f413852p--;
                            throw new JsonParseException(this, base64Variant.k());
                        }
                        iD5 = G0(base64Variant, i25, 3);
                    }
                    if (iD5 == -2) {
                        cVarJ0.d(i23 >> 2);
                    }
                }
                cVarJ0.c((i23 << 6) | iD5);
            }
        }
    }

    public final void i2(int i12, int i13) throws JsonParseException {
        this.f413852p = i13;
        j2(i12);
        throw null;
    }

    public final int j1(int i12) throws JsonParseException {
        int i13;
        char c12;
        int i14 = i12 & 255;
        if (i14 <= 127) {
            return i14;
        }
        if ((i12 & 224) == 192) {
            i13 = i12 & 31;
            c12 = 1;
        } else if ((i12 & 240) == 224) {
            i13 = i12 & 15;
            c12 = 2;
        } else {
            if ((i12 & 248) != 240) {
                g2(i12 & 255);
                throw null;
            }
            i13 = i12 & 7;
            c12 = 3;
        }
        int iO2 = O2();
        if ((iO2 & 192) != 128) {
            j2(iO2 & 255);
            throw null;
        }
        int i15 = (i13 << 6) | (iO2 & 63);
        if (c12 > 1) {
            int iO22 = O2();
            if ((iO22 & 192) != 128) {
                j2(iO22 & 255);
                throw null;
            }
            i15 = (i15 << 6) | (iO22 & 63);
            if (c12 > 2) {
                int iO23 = O2();
                if ((iO23 & 192) == 128) {
                    return (iO23 & 63) | (i15 << 6);
                }
                j2(iO23 & 255);
                throw null;
            }
        }
        return i15;
    }

    public final void j2(int i12) throws JsonParseException {
        throw new JsonParseException(this, r.m(i12, new StringBuilder("Invalid UTF-8 middle byte 0x")));
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final com.fasterxml.jackson.core.j k() {
        return this.f419889N;
    }

    public final int k1(int i12) throws JsonParseException {
        if (this.f413852p >= this.f413853q) {
            y1();
        }
        byte[] bArr = this.f419897V;
        int i13 = this.f413852p;
        int i14 = i13 + 1;
        this.f413852p = i14;
        byte b12 = bArr[i13];
        if ((b12 & 192) == 128) {
            return ((i12 & 31) << 6) | (b12 & 63);
        }
        i2(b12 & 255, i14);
        throw null;
    }

    public final void k2(String str, String str2) throws JsonParseException {
        StringBuilder sb2 = new StringBuilder(str);
        while (true) {
            if (this.f413852p >= this.f413853q && !x1()) {
                break;
            }
            byte[] bArr = this.f419897V;
            int i12 = this.f413852p;
            this.f413852p = i12 + 1;
            char cJ1 = (char) j1(bArr[i12]);
            if (!Character.isJavaIdentifierPart(cJ1)) {
                break;
            }
            sb2.append(cJ1);
            if (sb2.length() >= 256) {
                sb2.append("...");
                break;
            }
        }
        throw new JsonParseException(this, "Unrecognized token '" + ((Object) sb2) + "': was expecting " + str2);
    }

    public final int l1(int i12) throws JsonParseException {
        if (this.f413852p >= this.f413853q) {
            y1();
        }
        int i13 = i12 & 15;
        byte[] bArr = this.f419897V;
        int i14 = this.f413852p;
        int i15 = i14 + 1;
        this.f413852p = i15;
        byte b12 = bArr[i14];
        if ((b12 & 192) != 128) {
            i2(b12 & 255, i15);
            throw null;
        }
        int i16 = (i13 << 6) | (b12 & 63);
        if (i15 >= this.f413853q) {
            y1();
        }
        byte[] bArr2 = this.f419897V;
        int i17 = this.f413852p;
        int i18 = i17 + 1;
        this.f413852p = i18;
        byte b13 = bArr2[i17];
        if ((b13 & 192) == 128) {
            return (i16 << 6) | (b13 & 63);
        }
        i2(b13 & 255, i18);
        throw null;
    }

    public final void l2() {
        if (this.f413852p < this.f413853q || x1()) {
            byte[] bArr = this.f419897V;
            int i12 = this.f413852p;
            if (bArr[i12] == 10) {
                this.f413852p = i12 + 1;
            }
        }
        this.f413855s++;
        this.f413856t = this.f413852p;
    }

    @Override // lX0.AbstractC43699b, com.fasterxml.jackson.core.JsonParser
    public final com.fasterxml.jackson.core.e m() {
        return new com.fasterxml.jackson.core.e(D0(), this.f413854r + this.f413852p, -1L, this.f413855s, (this.f413852p - this.f413856t) + 1);
    }

    public final int m1(int i12) throws JsonParseException {
        int i13 = i12 & 15;
        byte[] bArr = this.f419897V;
        int i14 = this.f413852p;
        int i15 = i14 + 1;
        this.f413852p = i15;
        byte b12 = bArr[i14];
        if ((b12 & 192) != 128) {
            i2(b12 & 255, i15);
            throw null;
        }
        int i16 = (i13 << 6) | (b12 & 63);
        int i17 = i14 + 2;
        this.f413852p = i17;
        byte b13 = bArr[i15];
        if ((b13 & 192) == 128) {
            return (i16 << 6) | (b13 & 63);
        }
        i2(b13 & 255, i17);
        throw null;
    }

    public final int m2() {
        int i12 = this.f413852p;
        if (i12 + 4 >= this.f413853q) {
            return o2(false);
        }
        byte[] bArr = this.f419897V;
        byte b12 = bArr[i12];
        if (b12 == 58) {
            int i13 = i12 + 1;
            this.f413852p = i13;
            byte b13 = bArr[i13];
            if (b13 > 32) {
                if (b13 == 47 || b13 == 35) {
                    return o2(true);
                }
                this.f413852p = i12 + 2;
                return b13;
            }
            if (b13 == 32 || b13 == 9) {
                int i14 = i12 + 2;
                this.f413852p = i14;
                byte b14 = bArr[i14];
                if (b14 > 32) {
                    if (b14 == 47 || b14 == 35) {
                        return o2(true);
                    }
                    this.f413852p = i12 + 3;
                    return b14;
                }
            }
            return o2(true);
        }
        if (b12 == 32 || b12 == 9) {
            int i15 = i12 + 1;
            this.f413852p = i15;
            b12 = bArr[i15];
        }
        if (b12 != 58) {
            return o2(false);
        }
        int i16 = this.f413852p;
        int i17 = i16 + 1;
        this.f413852p = i17;
        byte b15 = bArr[i17];
        if (b15 > 32) {
            if (b15 == 47 || b15 == 35) {
                return o2(true);
            }
            this.f413852p = i16 + 2;
            return b15;
        }
        if (b15 == 32 || b15 == 9) {
            int i18 = i16 + 2;
            this.f413852p = i18;
            byte b16 = bArr[i18];
            if (b16 > 32) {
                if (b16 == 47 || b16 == 35) {
                    return o2(true);
                }
                this.f413852p = i16 + 3;
                return b16;
            }
        }
        return o2(true);
    }

    public final int o1(int i12) throws JsonParseException {
        if (this.f413852p >= this.f413853q) {
            y1();
        }
        byte[] bArr = this.f419897V;
        int i13 = this.f413852p;
        int i14 = i13 + 1;
        this.f413852p = i14;
        byte b12 = bArr[i13];
        if ((b12 & 192) != 128) {
            i2(b12 & 255, i14);
            throw null;
        }
        int i15 = ((i12 & 7) << 6) | (b12 & 63);
        if (i14 >= this.f413853q) {
            y1();
        }
        byte[] bArr2 = this.f419897V;
        int i16 = this.f413852p;
        int i17 = i16 + 1;
        this.f413852p = i17;
        byte b13 = bArr2[i16];
        if ((b13 & 192) != 128) {
            i2(b13 & 255, i17);
            throw null;
        }
        int i18 = (i15 << 6) | (b13 & 63);
        if (i17 >= this.f413853q) {
            y1();
        }
        byte[] bArr3 = this.f419897V;
        int i19 = this.f413852p;
        int i22 = i19 + 1;
        this.f413852p = i22;
        byte b14 = bArr3[i19];
        if ((b14 & 192) == 128) {
            return ((i18 << 6) | (b14 & 63)) - AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR;
        }
        i2(b14 & 255, i22);
        throw null;
    }

    public final int o2(boolean z12) throws JsonParseException {
        while (true) {
            if (this.f413852p >= this.f413853q && !x1()) {
                t0(" within/between " + this.f413860x.h() + " entries");
                throw null;
            }
            byte[] bArr = this.f419897V;
            int i12 = this.f413852p;
            int i13 = i12 + 1;
            this.f413852p = i13;
            int i14 = bArr[i12] & 255;
            if (i14 > 32) {
                if (i14 == 47) {
                    p2();
                } else if (i14 == 35 && (this.f341055b & f419886e0) != 0) {
                    q2();
                } else {
                    if (z12) {
                        return i14;
                    }
                    if (i14 != 58) {
                        v0(i14, "was expecting a colon to separate field name and value");
                        throw null;
                    }
                    z12 = true;
                }
            } else if (i14 == 32) {
                continue;
            } else if (i14 == 10) {
                this.f413855s++;
                this.f413856t = i13;
            } else if (i14 == 13) {
                l2();
            } else if (i14 != 9) {
                w0(i14);
                throw null;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x006f, code lost:
    
        t0(" in a comment");
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0072, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p2() throws com.fasterxml.jackson.core.JsonParseException {
        /*
            r9 = this;
            int r0 = r9.f341055b
            int r1 = oX0.C44710j.f419885d0
            r0 = r0 & r1
            r1 = 0
            r2 = 47
            if (r0 == 0) goto La3
            int r0 = r9.f413852p
            int r3 = r9.f413853q
            java.lang.String r4 = " in a comment"
            if (r0 < r3) goto L1d
            boolean r0 = r9.x1()
            if (r0 == 0) goto L19
            goto L1d
        L19:
            r9.t0(r4)
            throw r1
        L1d:
            byte[] r0 = r9.f419897V
            int r3 = r9.f413852p
            int r5 = r3 + 1
            r9.f413852p = r5
            r0 = r0[r3]
            r0 = r0 & 255(0xff, float:3.57E-43)
            if (r0 != r2) goto L2f
            r9.q2()
            goto L7f
        L2f:
            r3 = 42
            if (r0 != r3) goto L9d
            int[] r5 = com.fasterxml.jackson.core.io.b.f341150g
        L35:
            int r0 = r9.f413852p
            int r6 = r9.f413853q
            if (r0 < r6) goto L41
            boolean r0 = r9.x1()
            if (r0 == 0) goto L6f
        L41:
            byte[] r0 = r9.f419897V
            int r6 = r9.f413852p
            int r7 = r6 + 1
            r9.f413852p = r7
            r0 = r0[r6]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r6 = r5[r0]
            if (r6 == 0) goto L35
            r8 = 2
            if (r6 == r8) goto L99
            r8 = 3
            if (r6 == r8) goto L95
            r8 = 4
            if (r6 == r8) goto L91
            r8 = 10
            if (r6 == r8) goto L88
            r8 = 13
            if (r6 == r8) goto L84
            if (r6 != r3) goto L80
            int r0 = r9.f413853q
            if (r7 < r0) goto L73
            boolean r0 = r9.x1()
            if (r0 == 0) goto L6f
            goto L73
        L6f:
            r9.t0(r4)
            throw r1
        L73:
            byte[] r0 = r9.f419897V
            int r6 = r9.f413852p
            r0 = r0[r6]
            if (r0 != r2) goto L35
            int r6 = r6 + 1
            r9.f413852p = r6
        L7f:
            return
        L80:
            r9.d2(r0)
            throw r1
        L84:
            r9.l2()
            goto L35
        L88:
            int r0 = r9.f413855s
            int r0 = r0 + 1
            r9.f413855s = r0
            r9.f413856t = r7
            goto L35
        L91:
            r9.x2()
            goto L35
        L95:
            r9.w2()
            goto L35
        L99:
            r9.u2()
            goto L35
        L9d:
            java.lang.String r2 = "was expecting either '*' or '/' for a comment"
            r9.v0(r0, r2)
            throw r1
        La3:
            java.lang.String r0 = "maybe a (non-standard) comment? (not recognized as one since Feature 'ALLOW_COMMENTS' not enabled for parser)"
            r9.v0(r2, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: oX0.C44710j.p2():void");
    }

    public final void q2() throws JsonParseException {
        int[] iArr = com.fasterxml.jackson.core.io.b.f341150g;
        while (true) {
            if (this.f413852p >= this.f413853q && !x1()) {
                return;
            }
            byte[] bArr = this.f419897V;
            int i12 = this.f413852p;
            int i13 = i12 + 1;
            this.f413852p = i13;
            int i14 = bArr[i12] & 255;
            int i15 = iArr[i14];
            if (i15 != 0) {
                if (i15 == 2) {
                    u2();
                } else if (i15 == 3) {
                    w2();
                } else if (i15 == 4) {
                    x2();
                } else if (i15 == 10) {
                    this.f413855s++;
                    this.f413856t = i13;
                    return;
                } else if (i15 == 13) {
                    l2();
                    return;
                } else if (i15 != 42 && i15 < 0) {
                    d2(i14);
                    throw null;
                }
            }
        }
    }

    public final void r2() throws JsonParseException {
        this.f419892Q = false;
        byte[] bArr = this.f419897V;
        while (true) {
            int i12 = this.f413852p;
            int i13 = this.f413853q;
            if (i12 >= i13) {
                y1();
                i12 = this.f413852p;
                i13 = this.f413853q;
            }
            while (true) {
                if (i12 >= i13) {
                    this.f413852p = i12;
                    break;
                }
                int i14 = i12 + 1;
                int i15 = bArr[i12] & 255;
                int i16 = f419887f0[i15];
                if (i16 != 0) {
                    this.f413852p = i14;
                    if (i15 == 34) {
                        return;
                    }
                    if (i16 == 1) {
                        H0();
                    } else if (i16 == 2) {
                        u2();
                    } else if (i16 == 3) {
                        w2();
                    } else if (i16 == 4) {
                        x2();
                    } else {
                        if (i15 >= 32) {
                            d2(i15);
                            throw null;
                        }
                        Q0(i15, "string value");
                    }
                } else {
                    i12 = i14;
                }
            }
        }
    }

    public final String s1() throws JsonParseException {
        int i12 = this.f413852p;
        if (i12 >= this.f413853q) {
            y1();
            i12 = this.f413852p;
        }
        p pVar = this.f413862z;
        char[] cArrH = pVar.h();
        int iMin = Math.min(this.f413853q, cArrH.length + i12);
        byte[] bArr = this.f419897V;
        int i13 = 0;
        while (true) {
            if (i12 >= iMin) {
                break;
            }
            int i14 = bArr[i12] & 255;
            if (f419887f0[i14] == 0) {
                i12++;
                cArrH[i13] = (char) i14;
                i13++;
            } else if (i14 == 34) {
                this.f413852p = i12 + 1;
                pVar.f341321i = i13;
                if (pVar.f341319g > 0) {
                    return pVar.g();
                }
                String str = i13 == 0 ? "" : new String(pVar.f341320h, 0, i13);
                pVar.f341322j = str;
                return str;
            }
        }
        this.f413852p = i12;
        u1(i13, cArrH);
        return pVar.g();
    }

    public final void t1() throws JsonParseException {
        int i12 = this.f413852p;
        if (i12 >= this.f413853q) {
            y1();
            i12 = this.f413852p;
        }
        p pVar = this.f413862z;
        char[] cArrH = pVar.h();
        int iMin = Math.min(this.f413853q, cArrH.length + i12);
        byte[] bArr = this.f419897V;
        int i13 = 0;
        while (true) {
            if (i12 >= iMin) {
                break;
            }
            int i14 = bArr[i12] & 255;
            if (f419887f0[i14] == 0) {
                i12++;
                cArrH[i13] = (char) i14;
                i13++;
            } else if (i14 == 34) {
                this.f413852p = i12 + 1;
                pVar.f341321i = i13;
                return;
            }
        }
        this.f413852p = i12;
        u1(i13, cArrH);
    }

    public final void u1(int i12, char[] cArr) throws JsonParseException {
        byte[] bArr = this.f419897V;
        while (true) {
            int i13 = this.f413852p;
            if (i13 >= this.f413853q) {
                y1();
                i13 = this.f413852p;
            }
            int length = cArr.length;
            p pVar = this.f413862z;
            int i14 = 0;
            if (i12 >= length) {
                cArr = pVar.k();
                i12 = 0;
            }
            int iMin = Math.min(this.f413853q, (cArr.length - i12) + i13);
            while (true) {
                if (i13 >= iMin) {
                    this.f413852p = i13;
                    break;
                }
                int i15 = i13 + 1;
                int iH02 = bArr[i13] & 255;
                int i16 = f419887f0[iH02];
                if (i16 != 0) {
                    this.f413852p = i15;
                    if (iH02 == 34) {
                        pVar.f341321i = i12;
                        return;
                    }
                    if (i16 == 1) {
                        iH02 = H0();
                    } else if (i16 == 2) {
                        iH02 = k1(iH02);
                    } else if (i16 == 3) {
                        iH02 = this.f413853q - i15 >= 2 ? m1(iH02) : l1(iH02);
                    } else if (i16 == 4) {
                        int iO1 = o1(iH02);
                        int i17 = i12 + 1;
                        cArr[i12] = (char) ((iO1 >> 10) | 55296);
                        if (i17 >= cArr.length) {
                            cArr = pVar.k();
                            i12 = 0;
                        } else {
                            i12 = i17;
                        }
                        iH02 = (iO1 & 1023) | 56320;
                    } else {
                        if (iH02 >= 32) {
                            d2(iH02);
                            throw null;
                        }
                        Q0(iH02, "string value");
                    }
                    if (i12 >= cArr.length) {
                        cArr = pVar.k();
                    } else {
                        i14 = i12;
                    }
                    i12 = i14 + 1;
                    cArr[i14] = (char) iH02;
                } else {
                    cArr[i12] = (char) iH02;
                    i13 = i15;
                    i12++;
                }
            }
        }
    }

    public final void u2() throws JsonParseException {
        if (this.f413852p >= this.f413853q) {
            y1();
        }
        byte[] bArr = this.f419897V;
        int i12 = this.f413852p;
        int i13 = i12 + 1;
        this.f413852p = i13;
        byte b12 = bArr[i12];
        if ((b12 & 192) == 128) {
            return;
        }
        i2(b12 & 255, i13);
        throw null;
    }

    public final JsonToken v1(int i12, boolean z12) throws JsonParseException {
        String str;
        if (i12 == 73) {
            if (this.f413852p >= this.f413853q && !x1()) {
                u0(JsonToken.VALUE_NUMBER_FLOAT);
                throw null;
            }
            byte[] bArr = this.f419897V;
            int i13 = this.f413852p;
            this.f413852p = i13 + 1;
            i12 = bArr[i13];
            if (i12 == 78) {
                str = z12 ? "-INF" : "+INF";
            } else if (i12 == 110) {
                str = z12 ? "-Infinity" : "+Infinity";
            }
            F1(3, str);
            if ((this.f341055b & f419881Z) != 0) {
                return Z0(str, z12 ? Double.NEGATIVE_INFINITY : Double.POSITIVE_INFINITY);
            }
            throw new JsonParseException(this, AK.c.k("Non-standard token '", str, "': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow"));
        }
        A0(i12, "expected digit (0-9) to follow minus sign, for valid numeric value");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x001f, code lost:
    
        if (r13 != 44) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x004d, code lost:
    
        if (r12.f413860x.d() == false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0057, code lost:
    
        if (r12.f413860x.f() != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005e, code lost:
    
        if ((r12.f341055b & oX0.C44710j.f419882a0) == 0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0060, code lost:
    
        r12.f413852p--;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0067, code lost:
    
        return com.fasterxml.jackson.core.JsonToken.VALUE_NULL;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.fasterxml.jackson.core.JsonToken w1(int r13) throws com.fasterxml.jackson.core.JsonParseException {
        /*
            Method dump skipped, instructions count: 379
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: oX0.C44710j.w1(int):com.fasterxml.jackson.core.JsonToken");
    }

    public final void w2() throws JsonParseException {
        if (this.f413852p >= this.f413853q) {
            y1();
        }
        byte[] bArr = this.f419897V;
        int i12 = this.f413852p;
        int i13 = i12 + 1;
        this.f413852p = i13;
        byte b12 = bArr[i12];
        if ((b12 & 192) != 128) {
            i2(b12 & 255, i13);
            throw null;
        }
        if (i13 >= this.f413853q) {
            y1();
        }
        byte[] bArr2 = this.f419897V;
        int i14 = this.f413852p;
        int i15 = i14 + 1;
        this.f413852p = i15;
        byte b13 = bArr2[i14];
        if ((b13 & 192) == 128) {
            return;
        }
        i2(b13 & 255, i15);
        throw null;
    }

    public final boolean x1() throws IOException {
        byte[] bArr;
        int length;
        InputStream inputStream = this.f419896U;
        if (inputStream == null || (length = (bArr = this.f419897V).length) == 0) {
            return false;
        }
        int i12 = inputStream.read(bArr, 0, length);
        if (i12 <= 0) {
            B0();
            if (i12 == 0) {
                throw new IOException(AK.c.i(this.f419897V.length, " bytes", new StringBuilder("InputStream.read() returned 0 characters when trying to read ")));
            }
            return false;
        }
        int i13 = this.f413853q;
        this.f413854r += i13;
        this.f413856t -= i13;
        this.f419893R -= i13;
        this.f413852p = 0;
        this.f413853q = i12;
        return true;
    }

    public final void x2() throws JsonParseException {
        if (this.f413852p >= this.f413853q) {
            y1();
        }
        byte[] bArr = this.f419897V;
        int i12 = this.f413852p;
        int i13 = i12 + 1;
        this.f413852p = i13;
        byte b12 = bArr[i12];
        if ((b12 & 192) != 128) {
            i2(b12 & 255, i13);
            throw null;
        }
        if (i13 >= this.f413853q) {
            y1();
        }
        byte[] bArr2 = this.f419897V;
        int i14 = this.f413852p;
        int i15 = i14 + 1;
        this.f413852p = i15;
        byte b13 = bArr2[i14];
        if ((b13 & 192) != 128) {
            i2(b13 & 255, i15);
            throw null;
        }
        if (i15 >= this.f413853q) {
            y1();
        }
        byte[] bArr3 = this.f419897V;
        int i16 = this.f413852p;
        int i17 = i16 + 1;
        this.f413852p = i17;
        byte b14 = bArr3[i16];
        if ((b14 & 192) == 128) {
            return;
        }
        i2(b14 & 255, i17);
        throw null;
    }

    public final void y1() {
        if (x1()) {
            return;
        }
        s0();
        throw null;
    }

    public final int y2() throws JsonParseException {
        while (true) {
            int i12 = this.f413852p;
            if (i12 >= this.f413853q) {
                return z2();
            }
            byte[] bArr = this.f419897V;
            int i13 = i12 + 1;
            this.f413852p = i13;
            int i14 = bArr[i12] & 255;
            if (i14 > 32) {
                if (i14 != 47 && i14 != 35) {
                    return i14;
                }
                this.f413852p = i12;
                return z2();
            }
            if (i14 != 32) {
                if (i14 == 10) {
                    this.f413855s++;
                    this.f413856t = i13;
                } else if (i14 == 13) {
                    l2();
                } else if (i14 != 9) {
                    w0(i14);
                    throw null;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0054, code lost:
    
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int z2() throws com.fasterxml.jackson.core.JsonParseException {
        /*
            r3 = this;
        L0:
            int r0 = r3.f413852p
            int r1 = r3.f413853q
            if (r0 < r1) goto L2c
            boolean r0 = r3.x1()
            if (r0 == 0) goto Ld
            goto L2c
        Ld:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unexpected end-of-input within/between "
            r0.<init>(r1)
            oX0.d r1 = r3.f413860x
            java.lang.String r1 = r1.h()
            r0.append(r1)
            java.lang.String r1 = " entries"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.fasterxml.jackson.core.JsonParseException r1 = new com.fasterxml.jackson.core.JsonParseException
            r1.<init>(r3, r0)
            throw r1
        L2c:
            byte[] r0 = r3.f419897V
            int r1 = r3.f413852p
            int r2 = r1 + 1
            r3.f413852p = r2
            r0 = r0[r1]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = 32
            if (r0 <= r1) goto L55
            r1 = 47
            if (r0 != r1) goto L44
            r3.p2()
            goto L0
        L44:
            r1 = 35
            if (r0 != r1) goto L54
            int r1 = r3.f341055b
            int r2 = oX0.C44710j.f419886e0
            r1 = r1 & r2
            if (r1 != 0) goto L50
            goto L54
        L50:
            r3.q2()
            goto L0
        L54:
            return r0
        L55:
            if (r0 == r1) goto L0
            r1 = 10
            if (r0 != r1) goto L64
            int r0 = r3.f413855s
            int r0 = r0 + 1
            r3.f413855s = r0
            r3.f413856t = r2
            goto L0
        L64:
            r1 = 13
            if (r0 != r1) goto L6c
            r3.l2()
            goto L0
        L6c:
            r1 = 9
            if (r0 != r1) goto L71
            goto L0
        L71:
            r3.w0(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: oX0.C44710j.z2():int");
    }
}
