package defpackage;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.exc.InputCoercionException;
import com.fasterxml.jackson.core.io.JsonEOFException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import ru.ok.android.onelog.impl.BuildConfig;

/* loaded from: classes.dex */
public abstract class vmb extends px7 {
    public static final byte[] I0 = new byte[0];
    public static final BigInteger J0;
    public static final BigInteger K0;
    public static final BigInteger L0;
    public static final BigInteger M0;
    public static final BigDecimal N0;
    public static final BigDecimal O0;
    public static final BigDecimal P0;
    public static final BigDecimal Q0;
    public int A0;
    public int B0;
    public long C0;
    public double D0;
    public BigInteger E0;
    public BigDecimal F0;
    public boolean G0;
    public int H0;
    public int X;
    public long Y;
    public int Z;
    public by7 b;
    public final b6 c;
    public boolean d;
    public int o;
    public int s0;
    public int t0;
    public int u0;
    public vx7 v0;
    public by7 w0;
    public final t3g x0;
    public char[] y0;
    public boolean z0;

    static {
        BigInteger bigIntegerValueOf = BigInteger.valueOf(-2147483648L);
        J0 = bigIntegerValueOf;
        BigInteger bigIntegerValueOf2 = BigInteger.valueOf(2147483647L);
        K0 = bigIntegerValueOf2;
        BigInteger bigIntegerValueOf3 = BigInteger.valueOf(Long.MIN_VALUE);
        L0 = bigIntegerValueOf3;
        BigInteger bigIntegerValueOf4 = BigInteger.valueOf(BuildConfig.MAX_TIME_TO_UPLOAD);
        M0 = bigIntegerValueOf4;
        N0 = new BigDecimal(bigIntegerValueOf3);
        O0 = new BigDecimal(bigIntegerValueOf4);
        P0 = new BigDecimal(bigIntegerValueOf);
        Q0 = new BigDecimal(bigIntegerValueOf2);
    }

    public vmb(b6 b6Var, int i) {
        this.a = i;
        this.Z = 1;
        this.t0 = 1;
        this.A0 = 0;
        this.c = b6Var;
        this.x0 = new t3g((ev0) b6Var.d);
        this.v0 = new vx7(null, nx7.STRICT_DUPLICATE_DETECTION.a(i) ? new zva(this) : null, 0, 1, 0);
    }

    public static int[] I0(int i, int[] iArr) {
        return iArr == null ? new int[i] : Arrays.copyOf(iArr, iArr.length + i);
    }

    public static final String i0(int i) {
        char c = (char) i;
        if (Character.isISOControl(c)) {
            return wy1.e(i, "(CTRL-CHAR, code ", ")");
        }
        if (i <= 255) {
            return "'" + c + "' (code " + i + ")";
        }
        return "'" + c + "' (code " + i + " / 0x" + Integer.toHexString(i) + ")";
    }

    public static String m0(String str) {
        int length = str.length();
        if (length < 1000) {
            return str;
        }
        if (str.startsWith("-")) {
            length--;
        }
        return String.format("[Integer with %d digits]", Integer.valueOf(length));
    }

    public static String n0(String str) {
        int length = str.length();
        if (length < 1000) {
            return str;
        }
        if (str.startsWith("-")) {
            length--;
        }
        return String.format("[number with %d characters]", Integer.valueOf(length));
    }

    public final BigInteger A0() throws JsonParseException, InputCoercionException {
        int i = this.A0;
        if ((i & 4) == 0) {
            if (i == 0) {
                o0(4);
            }
            int i2 = this.A0;
            if ((i2 & 4) == 0) {
                if ((i2 & 16) != 0) {
                    this.E0 = this.F0.toBigInteger();
                } else if ((i2 & 2) != 0) {
                    this.E0 = BigInteger.valueOf(this.C0);
                } else if ((i2 & 1) != 0) {
                    this.E0 = BigInteger.valueOf(this.B0);
                } else {
                    if ((i2 & 8) == 0) {
                        d0h.a();
                        throw null;
                    }
                    this.E0 = BigDecimal.valueOf(this.D0).toBigInteger();
                }
                this.A0 |= 4;
            }
        }
        return this.E0;
    }

