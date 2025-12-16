package kotlinx.serialization.json.internal;

import defpackage.af3;
import defpackage.api;
import defpackage.c0;
import defpackage.cmf;
import defpackage.ew7;
import defpackage.ggg;
import defpackage.jbe;
import defpackage.kc3;
import defpackage.koi;
import defpackage.lh4;
import defpackage.lk6;
import defpackage.lw7;
import defpackage.mfh;
import defpackage.p6i;
import defpackage.qw7;
import defpackage.ree;
import defpackage.rw;
import defpackage.sw7;
import defpackage.ue3;
import defpackage.uoi;
import defpackage.uw7;
import defpackage.vmf;
import defpackage.wsi;
import defpackage.yl3;
import defpackage.z95;
import defpackage.zy7;
import java.util.ArrayList;
import java.util.Arrays;
import kotlinx.serialization.SerializationException;

/* loaded from: classes.dex */
public final class a extends uoi implements lh4, yl3 {
    public final ew7 a;
    public final p6i b;
    public final ggg c;
    public final kc3 d;
    public int e = -1;
    public final lw7 f;
    public final uw7 g;

    public a(ew7 ew7Var, p6i p6iVar, ggg gggVar, ree reeVar) {
        this.a = ew7Var;
        this.b = p6iVar;
        this.c = gggVar;
        this.d = ew7Var.b;
        lw7 lw7Var = ew7Var.a;
        this.f = lw7Var;
        this.g = lw7Var.c ? null : new uw7(reeVar);
    }

    @Override // defpackage.uoi, defpackage.lh4
    public final short A() {
        ggg gggVar = this.c;
        long jZ = gggVar.z();
        short s = (short) jZ;
        if (jZ == s) {
            return s;
        }
        ggg.G(gggVar, "Failed to parse short for input '" + jZ + '\'', 0, null, 6);
        throw null;
    }

    @Override // defpackage.uoi, defpackage.lh4
    public final float B() throws NumberFormatException {
        ggg gggVar = this.c;
        String strB = gggVar.B();
        try {
            float f = Float.parseFloat(strB);
            if (!Float.isInfinite(f) && !Float.isNaN(f)) {
                return f;
            }
            ggg.G(gggVar, "Unexpected special floating-point value " + Float.valueOf(f) + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification", 0, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", 2);
            throw null;
        } catch (IllegalArgumentException unused) {
            ggg.G(gggVar, "Failed to parse type 'float' for input '" + strB + '\'', 0, null, 6);
            throw null;
        }
    }

    @Override // defpackage.uoi, defpackage.lh4
    public final double C() throws NumberFormatException {
        ggg gggVar = this.c;
        String strB = gggVar.B();
        try {
            double d = Double.parseDouble(strB);
            if (!Double.isInfinite(d) && !Double.isNaN(d)) {
                return d;
            }
            ggg.G(gggVar, "Unexpected special floating-point value " + Double.valueOf(d) + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification", 0, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", 2);
            throw null;
        } catch (IllegalArgumentException unused) {
            ggg.G(gggVar, "Failed to parse type 'double' for input '" + strB + '\'', 0, null, 6);
            throw null;
        }
    }

    public final sw7 G() {
        lw7 lw7Var = this.a.a;
        c0 c0Var = new c0();
        c0Var.c = this.c;
        c0Var.b = lw7Var.b;
        return c0Var.e();
    }

    @Override // defpackage.uoi, defpackage.lh4
    public final boolean b() {
        boolean z;
        boolean z2;
        ggg gggVar = this.c;
        int iD0 = gggVar.d0();
        String str = (String) gggVar.c;
        if (iD0 == str.length()) {
            ggg.G(gggVar, "EOF", 0, null, 6);
            throw null;
        }
        if (str.charAt(iD0) == '\"') {
            iD0++;
            z = true;
        } else {
            z = false;
        }
        int iZ = gggVar.Z(iD0);
        if (iZ >= str.length() || iZ == -1) {
            ggg.G(gggVar, "EOF", 0, null, 6);
            throw null;
        }
        int i = iZ + 1;
        int iCharAt = str.charAt(iZ) | ' ';
        if (iCharAt == 102) {
            gggVar.t(i, "alse");
            z2 = false;
        } else {
            if (iCharAt != 116) {
                ggg.G(gggVar, "Expected valid boolean literal prefix, but had '" + gggVar.B() + '\'', 0, null, 6);
                throw null;
            }
            gggVar.t(i, "rue");
            z2 = true;
        }
        if (!z) {
            return z2;
        }
        if (gggVar.b == str.length()) {
            ggg.G(gggVar, "EOF", 0, null, 6);
            throw null;
        }
        if (str.charAt(gggVar.b) == '\"') {
            gggVar.b++;
            return z2;
        }
        ggg.G(gggVar, "Expected closing quotation mark", 0, null, 6);
        throw null;
    }

