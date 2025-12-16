package defpackage;

import java.io.IOException;
import java.io.StringReader;
import java.util.HashMap;
import org.apache.http.HttpStatus;
import ru.ok.android.api.json.JsonStateException;
import ru.ok.android.api.json.JsonSyntaxException;
import ru.ok.android.api.json.JsonTypeMismatchException;

/* loaded from: classes2.dex */
public final class n2c extends d2 {
    public final zf a;
    public final cx7 b;
    public int c;

    public n2c(String str) {
        StringReader stringReader = new StringReader(str);
        new HashMap();
        zf zfVar = new zf(1);
        this.a = zfVar;
        this.c = -1;
        this.b = new cx7(stringReader);
        zfVar.e(0);
    }

    public static long w(String str) {
        if (str.indexOf(46) >= 0 || str.indexOf(HttpStatus.SC_SWITCHING_PROTOCOLS) >= 0 || str.indexOf(69) >= 0) {
            return (long) Double.parseDouble(str);
        }
        int length = str.length();
        long j = 0;
        if (str.charAt(0) != '-') {
            if (length < 19) {
                return Long.parseLong(str);
            }
            if (length == 19 && str.compareTo("9223372036854775807") <= 0) {
                return Long.parseLong(str);
            }
            for (int i = 0; i < length; i++) {
                char cCharAt = str.charAt(i);
                if (cCharAt < '0' || cCharAt > '9') {
                    throw new NumberFormatException("Cannot parse long from ".concat(str));
                }
                j = (j * 10) + (cCharAt - '0');
            }
            return j;
        }
        if (length < 20) {
            return Long.parseLong(str);
        }
        if (length == 20 && str.compareTo("-9223372036854775808") <= 0) {
            return Long.parseLong(str);
        }
        for (int i2 = 1; i2 < length; i2++) {
            char cCharAt2 = str.charAt(i2);
            if (cCharAt2 < '0' || cCharAt2 > '9') {
                throw new NumberFormatException("Cannot parse long from ".concat(str));
            }
            j = (j * 10) + (cCharAt2 - '0');
        }
        return -j;
    }

    @Override // defpackage.xx7
    public final String B() throws IOException {
        int iPeek = peek();
        if (iPeek == 34) {
            l();
            return this.b.Z();
        }
        if (iPeek != 49) {
            if (iPeek != 91) {
                if (iPeek != 98 && iPeek != 110) {
                    if (iPeek != 123) {
                        throw JsonStateException.d(iPeek);
                    }
                }
            }
            return P();
        }
        return y();
    }

    public final String P() throws IOException {
        l();
        StringBuilder sb = new StringBuilder();
        soi.d(this.b, sb);
        return sb.toString();
    }

    public final JsonTypeMismatchException Q(int i) throws IOException {
        int iPeek = peek();
        if (iPeek == 34 || iPeek == 49 || iPeek == 91 || iPeek == 98 || iPeek == 110 || iPeek == 123) {
            return new JsonTypeMismatchException(i, iPeek);
        }
        throw JsonStateException.d(iPeek);
    }

    @Override // defpackage.xx7
    public final String R() throws IOException {
        int iPeek = peek();
        if (iPeek == 0) {
            return "";
        }
        if (iPeek != 34 && iPeek != 49) {
            if (iPeek != 91) {
                if (iPeek != 98 && iPeek != 110) {
                    if (iPeek != 123) {
                        throw JsonStateException.d(iPeek);
                    }
                }
            }
            return P();
        }
        return y();
    }