    public final String B0() {
        vx7 vx7Var;
        by7 by7Var = this.b;
        return ((by7Var == by7.START_OBJECT || by7Var == by7.START_ARRAY) && (vx7Var = this.v0.c) != null) ? vx7Var.f : this.v0.f;
    }

    public final BigDecimal C0() throws JsonParseException, InputCoercionException {
        int i = this.A0;
        if ((i & 16) == 0) {
            if (i == 0) {
                o0(16);
            }
            int i2 = this.A0;
            if ((i2 & 16) == 0) {
                if ((i2 & 8) != 0) {
                    String strW = w();
                    String str = dqa.a;
                    try {
                        this.F0 = new BigDecimal(strW);
                    } catch (NumberFormatException unused) {
                        throw new NumberFormatException(ho7.i("Value \"", strW, "\" can not be represented as BigDecimal"));
                    }
                } else if ((i2 & 4) != 0) {
                    this.F0 = new BigDecimal(this.E0);
                } else if ((i2 & 2) != 0) {
                    this.F0 = BigDecimal.valueOf(this.C0);
                } else {
                    if ((i2 & 1) == 0) {
                        d0h.a();
                        throw null;
                    }
                    this.F0 = BigDecimal.valueOf(this.B0);
                }
                this.A0 |= 16;
            }
        }
        return this.F0;
    }

    public final double D0() throws JsonParseException, InputCoercionException {
        int i = this.A0;
        if ((i & 8) == 0) {
            if (i == 0) {
                o0(8);
            }
            int i2 = this.A0;
            if ((i2 & 8) == 0) {
                if ((i2 & 16) != 0) {
                    this.D0 = this.F0.doubleValue();
                } else if ((i2 & 4) != 0) {
                    this.D0 = this.E0.doubleValue();
                } else if ((i2 & 2) != 0) {
                    this.D0 = this.C0;
                } else {
                    if ((i2 & 1) == 0) {
                        d0h.a();
                        throw null;
                    }
                    this.D0 = this.B0;
                }
                this.A0 |= 8;
            }
        }
        return this.D0;
    }

    public final int E0() throws JsonParseException, InputCoercionException {
        int i = this.A0;
        int i2 = i & 1;
        if (i2 == 0) {
            if (i == 0) {
                if (this.d) {
                    q0("Internal error: _parseNumericValue called when parser instance closed");
                    throw null;
                }
                if (this.b != by7.VALUE_NUMBER_INT || this.H0 > 9) {
                    o0(1);
                    if ((this.A0 & 1) == 0) {
                        y0();
                    }
                    return this.B0;
                }
                int iK = this.x0.k(this.G0);
                this.B0 = iK;
                this.A0 = 1;
                return iK;
            }
            if (i2 == 0) {
                y0();
            }
        }
        return this.B0;
    }

    public final long F0() throws JsonParseException, InputCoercionException {
        int i = this.A0;
        if ((i & 2) == 0) {
            if (i == 0) {
                o0(2);
            }
            int i2 = this.A0;
            if ((i2 & 2) == 0) {
                if ((i2 & 1) != 0) {
                    this.C0 = this.B0;
                } else if ((i2 & 4) != 0) {
                    if (L0.compareTo(this.E0) > 0 || M0.compareTo(this.E0) < 0) {
                        J0(w());
                        throw null;
                    }
                    this.C0 = this.E0.longValue();
                } else if ((i2 & 8) != 0) {
                    double d = this.D0;
                    if (d < -9.223372036854776E18d || d > 9.223372036854776E18d) {
                        J0(w());
                        throw null;
                    }
                    this.C0 = (long) d;
                } else {
                    if ((i2 & 16) == 0) {
                        d0h.a();
                        throw null;
                    }
                    if (N0.compareTo(this.F0) > 0 || O0.compareTo(this.F0) < 0) {
                        J0(w());
                        throw null;
                    }
                    this.C0 = this.F0.longValue();
                }
                this.A0 |= 2;
            }
        }
        return this.C0;
    }