    @Override // defpackage.uoi, defpackage.lh4
    public final char c() {
        ggg gggVar = this.c;
        String strB = gggVar.B();
        if (strB.length() == 1) {
            return strB.charAt(0);
        }
        ggg.G(gggVar, "Expected single char, but got '" + strB + '\'', 0, null, 6);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0110  */
    @Override // defpackage.uoi, defpackage.lh4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.zy7 r10) {
        /*
            Method dump skipped, instructions count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.serialization.json.internal.a.d(zy7):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.yl3
    public final int e(ree reeVar) {
        ggg gggVar = this.c;
        lk6 lk6Var = (lk6) gggVar.d;
        String str = (String) gggVar.c;
        p6i p6iVar = this.b;
        int iOrdinal = p6iVar.ordinal();
        char c = ':';
        int i = 0;
        zE0 = false;
        boolean zE0 = false;
        int i2 = -1;
        if (iOrdinal == 0) {
            boolean zE02 = gggVar.e0();
            while (true) {
                boolean zS = gggVar.s();
                uw7 uw7Var = this.g;
                if (zS) {
                    lw7 lw7Var = this.f;
                    boolean z = lw7Var.b;
                    String strC = z ? gggVar.C() : gggVar.u();
                    gggVar.x(c);
                    int iD = mfh.d(reeVar, this.a, strC);
                    if (iD != -3) {
                        if (uw7Var != null) {
                            z95 z95Var = uw7Var.a;
                            if (iD < 64) {
                                z95Var.a |= 1 << iD;
                            } else {
                                int i3 = (iD >>> 6) - 1;
                                long[] jArr = (long[]) z95Var.d;
                                jArr[i3] = jArr[i3] | (1 << (iD & 63));
                            }
                        }
                        i2 = iD;
                    } else {
                        if (!lw7Var.a) {
                            gggVar.F(vmf.H(strC, str.subSequence(0, gggVar.b).toString(), 6), "Encountered an unknown key '" + strC + '\'', "Use 'ignoreUnknownKeys = true' in 'Json {}' builder to ignore unknown keys.");
                            throw null;
                        }
                        ArrayList arrayList = new ArrayList();
                        byte bX = gggVar.X();
                        if (bX == 8 || bX == 6) {
                            while (true) {
                                byte bX2 = gggVar.X();
                                if (bX2 != 1) {
                                    if (bX2 == 8 || bX2 == 6) {
                                        arrayList.add(Byte.valueOf(bX2));
                                    } else if (bX2 == 9) {
                                        if (((Number) ue3.P(arrayList)).byteValue() != 8) {
                                            throw koi.b("found ] instead of } at path: " + lk6Var, str, gggVar.b);
                                        }
                                        af3.x(arrayList);
                                    } else if (bX2 == 7) {
                                        if (((Number) ue3.P(arrayList)).byteValue() != 6) {
                                            throw koi.b("found } instead of ] at path: " + lk6Var, str, gggVar.b);
                                        }
                                        af3.x(arrayList);
                                    } else if (bX2 == 10) {
                                        ggg.G(gggVar, "Unexpected end of input due to malformed JSON during ignoring unknown keys", 0, null, 6);
                                        throw null;
                                    }
                                    gggVar.v();
                                    if (arrayList.size() == 0) {
                                        break;
                                    }
                                } else if (z) {
                                    gggVar.B();
                                } else {
                                    gggVar.u();
                                }
                            }
                        } else {
                            gggVar.B();
                        }
                        zE02 = gggVar.e0();
                        c = ':';
                    }
                } else {
                    if (zE02) {
                        koi.e(gggVar);
                        throw null;
                    }
                    if (uw7Var != null) {
                        z95 z95Var2 = uw7Var.a;
                        rw rwVar = (rw) z95Var2.c;
                        ree reeVar2 = (ree) z95Var2.b;
                        int iF = reeVar2.f();
                        while (true) {
                            long j = z95Var2.a;
                            if (j != -1) {
                                int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(~j);
                                z95Var2.a |= 1 << iNumberOfTrailingZeros;
                                if (((Boolean) rwVar.invoke(reeVar2, Integer.valueOf(iNumberOfTrailingZeros))).booleanValue()) {
                                    i2 = iNumberOfTrailingZeros;
                                    break;
                                }
                            } else if (iF > 64) {
                                long[] jArr2 = (long[]) z95Var2.d;
                                int length = jArr2.length;
                                loop3: while (i < length) {
                                    int i4 = i + 1;
                                    int i5 = i4 * 64;
                                    long j2 = jArr2[i];
                                    while (j2 != -1) {
                                        int iNumberOfTrailingZeros2 = Long.numberOfTrailingZeros(~j2);
                                        j2 |= 1 << iNumberOfTrailingZeros2;
                                        int i6 = iNumberOfTrailingZeros2 + i5;
                                        if (((Boolean) rwVar.invoke(reeVar2, Integer.valueOf(i6))).booleanValue()) {
                                            jArr2[i] = j2;
                                            i2 = i6;
                                            break loop3;
                                        }
                                    }
                                    jArr2[i] = j2;
                                    i = i4;
                                }
                            }
                        }
                    } else {
                        i2 = -1;
                    }
                }
            }
        } else if (iOrdinal != 2) {
            boolean zE03 = gggVar.e0();
            if (gggVar.s()) {
                int i7 = this.e;
                if (i7 != -1 && !zE03) {
                    ggg.G(gggVar, "Expected end of the array or comma", 0, null, 6);
                    throw null;
                }
                i2 = i7 + 1;
                this.e = i2;
            } else if (zE03) {
                koi.d(gggVar, "array");
                throw null;
            }
        } else {
            int i8 = this.e;
            Object[] objArr = i8 % 2 != 0;
            if (objArr != true) {
                gggVar.x(':');
            } else if (i8 != -1) {
                zE0 = gggVar.e0();
            }
            if (gggVar.s()) {
                if (objArr != false) {
                    if (this.e == -1) {
                        int i9 = gggVar.b;
                        if (zE0) {
                            ggg.G(gggVar, "Unexpected leading comma", i9, null, 4);
                            throw null;
                        }
                    } else {
                        int i10 = gggVar.b;
                        if (!zE0) {
                            ggg.G(gggVar, "Expected comma after the key-value pair", i10, null, 4);
                            throw null;
                        }
                    }
                }
                i2 = this.e + 1;
                this.e = i2;
            } else if (zE0) {
                koi.e(gggVar);
                throw null;
            }
        }
        if (p6iVar != p6i.o) {
            ((int[]) lk6Var.d)[lk6Var.b] = i2;
        }
        return i2;
    }

    @Override // defpackage.uoi, defpackage.lh4
    public final int k() {
        ggg gggVar = this.c;
        long jZ = gggVar.z();
        int i = (int) jZ;
        if (jZ == i) {
            return i;
        }
        ggg.G(gggVar, "Failed to parse int for input '" + jZ + '\'', 0, null, 6);
        throw null;
    }

    @Override // defpackage.uoi, defpackage.yl3
    public final void m(ree reeVar) {
        if (this.a.a.a && reeVar.f() == 0) {
            while (e(reeVar) != -1) {
            }
        }
        ggg gggVar = this.c;
        if (gggVar.e0()) {
            koi.d(gggVar, "");
            throw null;
        }
        gggVar.x(this.b.b);
        lk6 lk6Var = (lk6) gggVar.d;
        int i = lk6Var.b;
        int[] iArr = (int[]) lk6Var.d;
        if (iArr[i] == -2) {
            iArr[i] = -1;
            lk6Var.b = i - 1;
        }
        int i2 = lk6Var.b;
        if (i2 != -1) {
            lk6Var.b = i2 - 1;
        }
    }

    @Override // defpackage.yl3
    public final kc3 n() {
        return this.d;
    }

    @Override // defpackage.uoi, defpackage.lh4
    public final lh4 o(ree reeVar) {
        return cmf.a(reeVar) ? new qw7(this.c, this.a) : this;
    }

    @Override // defpackage.uoi, defpackage.yl3
    public final Object p(ree reeVar, int i, zy7 zy7Var, Object obj) {
        lk6 lk6Var = (lk6) this.c.d;
        boolean z = this.b == p6i.o && (i & 1) == 0;
        if (z) {
            int[] iArr = (int[]) lk6Var.d;
            int i2 = lk6Var.b;
            if (iArr[i2] == -2) {
                ((Object[]) lk6Var.c)[i2] = jbe.w0;
            }
        }
        Object objD = d(zy7Var);
        if (z) {
            int[] iArr2 = (int[]) lk6Var.d;
            int i3 = lk6Var.b;
            if (iArr2[i3] != -2) {
                int i4 = i3 + 1;
                lk6Var.b = i4;
                Object[] objArr = (Object[]) lk6Var.c;
                if (i4 == objArr.length) {
                    int i5 = i4 * 2;
                    lk6Var.c = Arrays.copyOf(objArr, i5);
                    lk6Var.d = Arrays.copyOf((int[]) lk6Var.d, i5);
                }
            }
            Object[] objArr2 = (Object[]) lk6Var.c;
            int i6 = lk6Var.b;
            objArr2[i6] = objD;
            ((int[]) lk6Var.d)[i6] = -2;
        }
        return objD;
    }

    @Override // defpackage.uoi, defpackage.lh4
    public final String q() {
        boolean z = this.f.b;
        ggg gggVar = this.c;
        return z ? gggVar.C() : gggVar.A();
    }

    @Override // defpackage.uoi, defpackage.lh4
    public final yl3 r(ree reeVar) {
        ew7 ew7Var = this.a;
        p6i p6iVarH = wsi.h(ew7Var, reeVar);
        ggg gggVar = this.c;
        lk6 lk6Var = (lk6) gggVar.d;
        int i = lk6Var.b + 1;
        lk6Var.b = i;
        Object[] objArr = (Object[]) lk6Var.c;
        if (i == objArr.length) {
            int i2 = i * 2;
            lk6Var.c = Arrays.copyOf(objArr, i2);
            lk6Var.d = Arrays.copyOf((int[]) lk6Var.d, i2);
        }
        ((Object[]) lk6Var.c)[i] = reeVar;
        gggVar.x(p6iVarH.a);
        if (gggVar.X() != 4) {
            int iOrdinal = p6iVarH.ordinal();
            return (iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) ? new a(ew7Var, p6iVarH, gggVar, reeVar) : (this.b == p6iVarH && ew7Var.a.c) ? this : new a(ew7Var, p6iVarH, gggVar, reeVar);
        }
        ggg.G(gggVar, "Unexpected leading comma", 0, null, 6);
        throw null;
    }

    @Override // defpackage.uoi, defpackage.lh4
    public final int s(ree reeVar) {
        String strQ = q();
        String strConcat = " at path ".concat(((lk6) this.c.d).G());
        int iD = mfh.d(reeVar, this.a, strQ);
        if (iD != -3) {
            return iD;
        }
        throw new SerializationException(reeVar.a() + " does not contain element with name '" + strQ + '\'' + strConcat);
    }

    @Override // defpackage.uoi, defpackage.lh4
    public final long t() {
        return this.c.z();
    }

    @Override // defpackage.uoi, defpackage.lh4
    public final boolean v() {
        uw7 uw7Var = this.g;
        if (!(uw7Var != null ? uw7Var.b : false)) {
            ggg gggVar = this.c;
            int iZ = gggVar.Z(gggVar.d0());
            String str = (String) gggVar.c;
            int length = str.length() - iZ;
            boolean z = false;
            if (length >= 4 && iZ != -1) {
                int i = 0;
                while (true) {
                    if (i < 4) {
                        if ("null".charAt(i) != str.charAt(iZ + i)) {
                            break;
                        }
                        i++;
                    } else if (length <= 4 || api.a(str.charAt(iZ + 4)) != 0) {
                        z = true;
                        gggVar.b = iZ + 4;
                    }
                }
            }
            if (!z) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.uoi, defpackage.lh4
    public final byte z() {
        ggg gggVar = this.c;
        long jZ = gggVar.z();
        byte b = (byte) jZ;
        if (jZ == b) {
            return b;
        }
        ggg.G(gggVar, "Failed to parse byte for input '" + jZ + '\'', 0, null, 6);
        throw null;
    }
}
