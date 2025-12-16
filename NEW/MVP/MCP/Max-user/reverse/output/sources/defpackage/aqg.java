package defpackage;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.io.JsonEOFException;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicReference;
import ru.ok.android.externcalls.analytics.events.SdkMetricStatEvent;

/* loaded from: classes.dex */
public final class aqg extends vmb {
    public static final int X0 = nx7.ALLOW_TRAILING_COMMA.b;
    public static final int Y0 = nx7.ALLOW_NUMERIC_LEADING_ZEROS.b;
    public static final int Z0 = nx7.ALLOW_NON_NUMERIC_NUMBERS.b;
    public static final int a1 = nx7.ALLOW_MISSING_VALUES.b;
    public static final int b1 = nx7.ALLOW_SINGLE_QUOTES.b;
    public static final int c1 = nx7.ALLOW_UNQUOTED_FIELD_NAMES.b;
    public static final int d1 = nx7.ALLOW_COMMENTS.b;
    public static final int e1 = nx7.ALLOW_YAML_COMMENTS.b;
    public static final int[] f1 = hb2.d;
    public static final int[] g1 = hb2.c;
    public final sx0 R0;
    public int[] S0;
    public boolean T0;
    public BufferedInputStream U0;
    public byte[] V0;
    public final boolean W0;

    public aqg(b6 b6Var, int i, BufferedInputStream bufferedInputStream, sx0 sx0Var, byte[] bArr, int i2, int i3, int i4, boolean z) {
        super(b6Var, i);
        this.S0 = new int[16];
        this.U0 = bufferedInputStream;
        this.R0 = sx0Var;
        this.V0 = bArr;
        this.o = i2;
        this.X = i3;
        this.s0 = i2 - i4;
        this.Y = (-i2) + i4;
        this.W0 = z;
    }

    public static final int e1(int i, int i2) {
        return i2 == 4 ? i : i | ((-1) << (i2 << 3));
    }