    public final int G0() throws JsonParseException, InputCoercionException {
        if (this.A0 == 0) {
            o0(0);
        }
        if (this.b != by7.VALUE_NUMBER_INT) {
            return (this.A0 & 16) != 0 ? 6 : 5;
        }
        int i = this.A0;
        if ((i & 1) != 0) {
            return 1;
        }
        return (i & 2) != 0 ? 2 : 3;
    }

    public final Number H0() throws JsonParseException, InputCoercionException {
        if (this.A0 == 0) {
            o0(0);
        }
        if (this.b != by7.VALUE_NUMBER_INT) {
            int i = this.A0;
            if ((i & 16) != 0) {
                return this.F0;
            }
            if ((i & 8) != 0) {
                return Double.valueOf(this.D0);
            }
            d0h.a();
            throw null;
        }
        int i2 = this.A0;
        if ((i2 & 1) != 0) {
            return Integer.valueOf(this.B0);
        }
        if ((i2 & 2) != 0) {
            return Long.valueOf(this.C0);
        }
        if ((i2 & 4) != 0) {
            return this.E0;
        }
        d0h.a();
        throw null;
    }

    public final void J0(String str) throws InputCoercionException {
        throw new InputCoercionException(this, String.format("Numeric value (%s) out of range of long (%d - %s)", m0(str), Long.MIN_VALUE, Long.valueOf(BuildConfig.MAX_TIME_TO_UPLOAD)));
    }

    public final void K0(int i, String str) throws JsonParseException {
        q0(ho7.i("Unexpected character (", i0(i), ") in numeric value") + ": " + str);
        throw null;
    }

    public final by7 L0(String str, double d) {
        t3g t3gVar = this.x0;
        t3gVar.s0 = null;
        t3gVar.d = -1;
        t3gVar.o = 0;
        t3gVar.c = str;
        t3gVar.u0 = null;
        if (t3gVar.b) {
            t3gVar.c();
        }
        t3gVar.Y = 0;
        this.D0 = d;
        this.A0 = 8;
        return by7.VALUE_NUMBER_FLOAT;
    }

