package defpackage;

import android.net.Uri;
import android.util.SparseArray;
import com.google.android.exoplayer2.ParserException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class t47 implements o29, x57, gee {
    public int A0;
    public mfg B0;
    public h67[] C0;
    public h67[] D0;
    public int E0;
    public kce F0;
    public final lk6 X;
    public final rha Y;
    public final qr4 Z;
    public final p47 a;
    public final bn4 b;
    public final x6i c;
    public final vgg d;
    public final j55 o;
    public final qi4 s0;
    public final IdentityHashMap t0;
    public final znd u0;
    public final lcj v0;
    public final boolean w0;
    public final int x0;
    public final m4c y0;
    public m29 z0;

    public t47(p47 p47Var, bn4 bn4Var, x6i x6iVar, vgg vggVar, j55 j55Var, lk6 lk6Var, rha rhaVar, qr4 qr4Var, qi4 qi4Var, lcj lcjVar, boolean z, int i, m4c m4cVar) {
        this.a = p47Var;
        this.b = bn4Var;
        this.c = x6iVar;
        this.d = vggVar;
        this.o = j55Var;
        this.X = lk6Var;
        this.Y = rhaVar;
        this.Z = qr4Var;
        this.s0 = qi4Var;
        this.v0 = lcjVar;
        this.w0 = z;
        this.x0 = i;
        this.y0 = m4cVar;
        lcjVar.getClass();
        this.F0 = new kce(12, new iee[0]);
        this.t0 = new IdentityHashMap();
        this.u0 = new znd(5);
        this.C0 = new h67[0];
        this.D0 = new h67[0];
    }

    public static gf6 i(gf6 gf6Var, gf6 gf6Var2, boolean z) {
        String strP;
        sy9 sy9Var;
        int i;
        String str;
        int i2;
        int i3;
        String str2;
        if (gf6Var2 != null) {
            strP = gf6Var2.s0;
            sy9Var = gf6Var2.t0;
            i2 = gf6Var2.I0;
            i = gf6Var2.d;
            i3 = gf6Var2.o;
            str = gf6Var2.c;
            str2 = gf6Var2.b;
        } else {
            strP = xxg.p(1, gf6Var.s0);
            sy9Var = gf6Var.t0;
            if (z) {
                i2 = gf6Var.I0;
                i = gf6Var.d;
                i3 = gf6Var.o;
                str = gf6Var.c;
                str2 = gf6Var.b;
            } else {
                i = 0;
                str = null;
                i2 = -1;
                i3 = 0;
                str2 = null;
            }
        }
        String strC = wz9.c(strP);
        int i4 = z ? gf6Var.X : -1;
        int i5 = z ? gf6Var.Y : -1;
        ef6 ef6Var = new ef6();
        ef6Var.a = gf6Var.a;
        ef6Var.b = str2;
        ef6Var.j = gf6Var.u0;
        ef6Var.k = strC;
        ef6Var.h = strP;
        ef6Var.i = sy9Var;
        ef6Var.f = i4;
        ef6Var.g = i5;
        ef6Var.x = i2;
        ef6Var.d = i;
        ef6Var.e = i3;
        ef6Var.c = str;
        return new gf6(ef6Var);
    }

    @Override // defpackage.o29
    public final void C(m29 m29Var, long j) {
        boolean z;
        List list;
        List list2;
        int i;
        boolean z2;
        boolean z3;
        int i2;
        boolean z4;
        Uri[] uriArr;
        this.z0 = m29Var;
        bn4 bn4Var = this.b;
        bn4Var.getClass();
        bn4Var.c.add(this);
        p57 p57Var = (p57) bn4Var.x0;
        p57Var.getClass();
        List list3 = p57Var.g;
        List list4 = p57Var.e;
        Map map = Collections.EMPTY_MAP;
        boolean zIsEmpty = list4.isEmpty();
        List list5 = p57Var.h;
        int i3 = 0;
        this.A0 = 0;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        boolean z5 = this.w0;
        if (zIsEmpty) {
            z = z5;
            list = list3;
            list2 = list5;
        } else {
            gf6 gf6Var = p57Var.j;
            int size = list4.size();
            int[] iArr = new int[size];
            int i4 = 0;
            int i5 = 0;
            while (true) {
                list2 = list5;
                if (i4 >= list4.size()) {
                    break;
                }
                gf6 gf6Var2 = ((n57) list4.get(i4)).b;
                int i6 = gf6Var2.B0;
                String str = gf6Var2.s0;
                if (i6 > 0 || xxg.p(2, str) != null) {
                    iArr[i4] = 2;
                    i5++;
                } else if (xxg.p(1, str) != null) {
                    iArr[i4] = 1;
                    i3++;
                } else {
                    iArr[i4] = -1;
                }
                i4++;
                list5 = list2;
            }
            if (i5 > 0) {
                z4 = false;
                z3 = z5;
                i2 = i5;
                z2 = true;
            } else if (i3 < size) {
                z2 = false;
                z3 = z5;
                i2 = size - i3;
                z4 = true;
            } else {
                z2 = false;
                z3 = z5;
                i2 = size;
                z4 = false;
            }
            Uri[] uriArr2 = new Uri[i2];
            boolean z6 = z2;
            gf6[] gf6VarArr = new gf6[i2];
            int[] iArr2 = new int[i2];
            int i7 = 0;
            int i8 = 0;
            while (i7 < list4.size()) {
                if (z6) {
                    uriArr = uriArr2;
                    if (iArr[i7] == 2) {
                    }
                    i7++;
                    uriArr2 = uriArr;
                } else {
                    uriArr = uriArr2;
                }
                if (!z4 || iArr[i7] != 1) {
                    n57 n57Var = (n57) list4.get(i7);
                    uriArr[i8] = n57Var.a;
                    gf6VarArr[i8] = n57Var.b;
                    iArr2[i8] = i7;
                    i8++;
                }
                i7++;
                uriArr2 = uriArr;
            }
            Uri[] uriArr3 = uriArr2;
            String str2 = gf6VarArr[0].s0;
            int iO = xxg.o(2, str2);
            int iO2 = xxg.o(1, str2);
            boolean z7 = iO2 <= 1 && iO <= 1 && iO2 + iO > 0;
            z = z3;
            list = list3;
            h67 h67VarG = g("main", (z6 || iO2 <= 0) ? 0 : 1, uriArr3, gf6VarArr, p57Var.j, p57Var.k, map, j);
            arrayList.add(h67VarG);
            arrayList2.add(iArr2);
            if (z && z7) {
                ArrayList arrayList3 = new ArrayList();
                if (iO > 0) {
                    gf6[] gf6VarArr2 = new gf6[i2];
                    int i9 = 0;
                    while (i9 < i2) {
                        gf6 gf6Var3 = gf6VarArr[i9];
                        String strP = xxg.p(2, gf6Var3.s0);
                        String strC = wz9.c(strP);
                        ef6 ef6Var = new ef6();
                        ef6Var.a = gf6Var3.a;
                        ef6Var.b = gf6Var3.b;
                        ef6Var.j = gf6Var3.u0;
                        ef6Var.k = strC;
                        ef6Var.h = strP;
                        ef6Var.i = gf6Var3.t0;
                        ef6Var.f = gf6Var3.X;
                        ef6Var.g = gf6Var3.Y;
                        ef6Var.p = gf6Var3.A0;
                        ef6Var.q = gf6Var3.B0;
                        ef6Var.r = gf6Var3.C0;
                        ef6Var.d = gf6Var3.d;
                        ef6Var.e = gf6Var3.o;
                        gf6VarArr2[i9] = new gf6(ef6Var);
                        i9++;
                        gf6VarArr = gf6VarArr;
                    }
                    gf6[] gf6VarArr3 = gf6VarArr;
                    arrayList3.add(new kfg("main", gf6VarArr2));
                    if (iO2 > 0 && (gf6Var != null || list.isEmpty())) {
                        arrayList3.add(new kfg("main".concat(":audio"), i(gf6VarArr3[0], gf6Var, false)));
                    }
                    List list6 = p57Var.k;
                    if (list6 != null) {
                        for (int i10 = 0; i10 < list6.size(); i10++) {
                            StringBuilder sb = new StringBuilder(19);
                            sb.append("main:cc:");
                            sb.append(i10);
                            arrayList3.add(new kfg(sb.toString(), (gf6) list6.get(i10)));
                        }
                    }
                } else {
                    gf6[] gf6VarArr4 = new gf6[i2];
                    for (int i11 = 0; i11 < i2; i11++) {
                        gf6VarArr4[i11] = i(gf6VarArr[i11], gf6Var, true);
                    }
                    arrayList3.add(new kfg("main", gf6VarArr4));
                }
                String strConcat = "main".concat(":id3");
                ef6 ef6Var2 = new ef6();
                ef6Var2.a = "ID3";
                ef6Var2.k = "application/id3";
                kfg kfgVar = new kfg(strConcat, new gf6(ef6Var2));
                arrayList3.add(kfgVar);
                h67VarG.x((kfg[]) arrayList3.toArray(new kfg[0]), arrayList3.indexOf(kfgVar));
            }
        }
        ArrayList arrayList4 = new ArrayList(list.size());
        ArrayList arrayList5 = new ArrayList(list.size());
        ArrayList arrayList6 = new ArrayList(list.size());
        HashSet hashSet = new HashSet();
        int i12 = 0;
        while (i12 < list.size()) {
            List list7 = list;
            String str3 = ((l57) list7.get(i12)).c;
            if (hashSet.add(str3)) {
                arrayList4.clear();
                arrayList5.clear();
                arrayList6.clear();
                boolean z8 = true;
                for (int i13 = 0; i13 < list7.size(); i13++) {
                    String str4 = ((l57) list7.get(i13)).c;
                    int i14 = xxg.a;
                    if (str3.equals(str4)) {
                        l57 l57Var = (l57) list7.get(i13);
                        arrayList6.add(Integer.valueOf(i13));
                        Uri uri = l57Var.a;
                        gf6 gf6Var4 = l57Var.b;
                        arrayList4.add(uri);
                        arrayList5.add(gf6Var4);
                        z8 &= xxg.o(1, gf6Var4.s0) == 1;
                    }
                }
                String strConcat2 = str3.length() != 0 ? "audio:".concat(str3) : new String("audio:");
                int i15 = xxg.a;
                list = list7;
                String str5 = strConcat2;
                i = i12;
                h67 h67VarG2 = g(str5, 1, (Uri[]) arrayList4.toArray(new Uri[0]), (gf6[]) arrayList5.toArray(new gf6[0]), null, Collections.EMPTY_LIST, map, j);
                arrayList2.add(jni.i(arrayList6));
                arrayList.add(h67VarG2);
                if (z && z8) {
                    h67VarG2.x(new kfg[]{new kfg(str5, (gf6[]) arrayList5.toArray(new gf6[0]))}, new int[0]);
                }
            } else {
                i = i12;
                list = list7;
            }
            i12 = i + 1;
        }
        this.E0 = arrayList.size();
        for (int i16 = 0; i16 < list2.size(); i16++) {
            l57 l57Var2 = (l57) list2.get(i16);
            String str6 = l57Var2.c;
            gf6 gf6Var5 = l57Var2.b;
            StringBuilder sb2 = new StringBuilder(str6.length() + 21);
            sb2.append("subtitle:");
            sb2.append(i16);
            sb2.append(":");
            sb2.append(str6);
            String string = sb2.toString();
            h67 h67VarG3 = g(string, 3, new Uri[]{l57Var2.a}, new gf6[]{gf6Var5}, null, Collections.EMPTY_LIST, map, j);
            arrayList2.add(new int[]{i16});
            arrayList.add(h67VarG3);
            h67VarG3.x(new kfg[]{new kfg(string, gf6Var5)}, new int[0]);
        }
        this.C0 = (h67[]) arrayList.toArray(new h67[0]);
        h67[] h67VarArr = this.C0;
        this.A0 = h67VarArr.length;
        h67VarArr[0].d.l = true;
        for (h67 h67Var : h67VarArr) {
            if (!h67Var.N0) {
                h67Var.z(h67Var.Z0);
            }
        }
        this.D0 = this.C0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02d8  */
    /* JADX WARN: Type inference failed for: r27v0 */
    /* JADX WARN: Type inference failed for: r28v2 */
    /* JADX WARN: Type inference failed for: r6v41 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v21, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    @Override // defpackage.o29
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long E(defpackage.an5[] r38, boolean[] r39, defpackage.ixd[] r40, boolean[] r41, long r42) {
        /*
            Method dump skipped, instructions count: 810
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t47.E(an5[], boolean[], ixd[], boolean[], long):long");
    }

    @Override // defpackage.x57
    public final void a() {
        for (h67 h67Var : this.C0) {
            hc8 hc8Var = h67Var.t0;
            ArrayList arrayList = h67Var.x0;
            if (!arrayList.isEmpty()) {
                r47 r47Var = (r47) uni.c(arrayList);
                int iB = h67Var.d.b(r47Var);
                if (iB == 1) {
                    r47Var.U0 = true;
                } else if (iB == 2 && !h67Var.d1 && hc8Var.I()) {
                    hc8Var.x();
                }
            }
        }
        this.z0.b(this);
    }

    @Override // defpackage.gee
    public final void b(iee ieeVar) {
        this.z0.b(this);
    }

    @Override // defpackage.iee
    public final long d() {
        return this.F0.d();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0056 A[SYNTHETIC] */
    @Override // defpackage.x57
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean e(android.net.Uri r18, defpackage.sb8 r19, boolean r20) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            h67[] r2 = r0.C0
            int r3 = r2.length
            r6 = 0
            r7 = 1
        L9:
            if (r6 >= r3) goto La3
            r8 = r2[r6]
            l47 r9 = r8.d
            android.net.Uri[] r10 = r9.e
            boolean r11 = defpackage.xxg.k(r10, r1)
            if (r11 != 0) goto L1e
            r8 = r19
            r4 = 1
            r16 = 1
            goto L9e
        L1e:
            r11 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r20 != 0) goto L40
            rha r8 = r8.s0
            an5 r13 = r9.q
            nc5 r13 = defpackage.pfi.b(r13)
            r8.getClass()
            r8 = r19
            y21 r13 = defpackage.rha.p(r13, r8)
            if (r13 == 0) goto L42
            int r14 = r13.b
            r15 = 2
            if (r14 != r15) goto L42
            long r13 = r13.c
            goto L43
        L40:
            r8 = r19
        L42:
            r13 = r11
        L43:
            r15 = 0
            r16 = 1
        L46:
            int r4 = r10.length
            r5 = -1
            if (r15 >= r4) goto L56
            r4 = r10[r15]
            boolean r4 = r4.equals(r1)
            if (r4 == 0) goto L53
            goto L57
        L53:
            int r15 = r15 + 1
            goto L46
        L56:
            r15 = r5
        L57:
            if (r15 != r5) goto L5c
        L59:
            r4 = r16
            goto L94
        L5c:
            an5 r4 = r9.q
            int r4 = r4.p(r15)
            if (r4 != r5) goto L65
            goto L59
        L65:
            boolean r5 = r9.s
            android.net.Uri r10 = r9.o
            boolean r10 = r1.equals(r10)
            r5 = r5 | r10
            r9.s = r5
            int r5 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r5 == 0) goto L59
            an5 r5 = r9.q
            boolean r4 = r5.r(r4, r13)
            if (r4 == 0) goto L93
            bn4 r4 = r9.g
            java.util.HashMap r4 = r4.b
            java.lang.Object r4 = r4.get(r1)
            zm4 r4 = (defpackage.zm4) r4
            if (r4 == 0) goto L8f
            boolean r4 = defpackage.zm4.a(r4, r13)
            r4 = r4 ^ 1
            goto L90
        L8f:
            r4 = 0
        L90:
            if (r4 == 0) goto L93
            goto L59
        L93:
            r4 = 0
        L94:
            if (r4 == 0) goto L9d
            int r4 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r4 == 0) goto L9d
            r4 = r16
            goto L9e
        L9d:
            r4 = 0
        L9e:
            r7 = r7 & r4
            int r6 = r6 + 1
            goto L9
        La3:
            m29 r1 = r0.z0
            r1.b(r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t47.e(android.net.Uri, sb8, boolean):boolean");
    }

    @Override // defpackage.o29
    public final void f() throws ParserException {
        for (h67 h67Var : this.C0) {
            h67Var.u();
            if (h67Var.d1 && !h67Var.N0) {
                throw ParserException.a(null, "Loading finished before preparation is complete.");
            }
        }
    }

    public final h67 g(String str, int i, Uri[] uriArr, gf6[] gf6VarArr, gf6 gf6Var, List list, Map map, long j) {
        return new h67(str, i, this, new l47(this.a, this.b, uriArr, gf6VarArr, this.c, this.d, this.u0, list, this.y0), map, this.s0, j, gf6Var, this.o, this.X, this.Y, this.Z, this.x0);
    }

    @Override // defpackage.o29
    public final long h(long j) {
        h67[] h67VarArr = this.D0;
        if (h67VarArr.length > 0) {
            boolean zG = h67VarArr[0].G(j, false);
            int i = 1;
            while (true) {
                h67[] h67VarArr2 = this.D0;
                if (i >= h67VarArr2.length) {
                    break;
                }
                h67VarArr2[i].G(j, zG);
                i++;
            }
            if (zG) {
                ((SparseArray) this.u0.a).clear();
            }
        }
        return j;
    }

    @Override // defpackage.iee
    public final boolean j() {
        return this.F0.j();
    }

    @Override // defpackage.o29
    public final long k() {
        return -9223372036854775807L;
    }

    @Override // defpackage.o29
    public final mfg l() {
        mfg mfgVar = this.B0;
        mfgVar.getClass();
        return mfgVar;
    }

    public final void m() {
        int i = this.A0 - 1;
        this.A0 = i;
        if (i > 0) {
            return;
        }
        int i2 = 0;
        for (h67 h67Var : this.C0) {
            h67Var.c();
            i2 += h67Var.S0.a;
        }
        kfg[] kfgVarArr = new kfg[i2];
        int i3 = 0;
        for (h67 h67Var2 : this.C0) {
            h67Var2.c();
            int i4 = h67Var2.S0.a;
            int i5 = 0;
            while (i5 < i4) {
                h67Var2.c();
                kfgVarArr[i3] = h67Var2.S0.a(i5);
                i5++;
                i3++;
            }
        }
        this.B0 = new mfg(kfgVarArr);
        this.z0.c(this);
    }

    @Override // defpackage.iee
    public final long o() {
        return this.F0.o();
    }

    @Override // defpackage.iee
    public final void p(long j) {
        this.F0.p(j);
    }

    @Override // defpackage.o29
    public final long v(long j, j9e j9eVar) {
        h67[] h67VarArr = this.D0;
        int length = h67VarArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            h67 h67Var = h67VarArr[i];
            if (h67Var.K0 == 2) {
                l47 l47Var = h67Var.d;
                bn4 bn4Var = l47Var.g;
                int iB = l47Var.q.b();
                Uri[] uriArr = l47Var.e;
                h57 h57VarA = (iB >= uriArr.length || iB == -1) ? null : bn4Var.a(uriArr[l47Var.q.i()], true);
                if (h57VarA != null) {
                    wg7 wg7Var = h57VarA.r;
                    if (!wg7Var.isEmpty() && h57VarA.c) {
                        long j2 = h57VarA.h - bn4Var.Y;
                        long j3 = j - j2;
                        int iD = xxg.d(Long.valueOf(j3), wg7Var, true);
                        long j4 = ((c57) wg7Var.get(iD)).o;
                        return j9eVar.a(j3, j4, iD != wg7Var.size() - 1 ? ((c57) wg7Var.get(iD + 1)).o : j4) + j2;
                    }
                }
            } else {
                i++;
            }
        }
        return j;
    }

    @Override // defpackage.o29
    public final void y(long j) {
        for (h67 h67Var : this.D0) {
            if (h67Var.M0 && !h67Var.s()) {
                int length = h67Var.F0.length;
                for (int i = 0; i < length; i++) {
                    h67Var.F0[i].g(j, h67Var.X0[i]);
                }
            }
        }
    }

    @Override // defpackage.iee
    public final boolean z(long j) {
        if (this.B0 != null) {
            return this.F0.z(j);
        }
        for (h67 h67Var : this.C0) {
            if (!h67Var.N0) {
                h67Var.z(h67Var.Z0);
            }
        }
        return false;
    }
}
