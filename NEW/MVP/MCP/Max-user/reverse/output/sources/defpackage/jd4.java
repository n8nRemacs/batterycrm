package defpackage;

import android.util.Pair;
import android.util.SparseArray;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class jd4 implements p29, hee, m93 {
    public static final Pattern K0 = Pattern.compile("CC([1-4])=(.+)");
    public static final Pattern L0 = Pattern.compile("([1-4])=lang:(\\w+)(,.+)?");
    public final n4c A0;
    public n29 B0;
    public lm3 E0;
    public ad4 F0;
    public int G0;
    public List H0;
    public long J0;
    public final k5i X;
    public final long Y;
    public final jc8 Z;
    public final int a;
    public final tc4 b;
    public final wgg c;
    public final k55 d;
    public final tha o;
    public final ri4 s0;
    public final nfg t0;
    public final hd4[] u0;
    public final kc3 v0;
    public final j4c w0;
    public final lk6 y0;
    public final d55 z0;
    public boolean I0 = true;
    public o93[] C0 = new o93[0];
    public qi5[] D0 = new qi5[0];
    public final IdentityHashMap x0 = new IdentityHashMap();

    public jd4(int i, ad4 ad4Var, k5i k5iVar, int i2, tc4 tc4Var, wgg wggVar, k55 k55Var, d55 d55Var, tha thaVar, lk6 lk6Var, long j, jc8 jc8Var, ri4 ri4Var, kc3 kc3Var, a3b a3bVar, n4c n4cVar) throws NumberFormatException {
        int i3;
        int i4;
        int[][] iArr;
        boolean[] zArr;
        hf6[][] hf6VarArr;
        hf6[] hf6VarArrG;
        ku4 ku4VarB;
        Integer num;
        this.a = i;
        this.F0 = ad4Var;
        this.X = k5iVar;
        this.G0 = i2;
        this.b = tc4Var;
        this.c = wggVar;
        this.d = k55Var;
        this.z0 = d55Var;
        this.o = thaVar;
        this.y0 = lk6Var;
        this.Y = j;
        this.Z = jc8Var;
        this.s0 = ri4Var;
        this.v0 = kc3Var;
        this.A0 = n4cVar;
        boolean z = true;
        this.w0 = new j4c(ad4Var, a3bVar, ri4Var);
        int i5 = 0;
        kc3Var.getClass();
        t76 t76Var = wg7.b;
        zjd zjdVar = zjd.o;
        this.E0 = new lm3(zjdVar, zjdVar);
        lrb lrbVarB = ad4Var.b(i2);
        List list = lrbVarB.d;
        this.H0 = list;
        List list2 = lrbVarB.c;
        int size = list2.size();
        HashMap map = new HashMap(nsi.a(size));
        ArrayList arrayList = new ArrayList(size);
        SparseArray sparseArray = new SparseArray(size);
        for (int i6 = 0; i6 < size; i6++) {
            map.put(Long.valueOf(((x8) list2.get(i6)).a), Integer.valueOf(i6));
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Integer.valueOf(i6));
            arrayList.add(arrayList2);
            sparseArray.put(i6, arrayList2);
        }
        int i7 = 0;
        while (i7 < size) {
            x8 x8Var = (x8) list2.get(i7);
            List list3 = x8Var.e;
            List list4 = x8Var.f;
            boolean z2 = z;
            ku4 ku4VarB2 = b("http://dashif.org/guidelines/trickmode", list3);
            ku4VarB2 = ku4VarB2 == null ? b("http://dashif.org/guidelines/trickmode", list4) : ku4VarB2;
            int iIntValue = (ku4VarB2 == null || (num = (Integer) map.get(Long.valueOf(Long.parseLong(ku4VarB2.b)))) == null || !a(x8Var, (x8) list2.get(num.intValue()))) ? i7 : num.intValue();
            if (iIntValue == i7 && (ku4VarB = b("urn:mpeg:dash:adaptation-set-switching:2016", list4)) != null) {
                String str = ku4VarB.b;
                String str2 = zxg.a;
                String[] strArrSplit = str.split(",", -1);
                int length = strArrSplit.length;
                for (int i8 = i5; i8 < length; i8++) {
                    Integer num2 = (Integer) map.get(Long.valueOf(Long.parseLong(strArrSplit[i8])));
                    if (num2 != null && a(x8Var, (x8) list2.get(num2.intValue()))) {
                        iIntValue = Math.min(iIntValue, num2.intValue());
                    }
                }
            }
            if (iIntValue != i7) {
                List list5 = (List) sparseArray.get(i7);
                List list6 = (List) sparseArray.get(iIntValue);
                list6.addAll(list5);
                sparseArray.put(i7, list6);
                arrayList.remove(list5);
            }
            i7++;
            z = z2;
            i5 = 0;
        }
        boolean z3 = z;
        int size2 = arrayList.size();
        int[][] iArr2 = new int[size2][];
        for (int i9 = 0; i9 < size2; i9++) {
            int[] iArrI = jni.i((Collection) arrayList.get(i9));
            iArr2[i9] = iArrI;
            Arrays.sort(iArrI);
        }
        boolean[] zArr2 = new boolean[size2];
        hf6[][] hf6VarArr2 = new hf6[size2][];
        int i10 = 0;
        int i11 = 0;
        while (i10 < size2) {
            int[] iArr3 = iArr2[i10];
            int length2 = iArr3.length;
            int i12 = 0;
            while (true) {
                if (i12 >= length2) {
                    iArr = iArr2;
                    break;
                }
                List list7 = ((x8) list2.get(iArr3[i12])).c;
                iArr = iArr2;
                for (int i13 = 0; i13 < list7.size(); i13++) {
                    if (!((ymd) list7.get(i13)).d.isEmpty()) {
                        zArr2[i10] = z3;
                        i11++;
                        break;
                    }
                }
                i12++;
                iArr2 = iArr;
            }
            int[] iArr4 = iArr[i10];
            int length3 = iArr4.length;
            int i14 = 0;
            while (true) {
                if (i14 >= length3) {
                    zArr = zArr2;
                    hf6VarArr = hf6VarArr2;
                    hf6VarArrG = new hf6[0];
                    break;
                }
                int i15 = iArr4[i14];
                x8 x8Var2 = (x8) list2.get(i15);
                List list8 = ((x8) list2.get(i15)).d;
                int[] iArr5 = iArr4;
                int i16 = 0;
                while (i16 < list8.size()) {
                    ku4 ku4Var = (ku4) list8.get(i16);
                    zArr = zArr2;
                    hf6VarArr = hf6VarArr2;
                    if ("urn:scte:dash:cc:cea-608:2015".equals(ku4Var.a)) {
                        ff6 ff6Var = new ff6();
                        ff6Var.m = xz9.n("application/cea-608");
                        ff6Var.a = ho7.k(new StringBuilder(), x8Var2.a, ":cea608");
                        hf6VarArrG = g(ku4Var, K0, new hf6(ff6Var));
                        break;
                    }
                    if ("urn:scte:dash:cc:cea-708:2015".equals(ku4Var.a)) {
                        ff6 ff6Var2 = new ff6();
                        ff6Var2.m = xz9.n("application/cea-708");
                        ff6Var2.a = ho7.k(new StringBuilder(), x8Var2.a, ":cea708");
                        hf6VarArrG = g(ku4Var, L0, new hf6(ff6Var2));
                        break;
                    }
                    i16++;
                    hf6VarArr2 = hf6VarArr;
                    zArr2 = zArr;
                }
                i14++;
                iArr4 = iArr5;
            }
            hf6VarArr[i10] = hf6VarArrG;
            if (hf6VarArrG.length != 0) {
                i11++;
            }
            i10++;
            hf6VarArr2 = hf6VarArr;
            iArr2 = iArr;
            zArr2 = zArr;
        }
        int[][] iArr6 = iArr2;
        boolean[] zArr3 = zArr2;
        hf6[][] hf6VarArr3 = hf6VarArr2;
        int size3 = list.size() + i11 + size2;
        lfg[] lfgVarArr = new lfg[size3];
        hd4[] hd4VarArr = new hd4[size3];
        int i17 = 0;
        int i18 = 0;
        while (i17 < size2) {
            int[] iArr7 = iArr6[i17];
            ArrayList arrayList3 = new ArrayList();
            for (int i19 : iArr7) {
                arrayList3.addAll(((x8) list2.get(i19)).c);
            }
            int size4 = arrayList3.size();
            hf6[] hf6VarArr4 = new hf6[size4];
            int i20 = 0;
            while (i20 < size4) {
                int i21 = size2;
                hf6 hf6Var = ((ymd) arrayList3.get(i20)).a;
                int i22 = i18;
                ff6 ff6VarA = hf6Var.a();
                ff6VarA.N = k55Var.d(hf6Var);
                hf6VarArr4[i20] = new hf6(ff6VarA);
                i20++;
                size2 = i21;
                i18 = i22;
            }
            int i23 = size2;
            int i24 = i18;
            x8 x8Var3 = (x8) list2.get(iArr7[0]);
            long j2 = x8Var3.a;
            String string = j2 != -1 ? Long.toString(j2) : ho7.f(i17, "unset:");
            int i25 = i24 + 1;
            if (zArr3[i17]) {
                i3 = i24 + 2;
            } else {
                i3 = i25;
                i25 = -1;
            }
            if (hf6VarArr3[i17].length != 0) {
                i4 = i3 + 1;
            } else {
                i4 = i3;
                i3 = -1;
            }
            List list9 = list2;
            int i26 = 0;
            while (i26 < size4) {
                int i27 = i26;
                hf6VarArr4[i27] = tc4Var.k(hf6VarArr4[i27]);
                i26 = i27 + 1;
            }
            lfgVarArr[i24] = new lfg(string, hf6VarArr4);
            int i28 = x8Var3.b;
            t76 t76Var2 = wg7.b;
            zjd zjdVar2 = zjd.o;
            hd4 hd4Var = new hd4(i28, 0, iArr7, i24, i25, i3, -1, zjdVar2);
            int i29 = i24;
            hd4VarArr[i29] = hd4Var;
            int i30 = -1;
            if (i25 != -1) {
                String strI = az1.i(string, ":emsg");
                ff6 ff6Var3 = new ff6();
                ff6Var3.a = strI;
                ff6Var3.m = xz9.n("application/x-emsg");
                lfgVarArr[i25] = new lfg(strI, new hf6(ff6Var3));
                hd4 hd4Var2 = new hd4(5, 1, iArr7, i29, -1, -1, -1, zjdVar2);
                i29 = i29;
                hd4VarArr[i25] = hd4Var2;
                i30 = -1;
            }
            if (i3 != i30) {
                String strI2 = az1.i(string, ":cc");
                hd4VarArr[i3] = new hd4(3, 1, iArr7, i29, -1, -1, -1, wg7.k(hf6VarArr3[i17]));
                hf6[] hf6VarArr5 = hf6VarArr3[i17];
                for (int i31 = 0; i31 < hf6VarArr5.length; i31++) {
                    hf6VarArr5[i31] = tc4Var.k(hf6VarArr5[i31]);
                }
                lfgVarArr[i3] = new lfg(strI2, hf6VarArr3[i17]);
            }
            i17++;
            size2 = i23;
            i18 = i4;
            list2 = list9;
        }
        int i32 = 0;
        while (i32 < list.size()) {
            ti5 ti5Var = (ti5) list.get(i32);
            ff6 ff6Var4 = new ff6();
            ff6Var4.a = ti5Var.a();
            ff6Var4.m = xz9.n("application/x-emsg");
            lfgVarArr[i18] = new lfg(ti5Var.a() + ":" + i32, new hf6(ff6Var4));
            t76 t76Var3 = wg7.b;
            hd4VarArr[i18] = new hd4(5, 2, new int[0], -1, -1, -1, i32, zjd.o);
            i32++;
            i18++;
        }
        Pair pairCreate = Pair.create(new nfg(lfgVarArr), hd4VarArr);
        this.t0 = (nfg) pairCreate.first;
        this.u0 = (hd4[]) pairCreate.second;
    }

    public static boolean a(x8 x8Var, x8 x8Var2) {
        int i = x8Var.b;
        List list = x8Var.c;
        int i2 = x8Var2.b;
        List list2 = x8Var2.c;
        if (i == i2) {
            if (list.isEmpty() || list2.isEmpty()) {
                return true;
            }
            hf6 hf6Var = ((ymd) list.get(0)).a;
            hf6 hf6Var2 = ((ymd) list2.get(0)).a;
            int i3 = hf6Var.f & (-16385);
            int i4 = hf6Var2.f & (-16385);
            if (Objects.equals(hf6Var.d, hf6Var2.d) && i3 == i4) {
                return true;
            }
        }
        return false;
    }

    public static ku4 b(String str, List list) {
        for (int i = 0; i < list.size(); i++) {
            ku4 ku4Var = (ku4) list.get(i);
            if (str.equals(ku4Var.a)) {
                return ku4Var;
            }
        }
        return null;
    }

    public static hf6[] g(ku4 ku4Var, Pattern pattern, hf6 hf6Var) throws NumberFormatException {
        String str = ku4Var.b;
        if (str == null) {
            return new hf6[]{hf6Var};
        }
        String str2 = zxg.a;
        String[] strArrSplit = str.split(";", -1);
        hf6[] hf6VarArr = new hf6[strArrSplit.length];
        for (int i = 0; i < strArrSplit.length; i++) {
            Matcher matcher = pattern.matcher(strArrSplit[i]);
            if (!matcher.matches()) {
                return new hf6[]{hf6Var};
            }
            int i2 = Integer.parseInt(matcher.group(1));
            ff6 ff6VarA = hf6Var.a();
            ff6VarA.a = hf6Var.a + ":" + i2;
            ff6VarA.J = i2;
            ff6VarA.d = matcher.group(2);
            hf6VarArr[i] = new hf6(ff6VarA);
        }
        return hf6VarArr;
    }

    @Override // defpackage.p29
    public final long c(long j, k9e k9eVar) {
        for (o93 o93Var : this.C0) {
            if (o93Var.a == 2) {
                return o93Var.o.c(j, k9eVar);
            }
        }
        return j;
    }

    @Override // defpackage.jee
    public final long d() {
        return this.E0.d();
    }

    public final int e(int i, int[] iArr) {
        int i2 = iArr[i];
        if (i2 != -1) {
            hd4[] hd4VarArr = this.u0;
            int i3 = hd4VarArr[i2].e;
            for (int i4 = 0; i4 < iArr.length; i4++) {
                int i5 = iArr[i4];
                if (i5 == i3 && hd4VarArr[i5].c == 0) {
                    return i4;
                }
            }
        }
        return -1;
    }

    @Override // defpackage.p29
    public final void f() {
        this.Z.b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [int] */
    /* JADX WARN: Type inference failed for: r15v3, types: [int] */
    /* JADX WARN: Type inference failed for: r5v2, types: [int] */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v25 */
    @Override // defpackage.p29
    public final long h(long j) {
        int i;
        yj0 yj0Var;
        boolean zC;
        boolean z;
        o93[] o93VarArr = this.C0;
        int length = o93VarArr.length;
        boolean z2 = false;
        int i2 = 0;
        while (i2 < length) {
            o93 o93Var = o93VarArr[i2];
            hxd[] hxdVarArr = o93Var.x0;
            hxd hxdVar = o93Var.w0;
            te8 te8Var = o93Var.s0;
            ?? r14 = o93Var.u0;
            o93Var.D0 = j;
            o93Var.G0 = z2;
            if (o93Var.w()) {
                o93Var.C0 = j;
                z = z2;
                i = i2;
            } else {
                ?? r15 = z2;
                while (true) {
                    if (r15 >= r14.size()) {
                        i = i2;
                        break;
                    }
                    yj0Var = (yj0) r14.get(r15);
                    long j2 = yj0Var.Y;
                    i = i2;
                    if (j2 == j && yj0Var.u0 == -9223372036854775807L) {
                        break;
                    }
                    if (j2 > j) {
                        break;
                    }
                    r15++;
                    i2 = i;
                }
                yj0Var = null;
                if (yj0Var != null) {
                    zC = hxdVar.B(yj0Var.d(0));
                } else {
                    long jD = o93Var.d();
                    zC = hxdVar.C(j, jD == Long.MIN_VALUE || j < jD);
                }
                if (zC) {
                    o93Var.E0 = o93Var.z(hxdVar.q(), 0);
                    for (hxd hxdVar2 : hxdVarArr) {
                        hxdVar2.C(j, true);
                    }
                } else {
                    o93Var.C0 = j;
                    o93Var.I0 = false;
                    r14.clear();
                    o93Var.E0 = 0;
                    if (te8Var.A()) {
                        hxdVar.h();
                        for (hxd hxdVar3 : hxdVarArr) {
                            hxdVar3.h();
                        }
                        te8Var.c();
                    } else {
                        te8Var.c = null;
                        z = false;
                        hxdVar.A(false);
                        for (hxd hxdVar4 : o93Var.x0) {
                            hxdVar4.A(false);
                        }
                    }
                }
                z = false;
            }
            i2 = i + 1;
            z2 = z;
        }
        qi5[] qi5VarArr = this.D0;
        int length2 = qi5VarArr.length;
        for (?? r5 = z2; r5 < length2; r5++) {
            qi5 qi5Var = qi5VarArr[r5];
            int iA = zxg.a(qi5Var.c, j, true);
            qi5Var.Y = iA;
            qi5Var.Z = (qi5Var.d && iA == qi5Var.c.length) ? j : -9223372036854775807L;
        }
        return j;
    }

    @Override // defpackage.jee
    public final boolean j() {
        return this.E0.j();
    }

    @Override // defpackage.p29
    public final long k() {
        o93[] o93VarArr = this.C0;
        int length = o93VarArr.length;
        for (int i = 0; i < length; i++) {
            o93 o93Var = o93VarArr[i];
            o93Var.getClass();
            try {
                if (o93Var.H0) {
                    return this.J0;
                }
            } finally {
                o93Var.H0 = false;
            }
        }
        return -9223372036854775807L;
    }

    @Override // defpackage.p29
    public final nfg l() {
        return this.t0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r27v0 */
    /* JADX WARN: Type inference failed for: r27v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r27v2 */
    /* JADX WARN: Type inference failed for: r32v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v16, types: [tc4] */
    /* JADX WARN: Type inference failed for: r9v10, types: [wg7] */
    @Override // defpackage.p29
    public final long m(bn5[] bn5VarArr, boolean[] zArr, jxd[] jxdVarArr, boolean[] zArr2, long j) {
        int i;
        boolean z;
        int[] iArr;
        int[] iArr2;
        int i2;
        int i3;
        int i4;
        lfg lfgVarA;
        zjd zjdVar;
        int i5;
        i4c i4cVar;
        boolean z2;
        int[] iArr3 = new int[bn5VarArr.length];
        int i6 = 0;
        int i7 = 0;
        while (true) {
            i = -1;
            if (i7 >= bn5VarArr.length) {
                break;
            }
            bn5 bn5Var = bn5VarArr[i7];
            if (bn5Var != null) {
                iArr3[i7] = this.t0.b(bn5Var.a());
            } else {
                iArr3[i7] = -1;
            }
            i7++;
        }
        for (int i8 = 0; i8 < bn5VarArr.length; i8++) {
            if (bn5VarArr[i8] == null || !zArr[i8]) {
                jxd jxdVar = jxdVarArr[i8];
                if (jxdVar instanceof o93) {
                    ((o93) jxdVar).A(this);
                } else if (jxdVar instanceof k93) {
                    k93 k93Var = (k93) jxdVar;
                    o93 o93Var = k93Var.o;
                    boolean[] zArr3 = o93Var.d;
                    int i9 = k93Var.c;
                    hsi.g(zArr3[i9]);
                    o93Var.d[i9] = false;
                }
                jxdVarArr[i8] = null;
            }
        }
        int i10 = 0;
        while (true) {
            z = true;
            if (i10 >= bn5VarArr.length) {
                break;
            }
            jxd jxdVar2 = jxdVarArr[i10];
            if ((jxdVar2 instanceof nd5) || (jxdVar2 instanceof k93)) {
                int iE = e(i10, iArr3);
                if (iE == -1) {
                    z2 = jxdVarArr[i10] instanceof nd5;
                } else {
                    jxd jxdVar3 = jxdVarArr[i10];
                    z2 = (jxdVar3 instanceof k93) && ((k93) jxdVar3).a == jxdVarArr[iE];
                }
                if (!z2) {
                    jxd jxdVar4 = jxdVarArr[i10];
                    if (jxdVar4 instanceof k93) {
                        k93 k93Var2 = (k93) jxdVar4;
                        o93 o93Var2 = k93Var2.o;
                        boolean[] zArr4 = o93Var2.d;
                        int i11 = k93Var2.c;
                        hsi.g(zArr4[i11]);
                        o93Var2.d[i11] = false;
                    }
                    jxdVarArr[i10] = null;
                }
            }
            i10++;
        }
        int i12 = 0;
        while (i12 < bn5VarArr.length) {
            bn5 bn5Var2 = bn5VarArr[i12];
            if (bn5Var2 == null) {
                iArr2 = iArr3;
                i2 = i6;
                i3 = i12;
            } else {
                jxd jxdVar5 = jxdVarArr[i12];
                if (jxdVar5 == null) {
                    zArr2[i12] = z;
                    hd4 hd4Var = this.u0[iArr3[i12]];
                    int i13 = hd4Var.c;
                    if (i13 == 0) {
                        int i14 = hd4Var.f;
                        ?? r27 = i14 != i ? z ? 1 : 0 : i6;
                        if (r27 != 0) {
                            lfgVarA = this.t0.a(i14);
                            i4 = z ? 1 : 0;
                        } else {
                            i4 = i6;
                            lfgVarA = null;
                        }
                        int i15 = hd4Var.g;
                        if (i15 != i) {
                            zjdVar = this.u0[i15].h;
                        } else {
                            t76 t76Var = wg7.b;
                            zjdVar = zjd.o;
                        }
                        int size = zjdVar.size() + i4;
                        hf6[] hf6VarArr = new hf6[size];
                        int[] iArr4 = new int[size];
                        if (r27 != 0) {
                            hf6VarArr[i6] = lfgVarA.d[i6];
                            iArr4[i6] = 5;
                            i5 = z ? 1 : 0;
                        } else {
                            i5 = i6;
                        }
                        ArrayList arrayList = new ArrayList();
                        for (int i16 = i6; i16 < zjdVar.size(); i16++) {
                            hf6 hf6Var = (hf6) zjdVar.get(i16);
                            hf6VarArr[i5] = hf6Var;
                            iArr4[i5] = 3;
                            arrayList.add(hf6Var);
                            i5 += z ? 1 : 0;
                        }
                        if (!this.F0.d || r27 == 0) {
                            i4cVar = null;
                        } else {
                            j4c j4cVar = this.w0;
                            i4cVar = new i4c(j4cVar, (ri4) j4cVar.Y);
                        }
                        iArr2 = iArr3;
                        i3 = i12;
                        i4c i4cVar2 = i4cVar;
                        i2 = 0;
                        o93 o93Var3 = new o93(hd4Var.b, iArr4, hf6VarArr, this.b.i(this.Z, this.F0, this.X, this.G0, hd4Var.a, bn5Var2, hd4Var.b, this.Y, r27, arrayList, i4cVar, this.c, this.A0), this, this.s0, j, this.d, this.z0, this.o, this.y0, this.I0);
                        synchronized (this) {
                            this.x0.put(o93Var3, i4cVar2);
                        }
                        jxdVarArr[i3] = o93Var3;
                    } else {
                        iArr2 = iArr3;
                        i2 = i6;
                        i3 = i12;
                        if (i13 == 2) {
                            jxdVarArr[i3] = new qi5((ti5) this.H0.get(hd4Var.d), bn5Var2.a().d[i2], this.F0.d);
                        }
                    }
                } else {
                    iArr2 = iArr3;
                    i2 = i6;
                    i3 = i12;
                    if (jxdVar5 instanceof o93) {
                        ((o93) jxdVar5).o.i(bn5Var2);
                    }
                }
            }
            i12 = i3 + 1;
            i6 = i2;
            iArr3 = iArr2;
            i = -1;
            z = true;
        }
        int[] iArr5 = iArr3;
        ?? r32 = i6;
        int i17 = r32 == true ? 1 : 0;
        while (i17 < bn5VarArr.length) {
            if (jxdVarArr[i17] != null || bn5VarArr[i17] == null) {
                iArr = iArr5;
            } else {
                hd4 hd4Var2 = this.u0[iArr5[i17]];
                if (hd4Var2.c == 1) {
                    iArr = iArr5;
                    int iE2 = e(i17, iArr);
                    if (iE2 != -1) {
                        o93 o93Var4 = (o93) jxdVarArr[iE2];
                        int i18 = hd4Var2.b;
                        boolean[] zArr5 = o93Var4.d;
                        hxd[] hxdVarArr = o93Var4.x0;
                        for (int i19 = r32 == true ? 1 : 0; i19 < hxdVarArr.length; i19++) {
                            if (o93Var4.b[i19] == i18) {
                                hsi.g(!zArr5[i19]);
                                zArr5[i19] = true;
                                hxdVarArr[i19].C(j, true);
                                jxdVarArr[i17] = new k93(o93Var4, o93Var4, hxdVarArr[i19], i19);
                            }
                        }
                        throw new IllegalStateException();
                    }
                    jxdVarArr[i17] = new nd5();
                    i17++;
                    iArr5 = iArr;
                } else {
                    iArr = iArr5;
                }
            }
            i17++;
            iArr5 = iArr;
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int length = jxdVarArr.length;
        for (int i20 = r32 == true ? 1 : 0; i20 < length; i20++) {
            jxd jxdVar6 = jxdVarArr[i20];
            if (jxdVar6 instanceof o93) {
                arrayList2.add((o93) jxdVar6);
            } else if (jxdVar6 instanceof qi5) {
                arrayList3.add((qi5) jxdVar6);
            }
        }
        o93[] o93VarArr = new o93[arrayList2.size()];
        this.C0 = o93VarArr;
        arrayList2.toArray(o93VarArr);
        qi5[] qi5VarArr = new qi5[arrayList3.size()];
        this.D0 = qi5VarArr;
        arrayList3.toArray(qi5VarArr);
        kc3 kc3Var = this.v0;
        AbstractList abstractListD = lqi.d(new df3(18), arrayList2);
        kc3Var.getClass();
        this.E0 = new lm3(arrayList2, abstractListD);
        if (this.I0) {
            this.I0 = r32;
            this.J0 = j;
        }
        return j;
    }

    @Override // defpackage.p29
    public final void n(n29 n29Var, long j) {
        this.B0 = n29Var;
        n29Var.i(this);
    }

    @Override // defpackage.jee
    public final long o() {
        return this.E0.o();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x008e  */
    @Override // defpackage.jee
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p(long r20) {
        /*
            r19 = this;
            r0 = r19
            o93[] r1 = r0.C0
            int r2 = r1.length
            r4 = 0
        L6:
            if (r4 >= r2) goto L94
            r5 = r1[r4]
            te8 r6 = r5.s0
            boolean r6 = r6.A()
            if (r6 != 0) goto L8e
            ad4 r6 = r0.F0
            int r7 = r0.G0
            long r10 = r6.d(r7)
            hxd r6 = r5.w0
            te8 r7 = r5.s0
            boolean r7 = r7.A()
            r7 = r7 ^ 1
            defpackage.hsi.g(r7)
            boolean r7 = r5.w()
            if (r7 != 0) goto L8e
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r9 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r9 == 0) goto L8e
            java.util.ArrayList r9 = r5.u0
            boolean r9 = r9.isEmpty()
            if (r9 == 0) goto L3f
            goto L8e
        L3f:
            yj0 r9 = r5.u()
            long r12 = r9.v0
            int r7 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r7 == 0) goto L4a
            goto L4c
        L4a:
            long r12 = r9.Z
        L4c:
            int r7 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r7 > 0) goto L51
            goto L8e
        L51:
            long r12 = r6.n()
            int r7 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r7 > 0) goto L5a
            goto L8e
        L5a:
            long r7 = r6.o()
            r14 = 1
            long r7 = r7 + r14
            long r7 = java.lang.Math.max(r10, r7)
            r6.i(r7)
            hxd[] r6 = r5.x0
            int r7 = r6.length
            r8 = 0
        L6c:
            if (r8 >= r7) goto L84
            r9 = r6[r8]
            long r16 = r9.o()
            r18 = r4
            long r3 = r16 + r14
            long r3 = java.lang.Math.max(r10, r3)
            r9.i(r3)
            int r8 = r8 + 1
            r4 = r18
            goto L6c
        L84:
            r18 = r4
            lk6 r8 = r5.Y
            int r9 = r5.a
            r8.Z(r9, r10, r12)
            goto L90
        L8e:
            r18 = r4
        L90:
            int r4 = r18 + 1
            goto L6
        L94:
            lm3 r1 = r0.E0
            r2 = r20
            r1.p(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jd4.p(long):void");
    }

    @Override // defpackage.jee
    public final boolean r(oc8 oc8Var) {
        return this.E0.r(oc8Var);
    }

    @Override // defpackage.hee
    public final void s(jee jeeVar) {
        this.B0.s(this);
    }

    @Override // defpackage.p29
    public final void t(long j, boolean z) {
        long j2;
        for (o93 o93Var : this.C0) {
            if (!o93Var.w()) {
                hxd hxdVar = o93Var.w0;
                int i = hxdVar.q;
                hxdVar.g(j, z, true);
                hxd hxdVar2 = o93Var.w0;
                int i2 = hxdVar2.q;
                if (i2 > i) {
                    synchronized (hxdVar2) {
                        j2 = hxdVar2.p == 0 ? Long.MIN_VALUE : hxdVar2.n[hxdVar2.r];
                    }
                    int i3 = 0;
                    while (true) {
                        hxd[] hxdVarArr = o93Var.x0;
                        if (i3 >= hxdVarArr.length) {
                            break;
                        }
                        hxdVarArr[i3].g(j2, z, o93Var.d[i3]);
                        i3++;
                    }
                }
                int iMin = Math.min(o93Var.z(i2, 0), o93Var.E0);
                if (iMin > 0) {
                    zxg.b0(o93Var.u0, 0, iMin);
                    o93Var.E0 -= iMin;
                }
            }
        }
    }
}
