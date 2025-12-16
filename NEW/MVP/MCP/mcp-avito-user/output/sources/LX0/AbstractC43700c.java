package lX0;

import androidx.appcompat.app.r;
import androidx.camera.camera2.internal.G;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.e;
import com.fasterxml.jackson.core.exc.InputCoercionException;
import com.fasterxml.jackson.core.io.JsonEOFException;
import com.fasterxml.jackson.core.io.j;
import java.math.BigDecimal;
import java.math.BigInteger;

/* compiled from: ParserMinimalBase.java */
/* renamed from: lX0.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC43700c extends JsonParser {

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f413863e = new byte[0];

    /* renamed from: f, reason: collision with root package name */
    public static final BigInteger f413864f;

    /* renamed from: g, reason: collision with root package name */
    public static final BigInteger f413865g;

    /* renamed from: h, reason: collision with root package name */
    public static final BigInteger f413866h;

    /* renamed from: i, reason: collision with root package name */
    public static final BigInteger f413867i;

    /* renamed from: j, reason: collision with root package name */
    public static final BigDecimal f413868j;

    /* renamed from: k, reason: collision with root package name */
    public static final BigDecimal f413869k;

    /* renamed from: l, reason: collision with root package name */
    public static final BigDecimal f413870l;

    /* renamed from: m, reason: collision with root package name */
    public static final BigDecimal f413871m;

    /* renamed from: d, reason: collision with root package name */
    public JsonToken f413872d;

    static {
        BigInteger bigIntegerValueOf = BigInteger.valueOf(-2147483648L);
        f413864f = bigIntegerValueOf;
        BigInteger bigIntegerValueOf2 = BigInteger.valueOf(2147483647L);
        f413865g = bigIntegerValueOf2;
        BigInteger bigIntegerValueOf3 = BigInteger.valueOf(Long.MIN_VALUE);
        f413866h = bigIntegerValueOf3;
        BigInteger bigIntegerValueOf4 = BigInteger.valueOf(Long.MAX_VALUE);
        f413867i = bigIntegerValueOf4;
        f413868j = new BigDecimal(bigIntegerValueOf3);
        f413869k = new BigDecimal(bigIntegerValueOf4);
        f413870l = new BigDecimal(bigIntegerValueOf);
        f413871m = new BigDecimal(bigIntegerValueOf2);
    }

    public AbstractC43700c() {
    }

    public static final String n0(int i12) {
        char c12 = (char) i12;
        if (Character.isISOControl(c12)) {
            return G.e(i12, "(CTRL-CHAR, code ", ")");
        }
        if (i12 <= 255) {
            return "'" + c12 + "' (code " + i12 + ")";
        }
        return "'" + c12 + "' (code " + i12 + " / 0x" + Integer.toHexString(i12) + ")";
    }

    public static String p0(String str) {
        int length = str.length();
        if (length < 1000) {
            return str;
        }
        if (str.startsWith("-")) {
            length--;
        }
        return String.format("[Integer with %d digits]", Integer.valueOf(length));
    }

    public static String r0(String str) {
        int length = str.length();
        if (length < 1000) {
            return str;
        }
        if (str.startsWith("-")) {
            length--;
        }
        return String.format("[number with %d characters]", Integer.valueOf(length));
    }

    public final void A0(int i12, String str) throws JsonParseException {
        throw new JsonParseException(this, r.r(AK.c.k("Unexpected character (", n0(i12), ") in numeric value"), ": ", str));
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public e P() {
        return m();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int R() {
        JsonToken jsonToken = this.f413872d;
        return (jsonToken == JsonToken.VALUE_NUMBER_INT || jsonToken == JsonToken.VALUE_NUMBER_FLOAT) ? z() : S();
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0063  */
    @Override // com.fasterxml.jackson.core.JsonParser
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int S() throws java.lang.NumberFormatException {
        /*
            r7 = this;
            r0 = 1
            com.fasterxml.jackson.core.JsonToken r1 = r7.f413872d
            com.fasterxml.jackson.core.JsonToken r2 = com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_INT
            if (r1 == r2) goto L7d
            com.fasterxml.jackson.core.JsonToken r2 = com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_FLOAT
            if (r1 != r2) goto Ld
            goto L7d
        Ld:
            r2 = 0
            if (r1 == 0) goto L7c
            r3 = 6
            int r1 = r1.f341099e
            if (r1 == r3) goto L2d
            r3 = 9
            if (r1 == r3) goto L2c
            r0 = 12
            if (r1 == r0) goto L1e
            goto L7c
        L1e:
            java.lang.Object r0 = r7.x()
            boolean r1 = r0 instanceof java.lang.Number
            if (r1 == 0) goto L7c
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
        L2c:
            return r0
        L2d:
            java.lang.String r1 = r7.L()
            java.lang.String r3 = "null"
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L3a
            return r2
        L3a:
            java.lang.String r3 = com.fasterxml.jackson.core.io.j.f341179a
            if (r1 != 0) goto L3f
            goto L7c
        L3f:
            java.lang.String r1 = r1.trim()
            int r3 = r1.length()
            if (r3 != 0) goto L4a
            goto L7c
        L4a:
            char r4 = r1.charAt(r2)
            r5 = 43
            if (r4 != r5) goto L5c
            java.lang.String r1 = r1.substring(r0)
            int r3 = r1.length()
        L5a:
            r4 = r2
            goto L61
        L5c:
            r5 = 45
            if (r4 != r5) goto L5a
            r4 = r0
        L61:
            if (r4 >= r3) goto L78
            char r5 = r1.charAt(r4)
            r6 = 57
            if (r5 > r6) goto L72
            r6 = 48
            if (r5 >= r6) goto L70
            goto L72
        L70:
            int r4 = r4 + r0
            goto L61
        L72:
            double r0 = com.fasterxml.jackson.core.io.j.a(r1)     // Catch: java.lang.NumberFormatException -> L7c
            int r2 = (int) r0     // Catch: java.lang.NumberFormatException -> L7c
            goto L7c
        L78:
            int r2 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.NumberFormatException -> L7c
        L7c:
            return r2
        L7d:
            int r0 = r7.z()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: lX0.AbstractC43700c.S():int");
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final long T() {
        JsonToken jsonToken = this.f413872d;
        return (jsonToken == JsonToken.VALUE_NUMBER_INT || jsonToken == JsonToken.VALUE_NUMBER_FLOAT) ? A() : U();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final long U() throws NumberFormatException {
        String strTrim;
        int length;
        JsonToken jsonToken = this.f413872d;
        if (jsonToken == JsonToken.VALUE_NUMBER_INT || jsonToken == JsonToken.VALUE_NUMBER_FLOAT) {
            return A();
        }
        long jA2 = 0;
        if (jsonToken != null) {
            int i12 = jsonToken.f341099e;
            if (i12 == 6) {
                String strL = L();
                if ("null".equals(strL)) {
                    return 0L;
                }
                String str = j.f341179a;
                if (strL != null && (length = (strTrim = strL.trim()).length()) != 0) {
                    int i13 = 0;
                    char cCharAt = strTrim.charAt(0);
                    if (cCharAt == '+') {
                        strTrim = strTrim.substring(1);
                        length = strTrim.length();
                    } else if (cCharAt == '-') {
                        i13 = 1;
                    }
                    while (i13 < length) {
                        try {
                            char cCharAt2 = strTrim.charAt(i13);
                            if (cCharAt2 > '9' || cCharAt2 < '0') {
                                jA2 = (long) j.a(strTrim);
                                break;
                            }
                            i13++;
                        } catch (NumberFormatException unused) {
                        }
                    }
                    jA2 = Long.parseLong(strTrim);
                }
            } else {
                if (i12 == 9) {
                    return 1L;
                }
                if (i12 == 12) {
                    Object objX = x();
                    if (objX instanceof Number) {
                        return ((Number) objX).longValue();
                    }
                }
            }
        }
        return jA2;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public String V() {
        return W();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public String W() {
        JsonToken jsonToken = this.f413872d;
        if (jsonToken == JsonToken.VALUE_STRING) {
            return L();
        }
        if (jsonToken == JsonToken.FIELD_NAME) {
            return n();
        }
        if (jsonToken == null || jsonToken == JsonToken.VALUE_NULL || !jsonToken.f341103i) {
            return null;
        }
        return L();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final boolean Y(JsonToken jsonToken) {
        return this.f413872d == jsonToken;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final boolean Z() {
        JsonToken jsonToken = this.f413872d;
        return jsonToken != null && jsonToken.f341099e == 5;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final boolean a0() {
        return this.f413872d == JsonToken.VALUE_NUMBER_INT;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final boolean b0() {
        return this.f413872d == JsonToken.START_ARRAY;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final void c() {
        if (this.f413872d != null) {
            this.f413872d = null;
        }
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final boolean c0() {
        return this.f413872d == JsonToken.START_OBJECT;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final JsonToken f() {
        return this.f413872d;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final int g() {
        JsonToken jsonToken = this.f413872d;
        if (jsonToken == null) {
            return 0;
        }
        return jsonToken.f341099e;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final JsonToken h0() {
        JsonToken jsonTokenG0 = g0();
        return jsonTokenG0 == JsonToken.FIELD_NAME ? g0() : jsonTokenG0;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonParser l0() throws JsonParseException {
        JsonToken jsonToken = this.f413872d;
        if (jsonToken != JsonToken.START_OBJECT && jsonToken != JsonToken.START_ARRAY) {
            return this;
        }
        int i12 = 1;
        while (true) {
            JsonToken jsonTokenG0 = g0();
            if (jsonTokenG0 == null) {
                o0();
                return this;
            }
            if (jsonTokenG0.f341100f) {
                i12++;
            } else if (jsonTokenG0.f341101g) {
                i12--;
                if (i12 == 0) {
                    return this;
                }
            } else if (jsonTokenG0 == JsonToken.NOT_AVAILABLE) {
                throw new JsonParseException(this, AK.c.k("Not enough content available for `skipChildren()`: non-blocking parser? (", getClass().getName(), ")"));
            }
        }
    }

    public final void m0(String str, com.fasterxml.jackson.core.util.c cVar, Base64Variant base64Variant) {
        try {
            base64Variant.b(str, cVar);
        } catch (IllegalArgumentException e12) {
            throw new JsonParseException(this, e12.getMessage());
        }
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public String n() {
        return d();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final JsonToken o() {
        return this.f413872d;
    }

    public abstract void o0();

    @Override // com.fasterxml.jackson.core.JsonParser
    @Deprecated
    public final int p() {
        JsonToken jsonToken = this.f413872d;
        if (jsonToken == null) {
            return 0;
        }
        return jsonToken.f341099e;
    }

    public final void s0() {
        t0(" in " + this.f413872d);
        throw null;
    }

    public final void t0(String str) {
        throw new JsonEOFException(this, G.f("Unexpected end-of-input", str));
    }

    public final void u0(JsonToken jsonToken) {
        t0(jsonToken != JsonToken.VALUE_STRING ? (jsonToken == JsonToken.VALUE_NUMBER_INT || jsonToken == JsonToken.VALUE_NUMBER_FLOAT) ? " in a Number value" : " in a value" : " in a String value");
        throw null;
    }

    public final void v0(int i12, String str) throws JsonParseException {
        if (i12 < 0) {
            s0();
            throw null;
        }
        String strK = AK.c.k("Unexpected character (", n0(i12), ")");
        if (str != null) {
            strK = r.r(strK, ": ", str);
        }
        throw new JsonParseException(this, strK);
    }

    public final void w0(int i12) throws JsonParseException {
        throw new JsonParseException(this, "Illegal character (" + n0((char) i12) + "): only regular white space (\\r, \\n, \\t) is allowed between tokens");
    }

    public final void x0() {
        throw new InputCoercionException(this, String.format("Numeric value (%s) out of range of int (%d - %s)", p0(L()), Integer.valueOf(BeduinInputModel.MIN_TEXT_VERSION), Integer.MAX_VALUE));
    }

    public final void y0() {
        z0(L());
        throw null;
    }

    public final void z0(String str) {
        throw new InputCoercionException(this, String.format("Numeric value (%s) out of range of long (%d - %s)", p0(str), Long.MIN_VALUE, Long.MAX_VALUE));
    }

    public AbstractC43700c(int i12) {
        this.f341055b = i12;
    }
}
