package lX0;

import androidx.appcompat.app.r;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.StreamReadCapability;
import com.fasterxml.jackson.core.e;
import com.fasterxml.jackson.core.exc.InputCoercionException;
import com.fasterxml.jackson.core.g;
import com.fasterxml.jackson.core.io.d;
import com.fasterxml.jackson.core.io.f;
import com.fasterxml.jackson.core.io.j;
import com.fasterxml.jackson.core.util.i;
import com.fasterxml.jackson.core.util.p;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import oX0.C44702b;
import oX0.C44704d;

/* compiled from: ParserBase.java */
/* renamed from: lX0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC43699b extends AbstractC43700c {

    /* renamed from: M, reason: collision with root package name */
    public static final i<StreamReadCapability> f413837M = JsonParser.f341054c;

    /* renamed from: A, reason: collision with root package name */
    public char[] f413838A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f413839B;

    /* renamed from: C, reason: collision with root package name */
    public com.fasterxml.jackson.core.util.c f413840C;

    /* renamed from: D, reason: collision with root package name */
    public byte[] f413841D;

    /* renamed from: E, reason: collision with root package name */
    public int f413842E;

    /* renamed from: F, reason: collision with root package name */
    public int f413843F;

    /* renamed from: G, reason: collision with root package name */
    public long f413844G;

    /* renamed from: H, reason: collision with root package name */
    public double f413845H;

    /* renamed from: I, reason: collision with root package name */
    public BigInteger f413846I;

    /* renamed from: J, reason: collision with root package name */
    public BigDecimal f413847J;

    /* renamed from: K, reason: collision with root package name */
    public boolean f413848K;

    /* renamed from: L, reason: collision with root package name */
    public int f413849L;

    /* renamed from: n, reason: collision with root package name */
    public final f f413850n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f413851o;

    /* renamed from: p, reason: collision with root package name */
    public int f413852p;

    /* renamed from: q, reason: collision with root package name */
    public int f413853q;

    /* renamed from: r, reason: collision with root package name */
    public long f413854r;

    /* renamed from: s, reason: collision with root package name */
    public int f413855s;

    /* renamed from: t, reason: collision with root package name */
    public int f413856t;

    /* renamed from: u, reason: collision with root package name */
    public long f413857u;

    /* renamed from: v, reason: collision with root package name */
    public int f413858v;

    /* renamed from: w, reason: collision with root package name */
    public int f413859w;

    /* renamed from: x, reason: collision with root package name */
    public C44704d f413860x;

    /* renamed from: y, reason: collision with root package name */
    public JsonToken f413861y;

    /* renamed from: z, reason: collision with root package name */
    public final p f413862z;

    public AbstractC43699b(f fVar, int i12) {
        super(i12);
        this.f413855s = 1;
        this.f413858v = 1;
        this.f413842E = 0;
        this.f413850n = fVar;
        this.f413862z = new p(fVar.f341164e);
        this.f413860x = new C44704d(null, JsonParser.Feature.STRICT_DUPLICATE_DETECTION.a(i12) ? new C44702b(this) : null, 0, 1, 0);
    }

    public static int[] V0(int i12, int[] iArr) {
        return iArr == null ? new int[i12] : Arrays.copyOf(iArr, iArr.length + i12);
    }

    public static IllegalArgumentException Y0(Base64Variant base64Variant, int i12, int i13, String str) {
        String strR;
        if (i12 <= 32) {
            strR = String.format("Illegal white space character (code 0x%s) as character #%d of 4-char base64 unit: can only used between units", Integer.toHexString(i12), Integer.valueOf(i13 + 1));
        } else if (i12 == base64Variant.f341006f) {
            strR = "Unexpected padding character ('" + base64Variant.f341006f + "') as character #" + (i13 + 1) + " of 4-char base64 unit: padding only legal as 3rd or 4th character";
        } else if (!Character.isDefined(i12) || Character.isISOControl(i12)) {
            strR = "Illegal character (code 0x" + Integer.toHexString(i12) + ") in base64 content";
        } else {
            strR = "Illegal character '" + ((char) i12) + "' (code 0x" + Integer.toHexString(i12) + ") in base64 content";
        }
        if (str != null) {
            strR = r.r(strR, ": ", str);
        }
        return new IllegalArgumentException(strR);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final long A() throws JsonParseException, InputCoercionException {
        int i12 = this.f413842E;
        if ((i12 & 2) == 0) {
            if (i12 == 0) {
                M0(2);
            }
            int i13 = this.f413842E;
            if ((i13 & 2) == 0) {
                if ((i13 & 1) != 0) {
                    this.f413844G = this.f413843F;
                } else if ((i13 & 4) != 0) {
                    if (AbstractC43700c.f413866h.compareTo(this.f413846I) > 0 || AbstractC43700c.f413867i.compareTo(this.f413846I) < 0) {
                        y0();
                        throw null;
                    }
                    this.f413844G = this.f413846I.longValue();
                } else if ((i13 & 8) != 0) {
                    double d12 = this.f413845H;
                    if (d12 < -9.223372036854776E18d || d12 > 9.223372036854776E18d) {
                        y0();
                        throw null;
                    }
                    this.f413844G = (long) d12;
                } else {
                    if ((i13 & 16) == 0) {
                        com.fasterxml.jackson.core.util.r.c();
                        throw null;
                    }
                    if (AbstractC43700c.f413868j.compareTo(this.f413847J) > 0 || AbstractC43700c.f413869k.compareTo(this.f413847J) < 0) {
                        y0();
                        throw null;
                    }
                    this.f413844G = this.f413847J.longValue();
                }
                this.f413842E |= 2;
            }
        }
        return this.f413844G;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final JsonParser.NumberType B() throws JsonParseException, InputCoercionException {
        if (this.f413842E == 0) {
            M0(0);
        }
        if (this.f413872d != JsonToken.VALUE_NUMBER_INT) {
            return (this.f413842E & 16) != 0 ? JsonParser.NumberType.f341079g : JsonParser.NumberType.f341078f;
        }
        int i12 = this.f413842E;
        return (i12 & 1) != 0 ? JsonParser.NumberType.f341074b : (i12 & 2) != 0 ? JsonParser.NumberType.f341075c : JsonParser.NumberType.f341076d;
    }

    public abstract void B0();

    @Override // com.fasterxml.jackson.core.JsonParser
    public final Number D() throws JsonParseException, InputCoercionException {
        if (this.f413842E == 0) {
            M0(0);
        }
        if (this.f413872d != JsonToken.VALUE_NUMBER_INT) {
            int i12 = this.f413842E;
            if ((i12 & 16) != 0) {
                return this.f413847J;
            }
            if ((i12 & 8) != 0) {
                return Double.valueOf(this.f413845H);
            }
            com.fasterxml.jackson.core.util.r.c();
            throw null;
        }
        int i13 = this.f413842E;
        if ((i13 & 1) != 0) {
            return Integer.valueOf(this.f413843F);
        }
        if ((i13 & 2) != 0) {
            return Long.valueOf(this.f413844G);
        }
        if ((i13 & 4) != 0) {
            return this.f413846I;
        }
        com.fasterxml.jackson.core.util.r.c();
        throw null;
    }

    public final d D0() {
        return JsonParser.Feature.INCLUDE_SOURCE_IN_LOCATION.a(this.f341055b) ? this.f413850n.f341160a : d.f341155f;
    }

    public final int E0(Base64Variant base64Variant, char c12, int i12) {
        if (c12 != '\\') {
            throw Y0(base64Variant, c12, i12, null);
        }
        char cH02 = H0();
        if (cH02 <= ' ' && i12 == 0) {
            return -1;
        }
        int iC2 = base64Variant.c(cH02);
        if (iC2 >= 0 || (iC2 == -2 && i12 >= 2)) {
            return iC2;
        }
        throw Y0(base64Variant, cH02, i12, null);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final Number F() throws JsonParseException, InputCoercionException {
        if (this.f413872d != JsonToken.VALUE_NUMBER_INT) {
            if (this.f413842E == 0) {
                M0(16);
            }
            int i12 = this.f413842E;
            if ((i12 & 16) != 0) {
                return this.f413847J;
            }
            if ((i12 & 8) != 0) {
                return Double.valueOf(this.f413845H);
            }
            com.fasterxml.jackson.core.util.r.c();
            throw null;
        }
        if (this.f413842E == 0) {
            M0(0);
        }
        int i13 = this.f413842E;
        if ((i13 & 1) != 0) {
            return Integer.valueOf(this.f413843F);
        }
        if ((i13 & 2) != 0) {
            return Long.valueOf(this.f413844G);
        }
        if ((i13 & 4) != 0) {
            return this.f413846I;
        }
        com.fasterxml.jackson.core.util.r.c();
        throw null;
    }

    public final int G0(Base64Variant base64Variant, int i12, int i13) {
        if (i12 != 92) {
            throw Y0(base64Variant, i12, i13, null);
        }
        char cH02 = H0();
        if (cH02 <= ' ' && i13 == 0) {
            return -1;
        }
        int iD2 = base64Variant.d(cH02);
        if (iD2 >= 0 || iD2 == -2) {
            return iD2;
        }
        throw Y0(base64Variant, cH02, i13, null);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final g H() {
        return this.f413860x;
    }

    public char H0() {
        throw new UnsupportedOperationException();
    }

    public final com.fasterxml.jackson.core.util.c J0() {
        com.fasterxml.jackson.core.util.c cVar = this.f413840C;
        if (cVar == null) {
            this.f413840C = new com.fasterxml.jackson.core.util.c();
        } else {
            cVar.f();
        }
        return this.f413840C;
    }

    public final void K0(char c12) throws JsonParseException {
        if (JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER.a(this.f341055b)) {
            return;
        }
        if (c12 == '\'' && JsonParser.Feature.ALLOW_SINGLE_QUOTES.a(this.f341055b)) {
            return;
        }
        throw new JsonParseException(this, "Unrecognized character escape " + AbstractC43700c.n0(c12));
    }

    public final int L0() throws JsonParseException, InputCoercionException {
        if (this.f413851o) {
            throw new JsonParseException(this, "Internal error: _parseNumericValue called when parser instance closed");
        }
        if (this.f413872d != JsonToken.VALUE_NUMBER_INT || this.f413849L > 9) {
            M0(1);
            if ((this.f413842E & 1) == 0) {
                T0();
            }
            return this.f413843F;
        }
        int iF2 = this.f413862z.f(this.f413848K);
        this.f413843F = iF2;
        this.f413842E = 1;
        return iF2;
    }

    public final void M0(int i12) throws JsonParseException, InputCoercionException {
        BigDecimal bigDecimalA;
        char[] cArrCopyOfRange;
        char[] cArrCopyOfRange2;
        long jE2;
        long jE3;
        char[] cArr;
        if (this.f413851o) {
            throw new JsonParseException(this, "Internal error: _parseNumericValue called when parser instance closed");
        }
        JsonToken jsonToken = this.f413872d;
        JsonToken jsonToken2 = JsonToken.VALUE_NUMBER_INT;
        p pVar = this.f413862z;
        int i13 = 0;
        if (jsonToken != jsonToken2) {
            if (jsonToken != JsonToken.VALUE_NUMBER_FLOAT) {
                throw new JsonParseException(this, "Current token (" + jsonToken + ") not numeric, can not use numeric value accessors");
            }
            try {
                if (i12 != 16) {
                    this.f413845H = j.a(pVar.g());
                    this.f413842E = 8;
                    return;
                }
                char[] cArr2 = pVar.f341323k;
                if (cArr2 != null) {
                    String str = j.f341179a;
                    bigDecimalA = com.fasterxml.jackson.core.io.a.a(cArr2);
                } else {
                    int i14 = pVar.f341315c;
                    if (i14 >= 0 && (cArrCopyOfRange2 = pVar.f341314b) != null) {
                        int i15 = pVar.f341316d;
                        String str2 = j.f341179a;
                        if (i14 > 0 || i15 != cArrCopyOfRange2.length) {
                            cArrCopyOfRange2 = Arrays.copyOfRange(cArrCopyOfRange2, i14, i15 + i14);
                        }
                        bigDecimalA = com.fasterxml.jackson.core.io.a.a(cArrCopyOfRange2);
                    } else if (pVar.f341319g != 0 || (cArrCopyOfRange = pVar.f341320h) == null) {
                        char[] cArrE = pVar.e();
                        String str3 = j.f341179a;
                        bigDecimalA = com.fasterxml.jackson.core.io.a.a(cArrE);
                    } else {
                        int i16 = pVar.f341321i;
                        String str4 = j.f341179a;
                        if (i16 != cArrCopyOfRange.length) {
                            cArrCopyOfRange = Arrays.copyOfRange(cArrCopyOfRange, 0, i16);
                        }
                        bigDecimalA = com.fasterxml.jackson.core.io.a.a(cArrCopyOfRange);
                    }
                }
                this.f413847J = bigDecimalA;
                this.f413842E = 16;
                return;
            } catch (NumberFormatException e12) {
                JsonParseException jsonParseException = new JsonParseException("Malformed numeric value (" + AbstractC43700c.r0(pVar.g()) + ")", m(), e12);
                jsonParseException.f341129c = this;
                throw jsonParseException;
            }
        }
        int i17 = this.f413849L;
        if (i17 <= 9) {
            this.f413843F = pVar.f(this.f413848K);
            this.f413842E = 1;
            return;
        }
        if (i17 <= 18) {
            boolean z12 = this.f413848K;
            int i18 = pVar.f341315c;
            if (i18 < 0 || (cArr = pVar.f341314b) == null) {
                if (z12) {
                    jE3 = j.e(pVar.f341320h, 1, pVar.f341321i - 1);
                    jE2 = -jE3;
                } else {
                    jE2 = j.e(pVar.f341320h, 0, pVar.f341321i);
                }
            } else if (z12) {
                jE3 = j.e(cArr, i18 + 1, pVar.f341316d - 1);
                jE2 = -jE3;
            } else {
                jE2 = j.e(cArr, i18, pVar.f341316d);
            }
            if (i17 == 10) {
                if (this.f413848K) {
                    if (jE2 >= -2147483648L) {
                        this.f413843F = (int) jE2;
                        this.f413842E = 1;
                        return;
                    }
                } else if (jE2 <= 2147483647L) {
                    this.f413843F = (int) jE2;
                    this.f413842E = 1;
                    return;
                }
            }
            this.f413844G = jE2;
            this.f413842E = 2;
            return;
        }
        String strG = pVar.g();
        try {
            int i19 = this.f413849L;
            char[] cArrM = pVar.m();
            int iN2 = pVar.n();
            boolean z13 = this.f413848K;
            if (z13) {
                iN2++;
            }
            String str5 = z13 ? j.f341179a : j.f341180b;
            int length = str5.length();
            if (i19 >= length) {
                if (i19 <= length) {
                    while (true) {
                        if (i13 >= length) {
                            break;
                        }
                        int iCharAt = cArrM[iN2 + i13] - str5.charAt(i13);
                        if (iCharAt == 0) {
                            i13++;
                        } else if (iCharAt < 0) {
                        }
                    }
                }
                if (i12 != 1 && i12 != 2) {
                    if (i12 != 8 && i12 != 32) {
                        this.f413846I = new BigInteger(strG);
                        this.f413842E = 4;
                        return;
                    }
                    this.f413845H = j.a(strG);
                    this.f413842E = 8;
                    return;
                }
                if (i12 == 1) {
                    throw new InputCoercionException(this, String.format("Numeric value (%s) out of range of int (%d - %s)", AbstractC43700c.p0(strG), Integer.valueOf(BeduinInputModel.MIN_TEXT_VERSION), Integer.MAX_VALUE));
                }
                z0(strG);
                throw null;
            }
            this.f413844G = Long.parseLong(strG);
            this.f413842E = 2;
        } catch (NumberFormatException e13) {
            JsonParseException jsonParseException2 = new JsonParseException("Malformed numeric value (" + AbstractC43700c.r0(strG) + ")", m(), e13);
            jsonParseException2.f341129c = this;
            throw jsonParseException2;
        }
    }

    public void N0() {
        this.f413862z.o();
        char[] cArr = this.f413838A;
        if (cArr != null) {
            this.f413838A = null;
            f fVar = this.f413850n;
            char[] cArr2 = fVar.f341170k;
            if (cArr != cArr2 && cArr.length < cArr2.length) {
                throw new IllegalArgumentException("Trying to release buffer smaller than original");
            }
            fVar.f341170k = null;
            fVar.f341164e.f341280b.set(3, cArr);
        }
    }

    @Override // lX0.AbstractC43700c, com.fasterxml.jackson.core.JsonParser
    public e P() {
        d dVarD0 = D0();
        long j12 = this.f413857u;
        int i12 = this.f413858v;
        int i13 = this.f413859w;
        if (i13 >= 0) {
            i13++;
        }
        return new e(dVarD0, -1L, j12, i12, i13);
    }

    public final void P0(char c12, int i12) throws JsonParseException {
        C44704d c44704d = this.f413860x;
        throw new JsonParseException(this, String.format("Unexpected close marker '%s': expected '%c' (for %s starting at %s)", Character.valueOf((char) i12), Character.valueOf(c12), c44704d.h(), new e(D0(), -1L, -1L, c44704d.f419831h, c44704d.f419832i)));
    }

    public final void Q0(int i12, String str) throws JsonParseException {
        if (!JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS.a(this.f341055b) || i12 > 32) {
            throw new JsonParseException(this, "Illegal unquoted character (" + AbstractC43700c.n0((char) i12) + "): has to be escaped using backslash to be included in " + str);
        }
    }

    public final String R0() {
        return JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS.a(this.f341055b) ? "(JSON String, Number (or 'NaN'/'INF'/'+INF'), Array, Object or token 'null', 'true' or 'false')" : "(JSON String, Number, Array, Object or token 'null', 'true' or 'false')";
    }

    public final void T0() throws InputCoercionException {
        int i12 = this.f413842E;
        if ((i12 & 2) != 0) {
            long j12 = this.f413844G;
            int i13 = (int) j12;
            if (i13 != j12) {
                throw new InputCoercionException(this, String.format("Numeric value (%s) out of range of int (%d - %s)", AbstractC43700c.p0(L()), Integer.valueOf(BeduinInputModel.MIN_TEXT_VERSION), Integer.MAX_VALUE));
            }
            this.f413843F = i13;
        } else if ((i12 & 4) != 0) {
            if (AbstractC43700c.f413864f.compareTo(this.f413846I) > 0 || AbstractC43700c.f413865g.compareTo(this.f413846I) < 0) {
                x0();
                throw null;
            }
            this.f413843F = this.f413846I.intValue();
        } else if ((i12 & 8) != 0) {
            double d12 = this.f413845H;
            if (d12 < -2.147483648E9d || d12 > 2.147483647E9d) {
                x0();
                throw null;
            }
            this.f413843F = (int) d12;
        } else {
            if ((i12 & 16) == 0) {
                com.fasterxml.jackson.core.util.r.c();
                throw null;
            }
            if (AbstractC43700c.f413870l.compareTo(this.f413847J) > 0 || AbstractC43700c.f413871m.compareTo(this.f413847J) < 0) {
                x0();
                throw null;
            }
            this.f413843F = this.f413847J.intValue();
        }
        this.f413842E |= 1;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public boolean X() {
        JsonToken jsonToken = this.f413872d;
        if (jsonToken == JsonToken.VALUE_STRING) {
            return true;
        }
        if (jsonToken == JsonToken.FIELD_NAME) {
            return this.f413839B;
        }
        return false;
    }

    public final JsonToken Z0(String str, double d12) {
        p pVar = this.f413862z;
        pVar.f341314b = null;
        pVar.f341315c = -1;
        pVar.f341316d = 0;
        pVar.f341322j = str;
        pVar.f341323k = null;
        if (pVar.f341318f) {
            pVar.d();
        }
        pVar.f341321i = 0;
        this.f413845H = d12;
        this.f413842E = 8;
        return JsonToken.VALUE_NUMBER_FLOAT;
    }

    public final JsonToken a1(int i12, int i13, int i14, boolean z12) {
        this.f413848K = z12;
        this.f413849L = i12;
        this.f413842E = 0;
        return JsonToken.VALUE_NUMBER_FLOAT;
    }

    @Override // com.fasterxml.jackson.core.JsonParser, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f413851o) {
            return;
        }
        this.f413852p = Math.max(this.f413852p, this.f413853q);
        this.f413851o = true;
        try {
            B0();
        } finally {
            N0();
        }
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final boolean d0() {
        if (this.f413872d != JsonToken.VALUE_NUMBER_FLOAT || (this.f413842E & 8) == 0) {
            return false;
        }
        double d12 = this.f413845H;
        return Double.isNaN(d12) || Double.isInfinite(d12);
    }

    public final JsonToken d1(int i12, boolean z12) {
        this.f413848K = z12;
        this.f413849L = i12;
        this.f413842E = 0;
        return JsonToken.VALUE_NUMBER_INT;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final BigInteger h() throws JsonParseException, InputCoercionException {
        int i12 = this.f413842E;
        if ((i12 & 4) == 0) {
            if (i12 == 0) {
                M0(4);
            }
            int i13 = this.f413842E;
            if ((i13 & 4) == 0) {
                if ((i13 & 16) != 0) {
                    this.f413846I = this.f413847J.toBigInteger();
                } else if ((i13 & 2) != 0) {
                    this.f413846I = BigInteger.valueOf(this.f413844G);
                } else if ((i13 & 1) != 0) {
                    this.f413846I = BigInteger.valueOf(this.f413843F);
                } else {
                    if ((i13 & 8) == 0) {
                        com.fasterxml.jackson.core.util.r.c();
                        throw null;
                    }
                    this.f413846I = BigDecimal.valueOf(this.f413845H).toBigInteger();
                }
                this.f413842E |= 4;
            }
        }
        return this.f413846I;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public byte[] i(Base64Variant base64Variant) throws JsonParseException {
        if (this.f413841D == null) {
            if (this.f413872d != JsonToken.VALUE_STRING) {
                throw new JsonParseException(this, "Current token (" + this.f413872d + ") not VALUE_STRING, can not access as binary");
            }
            com.fasterxml.jackson.core.util.c cVarJ0 = J0();
            m0(L(), cVarJ0, base64Variant);
            this.f413841D = cVarJ0.g();
        }
        return this.f413841D;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final void k0(Object obj) {
        this.f413860x.f419830g = obj;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public e m() {
        return new e(D0(), -1L, this.f413852p + this.f413854r, this.f413855s, (this.f413852p - this.f413856t) + 1);
    }

    @Override // lX0.AbstractC43700c, com.fasterxml.jackson.core.JsonParser
    public final String n() {
        C44704d c44704d;
        JsonToken jsonToken = this.f413872d;
        return ((jsonToken == JsonToken.START_OBJECT || jsonToken == JsonToken.START_ARRAY) && (c44704d = this.f413860x.f419826c) != null) ? c44704d.f419829f : this.f413860x.f419829f;
    }

    @Override // lX0.AbstractC43700c
    public final void o0() {
        if (this.f413860x.f()) {
            return;
        }
        String str = this.f413860x.d() ? "Array" : "Object";
        C44704d c44704d = this.f413860x;
        d dVarD0 = D0();
        c44704d.getClass();
        t0(String.format(": expected close marker for %s (start marker at %s)", str, new e(dVarD0, -1L, -1L, c44704d.f419831h, c44704d.f419832i)));
        throw null;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final BigDecimal q() throws JsonParseException, InputCoercionException {
        int i12 = this.f413842E;
        if ((i12 & 16) == 0) {
            if (i12 == 0) {
                M0(16);
            }
            int i13 = this.f413842E;
            if ((i13 & 16) == 0) {
                if ((i13 & 8) != 0) {
                    String strL = L();
                    String str = j.f341179a;
                    this.f413847J = com.fasterxml.jackson.core.io.a.a(strL.toCharArray());
                } else if ((i13 & 4) != 0) {
                    this.f413847J = new BigDecimal(this.f413846I);
                } else if ((i13 & 2) != 0) {
                    this.f413847J = BigDecimal.valueOf(this.f413844G);
                } else {
                    if ((i13 & 1) == 0) {
                        com.fasterxml.jackson.core.util.r.c();
                        throw null;
                    }
                    this.f413847J = BigDecimal.valueOf(this.f413843F);
                }
                this.f413842E |= 16;
            }
        }
        return this.f413847J;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final double u() throws JsonParseException, InputCoercionException {
        int i12 = this.f413842E;
        if ((i12 & 8) == 0) {
            if (i12 == 0) {
                M0(8);
            }
            int i13 = this.f413842E;
            if ((i13 & 8) == 0) {
                if ((i13 & 16) != 0) {
                    this.f413845H = this.f413847J.doubleValue();
                } else if ((i13 & 4) != 0) {
                    this.f413845H = this.f413846I.doubleValue();
                } else if ((i13 & 2) != 0) {
                    this.f413845H = this.f413844G;
                } else {
                    if ((i13 & 1) == 0) {
                        com.fasterxml.jackson.core.util.r.c();
                        throw null;
                    }
                    this.f413845H = this.f413843F;
                }
                this.f413842E |= 8;
            }
        }
        return this.f413845H;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final float y() {
        return (float) u();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final int z() throws InputCoercionException {
        int i12 = this.f413842E;
        if ((i12 & 1) == 0) {
            if (i12 == 0) {
                return L0();
            }
            if ((i12 & 1) == 0) {
                T0();
            }
        }
        return this.f413843F;
    }
}
