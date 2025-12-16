package oX0;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.StreamReadCapability;
import com.fasterxml.jackson.core.json.JsonReadFeature;
import com.fasterxml.jackson.core.util.p;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.util.C36500f;
import java.io.IOException;
import java.io.Reader;
import lX0.AbstractC43699b;

/* compiled from: ReaderBasedJsonParser.java */
/* renamed from: oX0.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C44707g extends AbstractC43699b {

    /* renamed from: X, reason: collision with root package name */
    public static final int f419839X = JsonParser.Feature.ALLOW_TRAILING_COMMA.f341073c;

    /* renamed from: Y, reason: collision with root package name */
    public static final int f419840Y = JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS.f341073c;

    /* renamed from: Z, reason: collision with root package name */
    public static final int f419841Z = JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS.f341073c;

    /* renamed from: a0, reason: collision with root package name */
    public static final int f419842a0 = JsonParser.Feature.ALLOW_MISSING_VALUES.f341073c;

    /* renamed from: b0, reason: collision with root package name */
    public static final int f419843b0 = JsonParser.Feature.ALLOW_SINGLE_QUOTES.f341073c;

    /* renamed from: c0, reason: collision with root package name */
    public static final int f419844c0 = JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES.f341073c;

    /* renamed from: d0, reason: collision with root package name */
    public static final int f419845d0 = JsonParser.Feature.ALLOW_COMMENTS.f341073c;

    /* renamed from: e0, reason: collision with root package name */
    public static final int f419846e0 = JsonParser.Feature.ALLOW_YAML_COMMENTS.f341073c;

    /* renamed from: f0, reason: collision with root package name */
    public static final int[] f419847f0 = com.fasterxml.jackson.core.io.b.f341146c;

    /* renamed from: N, reason: collision with root package name */
    public Reader f419848N;

    /* renamed from: O, reason: collision with root package name */
    public char[] f419849O;

    /* renamed from: P, reason: collision with root package name */
    public final boolean f419850P;

    /* renamed from: Q, reason: collision with root package name */
    public final ObjectMapper f419851Q;

    /* renamed from: R, reason: collision with root package name */
    public final com.fasterxml.jackson.core.sym.b f419852R;

    /* renamed from: S, reason: collision with root package name */
    public final int f419853S;

    /* renamed from: T, reason: collision with root package name */
    public boolean f419854T;

    /* renamed from: U, reason: collision with root package name */
    public long f419855U;

    /* renamed from: V, reason: collision with root package name */
    public int f419856V;

    /* renamed from: W, reason: collision with root package name */
    public int f419857W;

    public C44707g(com.fasterxml.jackson.core.io.f fVar, int i12, Reader reader, ObjectMapper objectMapper, com.fasterxml.jackson.core.sym.b bVar) {
        super(fVar, i12);
        this.f419848N = reader;
        com.fasterxml.jackson.core.io.f.a(fVar.f341168i);
        char[] cArrB = fVar.f341164e.b(0, 0);
        fVar.f341168i = cArrB;
        this.f419849O = cArrB;
        this.f413852p = 0;
        this.f413853q = 0;
        this.f419851Q = objectMapper;
        this.f419852R = bVar;
        this.f419853S = bVar.f341246c;
        this.f419850P = true;
    }

    public final String A1() {
        int i12 = this.f413852p;
        int i13 = this.f419853S;
        while (true) {
            if (i12 >= this.f413853q) {
                break;
            }
            char[] cArr = this.f419849O;
            char c12 = cArr[i12];
            int[] iArr = f419847f0;
            if (c12 >= iArr.length || iArr[c12] == 0) {
                i13 = (i13 * 33) + c12;
                i12++;
            } else if (c12 == '\"') {
                int i14 = this.f413852p;
                this.f413852p = i12 + 1;
                return this.f419852R.c(i14, i12 - i14, cArr, i13);
            }
        }
        int i15 = this.f413852p;
        this.f413852p = i12;
        return D1(i15, i13, 34);
    }

    @Override // lX0.AbstractC43699b
    public final void B0() throws IOException {
        if (this.f419848N != null) {
            if (this.f413850n.f341163d || JsonParser.Feature.AUTO_CLOSE_SOURCE.a(this.f341055b)) {
                this.f419848N.close();
            }
            this.f419848N = null;
        }
    }

    public final String D1(int i12, int i13, int i14) throws JsonParseException {
        char[] cArr = this.f419849O;
        int i15 = this.f413852p - i12;
        p pVar = this.f413862z;
        pVar.p(cArr, i12, i15);
        char[] cArrL = pVar.l();
        int i16 = pVar.f341321i;
        while (true) {
            if (this.f413852p >= this.f413853q && !m1()) {
                JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
                t0(" in field name");
                throw null;
            }
            char[] cArr2 = this.f419849O;
            int i17 = this.f413852p;
            this.f413852p = i17 + 1;
            char cH02 = cArr2[i17];
            if (cH02 <= '\\') {
                if (cH02 == '\\') {
                    cH02 = H0();
                } else if (cH02 <= i14) {
                    if (cH02 == i14) {
                        pVar.f341321i = i16;
                        char[] cArrM = pVar.m();
                        return this.f419852R.c(pVar.n(), pVar.q(), cArrM, i13);
                    }
                    if (cH02 < ' ') {
                        Q0(cH02, "name");
                    }
                }
            }
            i13 = (i13 * 33) + cH02;
            int i18 = i16 + 1;
            cArrL[i16] = cH02;
            if (i18 >= cArrL.length) {
                cArrL = pVar.k();
                i16 = 0;
            } else {
                i16 = i18;
            }
        }
    }

    public final JsonToken F1() throws JsonParseException {
        int i12 = this.f413852p;
        int i13 = i12 - 1;
        int i14 = this.f413853q;
        if (i12 >= i14) {
            return H1(i13, true);
        }
        int i15 = i12 + 1;
        char c12 = this.f419849O[i12];
        if (c12 > '9' || c12 < '0') {
            this.f413852p = i15;
            return j1(c12, true);
        }
        if (c12 == '0') {
            return H1(i13, true);
        }
        int i16 = 1;
        while (i15 < i14) {
            int i17 = i15 + 1;
            char c13 = this.f419849O[i15];
            if (c13 < '0' || c13 > '9') {
                if (c13 == '.' || c13 == 'e' || c13 == 'E') {
                    this.f413852p = i17;
                    return x1(c13, i13, i17, i16, true);
                }
                this.f413852p = i15;
                if (this.f413860x.f()) {
                    j2(c13);
                }
                this.f413862z.p(this.f419849O, i13, i15 - i13);
                return d1(i16, true);
            }
            i16++;
            i15 = i17;
        }
        return H1(i13, true);
    }

    @Override // lX0.AbstractC43699b
    public final char H0() throws JsonParseException {
        if (this.f413852p >= this.f413853q && !m1()) {
            JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
            t0(" in character escape sequence");
            throw null;
        }
        char[] cArr = this.f419849O;
        int i12 = this.f413852p;
        this.f413852p = i12 + 1;
        char c12 = cArr[i12];
        if (c12 == '\"' || c12 == '/' || c12 == '\\') {
            return c12;
        }
        if (c12 == 'b') {
            return '\b';
        }
        if (c12 == 'f') {
            return '\f';
        }
        if (c12 == 'n') {
            return '\n';
        }
        if (c12 == 'r') {
            return '\r';
        }
        if (c12 == 't') {
            return '\t';
        }
        if (c12 != 'u') {
            K0(c12);
            return c12;
        }
        int i13 = 0;
        for (int i14 = 0; i14 < 4; i14++) {
            if (this.f413852p >= this.f413853q && !m1()) {
                JsonToken jsonToken2 = JsonToken.NOT_AVAILABLE;
                t0(" in character escape sequence");
                throw null;
            }
            char[] cArr2 = this.f419849O;
            int i15 = this.f413852p;
            this.f413852p = i15 + 1;
            char c13 = cArr2[i15];
            int i16 = com.fasterxml.jackson.core.io.b.f341152i[c13 & 255];
            if (i16 < 0) {
                v0(c13, "expected a hex-digit for character escape sequence");
                throw null;
            }
            i13 = (i13 << 4) | i16;
        }
        return (char) i13;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0052 A[EDGE_INSN: B:25:0x0052->B:47:0x0090 BREAK  A[LOOP:0: B:34:0x006b->B:144:?]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.fasterxml.jackson.core.JsonToken H1(int r17, boolean r18) throws com.fasterxml.jackson.core.JsonParseException {
        /*
            Method dump skipped, instructions count: 450
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: oX0.C44707g.H1(int, boolean):com.fasterxml.jackson.core.JsonToken");
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final com.fasterxml.jackson.core.util.i<StreamReadCapability> I() {
        return AbstractC43699b.f413837M;
    }

    public final JsonToken I1(int i12) throws JsonParseException {
        int i13 = this.f413852p;
        int i14 = i13 - 1;
        int i15 = this.f413853q;
        if (i12 == 48) {
            return H1(i14, false);
        }
        int i16 = 1;
        while (i13 < i15) {
            int i17 = i13 + 1;
            char c12 = this.f419849O[i13];
            if (c12 < '0' || c12 > '9') {
                if (c12 == '.' || c12 == 'e' || c12 == 'E') {
                    this.f413852p = i17;
                    return x1(c12, i14, i17, i16, false);
                }
                this.f413852p = i13;
                if (this.f413860x.f()) {
                    j2(c12);
                }
                this.f413862z.p(this.f419849O, i14, i13 - i14);
                return d1(i16, false);
            }
            i16++;
            i13 = i17;
        }
        this.f413852p = i14;
        return H1(i14, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e6 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r18v0, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int K1(com.fasterxml.jackson.core.Base64Variant r17, java.io.OutputStream r18, byte[] r19) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: oX0.C44707g.K1(com.fasterxml.jackson.core.Base64Variant, java.io.OutputStream, byte[]):int");
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final String L() throws JsonParseException {
        JsonToken jsonToken = this.f413872d;
        JsonToken jsonToken2 = JsonToken.VALUE_STRING;
        p pVar = this.f413862z;
        if (jsonToken == jsonToken2) {
            if (this.f419854T) {
                this.f419854T = false;
                i1();
            }
            return pVar.g();
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
            } else if (this.f419854T) {
                this.f419854T = false;
                i1();
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

    public final void M1(String str, String str2) throws JsonParseException {
        StringBuilder sb2 = new StringBuilder(str);
        while (true) {
            if (this.f413852p >= this.f413853q && !m1()) {
                break;
            }
            char c12 = this.f419849O[this.f413852p];
            if (!Character.isJavaIdentifierPart(c12)) {
                break;
            }
            this.f413852p++;
            sb2.append(c12);
            if (sb2.length() >= 256) {
                sb2.append("...");
                break;
            }
        }
        throw new JsonParseException(this, "Unrecognized token '" + ((Object) sb2) + "': was expecting " + str2);
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
        } else if (this.f419854T) {
            this.f419854T = false;
            i1();
        }
        return this.f413862z.q();
    }

    @Override // lX0.AbstractC43699b
    public final void N0() {
        char[] cArr;
        super.N0();
        this.f419852R.e();
        if (!this.f419850P || (cArr = this.f419849O) == null) {
            return;
        }
        this.f419849O = null;
        com.fasterxml.jackson.core.io.f fVar = this.f413850n;
        char[] cArr2 = fVar.f341168i;
        if (cArr != cArr2 && cArr.length < cArr2.length) {
            throw new IllegalArgumentException("Trying to release buffer smaller than original");
        }
        fVar.f341168i = null;
        fVar.f341164e.f341280b.set(0, cArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0052, code lost:
    
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int N1() throws com.fasterxml.jackson.core.JsonParseException {
        /*
            r3 = this;
        L0:
            int r0 = r3.f413852p
            int r1 = r3.f413853q
            if (r0 < r1) goto L2c
            boolean r0 = r3.m1()
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
            char[] r0 = r3.f419849O
            int r1 = r3.f413852p
            int r2 = r1 + 1
            r3.f413852p = r2
            char r0 = r0[r1]
            r1 = 32
            if (r0 <= r1) goto L53
            r1 = 47
            if (r0 != r1) goto L42
            r3.U1()
            goto L0
        L42:
            r1 = 35
            if (r0 != r1) goto L52
            int r1 = r3.f341055b
            int r2 = oX0.C44707g.f419846e0
            r1 = r1 & r2
            if (r1 != 0) goto L4e
            goto L52
        L4e:
            r3.Y1()
            goto L0
        L52:
            return r0
        L53:
            if (r0 >= r1) goto L0
            r1 = 10
            if (r0 != r1) goto L62
            int r0 = r3.f413855s
            int r0 = r0 + 1
            r3.f413855s = r0
            r3.f413856t = r2
            goto L0
        L62:
            r1 = 13
            if (r0 != r1) goto L6a
            r3.P1()
            goto L0
        L6a:
            r1 = 9
            if (r0 != r1) goto L6f
            goto L0
        L6f:
            r3.w0(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: oX0.C44707g.N1():int");
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
            boolean r0 = r3.f419854T
            if (r0 == 0) goto L1b
            r3.f419854T = r1
            r3.i1()
        L1b:
            com.fasterxml.jackson.core.util.p r0 = r3.f413862z
            int r0 = r0.n()
            return r0
        L22:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: oX0.C44707g.O():int");
    }

    @Override // lX0.AbstractC43699b, lX0.AbstractC43700c, com.fasterxml.jackson.core.JsonParser
    public final com.fasterxml.jackson.core.e P() {
        if (this.f413872d != JsonToken.FIELD_NAME) {
            return new com.fasterxml.jackson.core.e(D0(), -1L, this.f413857u - 1, this.f413858v, this.f413859w);
        }
        return new com.fasterxml.jackson.core.e(D0(), -1L, (this.f419855U - 1) + this.f413854r, this.f419856V, this.f419857W);
    }

    public final void P1() {
        if (this.f413852p < this.f413853q || m1()) {
            char[] cArr = this.f419849O;
            int i12 = this.f413852p;
            if (cArr[i12] == '\n') {
                this.f413852p = i12 + 1;
            }
        }
        this.f413855s++;
        this.f413856t = this.f413852p;
    }

    public final int R1() {
        int i12 = this.f413852p;
        if (i12 + 4 >= this.f413853q) {
            return S1(false);
        }
        char[] cArr = this.f419849O;
        char c12 = cArr[i12];
        if (c12 == ':') {
            int i13 = i12 + 1;
            this.f413852p = i13;
            char c13 = cArr[i13];
            if (c13 > ' ') {
                if (c13 == '/' || c13 == '#') {
                    return S1(true);
                }
                this.f413852p = i12 + 2;
                return c13;
            }
            if (c13 == ' ' || c13 == '\t') {
                int i14 = i12 + 2;
                this.f413852p = i14;
                char c14 = cArr[i14];
                if (c14 > ' ') {
                    if (c14 == '/' || c14 == '#') {
                        return S1(true);
                    }
                    this.f413852p = i12 + 3;
                    return c14;
                }
            }
            return S1(true);
        }
        if (c12 == ' ' || c12 == '\t') {
            int i15 = i12 + 1;
            this.f413852p = i15;
            c12 = cArr[i15];
        }
        if (c12 != ':') {
            return S1(false);
        }
        int i16 = this.f413852p;
        int i17 = i16 + 1;
        this.f413852p = i17;
        char c15 = cArr[i17];
        if (c15 > ' ') {
            if (c15 == '/' || c15 == '#') {
                return S1(true);
            }
            this.f413852p = i16 + 2;
            return c15;
        }
        if (c15 == ' ' || c15 == '\t') {
            int i18 = i16 + 2;
            this.f413852p = i18;
            char c16 = cArr[i18];
            if (c16 > ' ') {
                if (c16 == '/' || c16 == '#') {
                    return S1(true);
                }
                this.f413852p = i16 + 3;
                return c16;
            }
        }
        return S1(true);
    }

    public final int S1(boolean z12) throws JsonParseException {
        while (true) {
            if (this.f413852p >= this.f413853q && !m1()) {
                t0(" within/between " + this.f413860x.h() + " entries");
                throw null;
            }
            char[] cArr = this.f419849O;
            int i12 = this.f413852p;
            int i13 = i12 + 1;
            this.f413852p = i13;
            char c12 = cArr[i12];
            if (c12 > ' ') {
                if (c12 == '/') {
                    U1();
                } else if (c12 == '#' && (this.f341055b & f419846e0) != 0) {
                    Y1();
                } else {
                    if (z12) {
                        return c12;
                    }
                    if (c12 != ':') {
                        v0(c12, "was expecting a colon to separate field name and value");
                        throw null;
                    }
                    z12 = true;
                }
            } else if (c12 >= ' ') {
                continue;
            } else if (c12 == '\n') {
                this.f413855s++;
                this.f413856t = i13;
            } else if (c12 == '\r') {
                P1();
            } else if (c12 != '\t') {
                w0(c12);
                throw null;
            }
        }
    }

    public final int T1(int i12) throws JsonParseException {
        if (i12 != 44) {
            v0(i12, "was expecting comma to separate " + this.f413860x.h() + " entries");
            throw null;
        }
        while (true) {
            int i13 = this.f413852p;
            if (i13 >= this.f413853q) {
                return N1();
            }
            char[] cArr = this.f419849O;
            int i14 = i13 + 1;
            this.f413852p = i14;
            char c12 = cArr[i13];
            if (c12 > ' ') {
                if (c12 != '/' && c12 != '#') {
                    return c12;
                }
                this.f413852p = i13;
                return N1();
            }
            if (c12 < ' ') {
                if (c12 == '\n') {
                    this.f413855s++;
                    this.f413856t = i14;
                } else if (c12 == '\r') {
                    P1();
                } else if (c12 != '\t') {
                    w0(c12);
                    throw null;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0056, code lost:
    
        t0(" in a comment");
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0059, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void U1() throws com.fasterxml.jackson.core.JsonParseException {
        /*
            r7 = this;
            int r0 = r7.f341055b
            int r1 = oX0.C44707g.f419845d0
            r0 = r0 & r1
            r1 = 0
            r2 = 47
            if (r0 == 0) goto L8f
            int r0 = r7.f413852p
            int r3 = r7.f413853q
            java.lang.String r4 = " in a comment"
            if (r0 < r3) goto L1d
            boolean r0 = r7.m1()
            if (r0 == 0) goto L19
            goto L1d
        L19:
            r7.t0(r4)
            throw r1
        L1d:
            char[] r0 = r7.f419849O
            int r3 = r7.f413852p
            int r5 = r3 + 1
            r7.f413852p = r5
            char r0 = r0[r3]
            if (r0 != r2) goto L2d
            r7.Y1()
            goto L66
        L2d:
            r3 = 42
            if (r0 != r3) goto L89
        L31:
            int r0 = r7.f413852p
            int r5 = r7.f413853q
            if (r0 < r5) goto L3d
            boolean r0 = r7.m1()
            if (r0 == 0) goto L56
        L3d:
            char[] r0 = r7.f419849O
            int r5 = r7.f413852p
            int r6 = r5 + 1
            r7.f413852p = r6
            char r0 = r0[r5]
            if (r0 > r3) goto L31
            if (r0 != r3) goto L67
            int r0 = r7.f413853q
            if (r6 < r0) goto L5a
            boolean r0 = r7.m1()
            if (r0 == 0) goto L56
            goto L5a
        L56:
            r7.t0(r4)
            throw r1
        L5a:
            char[] r0 = r7.f419849O
            int r5 = r7.f413852p
            char r0 = r0[r5]
            if (r0 != r2) goto L31
            int r5 = r5 + 1
            r7.f413852p = r5
        L66:
            return
        L67:
            r5 = 32
            if (r0 >= r5) goto L31
            r5 = 10
            if (r0 != r5) goto L78
            int r0 = r7.f413855s
            int r0 = r0 + 1
            r7.f413855s = r0
            r7.f413856t = r6
            goto L31
        L78:
            r5 = 13
            if (r0 != r5) goto L80
            r7.P1()
            goto L31
        L80:
            r5 = 9
            if (r0 != r5) goto L85
            goto L31
        L85:
            r7.w0(r0)
            throw r1
        L89:
            java.lang.String r2 = "was expecting either '*' or '/' for a comment"
            r7.v0(r0, r2)
            throw r1
        L8f:
            java.lang.String r0 = "maybe a (non-standard) comment? (not recognized as one since Feature 'ALLOW_COMMENTS' not enabled for parser)"
            r7.v0(r2, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: oX0.C44707g.U1():void");
    }

    @Override // lX0.AbstractC43700c, com.fasterxml.jackson.core.JsonParser
    public final String V() throws JsonParseException {
        JsonToken jsonToken = this.f413872d;
        if (jsonToken != JsonToken.VALUE_STRING) {
            return jsonToken == JsonToken.FIELD_NAME ? n() : super.W();
        }
        if (this.f419854T) {
            this.f419854T = false;
            i1();
        }
        return this.f413862z.g();
    }

    @Override // lX0.AbstractC43700c, com.fasterxml.jackson.core.JsonParser
    public final String W() throws JsonParseException {
        JsonToken jsonToken = this.f413872d;
        if (jsonToken != JsonToken.VALUE_STRING) {
            return jsonToken == JsonToken.FIELD_NAME ? n() : super.W();
        }
        if (this.f419854T) {
            this.f419854T = false;
            i1();
        }
        return this.f413862z.g();
    }

    public final void Y1() throws JsonParseException {
        while (true) {
            if (this.f413852p >= this.f413853q && !m1()) {
                return;
            }
            char[] cArr = this.f419849O;
            int i12 = this.f413852p;
            int i13 = i12 + 1;
            this.f413852p = i13;
            char c12 = cArr[i12];
            if (c12 < ' ') {
                if (c12 == '\n') {
                    this.f413855s++;
                    this.f413856t = i13;
                    return;
                } else if (c12 == '\r') {
                    P1();
                    return;
                } else if (c12 != '\t') {
                    w0(c12);
                    throw null;
                }
            }
        }
    }

    public final void Z1() throws JsonParseException {
        this.f419854T = false;
        int i12 = this.f413852p;
        int i13 = this.f413853q;
        char[] cArr = this.f419849O;
        while (true) {
            if (i12 >= i13) {
                this.f413852p = i12;
                if (!m1()) {
                    JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
                    t0(": was expecting closing quote for a string value");
                    throw null;
                }
                i12 = this.f413852p;
                i13 = this.f413853q;
            }
            int i14 = i12 + 1;
            char c12 = cArr[i12];
            if (c12 <= '\\') {
                if (c12 == '\\') {
                    this.f413852p = i14;
                    H0();
                    i12 = this.f413852p;
                    i13 = this.f413853q;
                } else if (c12 <= '\"') {
                    if (c12 == '\"') {
                        this.f413852p = i14;
                        return;
                    } else if (c12 < ' ') {
                        this.f413852p = i14;
                        Q0(c12, "string value");
                    }
                }
            }
            i12 = i14;
        }
    }

    public final int d2() throws JsonParseException {
        if (this.f413852p >= this.f413853q && !m1()) {
            o0();
            return -1;
        }
        char[] cArr = this.f419849O;
        int i12 = this.f413852p;
        int i13 = i12 + 1;
        this.f413852p = i13;
        char c12 = cArr[i12];
        if (c12 > ' ') {
            if (c12 != '/' && c12 != '#') {
                return c12;
            }
            this.f413852p = i12;
            return g2();
        }
        if (c12 != ' ') {
            if (c12 == '\n') {
                this.f413855s++;
                this.f413856t = i13;
            } else if (c12 == '\r') {
                P1();
            } else if (c12 != '\t') {
                w0(c12);
                throw null;
            }
        }
        while (true) {
            int i14 = this.f413852p;
            if (i14 >= this.f413853q) {
                return g2();
            }
            char[] cArr2 = this.f419849O;
            int i15 = i14 + 1;
            this.f413852p = i15;
            char c13 = cArr2[i14];
            if (c13 > ' ') {
                if (c13 != '/' && c13 != '#') {
                    return c13;
                }
                this.f413852p = i14;
                return g2();
            }
            if (c13 != ' ') {
                if (c13 == '\n') {
                    this.f413855s++;
                    this.f413856t = i15;
                } else if (c13 == '\r') {
                    P1();
                } else if (c13 != '\t') {
                    w0(c13);
                    throw null;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00aa  */
    @Override // com.fasterxml.jackson.core.JsonParser
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String e0() throws com.fasterxml.jackson.core.JsonParseException {
        /*
            Method dump skipped, instructions count: 418
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: oX0.C44707g.e0():java.lang.String");
    }

    public final void e1(int i12) throws JsonParseException {
        if (i12 == 93) {
            i2();
            if (!this.f413860x.d()) {
                P0('}', i12);
                throw null;
            }
            C44704d c44704d = this.f413860x;
            c44704d.f419830g = null;
            this.f413860x = c44704d.f419826c;
            this.f413872d = JsonToken.END_ARRAY;
        }
        if (i12 == 125) {
            i2();
            if (!this.f413860x.e()) {
                P0(']', i12);
                throw null;
            }
            C44704d c44704d2 = this.f413860x;
            c44704d2.f419830g = null;
            this.f413860x = c44704d2.f419826c;
            this.f413872d = JsonToken.END_OBJECT;
        }
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final String f0() throws JsonParseException {
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
            if (this.f419854T) {
                this.f419854T = false;
                i1();
            }
            return this.f413862z.g();
        }
        if (jsonToken == JsonToken.START_ARRAY) {
            this.f413860x = this.f413860x.i(this.f413858v, this.f413859w);
        } else if (jsonToken == JsonToken.START_OBJECT) {
            this.f413860x = this.f413860x.j(this.f413858v, this.f413859w);
        }
        return null;
    }

    public final byte[] f1(Base64Variant base64Variant) throws JsonParseException {
        com.fasterxml.jackson.core.util.c cVarJ0 = J0();
        while (true) {
            if (this.f413852p >= this.f413853q) {
                o1();
            }
            char[] cArr = this.f419849O;
            int i12 = this.f413852p;
            this.f413852p = i12 + 1;
            char c12 = cArr[i12];
            if (c12 > ' ') {
                int iC2 = base64Variant.c(c12);
                if (iC2 < 0) {
                    if (c12 == '\"') {
                        return cVarJ0.g();
                    }
                    iC2 = E0(base64Variant, c12, 0);
                    if (iC2 < 0) {
                        continue;
                    }
                }
                if (this.f413852p >= this.f413853q) {
                    o1();
                }
                char[] cArr2 = this.f419849O;
                int i13 = this.f413852p;
                this.f413852p = i13 + 1;
                char c13 = cArr2[i13];
                int iC3 = base64Variant.c(c13);
                if (iC3 < 0) {
                    iC3 = E0(base64Variant, c13, 1);
                }
                int i14 = (iC2 << 6) | iC3;
                if (this.f413852p >= this.f413853q) {
                    o1();
                }
                char[] cArr3 = this.f419849O;
                int i15 = this.f413852p;
                this.f413852p = i15 + 1;
                char c14 = cArr3[i15];
                int iC4 = base64Variant.c(c14);
                boolean z12 = base64Variant.f341008h;
                if (iC4 < 0) {
                    if (iC4 != -2) {
                        if (c14 == '\"') {
                            cVarJ0.b(i14 >> 4);
                            if (!z12) {
                                return cVarJ0.g();
                            }
                            this.f413852p--;
                            throw new JsonParseException(this, base64Variant.k());
                        }
                        iC4 = E0(base64Variant, c14, 2);
                    }
                    if (iC4 == -2) {
                        if (this.f413852p >= this.f413853q) {
                            o1();
                        }
                        char[] cArr4 = this.f419849O;
                        int i16 = this.f413852p;
                        this.f413852p = i16 + 1;
                        char c15 = cArr4[i16];
                        char c16 = base64Variant.f341006f;
                        if (c15 != c16 && E0(base64Variant, c15, 3) != -2) {
                            throw AbstractC43699b.Y0(base64Variant, c15, 3, "expected padding character '" + c16 + "'");
                        }
                        cVarJ0.b(i14 >> 4);
                    }
                }
                int i17 = (i14 << 6) | iC4;
                if (this.f413852p >= this.f413853q) {
                    o1();
                }
                char[] cArr5 = this.f419849O;
                int i18 = this.f413852p;
                this.f413852p = i18 + 1;
                char c17 = cArr5[i18];
                int iC5 = base64Variant.c(c17);
                if (iC5 < 0) {
                    if (iC5 != -2) {
                        if (c17 == '\"') {
                            cVarJ0.d(i17 >> 2);
                            if (!z12) {
                                return cVarJ0.g();
                            }
                            this.f413852p--;
                            throw new JsonParseException(this, base64Variant.k());
                        }
                        iC5 = E0(base64Variant, c17, 3);
                    }
                    if (iC5 == -2) {
                        cVarJ0.d(i17 >> 2);
                    }
                }
                cVarJ0.c((i17 << 6) | iC5);
            }
        }
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final JsonToken g0() throws JsonParseException {
        JsonToken jsonTokenF1;
        JsonToken jsonToken = this.f413872d;
        JsonToken jsonToken2 = JsonToken.FIELD_NAME;
        if (jsonToken == jsonToken2) {
            return w1();
        }
        this.f413842E = 0;
        if (this.f419854T) {
            Z1();
        }
        int iD2 = d2();
        if (iD2 < 0) {
            close();
            this.f413872d = null;
            return null;
        }
        this.f413841D = null;
        if (iD2 == 93 || iD2 == 125) {
            e1(iD2);
            return this.f413872d;
        }
        if (this.f413860x.k()) {
            iD2 = T1(iD2);
            if ((this.f341055b & f419839X) != 0 && (iD2 == 93 || iD2 == 125)) {
                e1(iD2);
                return this.f413872d;
            }
        }
        boolean zE2 = this.f413860x.e();
        if (zE2) {
            int i12 = this.f413852p;
            this.f419855U = i12;
            this.f419856V = this.f413855s;
            this.f419857W = i12 - this.f413856t;
            this.f413860x.l(iD2 == 34 ? A1() : k1(iD2));
            this.f413872d = jsonToken2;
            iD2 = R1();
        }
        i2();
        if (iD2 == 34) {
            this.f419854T = true;
            jsonTokenF1 = JsonToken.VALUE_STRING;
        } else if (iD2 == 91) {
            if (!zE2) {
                this.f413860x = this.f413860x.i(this.f413858v, this.f413859w);
            }
            jsonTokenF1 = JsonToken.START_ARRAY;
        } else if (iD2 == 102) {
            s1();
            jsonTokenF1 = JsonToken.VALUE_FALSE;
        } else if (iD2 == 110) {
            t1();
            jsonTokenF1 = JsonToken.VALUE_NULL;
        } else if (iD2 == 116) {
            v1();
            jsonTokenF1 = JsonToken.VALUE_TRUE;
        } else if (iD2 == 123) {
            if (!zE2) {
                this.f413860x = this.f413860x.j(this.f413858v, this.f413859w);
            }
            jsonTokenF1 = JsonToken.START_OBJECT;
        } else {
            if (iD2 == 125) {
                v0(iD2, "expected a value");
                throw null;
            }
            if (iD2 == 45) {
                jsonTokenF1 = F1();
            } else if (iD2 != 46) {
                switch (iD2) {
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
                        jsonTokenF1 = I1(iD2);
                        break;
                    default:
                        jsonTokenF1 = l1(iD2);
                        break;
                }
            } else {
                jsonTokenF1 = y1();
            }
        }
        if (zE2) {
            this.f413861y = jsonTokenF1;
            return this.f413872d;
        }
        this.f413872d = jsonTokenF1;
        return jsonTokenF1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0037, code lost:
    
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int g2() throws com.fasterxml.jackson.core.JsonParseException {
        /*
            r3 = this;
        L0:
            int r0 = r3.f413852p
            int r1 = r3.f413853q
            if (r0 < r1) goto L11
            boolean r0 = r3.m1()
            if (r0 != 0) goto L11
            r3.o0()
            r0 = -1
            return r0
        L11:
            char[] r0 = r3.f419849O
            int r1 = r3.f413852p
            int r2 = r1 + 1
            r3.f413852p = r2
            char r0 = r0[r1]
            r1 = 32
            if (r0 <= r1) goto L38
            r1 = 47
            if (r0 != r1) goto L27
            r3.U1()
            goto L0
        L27:
            r1 = 35
            if (r0 != r1) goto L37
            int r1 = r3.f341055b
            int r2 = oX0.C44707g.f419846e0
            r1 = r1 & r2
            if (r1 != 0) goto L33
            goto L37
        L33:
            r3.Y1()
            goto L0
        L37:
            return r0
        L38:
            if (r0 == r1) goto L0
            r1 = 10
            if (r0 != r1) goto L47
            int r0 = r3.f413855s
            int r0 = r0 + 1
            r3.f413855s = r0
            r3.f413856t = r2
            goto L0
        L47:
            r1 = 13
            if (r0 != r1) goto L4f
            r3.P1()
            goto L0
        L4f:
            r1 = 9
            if (r0 != r1) goto L54
            goto L0
        L54:
            r3.w0(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: oX0.C44707g.g2():int");
    }

    @Override // lX0.AbstractC43699b, com.fasterxml.jackson.core.JsonParser
    public final byte[] i(Base64Variant base64Variant) throws JsonParseException {
        byte[] bArr;
        JsonToken jsonToken = this.f413872d;
        if (jsonToken == JsonToken.VALUE_EMBEDDED_OBJECT && (bArr = this.f413841D) != null) {
            return bArr;
        }
        if (jsonToken != JsonToken.VALUE_STRING) {
            throw new JsonParseException(this, "Current token (" + this.f413872d + ") not VALUE_STRING or VALUE_EMBEDDED_OBJECT, can not access as binary");
        }
        if (this.f419854T) {
            try {
                this.f413841D = f1(base64Variant);
                this.f419854T = false;
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
        if (!this.f419854T || this.f413872d != JsonToken.VALUE_STRING) {
            byte[] bArrI = i(base64Variant);
            c36500f.write(bArrI);
            return bArrI.length;
        }
        com.fasterxml.jackson.core.io.f fVar = this.f413850n;
        byte[] bArrB = fVar.b();
        try {
            return K1(base64Variant, c36500f, bArrB);
        } finally {
            fVar.d(bArrB);
        }
    }

    public final void i1() throws JsonParseException {
        int i12 = this.f413852p;
        int i13 = this.f413853q;
        p pVar = this.f413862z;
        int[] iArr = f419847f0;
        if (i12 < i13) {
            int length = iArr.length;
            while (true) {
                char[] cArr = this.f419849O;
                char c12 = cArr[i12];
                if (c12 >= length || iArr[c12] == 0) {
                    i12++;
                    if (i12 >= i13) {
                        break;
                    }
                } else if (c12 == '\"') {
                    int i14 = this.f413852p;
                    pVar.p(cArr, i14, i12 - i14);
                    this.f413852p = i12 + 1;
                    return;
                }
            }
        }
        char[] cArr2 = this.f419849O;
        int i15 = this.f413852p;
        int i16 = i12 - i15;
        pVar.f341314b = null;
        pVar.f341315c = -1;
        pVar.f341316d = 0;
        pVar.f341322j = null;
        pVar.f341323k = null;
        if (pVar.f341318f) {
            pVar.d();
        } else if (pVar.f341320h == null) {
            pVar.f341320h = pVar.c(i16);
        }
        pVar.f341319g = 0;
        pVar.f341321i = 0;
        pVar.b(cArr2, i15, i16);
        this.f413852p = i12;
        char[] cArrL = pVar.l();
        int i17 = pVar.f341321i;
        int length2 = iArr.length;
        while (true) {
            if (this.f413852p >= this.f413853q && !m1()) {
                JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
                t0(": was expecting closing quote for a string value");
                throw null;
            }
            char[] cArr3 = this.f419849O;
            int i18 = this.f413852p;
            this.f413852p = i18 + 1;
            char cH02 = cArr3[i18];
            if (cH02 < length2 && iArr[cH02] != 0) {
                if (cH02 == '\"') {
                    pVar.f341321i = i17;
                    return;
                } else if (cH02 == '\\') {
                    cH02 = H0();
                } else if (cH02 < ' ') {
                    Q0(cH02, "string value");
                }
            }
            if (i17 >= cArrL.length) {
                cArrL = pVar.k();
                i17 = 0;
            }
            cArrL[i17] = cH02;
            i17++;
        }
    }

    public final void i2() {
        int i12 = this.f413852p;
        this.f413857u = this.f413854r + i12;
        this.f413858v = this.f413855s;
        this.f413859w = i12 - this.f413856t;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, char], vars: [r11v0 ??, r11v1 ??, r11v4 ??]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:107)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:83)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:57)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:45)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public final com.fasterxml.jackson.core.JsonToken j1(
    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, char], vars: [r11v0 ??, r11v1 ??, r11v4 ??]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:107)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:83)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:57)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:45)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r11v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:224)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:169)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:405)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
        */

    public final void j2(int i12) throws JsonParseException {
        int i13 = this.f413852p + 1;
        this.f413852p = i13;
        if (i12 != 9) {
            if (i12 == 10) {
                this.f413855s++;
                this.f413856t = i13;
            } else if (i12 == 13) {
                P1();
            } else {
                if (i12 == 32) {
                    return;
                }
                v0(i12, "Expected space separating root-level values");
                throw null;
            }
        }
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final com.fasterxml.jackson.core.j k() {
        return this.f419851Q;
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x00f1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00eb A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String k1(int r11) throws com.fasterxml.jackson.core.JsonParseException {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: oX0.C44707g.k1(int):java.lang.String");
    }

    public final char k2(String str) {
        if (this.f413852p >= this.f413853q && !m1()) {
            t0(str);
            throw null;
        }
        char[] cArr = this.f419849O;
        int i12 = this.f413852p;
        this.f413852p = i12 + 1;
        return cArr[i12];
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.fasterxml.jackson.core.JsonToken l1(int r10) throws com.fasterxml.jackson.core.JsonParseException {
        /*
            Method dump skipped, instructions count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: oX0.C44707g.l1(int):com.fasterxml.jackson.core.JsonToken");
    }

    @Override // lX0.AbstractC43699b, com.fasterxml.jackson.core.JsonParser
    public final com.fasterxml.jackson.core.e m() {
        return new com.fasterxml.jackson.core.e(D0(), -1L, this.f413852p + this.f413854r, this.f413855s, (this.f413852p - this.f413856t) + 1);
    }

    public final boolean m1() throws IOException {
        Reader reader = this.f419848N;
        if (reader != null) {
            char[] cArr = this.f419849O;
            int i12 = reader.read(cArr, 0, cArr.length);
            if (i12 > 0) {
                int i13 = this.f413853q;
                long j12 = i13;
                this.f413854r += j12;
                this.f413856t -= i13;
                this.f419855U -= j12;
                this.f413852p = 0;
                this.f413853q = i12;
                return true;
            }
            B0();
            if (i12 == 0) {
                throw new IOException("Reader returned 0 characters when trying to read " + this.f413853q);
            }
        }
        return false;
    }

    public final void o1() {
        if (m1()) {
            return;
        }
        s0();
        throw null;
    }

    public final void s1() throws JsonParseException {
        int i12;
        char c12;
        int i13 = this.f413852p;
        if (i13 + 4 < this.f413853q) {
            char[] cArr = this.f419849O;
            if (cArr[i13] == 'a' && cArr[i13 + 1] == 'l' && cArr[i13 + 2] == 's' && cArr[i13 + 3] == 'e' && ((c12 = cArr[(i12 = i13 + 4)]) < '0' || c12 == ']' || c12 == '}')) {
                this.f413852p = i12;
                return;
            }
        }
        u1(1, "false");
    }

    public final void t1() throws JsonParseException {
        int i12;
        char c12;
        int i13 = this.f413852p;
        if (i13 + 3 < this.f413853q) {
            char[] cArr = this.f419849O;
            if (cArr[i13] == 'u' && cArr[i13 + 1] == 'l' && cArr[i13 + 2] == 'l' && ((c12 = cArr[(i12 = i13 + 3)]) < '0' || c12 == ']' || c12 == '}')) {
                this.f413852p = i12;
                return;
            }
        }
        u1(1, "null");
    }

    public final void u1(int i12, String str) throws JsonParseException {
        int i13;
        char c12;
        int length = str.length();
        if (this.f413852p + length < this.f413853q) {
            while (this.f419849O[this.f413852p] == str.charAt(i12)) {
                int i14 = this.f413852p + 1;
                this.f413852p = i14;
                i12++;
                if (i12 >= length) {
                    char c13 = this.f419849O[i14];
                    if (c13 < '0' || c13 == ']' || c13 == '}' || !Character.isJavaIdentifierPart(c13)) {
                        return;
                    }
                    M1(str.substring(0, i12), R0());
                    throw null;
                }
            }
            M1(str.substring(0, i12), R0());
            throw null;
        }
        int length2 = str.length();
        do {
            if ((this.f413852p >= this.f413853q && !m1()) || this.f419849O[this.f413852p] != str.charAt(i12)) {
                M1(str.substring(0, i12), R0());
                throw null;
            }
            i13 = this.f413852p + 1;
            this.f413852p = i13;
            i12++;
        } while (i12 < length2);
        if ((i13 < this.f413853q || m1()) && (c12 = this.f419849O[this.f413852p]) >= '0' && c12 != ']' && c12 != '}' && Character.isJavaIdentifierPart(c12)) {
            M1(str.substring(0, i12), R0());
            throw null;
        }
    }

    public final void v1() throws JsonParseException {
        int i12;
        char c12;
        int i13 = this.f413852p;
        if (i13 + 3 < this.f413853q) {
            char[] cArr = this.f419849O;
            if (cArr[i13] == 'r' && cArr[i13 + 1] == 'u' && cArr[i13 + 2] == 'e' && ((c12 = cArr[(i12 = i13 + 3)]) < '0' || c12 == ']' || c12 == '}')) {
                this.f413852p = i12;
                return;
            }
        }
        u1(1, "true");
    }

    public final JsonToken w1() {
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

    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, char], vars: [r11v0 ??, r11v1 ??, r11v19 ??, r11v12 ??, r11v6 ??, r11v5 ??, r11v3 ??, r11v10 ??, r11v9 ??]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:107)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:83)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:57)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:45)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public final com.fasterxml.jackson.core.JsonToken x1(
    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, char], vars: [r11v0 ??, r11v1 ??, r11v19 ??, r11v12 ??, r11v6 ??, r11v5 ??, r11v3 ??, r11v10 ??, r11v9 ??]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:107)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:83)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:57)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:45)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r11v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:224)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:169)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:405)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
        */

    public final JsonToken y1() {
        if (!JsonReadFeature.ALLOW_LEADING_DECIMAL_POINT_FOR_NUMBERS.f341209c.a(this.f341055b)) {
            return l1(46);
        }
        int i12 = this.f413852p;
        return x1(46, i12 - 1, i12, 0, false);
    }
}
