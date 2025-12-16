package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/* loaded from: classes2.dex */
public final class o7e {
    public static final gha b = new gha();
    public final k18 a;

    public o7e(k18 k18Var) {
        this.a = k18Var;
    }

    public static List c(ArrayList arrayList, List list) {
        int i = 5;
        return (List) list.stream().filter(new m7e(arrayList, (Set) arrayList.stream().filter(new kk8(19)).map(new xga(i)).collect(Collectors.toCollection(new ik(i))), (Set) arrayList.stream().filter(new kk8(20)).map(new xga(6)).collect(Collectors.toCollection(new ik(5))), 0)).collect(Collectors.toList());
    }

    public static boolean f(jqc jqcVar, List list, List list2, List list3) {
        qb2 qb2Var = jqcVar.a;
        r04 r04Var = jqcVar.c;
        if (qb2Var != null) {
            return list2.contains(Long.valueOf(qb2Var.a));
        }
        if (r04Var == null) {
            return false;
        }
        gx3 gx3Var = r04Var.a;
        return jqi.a(list, new t00(gx3Var.a, 14)) || list3.contains(Long.valueOf(gx3Var.a));
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0050 A[ADDED_TO_REGION, FALL_THROUGH, REMOVE, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean j(char r2) {
        /*
            boolean r0 = java.lang.Character.isWhitespace(r2)
            r1 = 1
            if (r0 == 0) goto L8
            return r1
        L8:
            r0 = 91
            if (r2 == r0) goto L50
            r0 = 123(0x7b, float:1.72E-43)
            if (r2 == r0) goto L50
            r0 = 160(0xa0, float:2.24E-43)
            if (r2 == r0) goto L50
            r0 = 8239(0x202f, float:1.1545E-41)
            if (r2 == r0) goto L50
            r0 = 8287(0x205f, float:1.1613E-41)
            if (r2 == r0) goto L50
            r0 = 8470(0x2116, float:1.1869E-41)
            if (r2 == r0) goto L50
            r0 = 12288(0x3000, float:1.7219E-41)
            if (r2 == r0) goto L50
            r0 = 93
            if (r2 == r0) goto L50
            r0 = 94
            if (r2 == r0) goto L50
            r0 = 125(0x7d, float:1.75E-43)
            if (r2 == r0) goto L50
            r0 = 126(0x7e, float:1.77E-43)
            if (r2 == r0) goto L50
            r0 = 8232(0x2028, float:1.1535E-41)
            if (r2 == r0) goto L50
            r0 = 8233(0x2029, float:1.1537E-41)
            if (r2 == r0) goto L50
            switch(r2) {
                case 33: goto L50;
                case 34: goto L50;
                case 35: goto L50;
                default: goto L3f;
            }
        L3f:
            switch(r2) {
                case 40: goto L50;
                case 41: goto L50;
                case 42: goto L50;
                default: goto L42;
            }
        L42:
            switch(r2) {
                case 44: goto L50;
                case 45: goto L50;
                case 46: goto L50;
                case 47: goto L50;
                default: goto L45;
            }
        L45:
            switch(r2) {
                case 58: goto L50;
                case 59: goto L50;
                case 60: goto L50;
                default: goto L48;
            }
        L48:
            switch(r2) {
                case 62: goto L50;
                case 63: goto L50;
                case 64: goto L50;
                default: goto L4b;
            }
        L4b:
            switch(r2) {
                case 8192: goto L50;
                case 8193: goto L50;
                case 8194: goto L50;
                case 8195: goto L50;
                case 8196: goto L50;
                case 8197: goto L50;
                case 8198: goto L50;
                case 8199: goto L50;
                case 8200: goto L50;
                case 8201: goto L50;
                case 8202: goto L50;
                case 8203: goto L50;
                case 8204: goto L50;
                case 8205: goto L50;
                default: goto L4e;
            }
        L4e:
            r2 = 0
            return r2
        L50:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o7e.j(char):boolean");
    }

    public static int k(String str, int i, String str2, boolean z) {
        int i2 = 0;
        int i3 = 0;
        while (i2 < str.length() && i3 < i) {
            if (Character.isLetter(str.charAt(i2))) {
                boolean z2 = false;
                int i4 = i3;
                int i5 = i2;
                while (i2 < Math.min(i5 + 3, str.length()) && !z2) {
                    int i6 = i2 + 1;
                    String strL = l(str.substring(i5, i6));
                    int i7 = i4;
                    while (true) {
                        if (i7 < Math.min(i4 + 3, str2.length())) {
                            int i8 = i7 + 1;
                            if (!strL.equals(str2.substring(i4, i8))) {
                                i7 = i8;
                            } else {
                                if (z && i4 + 1 >= i) {
                                    return i5;
                                }
                                i5 = i2;
                                z2 = true;
                                i4 = i7;
                            }
                        }
                    }
                    i2 = i6;
                }
                if (!z2) {
                    StringBuilder sbL = wy1.l("cannot correctly find composed index: original ", str, ", query = ", str2, ", index = ");
                    sbL.append(str2);
                    wqi.e("o7e", sbL.toString(), null);
                    return -1;
                }
                i2 = i5;
                i3 = i4;
            }
            i2++;
            i3++;
        }
        return i2;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:66:0x00d2. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0139  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String l(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 996
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o7e.l(java.lang.String):java.lang.String");
    }

    public final u6e a(pb2 pb2Var, String str) {
        List listE = e(pb2Var.s(), str);
        if (listE.isEmpty()) {
            String strB = m6g.b(pb2Var.b.I);
            if (!l8g.c(strB)) {
                listE = e(strB, str);
            }
            ku3 ku3VarN = pb2Var.n();
            if (listE.isEmpty() && ku3VarN != null) {
                listE = b(ku3VarN, str).c;
            }
        }
        return u6e.a(pb2Var, listE);
    }

    public final u6e b(ku3 ku3Var, String str) {
        int i = 5;
        List list = (List) new vk3(i, new lta[]{new ora(vqa.i(ku3Var.k()), new ycd(8), i), vqa.k(ku3Var.l())}).h(pdf.b, 2).g(new ycd(9)).s().e();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.addAll(e((String) it.next(), str));
        }
        return new u6e(4, null, arrayList, null, ku3Var, null, 0L, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List d(java.lang.String r7, java.util.List r8) {
        /*
            r6 = this;
            boolean r0 = defpackage.l8g.c(r7)
            if (r0 == 0) goto L9
            java.util.List r7 = java.util.Collections.EMPTY_LIST
            return r7
        L9:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r8 = r8.iterator()
        L12:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L97
            java.lang.Object r1 = r8.next()
            java.lang.String r1 = (java.lang.String) r1
            boolean r2 = defpackage.l8g.c(r1)
            if (r2 == 0) goto L25
            goto L12
        L25:
            java.lang.String r2 = r7.toLowerCase()
            java.lang.String r3 = r1.toLowerCase()
            r4 = 0
            int r2 = r2.indexOf(r3, r4)
        L32:
            if (r2 < 0) goto L12
            int r3 = r7.length()
            if (r2 >= r3) goto L12
            if (r2 == 0) goto L7b
            int r3 = r2 + (-1)
            char r4 = r7.charAt(r3)
            boolean r4 = j(r4)
            if (r4 != 0) goto L7b
            char r4 = r7.charAt(r2)
            boolean r4 = j(r4)
            if (r4 != 0) goto L7b
            if (r2 < 0) goto L88
            int r4 = r7.length()
            if (r2 < r4) goto L5b
            goto L88
        L5b:
            k18 r4 = r6.a
            java.lang.Object r5 = r4.getValue()
            f7b r5 = (defpackage.f7b) r5
            qb5 r5 = r5.j
            boolean r3 = r5.a(r3, r7)
            if (r3 != 0) goto L7b
            java.lang.Object r3 = r4.getValue()
            f7b r3 = (defpackage.f7b) r3
            int r4 = r2 + (-2)
            qb5 r3 = r3.j
            boolean r3 = r3.a(r4, r7)
            if (r3 == 0) goto L88
        L7b:
            n7e r3 = new n7e
            int r4 = r1.length()
            int r4 = r4 + r2
            r3.<init>(r2, r4)
            r0.add(r3)
        L88:
            int r2 = r2 + 1
            java.lang.String r3 = r7.toLowerCase()
            java.lang.String r4 = r1.toLowerCase()
            int r2 = r3.indexOf(r4, r2)
            goto L32
        L97:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o7e.d(java.lang.String, java.util.List):java.util.List");
    }

    public final List e(String str, String str2) {
        int iK;
        int iK2;
        if (l8g.c(str) || l8g.c(str2)) {
            return Collections.EMPTY_LIST;
        }
        HashSet hashSet = new HashSet();
        String[] strArrM = m(str);
        String[] strArrM2 = m(str2);
        for (String str3 : strArrM) {
            String strL = l(str3);
            for (String str4 : strArrM2) {
                if (str3.regionMatches(true, 0, str4, 0, str4.length())) {
                    hashSet.add(str4);
                } else {
                    String strL2 = l(str4);
                    if (strL.startsWith(strL2) && (iK = k(str3, 0, strL, true)) >= 0 && (iK2 = k(str3, strL2.length(), strL, false)) > iK) {
                        hashSet.add(str3.substring(iK, iK2));
                    }
                }
            }
        }
        return new ArrayList(hashSet);
    }

    public final boolean g(pb2 pb2Var, String str) {
        if (i(pb2Var.s(), str) || i(m6g.a(pb2Var.b.I), str)) {
            return true;
        }
        return pb2Var.n() != null && h(pb2Var.n(), str);
    }

    public final boolean h(ku3 ku3Var, String str) {
        if (l8g.c(str)) {
            return true;
        }
        List listK = ku3Var.k();
        String strL = ku3Var.l();
        if (l8g.c(str)) {
            return true;
        }
        cn4 cn4Var = new cn4(this, 3, str);
        if (cn4Var.test(m6g.a(strL))) {
            return true;
        }
        return listK.stream().map(new xga(7)).anyMatch(cn4Var);
    }

    public final boolean i(String str, String str2) {
        if (!l8g.c(str2)) {
            String strTrim = str.trim();
            String[] strArrM = m(str2.trim());
            if (strArrM.length != 0) {
                String[] strArr = new String[strArrM.length];
                for (int i = 0; i < strArrM.length; i++) {
                    strArr[i] = l(strArrM[i]);
                }
                String[] strArrM2 = m(strTrim);
                for (int i2 = 0; i2 < strArrM.length; i2++) {
                    String str3 = strArrM[i2];
                    String str4 = strArr[i2];
                    boolean z = false;
                    for (String str5 : strArrM2) {
                        if (str5.regionMatches(true, 0, str3, 0, str3.length()) || l(str5).startsWith(str4)) {
                            z = true;
                        }
                    }
                    if (z) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final String[] m(String str) {
        return m6g.c(str, (f7b) this.a.getValue());
    }
}
