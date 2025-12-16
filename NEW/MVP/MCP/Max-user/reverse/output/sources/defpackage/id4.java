package defpackage;

import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class id4 implements o29, gee, l93 {
    public static final Pattern H0 = Pattern.compile("CC([1-4])=(.+)");
    public static final Pattern I0 = Pattern.compile("([1-4])=lang:(\\w+)(,.+)?");
    public m29 A0;
    public kce D0;
    public zc4 E0;
    public int F0;
    public List G0;
    public final ywf X;
    public final long Y;
    public final ic8 Z;
    public final int a;
    public final a3b b;
    public final vgg c;
    public final j55 d;
    public final rha o;
    public final qi4 s0;
    public final mfg t0;
    public final gd4[] u0;
    public final lcj v0;
    public final j4c w0;
    public final qr4 y0;
    public final lk6 z0;
    public n93[] B0 = new n93[0];
    public pi5[] C0 = new pi5[0];
    public final IdentityHashMap x0 = new IdentityHashMap();

    public id4(int i, zc4 zc4Var, ywf ywfVar, int i2, a3b a3bVar, vgg vggVar, j55 j55Var, lk6 lk6Var, rha rhaVar, qr4 qr4Var, long j, ic8 ic8Var, qi4 qi4Var, lcj lcjVar, h08 h08Var, m4c m4cVar) throws NumberFormatException {
        String string;
        int i3;
        int i4;
        int[][] iArr;
        boolean[] zArr;
        gf6[] gf6VarArrG;
        ju4 ju4VarA;
        this.a = i;
        this.E0 = zc4Var;
        this.X = ywfVar;
        this.F0 = i2;
        this.b = a3bVar;
        this.c = vggVar;
        this.d = j55Var;
        this.z0 = lk6Var;
        this.o = rhaVar;
        this.y0 = qr4Var;
        this.Y = j;
        this.Z = ic8Var;
        this.s0 = qi4Var;
        this.v0 = lcjVar;
        this.w0 = new j4c(zc4Var, h08Var, qi4Var);
        int i5 = 0;
        n93[] n93VarArr = this.B0;
        lcjVar.getClass();
        this.D0 = new kce(12, n93VarArr);
        krb krbVarB = zc4Var.b(i2);
        List list = krbVarB.d;
        this.G0 = list;
        List list2 = krbVarB.c;
        int size = list2.size();
        SparseIntArray sparseIntArray = new SparseIntArray(size);
        ArrayList arrayList = new ArrayList(size);
        SparseArray sparseArray = new SparseArray(size);
        for (int i6 = 0; i6 < size; i6++) {
            sparseIntArray.put(((w8) list2.get(i6)).a, i6);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Integer.valueOf(i6));
            arrayList.add(arrayList2);
            sparseArray.put(i6, arrayList2);
        }
        for (int i7 = 0; i7 < size; i7++) {
            w8 w8Var = (w8) list2.get(i7);
            List list3 = w8Var.e;
            List list4 = w8Var.f;
            ju4 ju4VarA2 = a("http://dashif.org/guidelines/trickmode", list3);
            ju4VarA2 = ju4VarA2 == null ? a("http://dashif.org/guidelines/trickmode", list4) : ju4VarA2;
            int iMin = (ju4VarA2 == null || (iMin = sparseIntArray.get(Integer.parseInt(ju4VarA2.b), -1)) == -1) ? i7 : iMin;
            if (iMin == i7 && (ju4VarA = a("urn:mpeg:dash:adaptation-set-switching:2016", list4)) != null) {
                String str = ju4VarA.b;
                int i8 = xxg.a;
                for (String str2 : str.split(",", -1)) {
                    int i9 = sparseIntArray.get(Integer.parseInt(str2), -1);
                    if (i9 != -1) {
                        iMin = Math.min(iMin, i9);
                    }
                }
            }
            if (iMin != i7) {
                List list5 = (List) sparseArray.get(i7);
                List list6 = (List) sparseArray.get(iMin);
                list6.addAll(list5);
                sparseArray.put(i7, list6);
                arrayList.remove(list5);
            }
        }
        int size2 = arrayList.size();
        int[][] iArr2 = new int[size2][];
        for (int i10 = 0; i10 < size2; i10++) {
            int[] iArrI = jni.i((Collection) arrayList.get(i10));
            iArr2[i10] = iArrI;
            Arrays.sort(iArrI);
        }
        boolean[] zArr2 = new boolean[size2];
        gf6[][] gf6VarArr = new gf6[size2][];
        int i11 = 0;
        int i12 = 0;
        while (i11 < size2) {
            int[] iArr3 = iArr2[i11];
            int length = iArr3.length;
            int i13 = i5;
            while (true) {
                if (i13 >= length) {
                    break;
                }
                List list7 = ((w8) list2.get(iArr3[i13])).c;
                for (int i14 = i5; i14 < list7.size(); i14++) {
                    if (!((xmd) list7.get(i14)).d.isEmpty()) {
                        zArr2[i11] = true;
                        i12++;
                        break;
                    }
                }
                i13++;
                i5 = 0;
            }
            int[] iArr4 = iArr2[i11];
            int length2 = iArr4.length;
            int i15 = 0;
            while (true) {
                if (i15 >= length2) {
                    iArr = iArr2;
                    zArr = zArr2;
                    gf6VarArrG = new gf6[0];
                    break;
                }
                int i16 = iArr4[i15];
                w8 w8Var2 = (w8) list2.get(i16);
                List list8 = ((w8) list2.get(i16)).d;
                int[] iArr5 = iArr4;
                int i17 = 0;
                while (i17 < list8.size()) {
                    ju4 ju4Var = (ju4) list8.get(i17);
                    iArr = iArr2;
                    zArr = zArr2;
                    if ("urn:scte:dash:cc:cea-608:2015".equals(ju4Var.a)) {
                        ef6 ef6Var = new ef6();
                        ef6Var.k = "application/cea-608";
                        int i18 = w8Var2.a;
                        StringBuilder sb = new StringBuilder(18);
                        sb.append(i18);
                        sb.append(":cea608");
                        ef6Var.a = sb.toString();
                        gf6VarArrG = g(ju4Var, H0, new gf6(ef6Var));
                        break;
                    }
                    if ("urn:scte:dash:cc:cea-708:2015".equals(ju4Var.a)) {
                        ef6 ef6Var2 = new ef6();
                        ef6Var2.k = "application/cea-708";
                        int i19 = w8Var2.a;
                        StringBuilder sb2 = new StringBuilder(18);
                        sb2.append(i19);
                        sb2.append(":cea708");
                        ef6Var2.a = sb2.toString();
                        gf6VarArrG = g(ju4Var, I0, new gf6(ef6Var2));
                        break;
                    }
                    i17++;
                    zArr2 = zArr;
                    iArr2 = iArr;
                }
                i15++;
                iArr4 = iArr5;
            }
            gf6VarArr[i11] = gf6VarArrG;
            if (gf6VarArrG.length != 0) {
                i12++;
            }
            i11++;
            zArr2 = zArr;
            iArr2 = iArr;
            i5 = 0;
        }
        int[][] iArr6 = iArr2;
        boolean[] zArr3 = zArr2;
        int size3 = list.size() + i12 + size2;
        kfg[] kfgVarArr = new kfg[size3];
        gd4[] gd4VarArr = new gd4[size3];
        int i20 = 0;
        int i21 = 0;
        while (i20 < size2) {
            int[] iArr7 = iArr6[i20];
            ArrayList arrayList3 = new ArrayList();
            for (int i22 : iArr7) {
                arrayList3.addAll(((w8) list2.get(i22)).c);
            }
            int size4 = arrayList3.size();
            gf6[] gf6VarArr2 = new gf6[size4];
            int i23 = 0;
            while (i23 < size4) {
                int i24 = size2;
                gf6 gf6Var = ((xmd) arrayList3.get(i23)).a;
                gf6[][] gf6VarArr3 = gf6VarArr;
                int iB = j55Var.b(gf6Var);
                ef6 ef6VarA = gf6Var.a();
                ef6VarA.D = iB;
                gf6VarArr2[i23] = new gf6(ef6VarA);
                i23++;
                size2 = i24;
                gf6VarArr = gf6VarArr3;
            }
            int i25 = size2;
            gf6[][] gf6VarArr4 = gf6VarArr;
            w8 w8Var3 = (w8) list2.get(iArr7[0]);
            int i26 = w8Var3.a;
            if (i26 != -1) {
                string = Integer.toString(i26);
            } else {
                StringBuilder sb3 = new StringBuilder(17);
                sb3.append("unset:");
                sb3.append(i20);
                string = sb3.toString();
            }
            int i27 = i21 + 1;
            if (zArr3[i20]) {
                i3 = i21 + 2;
            } else {
                i3 = i27;
                i27 = -1;
            }
            if (gf6VarArr4[i20].length != 0) {
                i4 = i3 + 1;
            } else {
                i4 = i3;
                i3 = -1;
            }
            List list9 = list2;
            kfgVarArr[i21] = new kfg(string, gf6VarArr2);
            int i28 = i21;
            gd4VarArr[i28] = new gd4(w8Var3.b, 0, iArr7, i28, i27, i3, -1);
            int i29 = -1;
            if (i27 != -1) {
                String strConcat = String.valueOf(string).concat(":emsg");
                ef6 ef6Var3 = new ef6();
                ef6Var3.a = strConcat;
                ef6Var3.k = "application/x-emsg";
                kfgVarArr[i27] = new kfg(strConcat, new gf6(ef6Var3));
                gd4VarArr[i27] = new gd4(5, 1, iArr7, i28, -1, -1, -1);
                i29 = -1;
            }
            if (i3 != i29) {
                kfgVarArr[i3] = new kfg(String.valueOf(string).concat(":cc"), gf6VarArr4[i20]);
                gd4VarArr[i3] = new gd4(3, 1, iArr7, i28, -1, -1, -1);
            }
            i20++;
            size2 = i25;
            list2 = list9;
            i21 = i4;
            gf6VarArr = gf6VarArr4;
        }
        int i30 = 0;
        while (i30 < list.size()) {
            si5 si5Var = (si5) list.get(i30);
            ef6 ef6Var4 = new ef6();
            ef6Var4.a = si5Var.a();
            ef6Var4.k = "application/x-emsg";
            gf6 gf6Var2 = new gf6(ef6Var4);
            String strA = si5Var.a();
            StringBuilder sb4 = new StringBuilder(u45.f(12, strA));
            sb4.append(strA);
            sb4.append(":");
            sb4.append(i30);
            kfgVarArr[i21] = new kfg(sb4.toString(), gf6Var2);
            gd4VarArr[i21] = new gd4(5, 2, new int[0], -1, -1, -1, i30);
            i30++;
            i21++;
        }
        Pair pairCreate = Pair.create(new mfg(kfgVarArr), gd4VarArr);
        this.t0 = (mfg) pairCreate.first;
        this.u0 = (gd4[]) pairCreate.second;
    }

    public static ju4 a(String str, List list) {
        for (int i = 0; i < list.size(); i++) {
            ju4 ju4Var = (ju4) list.get(i);
            if (str.equals(ju4Var.a)) {
                return ju4Var;
            }
        }
        return null;
    }

    public static gf6[] g(ju4 ju4Var, Pattern pattern, gf6 gf6Var) throws NumberFormatException {
        String str = ju4Var.b;
        if (str == null) {
            return new gf6[]{gf6Var};
        }
        int i = xxg.a;
        String[] strArrSplit = str.split(";", -1);
        gf6[] gf6VarArr = new gf6[strArrSplit.length];
        for (int i2 = 0; i2 < strArrSplit.length; i2++) {
            Matcher matcher = pattern.matcher(strArrSplit[i2]);
            if (!matcher.matches()) {
                return new gf6[]{gf6Var};
            }
            int i3 = Integer.parseInt(matcher.group(1));
            ef6 ef6VarA = gf6Var.a();
            String str2 = gf6Var.a;
            StringBuilder sb = new StringBuilder(u45.f(12, str2));
            sb.append(str2);
            sb.append(":");
            sb.append(i3);
            ef6VarA.a = sb.toString();
            ef6VarA.C = i3;
            ef6VarA.c = matcher.group(2);
            gf6VarArr[i2] = new gf6(ef6VarA);
        }
        return gf6VarArr;
    }

    @Override // defpackage.o29
    public final void C(m29 m29Var, long j) {
        this.A0 = m29Var;
        m29Var.c(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0249  */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5, types: [int] */
    @Override // defpackage.o29
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long E(defpackage.an5[] r35, boolean[] r36, defpackage.ixd[] r37, boolean[] r38, long r39) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 673
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.id4.E(an5[], boolean[], ixd[], boolean[], long):long");
    }

    @Override // defpackage.gee
    public final void b(iee ieeVar) {
        this.A0.b(this);
    }

    @Override // defpackage.iee
    public final long d() {
        return this.D0.d();
    }

    public final int e(int i, int[] iArr) {
        int i2 = iArr[i];
        if (i2 != -1) {
            gd4[] gd4VarArr = this.u0;
            int i3 = gd4VarArr[i2].e;
            for (int i4 = 0; i4 < iArr.length; i4++) {
                int i5 = iArr[i4];
                if (i5 == i3 && gd4VarArr[i5].c == 0) {
                    return i4;
                }
            }
        }
        return -1;
    }

    @Override // defpackage.o29
    public final void f() {
        this.Z.b();
    }

    @Override // defpackage.o29
    public final long h(long j) throws Throwable {
        xj0 xj0Var;
        boolean zY;
        for (n93 n93Var : this.B0) {
            n93Var.D0 = j;
            if (n93Var.q()) {
                n93Var.C0 = j;
            } else {
                for (int i = 0; i < n93Var.u0.size(); i++) {
                    xj0Var = (xj0) n93Var.u0.get(i);
                    long j2 = xj0Var.Y;
                    if (j2 == j && xj0Var.u0 == -9223372036854775807L) {
                        break;
                    }
                    if (j2 > j) {
                        break;
                    }
                }
                xj0Var = null;
                if (xj0Var != null) {
                    gxd gxdVar = n93Var.w0;
                    int iD = xj0Var.d(0);
                    synchronized (gxdVar) {
                        synchronized (gxdVar) {
                            gxdVar.s = 0;
                            axd axdVar = gxdVar.a;
                            axdVar.g = (dt0) axdVar.f;
                        }
                    }
                    int i2 = gxdVar.q;
                    if (iD < i2 || iD > gxdVar.p + i2) {
                        zY = false;
                    } else {
                        gxdVar.t = Long.MIN_VALUE;
                        gxdVar.s = iD - i2;
                        zY = true;
                    }
                } else {
                    zY = n93Var.w0.y(j, j < n93Var.d());
                }
                if (zY) {
                    n93Var.E0 = n93Var.t(n93Var.w0.n(), 0);
                    gxd[] gxdVarArr = n93Var.x0;
                    for (gxd gxdVar2 : gxdVarArr) {
                        gxdVar2.y(j, true);
                    }
                } else {
                    n93Var.C0 = j;
                    n93Var.G0 = false;
                    n93Var.u0.clear();
                    n93Var.E0 = 0;
                    if (n93Var.s0.I()) {
                        n93Var.w0.h();
                        for (gxd gxdVar3 : n93Var.x0) {
                            gxdVar3.h();
                        }
                        n93Var.s0.x();
                    } else {
                        n93Var.s0.d = null;
                        n93Var.w0.x(false);
                        for (gxd gxdVar4 : n93Var.x0) {
                            gxdVar4.x(false);
                        }
                    }
                }
            }
        }
        for (pi5 pi5Var : this.C0) {
            int iB = xxg.b(pi5Var.c, j, true);
            pi5Var.Y = iB;
            pi5Var.Z = (pi5Var.d && iB == pi5Var.c.length) ? j : -9223372036854775807L;
        }
        return j;
    }

    @Override // defpackage.iee
    public final boolean j() {
        return this.D0.j();
    }

    @Override // defpackage.o29
    public final long k() {
        return -9223372036854775807L;
    }

    @Override // defpackage.o29
    public final mfg l() {
        return this.t0;
    }

    @Override // defpackage.iee
    public final long o() {
        return this.D0.o();
    }

    @Override // defpackage.iee
    public final void p(long j) {
        this.D0.p(j);
    }

    @Override // defpackage.o29
    public final long v(long j, j9e j9eVar) {
        long j2 = j;
        n93[] n93VarArr = this.B0;
        int length = n93VarArr.length;
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                break;
            }
            n93 n93Var = n93VarArr[i2];
            if (n93Var.a == 2) {
                wk4[] wk4VarArr = n93Var.o.h;
                int length2 = wk4VarArr.length;
                while (i < length2) {
                    wk4 wk4Var = wk4VarArr[i];
                    td4 td4Var = (td4) wk4Var.e;
                    td4 td4Var2 = (td4) wk4Var.e;
                    long j3 = wk4Var.g;
                    long j4 = wk4Var.f;
                    if (td4Var != null) {
                        long jU = td4Var.u(j2, j4) + j3;
                        long jI = wk4Var.i(jU);
                        long jD = td4Var2.D(j4);
                        return j9eVar.a(j2, jI, (jI >= j2 || (jD != -1 && jU >= ((td4Var2.C() + j3) + jD) - 1)) ? jI : wk4Var.i(jU + 1));
                    }
                    i++;
                    j2 = j;
                }
            } else {
                i2++;
                j2 = j;
            }
        }
        return j;
    }

    @Override // defpackage.o29
    public final void y(long j) {
        long j2;
        for (n93 n93Var : this.B0) {
            if (!n93Var.q()) {
                gxd gxdVar = n93Var.w0;
                int i = gxdVar.q;
                gxdVar.g(j, true);
                gxd gxdVar2 = n93Var.w0;
                int i2 = gxdVar2.q;
                if (i2 > i) {
                    synchronized (gxdVar2) {
                        j2 = gxdVar2.p == 0 ? Long.MIN_VALUE : gxdVar2.n[gxdVar2.r];
                    }
                    int i3 = 0;
                    while (true) {
                        gxd[] gxdVarArr = n93Var.x0;
                        if (i3 >= gxdVarArr.length) {
                            break;
                        }
                        gxdVarArr[i3].g(j2, n93Var.d[i3]);
                        i3++;
                    }
                }
                int iMin = Math.min(n93Var.t(i2, 0), n93Var.E0);
                if (iMin > 0) {
                    xxg.G(n93Var.u0, 0, iMin);
                    n93Var.E0 -= iMin;
                }
            }
        }
    }

    @Override // defpackage.iee
    public final boolean z(long j) {
        return this.D0.z(j);
    }
}
