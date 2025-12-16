package defpackage;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.io.JsonEOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.concurrent.atomic.AtomicReference;
import ru.ok.android.externcalls.analytics.events.SdkMetricStatEvent;

/* loaded from: classes.dex */
public final class fbd extends vmb {
    public static final int X0 = nx7.ALLOW_TRAILING_COMMA.b;
    public static final int Y0 = nx7.ALLOW_NUMERIC_LEADING_ZEROS.b;
    public static final int Z0 = nx7.ALLOW_NON_NUMERIC_NUMBERS.b;
    public static final int a1 = nx7.ALLOW_MISSING_VALUES.b;
    public static final int b1 = nx7.ALLOW_SINGLE_QUOTES.b;
    public static final int c1 = nx7.ALLOW_UNQUOTED_FIELD_NAMES.b;
    public static final int d1 = nx7.ALLOW_COMMENTS.b;
    public static final int e1 = nx7.ALLOW_YAML_COMMENTS.b;
    public static final int[] f1 = hb2.c;
    public Reader R0;
    public char[] S0;
    public final boolean T0;
    public final kb2 U0;
    public final int V0;
    public boolean W0;

    public fbd(b6 b6Var, int i, kb2 kb2Var, char[] cArr, int i2) {
        super(b6Var, i);
        this.R0 = null;
        this.S0 = cArr;
        this.o = 0;
        this.X = i2;
        this.U0 = kb2Var;
        this.V0 = kb2Var.c;
        this.T0 = true;
    }

    public final void N0(int i) throws JsonParseException {
        if (i == 93) {
            int i2 = this.o;
            this.t0 = this.Z;
            this.u0 = i2 - this.s0;
            if (!this.v0.b()) {
                t0('}', i);
                throw null;
            }
            this.v0 = this.v0.c;
            this.b = by7.END_ARRAY;
        }
        if (i == 125) {
            int i3 = this.o;
            this.t0 = this.Z;
            this.u0 = i3 - this.s0;
            if (!this.v0.c()) {
                t0(']', i);
                throw null;
            }
            this.v0 = this.v0.c;
            this.b = by7.END_OBJECT;
        }
    }

    public final char O0() throws JsonParseException {
        if (this.o >= this.X && !S0()) {
            by7 by7Var = by7.NOT_AVAILABLE;
            r0(" in character escape sequence");
            throw null;
        }
        char[] cArr = this.S0;
        int i = this.o;
        this.o = i + 1;
        char c = cArr[i];
        if (c == '\"' || c == '/' || c == '\\') {
            return c;
        }
        if (c == 'b') {
            return '\b';
        }
        if (c == 'f') {
            return '\f';
        }
        if (c == 'n') {
            return '\n';
        }
        if (c == 'r') {
            return '\r';
        }
        if (c == 't') {
            return '\t';
        }
        if (c != 'u') {
            l0(c);
            return c;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < 4; i3++) {
            if (this.o >= this.X && !S0()) {
                by7 by7Var2 = by7.NOT_AVAILABLE;
                r0(" in character escape sequence");
                throw null;
            }
            char[] cArr2 = this.S0;
            int i4 = this.o;
            this.o = i4 + 1;
            char c2 = cArr2[i4];
            int i5 = hb2.i[c2 & 255];
            if (i5 < 0) {
                u0(c2, "expected a hex-digit for character escape sequence");
                throw null;
            }
            i2 = (i2 << 4) | i5;
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
        } else if (this.W0) {
            this.W0 = false;
            P0();
        }
        return this.x0.t();
    }

