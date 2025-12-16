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
import com.fasterxml.jackson.databind.util.C36500f;
import java.io.IOException;
import lX0.AbstractC43699b;

/* compiled from: UTF8DataInputJsonParser.java */
/* renamed from: oX0.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C44708h extends AbstractC43699b {

    /* renamed from: P, reason: collision with root package name */
    public static final int f419858P = JsonParser.Feature.ALLOW_TRAILING_COMMA.f341073c;

    /* renamed from: Q, reason: collision with root package name */
    public static final int f419859Q;

    /* renamed from: R, reason: collision with root package name */
    public static final int f419860R;

    /* renamed from: S, reason: collision with root package name */
    public static final int f419861S;

    /* renamed from: T, reason: collision with root package name */
    public static final int f419862T;

    /* renamed from: U, reason: collision with root package name */
    public static final int f419863U;

    /* renamed from: N, reason: collision with root package name */
    public boolean f419864N;

    /* renamed from: O, reason: collision with root package name */
    public int f419865O;

    static {
        int i12 = JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS.f341073c;
        int i13 = JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS.f341073c;
        f419859Q = JsonParser.Feature.ALLOW_MISSING_VALUES.f341073c;
        f419860R = JsonParser.Feature.ALLOW_SINGLE_QUOTES.f341073c;
        f419861S = JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES.f341073c;
        f419862T = JsonParser.Feature.ALLOW_COMMENTS.f341073c;
        f419863U = JsonParser.Feature.ALLOW_YAML_COMMENTS.f341073c;
        char[] cArr = com.fasterxml.jackson.core.io.b.f341144a;
        char[] cArr2 = com.fasterxml.jackson.core.io.b.f341144a;
    }

    @Override // lX0.AbstractC43699b
    public final char H0() {
        throw null;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final com.fasterxml.jackson.core.util.i<StreamReadCapability> I() {
        return AbstractC43699b.f413837M;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final String L() {
        JsonToken jsonToken = this.f413872d;
        JsonToken jsonToken2 = JsonToken.VALUE_STRING;
        p pVar = this.f413862z;
        if (jsonToken != jsonToken2) {
            if (jsonToken == null) {
                return null;
            }
            int i12 = jsonToken.f341099e;
            return i12 != 5 ? (i12 == 6 || i12 == 7 || i12 == 8) ? pVar.g() : jsonToken.f341096b : this.f413860x.f419829f;
        }
        if (!this.f419864N) {
            return pVar.g();
        }
        this.f419864N = false;
        pVar.h();
        throw null;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final char[] M() {
        JsonToken jsonToken = this.f413872d;
        if (jsonToken == null) {
            return null;
        }
        int i12 = jsonToken.f341099e;
        if (i12 != 5) {
            p pVar = this.f413862z;
            if (i12 != 6) {
                if (i12 != 7 && i12 != 8) {
                    return jsonToken.f341097c;
                }
            } else if (this.f419864N) {
                this.f419864N = false;
                pVar.h();
                throw null;
            }
            return pVar.m();
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

    @Override // com.fasterxml.jackson.core.JsonParser
    public final int N() {
        JsonToken jsonToken = this.f413872d;
        JsonToken jsonToken2 = JsonToken.VALUE_STRING;
        p pVar = this.f413862z;
        if (jsonToken == jsonToken2) {
            if (!this.f419864N) {
                return pVar.q();
            }
            this.f419864N = false;
            pVar.h();
            throw null;
        }
        if (jsonToken == JsonToken.FIELD_NAME) {
            return this.f413860x.f419829f.length();
        }
        if (jsonToken != null) {
            return jsonToken.f341102h ? pVar.q() : jsonToken.f341097c.length;
        }
        return 0;
    }

    @Override // lX0.AbstractC43699b
    public final void N0() {
        super.N0();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0011, code lost:
    
        if (r0 != 8) goto L17;
     */
    @Override // com.fasterxml.jackson.core.JsonParser
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int O() {
        /*
            r4 = this;
            com.fasterxml.jackson.core.JsonToken r0 = r4.f413872d
            r1 = 0
            if (r0 == 0) goto L24
            r2 = 6
            com.fasterxml.jackson.core.util.p r3 = r4.f413862z
            int r0 = r0.f341099e
            if (r0 == r2) goto L14
            r2 = 7
            if (r0 == r2) goto L18
            r2 = 8
            if (r0 == r2) goto L18
            goto L24
        L14:
            boolean r0 = r4.f419864N
            if (r0 != 0) goto L1d
        L18:
            int r0 = r3.n()
            return r0
        L1d:
            r4.f419864N = r1
            r3.h()
            r0 = 0
            throw r0
        L24:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: oX0.C44708h.O():int");
    }

    @Override // lX0.AbstractC43699b, lX0.AbstractC43700c, com.fasterxml.jackson.core.JsonParser
    public final com.fasterxml.jackson.core.e P() {
        return new com.fasterxml.jackson.core.e(D0(), -1L, -1L, this.f413858v, -1);
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

    @Override // lX0.AbstractC43700c, com.fasterxml.jackson.core.JsonParser
    public final String V() {
        JsonToken jsonToken = this.f413872d;
        if (jsonToken != JsonToken.VALUE_STRING) {
            return jsonToken == JsonToken.FIELD_NAME ? n() : super.W();
        }
        boolean z12 = this.f419864N;
        p pVar = this.f413862z;
        if (!z12) {
            return pVar.g();
        }
        this.f419864N = false;
        pVar.h();
        throw null;
    }

    @Override // lX0.AbstractC43700c, com.fasterxml.jackson.core.JsonParser
    public final String W() {
        JsonToken jsonToken = this.f413872d;
        if (jsonToken != JsonToken.VALUE_STRING) {
            return jsonToken == JsonToken.FIELD_NAME ? n() : super.W();
        }
        boolean z12 = this.f419864N;
        p pVar = this.f413862z;
        if (!z12) {
            return pVar.g();
        }
        this.f419864N = false;
        pVar.h();
        throw null;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final String e0() throws JsonParseException {
        this.f413842E = 0;
        if (this.f413872d == JsonToken.FIELD_NAME) {
            j1();
            return null;
        }
        if (this.f419864N) {
            this.f419864N = false;
            throw null;
        }
        int iM1 = m1();
        this.f413841D = null;
        this.f413858v = this.f413855s;
        if (iM1 == 93 || iM1 == 125) {
            e1(iM1);
            return null;
        }
        if (this.f413860x.k()) {
            if (iM1 != 44) {
                v0(iM1, "was expecting comma to separate " + this.f413860x.h() + " entries");
                throw null;
            }
            iM1 = m1();
            if ((this.f341055b & f419858P) != 0 && (iM1 == 93 || iM1 == 125)) {
                e1(iM1);
                return null;
            }
        }
        if (this.f413860x.e()) {
            l1(iM1);
            throw null;
        }
        k1(iM1);
        return null;
    }

    public final void e1(int i12) throws JsonParseException {
        if (i12 == 93) {
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
        if (jsonToken != JsonToken.VALUE_STRING) {
            if (jsonToken == JsonToken.START_ARRAY) {
                this.f413860x = this.f413860x.i(this.f413858v, this.f413859w);
            } else if (jsonToken == JsonToken.START_OBJECT) {
                this.f413860x = this.f413860x.j(this.f413858v, this.f413859w);
            }
            return null;
        }
        boolean z12 = this.f419864N;
        p pVar = this.f413862z;
        if (!z12) {
            return pVar.g();
        }
        this.f419864N = false;
        pVar.h();
        throw null;
    }

    public final int f1(int i12) throws JsonParseException {
        int i13 = i12 & 255;
        if (i13 <= 127) {
            return i13;
        }
        if ((i12 & 224) == 192 || (i12 & 240) == 224 || (i12 & 248) == 240) {
            throw null;
        }
        throw new JsonParseException(this, r.m(i13, new StringBuilder("Invalid UTF-8 start byte 0x")));
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final JsonToken g0() throws JsonParseException {
        if (this.f413851o) {
            return null;
        }
        if (this.f413872d == JsonToken.FIELD_NAME) {
            return j1();
        }
        this.f413842E = 0;
        if (this.f419864N) {
            this.f419864N = false;
            throw null;
        }
        int iM1 = this.f419865O;
        if (iM1 < 0) {
            throw null;
        }
        this.f419865O = -1;
        if (iM1 <= 32) {
            if (iM1 != 13 && iM1 != 10) {
                throw null;
            }
            this.f413855s++;
            throw null;
        }
        if (iM1 == 47 || iM1 == 35) {
            o1(iM1);
        }
        if (iM1 < 0) {
            close();
            this.f413872d = null;
            return null;
        }
        this.f413841D = null;
        this.f413858v = this.f413855s;
        if (iM1 == 93 || iM1 == 125) {
            e1(iM1);
            return this.f413872d;
        }
        if (this.f413860x.k()) {
            if (iM1 != 44) {
                v0(iM1, "was expecting comma to separate " + this.f413860x.h() + " entries");
                throw null;
            }
            iM1 = m1();
            if ((this.f341055b & f419858P) != 0 && (iM1 == 93 || iM1 == 125)) {
                e1(iM1);
                return this.f413872d;
            }
        }
        if (!this.f413860x.e()) {
            return k1(iM1);
        }
        l1(iM1);
        throw null;
    }

    @Override // lX0.AbstractC43699b, com.fasterxml.jackson.core.JsonParser
    public final byte[] i(Base64Variant base64Variant) throws JsonParseException {
        JsonToken jsonToken = this.f413872d;
        if (jsonToken != JsonToken.VALUE_STRING && (jsonToken != JsonToken.VALUE_EMBEDDED_OBJECT || this.f413841D == null)) {
            throw new JsonParseException(this, "Current token (" + this.f413872d + ") not VALUE_STRING or VALUE_EMBEDDED_OBJECT, can not access as binary");
        }
        if (!this.f419864N) {
            if (this.f413841D == null) {
                com.fasterxml.jackson.core.util.c cVarJ0 = J0();
                m0(L(), cVarJ0, base64Variant);
                this.f413841D = cVarJ0.g();
            }
            return this.f413841D;
        }
        try {
            J0();
            throw null;
        } catch (IllegalArgumentException e12) {
            throw new JsonParseException(this, "Failed to decode VALUE_STRING as base64 (" + base64Variant + "): " + e12.getMessage());
        }
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final int i0(Base64Variant base64Variant, C36500f c36500f) throws IOException {
        if (!this.f419864N || this.f413872d != JsonToken.VALUE_STRING) {
            byte[] bArrI = i(base64Variant);
            c36500f.write(bArrI);
            return bArrI.length;
        }
        com.fasterxml.jackson.core.io.f fVar = this.f413850n;
        byte[] bArrB = fVar.b();
        try {
            throw null;
        } catch (Throwable th2) {
            fVar.d(bArrB);
            throw th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x001b, code lost:
    
        if (r4 != 44) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0025, code lost:
    
        if (r3.f413860x.d() == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x002e, code lost:
    
        if (r3.f413860x.f() != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0035, code lost:
    
        if ((r3.f341055b & oX0.C44708h.f419859Q) == 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0037, code lost:
    
        r3.f419865O = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003b, code lost:
    
        return com.fasterxml.jackson.core.JsonToken.VALUE_NULL;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.fasterxml.jackson.core.JsonToken i1(int r4) throws com.fasterxml.jackson.core.JsonParseException {
        /*
            r3 = this;
            r0 = 39
            r1 = 0
            if (r4 == r0) goto L44
            r0 = 73
            if (r4 == r0) goto L43
            r0 = 78
            if (r4 == r0) goto L42
            r0 = 93
            if (r4 == r0) goto L1f
            r0 = 125(0x7d, float:1.75E-43)
            if (r4 == r0) goto L3c
            r0 = 43
            if (r4 == r0) goto L1e
            r0 = 44
            if (r4 == r0) goto L28
            goto L58
        L1e:
            throw r1
        L1f:
            oX0.d r0 = r3.f413860x
            boolean r0 = r0.d()
            if (r0 != 0) goto L28
            goto L58
        L28:
            oX0.d r0 = r3.f413860x
            boolean r0 = r0.f()
            if (r0 != 0) goto L3c
            int r0 = r3.f341055b
            int r2 = oX0.C44708h.f419859Q
            r0 = r0 & r2
            if (r0 == 0) goto L3c
            r3.f419865O = r4
            com.fasterxml.jackson.core.JsonToken r4 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL
            return r4
        L3c:
            java.lang.String r0 = "expected a value"
            r3.v0(r4, r0)
            throw r1
        L42:
            throw r1
        L43:
            throw r1
        L44:
            int r0 = r3.f341055b
            int r2 = oX0.C44708h.f419860R
            r0 = r0 & r2
            if (r0 == 0) goto L58
            com.fasterxml.jackson.core.util.p r4 = r3.f413862z
            char[] r0 = r4.h()
            int r0 = r0.length
            if (r0 > 0) goto L57
            r4.k()
        L57:
            throw r1
        L58:
            boolean r0 = java.lang.Character.isJavaIdentifierStart(r4)
            if (r0 == 0) goto La6
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = ""
            r0.<init>(r1)
            char r1 = (char) r4
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = r3.R0()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r0)
            int r4 = r3.f1(r4)
            char r4 = (char) r4
            boolean r0 = java.lang.Character.isJavaIdentifierPart(r4)
            if (r0 != 0) goto La1
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r0 = "Unrecognized token '"
            r4.<init>(r0)
            java.lang.String r0 = r2.toString()
            r4.append(r0)
            java.lang.String r0 = "': was expecting "
            r4.append(r0)
            r4.append(r1)
            java.lang.String r4 = r4.toString()
            com.fasterxml.jackson.core.JsonParseException r0 = new com.fasterxml.jackson.core.JsonParseException
            r0.<init>(r3, r4)
            throw r0
        La1:
            r2.append(r4)
            r4 = 0
            throw r4
        La6:
            java.lang.String r0 = r3.R0()
            java.lang.String r2 = "expected a valid value "
            java.lang.String r0 = r2.concat(r0)
            r3.v0(r4, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: oX0.C44708h.i1(int):com.fasterxml.jackson.core.JsonToken");
    }

    public final JsonToken j1() {
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

    @Override // com.fasterxml.jackson.core.JsonParser
    public final com.fasterxml.jackson.core.j k() {
        return null;
    }

    public final JsonToken k1(int i12) throws JsonParseException {
        if (i12 == 34) {
            this.f419864N = true;
            JsonToken jsonToken = JsonToken.VALUE_STRING;
            this.f413872d = jsonToken;
            return jsonToken;
        }
        p pVar = this.f413862z;
        if (i12 == 45) {
            pVar.h()[0] = '-';
            throw null;
        }
        if (i12 == 46) {
            if (JsonReadFeature.ALLOW_LEADING_DECIMAL_POINT_FOR_NUMBERS.f341209c.a(this.f341055b)) {
                pVar.h()[0] = (char) 46;
                throw null;
            }
            JsonToken jsonTokenI1 = i1(46);
            this.f413872d = jsonTokenI1;
            return jsonTokenI1;
        }
        if (i12 == 91) {
            this.f413860x = this.f413860x.i(this.f413858v, this.f413859w);
            JsonToken jsonToken2 = JsonToken.START_ARRAY;
            this.f413872d = jsonToken2;
            return jsonToken2;
        }
        if (i12 == 102 || i12 == 110 || i12 == 116) {
            throw null;
        }
        if (i12 == 123) {
            this.f413860x = this.f413860x.j(this.f413858v, this.f413859w);
            JsonToken jsonToken3 = JsonToken.START_OBJECT;
            this.f413872d = jsonToken3;
            return jsonToken3;
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
                char[] cArrH = pVar.h();
                if (i12 == 48) {
                    throw null;
                }
                cArrH[0] = (char) i12;
                throw null;
            default:
                JsonToken jsonTokenI12 = i1(i12);
                this.f413872d = jsonTokenI12;
                return jsonTokenI12;
        }
    }

    public final String l1(int i12) throws JsonParseException {
        if (i12 == 34) {
            throw null;
        }
        if (i12 == 39 && (this.f341055b & f419860R) != 0) {
            throw null;
        }
        if ((this.f341055b & f419861S) == 0) {
            v0((char) f1(i12), "was expecting double-quote to start field name");
            throw null;
        }
        if (com.fasterxml.jackson.core.io.b.f341149f[i12] == 0) {
            throw null;
        }
        v0(i12, "was expecting either valid name character (for unquoted name) or double-quote (for quoted) to start field name");
        throw null;
    }

    @Override // lX0.AbstractC43699b, com.fasterxml.jackson.core.JsonParser
    public final com.fasterxml.jackson.core.e m() {
        return new com.fasterxml.jackson.core.e(D0(), -1L, -1L, this.f413855s, -1);
    }

    public final int m1() throws JsonParseException {
        int i12 = this.f419865O;
        if (i12 < 0) {
            throw null;
        }
        this.f419865O = -1;
        if (i12 > 32) {
            if (i12 != 47 && i12 != 35) {
                return i12;
            }
            o1(i12);
            return i12;
        }
        if (i12 != 13 && i12 != 10) {
            throw null;
        }
        this.f413855s++;
        throw null;
    }

    public final void o1(int i12) throws JsonParseException {
        if (i12 <= 32) {
            if (i12 != 13 && i12 != 10) {
                throw null;
            }
            this.f413855s++;
            throw null;
        }
        if (i12 == 47) {
            if ((this.f341055b & f419862T) != 0) {
                throw null;
            }
            v0(47, "maybe a (non-standard) comment? (not recognized as one since Feature 'ALLOW_COMMENTS' not enabled for parser)");
            throw null;
        }
        if (i12 != 35 || (this.f341055b & f419863U) == 0) {
            return;
        }
        char[] cArr = com.fasterxml.jackson.core.io.b.f341144a;
        throw null;
    }

    @Override // lX0.AbstractC43699b
    public final void B0() {
    }
}
