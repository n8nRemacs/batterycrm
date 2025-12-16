package kotlinx.serialization.json.internal;

import kotlin.Metadata;

/* compiled from: AbstractJsonLexer.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/serialization/json/internal/a;", "", "<init>", "()V", "kotlinx-serialization-json"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlinx.serialization.json.internal.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC43450a {

    /* renamed from: a, reason: collision with root package name */
    @X41.f
    public int f413049a;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public String f413051c;

    /* renamed from: b, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final M f413050b = new M();

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final StringBuilder f413052d = new StringBuilder();

    public static /* synthetic */ void q(AbstractC43450a abstractC43450a, String str, int i12, String str2, int i13) {
        if ((i13 & 2) != 0) {
            i12 = abstractC43450a.f413049a;
        }
        if ((i13 & 4) != 0) {
            str2 = "";
        }
        abstractC43450a.p(i12, str, str2);
        throw null;
    }

    public abstract boolean A();

    public final boolean B(boolean z12) {
        int iX2 = x(y());
        int length = t().length() - iX2;
        if (length < 4 || iX2 == -1) {
            return false;
        }
        for (int i12 = 0; i12 < 4; i12++) {
            if ("null".charAt(i12) != t().charAt(iX2 + i12)) {
                return false;
            }
        }
        if (length > 4 && C43451b.a(t().charAt(iX2 + 4)) == 0) {
            return false;
        }
        if (!z12) {
            return true;
        }
        this.f413049a = iX2 + 4;
        return true;
    }

    public final void C(char c12) {
        int i12 = this.f413049a;
        if (i12 > 0 && c12 == '\"') {
            try {
                this.f413049a = i12 - 1;
                String strL = l();
                this.f413049a = i12;
                if (kotlin.jvm.internal.L.f(strL, "null")) {
                    p(this.f413049a - 1, "Expected string literal but 'null' literal was found", "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.");
                    throw null;
                }
            } catch (Throwable th2) {
                this.f413049a = i12;
                throw th2;
            }
        }
        r(C43451b.a(c12), true);
        throw null;
    }

    public final int a(int i12, CharSequence charSequence) {
        int i13 = i12 + 4;
        if (i13 < charSequence.length()) {
            this.f413052d.append((char) (s(i12 + 3, charSequence) + (s(i12, charSequence) << 12) + (s(i12 + 1, charSequence) << 8) + (s(i12 + 2, charSequence) << 4)));
            return i13;
        }
        this.f413049a = i12;
        n();
        if (this.f413049a + 4 < charSequence.length()) {
            return a(this.f413049a, charSequence);
        }
        q(this, "Unexpected EOF during unicode escape", 0, null, 6);
        throw null;
    }

    public void b(int i12, int i13) {
        this.f413052d.append(t(), i12, i13);
    }

    public abstract boolean c();

    public final void d(int i12, String str) {
        if (t().length() - i12 < str.length()) {
            q(this, "Unexpected end of boolean literal", 0, null, 6);
            throw null;
        }
        int length = str.length();
        for (int i13 = 0; i13 < length; i13++) {
            if (str.charAt(i13) != (t().charAt(i12 + i13) | ' ')) {
                q(this, "Expected valid boolean literal prefix, but had '" + l() + '\'', 0, null, 6);
                throw null;
            }
        }
        this.f413049a = str.length() + i12;
    }

    @Y61.k
    public abstract String e();

    public abstract byte f();

    public final byte g(byte b12) {
        byte bF2 = f();
        if (bF2 == b12) {
            return bF2;
        }
        r(b12, true);
        throw null;
    }

    public void h(char c12) {
        n();
        CharSequence charSequenceT = t();
        int i12 = this.f413049a;
        while (true) {
            int iX2 = x(i12);
            if (iX2 == -1) {
                this.f413049a = iX2;
                C(c12);
                throw null;
            }
            int i13 = iX2 + 1;
            char cCharAt = charSequenceT.charAt(iX2);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.f413049a = i13;
                if (cCharAt == c12) {
                    return;
                }
                C(c12);
                throw null;
            }
            i12 = i13;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0191, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0197, code lost:
    
        throw new kotlin.NoWhenBranchMatchedException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0198, code lost:
    
        if (r13 == false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x019f, code lost:
    
        if (r14 == Long.MIN_VALUE) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01a2, code lost:
    
        return -r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01a3, code lost:
    
        q(r19, "Numeric value overflow", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01a8, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x01a9, code lost:
    
        q(r19, "Expected numeric literal", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01ae, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:?, code lost:
    
        return r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00f2, code lost:
    
        q(r19, "Unexpected symbol '" + r9 + "' in numeric literal", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x010a, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x010d, code lost:
    
        if (r11 == r1) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x010f, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0111, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0112, code lost:
    
        if (r1 == r11) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0114, code lost:
    
        if (r13 == false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0118, code lost:
    
        if (r1 == (r11 - 1)) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x011f, code lost:
    
        if (r2 == false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0121, code lost:
    
        if (r3 == false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x012d, code lost:
    
        if (t().charAt(r11) != '\"') goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x012f, code lost:
    
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0132, code lost:
    
        q(r19, "Expected closing quotation mark", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0139, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x013a, code lost:
    
        q(r19, r18, 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0141, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0142, code lost:
    
        r19.f413049a = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0144, code lost:
    
        if (r12 == false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0146, code lost:
    
        r1 = r14;
        r5 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x014b, code lost:
    
        if (r5 != false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x014d, code lost:
    
        r3 = java.lang.Math.pow(10.0d, -r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0155, code lost:
    
        if (r5 != true) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0157, code lost:
    
        r3 = java.lang.Math.pow(10.0d, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x015c, code lost:
    
        r1 = r1 * r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0161, code lost:
    
        if (r1 > 9.223372036854776E18d) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0167, code lost:
    
        if (r1 < (-9.223372036854776E18d)) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x016f, code lost:
    
        if (java.lang.Math.floor(r1) != r1) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0171, code lost:
    
        r14 = (long) r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0173, code lost:
    
        q(r19, "Can't convert " + r1 + " to Long", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x018b, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x018c, code lost:
    
        q(r19, "Numeric value overflow", 0, null, 6);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long i() {
        /*
            Method dump skipped, instructions count: 438
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.serialization.json.internal.AbstractC43450a.i():long");
    }

    @Y61.k
    public final String j() {
        String str = this.f413051c;
        if (str == null) {
            return e();
        }
        this.f413051c = null;
        return str;
    }

    @Y61.k
    public final String k(int i12, int i13, @Y61.k CharSequence charSequence) {
        String strZ;
        char cCharAt = charSequence.charAt(i13);
        boolean z12 = false;
        while (cCharAt != '\"') {
            if (cCharAt == '\\') {
                b(i12, i13);
                int iX2 = x(i13 + 1);
                if (iX2 == -1) {
                    q(this, "Expected escape sequence to continue, got EOF", 0, null, 6);
                    throw null;
                }
                int iA2 = iX2 + 1;
                char cCharAt2 = t().charAt(iX2);
                if (cCharAt2 == 'u') {
                    iA2 = a(iA2, t());
                } else {
                    char c12 = cCharAt2 < 'u' ? C43464o.f413117b[cCharAt2] : (char) 0;
                    if (c12 == 0) {
                        q(this, "Invalid escaped char '" + cCharAt2 + '\'', 0, null, 6);
                        throw null;
                    }
                    this.f413052d.append(c12);
                }
                i12 = x(iA2);
                if (i12 == -1) {
                    q(this, "Unexpected EOF", i12, null, 4);
                    throw null;
                }
            } else {
                i13++;
                if (i13 >= charSequence.length()) {
                    b(i12, i13);
                    i12 = x(i13);
                    if (i12 == -1) {
                        q(this, "Unexpected EOF", i12, null, 4);
                        throw null;
                    }
                } else {
                    continue;
                    cCharAt = charSequence.charAt(i13);
                }
            }
            i13 = i12;
            z12 = true;
            cCharAt = charSequence.charAt(i13);
        }
        if (z12) {
            b(i12, i13);
            StringBuilder sb2 = this.f413052d;
            String string = sb2.toString();
            sb2.setLength(0);
            strZ = string;
        } else {
            strZ = z(i12, i13);
        }
        this.f413049a = i13 + 1;
        return strZ;
    }

    @Y61.k
    public final String l() {
        String strZ;
        String str = this.f413051c;
        if (str != null) {
            this.f413051c = null;
            return str;
        }
        int iY2 = y();
        if (iY2 >= t().length() || iY2 == -1) {
            q(this, "EOF", iY2, null, 4);
            throw null;
        }
        byte bA2 = C43451b.a(t().charAt(iY2));
        if (bA2 == 1) {
            return j();
        }
        if (bA2 != 0) {
            q(this, "Expected beginning of the string, but got " + t().charAt(iY2), 0, null, 6);
            throw null;
        }
        boolean z12 = false;
        while (C43451b.a(t().charAt(iY2)) == 0) {
            iY2++;
            if (iY2 >= t().length()) {
                b(this.f413049a, iY2);
                int iX2 = x(iY2);
                if (iX2 == -1) {
                    this.f413049a = iY2;
                    b(0, 0);
                    StringBuilder sb2 = this.f413052d;
                    String string = sb2.toString();
                    sb2.setLength(0);
                    return string;
                }
                iY2 = iX2;
                z12 = true;
            }
        }
        if (z12) {
            b(this.f413049a, iY2);
            StringBuilder sb3 = this.f413052d;
            String string2 = sb3.toString();
            sb3.setLength(0);
            strZ = string2;
        } else {
            strZ = z(this.f413049a, iY2);
        }
        this.f413049a = iY2;
        return strZ;
    }

    @Y61.k
    public final String m() {
        String strL = l();
        if (!kotlin.jvm.internal.L.f(strL, "null") || t().charAt(this.f413049a - 1) == '\"') {
            return strL;
        }
        q(this, "Unexpected 'null' value instead of string literal", 0, null, 6);
        throw null;
    }

    public final void o() {
        if (f() == 10) {
            return;
        }
        q(this, "Expected EOF after parsing, but had " + t().charAt(this.f413049a - 1) + " instead", 0, null, 6);
        throw null;
    }

    @Y61.k
    public final void p(int i12, @Y61.k String str, @Y61.k String str2) {
        String strConcat = str2.length() == 0 ? "" : "\n".concat(str2);
        StringBuilder sbZ = androidx.appcompat.app.r.z(str, " at path: ");
        sbZ.append(this.f413050b.a());
        sbZ.append(strConcat);
        throw D.d(sbZ.toString(), t(), i12);
    }

    @Y61.k
    public final void r(byte b12, boolean z12) {
        String strB = C43451b.b(b12);
        int i12 = z12 ? this.f413049a - 1 : this.f413049a;
        q(this, androidx.camera.core.Q.a("Expected ", strB, ", but had '", (this.f413049a == t().length() || i12 < 0) ? "EOF" : String.valueOf(t().charAt(i12)), "' instead"), i12, null, 4);
        throw null;
    }

    public final int s(int i12, CharSequence charSequence) {
        char cCharAt = charSequence.charAt(i12);
        if ('0' <= cCharAt && cCharAt < ':') {
            return cCharAt - '0';
        }
        if ('a' <= cCharAt && cCharAt < 'g') {
            return cCharAt - 'W';
        }
        if ('A' <= cCharAt && cCharAt < 'G') {
            return cCharAt - '7';
        }
        q(this, "Invalid toHexChar char '" + cCharAt + "' in unicode escape", 0, null, 6);
        throw null;
    }

    @Y61.k
    public abstract CharSequence t();

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("JsonReader(source='");
        sb2.append((Object) t());
        sb2.append("', currentPosition=");
        return androidx.appcompat.app.r.t(sb2, this.f413049a, ')');
    }

    @Y61.l
    public abstract String u(@Y61.k String str, boolean z12);

    public final byte v() {
        CharSequence charSequenceT = t();
        int i12 = this.f413049a;
        while (true) {
            int iX2 = x(i12);
            if (iX2 == -1) {
                this.f413049a = iX2;
                return (byte) 10;
            }
            char cCharAt = charSequenceT.charAt(iX2);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.f413049a = iX2;
                return C43451b.a(cCharAt);
            }
            i12 = iX2 + 1;
        }
    }

    @Y61.l
    public final String w(boolean z12) {
        String strJ;
        byte bV2 = v();
        if (z12) {
            if (bV2 != 1 && bV2 != 0) {
                return null;
            }
            strJ = l();
        } else {
            if (bV2 != 1) {
                return null;
            }
            strJ = j();
        }
        this.f413051c = strJ;
        return strJ;
    }

    public abstract int x(int i12);

    public int y() {
        int iX2;
        char cCharAt;
        int i12 = this.f413049a;
        while (true) {
            iX2 = x(i12);
            if (iX2 == -1 || !((cCharAt = t().charAt(iX2)) == ' ' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == '\t')) {
                break;
            }
            i12 = iX2 + 1;
        }
        this.f413049a = iX2;
        return iX2;
    }

    @Y61.k
    public String z(int i12, int i13) {
        return t().subSequence(i12, i13).toString();
    }

    public void n() {
    }
}