    public final void P0() throws JsonParseException {
        int i = this.o;
        int i2 = this.X;
        int[] iArr = f1;
        t3g t3gVar = this.x0;
        if (i < i2) {
            int length = iArr.length;
            while (true) {
                char[] cArr = this.S0;
                char c = cArr[i];
                if (c >= length || iArr[c] == 0) {
                    i++;
                    if (i >= i2) {
                        break;
                    }
                } else if (c == '\"') {
                    int i3 = this.o;
                    t3gVar.s(cArr, i3, i - i3);
                    this.o = i + 1;
                    return;
                }
            }
        }
        char[] cArr2 = this.S0;
        int i4 = this.o;
        int i5 = i - i4;
        t3gVar.s0 = null;
        t3gVar.d = -1;
        t3gVar.o = 0;
        t3gVar.c = null;
        t3gVar.u0 = null;
        if (t3gVar.b) {
            t3gVar.c();
        } else if (((char[]) t3gVar.t0) == null) {
            t3gVar.t0 = t3gVar.a(i5);
        }
        t3gVar.X = 0;
        t3gVar.Y = 0;
        if (t3gVar.d >= 0) {
            t3gVar.u(i5);
        }
        t3gVar.c = null;
        t3gVar.u0 = null;
        char[] cArr3 = (char[]) t3gVar.t0;
        int length2 = cArr3.length;
        int i6 = t3gVar.Y;
        int i7 = length2 - i6;
        if (i7 >= i5) {
            System.arraycopy(cArr2, i4, cArr3, i6, i5);
            t3gVar.Y += i5;
        } else {
            if (i7 > 0) {
                System.arraycopy(cArr2, i4, cArr3, i6, i7);
                i4 += i7;
                i5 -= i7;
            }
            do {
                t3gVar.n();
                int iMin = Math.min(((char[]) t3gVar.t0).length, i5);
                System.arraycopy(cArr2, i4, (char[]) t3gVar.t0, 0, iMin);
                t3gVar.Y += iMin;
                i4 += iMin;
                i5 -= iMin;
            } while (i5 > 0);
        }
        this.o = i;
        char[] cArrP = t3gVar.p();
        int i8 = t3gVar.Y;
        int length3 = iArr.length;
        while (true) {
            if (this.o >= this.X && !S0()) {
                by7 by7Var = by7.NOT_AVAILABLE;
                r0(": was expecting closing quote for a string value");
                throw null;
            }
            char[] cArr4 = this.S0;
            int i9 = this.o;
            this.o = i9 + 1;
            char cO0 = cArr4[i9];
            if (cO0 < length3 && iArr[cO0] != 0) {
                if (cO0 == '\"') {
                    t3gVar.Y = i8;
                    return;
                } else if (cO0 == '\\') {
                    cO0 = O0();
                } else if (cO0 < ' ') {
                    w0(cO0, "string value");
                }
            }
            if (i8 >= cArrP.length) {
                cArrP = t3gVar.o();
                i8 = 0;
            }
            cArrP[i8] = cO0;
            i8++;
        }
    }

