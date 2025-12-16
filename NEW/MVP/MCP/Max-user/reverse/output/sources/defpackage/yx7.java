package defpackage;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.exc.InputCoercionException;
import java.io.BufferedInputStream;
import java.io.CharArrayWriter;
import java.io.IOException;
import java.util.HashMap;
import ru.ok.android.api.json.JsonStateException;
import ru.ok.android.api.json.JsonSyntaxException;
import ru.ok.android.api.json.JsonTypeMismatchException;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final class yx7 extends d2 {
    public static final xw7 b = new xw7();
    public final vmb a;

    public yx7(vmb vmbVar) throws JsonSyntaxException {
        this.a = vmbVar;
        try {
            vmbVar.Z();
        } catch (JsonParseException e) {
            throw new JsonSyntaxException(e);
        }
    }

    public static yx7 c(BufferedInputStream bufferedInputStream) throws IOException {
        try {
            vmb vmbVarB = b.b(bufferedInputStream);
            new HashMap();
            return new yx7(vmbVarB);
        } catch (JsonParseException e) {
            throw new JsonSyntaxException(e);
        }
    }

    public static yx7 d(String str) throws JsonSyntaxException {
        try {
            fbd fbdVarC = b.c(str);
            new HashMap();
            return new yx7(fbdVarC);
        } catch (JsonParseException e) {
            throw new JsonSyntaxException(e);
        }
    }

    public static String i(vmb vmbVar) throws IOException {
        CharArrayWriter charArrayWriter = new CharArrayWriter();
        xw7 xw7Var = b;
        boolean z = false;
        v6i v6iVar = new v6i(xw7Var.a(charArrayWriter, false), xw7Var.o, charArrayWriter, xw7Var.Y);
        afe afeVar = xw7Var.X;
        if (afeVar != xw7.u0) {
            v6iVar.Y = afeVar;
        }
        by7 by7Var = vmbVar.b;
        int i = by7Var == null ? -1 : by7Var.d;
        if (i == 5) {
            v6iVar.y(vmbVar.B0());
            by7 by7VarZ = vmbVar.Z();
            i = by7VarZ == null ? -1 : by7VarZ.d;
        }
        if (i == 1) {
            v6iVar.l0();
            v6iVar.c(vmbVar);
        } else if (i != 3) {
            by7 by7Var2 = vmbVar.b;
            switch (by7Var2 != null ? by7Var2.d : -1) {
                case -1:
                    zw7.d("No current event to copy");
                    throw null;
                case 0:
                default:
                    throw new IllegalStateException("Internal error: unknown current token, " + by7Var2);
                case 1:
                    v6iVar.l0();
                    break;
                case 2:
                    v6iVar.w();
                    break;
                case 3:
                    v6iVar.k0();
                    break;
                case 4:
                    v6iVar.l();
                    break;
                case 5:
                    v6iVar.y(vmbVar.B0());
                    break;
                case 6:
                    if (by7Var2 == by7.VALUE_STRING) {
                        z = true;
                    } else if (by7Var2 == by7.FIELD_NAME) {
                        z = vmbVar.z0;
                    }
                    if (!z) {
                        v6iVar.m0(vmbVar.w());
                        break;
                    } else {
                        v6iVar.n0(vmbVar.y(), vmbVar.Q(), vmbVar.P());
                        break;
                    }
                case 7:
                    int iG0 = vmbVar.G0();
                    if (iG0 != 1) {
                        if (iG0 != 3) {
                            v6iVar.h0(vmbVar.F0());
                            break;
                        } else {
                            v6iVar.j0(vmbVar.A0());
                            break;
                        }
                    } else {
                        v6iVar.Z(vmbVar.E0());
                        break;
                    }
                case 8:
                    int iG02 = vmbVar.G0();
                    if (iG02 != 6) {
                        if (iG02 != 4) {
                            v6iVar.P(vmbVar.D0());
                            break;
                        } else {
                            v6iVar.Q((float) vmbVar.D0());
                            break;
                        }
                    } else {
                        v6iVar.i0(vmbVar.C0());
                        break;
                    }
                case 9:
                    v6iVar.i(true);
                    break;
                case 10:
                    v6iVar.i(false);
                    break;
                case 11:
                    v6iVar.v0("write a null");
                    v6iVar.w0();
                    break;
                case Protos.Attaches.Attach.PRESENT /* 12 */:
                    v6iVar.v0("write a null");
                    v6iVar.w0();
                    break;
            }
        } else {
            v6iVar.k0();
            v6iVar.c(vmbVar);
        }
        v6iVar.close();
        return charArrayWriter.toString();
    }

    @Override // defpackage.xx7
    public final String B() throws IOException {
        vmb vmbVar = this.a;
        try {
            switch (vmbVar.z0()) {
                case -1:
                    throw new UnsupportedOperationException("Non-blocking parsing not supported");
                case 0:
                    throw JsonStateException.d(0);
                case 1:
                case 3:
                    String strI = i(vmbVar);
                    vmbVar.Z();
                    return strI;
                case 2:
                    throw JsonStateException.d(125);
                case 4:
                    throw JsonStateException.d(93);
                case 5:
                    throw JsonStateException.d(39);
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                    String strW = vmbVar.w();
                    vmbVar.Z();
                    return strW;
                case 11:
                    vmbVar.Z();
                    return "null";
                case Protos.Attaches.Attach.PRESENT /* 12 */:
                    throw new UnsupportedOperationException("Embedded objects not supported");
                default:
                    throw new AssertionError("Unknown JsonTokenId " + vmbVar.z0());
            }
        } catch (JsonParseException e) {
            throw new JsonSyntaxException(e);
        }
    }

    @Override // defpackage.xx7
    public final String R() throws IOException {
        vmb vmbVar = this.a;
        try {
            switch (vmbVar.z0()) {
                case -1:
                    throw new UnsupportedOperationException("Non-blocking parsing not supported");
                case 0:
                    return "";
                case 1:
                case 3:
                case 6:
                    String strI = i(vmbVar);
                    vmbVar.Z();
                    return strI;
                case 2:
                    throw JsonStateException.d(125);
                case 4:
                    throw JsonStateException.d(93);
                case 5:
                    throw JsonStateException.d(39);
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                    String strW = vmbVar.w();
                    vmbVar.Z();
                    return strW;
                case Protos.Attaches.Attach.PRESENT /* 12 */:
                    throw new UnsupportedOperationException("Embedded objects not supported");
                default:
                    throw new AssertionError("Unknown JsonTokenId " + vmbVar.z0());
            }
        } catch (JsonParseException e) {
            throw new JsonSyntaxException(e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008b  */
    @Override // defpackage.xx7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean W() throws ru.ok.android.api.json.JsonTypeMismatchException, ru.ok.android.api.json.JsonSyntaxException, com.fasterxml.jackson.core.exc.InputCoercionException {
        /*
            r7 = this;
            vmb r0 = r7.a
            java.lang.String r1 = "Unknown JsonTokenId "
            java.lang.String r2 = "Cannot parse boolean from string "
            int r3 = r0.z0()     // Catch: com.fasterxml.jackson.core.JsonParseException -> L27
            r4 = 98
            r5 = 1
            r6 = 0
            switch(r3) {
                case -1: goto Lc3;
                case 0: goto Lbe;
                case 1: goto Lb6;
                case 2: goto Laf;
                case 3: goto La7;
                case 4: goto La0;
                case 5: goto L99;
                case 6: goto L5a;
                case 7: goto L4c;
                case 8: goto L3e;
                case 9: goto L3a;
                case 10: goto L36;
                case 11: goto L32;
                case 12: goto L2a;
                default: goto L11;
            }     // Catch: com.fasterxml.jackson.core.JsonParseException -> L27
        L11:
            java.lang.AssertionError r2 = new java.lang.AssertionError     // Catch: com.fasterxml.jackson.core.JsonParseException -> L27
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: com.fasterxml.jackson.core.JsonParseException -> L27
            r3.<init>(r1)     // Catch: com.fasterxml.jackson.core.JsonParseException -> L27
            int r0 = r0.z0()     // Catch: com.fasterxml.jackson.core.JsonParseException -> L27
            r3.append(r0)     // Catch: com.fasterxml.jackson.core.JsonParseException -> L27
            java.lang.String r0 = r3.toString()     // Catch: com.fasterxml.jackson.core.JsonParseException -> L27
            r2.<init>(r0)     // Catch: com.fasterxml.jackson.core.JsonParseException -> L27
            throw r2     // Catch: com.fasterxml.jackson.core.JsonParseException -> L27
        L27:
            r0 = move-exception
            goto Lcb
        L2a:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException     // Catch: com.fasterxml.jackson.core.JsonParseException -> L27
            java.lang.String r1 = "Embedded objects not supported"
            r0.<init>(r1)     // Catch: com.fasterxml.jackson.core.JsonParseException -> L27
            throw r0     // Catch: com.fasterxml.jackson.core.JsonParseException -> L27
        L32:
            r0.Z()     // Catch: com.fasterxml.jackson.core.JsonParseException -> L27
            return r6
        L36:
            r0.Z()     // Catch: com.fasterxml.jackson.core.JsonParseException -> L27
            return r6
        L3a:
            r0.Z()     // Catch: com.fasterxml.jackson.core.JsonParseException -> L27
            return r5
        L3e:
            double r1 = r0.D0()     // Catch: com.fasterxml.jackson.core.JsonParseException -> L27
            r0.Z()     // Catch: com.fasterxml.jackson.core.JsonParseException -> L27
            r3 = 0
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto L8d
            goto L98
        L4c:
            long r1 = r0.F0()     // Catch: com.fasterxml.jackson.core.JsonParseException -> L27
            r0.Z()     // Catch: com.fasterxml.jackson.core.JsonParseException -> L27
            r3 = 0
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto L8d
            goto L98
        L5a:
            java.lang.String r1 = r0.w()     // Catch: com.fasterxml.jackson.core.JsonParseException -> L27
            r0.Z()     // Catch: com.fasterxml.jackson.core.JsonParseException -> L27
            java.lang.String r0 = r1.trim()     // Catch: com.fasterxml.jackson.core.JsonParseException -> L27
            int r3 = r0.hashCode()     // Catch: com.fasterxml.jackson.core.JsonParseException -> L27
            r4 = 3569038(0x36758e, float:5.001287E-39)
            if (r3 == r4) goto L7e
            r4 = 97196323(0x5cb1923, float:1.9099262E-35)
            if (r3 == r4) goto L74
            goto L88
        L74:
            java.lang.String r3 = "false"
            boolean r0 = r0.equals(r3)     // Catch: com.fasterxml.jackson.core.JsonParseException -> L27
            if (r0 == 0) goto L88
            r0 = r5
            goto L89
        L7e:
            java.lang.String r3 = "true"
            boolean r0 = r0.equals(r3)     // Catch: com.fasterxml.jackson.core.JsonParseException -> L27
            if (r0 == 0) goto L88
            r0 = r6
            goto L89
        L88:
            r0 = -1
        L89:
            if (r0 == 0) goto L98
            if (r0 != r5) goto L8e
        L8d:
            return r6
        L8e:
            ru.ok.android.api.json.JsonTypeMismatchException r0 = new ru.ok.android.api.json.JsonTypeMismatchException     // Catch: com.fasterxml.jackson.core.JsonParseException -> L27
            java.lang.String r1 = r2.concat(r1)     // Catch: com.fasterxml.jackson.core.JsonParseException -> L27
            r0.<init>(r1)     // Catch: com.fasterxml.jackson.core.JsonParseException -> L27
            throw r0     // Catch: com.fasterxml.jackson.core.JsonParseException -> L27
        L98:
            return r5
        L99:
            r0 = 39
            ru.ok.android.api.json.JsonStateException r0 = ru.ok.android.api.json.JsonStateException.d(r0)     // Catch: com.fasterxml.jackson.core.JsonParseException -> L27
            throw r0     // Catch: com.fasterxml.jackson.core.JsonParseException -> L27
        La0:
            r0 = 93
            ru.ok.android.api.json.JsonStateException r0 = ru.ok.android.api.json.JsonStateException.d(r0)     // Catch: com.fasterxml.jackson.core.JsonParseException -> L27
            throw r0     // Catch: com.fasterxml.jackson.core.JsonParseException -> L27
        La7:
            ru.ok.android.api.json.JsonTypeMismatchException r0 = new ru.ok.android.api.json.JsonTypeMismatchException     // Catch: com.fasterxml.jackson.core.JsonParseException -> L27
            r1 = 91
            r0.<init>(r4, r1)     // Catch: com.fasterxml.jackson.core.JsonParseException -> L27
            throw r0     // Catch: com.fasterxml.jackson.core.JsonParseException -> L27
        Laf:
            r0 = 125(0x7d, float:1.75E-43)
            ru.ok.android.api.json.JsonStateException r0 = ru.ok.android.api.json.JsonStateException.d(r0)     // Catch: com.fasterxml.jackson.core.JsonParseException -> L27
            throw r0     // Catch: com.fasterxml.jackson.core.JsonParseException -> L27
        Lb6:
            ru.ok.android.api.json.JsonTypeMismatchException r0 = new ru.ok.android.api.json.JsonTypeMismatchException     // Catch: com.fasterxml.jackson.core.JsonParseException -> L27
            r1 = 123(0x7b, float:1.72E-43)
            r0.<init>(r4, r1)     // Catch: com.fasterxml.jackson.core.JsonParseException -> L27
            throw r0     // Catch: com.fasterxml.jackson.core.JsonParseException -> L27
        Lbe:
            ru.ok.android.api.json.JsonStateException r0 = ru.ok.android.api.json.JsonStateException.d(r6)     // Catch: com.fasterxml.jackson.core.JsonParseException -> L27
            throw r0     // Catch: com.fasterxml.jackson.core.JsonParseException -> L27
        Lc3:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException     // Catch: com.fasterxml.jackson.core.JsonParseException -> L27
            java.lang.String r1 = "Non-blocking parsing not supported"
            r0.<init>(r1)     // Catch: com.fasterxml.jackson.core.JsonParseException -> L27
            throw r0     // Catch: com.fasterxml.jackson.core.JsonParseException -> L27
        Lcb:
            ru.ok.android.api.json.JsonSyntaxException r1 = new ru.ok.android.api.json.JsonSyntaxException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yx7.W():boolean");
    }

    @Override // defpackage.xx7
    public final String a0() throws IOException {
        vmb vmbVar = this.a;
        try {
            switch (vmbVar.z0()) {
                case -1:
                    throw new UnsupportedOperationException("Non-blocking parsing not supported");
                case 0:
                    throw JsonStateException.d(0);
                case 1:
                case 3:
                    String strI = i(vmbVar);
                    vmbVar.Z();
                    return strI;
                case 2:
                    throw JsonStateException.d(125);
                case 4:
                    throw JsonStateException.d(93);
                case 5:
                    throw JsonStateException.d(39);
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                    String strW = vmbVar.w();
                    vmbVar.Z();
                    return strW;
                case 11:
                    vmbVar.Z();
                    return null;
                case Protos.Attaches.Attach.PRESENT /* 12 */:
                    throw new UnsupportedOperationException("Embedded objects not supported");
                default:
                    throw new AssertionError("Unknown JsonTokenId " + vmbVar.z0());
            }
        } catch (JsonParseException e) {
            throw new JsonSyntaxException(e);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    @Override // defpackage.xx7
    public final boolean hasNext() {
        vmb vmbVar = this.a;
        switch (vmbVar.z0()) {
            case -1:
                throw new UnsupportedOperationException("Non-blocking parsing not supported");
            case 0:
            case 2:
            case 4:
                return false;
            case 1:
            case 3:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                return true;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                throw new UnsupportedOperationException("Embedded objects not supported");
            default:
                throw new AssertionError("Unknown JsonTokenId " + vmbVar.z0());
        }
    }

    @Override // defpackage.xx7
    public final void n() throws JsonSyntaxException {
        vmb vmbVar = this.a;
        try {
            switch (vmbVar.z0()) {
                case -1:
                    throw new UnsupportedOperationException("Non-blocking parsing not supported");
                case 0:
                    throw JsonStateException.b(0);
                case 1:
                    throw JsonStateException.b(123);
                case 2:
                    vmbVar.Z();
                    return;
                case 3:
                    throw JsonStateException.b(91);
                case 4:
                    throw JsonStateException.b(93);
                case 5:
                    throw JsonStateException.b(39);
                case 6:
                    throw JsonStateException.b(34);
                case 7:
                case 8:
                    throw JsonStateException.b(49);
                case 9:
                case 10:
                    throw JsonStateException.b(98);
                case 11:
                    throw JsonStateException.b(110);
                case Protos.Attaches.Attach.PRESENT /* 12 */:
                    throw new UnsupportedOperationException("Embedded objects not supported");
                default:
                    throw new AssertionError("Unknown JsonTokenId " + vmbVar.z0());
            }
        } catch (JsonParseException e) {
            throw new JsonSyntaxException(e);
        }
    }

    @Override // defpackage.xx7
    public final String name() throws JsonSyntaxException {
        vmb vmbVar = this.a;
        try {
            switch (vmbVar.z0()) {
                case -1:
                    throw new UnsupportedOperationException("Non-blocking parsing not supported");
                case 0:
                    throw JsonStateException.c(0);
                case 1:
                    throw JsonStateException.c(123);
                case 2:
                    throw JsonStateException.c(125);
                case 3:
                    throw JsonStateException.c(91);
                case 4:
                    throw JsonStateException.c(93);
                case 5:
                    String strB0 = vmbVar.B0();
                    vmbVar.Z();
                    return strB0;
                case 6:
                    throw JsonStateException.c(34);
                case 7:
                case 8:
                    throw JsonStateException.c(49);
                case 9:
                case 10:
                    throw JsonStateException.c(98);
                case 11:
                    throw JsonStateException.c(110);
                case Protos.Attaches.Attach.PRESENT /* 12 */:
                    throw new UnsupportedOperationException("Embedded objects not supported");
                default:
                    throw new AssertionError("Unknown JsonTokenId " + vmbVar.z0());
            }
        } catch (JsonParseException e) {
            throw new JsonSyntaxException(e);
        }
    }

    @Override // defpackage.xx7
    public final void p() throws JsonTypeMismatchException, JsonSyntaxException {
        vmb vmbVar = this.a;
        try {
            switch (vmbVar.z0()) {
                case -1:
                    throw new UnsupportedOperationException("Non-blocking parsing not supported");
                case 0:
                    throw JsonStateException.d(0);
                case 1:
                    vmbVar.Z();
                    return;
                case 2:
                    throw JsonStateException.d(125);
                case 3:
                    throw new JsonTypeMismatchException(123, 91);
                case 4:
                    throw JsonStateException.d(93);
                case 5:
                    throw JsonStateException.d(39);
                case 6:
                    throw new JsonTypeMismatchException(123, 34);
                case 7:
                case 8:
                    throw new JsonTypeMismatchException(123, 49);
                case 9:
                case 10:
                    throw new JsonTypeMismatchException(123, 98);
                case 11:
                    throw new JsonTypeMismatchException(123, 110);
                case Protos.Attaches.Attach.PRESENT /* 12 */:
                    throw new UnsupportedOperationException("Embedded objects not supported");
                default:
                    throw new AssertionError("Unknown JsonTokenId " + vmbVar.z0());
            }
        } catch (JsonParseException e) {
            throw new JsonSyntaxException(e);
        }
    }

    @Override // defpackage.xx7
    public final int peek() {
        vmb vmbVar = this.a;
        switch (vmbVar.z0()) {
            case -1:
                throw new UnsupportedOperationException("Non-blocking parsing not supported");
            case 0:
                return 0;
            case 1:
                return 123;
            case 2:
                return 125;
            case 3:
                return 91;
            case 4:
                return 93;
            case 5:
                return 39;
            case 6:
                return 34;
            case 7:
            case 8:
                return 49;
            case 9:
            case 10:
                return 98;
            case 11:
                return 110;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                throw new UnsupportedOperationException("Embedded objects not supported");
            default:
                throw new AssertionError("Unknown JsonTokenId " + vmbVar.z0());
        }
    }

    @Override // defpackage.xx7
    public final void q() throws JsonSyntaxException {
        vmb vmbVar = this.a;
        try {
            switch (vmbVar.z0()) {
                case -1:
                    throw new UnsupportedOperationException("Non-blocking parsing not supported");
                case 0:
                    throw JsonStateException.a(0);
                case 1:
                    throw JsonStateException.a(123);
                case 2:
                    throw JsonStateException.a(125);
                case 3:
                    throw JsonStateException.a(91);
                case 4:
                    vmbVar.Z();
                    return;
                case 5:
                    throw JsonStateException.a(39);
                case 6:
                    throw JsonStateException.a(34);
                case 7:
                case 8:
                    throw JsonStateException.a(49);
                case 9:
                case 10:
                    throw JsonStateException.a(98);
                case 11:
                    throw JsonStateException.a(110);
                case Protos.Attaches.Attach.PRESENT /* 12 */:
                    throw new UnsupportedOperationException("Embedded objects not supported");
                default:
                    throw new AssertionError("Unknown JsonTokenId " + vmbVar.z0());
            }
        } catch (JsonParseException e) {
            throw new JsonSyntaxException(e);
        }
    }

    @Override // defpackage.xx7
    public final void r() throws JsonTypeMismatchException, JsonSyntaxException {
        vmb vmbVar = this.a;
        try {
            switch (vmbVar.z0()) {
                case -1:
                    throw new UnsupportedOperationException("Non-blocking parsing not supported");
                case 0:
                    throw JsonStateException.d(0);
                case 1:
                    throw new JsonTypeMismatchException(91, 123);
                case 2:
                    throw JsonStateException.d(125);
                case 3:
                    vmbVar.Z();
                    return;
                case 4:
                    throw JsonStateException.d(93);
                case 5:
                    throw JsonStateException.d(39);
                case 6:
                    throw new JsonTypeMismatchException(91, 34);
                case 7:
                case 8:
                    throw new JsonTypeMismatchException(91, 49);
                case 9:
                case 10:
                    throw new JsonTypeMismatchException(91, 98);
                case 11:
                    throw new JsonTypeMismatchException(91, 110);
                case Protos.Attaches.Attach.PRESENT /* 12 */:
                    throw new UnsupportedOperationException("Embedded objects not supported");
                default:
                    throw new AssertionError("Unknown JsonTokenId " + vmbVar.z0());
            }
        } catch (JsonParseException e) {
            throw new JsonSyntaxException(e);
        }
    }

    @Override // defpackage.xx7
    public final long t() throws JsonTypeMismatchException, JsonSyntaxException, InputCoercionException {
        vmb vmbVar = this.a;
        try {
            switch (vmbVar.z0()) {
                case -1:
                    throw new UnsupportedOperationException("Non-blocking parsing not supported");
                case 0:
                    throw JsonStateException.d(0);
                case 1:
                    throw new JsonTypeMismatchException(49, 123);
                case 2:
                    throw JsonStateException.d(125);
                case 3:
                    throw new JsonTypeMismatchException(49, 91);
                case 4:
                    throw JsonStateException.d(93);
                case 5:
                    throw JsonStateException.d(39);
                case 6:
                    String strW = vmbVar.w();
                    vmbVar.Z();
                    try {
                        return n2c.w(strW.trim());
                    } catch (NumberFormatException unused) {
                        throw new JsonTypeMismatchException("Cannot parse long from string " + strW);
                    }
                case 7:
                    int iV = az1.v(vmbVar.G0());
                    long jF0 = (iV == 0 || iV == 1) ? vmbVar.F0() : vmbVar.H0().longValue();
                    vmbVar.Z();
                    return jF0;
                case 8:
                    double dD0 = vmbVar.D0();
                    vmbVar.Z();
                    return (long) dD0;
                case 9:
                    vmbVar.Z();
                    return 1L;
                case 10:
                    vmbVar.Z();
                    return 0L;
                case 11:
                    vmbVar.Z();
                    return 0L;
                case Protos.Attaches.Attach.PRESENT /* 12 */:
                    throw new UnsupportedOperationException("Embedded objects not supported");
                default:
                    throw new AssertionError("Unknown JsonTokenId " + vmbVar.z0());
            }
        } catch (JsonParseException e) {
            throw new JsonSyntaxException(e);
        }
        throw new JsonSyntaxException(e);
    }

    @Override // defpackage.xx7
    public final void v() throws JsonSyntaxException, JsonParseException {
        vmb vmbVar = this.a;
        try {
            switch (vmbVar.z0()) {
                case -1:
                    throw new UnsupportedOperationException("Non-blocking parsing not supported");
                case 0:
                    throw JsonStateException.d(0);
                case 1:
                case 3:
                    by7 by7Var = vmbVar.b;
                    if (by7Var == by7.START_OBJECT || by7Var == by7.START_ARRAY) {
                        int i = 1;
                        while (true) {
                            by7 by7VarZ = vmbVar.Z();
                            if (by7VarZ == null) {
                                vmbVar.k0();
                            } else if (by7VarZ.o) {
                                i++;
                            } else if (by7VarZ.X) {
                                i--;
                                if (i == 0) {
                                }
                            } else if (by7VarZ == by7.NOT_AVAILABLE) {
                                throw new JsonParseException(vmbVar, "Not enough content available for `skipChildren()`: non-blocking parser? (" + vmbVar.getClass().getName() + ")");
                            }
                        }
                    }
                    vmbVar.Z();
                    return;
                case 2:
                    throw JsonStateException.d(125);
                case 4:
                    throw JsonStateException.d(93);
                case 5:
                    throw JsonStateException.d(39);
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                    vmbVar.Z();
                    return;
                case Protos.Attaches.Attach.PRESENT /* 12 */:
                    throw new UnsupportedOperationException("Embedded objects not supported");
                default:
                    throw new AssertionError("Unknown JsonTokenId " + vmbVar.z0());
            }
        } catch (JsonParseException e) {
            throw new JsonSyntaxException(e);
        }
    }

    @Override // defpackage.xx7
    public final int x() {
        return (int) t();
    }
}
