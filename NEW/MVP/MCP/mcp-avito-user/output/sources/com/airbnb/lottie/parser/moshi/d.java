package com.airbnb.lottie.parser.moshi;

import com.airbnb.lottie.parser.moshi.JsonReader;
import j.P;
import java.io.EOFException;
import kotlin.text.C43047d;
import okio.C44802l;
import okio.C44805o;
import okio.Y;

/* compiled from: JsonUtf8Reader.java */
/* loaded from: classes10.dex */
final class d extends JsonReader {

    /* renamed from: m, reason: collision with root package name */
    public static final C44805o f59981m;

    /* renamed from: n, reason: collision with root package name */
    public static final C44805o f59982n;

    /* renamed from: o, reason: collision with root package name */
    public static final C44805o f59983o;

    /* renamed from: g, reason: collision with root package name */
    public final Y f59984g;

    /* renamed from: h, reason: collision with root package name */
    public final C44802l f59985h;

    /* renamed from: i, reason: collision with root package name */
    public int f59986i = 0;

    /* renamed from: j, reason: collision with root package name */
    public long f59987j;

    /* renamed from: k, reason: collision with root package name */
    public int f59988k;

    /* renamed from: l, reason: collision with root package name */
    @P
    public String f59989l;

    static {
        C44805o.f420139e.getClass();
        f59981m = C44805o.a.c("'\\");
        f59982n = C44805o.a.c("\"\\");
        f59983o = C44805o.a.c("{}[]:, \n\t\r\f/\\;#=");
        C44805o.a.c("\n\r");
        C44805o.a.c("*/");
    }

    public d(Y y12) {
        this.f59984g = y12;
        this.f59985h = y12.f420047c;
        o(6);
    }

    public final int A(String str, JsonReader.a aVar) {
        int length = aVar.f59979a.length;
        for (int i12 = 0; i12 < length; i12++) {
            if (str.equals(aVar.f59979a[i12])) {
                this.f59986i = 0;
                this.f59966d[this.f59964b - 1] = str;
                return i12;
            }
        }
        return -1;
    }