    @Override // defpackage.px7
    public final int Q() throws JsonParseException {
        by7 by7Var = this.b;
        if (by7Var != null) {
            int i = by7Var.d;
            if (i != 6) {
                if (i == 7 || i == 8) {
                }
            } else if (this.W0) {
                this.W0 = false;
                P0();
            }
            int i2 = this.x0.d;
            if (i2 >= 0) {
                return i2;
            }
        }
        return 0;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, char], vars: [r12v0 ??, r12v1 ??, r12v4 ??]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:107)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:83)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:57)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:45)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public final defpackage.by7 Q0(
    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, char], vars: [r12v0 ??, r12v1 ??, r12v4 ??]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:107)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:83)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:57)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:45)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r12v0 ??
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

    /* JADX WARN: Removed duplicated region for block: B:27:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.by7 R0(int r9) throws com.fasterxml.jackson.core.JsonParseException {
        /*
            Method dump skipped, instructions count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fbd.R0(int):by7");
    }

    public final boolean S0() throws IOException {
        Reader reader = this.R0;
        if (reader != null) {
            char[] cArr = this.S0;
            int i = reader.read(cArr, 0, cArr.length);
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
                throw new IOException("Reader returned 0 characters when trying to read " + this.X);
            }
        }
        return false;
    }

    public final void T0(int i, String str) throws JsonParseException {
        int i2;
        char c;
        int length = str.length();
        if (this.o + length < this.X) {
            while (this.S0[this.o] == str.charAt(i)) {
                int i3 = this.o + 1;
                this.o = i3;
                i++;
                if (i >= length) {
                    char c2 = this.S0[i3];
                    if (c2 < '0' || c2 == ']' || c2 == '}' || !Character.isJavaIdentifierPart(c2)) {
                        return;
                    }
                    X0(str.substring(0, i), x0());
                    throw null;
                }
            }
            X0(str.substring(0, i), x0());
            throw null;
        }
        int length2 = str.length();
        do {
            if ((this.o >= this.X && !S0()) || this.S0[this.o] != str.charAt(i)) {
                X0(str.substring(0, i), x0());
                throw null;
            }
            i2 = this.o + 1;
            this.o = i2;
            i++;
        } while (i < length2);
        if ((i2 < this.X || S0()) && (c = this.S0[this.o]) >= '0' && c != ']' && c != '}' && Character.isJavaIdentifierPart(c)) {
            X0(str.substring(0, i), x0());
            throw null;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, char], vars: [r10v0 ??, r10v1 ??, r10v13 ??, r10v9 ??, r10v5 ??, r10v4 ??, r10v3 ??, r10v8 ??, r10v7 ??]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:107)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:83)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:57)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:45)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public final defpackage.by7 U0(boolean r9, 
    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, char], vars: [r10v0 ??, r10v1 ??, r10v13 ??, r10v9 ??, r10v5 ??, r10v4 ??, r10v3 ??, r10v8 ??, r10v7 ??]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:107)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:83)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:57)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:45)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r10v0 ??
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

    public final String V0(int i, int i2, int i3) throws JsonParseException {
        char[] cArr = this.S0;
        int i4 = this.o - i;
        t3g t3gVar = this.x0;
        t3gVar.s(cArr, i, i4);
        char[] cArrP = t3gVar.p();
        int i5 = t3gVar.Y;
        while (true) {
            if (this.o >= this.X && !S0()) {
                by7 by7Var = by7.NOT_AVAILABLE;
                r0(" in field name");
                throw null;
            }
            char[] cArr2 = this.S0;
            int i6 = this.o;
            this.o = i6 + 1;
            char cO0 = cArr2[i6];
            if (cO0 <= '\\') {
                if (cO0 == '\\') {
                    cO0 = O0();
                } else if (cO0 <= i3) {
                    if (cO0 == i3) {
                        t3gVar.Y = i5;
                        char[] cArrR = t3gVar.r();
                        int i7 = t3gVar.d;
                        return this.U0.b(cArrR, i7 >= 0 ? i7 : 0, t3gVar.t(), i2);
                    }
                    if (cO0 < ' ') {
                        w0(cO0, SdkMetricStatEvent.NAME_KEY);
                    }
                }
            }
            i2 = (i2 * 33) + cO0;
            int i8 = i5 + 1;
            cArrP[i5] = cO0;
            if (i8 >= cArrP.length) {
                cArrP = t3gVar.o();
                i5 = 0;
            } else {
                i5 = i8;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004a A[EDGE_INSN: B:21:0x004a->B:47:0x0090 BREAK  A[LOOP:0: B:34:0x006c->B:143:?]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.by7 W0(int r17, boolean r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 459
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fbd.W0(int, boolean):by7");
    }

    public final void X0(String str, String str2) throws JsonParseException {
        StringBuilder sb = new StringBuilder(str);
        while (true) {
            if (this.o >= this.X && !S0()) {
                break;
            }
            char c = this.S0[this.o];
            if (!Character.isJavaIdentifierPart(c)) {
                break;
            }
            this.o++;
            sb.append(c);
            if (sb.length() >= 256) {
                sb.append("...");
                break;
            }
        }
        throw new JsonParseException(this, "Unrecognized token '" + ((Object) sb) + "': was expecting " + str2);
    }

    public final int Y0() throws JsonParseException {
        while (true) {
            if (this.o >= this.X && !S0()) {
                throw new JsonParseException(this, "Unexpected end-of-input within/between " + this.v0.e() + " entries");
            }
            char[] cArr = this.S0;
            int i = this.o;
            int i2 = i + 1;
            this.o = i2;
            char c = cArr[i];
            if (c > ' ') {
                if (c == '/') {
                    b1();
                } else {
                    if (c != '#' || (this.a & e1) == 0) {
                        return c;
                    }
                    c1();
                }
            } else if (c >= ' ') {
                continue;
            } else if (c == '\n') {
                this.Z++;
                this.s0 = i2;
            } else if (c == '\r') {
                Z0();
            } else if (c != '\t') {
                v0(c);
                throw null;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x0516  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x0548  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x0583  */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r17v3 */
    /* JADX WARN: Type inference failed for: r17v4 */
    /* JADX WARN: Type inference failed for: r17v5 */
    /* JADX WARN: Type inference failed for: r17v6 */
    @Override // defpackage.px7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.by7 Z() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1478
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fbd.Z():by7");
    }

    public final void Z0() {
        if (this.o < this.X || S0()) {
            char[] cArr = this.S0;
            int i = this.o;
            if (cArr[i] == '\n') {
                this.o = i + 1;
            }
        }
        this.Z++;
        this.s0 = this.o;
    }

    public final int a1(boolean z) throws JsonParseException {
        while (true) {
            if (this.o >= this.X && !S0()) {
                r0(" within/between " + this.v0.e() + " entries");
                throw null;
            }
            char[] cArr = this.S0;
            int i = this.o;
            int i2 = i + 1;
            this.o = i2;
            char c = cArr[i];
            if (c > ' ') {
                if (c == '/') {
                    b1();
                } else if (c == '#' && (this.a & e1) != 0) {
                    c1();
                } else {
                    if (z) {
                        return c;
                    }
                    if (c != ':') {
                        u0(c, "was expecting a colon to separate field name and value");
                        throw null;
                    }
                    z = true;
                }
            } else if (c >= ' ') {
                continue;
            } else if (c == '\n') {
                this.Z++;
                this.s0 = i2;
            } else if (c == '\r') {
                Z0();
            } else if (c != '\t') {
                v0(c);
                throw null;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0056, code lost:
    
        r0(" in a comment");
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0059, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b1() throws com.fasterxml.jackson.core.JsonParseException {
        /*
            r7 = this;
            int r0 = r7.a
            int r1 = defpackage.fbd.d1
            r0 = r0 & r1
            r1 = 0
            r2 = 47
            if (r0 == 0) goto L8f
            int r0 = r7.o
            int r3 = r7.X
            java.lang.String r4 = " in a comment"
            if (r0 < r3) goto L1d
            boolean r0 = r7.S0()
            if (r0 == 0) goto L19
            goto L1d
        L19:
            r7.r0(r4)
            throw r1
        L1d:
            char[] r0 = r7.S0
            int r3 = r7.o
            int r5 = r3 + 1
            r7.o = r5
            char r0 = r0[r3]
            if (r0 != r2) goto L2d
            r7.c1()
            return
        L2d:
            r3 = 42
            if (r0 != r3) goto L89
        L31:
            int r0 = r7.o
            int r5 = r7.X
            if (r0 < r5) goto L3d
            boolean r0 = r7.S0()
            if (r0 == 0) goto L56
        L3d:
            char[] r0 = r7.S0
            int r5 = r7.o
            int r6 = r5 + 1
            r7.o = r6
            char r0 = r0[r5]
            if (r0 > r3) goto L31
            if (r0 != r3) goto L67
            int r0 = r7.X
            if (r6 < r0) goto L5a
            boolean r0 = r7.S0()
            if (r0 == 0) goto L56
            goto L5a
        L56:
            r7.r0(r4)
            throw r1
        L5a:
            char[] r0 = r7.S0
            int r5 = r7.o
            char r0 = r0[r5]
            if (r0 != r2) goto L31
            int r5 = r5 + 1
            r7.o = r5
            return
        L67:
            r5 = 32
            if (r0 >= r5) goto L31
            r5 = 10
            if (r0 != r5) goto L78
            int r0 = r7.Z
            int r0 = r0 + 1
            r7.Z = r0
            r7.s0 = r6
            goto L31
        L78:
            r5 = 13
            if (r0 != r5) goto L80
            r7.Z0()
            goto L31
        L80:
            r5 = 9
            if (r0 != r5) goto L85
            goto L31
        L85:
            r7.v0(r0)
            throw r1
        L89:
            java.lang.String r2 = "was expecting either '*' or '/' for a comment"
            r7.u0(r0, r2)
            throw r1
        L8f:
            java.lang.String r0 = "maybe a (non-standard) comment? (not recognized as one since Feature 'ALLOW_COMMENTS' not enabled for parser)"
            r7.u0(r2, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fbd.b1():void");
    }

    public final void c1() throws JsonParseException {
        while (true) {
            if (this.o >= this.X && !S0()) {
                return;
            }
            char[] cArr = this.S0;
            int i = this.o;
            int i2 = i + 1;
            this.o = i2;
            char c = cArr[i];
            if (c < ' ') {
                if (c == '\n') {
                    this.Z++;
                    this.s0 = i2;
                    return;
                } else if (c == '\r') {
                    Z0();
                    return;
                } else if (c != '\t') {
                    v0(c);
                    throw null;
                }
            }
        }
    }

    public final int d1() throws JsonParseException {
        while (true) {
            if (this.o >= this.X && !S0()) {
                k0();
                return -1;
            }
            char[] cArr = this.S0;
            int i = this.o;
            int i2 = i + 1;
            this.o = i2;
            char c = cArr[i];
            if (c > ' ') {
                if (c == '/') {
                    b1();
                } else {
                    if (c != '#' || (this.a & e1) == 0) {
                        return c;
                    }
                    c1();
                }
            } else if (c == ' ') {
                continue;
            } else if (c == '\n') {
                this.Z++;
                this.s0 = i2;
            } else if (c == '\r') {
                Z0();
            } else if (c != '\t') {
                v0(c);
                throw null;
            }
        }
    }

    public final void e1(int i) throws JsonParseException {
        int i2 = this.o + 1;
        this.o = i2;
        if (i != 9) {
            if (i == 10) {
                this.Z++;
                this.s0 = i2;
            } else if (i == 13) {
                Z0();
            } else {
                if (i == 32) {
                    return;
                }
                u0(i, "Expected space separating root-level values");
                throw null;
            }
        }
    }

    public final char f1(String str) throws JsonEOFException {
        if (this.o >= this.X && !S0()) {
            r0(str);
            throw null;
        }
        char[] cArr = this.S0;
        int i = this.o;
        this.o = i + 1;
        return cArr[i];
    }

    @Override // defpackage.vmb
    public final void h0() throws IOException {
        if (this.R0 != null) {
            if (this.c.b || nx7.AUTO_CLOSE_SOURCE.a(this.a)) {
                this.R0.close();
            }
            this.R0 = null;
        }
    }

    @Override // defpackage.px7
    public final fx7 l() {
        return new fx7(this.Z, (this.o - this.s0) + 1, -1L, this.o + this.Y, j0());
    }

    @Override // defpackage.vmb
    public final void p0() {
        char[] cArr;
        kb2 kb2Var;
        super.p0();
        kb2 kb2Var2 = this.U0;
        if (!kb2Var2.l && (kb2Var = kb2Var2.a) != null && kb2Var2.e) {
            jb2 jb2Var = new jb2(kb2Var2);
            AtomicReference atomicReference = kb2Var.b;
            jb2 jb2Var2 = (jb2) atomicReference.get();
            int i = jb2Var2.a;
            int i2 = jb2Var.a;
            if (i2 != i) {
                if (i2 > 12000) {
                    jb2Var = new jb2(new String[64], new ib2[32]);
                }
                while (!atomicReference.compareAndSet(jb2Var2, jb2Var) && atomicReference.get() == jb2Var2) {
                }
            }
            kb2Var2.l = true;
        }
        if (!this.T0 || (cArr = this.S0) == null) {
            return;
        }
        this.S0 = null;
        b6 b6Var = this.c;
        char[] cArr2 = (char[]) b6Var.f;
        if (cArr != cArr2 && cArr.length < cArr2.length) {
            throw new IllegalArgumentException("Trying to release buffer smaller than original");
        }
        b6Var.f = null;
        ((ev0) b6Var.d).b.set(0, cArr);
    }

    @Override // defpackage.px7
    public final String w() throws JsonParseException {
        by7 by7Var = this.b;
        by7 by7Var2 = by7.VALUE_STRING;
        t3g t3gVar = this.x0;
        if (by7Var == by7Var2) {
            if (this.W0) {
                this.W0 = false;
                P0();
            }
            return t3gVar.l();
        }
        if (by7Var == null) {
            return null;
        }
        int i = by7Var.d;
        return i != 5 ? (i == 6 || i == 7 || i == 8) ? t3gVar.l() : by7Var.a : this.v0.f;
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
            } else if (this.W0) {
                this.W0 = false;
                P0();
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

    public fbd(b6 b6Var, int i, Reader reader, kb2 kb2Var) {
        super(b6Var, i);
        this.R0 = reader;
        if (((char[]) b6Var.f) == null) {
            char[] cArrA = ((ev0) b6Var.d).a(0, 0);
            b6Var.f = cArrA;
            this.S0 = cArrA;
            this.o = 0;
            this.X = 0;
            this.U0 = kb2Var;
            this.V0 = kb2Var.c;
            this.T0 = true;
            return;
        }
        throw new IllegalStateException("Trying to call same allocXxx() method second time");
    }
}
