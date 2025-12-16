package defpackage;

import android.net.Uri;
import android.util.SparseArray;
import androidx.media3.common.ParserException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class u47 implements p29, y57 {
    public n29 A0;
    public int B0;
    public nfg C0;
    public i67[] D0;
    public i67[] E0;
    public int F0;
    public lm3 G0;
    public final d55 X;
    public final tha Y;
    public final lk6 Z;
    public final wm4 a;
    public final bn4 b;
    public final y6i c;
    public final wgg d;
    public final k55 o;
    public final ri4 s0;
    public final IdentityHashMap t0;
    public final s6b u0;
    public final kc3 v0;
    public final boolean w0;
    public final int x0;
    public final n4c y0;
    public final h08 z0 = new h08(19, this);

    public u47(wm4 wm4Var, bn4 bn4Var, y6i y6iVar, wgg wggVar, k55 k55Var, d55 d55Var, tha thaVar, lk6 lk6Var, ri4 ri4Var, kc3 kc3Var, boolean z, int i, n4c n4cVar) {
        this.a = wm4Var;
        this.b = bn4Var;
        this.c = y6iVar;
        this.d = wggVar;
        this.o = k55Var;
        this.X = d55Var;
        this.Y = thaVar;
        this.Z = lk6Var;
        this.s0 = ri4Var;
        this.v0 = kc3Var;
        this.w0 = z;
        this.x0 = i;
        this.y0 = n4cVar;
        kc3Var.getClass();
        t76 t76Var = wg7.b;
        zjd zjdVar = zjd.o;
        this.G0 = new lm3(zjdVar, zjdVar);
        this.t0 = new IdentityHashMap();
        this.u0 = new s6b(11);
        this.D0 = new i67[0];
        this.E0 = new i67[0];
    }

    public static hf6 g(hf6 hf6Var, hf6 hf6Var2, boolean z) {
        ty9 ty9Var;
        int i;
        String str;
        String str2;
        wg7 wg7Var;
        int i2;
        int i3;
        String str3;
        t76 t76Var = wg7.b;
        zjd zjdVar = zjd.o;
        if (hf6Var2 != null) {
            str2 = hf6Var2.k;
            ty9Var = hf6Var2.l;
            i2 = hf6Var2.F;
            i = hf6Var2.e;
            i3 = hf6Var2.f;
            str = hf6Var2.d;
            str3 = hf6Var2.b;
            wg7Var = hf6Var2.c;
        } else {
            String strV = zxg.v(1, hf6Var.k);
            ty9Var = hf6Var.l;
            if (z) {
                i2 = hf6Var.F;
                i = hf6Var.e;
                i3 = hf6Var.f;
                str = hf6Var.d;
                str3 = hf6Var.b;
                str2 = strV;
                wg7Var = hf6Var.c;
            } else {
                i = 0;
                str = null;
                str2 = strV;
                wg7Var = zjdVar;
                i2 = -1;
                i3 = 0;
                str3 = null;
            }
        }
        String strD = xz9.d(str2);
        int i4 = z ? hf6Var.h : -1;
        int i5 = z ? hf6Var.i : -1;
        ff6 ff6Var = new ff6();
        ff6Var.a = hf6Var.a;
        ff6Var.b = str3;
        ff6Var.c = wg7.j(wg7Var);
        ff6Var.l = xz9.n(hf6Var.m);
        ff6Var.m = xz9.n(strD);
        ff6Var.j = str2;
        ff6Var.k = ty9Var;
        ff6Var.h = i4;
        ff6Var.i = i5;
        ff6Var.E = i2;
        ff6Var.e = i;
        ff6Var.f = i3;
        ff6Var.d = str;
        return new hf6(ff6Var);
    }

    @Override // defpackage.y57
    public final void a() {
        for (i67 i67Var : this.D0) {
            te8 te8Var = i67Var.t0;
            m47 m47Var = i67Var.d;
            ArrayList arrayList = i67Var.x0;
            if (!arrayList.isEmpty()) {
                s47 s47Var = (s47) uni.c(arrayList);
                int iB = m47Var.b(s47Var);
                int i = s47Var.y0;
                if (iB == 1) {
                    if (!s47Var.g()) {
                        hsi.g(i != -1);
                        i57 i57VarB = m47Var.g.b(m47Var.e[m47Var.h.b(s47Var.d)], false);
                        i57VarB.getClass();
                        wg7 wg7Var = i57VarB.r;
                        int i2 = (int) (s47Var.t0 - i57VarB.k);
                        s47Var.U0 = i2 < 0 ? 0L : ((z47) (i2 < wg7Var.size() ? ((d57) wg7Var.get(i2)).w0 : i57VarB.s).get(i)).c;
                    }
                } else if (iB == 0) {
                    i67Var.B0.post(new qz5(i67Var, 8, s47Var));
                } else if (iB == 2 && !i67Var.d1 && te8Var.A()) {
                    te8Var.c();
                }
            }
        }
        this.A0.s(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0088  */
    @Override // defpackage.y57
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(android.net.Uri r19, defpackage.sb8 r20, boolean r21) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            i67[] r2 = r0.D0
            int r3 = r2.length
            r6 = 0
            r7 = 1
        L9:
            if (r6 >= r3) goto L90
            r8 = r2[r6]
            m47 r9 = r8.d
            android.net.Uri[] r10 = r9.e
            boolean r11 = defpackage.zxg.l(r10, r1)
            if (r11 != 0) goto L1d
            r14 = r20
            r4 = 1
            r13 = 1
            goto L8b
        L1d:
            if (r21 != 0) goto L3a
            tha r8 = r8.s0
            bn5 r13 = r9.r
            nc5 r13 = defpackage.qfi.b(r13)
            r14 = r20
            y21 r8 = r8.p(r13, r14)
            if (r8 == 0) goto L38
            int r13 = r8.b
            r15 = 2
            if (r13 != r15) goto L38
            r13 = 1
            long r4 = r8.c
            goto L42
        L38:
            r13 = 1
            goto L3d
        L3a:
            r14 = r20
            goto L38
        L3d:
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L42:
            r8 = 0
            r16 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L48:
            int r11 = r10.length
            r12 = -1
            if (r8 >= r11) goto L58
            r11 = r10[r8]
            boolean r11 = r11.equals(r1)
            if (r11 == 0) goto L55
            goto L59
        L55:
            int r8 = r8 + 1
            goto L48
        L58:
            r8 = r12
        L59:
            if (r8 != r12) goto L5c
            goto L88
        L5c:
            bn5 r10 = r9.r
            int r8 = r10.p(r8)
            if (r8 != r12) goto L65
            goto L88
        L65:
            r9.o = r1
            int r10 = (r4 > r16 ? 1 : (r4 == r16 ? 0 : -1))
            if (r10 == 0) goto L8a
            bn5 r10 = r9.r
            boolean r8 = r10.u(r8, r4)
            if (r8 == 0) goto L8a
            bn4 r8 = r9.g
            java.util.HashMap r8 = r8.b
            java.lang.Object r8 = r8.get(r1)
            an4 r8 = (defpackage.an4) r8
            if (r8 == 0) goto L85
            boolean r4 = defpackage.an4.a(r8, r4)
            r4 = r4 ^ r13
            goto L86
        L85:
            r4 = 0
        L86:
            if (r4 == 0) goto L8a
        L88:
            r4 = r13
            goto L8b
        L8a:
            r4 = 0
        L8b:
            r7 = r7 & r4
            int r6 = r6 + 1
            goto L9
        L90:
            n29 r1 = r0.A0
            r1.s(r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u47.b(android.net.Uri, sb8, boolean):boolean");
    }

    @Override // defpackage.p29
    public final long c(long j, k9e k9eVar) {
        i67[] i67VarArr = this.E0;
        int length = i67VarArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            i67 i67Var = i67VarArr[i];
            if (i67Var.K0 == 2) {
                m47 m47Var = i67Var.d;
                bn4 bn4Var = m47Var.g;
                int iB = m47Var.r.b();
                Uri[] uriArr = m47Var.e;
                i57 i57VarB = (iB >= uriArr.length || iB == -1) ? null : bn4Var.b(uriArr[m47Var.r.i()], true);
                if (i57VarB != null) {
                    wg7 wg7Var = i57VarB.r;
                    if (!wg7Var.isEmpty()) {
                        long j2 = i57VarB.h - bn4Var.Y;
                        long j3 = j - j2;
                        int iC = zxg.c(wg7Var, Long.valueOf(j3), true, true);
                        long j4 = ((d57) wg7Var.get(iC)).o;
                        return k9eVar.a(j3, j4, (!i57VarB.c || iC == wg7Var.size() - 1) ? j4 : ((d57) wg7Var.get(iC + 1)).o) + j2;
                    }
                }
            } else {
                i++;
            }
        }
        return j;
    }

    @Override // defpackage.jee
    public final long d() {
        return this.G0.d();
    }

    public final i67 e(String str, int i, Uri[] uriArr, hf6[] hf6VarArr, hf6 hf6Var, List list, Map map, long j) {
        return new i67(str, i, this.z0, new m47(this.a, this.b, uriArr, hf6VarArr, this.c, this.d, this.u0, list, this.y0), map, this.s0, j, hf6Var, this.o, this.X, this.Y, this.Z, this.x0);
    }

    @Override // defpackage.p29
    public final void f() throws IOException {
        for (i67 i67Var : this.D0) {
            i67Var.D();
            if (i67Var.d1 && !i67Var.N0) {
                throw ParserException.a(null, "Loading finished before preparation is complete.");
            }
        }
    }

    @Override // defpackage.p29
    public final long h(long j) {
        i67[] i67VarArr = this.E0;
        if (i67VarArr.length > 0) {
            boolean zH = i67VarArr[0].H(j, false);
            int i = 1;
            while (true) {
                i67[] i67VarArr2 = this.E0;
                if (i >= i67VarArr2.length) {
                    break;
                }
                i67VarArr2[i].H(j, zH);
                i++;
            }
            if (zH) {
                ((SparseArray) this.u0.a).clear();
            }
        }
        return j;
    }

    @Override // defpackage.jee
    public final boolean j() {
        return this.G0.j();
    }

    @Override // defpackage.p29
    public final long k() {
        return -9223372036854775807L;
    }

    @Override // defpackage.p29
    public final nfg l() {
        nfg nfgVar = this.C0;
        nfgVar.getClass();
        return nfgVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:120:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0199  */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r29v0 */
    /* JADX WARN: Type inference failed for: r30v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v49 */
    /* JADX WARN: Type inference failed for: r7v5, types: [int] */
    /* JADX WARN: Type inference failed for: r7v50 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v39 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    @Override // defpackage.p29
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long m(defpackage.bn5[] r40, boolean[] r41, defpackage.jxd[] r42, boolean[] r43, long r44) {
        /*
            Method dump skipped, instructions count: 856
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u47.m(bn5[], boolean[], jxd[], boolean[], long):long");
    }

    @Override // defpackage.p29
    public final void n(n29 n29Var, long j) {
        wm4 wm4Var;
        boolean z;
        List list;
        List list2;
        HashSet hashSet;
        int i;
        HashSet hashSet2;
        int i2;
        boolean z2;
        wm4 wm4Var2;
        int i3;
        boolean z3;
        Uri[] uriArr;
        this.A0 = n29Var;
        bn4 bn4Var = this.b;
        bn4Var.getClass();
        bn4Var.c.add(this);
        q57 q57Var = (q57) bn4Var.x0;
        q57Var.getClass();
        List list3 = q57Var.f;
        List list4 = q57Var.e;
        Map map = Collections.EMPTY_MAP;
        boolean zIsEmpty = list4.isEmpty();
        List list5 = q57Var.g;
        int i4 = 0;
        this.B0 = 0;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        wm4 wm4Var3 = this.a;
        boolean z4 = this.w0;
        if (zIsEmpty) {
            wm4Var = wm4Var3;
            z = z4;
            list = list3;
            list2 = list5;
        } else {
            hf6 hf6Var = q57Var.h;
            int size = list4.size();
            int[] iArr = new int[size];
            int i5 = 0;
            int i6 = 0;
            while (true) {
                list2 = list5;
                if (i5 >= list4.size()) {
                    break;
                }
                hf6 hf6Var2 = ((o57) list4.get(i5)).b;
                int i7 = hf6Var2.v;
                String str = hf6Var2.k;
                if (i7 > 0 || zxg.v(2, str) != null) {
                    iArr[i5] = 2;
                    i6++;
                } else if (zxg.v(1, str) != null) {
                    iArr[i5] = 1;
                    i4++;
                } else {
                    iArr[i5] = -1;
                }
                i5++;
                list5 = list2;
            }
            if (i6 > 0) {
                z3 = false;
                wm4Var2 = wm4Var3;
                i3 = i6;
                z2 = true;
            } else if (i4 < size) {
                z2 = false;
                wm4Var2 = wm4Var3;
                i3 = size - i4;
                z3 = true;
            } else {
                z2 = false;
                wm4Var2 = wm4Var3;
                i3 = size;
                z3 = false;
            }
            Uri[] uriArr2 = new Uri[i3];
            hf6[] hf6VarArr = new hf6[i3];
            int[] iArr2 = new int[i3];
            int i8 = 0;
            int i9 = 0;
            while (i8 < list4.size()) {
                if (z2) {
                    uriArr = uriArr2;
                    if (iArr[i8] == 2) {
                    }
                    i8++;
                    uriArr2 = uriArr;
                } else {
                    uriArr = uriArr2;
                }
                if (!z3 || iArr[i8] != 1) {
                    o57 o57Var = (o57) list4.get(i8);
                    uriArr[i9] = o57Var.a;
                    hf6VarArr[i9] = o57Var.b;
                    iArr2[i9] = i8;
                    i9++;
                }
                i8++;
                uriArr2 = uriArr;
            }
            Uri[] uriArr3 = uriArr2;
            String str2 = hf6VarArr[0].k;
            int iU = zxg.u(2, str2);
            int iU2 = zxg.u(1, str2);
            boolean z5 = (iU2 == 1 || (iU2 == 0 && list3.isEmpty())) && iU <= 1 && iU2 + iU > 0;
            wm4 wm4Var4 = wm4Var2;
            list = list3;
            z = z4;
            i67 i67VarE = e("main", (z2 || iU2 <= 0) ? 0 : 1, uriArr3, hf6VarArr, q57Var.h, q57Var.i, map, j);
            arrayList.add(i67VarE);
            arrayList2.add(iArr2);
            if (z && z5) {
                ArrayList arrayList3 = new ArrayList();
                if (iU > 0) {
                    hf6[] hf6VarArr2 = new hf6[i3];
                    int i10 = 0;
                    while (i10 < i3) {
                        hf6 hf6Var3 = hf6VarArr[i10];
                        String strV = zxg.v(2, hf6Var3.k);
                        String strD = xz9.d(strV);
                        ff6 ff6Var = new ff6();
                        ff6Var.a = hf6Var3.a;
                        ff6Var.b = hf6Var3.b;
                        ff6Var.c = wg7.j(hf6Var3.c);
                        ff6Var.l = xz9.n(hf6Var3.m);
                        ff6Var.m = xz9.n(strD);
                        ff6Var.j = strV;
                        ff6Var.k = hf6Var3.l;
                        ff6Var.h = hf6Var3.h;
                        ff6Var.i = hf6Var3.i;
                        ff6Var.t = hf6Var3.u;
                        ff6Var.u = hf6Var3.v;
                        ff6Var.x = hf6Var3.y;
                        ff6Var.e = hf6Var3.e;
                        ff6Var.f = hf6Var3.f;
                        hf6VarArr2[i10] = new hf6(ff6Var);
                        i10++;
                        hf6VarArr = hf6VarArr;
                    }
                    hf6[] hf6VarArr3 = hf6VarArr;
                    arrayList3.add(new lfg("main", hf6VarArr2));
                    if (iU2 > 0 && (hf6Var != null || list.isEmpty())) {
                        arrayList3.add(new lfg("main:audio", g(hf6VarArr3[0], hf6Var, false)));
                    }
                    List list6 = q57Var.i;
                    if (list6 != null) {
                        for (int i11 = 0; i11 < list6.size(); i11++) {
                            arrayList3.add(new lfg(ho7.f(i11, "main:cc:"), wm4Var4.c((hf6) list6.get(i11))));
                        }
                    }
                    wm4Var = wm4Var4;
                } else {
                    wm4Var = wm4Var4;
                    hf6[] hf6VarArr4 = new hf6[i3];
                    for (int i12 = 0; i12 < i3; i12++) {
                        hf6VarArr4[i12] = g(hf6VarArr[i12], hf6Var, true);
                    }
                    arrayList3.add(new lfg("main", hf6VarArr4));
                }
                ff6 ff6Var2 = new ff6();
                ff6Var2.a = "ID3";
                ff6Var2.m = xz9.n("application/id3");
                lfg lfgVar = new lfg("main:id3", new hf6(ff6Var2));
                arrayList3.add(lfgVar);
                i67VarE.E((lfg[]) arrayList3.toArray(new lfg[0]), arrayList3.indexOf(lfgVar));
            } else {
                wm4Var = wm4Var4;
            }
        }
        ArrayList arrayList4 = new ArrayList(list.size());
        ArrayList arrayList5 = new ArrayList(list.size());
        ArrayList arrayList6 = new ArrayList(list.size());
        HashSet hashSet3 = new HashSet();
        int i13 = 0;
        while (i13 < list.size()) {
            List list7 = list;
            String str3 = ((m57) list7.get(i13)).c;
            if (hashSet3.add(str3)) {
                arrayList4.clear();
                arrayList5.clear();
                arrayList6.clear();
                boolean z6 = true;
                for (int i14 = 0; i14 < list7.size(); i14++) {
                    if (str3.equals(((m57) list7.get(i14)).c)) {
                        m57 m57Var = (m57) list7.get(i14);
                        arrayList6.add(Integer.valueOf(i14));
                        Uri uri = m57Var.a;
                        hf6 hf6Var4 = m57Var.b;
                        arrayList4.add(uri);
                        arrayList5.add(hf6Var4);
                        z6 &= zxg.u(1, hf6Var4.k) == 1;
                    }
                }
                String strConcat = "audio:".concat(str3);
                String str4 = zxg.a;
                list = list7;
                hashSet2 = hashSet3;
                i2 = i13;
                i67 i67VarE2 = e(strConcat, 1, (Uri[]) arrayList4.toArray(new Uri[0]), (hf6[]) arrayList5.toArray(new hf6[0]), null, Collections.EMPTY_LIST, map, j);
                arrayList2.add(jni.i(arrayList6));
                arrayList.add(i67VarE2);
                if (z && z6) {
                    i67VarE2.E(new lfg[]{new lfg(strConcat, (hf6[]) arrayList5.toArray(new hf6[0]))}, new int[0]);
                }
            } else {
                hashSet2 = hashSet3;
                i2 = i13;
                list = list7;
            }
            i13 = i2 + 1;
            hashSet3 = hashSet2;
        }
        this.F0 = arrayList.size();
        ArrayList arrayList7 = new ArrayList(list2.size());
        ArrayList arrayList8 = new ArrayList(list2.size());
        ArrayList arrayList9 = new ArrayList(list2.size());
        HashSet hashSet4 = new HashSet();
        int i15 = 0;
        while (i15 < list2.size()) {
            List list8 = list2;
            String str5 = ((m57) list8.get(i15)).c;
            if (hashSet4.add(str5)) {
                arrayList7.clear();
                arrayList8.clear();
                arrayList9.clear();
                for (int i16 = 0; i16 < list8.size(); i16++) {
                    if (str5.equals(((m57) list8.get(i16)).c)) {
                        m57 m57Var2 = (m57) list8.get(i16);
                        arrayList9.add(Integer.valueOf(i16));
                        arrayList7.add(m57Var2.a);
                        arrayList8.add(m57Var2.b);
                    }
                }
                String strConcat2 = "subtitle:".concat(str5);
                hf6[] hf6VarArr5 = (hf6[]) arrayList8.toArray(new hf6[0]);
                String str6 = zxg.a;
                Uri[] uriArr4 = (Uri[]) arrayList7.toArray(new Uri[0]);
                t76 t76Var = wg7.b;
                list2 = list8;
                hashSet = hashSet4;
                i = i15;
                i67 i67VarE3 = e(strConcat2, 3, uriArr4, hf6VarArr5, null, zjd.o, map, j);
                arrayList2.add(jni.i(arrayList9));
                arrayList.add(i67VarE3);
                int length = hf6VarArr5.length;
                hf6[] hf6VarArr6 = new hf6[length];
                for (int i17 = 0; i17 < length; i17++) {
                    hf6VarArr6[i17] = wm4Var.c(hf6VarArr5[i17]);
                }
                i67VarE3.E(new lfg[]{new lfg(strConcat2, hf6VarArr6)}, new int[0]);
            } else {
                hashSet = hashSet4;
                i = i15;
                list2 = list8;
            }
            i15 = i + 1;
            hashSet4 = hashSet;
        }
        this.D0 = (i67[]) arrayList.toArray(new i67[0]);
        this.B0 = this.D0.length;
        for (int i18 = 0; i18 < this.F0; i18++) {
            this.D0[i18].d.l = true;
        }
        for (i67 i67Var : this.D0) {
            if (!i67Var.N0) {
                nc8 nc8Var = new nc8();
                nc8Var.a = i67Var.Z0;
                i67Var.r(new oc8(nc8Var));
            }
        }
        this.E0 = this.D0;
    }

    @Override // defpackage.jee
    public final long o() {
        return this.G0.o();
    }

    @Override // defpackage.jee
    public final void p(long j) {
        this.G0.p(j);
    }

    @Override // defpackage.jee
    public final boolean r(oc8 oc8Var) {
        if (this.C0 != null) {
            return this.G0.r(oc8Var);
        }
        for (i67 i67Var : this.D0) {
            if (!i67Var.N0) {
                nc8 nc8Var = new nc8();
                nc8Var.a = i67Var.Z0;
                i67Var.r(new oc8(nc8Var));
            }
        }
        return false;
    }

    @Override // defpackage.p29
    public final void t(long j, boolean z) {
        for (i67 i67Var : this.E0) {
            if (i67Var.M0 && !i67Var.A()) {
                int length = i67Var.F0.length;
                for (int i = 0; i < length; i++) {
                    i67Var.F0[i].g(j, z, i67Var.X0[i]);
                }
            }
        }
    }
}