    public final void A1(int i) throws JsonParseException {
        int i2 = this.o + 1;
        this.o = i2;
        if (i != 9) {
            if (i == 10) {
                this.Z++;
                this.s0 = i2;
            } else if (i == 13) {
                p1();
            } else {
                if (i == 32) {
                    return;
                }
                u0(i, "Expected space separating root-level values");
                throw null;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String B1(int r20, int r21, int[] r22) throws com.fasterxml.jackson.core.JsonParseException {
        /*
            Method dump skipped, instructions count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aqg.B1(int, int, int[]):java.lang.String");
    }

    public final String C1(int i, int i2) {
        int iE1 = e1(i, i2);
        String strJ = this.R0.j(iE1);
        if (strJ != null) {
            return strJ;
        }
        int[] iArr = this.S0;
        iArr[0] = iE1;
        return B1(1, i2, iArr);
    }

    public final String D1(int i, int i2, int i3) {
        int iE1 = e1(i2, i3);
        String strK = this.R0.k(i, iE1);
        if (strK != null) {
            return strK;
        }
        int[] iArr = this.S0;
        iArr[0] = i;
        iArr[1] = iE1;
        return B1(2, i3, iArr);
    }

    public final String E1(int i, int i2, int i3, int i4) {
        int iE1 = e1(i3, i4);
        String strL = this.R0.l(i, i2, iE1);
        if (strL != null) {
            return strL;
        }
        int[] iArr = this.S0;
        iArr[0] = i;
        iArr[1] = i2;
        iArr[2] = e1(iE1, i4);
        return B1(3, i4, iArr);
    }

    public final String F1(int i, int i2, int i3, int[] iArr) {
        if (i >= iArr.length) {
            iArr = vmb.I0(iArr.length, iArr);
            this.S0 = iArr;
        }
        int i4 = i + 1;
        iArr[i] = e1(i2, i3);
        String strM = this.R0.m(i4, iArr);
        return strM == null ? B1(i4, i3, iArr) : strM;
    }

    public final int G1() throws JsonEOFException {
        if (this.o >= this.X) {
            Y0();
        }
        byte[] bArr = this.V0;
        int i = this.o;
        this.o = i + 1;
        return bArr[i] & 255;
    }

    public final String H1(int i, int i2, int i3, int i4, int[] iArr) throws JsonParseException {
        while (true) {
            if (g1[i3] != 0) {
                if (i3 == 34) {
                    if (i4 > 0) {
                        if (i >= iArr.length) {
                            iArr = vmb.I0(iArr.length, iArr);
                            this.S0 = iArr;
                        }
                        iArr[i] = e1(i2, i4);
                        i++;
                    }
                    String strM = this.R0.m(i, iArr);
                    return strM == null ? B1(i, i4, iArr) : strM;
                }
                if (i3 != 92) {
                    w0(i3, SdkMetricStatEvent.NAME_KEY);
                } else {
                    i3 = O0();
                }
                if (i3 > 127) {
                    int i5 = 0;
                    if (i4 >= 4) {
                        if (i >= iArr.length) {
                            iArr = vmb.I0(iArr.length, iArr);
                            this.S0 = iArr;
                        }
                        iArr[i] = i2;
                        i++;
                        i2 = 0;
                        i4 = 0;
                    }
                    if (i3 < 2048) {
                        i2 = (i2 << 8) | (i3 >> 6) | 192;
                        i4++;
                    } else {
                        int i6 = (i2 << 8) | (i3 >> 12) | 224;
                        int i7 = i4 + 1;
                        if (i7 >= 4) {
                            if (i >= iArr.length) {
                                iArr = vmb.I0(iArr.length, iArr);
                                this.S0 = iArr;
                            }
                            iArr[i] = i6;
                            i++;
                            i7 = 0;
                        } else {
                            i5 = i6;
                        }
                        i2 = (i5 << 8) | ((i3 >> 6) & 63) | 128;
                        i4 = i7 + 1;
                    }
                    i3 = (i3 & 63) | 128;
                }
            }
            if (i4 < 4) {
                i4++;
                i2 = (i2 << 8) | i3;
            } else {
                if (i >= iArr.length) {
                    iArr = vmb.I0(iArr.length, iArr);
                    this.S0 = iArr;
                }
                iArr[i] = i2;
                i2 = i3;
                i++;
                i4 = 1;
            }
            if (this.o >= this.X && !X0()) {
                by7 by7Var = by7.NOT_AVAILABLE;
                r0(" in field name");
                throw null;
            }
            byte[] bArr = this.V0;
            int i8 = this.o;
            this.o = i8 + 1;
            i3 = bArr[i8] & 255;
        }
    }

    public final String I1(int i, int i2, int i3, int i4, int i5) {
        int[] iArr = this.S0;
        iArr[0] = i;
        iArr[1] = i2;
        return H1(2, i3, i4, i5, iArr);
    }

    public final int N0(int i) throws JsonParseException {
        int i2;
        char c;
        int i3 = i & 255;
        if (i3 <= 127) {
            return i3;
        }
        if ((i & 224) == 192) {
            i2 = i & 31;
            c = 1;
        } else if ((i & 240) == 224) {
            i2 = i & 15;
            c = 2;
        } else {
            if ((i & 248) != 240) {
                l1(i & 255);
                throw null;
            }
            i2 = i & 7;
            c = 3;
        }
        int iG1 = G1();
        if ((iG1 & 192) != 128) {
            m1(iG1 & 255);
            throw null;
        }
        int i4 = (i2 << 6) | (iG1 & 63);
        if (c <= 1) {
            return i4;
        }
        int iG12 = G1();
        if ((iG12 & 192) != 128) {
            m1(iG12 & 255);
            throw null;
        }
        int i5 = (i4 << 6) | (iG12 & 63);
        if (c <= 2) {
            return i5;
        }
        int iG13 = G1();
        if ((iG13 & 192) == 128) {
            return (i5 << 6) | (iG13 & 63);
        }
        m1(iG13 & 255);
        throw null;
    }

    public final char O0() throws JsonParseException {
        if (this.o >= this.X && !X0()) {
            by7 by7Var = by7.NOT_AVAILABLE;
            r0(" in character escape sequence");
            throw null;
        }
        byte[] bArr = this.V0;
        int i = this.o;
        this.o = i + 1;
        byte b = bArr[i];
        if (b == 34 || b == 47 || b == 92) {
            return (char) b;
        }
        if (b == 98) {
            return '\b';
        }
        if (b == 102) {
            return '\f';
        }
        if (b == 110) {
            return '\n';
        }
        if (b == 114) {
            return '\r';
        }
        if (b == 116) {
            return '\t';
        }
        if (b != 117) {
            char cN0 = (char) N0(b);
            l0(cN0);
            return cN0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < 4; i3++) {
            if (this.o >= this.X && !X0()) {
                by7 by7Var2 = by7.NOT_AVAILABLE;
                r0(" in character escape sequence");
                throw null;
            }
            byte[] bArr2 = this.V0;
            int i4 = this.o;
            this.o = i4 + 1;
            int i5 = bArr2[i4] & 255;
            int i6 = hb2.i[i5];
            if (i6 < 0) {
                u0(i5, "expected a hex-digit for character escape sequence");
                throw null;
            }
            i2 = (i2 << 4) | i6;
        }
        return (char) i2;
    }

    @Override // defpackage.px7
    public final int P() throws JsonParseException {
        by7 by7Var = this.b;
        if (by7Var == null) {
            return 0;
        }
        int i = by7Var.d;
        if (i == 5) {
            return this.v0.f.length();
        }
        if (i != 6) {
            if (i != 7 && i != 8) {
                return by7Var.b.length;
            }
        } else if (this.T0) {
            this.T0 = false;
            T0();
        }
        return this.x0.t();
    }

    public final int P0(int i) throws JsonParseException {
        if (this.o >= this.X) {
            Y0();
        }
        byte[] bArr = this.V0;
        int i2 = this.o;
        int i3 = i2 + 1;
        this.o = i3;
        byte b = bArr[i2];
        if ((b & 192) == 128) {
            return ((i & 31) << 6) | (b & 63);
        }
        n1(b & 255, i3);
        throw null;
    }

    @Override // defpackage.px7
    public final int Q() throws JsonParseException {
        by7 by7Var = this.b;
        if (by7Var != null) {
            int i = by7Var.d;
            if (i != 6) {
                if (i == 7 || i == 8) {
                }
            } else if (this.T0) {
                this.T0 = false;
                T0();
            }
            int i2 = this.x0.d;
            if (i2 >= 0) {
                return i2;
            }
        }
        return 0;
    }

    public final int Q0(int i) throws JsonParseException {
        if (this.o >= this.X) {
            Y0();
        }
        int i2 = i & 15;
        byte[] bArr = this.V0;
        int i3 = this.o;
        int i4 = i3 + 1;
        this.o = i4;
        byte b = bArr[i3];
        if ((b & 192) != 128) {
            n1(b & 255, i4);
            throw null;
        }
        int i5 = (i2 << 6) | (b & 63);
        if (i4 >= this.X) {
            Y0();
        }
        byte[] bArr2 = this.V0;
        int i6 = this.o;
        int i7 = i6 + 1;
        this.o = i7;
        byte b2 = bArr2[i6];
        if ((b2 & 192) == 128) {
            return (i5 << 6) | (b2 & 63);
        }
        n1(b2 & 255, i7);
        throw null;
    }

    public final int R0(int i) throws JsonParseException {
        int i2 = i & 15;
        byte[] bArr = this.V0;
        int i3 = this.o;
        int i4 = i3 + 1;
        this.o = i4;
        byte b = bArr[i3];
        if ((b & 192) != 128) {
            n1(b & 255, i4);
            throw null;
        }
        int i5 = (i2 << 6) | (b & 63);
        int i6 = i3 + 2;
        this.o = i6;
        byte b2 = bArr[i4];
        if ((b2 & 192) == 128) {
            return (i5 << 6) | (b2 & 63);
        }
        n1(b2 & 255, i6);
        throw null;
    }

    public final int S0(int i) throws JsonParseException {
        if (this.o >= this.X) {
            Y0();
        }
        byte[] bArr = this.V0;
        int i2 = this.o;
        int i3 = i2 + 1;
        this.o = i3;
        byte b = bArr[i2];
        if ((b & 192) != 128) {
            n1(b & 255, i3);
            throw null;
        }
        int i4 = ((i & 7) << 6) | (b & 63);
        if (i3 >= this.X) {
            Y0();
        }
        byte[] bArr2 = this.V0;
        int i5 = this.o;
        int i6 = i5 + 1;
        this.o = i6;
        byte b2 = bArr2[i5];
        if ((b2 & 192) != 128) {
            n1(b2 & 255, i6);
            throw null;
        }
        int i7 = (i4 << 6) | (b2 & 63);
        if (i6 >= this.X) {
            Y0();
        }
        byte[] bArr3 = this.V0;
        int i8 = this.o;
        int i9 = i8 + 1;
        this.o = i9;
        byte b3 = bArr3[i8];
        if ((b3 & 192) == 128) {
            return ((i7 << 6) | (b3 & 63)) - 65536;
        }
        n1(b3 & 255, i9);
        throw null;
    }

    public final void T0() throws JsonParseException {
        int i = this.o;
        if (i >= this.X) {
            Y0();
            i = this.o;
        }
        t3g t3gVar = this.x0;
        char[] cArrM = t3gVar.m();
        int iMin = Math.min(this.X, cArrM.length + i);
        byte[] bArr = this.V0;
        int i2 = 0;
        while (true) {
            if (i >= iMin) {
                break;
            }
            int i3 = bArr[i] & 255;
            if (f1[i3] == 0) {
                i++;
                cArrM[i2] = (char) i3;
                i2++;
            } else if (i3 == 34) {
                this.o = i + 1;
                t3gVar.Y = i2;
                return;
            }
        }
        this.o = i;
        U0(cArrM, i2);
    }

    public final void U0(char[] cArr, int i) throws JsonParseException {
        byte[] bArr = this.V0;
        while (true) {
            int i2 = this.o;
            if (i2 >= this.X) {
                Y0();
                i2 = this.o;
            }
            int length = cArr.length;
            int i3 = 0;
            t3g t3gVar = this.x0;
            if (i >= length) {
                cArr = t3gVar.o();
                i = 0;
            }
            int iMin = Math.min(this.X, (cArr.length - i) + i2);
            while (true) {
                if (i2 >= iMin) {
                    this.o = i2;
                    break;
                }
                int i4 = i2 + 1;
                int iO0 = bArr[i2] & 255;
                int i5 = f1[iO0];
                if (i5 != 0) {
                    this.o = i4;
                    if (iO0 == 34) {
                        t3gVar.Y = i;
                        return;
                    }
                    if (i5 == 1) {
                        iO0 = O0();
                    } else if (i5 == 2) {
                        iO0 = P0(iO0);
                    } else if (i5 == 3) {
                        iO0 = this.X - i4 >= 2 ? R0(iO0) : Q0(iO0);
                    } else if (i5 == 4) {
                        int iS0 = S0(iO0);
                        int i6 = i + 1;
                        cArr[i] = (char) ((iS0 >> 10) | 55296);
                        if (i6 >= cArr.length) {
                            cArr = t3gVar.o();
                            i = 0;
                        } else {
                            i = i6;
                        }
                        iO0 = (iS0 & 1023) | 56320;
                    } else {
                        if (iO0 >= 32) {
                            k1(iO0);
                            throw null;
                        }
                        w0(iO0, "string value");
                    }
                    if (i >= cArr.length) {
                        cArr = t3gVar.o();
                    } else {
                        i3 = i;
                    }
                    i = i3 + 1;
                    cArr[i3] = (char) iO0;
                } else {
                    cArr[i] = (char) iO0;
                    i2 = i4;
                    i++;
                }
            }
        }
    }

    public final by7 V0(int i, boolean z) throws JsonParseException {
        String str;
        if (i == 73) {
            if (this.o >= this.X && !X0()) {
                s0(by7.VALUE_NUMBER_FLOAT);
                throw null;
            }
            byte[] bArr = this.V0;
            int i2 = this.o;
            this.o = i2 + 1;
            i = bArr[i2];
            if (i == 78) {
                str = z ? "-INF" : "+INF";
            } else if (i == 110) {
                str = z ? "-Infinity" : "+Infinity";
            }
            b1(3, str);
            if ((this.a & Z0) != 0) {
                return L0(str, z ? Double.NEGATIVE_INFINITY : Double.POSITIVE_INFINITY);
            }
            throw new JsonParseException(this, ho7.i("Non-standard token '", str, "': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow"));
        }
        K0(i, "expected digit (0-9) to follow minus sign, for valid numeric value");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0021, code lost:
    
        if (r13 != 44) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x004f, code lost:
    
        if (r12.v0.b() == false) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0059, code lost:
    
        if (r12.v0.d() != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005e, code lost:
    
        if ((r0 & defpackage.aqg.a1) == 0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0060, code lost:
    
        r12.o--;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0067, code lost:
    
        return defpackage.by7.VALUE_NULL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00dd, code lost:
    
        if (r8 != 39) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00df, code lost:
    
        r0.Y = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00e3, code lost:
    
        return defpackage.by7.VALUE_STRING;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00e4, code lost:
    
        r7 = r10[r8];
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00e6, code lost:
    
        if (r7 == 1) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00e9, code lost:
    
        if (r7 == 2) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00ec, code lost:
    
        if (r7 == 3) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00ef, code lost:
    
        if (r7 == 4) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00f3, code lost:
    
        if (r8 >= 32) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00f5, code lost:
    
        w0(r8, "string value");
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x00fa, code lost:
    
        k1(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x00fd, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x00fe, code lost:
    
        r7 = S0(r8);
        r8 = r6 + 1;
        r13[r6] = (char) ((r7 >> 10) | 55296);
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x010e, code lost:
    
        if (r8 < r13.length) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0110, code lost:
    
        r13 = r0.o();
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0116, code lost:
    
        r6 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0117, code lost:
    
        r7 = (r7 & 1023) | 56320;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0121, code lost:
    
        if ((r12.X - r9) < 2) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0123, code lost:
    
        r7 = R0(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0128, code lost:
    
        r7 = Q0(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x012d, code lost:
    
        r7 = P0(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0132, code lost:
    
        r7 = O0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0137, code lost:
    
        if (r6 < r13.length) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0139, code lost:
    
        r13 = r0.o();
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x013e, code lost:
    
        r13[r6] = (char) r7;
        r6 = r6 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.by7 W0(int r13) throws com.fasterxml.jackson.core.JsonParseException {
        /*
            Method dump skipped, instructions count: 369
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aqg.W0(int):by7");
    }

    public final boolean X0() throws IOException {
        byte[] bArr;
        int length;
        BufferedInputStream bufferedInputStream = this.U0;
        if (bufferedInputStream != null && (length = (bArr = this.V0).length) != 0) {
            int i = bufferedInputStream.read(bArr, 0, length);
            if (i > 0) {
                int i2 = this.X;
                this.Y += i2;
                this.s0 -= i2;
                this.o = 0;
                this.X = i;
                return true;
            }
            h0();
            if (i == 0) {
                throw new IOException(ho7.j(new StringBuilder("InputStream.read() returned 0 characters when trying to read "), this.V0.length, " bytes"));
            }
        }
        return false;
    }

    public final void Y0() throws JsonEOFException {
        if (X0()) {
            return;
        }
        r0(" in " + this.b);
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:119:0x01b6, code lost:
    
        if ((defpackage.aqg.X0 & r1) == 0) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x01b8, code lost:
    
        if (r2 == 93) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x01ba, code lost:
    
        if (r2 != 125) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x01bc, code lost:
    
        if (r2 != 125) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x01be, code lost:
    
        y1();
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x01c7, code lost:
    
        if (r24.v0.c() == false) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x01c9, code lost:
    
        r24.v0 = r24.v0.c;
        r1 = defpackage.by7.END_OBJECT;
        r24.b = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x01d3, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x01d4, code lost:
    
        t0(']', 125);
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x01d7, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x01d8, code lost:
    
        y1();
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x01e1, code lost:
    
        if (r24.v0.b() == false) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x01e3, code lost:
    
        r24.v0 = r24.v0.c;
        r1 = defpackage.by7.END_ARRAY;
        r24.b = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x01ed, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x01ee, code lost:
    
        t0('}', 93);
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x01f1, code lost:
    
        throw null;
     */
    /* JADX WARN: Removed duplicated region for block: B:388:0x0710  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x0716  */
    /* JADX WARN: Removed duplicated region for block: B:440:0x07b1  */
    /* JADX WARN: Removed duplicated region for block: B:442:0x07ba  */
    @Override // defpackage.px7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.by7 Z() throws com.fasterxml.jackson.core.JsonParseException {
        /*
            Method dump skipped, instructions count: 2106
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aqg.Z():by7");
    }

    public final void Z0() throws JsonParseException {
        int i;
        int i2 = this.o;
        if (i2 + 4 < this.X) {
            byte[] bArr = this.V0;
            int i3 = i2 + 1;
            if (bArr[i2] == 97) {
                int i4 = i2 + 2;
                if (bArr[i3] == 108) {
                    int i5 = i2 + 3;
                    if (bArr[i4] == 115) {
                        int i6 = i2 + 4;
                        if (bArr[i5] == 101 && ((i = bArr[i6] & 255) < 48 || i == 93 || i == 125)) {
                            this.o = i6;
                            return;
                        }
                    }
                }
            }
        }
        c1(1, "false");
    }

    public final void a1() throws JsonParseException {
        int i;
        int i2 = this.o;
        if (i2 + 3 < this.X) {
            byte[] bArr = this.V0;
            int i3 = i2 + 1;
            if (bArr[i2] == 117) {
                int i4 = i2 + 2;
                if (bArr[i3] == 108) {
                    int i5 = i2 + 3;
                    if (bArr[i4] == 108 && ((i = bArr[i5] & 255) < 48 || i == 93 || i == 125)) {
                        this.o = i5;
                        return;
                    }
                }
            }
        }
        c1(1, "null");
    }

    public final void b1(int i, String str) throws JsonParseException {
        int length = str.length();
        if (this.o + length >= this.X) {
            c1(i, str);
            return;
        }
        while (this.V0[this.o] == str.charAt(i)) {
            int i2 = this.o + 1;
            this.o = i2;
            i++;
            if (i >= length) {
                int i3 = this.V0[i2] & 255;
                if (i3 < 48 || i3 == 93 || i3 == 125 || !Character.isJavaIdentifierPart((char) N0(i3))) {
                    return;
                }
                o1(str.substring(0, i), x0());
                throw null;
            }
        }
        o1(str.substring(0, i), x0());
        throw null;
    }

    public final void c1(int i, String str) throws JsonParseException {
        int i2;
        int i3;
        int length = str.length();
        do {
            if ((this.o >= this.X && !X0()) || this.V0[this.o] != str.charAt(i)) {
                o1(str.substring(0, i), x0());
                throw null;
            }
            i2 = this.o + 1;
            this.o = i2;
            i++;
        } while (i < length);
        if ((i2 < this.X || X0()) && (i3 = this.V0[this.o] & 255) >= 48 && i3 != 93 && i3 != 125 && Character.isJavaIdentifierPart((char) N0(i3))) {
            o1(str.substring(0, i), x0());
            throw null;
        }
    }

    public final void d1() throws JsonParseException {
        int i;
        int i2 = this.o;
        if (i2 + 3 < this.X) {
            byte[] bArr = this.V0;
            int i3 = i2 + 1;
            if (bArr[i2] == 114) {
                int i4 = i2 + 2;
                if (bArr[i3] == 117) {
                    int i5 = i2 + 3;
                    if (bArr[i4] == 101 && ((i = bArr[i5] & 255) < 48 || i == 93 || i == 125)) {
                        this.o = i5;
                        return;
                    }
                }
            }
        }
        c1(1, "true");
    }

    public final by7 f1(char[] cArr, int i, int i2, boolean z, int i3) throws JsonParseException {
        boolean z2;
        t3g t3gVar = this.x0;
        if (i2 == 46) {
            if (i >= cArr.length) {
                cArr = t3gVar.o();
                i = 0;
            }
            cArr[i] = (char) i2;
            i++;
            int i4 = 0;
            while (true) {
                if (this.o >= this.X && !X0()) {
                    z2 = true;
                    break;
                }
                byte[] bArr = this.V0;
                int i5 = this.o;
                this.o = i5 + 1;
                i2 = bArr[i5] & 255;
                if (i2 < 48 || i2 > 57) {
                    break;
                }
                i4++;
                if (i >= cArr.length) {
                    cArr = t3gVar.o();
                    i = 0;
                }
                cArr[i] = (char) i2;
                i++;
            }
            z2 = false;
            if (i4 == 0) {
                K0(i2, "Decimal point not followed by a digit");
                throw null;
            }
        } else {
            z2 = false;
        }
        if (i2 == 101 || i2 == 69) {
            if (i >= cArr.length) {
                cArr = t3gVar.o();
                i = 0;
            }
            int i6 = i + 1;
            cArr[i] = (char) i2;
            if (this.o >= this.X) {
                Y0();
            }
            byte[] bArr2 = this.V0;
            int i7 = this.o;
            this.o = i7 + 1;
            int i8 = bArr2[i7] & 255;
            if (i8 == 45 || i8 == 43) {
                if (i6 >= cArr.length) {
                    cArr = t3gVar.o();
                    i6 = 0;
                }
                int i9 = i6 + 1;
                cArr[i6] = (char) i8;
                if (this.o >= this.X) {
                    Y0();
                }
                byte[] bArr3 = this.V0;
                int i10 = this.o;
                this.o = i10 + 1;
                i8 = bArr3[i10] & 255;
                i6 = i9;
            }
            i2 = i8;
            int i11 = 0;
            while (true) {
                if (i2 >= 48 && i2 <= 57) {
                    i11++;
                    if (i6 >= cArr.length) {
                        cArr = t3gVar.o();
                        i6 = 0;
                    }
                    int i12 = i6 + 1;
                    cArr[i6] = (char) i2;
                    if (this.o >= this.X && !X0()) {
                        z2 = true;
                        i6 = i12;
                        break;
                    }
                    byte[] bArr4 = this.V0;
                    int i13 = this.o;
                    this.o = i13 + 1;
                    i2 = bArr4[i13] & 255;
                    i6 = i12;
                } else {
                    break;
                }
            }
            if (i11 == 0) {
                K0(i2, "Exponent indicator not followed by a digit");
                throw null;
            }
            i = i6;
        }
        if (!z2) {
            this.o--;
            if (this.v0.d()) {
                A1(i2);
            }
        }
        t3gVar.Y = i;
        this.G0 = z;
        this.H0 = i3;
        this.A0 = 0;
        return by7.VALUE_NUMBER_FLOAT;
    }

    public final by7 g1() {
        return !wx7.ALLOW_LEADING_DECIMAL_POINT_FOR_NUMBERS.b.a(this.a) ? W0(46) : f1(this.x0.m(), 0, 46, false, 0);
    }

    @Override // defpackage.vmb
    public final void h0() throws IOException {
        if (this.U0 != null) {
            if (this.c.b || nx7.AUTO_CLOSE_SOURCE.a(this.a)) {
                this.U0.close();
            }
            this.U0 = null;
        }
    }

    public final by7 h1() throws JsonParseException {
        int i;
        int i2;
        t3g t3gVar = this.x0;
        char[] cArrM = t3gVar.m();
        cArrM[0] = '-';
        if (this.o >= this.X) {
            Y0();
        }
        byte[] bArr = this.V0;
        int i3 = this.o;
        this.o = i3 + 1;
        int iZ1 = bArr[i3] & 255;
        if (iZ1 <= 48) {
            if (iZ1 != 48) {
                return V0(iZ1, true);
            }
            iZ1 = z1();
        } else if (iZ1 > 57) {
            return V0(iZ1, true);
        }
        cArrM[1] = (char) iZ1;
        int i4 = 2;
        int iMin = Math.min(this.X, (this.o + cArrM.length) - 2);
        int i5 = 1;
        while (true) {
            i = this.o;
            if (i >= iMin) {
                return i1(cArrM, i4, true, i5);
            }
            byte[] bArr2 = this.V0;
            this.o = i + 1;
            i2 = bArr2[i] & 255;
            if (i2 < 48 || i2 > 57) {
                break;
            }
            i5++;
            cArrM[i4] = (char) i2;
            i4++;
        }
        if (i2 == 46 || i2 == 101 || i2 == 69) {
            return f1(cArrM, i4, i2, true, i5);
        }
        this.o = i;
        t3gVar.Y = i4;
        if (this.v0.d()) {
            A1(i2);
        }
        return M0(i5, true);
    }

    public final by7 i1(char[] cArr, int i, boolean z, int i2) throws JsonParseException {
        t3g t3gVar;
        int i3;
        int i4;
        char[] cArrO = cArr;
        int i5 = i;
        int i6 = i2;
        while (true) {
            int i7 = this.o;
            int i8 = this.X;
            t3gVar = this.x0;
            if (i7 >= i8 && !X0()) {
                t3gVar.Y = i5;
                return M0(i6, z);
            }
            byte[] bArr = this.V0;
            i3 = this.o;
            this.o = i3 + 1;
            i4 = bArr[i3] & 255;
            if (i4 > 57 || i4 < 48) {
                break;
            }
            if (i5 >= cArrO.length) {
                i5 = 0;
                cArrO = t3gVar.o();
            }
            cArrO[i5] = (char) i4;
            i6++;
            i5++;
        }
        if (i4 == 46 || i4 == 101 || i4 == 69) {
            return f1(cArrO, i5, i4, z, i6);
        }
        this.o = i3;
        t3gVar.Y = i5;
        if (this.v0.d()) {
            A1(this.V0[this.o] & 255);
        }
        return M0(i6, z);
    }

    public final by7 j1(int i) throws JsonParseException {
        int i2;
        int i3;
        t3g t3gVar = this.x0;
        char[] cArrM = t3gVar.m();
        if (i == 48) {
            i = z1();
        }
        cArrM[0] = (char) i;
        int i4 = 1;
        int iMin = Math.min(this.X, (this.o + cArrM.length) - 1);
        int i5 = 1;
        while (true) {
            i2 = this.o;
            if (i2 >= iMin) {
                return i1(cArrM, i4, false, i5);
            }
            byte[] bArr = this.V0;
            this.o = i2 + 1;
            i3 = bArr[i2] & 255;
            if (i3 < 48 || i3 > 57) {
                break;
            }
            i5++;
            cArrM[i4] = (char) i3;
            i4++;
        }
        if (i3 == 46 || i3 == 101 || i3 == 69) {
            return f1(cArrM, i4, i3, false, i5);
        }
        this.o = i2;
        t3gVar.Y = i4;
        if (this.v0.d()) {
            A1(i3);
        }
        return M0(i5, false);
    }

    public final void k1(int i) throws JsonParseException {
        if (i < 32) {
            v0(i);
            throw null;
        }
        l1(i);
        throw null;
    }

    @Override // defpackage.px7
    public final fx7 l() {
        return new fx7(this.Z, (this.o - this.s0) + 1, this.Y + this.o, -1L, j0());
    }

    public final void l1(int i) throws JsonParseException {
        q0("Invalid UTF-8 start byte 0x" + Integer.toHexString(i));
        throw null;
    }

    public final void m1(int i) throws JsonParseException {
        q0("Invalid UTF-8 middle byte 0x" + Integer.toHexString(i));
        throw null;
    }

    public final void n1(int i, int i2) throws JsonParseException {
        this.o = i2;
        m1(i);
        throw null;
    }

    public final void o1(String str, String str2) throws JsonParseException {
        StringBuilder sb = new StringBuilder(str);
        while (true) {
            if (this.o >= this.X && !X0()) {
                break;
            }
            byte[] bArr = this.V0;
            int i = this.o;
            this.o = i + 1;
            char cN0 = (char) N0(bArr[i]);
            if (!Character.isJavaIdentifierPart(cN0)) {
                break;
            }
            sb.append(cN0);
            if (sb.length() >= 256) {
                sb.append("...");
                break;
            }
        }
        throw new JsonParseException(this, "Unrecognized token '" + ((Object) sb) + "': was expecting " + str2);
    }

    @Override // defpackage.vmb
    public final void p0() {
        byte[] bArr;
        byte[] bArr2;
        super.p0();
        sx0 sx0Var = this.R0;
        sx0 sx0Var2 = sx0Var.a;
        if (sx0Var2 != null && !sx0Var.o) {
            rx0 rx0Var = new rx0(sx0Var);
            AtomicReference atomicReference = sx0Var2.b;
            rx0 rx0Var2 = (rx0) atomicReference.get();
            int i = rx0Var2.b;
            int i2 = rx0Var.b;
            if (i2 != i) {
                if (i2 > 6000) {
                    rx0Var = new rx0(64, 4, new int[512], new String[128], 448, 512);
                }
                while (!atomicReference.compareAndSet(rx0Var2, rx0Var) && atomicReference.get() == rx0Var2) {
                }
            }
            sx0Var.o = true;
        }
        if (!this.W0 || (bArr = this.V0) == null || bArr == (bArr2 = vmb.I0)) {
            return;
        }
        this.V0 = bArr2;
        this.c.g(bArr);
    }

    public final void p1() {
        if (this.o < this.X || X0()) {
            byte[] bArr = this.V0;
            int i = this.o;
            if (bArr[i] == 10) {
                this.o = i + 1;
            }
        }
        this.Z++;
        this.s0 = this.o;
    }

    public final int q1(boolean z) throws JsonParseException {
        while (true) {
            if (this.o >= this.X && !X0()) {
                r0(" within/between " + this.v0.e() + " entries");
                throw null;
            }
            byte[] bArr = this.V0;
            int i = this.o;
            int i2 = i + 1;
            this.o = i2;
            int i3 = bArr[i] & 255;
            if (i3 > 32) {
                if (i3 == 47) {
                    r1();
                } else if (i3 == 35 && (this.a & e1) != 0) {
                    s1();
                } else {
                    if (z) {
                        return i3;
                    }
                    if (i3 != 58) {
                        u0(i3, "was expecting a colon to separate field name and value");
                        throw null;
                    }
                    z = true;
                }
            } else if (i3 == 32) {
                continue;
            } else if (i3 == 10) {
                this.Z++;
                this.s0 = i2;
            } else if (i3 == 13) {
                p1();
            } else if (i3 != 9) {
                v0(i3);
                throw null;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x006f, code lost:
    
        r0(" in a comment");
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0072, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void r1() throws com.fasterxml.jackson.core.JsonParseException {
        /*
            r9 = this;
            int r0 = r9.a
            int r1 = defpackage.aqg.d1
            r0 = r0 & r1
            r1 = 0
            r2 = 47
            if (r0 == 0) goto La3
            int r0 = r9.o
            int r3 = r9.X
            java.lang.String r4 = " in a comment"
            if (r0 < r3) goto L1d
            boolean r0 = r9.X0()
            if (r0 == 0) goto L19
            goto L1d
        L19:
            r9.r0(r4)
            throw r1
        L1d:
            byte[] r0 = r9.V0
            int r3 = r9.o
            int r5 = r3 + 1
            r9.o = r5
            r0 = r0[r3]
            r0 = r0 & 255(0xff, float:3.57E-43)
            if (r0 != r2) goto L2f
            r9.s1()
            return
        L2f:
            r3 = 42
            if (r0 != r3) goto L9d
            int[] r5 = defpackage.hb2.g
        L35:
            int r0 = r9.o
            int r6 = r9.X
            if (r0 < r6) goto L41
            boolean r0 = r9.X0()
            if (r0 == 0) goto L6f
        L41:
            byte[] r0 = r9.V0
            int r6 = r9.o
            int r7 = r6 + 1
            r9.o = r7
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
            int r0 = r9.X
            if (r7 < r0) goto L73
            boolean r0 = r9.X0()
            if (r0 == 0) goto L6f
            goto L73
        L6f:
            r9.r0(r4)
            throw r1
        L73:
            byte[] r0 = r9.V0
            int r6 = r9.o
            r0 = r0[r6]
            if (r0 != r2) goto L35
            int r6 = r6 + 1
            r9.o = r6
            return
        L80:
            r9.k1(r0)
            throw r1
        L84:
            r9.p1()
            goto L35
        L88:
            int r0 = r9.Z
            int r0 = r0 + 1
            r9.Z = r0
            r9.s0 = r7
            goto L35
        L91:
            r9.v1()
            goto L35
        L95:
            r9.u1()
            goto L35
        L99:
            r9.t1()
            goto L35
        L9d:
            java.lang.String r2 = "was expecting either '*' or '/' for a comment"
            r9.u0(r0, r2)
            throw r1
        La3:
            java.lang.String r0 = "maybe a (non-standard) comment? (not recognized as one since Feature 'ALLOW_COMMENTS' not enabled for parser)"
            r9.u0(r2, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aqg.r1():void");
    }

    public final void s1() throws JsonParseException {
        int[] iArr = hb2.g;
        while (true) {
            if (this.o >= this.X && !X0()) {
                return;
            }
            byte[] bArr = this.V0;
            int i = this.o;
            int i2 = i + 1;
            this.o = i2;
            int i3 = bArr[i] & 255;
            int i4 = iArr[i3];
            if (i4 != 0) {
                if (i4 == 2) {
                    t1();
                } else if (i4 == 3) {
                    u1();
                } else if (i4 == 4) {
                    v1();
                } else if (i4 == 10) {
                    this.Z++;
                    this.s0 = i2;
                    return;
                } else if (i4 == 13) {
                    p1();
                    return;
                } else if (i4 != 42 && i4 < 0) {
                    k1(i3);
                    throw null;
                }
            }
        }
    }

    public final void t1() throws JsonParseException {
        if (this.o >= this.X) {
            Y0();
        }
        byte[] bArr = this.V0;
        int i = this.o;
        int i2 = i + 1;
        this.o = i2;
        byte b = bArr[i];
        if ((b & 192) == 128) {
            return;
        }
        n1(b & 255, i2);
        throw null;
    }

    public final void u1() throws JsonParseException {
        if (this.o >= this.X) {
            Y0();
        }
        byte[] bArr = this.V0;
        int i = this.o;
        int i2 = i + 1;
        this.o = i2;
        byte b = bArr[i];
        if ((b & 192) != 128) {
            n1(b & 255, i2);
            throw null;
        }
        if (i2 >= this.X) {
            Y0();
        }
        byte[] bArr2 = this.V0;
        int i3 = this.o;
        int i4 = i3 + 1;
        this.o = i4;
        byte b2 = bArr2[i3];
        if ((b2 & 192) == 128) {
            return;
        }
        n1(b2 & 255, i4);
        throw null;
    }

    public final void v1() throws JsonParseException {
        if (this.o >= this.X) {
            Y0();
        }
        byte[] bArr = this.V0;
        int i = this.o;
        int i2 = i + 1;
        this.o = i2;
        byte b = bArr[i];
        if ((b & 192) != 128) {
            n1(b & 255, i2);
            throw null;
        }
        if (i2 >= this.X) {
            Y0();
        }
        byte[] bArr2 = this.V0;
        int i3 = this.o;
        int i4 = i3 + 1;
        this.o = i4;
        byte b2 = bArr2[i3];
        if ((b2 & 192) != 128) {
            n1(b2 & 255, i4);
            throw null;
        }
        if (i4 >= this.X) {
            Y0();
        }
        byte[] bArr3 = this.V0;
        int i5 = this.o;
        int i6 = i5 + 1;
        this.o = i6;
        byte b3 = bArr3[i5];
        if ((b3 & 192) == 128) {
            return;
        }
        n1(b3 & 255, i6);
        throw null;
    }

    @Override // defpackage.px7
    public final String w() throws JsonParseException {
        by7 by7Var = this.b;
        by7 by7Var2 = by7.VALUE_STRING;
        t3g t3gVar = this.x0;
        if (by7Var != by7Var2) {
            if (by7Var == null) {
                return null;
            }
            int i = by7Var.d;
            return i != 5 ? (i == 6 || i == 7 || i == 8) ? t3gVar.l() : by7Var.a : this.v0.f;
        }
        if (!this.T0) {
            return t3gVar.l();
        }
        this.T0 = false;
        int i2 = this.o;
        if (i2 >= this.X) {
            Y0();
            i2 = this.o;
        }
        char[] cArrM = t3gVar.m();
        int iMin = Math.min(this.X, cArrM.length + i2);
        byte[] bArr = this.V0;
        int i3 = 0;
        while (true) {
            if (i2 >= iMin) {
                break;
            }
            int i4 = bArr[i2] & 255;
            if (f1[i4] == 0) {
                i2++;
                cArrM[i3] = (char) i4;
                i3++;
            } else if (i4 == 34) {
                this.o = i2 + 1;
                t3gVar.Y = i3;
                if (t3gVar.X > 0) {
                    return t3gVar.l();
                }
                String str = i3 == 0 ? "" : new String((char[]) t3gVar.t0, 0, i3);
                t3gVar.c = str;
                return str;
            }
        }
        this.o = i2;
        U0(cArrM, i3);
        return t3gVar.l();
    }

    public final int w1() throws JsonParseException {
        while (true) {
            if (this.o >= this.X && !X0()) {
                throw new JsonParseException(this, "Unexpected end-of-input within/between " + this.v0.e() + " entries");
            }
            byte[] bArr = this.V0;
            int i = this.o;
            int i2 = i + 1;
            this.o = i2;
            int i3 = bArr[i] & 255;
            if (i3 > 32) {
                if (i3 == 47) {
                    r1();
                } else {
                    if (i3 != 35 || (this.a & e1) == 0) {
                        return i3;
                    }
                    s1();
                }
            } else if (i3 == 32) {
                continue;
            } else if (i3 == 10) {
                this.Z++;
                this.s0 = i2;
            } else if (i3 == 13) {
                p1();
            } else if (i3 != 9) {
                v0(i3);
                throw null;
            }
        }
    }

    public final int x1() throws JsonParseException {
        while (true) {
            if (this.o >= this.X && !X0()) {
                k0();
                return -1;
            }
            byte[] bArr = this.V0;
            int i = this.o;
            int i2 = i + 1;
            this.o = i2;
            int i3 = bArr[i] & 255;
            if (i3 > 32) {
                if (i3 == 47) {
                    r1();
                } else {
                    if (i3 != 35 || (this.a & e1) == 0) {
                        return i3;
                    }
                    s1();
                }
            } else if (i3 == 32) {
                continue;
            } else if (i3 == 10) {
                this.Z++;
                this.s0 = i2;
            } else if (i3 == 13) {
                p1();
            } else if (i3 != 9) {
                v0(i3);
                throw null;
            }
        }
    }

    @Override // defpackage.px7
    public final char[] y() throws JsonParseException {
        by7 by7Var = this.b;
        if (by7Var == null) {
            return null;
        }
        int i = by7Var.d;
        if (i != 5) {
            if (i != 6) {
                if (i != 7 && i != 8) {
                    return by7Var.b;
                }
            } else if (this.T0) {
                this.T0 = false;
                T0();
            }
            return this.x0.r();
        }
        if (!this.z0) {
            String str = this.v0.f;
            int length = str.length();
            char[] cArr = this.y0;
            if (cArr == null) {
                b6 b6Var = this.c;
                if (((char[]) b6Var.h) != null) {
                    throw new IllegalStateException("Trying to call same allocXxx() method second time");
                }
                char[] cArrA = ((ev0) b6Var.d).a(3, length);
                b6Var.h = cArrA;
                this.y0 = cArrA;
            } else if (cArr.length < length) {
                this.y0 = new char[length];
            }
            str.getChars(0, length, this.y0, 0);
            this.z0 = true;
        }
        return this.y0;
    }

    public final void y1() {
        this.t0 = this.Z;
        this.u0 = this.o - this.s0;
    }

    public final int z1() throws JsonParseException {
        if (this.o < this.X || X0()) {
            byte[] bArr = this.V0;
            int i = this.o;
            int i2 = bArr[i] & 255;
            if (i2 >= 48 && i2 <= 57) {
                if ((this.a & Y0) == 0) {
                    q0("Invalid numeric value: Leading zeroes not allowed");
                    throw null;
                }
                this.o = i + 1;
                if (i2 == 48) {
                    do {
                        if (this.o >= this.X && !X0()) {
                            return i2;
                        }
                        byte[] bArr2 = this.V0;
                        int i3 = this.o;
                        i2 = bArr2[i3] & 255;
                        if (i2 >= 48 && i2 <= 57) {
                            this.o = i3 + 1;
                        }
                    } while (i2 == 48);
                }
                return i2;
            }
        }
        return 48;
    }
}