    public final boolean B(int i12) throws b {
        if (i12 == 9 || i12 == 10 || i12 == 12 || i12 == 13 || i12 == 32) {
            return false;
        }
        if (i12 != 35) {
            if (i12 == 44) {
                return false;
            }
            if (i12 != 47 && i12 != 61) {
                if (i12 == 123 || i12 == 125 || i12 == 58) {
                    return false;
                }
                if (i12 != 59) {
                    switch (i12) {
                        case 91:
                        case 93:
                            return false;
                        case 92:
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        y();
        throw null;
    }

    public final int D(boolean z12) throws b, EOFException {
        int i12 = 0;
        while (true) {
            int i13 = i12 + 1;
            Y y12 = this.f59984g;
            if (!y12.request(i13)) {
                if (z12) {
                    throw new EOFException("End of input");
                }
                return -1;
            }
            long j12 = i12;
            C44802l c44802l = this.f59985h;
            byte bM2 = c44802l.m(j12);
            if (bM2 != 10 && bM2 != 32 && bM2 != 13 && bM2 != 9) {
                c44802l.skip(j12);
                if (bM2 == 47) {
                    if (!y12.request(2L)) {
                        return bM2;
                    }
                    y();
                    throw null;
                }
                if (bM2 != 35) {
                    return bM2;
                }
                y();
                throw null;
            }
            i12 = i13;
        }
    }

    public final String F(C44805o c44805o) throws b {
        StringBuilder sb2 = null;
        while (true) {
            long jB2 = this.f59984g.b(c44805o);
            if (jB2 == -1) {
                x("Unterminated string");
                throw null;
            }
            C44802l c44802l = this.f59985h;
            if (c44802l.m(jB2) != 92) {
                if (sb2 == null) {
                    String strZ1 = c44802l.z1(jB2, C43047d.f410589b);
                    c44802l.readByte();
                    return strZ1;
                }
                sb2.append(c44802l.z1(jB2, C43047d.f410589b));
                c44802l.readByte();
                return sb2.toString();
            }
            if (sb2 == null) {
                sb2 = new StringBuilder();
            }
            sb2.append(c44802l.z1(jB2, C43047d.f410589b));
            c44802l.readByte();
            sb2.append(H());
        }
    }

    public final String G() {
        long jB2 = this.f59984g.b(f59983o);
        C44802l c44802l = this.f59985h;
        if (jB2 == -1) {
            return c44802l.u();
        }
        c44802l.getClass();
        return c44802l.z1(jB2, C43047d.f410589b);
    }

    public final char H() throws b, EOFException {
        int i12;
        Y y12 = this.f59984g;
        if (!y12.request(1L)) {
            x("Unterminated escape sequence");
            throw null;
        }
        C44802l c44802l = this.f59985h;
        byte b12 = c44802l.readByte();
        if (b12 == 10 || b12 == 34 || b12 == 39 || b12 == 47 || b12 == 92) {
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
            x("Invalid escape sequence: \\" + ((char) b12));
            throw null;
        }
        if (!y12.request(4L)) {
            throw new EOFException("Unterminated escape sequence at path " + getPath());
        }
        char c12 = 0;
        for (int i13 = 0; i13 < 4; i13++) {
            byte bM2 = c44802l.m(i13);
            char c13 = (char) (c12 << 4);
            if (bM2 >= 48 && bM2 <= 57) {
                i12 = bM2 - 48;
            } else if (bM2 >= 97 && bM2 <= 102) {
                i12 = bM2 - 87;
            } else {
                if (bM2 < 65 || bM2 > 70) {
                    x("\\u".concat(c44802l.z1(4L, C43047d.f410589b)));
                    throw null;
                }
                i12 = bM2 - 55;
            }
            c12 = (char) (i12 + c13);
        }
        c44802l.skip(4L);
        return c12;
    }

    public final void I(C44805o c44805o) throws b, EOFException {
        while (true) {
            long jB2 = this.f59984g.b(c44805o);
            if (jB2 == -1) {
                x("Unterminated string");
                throw null;
            }
            C44802l c44802l = this.f59985h;
            if (c44802l.m(jB2) != 92) {
                c44802l.skip(jB2 + 1);
                return;
            } else {
                c44802l.skip(jB2 + 1);
                H();
            }
        }
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final void a() throws b, EOFException {
        int iZ2 = this.f59986i;
        if (iZ2 == 0) {
            iZ2 = z();
        }
        if (iZ2 == 3) {
            o(1);
            this.f59967e[this.f59964b - 1] = 0;
            this.f59986i = 0;
        } else {
            throw new a("Expected BEGIN_ARRAY but was " + n() + " at path " + getPath());
        }
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final void b() throws b, EOFException {
        int iZ2 = this.f59986i;
        if (iZ2 == 0) {
            iZ2 = z();
        }
        if (iZ2 == 1) {
            o(3);
            this.f59986i = 0;
        } else {
            throw new a("Expected BEGIN_OBJECT but was " + n() + " at path " + getPath());
        }
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final void c() throws b, EOFException {
        int iZ2 = this.f59986i;
        if (iZ2 == 0) {
            iZ2 = z();
        }
        if (iZ2 != 4) {
            throw new a("Expected END_ARRAY but was " + n() + " at path " + getPath());
        }
        int i12 = this.f59964b;
        this.f59964b = i12 - 1;
        int[] iArr = this.f59967e;
        int i13 = i12 - 2;
        iArr[i13] = iArr[i13] + 1;
        this.f59986i = 0;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f59986i = 0;
        this.f59965c[0] = 8;
        this.f59964b = 1;
        this.f59985h.a();
        this.f59984g.close();
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final void d() throws b, EOFException {
        int iZ2 = this.f59986i;
        if (iZ2 == 0) {
            iZ2 = z();
        }
        if (iZ2 != 2) {
            throw new a("Expected END_OBJECT but was " + n() + " at path " + getPath());
        }
        int i12 = this.f59964b;
        int i13 = i12 - 1;
        this.f59964b = i13;
        this.f59966d[i13] = null;
        int[] iArr = this.f59967e;
        int i14 = i12 - 2;
        iArr[i14] = iArr[i14] + 1;
        this.f59986i = 0;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final boolean f() throws b, EOFException {
        int iZ2 = this.f59986i;
        if (iZ2 == 0) {
            iZ2 = z();
        }
        return (iZ2 == 2 || iZ2 == 4 || iZ2 == 18) ? false : true;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final boolean g() throws b, EOFException {
        int iZ2 = this.f59986i;
        if (iZ2 == 0) {
            iZ2 = z();
        }
        if (iZ2 == 5) {
            this.f59986i = 0;
            int[] iArr = this.f59967e;
            int i12 = this.f59964b - 1;
            iArr[i12] = iArr[i12] + 1;
            return true;
        }
        if (iZ2 == 6) {
            this.f59986i = 0;
            int[] iArr2 = this.f59967e;
            int i13 = this.f59964b - 1;
            iArr2[i13] = iArr2[i13] + 1;
            return false;
        }
        throw new a("Expected a boolean but was " + n() + " at path " + getPath());
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final double h() throws NumberFormatException, b, EOFException {
        int iZ2 = this.f59986i;
        if (iZ2 == 0) {
            iZ2 = z();
        }
        if (iZ2 == 16) {
            this.f59986i = 0;
            int[] iArr = this.f59967e;
            int i12 = this.f59964b - 1;
            iArr[i12] = iArr[i12] + 1;
            return this.f59987j;
        }
        if (iZ2 == 17) {
            long j12 = this.f59988k;
            C44802l c44802l = this.f59985h;
            c44802l.getClass();
            this.f59989l = c44802l.z1(j12, C43047d.f410589b);
        } else if (iZ2 == 9) {
            this.f59989l = F(f59982n);
        } else if (iZ2 == 8) {
            this.f59989l = F(f59981m);
        } else if (iZ2 == 10) {
            this.f59989l = G();
        } else if (iZ2 != 11) {
            throw new a("Expected a double but was " + n() + " at path " + getPath());
        }
        this.f59986i = 11;
        try {
            double d12 = Double.parseDouble(this.f59989l);
            if (Double.isNaN(d12) || Double.isInfinite(d12)) {
                throw new b("JSON forbids NaN and infinities: " + d12 + " at path " + getPath());
            }
            this.f59989l = null;
            this.f59986i = 0;
            int[] iArr2 = this.f59967e;
            int i13 = this.f59964b - 1;
            iArr2[i13] = iArr2[i13] + 1;
            return d12;
        } catch (NumberFormatException unused) {
            throw new a("Expected a double but was " + this.f59989l + " at path " + getPath());
        }
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final int i() throws NumberFormatException, b, EOFException {
        int iZ2 = this.f59986i;
        if (iZ2 == 0) {
            iZ2 = z();
        }
        if (iZ2 == 16) {
            long j12 = this.f59987j;
            int i12 = (int) j12;
            if (j12 == i12) {
                this.f59986i = 0;
                int[] iArr = this.f59967e;
                int i13 = this.f59964b - 1;
                iArr[i13] = iArr[i13] + 1;
                return i12;
            }
            throw new a("Expected an int but was " + this.f59987j + " at path " + getPath());
        }
        if (iZ2 == 17) {
            long j13 = this.f59988k;
            C44802l c44802l = this.f59985h;
            c44802l.getClass();
            this.f59989l = c44802l.z1(j13, C43047d.f410589b);
        } else if (iZ2 == 9 || iZ2 == 8) {
            String strF = iZ2 == 9 ? F(f59982n) : F(f59981m);
            this.f59989l = strF;
            try {
                int i14 = Integer.parseInt(strF);
                this.f59986i = 0;
                int[] iArr2 = this.f59967e;
                int i15 = this.f59964b - 1;
                iArr2[i15] = iArr2[i15] + 1;
                return i14;
            } catch (NumberFormatException unused) {
            }
        } else if (iZ2 != 11) {
            throw new a("Expected an int but was " + n() + " at path " + getPath());
        }
        this.f59986i = 11;
        try {
            double d12 = Double.parseDouble(this.f59989l);
            int i16 = (int) d12;
            if (i16 != d12) {
                throw new a("Expected an int but was " + this.f59989l + " at path " + getPath());
            }
            this.f59989l = null;
            this.f59986i = 0;
            int[] iArr3 = this.f59967e;
            int i17 = this.f59964b - 1;
            iArr3[i17] = iArr3[i17] + 1;
            return i16;
        } catch (NumberFormatException unused2) {
            throw new a("Expected an int but was " + this.f59989l + " at path " + getPath());
        }
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final String j() throws b, EOFException {
        String strF;
        int iZ2 = this.f59986i;
        if (iZ2 == 0) {
            iZ2 = z();
        }
        if (iZ2 == 14) {
            strF = G();
        } else if (iZ2 == 13) {
            strF = F(f59982n);
        } else if (iZ2 == 12) {
            strF = F(f59981m);
        } else {
            if (iZ2 != 15) {
                throw new a("Expected a name but was " + n() + " at path " + getPath());
            }
            strF = this.f59989l;
        }
        this.f59986i = 0;
        this.f59966d[this.f59964b - 1] = strF;
        return strF;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final String k() throws b, EOFException {
        String strZ1;
        int iZ2 = this.f59986i;
        if (iZ2 == 0) {
            iZ2 = z();
        }
        if (iZ2 == 10) {
            strZ1 = G();
        } else if (iZ2 == 9) {
            strZ1 = F(f59982n);
        } else if (iZ2 == 8) {
            strZ1 = F(f59981m);
        } else if (iZ2 == 11) {
            strZ1 = this.f59989l;
            this.f59989l = null;
        } else if (iZ2 == 16) {
            strZ1 = Long.toString(this.f59987j);
        } else {
            if (iZ2 != 17) {
                throw new a("Expected a string but was " + n() + " at path " + getPath());
            }
            long j12 = this.f59988k;
            C44802l c44802l = this.f59985h;
            c44802l.getClass();
            strZ1 = c44802l.z1(j12, C43047d.f410589b);
        }
        this.f59986i = 0;
        int[] iArr = this.f59967e;
        int i12 = this.f59964b - 1;
        iArr[i12] = iArr[i12] + 1;
        return strZ1;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final JsonReader.Token n() throws b, EOFException {
        int iZ2 = this.f59986i;
        if (iZ2 == 0) {
            iZ2 = z();
        }
        switch (iZ2) {
            case 1:
                return JsonReader.Token.f59970d;
            case 2:
                return JsonReader.Token.f59971e;
            case 3:
                return JsonReader.Token.f59968b;
            case 4:
                return JsonReader.Token.f59969c;
            case 5:
            case 6:
                return JsonReader.Token.f59975i;
            case 7:
                return JsonReader.Token.f59976j;
            case 8:
            case 9:
            case 10:
            case 11:
                return JsonReader.Token.f59973g;
            case 12:
            case 13:
            case 14:
            case 15:
                return JsonReader.Token.f59972f;
            case 16:
            case 17:
                return JsonReader.Token.f59974h;
            case 18:
                return JsonReader.Token.f59977k;
            default:
                throw new AssertionError();
        }
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final int p(JsonReader.a aVar) throws b, EOFException {
        int iZ2 = this.f59986i;
        if (iZ2 == 0) {
            iZ2 = z();
        }
        if (iZ2 < 12 || iZ2 > 15) {
            return -1;
        }
        if (iZ2 == 15) {
            return A(this.f59989l, aVar);
        }
        int iT6 = this.f59984g.t6(aVar.f59980b);
        if (iT6 != -1) {
            this.f59986i = 0;
            this.f59966d[this.f59964b - 1] = aVar.f59979a[iT6];
            return iT6;
        }
        String str = this.f59966d[this.f59964b - 1];
        String strJ = j();
        int iA2 = A(strJ, aVar);
        if (iA2 == -1) {
            this.f59986i = 15;
            this.f59989l = strJ;
            this.f59966d[this.f59964b - 1] = str;
        }
        return iA2;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final void q() throws b, EOFException {
        int iZ2 = this.f59986i;
        if (iZ2 == 0) {
            iZ2 = z();
        }
        if (iZ2 == 14) {
            long jB2 = this.f59984g.b(f59983o);
            C44802l c44802l = this.f59985h;
            if (jB2 == -1) {
                jB2 = c44802l.f420125c;
            }
            c44802l.skip(jB2);
        } else if (iZ2 == 13) {
            I(f59982n);
        } else if (iZ2 == 12) {
            I(f59981m);
        } else if (iZ2 != 15) {
            throw new a("Expected a name but was " + n() + " at path " + getPath());
        }
        this.f59986i = 0;
        this.f59966d[this.f59964b - 1] = "null";
    }

    public final String toString() {
        return "JsonReader(" + this.f59984g + ")";
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final void u() throws b, EOFException {
        int i12 = 0;
        do {
            int iZ2 = this.f59986i;
            if (iZ2 == 0) {
                iZ2 = z();
            }
            if (iZ2 == 3) {
                o(1);
            } else if (iZ2 == 1) {
                o(3);
            } else {
                if (iZ2 == 4) {
                    i12--;
                    if (i12 < 0) {
                        throw new a("Expected a value but was " + n() + " at path " + getPath());
                    }
                    this.f59964b--;
                } else if (iZ2 == 2) {
                    i12--;
                    if (i12 < 0) {
                        throw new a("Expected a value but was " + n() + " at path " + getPath());
                    }
                    this.f59964b--;
                } else {
                    C44802l c44802l = this.f59985h;
                    if (iZ2 == 14 || iZ2 == 10) {
                        long jB2 = this.f59984g.b(f59983o);
                        if (jB2 == -1) {
                            jB2 = c44802l.f420125c;
                        }
                        c44802l.skip(jB2);
                    } else if (iZ2 == 9 || iZ2 == 13) {
                        I(f59982n);
                    } else if (iZ2 == 8 || iZ2 == 12) {
                        I(f59981m);
                    } else if (iZ2 == 17) {
                        c44802l.skip(this.f59988k);
                    } else if (iZ2 == 18) {
                        throw new a("Expected a value but was " + n() + " at path " + getPath());
                    }
                }
                this.f59986i = 0;
            }
            i12++;
            this.f59986i = 0;
        } while (i12 != 0);
        int[] iArr = this.f59967e;
        int i13 = this.f59964b - 1;
        iArr[i13] = iArr[i13] + 1;
        this.f59966d[i13] = "null";
    }

    public final void y() throws b {
        x("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:135:0x0199, code lost:
    
        if (B(r1) != false) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x019b, code lost:
    
        if (r4 != 2) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x019d, code lost:
    
        if (r8 == false) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x01a3, code lost:
    
        if (r10 != Long.MIN_VALUE) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x01a5, code lost:
    
        if (r13 == false) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x01ab, code lost:
    
        if (r10 != 0) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x01ad, code lost:
    
        if (r13 != false) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x01af, code lost:
    
        if (r13 == false) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x01b2, code lost:
    
        r10 = -r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x01b3, code lost:
    
        r21.f59987j = r10;
        r9.skip(r5);
        r1 = 16;
        r21.f59986i = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x01bd, code lost:
    
        r16 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x01c0, code lost:
    
        if (r4 == 2) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x01c3, code lost:
    
        if (r4 == 4) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x01c6, code lost:
    
        if (r4 != 7) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x01c8, code lost:
    
        r21.f59988k = r5;
        r1 = 17;
        r21.f59986i = 17;
     */
    /* JADX WARN: Removed duplicated region for block: B:173:0x01f5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:174:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0112 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0113  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int z() throws com.airbnb.lottie.parser.moshi.b, java.io.EOFException {
        /*
            Method dump skipped, instructions count: 670
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.parser.moshi.d.z():int");
    }
}