    public final by7 M0(int i, boolean z) {
        this.G0 = z;
        this.H0 = i;
        this.A0 = 0;
        return by7.VALUE_NUMBER_INT;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.d) {
            return;
        }
        this.o = Math.max(this.o, this.X);
        this.d = true;
        try {
            h0();
        } finally {
            p0();
        }
    }

    public abstract void h0();

    public final Object j0() {
        if (nx7.INCLUDE_SOURCE_IN_LOCATION.a(this.a)) {
            return this.c.c;
        }
        return null;
    }

    public final void k0() throws JsonEOFException {
        if (this.v0.d()) {
            return;
        }
        String str = this.v0.b() ? "Array" : "Object";
        vx7 vx7Var = this.v0;
        r0(": expected close marker for " + str + " (start marker at " + new fx7(vx7Var.g, vx7Var.h, -1L, -1L, j0()) + ")");
        throw null;
    }

    public final void l0(char c) throws JsonParseException {
        nx7 nx7Var = nx7.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER;
        int i = this.a;
        if (nx7Var.a(i)) {
            return;
        }
        if (c == '\'' && nx7.ALLOW_SINGLE_QUOTES.a(i)) {
            return;
        }
        q0("Unrecognized character escape " + i0(c));
        throw null;
    }

    public final void o0(int i) throws JsonParseException, InputCoercionException {
        long jC;
        long jC2;
        char[] cArr;
        if (this.d) {
            q0("Internal error: _parseNumericValue called when parser instance closed");
            throw null;
        }
        by7 by7Var = this.b;
        by7 by7Var2 = by7.VALUE_NUMBER_INT;
        t3g t3gVar = this.x0;
        if (by7Var != by7Var2) {
            if (by7Var != by7.VALUE_NUMBER_FLOAT) {
                throw new JsonParseException(this, "Current token (" + by7Var + ") not numeric, can not use numeric value accessors");
            }
            try {
                if (i == 16) {
                    this.F0 = t3gVar.j();
                    this.A0 = 16;
                    return;
                } else {
                    String strL = t3gVar.l();
                    String str = dqa.a;
                    this.D0 = "2.2250738585072012e-308".equals(strL) ? Double.MIN_VALUE : Double.parseDouble(strL);
                    this.A0 = 8;
                    return;
                }
            } catch (NumberFormatException e) {
                throw new JsonParseException("Malformed numeric value (" + n0(t3gVar.l()) + ")", l(), e);
            }
        }
        int i2 = this.H0;
        if (i2 <= 9) {
            this.B0 = t3gVar.k(this.G0);
            this.A0 = 1;
            return;
        }
        int i3 = 0;
        if (i2 <= 18) {
            boolean z = this.G0;
            int i4 = t3gVar.d;
            if (i4 < 0 || (cArr = (char[]) t3gVar.s0) == null) {
                if (z) {
                    jC2 = dqa.c((char[]) t3gVar.t0, 1, t3gVar.Y - 1);
                    jC = -jC2;
                } else {
                    jC = dqa.c((char[]) t3gVar.t0, 0, t3gVar.Y);
                }
            } else if (z) {
                jC2 = dqa.c(cArr, i4 + 1, t3gVar.o - 1);
                jC = -jC2;
            } else {
                jC = dqa.c(cArr, i4, t3gVar.o);
            }
            if (i2 == 10) {
                if (this.G0) {
                    if (jC >= -2147483648L) {
                        this.B0 = (int) jC;
                        this.A0 = 1;
                        return;
                    }
                } else if (jC <= 2147483647L) {
                    this.B0 = (int) jC;
                    this.A0 = 1;
                    return;
                }
            }
            this.C0 = jC;
            this.A0 = 2;
            return;
        }
        String strL2 = t3gVar.l();
        try {
            int i5 = this.H0;
            char[] cArrR = t3gVar.r();
            int i6 = t3gVar.d;
            if (i6 < 0) {
                i6 = 0;
            }
            boolean z2 = this.G0;
            if (z2) {
                i6++;
            }
            String str2 = z2 ? dqa.a : dqa.b;
            int length = str2.length();
            if (i5 >= length) {
                if (i5 <= length) {
                    while (true) {
                        if (i3 >= length) {
                            break;
                        }
                        int iCharAt = cArrR[i6 + i3] - str2.charAt(i3);
                        if (iCharAt == 0) {
                            i3++;
                        } else if (iCharAt < 0) {
                        }
                    }
                }
                if (i != 1 && i != 2) {
                    if (i != 8 && i != 32) {
                        this.E0 = new BigInteger(strL2);
                        this.A0 = 4;
                        return;
                    }
                    String str3 = dqa.a;
                    this.D0 = "2.2250738585072012e-308".equals(strL2) ? Double.MIN_VALUE : Double.parseDouble(strL2);
                    this.A0 = 8;
                    return;
                }
                if (i == 1) {
                    throw new InputCoercionException(this, String.format("Numeric value (%s) out of range of int (%d - %s)", m0(strL2), Integer.MIN_VALUE, Integer.MAX_VALUE));
                }
                J0(strL2);
                throw null;
            }
            this.C0 = Long.parseLong(strL2);
            this.A0 = 2;
        } catch (NumberFormatException e2) {
            throw new JsonParseException("Malformed numeric value (" + n0(strL2) + ")", l(), e2);
        }
    }

    public void p0() {
        t3g t3gVar = this.x0;
        t3gVar.d = -1;
        t3gVar.Y = 0;
        t3gVar.o = 0;
        t3gVar.s0 = null;
        t3gVar.u0 = null;
        if (t3gVar.b) {
            t3gVar.c();
        }
        ev0 ev0Var = (ev0) t3gVar.Z;
        char[] cArr = (char[]) t3gVar.t0;
        if (cArr != null) {
            t3gVar.t0 = null;
            ev0Var.b.set(2, cArr);
        }
        char[] cArr2 = this.y0;
        if (cArr2 != null) {
            this.y0 = null;
            b6 b6Var = this.c;
            char[] cArr3 = (char[]) b6Var.h;
            if (cArr2 != cArr3 && cArr2.length < cArr3.length) {
                throw new IllegalArgumentException("Trying to release buffer smaller than original");
            }
            b6Var.h = null;
            ((ev0) b6Var.d).b.set(3, cArr2);
        }
    }

    public final void q0(String str) throws JsonParseException {
        throw new JsonParseException(this, str);
    }

    public final void r0(String str) throws JsonEOFException {
        throw new JsonEOFException(this, wy1.h("Unexpected end-of-input", str));
    }

    public final void s0(by7 by7Var) throws JsonEOFException {
        r0(by7Var != by7.VALUE_STRING ? (by7Var == by7.VALUE_NUMBER_INT || by7Var == by7.VALUE_NUMBER_FLOAT) ? " in a Number value" : " in a value" : " in a String value");
        throw null;
    }

    public final void t0(char c, int i) throws JsonParseException {
        vx7 vx7Var = this.v0;
        q0(String.format("Unexpected close marker '%s': expected '%c' (for %s starting at %s)", Character.valueOf((char) i), Character.valueOf(c), vx7Var.e(), new fx7(vx7Var.g, vx7Var.h, -1L, -1L, j0())));
        throw null;
    }

    public final void u0(int i, String str) throws JsonParseException {
        if (i < 0) {
            r0(" in " + this.b);
            throw null;
        }
        String strI = ho7.i("Unexpected character (", i0(i), ")");
        if (str != null) {
            strI = u45.k(strI, ": ", str);
        }
        q0(strI);
        throw null;
    }

    public final void v0(int i) throws JsonParseException {
        q0("Illegal character (" + i0((char) i) + "): only regular white space (\\r, \\n, \\t) is allowed between tokens");
        throw null;
    }

    public final void w0(int i, String str) throws JsonParseException {
        if (!nx7.ALLOW_UNQUOTED_CONTROL_CHARS.a(this.a) || i > 32) {
            q0("Illegal unquoted character (" + i0((char) i) + "): has to be escaped using backslash to be included in " + str);
            throw null;
        }
    }

    public final String x0() {
        return nx7.ALLOW_NON_NUMERIC_NUMBERS.a(this.a) ? "(JSON String, Number (or 'NaN'/'INF'/'+INF'), Array, Object or token 'null', 'true' or 'false')" : "(JSON String, Number, Array, Object or token 'null', 'true' or 'false')";
    }

    public final void y0() throws InputCoercionException {
        int i = this.A0;
        if ((i & 2) != 0) {
            long j = this.C0;
            int i2 = (int) j;
            if (i2 != j) {
                throw new InputCoercionException(this, String.format("Numeric value (%s) out of range of int (%d - %s)", m0(w()), Integer.MIN_VALUE, Integer.MAX_VALUE));
            }
            this.B0 = i2;
        } else if ((i & 4) != 0) {
            if (J0.compareTo(this.E0) > 0 || K0.compareTo(this.E0) < 0) {
                throw new InputCoercionException(this, String.format("Numeric value (%s) out of range of int (%d - %s)", m0(w()), Integer.MIN_VALUE, Integer.MAX_VALUE));
            }
            this.B0 = this.E0.intValue();
        } else if ((i & 8) != 0) {
            double d = this.D0;
            if (d < -2.147483648E9d || d > 2.147483647E9d) {
                throw new InputCoercionException(this, String.format("Numeric value (%s) out of range of int (%d - %s)", m0(w()), Integer.MIN_VALUE, Integer.MAX_VALUE));
            }
            this.B0 = (int) d;
        } else {
            if ((i & 16) == 0) {
                d0h.a();
                throw null;
            }
            if (P0.compareTo(this.F0) > 0 || Q0.compareTo(this.F0) < 0) {
                throw new InputCoercionException(this, String.format("Numeric value (%s) out of range of int (%d - %s)", m0(w()), Integer.MIN_VALUE, Integer.MAX_VALUE));
            }
            this.B0 = this.F0.intValue();
        }
        this.A0 |= 1;
    }

    public final int z0() {
        by7 by7Var = this.b;
        if (by7Var == null) {
            return 0;
        }
        return by7Var.d;
    }
}