    @Override // defpackage.xx7
    public final boolean W() throws JsonTypeMismatchException, IOException {
        int iPeek = peek();
        if (iPeek == 34) {
            l();
            String strZ = this.b.Z();
            String strTrim = strZ.trim();
            strTrim.getClass();
            if (strTrim.equals("true")) {
                return true;
            }
            if (!strTrim.equals("false")) {
                throw new JsonTypeMismatchException("Cannot parse boolean from string ".concat(strZ));
            }
        } else {
            if (iPeek != 49) {
                if (iPeek != 91) {
                    if (iPeek == 98) {
                        return y().equals("true");
                    }
                    if (iPeek == 110) {
                        y();
                        return false;
                    }
                    if (iPeek != 123) {
                        throw JsonStateException.d(iPeek);
                    }
                }
                throw Q(98);
            }
            if (Double.parseDouble(y()) != 0.0d) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.xx7
    public final String a0() throws IOException {
        int iPeek = peek();
        if (iPeek == 34) {
            l();
            return this.b.Z();
        }
        if (iPeek != 49) {
            if (iPeek != 91) {
                if (iPeek != 98) {
                    if (iPeek == 110) {
                        y();
                        return null;
                    }
                    if (iPeek != 123) {
                        throw JsonStateException.d(iPeek);
                    }
                }
            }
            return P();
        }
        return y();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.b.close();
    }

    @Override // defpackage.xx7
    public final boolean hasNext() throws IOException {
        int iPeek = peek();
        if (iPeek == 0) {
            return false;
        }
        if (iPeek == 34 || iPeek == 39 || iPeek == 49 || iPeek == 91) {
            return true;
        }
        if (iPeek == 93) {
            return false;
        }
        if (iPeek == 98 || iPeek == 110 || iPeek == 123) {
            return true;
        }
        if (iPeek == 125) {
            return false;
        }
        throw new AssertionError();
    }

    public final void l() {
        zf zfVar = this.a;
        int iA = zfVar.a();
        if (iA == 0) {
            zfVar.d(1);
        } else if (iA != 1) {
            if (iA == 2) {
                zfVar.d(3);
            } else if (iA != 3) {
                if (iA != 5) {
                    throw new AssertionError();
                }
                zfVar.d(6);
            }
        }
        this.c = -1;
    }

    @Override // defpackage.xx7
    public final void n() throws IOException {
        int iPeek = peek();
        if (iPeek != 125) {
            throw JsonStateException.b(iPeek);
        }
        this.a.c();
        l();
        this.b.h0();
    }

    @Override // defpackage.xx7
    public final String name() throws IOException {
        int iPeek = peek();
        if (iPeek != 39) {
            throw JsonStateException.c(iPeek);
        }
        this.a.d(5);
        this.c = -1;
        return this.b.Z();
    }

    @Override // defpackage.xx7
    public final void p() throws JsonTypeMismatchException, IOException {
        int iPeek = peek();
        if (iPeek != 0) {
            if (iPeek != 34) {
                if (iPeek != 39) {
                    if (iPeek != 49 && iPeek != 91) {
                        if (iPeek != 93) {
                            if (iPeek != 98 && iPeek != 110) {
                                if (iPeek == 123) {
                                    this.a.e(4);
                                    this.c = -1;
                                    this.b.h0();
                                    return;
                                } else if (iPeek != 125) {
                                    return;
                                }
                            }
                        }
                    }
                }
            }
            throw Q(123);
        }
        throw JsonStateException.d(iPeek);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0077  */
    @Override // defpackage.xx7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int peek() throws java.io.IOException {
        /*
            r7 = this;
            int r0 = r7.c
            r1 = -1
            if (r0 == r1) goto L6
            return r0
        L6:
            zf r0 = r7.a
            int r0 = r0.a()
            cx7 r1 = r7.b
            int r2 = r1.j0()
            r3 = 44
            r4 = 93
            r5 = 34
            r6 = 125(0x7d, float:1.75E-43)
            switch(r0) {
                case 0: goto L4e;
                case 1: goto L4a;
                case 2: goto L47;
                case 3: goto L3d;
                case 4: goto L36;
                case 5: goto L2d;
                case 6: goto L1e;
                default: goto L1d;
            }
        L1d:
            goto L50
        L1e:
            if (r2 != r6) goto L23
        L20:
            r4 = r6
            goto L81
        L23:
            r1.w(r3)
            r1.h0()
            r1.w(r5)
            goto L50
        L2d:
            r2 = 58
            r1.w(r2)
            r1.h0()
            goto L50
        L36:
            if (r2 != r6) goto L39
            goto L20
        L39:
            r1.w(r5)
            goto L50
        L3d:
            if (r2 != r4) goto L40
            goto L81
        L40:
            r1.w(r3)
            r1.h0()
            goto L50
        L47:
            if (r2 != r4) goto L50
            goto L81
        L4a:
            if (r2 != 0) goto L50
            r4 = 0
            goto L81
        L4e:
            if (r2 == 0) goto L84
        L50:
            int r4 = r1.j0()
            if (r4 == r5) goto L77
            r0 = 49
            if (r4 == r0) goto L81
            r0 = 91
            if (r4 == r0) goto L81
            r0 = 98
            if (r4 == r0) goto L81
            r0 = 110(0x6e, float:1.54E-43)
            if (r4 == r0) goto L81
            r0 = 123(0x7b, float:1.72E-43)
            if (r4 != r0) goto L6b
            goto L81
        L6b:
            int r0 = r1.d
            long r2 = (long) r0
            java.lang.String r0 = r1.P()
            ru.ok.android.api.json.JsonSyntaxException r0 = ru.ok.android.api.json.JsonSyntaxException.b(r2, r0, r4)
            throw r0
        L77:
            r1 = 4
            if (r0 == r1) goto L7f
            r1 = 6
            if (r0 == r1) goto L7f
            r4 = r5
            goto L81
        L7f:
            r4 = 39
        L81:
            r7.c = r4
            return r4
        L84:
            int r0 = r1.d
            long r3 = (long) r0
            java.lang.String r0 = r1.P()
            ru.ok.android.api.json.JsonSyntaxException r0 = ru.ok.android.api.json.JsonSyntaxException.b(r3, r0, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n2c.peek():int");
    }

    @Override // defpackage.xx7
    public final void q() throws IOException {
        int iPeek = peek();
        if (iPeek != 93) {
            throw JsonStateException.a(iPeek);
        }
        this.a.c();
        l();
        this.b.h0();
    }

    @Override // defpackage.xx7
    public final void r() throws JsonTypeMismatchException, IOException {
        int iPeek = peek();
        if (iPeek != 0) {
            if (iPeek != 34) {
                if (iPeek != 39) {
                    if (iPeek != 49) {
                        if (iPeek == 91) {
                            this.a.e(2);
                            this.c = -1;
                            this.b.h0();
                            return;
                        } else if (iPeek != 93) {
                            if (iPeek != 98 && iPeek != 110 && iPeek != 123) {
                                if (iPeek != 125) {
                                    return;
                                }
                            }
                        }
                    }
                }
            }
            throw Q(91);
        }
        throw JsonStateException.d(iPeek);
    }

    @Override // defpackage.xx7
    public final long t() throws JsonTypeMismatchException, IOException {
        int iPeek = peek();
        if (iPeek == 34) {
            l();
            String strZ = this.b.Z();
            try {
                return w(strZ.trim());
            } catch (NumberFormatException unused) {
                throw new JsonTypeMismatchException(wy1.h("Cannot parse long from string ", strZ));
            }
        }
        if (iPeek == 49) {
            return w(y());
        }
        if (iPeek != 91) {
            if (iPeek == 98) {
                return y().equals("true") ? 1L : 0L;
            }
            if (iPeek == 110) {
                y();
                return 0L;
            }
            if (iPeek != 123) {
                throw JsonStateException.d(iPeek);
            }
        }
        throw Q(49);
    }

    @Override // defpackage.xx7
    public final void v() throws IOException {
        int iPeek = peek();
        if (iPeek != 34 && iPeek != 49 && iPeek != 91 && iPeek != 98 && iPeek != 110 && iPeek != 123) {
            throw JsonStateException.d(iPeek);
        }
        l();
        soi.c(this.b);
    }

    @Override // defpackage.xx7
    public final int x() throws JsonTypeMismatchException, IOException {
        int iPeek = peek();
        if (iPeek == 34) {
            l();
            String strZ = this.b.Z();
            try {
                return (int) w(strZ.trim());
            } catch (NumberFormatException unused) {
                throw new JsonTypeMismatchException(wy1.h("Cannot parse int from string ", strZ));
            }
        }
        if (iPeek == 49) {
            return (int) w(y());
        }
        if (iPeek != 91) {
            if (iPeek == 98) {
                return y().equals("true") ? 1 : 0;
            }
            if (iPeek == 110) {
                y();
                return 0;
            }
            if (iPeek != 123) {
                throw JsonStateException.d(iPeek);
            }
        }
        throw Q(49);
    }

    public final String y() throws IOException {
        l();
        cx7 cx7Var = this.b;
        int iI0 = cx7Var.i0();
        if (iI0 == -1) {
            throw new IllegalStateException("EOF");
        }
        if (iI0 == 34) {
            StringBuilder sb = new StringBuilder();
            cx7Var.d(sb);
            return sb.toString();
        }
        if (iI0 != 91 && iI0 != 93 && iI0 != 102 && iI0 != 110 && iI0 != 116 && iI0 != 123 && iI0 != 125 && iI0 != 44) {
            if (iI0 != 45) {
                switch (iI0) {
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
                        break;
                    case 58:
                        break;
                    default:
                        throw JsonSyntaxException.a(cx7Var.d, cx7Var.P(), cx7Var.b);
                }
            }
            StringBuilder sb2 = new StringBuilder();
            cx7Var.c(sb2);
            return sb2.toString();
        }
        return cx7Var.Q();
    }
}
