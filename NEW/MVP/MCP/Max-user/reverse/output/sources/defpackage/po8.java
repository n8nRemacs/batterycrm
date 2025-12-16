package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public abstract class po8 {
    public static final /* synthetic */ int a = 0;

    public static int a(jdc jdcVar) {
        if (jdcVar != null) {
            if (jdcVar.p() == 1) {
                w10 w10VarO = jdcVar.o(0);
                switch (w10VarO.a.ordinal()) {
                    case 1:
                    case 8:
                    case 10:
                    case 11:
                    case 13:
                        break;
                    case 2:
                        return 1;
                    case 3:
                        return w10VarO.d.b == 2 ? 11 : 3;
                    case 4:
                        return 2;
                    case 5:
                        return 10;
                    case 6:
                        return 5;
                    case 7:
                        return 8;
                    case 9:
                        return 7;
                    case Protos.Attaches.Attach.PRESENT /* 12 */:
                        return 9;
                    default:
                        wqi.e("po8", "new attach type " + jdcVar.o(0).a + " in calcMediaType method. developer, please add mapping logic for it", null);
                        return 0;
                }
            } else if (jdcVar.p() > 1) {
                return 4;
            }
        }
        return 0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ff  */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.xy b(defpackage.w10 r32) {
        /*
            Method dump skipped, instructions count: 692
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.po8.b(w10):xy");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0067  */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v6, types: [s7c] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.w10 c(defpackage.xy r16, defpackage.m4e r17, long r18, long r20) {
        /*
            Method dump skipped, instructions count: 1822
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.po8.c(xy, m4e, long, long):w10");
    }

    public static sz d(jdc jdcVar) {
        int i;
        int i2;
        xw0 xw0Var;
        if (jdcVar == null) {
            return null;
        }
        sz szVar = new sz();
        Iterator it = ((List) jdcVar.b).iterator();
        while (it.hasNext()) {
            xy xyVarB = b((w10) it.next());
            if (xyVarB != null) {
                szVar.add(xyVarB);
            }
        }
        yl7 yl7Var = (yl7) jdcVar.c;
        if (yl7Var != null) {
            jz7 jz7Var = new jz7();
            ArrayList arrayList = yl7Var.a;
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ex0 ex0Var = (ex0) it2.next();
                ArrayList arrayList3 = new ArrayList();
                arrayList2.add(arrayList3);
                Iterator<E> it3 = ex0Var.iterator();
                while (it3.hasNext()) {
                    yw0 yw0Var = (yw0) it3.next();
                    String str = yw0Var.b.a;
                    xw0[] xw0VarArr = xw0.c;
                    int length = xw0VarArr.length;
                    int i3 = 0;
                    while (true) {
                        if (i3 >= length) {
                            xw0Var = xw0.UNKNOWN;
                            break;
                        }
                        xw0Var = xw0VarArr[i3];
                        if (xw0Var.a.equalsIgnoreCase(str)) {
                            break;
                        }
                        i3++;
                    }
                    ww0 ww0Var = ww0.UNKNOWN;
                    int iV = az1.v(yw0Var.c);
                    if (iV == 0) {
                        ww0Var = ww0.DEFAULT;
                    } else if (iV == 1) {
                        ww0Var = ww0.POSITIVE;
                    } else if (iV == 2) {
                        ww0Var = ww0.NEGATIVE;
                    }
                    ag agVar = new ag();
                    agVar.c = xw0Var;
                    agVar.e = ww0Var;
                    agVar.d = yw0Var.a;
                    agVar.f = yw0Var.d;
                    agVar.g = yw0Var.o;
                    agVar.a = yw0Var.X;
                    agVar.b = yw0Var.Y;
                    arrayList3.add(new zw0(agVar));
                }
            }
            jz7Var.a = arrayList2;
            szVar.add(new zl7(new lz7(jz7Var), yl7Var.b, false, false));
        }
        imd imdVar = (imd) jdcVar.d;
        if (imdVar != null) {
            ArrayList arrayList4 = imdVar.a;
            ArrayList arrayList5 = new ArrayList();
            Iterator it4 = arrayList4.iterator();
            while (it4.hasNext()) {
                hmd hmdVar = (hmd) it4.next();
                ArrayList arrayList6 = new ArrayList();
                arrayList5.add(arrayList6);
                Iterator<E> it5 = hmdVar.iterator();
                while (it5.hasNext()) {
                    fmd fmdVar = (fmd) it5.next();
                    String strG = utb.g(fmdVar.a);
                    int[] iArrY = az1.y(5);
                    int length2 = iArrY.length;
                    int i4 = 0;
                    while (true) {
                        if (i4 >= length2) {
                            i = 0;
                            break;
                        }
                        i = iArrY[i4];
                        if (utb.h(i).equals(strG)) {
                            break;
                        }
                        i4++;
                    }
                    int i5 = i == 0 ? 5 : i;
                    int iV2 = az1.v(fmdVar.b);
                    if (iV2 == 0) {
                        i2 = 1;
                    } else if (iV2 != 1) {
                        i2 = iV2 != 2 ? 4 : 3;
                    } else {
                        i2 = 2;
                    }
                    arrayList6.add(new gmd(i5, i2, fmdVar.c, w(fmdVar.d), null));
                }
            }
            szVar.add(new kmd(imdVar.b, new jmd(arrayList5), false, false));
        }
        return szVar;
    }

    public static jdc e(sz szVar, m4e m4eVar) {
        return f(szVar, m4eVar, 0L, 0L, null);
    }

    public static jdc f(sz szVar, m4e m4eVar, long j, long j2, iu3 iu3Var) {
        Iterator it;
        Iterator it2;
        int i;
        long j3;
        x10 x10Var = new x10();
        if (szVar == null) {
            return x10Var.c();
        }
        Iterator it3 = szVar.iterator();
        while (it3.hasNext()) {
            xy xyVar = (xy) it3.next();
            int iOrdinal = xyVar.a.ordinal();
            if (iOrdinal == 12) {
                it = it3;
                x10Var.b = u((zl7) xyVar);
            } else if (iOrdinal != 14) {
                x10Var.a(c(xyVar, m4eVar, j, j2));
                it = it3;
            } else {
                kmd kmdVar = (kmd) xyVar;
                jmd jmdVar = kmdVar.o;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                Iterator it4 = jmdVar.a.iterator();
                while (it4.hasNext()) {
                    List<gmd> list = (List) it4.next();
                    hmd hmdVar = new hmd();
                    arrayList.add(hmdVar);
                    for (gmd gmdVar : list) {
                        int i2 = gmdVar.a;
                        wjb wjbVar = gmdVar.o;
                        String strH = utb.h(i2);
                        int[] iArrY = az1.y(5);
                        int length = iArrY.length;
                        int i3 = 0;
                        int i4 = 0;
                        while (true) {
                            if (i4 >= length) {
                                it2 = it3;
                                break;
                            }
                            int i5 = iArrY[i4];
                            it2 = it3;
                            if (utb.g(i5).equals(strH)) {
                                i3 = i5;
                                break;
                            }
                            i4++;
                            it3 = it2;
                        }
                        int i6 = i3 == 0 ? 5 : i3;
                        int iV = az1.v(gmdVar.b);
                        int i7 = 1;
                        if (iV == 0) {
                            i = i7;
                        } else if (iV != 1) {
                            i7 = iV != 2 ? 4 : 3;
                            i = i7;
                        } else {
                            i = 2;
                        }
                        uub uubVar = gmdVar.d;
                        k10 k10Var = uubVar != null ? v(uubVar, null).b : null;
                        if (wjbVar != null) {
                            arrayList2.add(wjbVar);
                            j3 = wjbVar.a;
                        } else {
                            j3 = -1;
                        }
                        hmdVar.add(new fmd(i6, i, gmdVar.c, k10Var, j3));
                        it3 = it2;
                    }
                }
                it = it3;
                if (iu3Var != null) {
                    iu3Var.accept(arrayList2);
                }
                x10Var.c = new imd(arrayList, kmdVar.d);
            }
            it3 = it;
        }
        return x10Var.c();
    }

    public static hf2 g(fy2 fy2Var, hf2 hf2Var) {
        hf2 hf2Var2 = hf2.h;
        gf2 gf2Var = new gf2();
        gf2Var.a = fy2Var.b;
        Long l = fy2Var.c;
        if (l != null) {
            gf2Var.e = l.longValue();
        }
        ArrayList arrayList = fy2Var.a;
        ArrayList arrayList2 = new ArrayList();
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                int iOrdinal = ((jt2) it.next()).ordinal();
                if (iOrdinal == 0) {
                    arrayList2.add(ef2.a);
                } else if (iOrdinal == 1) {
                    arrayList2.add(ef2.b);
                } else if (iOrdinal == 2) {
                    arrayList2.add(ef2.c);
                }
            }
        }
        if (gf2Var.b == null) {
            gf2Var.b = new ArrayList();
        }
        gf2Var.b.addAll(arrayList2);
        gf2Var.c = hf2Var.c;
        gf2Var.d = hf2Var.d;
        gf2Var.f = hf2Var.f;
        gf2Var.g = hf2Var.g;
        return new hf2(gf2Var);
    }

    public static ArrayList h(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zz3 zz3Var = (zz3) it.next();
            String str = zz3Var.a;
            String str2 = zz3Var.c;
            int iOrdinal = zz3Var.b.ordinal();
            arrayList.add(new tv3(str, iOrdinal != 0 ? iOrdinal != 2 ? iOrdinal != 3 ? null : sv3.d : sv3.c : sv3.a, str2));
        }
        return arrayList;
    }

    public static ArrayList i(List list) {
        ArrayList arrayList = new ArrayList();
        if (!jqi.f(list)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                rcd rcdVar = (rcd) it.next();
                qcd qcdVar = rcdVar.b;
                String str = rcdVar.c;
                if (qcdVar == qcd.c && l8g.d(str)) {
                    arrayList.add(new wb5(str));
                } else if (rcdVar.b == qcd.d) {
                    long j = rcdVar.a;
                    if (j != 0) {
                        arrayList.add(new aj(j));
                    }
                }
            }
        }
        return arrayList;
    }

    public static b8c j(c8c c8cVar) {
        if (c8cVar == null) {
            return b8c.c;
        }
        int i = c8cVar.b;
        int iOrdinal = c8cVar.a.ordinal();
        return new b8c(iOrdinal != 1 ? iOrdinal != 2 ? 0 : 40 : 50, i);
    }

    public static c8c k(b8c b8cVar) {
        int i = b8cVar.b;
        int i2 = b8cVar.a;
        return new c8c(i2 != 40 ? i2 != 50 ? j8c.a : j8c.b : j8c.c, i);
    }

    public static HashMap l(Map map) {
        HashMap map2 = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            map2.put((Long) entry.getKey(), j((c8c) entry.getValue()));
        }
        return map2;
    }

    public static ArrayList m(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ef2 ef2Var = (ef2) it.next();
            if (ef2Var == ef2.a) {
                arrayList.add(jt2.SOUND);
            } else if (ef2Var == ef2.b) {
                arrayList.add(jt2.VIBRATION);
            } else if (ef2Var == ef2.c) {
                arrayList.add(jt2.LED);
            }
        }
        return arrayList;
    }

    public static ArrayList n(List list, m4e m4eVar) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                tcd tcdVar = (tcd) it.next();
                int i = tcdVar.a;
                long j = tcdVar.b;
                int iV = az1.v(i);
                if (iV == 1) {
                    arrayList.add(new pff(tcdVar.c, j));
                } else if (iV != 2) {
                    Locale locale = Locale.ENGLISH;
                    wqi.e("po8", "Unknown RecentItem " + tcdVar, null);
                } else {
                    arrayList.add(new gu6(v(tcdVar.d, m4eVar).b, j));
                }
            }
        }
        return arrayList;
    }

    public static jm9 o(km9 km9Var) {
        int iOrdinal;
        jm9 jm9Var = jm9.ACTIVE;
        return (km9Var == null || (iOrdinal = km9Var.ordinal()) == 0) ? jm9Var : iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? jm9Var : jm9.DELAYED_FIRE_ERROR : jm9.DELETED : jm9.EDITED;
    }

    public static jef p(kef kefVar) {
        q10 q10Var = new q10();
        q10Var.a = kefVar.a;
        q10Var.b = kefVar.b;
        q10Var.c = kefVar.c;
        q10Var.d = kefVar.d;
        q10Var.e = kefVar.e;
        q10Var.f = kefVar.f;
        q10Var.g = kefVar.g;
        q10Var.h = kefVar.h;
        q10Var.i = kefVar.i;
        int iV = az1.v(kefVar.j);
        int i = 3;
        q10Var.j = iV != 1 ? iV != 2 ? iV != 3 ? 1 : 4 : 3 : 2;
        q10Var.k = kefVar.k;
        q10Var.l = kefVar.l;
        q10Var.m = kefVar.m;
        int iV2 = az1.v(kefVar.n);
        if (iV2 == 1) {
            i = 2;
        } else if (iV2 != 2) {
            i = 1;
        }
        q10Var.n = i;
        q10Var.o = kefVar.o;
        return q10Var.b();
    }

    public static r10 q(jef jefVar) {
        q10 q10Var = new q10();
        q10Var.a = jefVar.a;
        q10Var.d = jefVar.d;
        q10Var.b = jefVar.b;
        q10Var.c = jefVar.c;
        q10Var.f = jefVar.X;
        q10Var.g = jefVar.Y;
        q10Var.i = jefVar.s0;
        q10Var.h = jefVar.Z;
        q10Var.e = jefVar.o;
        int iV = az1.v(jefVar.t0);
        int i = 3;
        q10Var.j = iV != 1 ? iV != 2 ? iV != 3 ? 1 : 4 : 3 : 2;
        q10Var.k = jefVar.u0;
        q10Var.l = jefVar.v0;
        q10Var.m = jefVar.w0;
        int iV2 = az1.v(jefVar.x0);
        if (iV2 == 1) {
            i = 2;
        } else if (iV2 != 2) {
            i = 1;
        }
        q10Var.n = i;
        q10Var.o = jefVar.y0;
        return q10Var.a();
    }

    public static gx3 r(ku3 ku3Var) {
        long j;
        int i;
        int i2;
        String str;
        lz7 lz7Var;
        long jP = ku3Var.p();
        aw3 aw3Var = ku3Var.a;
        zv3 zv3Var = aw3Var.b;
        long j2 = zv3Var.g;
        String str2 = zv3Var.c;
        String str3 = zv3Var.d;
        List<tv3> list = zv3Var.f;
        ArrayList arrayList = new ArrayList();
        for (tv3 tv3Var : list) {
            String str4 = tv3Var.a;
            String str5 = tv3Var.b;
            int iOrdinal = tv3Var.c.ordinal();
            yz3 yz3Var = yz3.c;
            yz3 yz3Var2 = iOrdinal != 0 ? iOrdinal != 2 ? iOrdinal != 3 ? null : yz3Var : yz3.b : yz3.a;
            if (yz3Var2 == null) {
                yz3Var2 = yz3Var;
            }
            arrayList.add(new zz3(str4, yz3Var2, str5));
        }
        long j3 = zv3Var.e;
        long j4 = zv3Var.h;
        xv3 xv3Var = aw3Var.b.i;
        int i3 = 1;
        if (xv3Var == null) {
            i = 0;
            j = jP;
        } else {
            j = jP;
            int iOrdinal2 = xv3Var.ordinal();
            if (iOrdinal2 == 0) {
                i = 1;
            } else {
                if (iOrdinal2 != 1) {
                    throw new IllegalArgumentException("No such value for " + xv3Var + " in ContactStatus");
                }
                i = 2;
            }
        }
        int i4 = aw3Var.b.l;
        int iV = az1.v(i4);
        if (iV == 0) {
            i2 = 1;
        } else if (iV == 1) {
            i2 = 2;
        } else {
            if (iV != 2) {
                throw new IllegalArgumentException("No such value for " + hf3.k(i4) + " in ContactInfo.Gender");
            }
            i2 = 3;
        }
        List list2 = zv3Var.n;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            int iOrdinal3 = ((vv3) it.next()).ordinal();
            if (iOrdinal3 == 0) {
                arrayList2.add(fx3.OFFICIAL);
            } else if (iOrdinal3 == i3) {
                arrayList2.add(fx3.BOT);
            } else if (iOrdinal3 == 2) {
                arrayList2.add(fx3.SERVICE_ACCOUNT);
            } else if (iOrdinal3 == 3) {
                arrayList2.add(fx3.HAS_WEBAPP);
            } else if (iOrdinal3 == 4) {
                arrayList2.add(fx3.RESTRICTED);
            } else if (iOrdinal3 == 5) {
                arrayList2.add(fx3.NO_FORWARD);
            }
            i3 = 1;
        }
        String str6 = zv3Var.o;
        String str7 = zv3Var.p;
        String str8 = zv3Var.q;
        uv3 uv3Var = zv3Var.u;
        if (uv3Var == null) {
            str = str8;
            lz7Var = null;
        } else {
            str = str8;
            lz7Var = new lz7(uv3Var.a);
        }
        return new gx3(j, j2, str2, str3, arrayList, j3, j4, i, i2, arrayList2, str6, str7, str, lz7Var, zv3Var.v);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList s(java.util.List r13) {
        /*
            r0 = 0
            if (r13 != 0) goto L4
            return r0
        L4:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r13 = r13.iterator()
        Ld:
            boolean r2 = r13.hasNext()
            if (r2 == 0) goto L68
            java.lang.Object r2 = r13.next()
            aj9 r2 = (defpackage.aj9) r2
            if (r2 != 0) goto L1c
            goto Ld
        L1c:
            java.util.Map r3 = r2.X
            ej9 r4 = r2.c
            int r4 = r4.ordinal()
            switch(r4) {
                case 1: goto L4a;
                case 2: goto L47;
                case 3: goto L44;
                case 4: goto L41;
                case 5: goto L3e;
                case 6: goto L3b;
                case 7: goto L38;
                case 8: goto L35;
                case 9: goto L32;
                case 10: goto L2f;
                case 11: goto L2c;
                case 12: goto L28;
                default: goto L27;
            }
        L27:
            goto Ld
        L28:
            bj9 r4 = defpackage.bj9.v0
        L2a:
            r9 = r4
            goto L4d
        L2c:
            bj9 r4 = defpackage.bj9.u0
            goto L2a
        L2f:
            bj9 r4 = defpackage.bj9.Z
            goto L2a
        L32:
            bj9 r4 = defpackage.bj9.t0
            goto L2a
        L35:
            bj9 r4 = defpackage.bj9.s0
            goto L2a
        L38:
            bj9 r4 = defpackage.bj9.Y
            goto L2a
        L3b:
            bj9 r4 = defpackage.bj9.X
            goto L2a
        L3e:
            bj9 r4 = defpackage.bj9.o
            goto L2a
        L41:
            bj9 r4 = defpackage.bj9.d
            goto L2a
        L44:
            bj9 r4 = defpackage.bj9.c
            goto L2a
        L47:
            bj9 r4 = defpackage.bj9.b
            goto L2a
        L4a:
            bj9 r4 = defpackage.bj9.a
            goto L2a
        L4d:
            cj9 r5 = new cj9
            long r6 = r2.a
            java.lang.String r8 = r2.b
            short r10 = r2.d
            short r11 = r2.o
            if (r3 != 0) goto L5b
            r12 = r0
            goto L61
        L5b:
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>(r3)
            r12 = r2
        L61:
            r5.<init>(r6, r8, r9, r10, r11, r12)
            r1.add(r5)
            goto Ld
        L68:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.po8.s(java.util.List):java.util.ArrayList");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009a  */
    /* JADX WARN: Type inference failed for: r2v16, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v19, types: [java.util.HashMap] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList t(java.util.List r12) {
        /*
            if (r12 != 0) goto L4
            r12 = 0
            return r12
        L4:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r12 = r12.iterator()
        Ld:
            boolean r1 = r12.hasNext()
            if (r1 == 0) goto La5
            java.lang.Object r1 = r12.next()
            cj9 r1 = (defpackage.cj9) r1
            bj9 r2 = r1.c
            int r2 = r2.ordinal()
            switch(r2) {
                case 0: goto L45;
                case 1: goto L42;
                case 2: goto L3f;
                case 3: goto L3c;
                case 4: goto L39;
                case 5: goto L36;
                case 6: goto L33;
                case 7: goto L30;
                case 8: goto L2d;
                case 9: goto L2a;
                case 10: goto L27;
                case 11: goto L23;
                default: goto L22;
            }
        L22:
            goto Ld
        L23:
            ej9 r2 = defpackage.ej9.w0
        L25:
            r7 = r2
            goto L48
        L27:
            ej9 r2 = defpackage.ej9.v0
            goto L25
        L2a:
            ej9 r2 = defpackage.ej9.t0
            goto L25
        L2d:
            ej9 r2 = defpackage.ej9.s0
            goto L25
        L30:
            ej9 r2 = defpackage.ej9.u0
            goto L25
        L33:
            ej9 r2 = defpackage.ej9.Z
            goto L25
        L36:
            ej9 r2 = defpackage.ej9.Y
            goto L25
        L39:
            ej9 r2 = defpackage.ej9.X
            goto L25
        L3c:
            ej9 r2 = defpackage.ej9.o
            goto L25
        L3f:
            ej9 r2 = defpackage.ej9.d
            goto L25
        L42:
            ej9 r2 = defpackage.ej9.c
            goto L25
        L45:
            ej9 r2 = defpackage.ej9.b
            goto L25
        L48:
            aj9 r3 = new aj9
            long r4 = r1.a
            java.lang.String r6 = r1.b
            int r2 = r1.d
            short r8 = (short) r2
            int r2 = r1.e
            short r9 = (short) r2
            java.util.Map r1 = r1.f
            if (r1 == 0) goto L9a
            int r2 = r1.size()
            if (r2 != 0) goto L5f
            goto L9a
        L5f:
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L6c:
            boolean r10 = r1.hasNext()
            if (r10 == 0) goto L98
            java.lang.Object r10 = r1.next()
            java.util.Map$Entry r10 = (java.util.Map.Entry) r10
            java.lang.Object r11 = r10.getValue()
            boolean r11 = r11 instanceof java.io.Serializable
            if (r11 == 0) goto L90
            java.lang.Object r11 = r10.getKey()
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r10 = r10.getValue()
            java.io.Serializable r10 = (java.io.Serializable) r10
            r2.put(r11, r10)
            goto L6c
        L90:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "attribute must be Serializable"
            r12.<init>(r0)
            throw r12
        L98:
            r10 = r2
            goto L9d
        L9a:
            java.util.Map r2 = java.util.Collections.EMPTY_MAP
            goto L98
        L9d:
            r3.<init>(r4, r6, r7, r8, r9, r10)
            r0.add(r3)
            goto Ld
        La5:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.po8.t(java.util.List):java.util.ArrayList");
    }

    public static yl7 u(zl7 zl7Var) {
        gx0 gx0Var;
        xl7 xl7Var = new xl7();
        ArrayList arrayList = (ArrayList) zl7Var.d.a;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            List<zw0> list = (List) it.next();
            ex0 ex0Var = new ex0();
            arrayList2.add(ex0Var);
            for (zw0 zw0Var : list) {
                String str = zw0Var.a.a;
                gx0[] gx0VarArr = gx0.t0;
                int length = gx0VarArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        gx0Var = gx0.UNKNOWN;
                        break;
                    }
                    gx0Var = gx0VarArr[i];
                    if (gx0Var.a.equalsIgnoreCase(str)) {
                        break;
                    }
                    i++;
                }
                int iOrdinal = zw0Var.c.ordinal();
                int i2 = 1;
                if (iOrdinal != 0) {
                    i2 = iOrdinal != 1 ? iOrdinal != 2 ? 4 : 3 : 2;
                }
                vw0 vw0Var = new vw0(zw0Var.b, gx0Var, i2);
                vw0Var.d = zw0Var.d;
                vw0Var.e = zw0Var.o;
                vw0Var.f = zw0Var.X;
                vw0Var.h = zw0Var.Y;
                ex0Var.add(new yw0(vw0Var));
            }
        }
        xl7Var.a = arrayList2;
        xl7Var.b = zl7Var.o;
        return new yl7(xl7Var);
    }

    public static w10 v(uub uubVar, m4e m4eVar) {
        k10 k10Var = k10.v0;
        j10 j10Var = new j10();
        String str = uubVar.d;
        byte[] bArr = uubVar.s0;
        if (str != null) {
            j10Var.a = str;
        }
        String str2 = uubVar.o;
        if (str2 != null) {
            j10Var.b = str2;
        }
        Integer num = uubVar.X;
        if (num != null) {
            j10Var.c = num.intValue();
        }
        Integer num2 = uubVar.Y;
        if (num2 != null) {
            j10Var.d = num2.intValue();
        }
        j10Var.e = uubVar.Z;
        if (bArr != null && bArr.length > 0) {
            try {
                m4eVar.getClass();
                j10Var.f = bArr;
            } catch (Throwable unused) {
                j10Var.f = bArr;
            }
        }
        Long l = uubVar.v0;
        if (l != null) {
            j10Var.h = l.longValue();
        }
        String str3 = uubVar.u0;
        if (str3 != null) {
            j10Var.i = str3;
        }
        String str4 = uubVar.t0;
        if (str4 != null) {
            j10Var.g = str4;
        }
        j10Var.k = uubVar.w0;
        k10 k10Var2 = new k10(j10Var);
        int i = w10.B;
        x00 x00Var = new x00();
        x00Var.l = UUID.randomUUID().toString();
        x00Var.a = s10.c;
        x00Var.n = uubVar.b;
        x00Var.z = uubVar.c;
        x00Var.b = k10Var2;
        return x00Var.a();
    }

    public static uub w(k10 k10Var) {
        if (k10Var == null) {
            return null;
        }
        String str = k10Var.a;
        String str2 = k10Var.u0;
        String str3 = k10Var.Y;
        String str4 = k10Var.s0;
        String str5 = k10Var.b;
        String str6 = !l8g.c(str) ? k10Var.a : null;
        String str7 = !l8g.c(str5) ? str5 : null;
        int i = k10Var.c;
        Integer numValueOf = i > 0 ? Integer.valueOf(i) : null;
        int i2 = k10Var.d;
        Integer numValueOf2 = i2 > 0 ? Integer.valueOf(i2) : null;
        boolean z = k10Var.o;
        byte[] bArr = k10Var.X;
        return new uub(str6, str7, numValueOf, numValueOf2, z, (bArr == null || bArr.length <= 0) ? null : bArr, Long.valueOf(k10Var.Z), !l8g.c(str4) ? str4 : null, !l8g.c(str3) ? str3 : null, false, false, !l8g.c(str2) ? str2 : null);
    }
}
