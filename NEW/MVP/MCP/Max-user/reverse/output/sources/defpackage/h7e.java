package defpackage;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* loaded from: classes2.dex */
public final class h7e implements k7e {
    public final ve2 a;
    public final qv3 b;
    public final o7e c;
    public final i7e d;
    public final k7e e;

    public h7e(ve2 ve2Var, qv3 qv3Var, o7e o7eVar, i7e i7eVar, j7e j7eVar) {
        this.a = ve2Var;
        this.b = qv3Var;
        this.c = o7eVar;
        this.d = i7eVar;
        this.e = j7eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0067 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // defpackage.k7e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List a(java.lang.String r10) {
        /*
            r9 = this;
            java.lang.String r1 = "Fts"
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            k7e r0 = r9.e
            if (r0 == 0) goto L12
            java.util.List r0 = r0.a(r10)
            r2.addAll(r0)
        L12:
            n8a r5 = new n8a     // Catch: java.lang.Throwable -> L58
            r0 = 0
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L58
            n8a r6 = new n8a     // Catch: java.lang.Throwable -> L58
            r6.<init>(r0)     // Catch: java.lang.Throwable -> L58
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L58
            r7.<init>()     // Catch: java.lang.Throwable -> L58
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L58
            r8.<init>()     // Catch: java.lang.Throwable -> L58
            r3 = r9
            r4 = r10
            r3.c(r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L51
            java.util.ArrayList r10 = r9.b(r4, r5, r6)     // Catch: java.lang.Throwable -> L51
            r2.addAll(r7)     // Catch: java.lang.Throwable -> L51
            r2.addAll(r10)     // Catch: java.lang.Throwable -> L51
            qv3 r10 = r3.b     // Catch: java.lang.Throwable -> L51
            z7c r10 = r10.g     // Catch: java.lang.Throwable -> L51
            pe8 r10 = r10.a     // Catch: java.lang.Throwable -> L51
            long r5 = r10.s()     // Catch: java.lang.Throwable -> L51
            int r10 = r2.size()     // Catch: java.lang.Throwable -> L51
            r0 = 1
            if (r10 <= r0) goto L54
            ip8 r10 = new ip8     // Catch: java.lang.Throwable -> L51
            r0 = 1
            r10.<init>(r5, r0)     // Catch: java.lang.Throwable -> L51
            defpackage.ze3.s(r10, r2)     // Catch: java.lang.Throwable -> L51
            goto L54
        L51:
            r0 = move-exception
        L52:
            r10 = r0
            goto L5c
        L54:
            r2.addAll(r8)     // Catch: java.lang.Throwable -> L51
            goto L61
        L58:
            r0 = move-exception
            r3 = r9
            r4 = r10
            goto L52
        L5c:
            java.lang.String r0 = "failure to search"
            defpackage.wqi.e(r1, r0, r10)
        L61:
            boolean r10 = r2.isEmpty()
            if (r10 == 0) goto L78
            i7e r10 = r3.d     // Catch: java.lang.Throwable -> L71
            java.util.List r10 = r10.a(r4)     // Catch: java.lang.Throwable -> L71
            r2.addAll(r10)     // Catch: java.lang.Throwable -> L71
            goto L78
        L71:
            r0 = move-exception
            r10 = r0
            java.lang.String r0 = "failure to search by fallback strategy"
            defpackage.wqi.e(r1, r0, r10)
        L78:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h7e.a(java.lang.String):java.util.List");
    }

    public final ArrayList b(String str, n8a n8aVar, n8a n8aVar2) {
        wl6 wl6VarE;
        dsd dsdVarC;
        Cursor cursorN;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3 = new ArrayList();
        ve2 ve2Var = this.a;
        jrd jrdVar = ((ie4) ve2Var.m.get()).b;
        jrdVar.getClass();
        boolean zF = vmf.F(str);
        List listD0 = hd5.a;
        if (!zF && (wl6VarE = xl6.e(str)) != null) {
            vl6 vl6Var = wl6VarE.a;
            vl6 vl6Var2 = vl6Var.c;
            vl6 vl6Var3 = wl6VarE.b;
            vl6 vl6Var4 = vl6Var3.c;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            String str2 = vl6Var.a;
            String str3 = vl6Var.b;
            if (vl6Var2 != null) {
                m03 m03VarC = jrdVar.c();
                String str4 = vl6Var2.a;
                String str5 = vl6Var2.b;
                lrd lrdVar = m03VarC.a;
                dsdVarC = dsd.c(4, "SELECT docid FROM chat_title WHERE originalTitle MATCH ? OR normalizedTitle MATCH ? OR normalizedTitleWithoutEmoji MATCH ? OR originalTitleWithoutEmoji MATCH ? || '*' ORDER BY sortTime DESC ");
                if (str3 == null) {
                    dsdVarC.S(1);
                } else {
                    dsdVarC.f(1, str3);
                }
                if (str2 == null) {
                    dsdVarC.S(2);
                } else {
                    dsdVarC.f(2, str2);
                }
                if (str4 == null) {
                    dsdVarC.S(3);
                } else {
                    dsdVarC.f(3, str4);
                }
                if (str5 == null) {
                    dsdVarC.S(4);
                } else {
                    dsdVarC.f(4, str5);
                }
                lrdVar.b();
                cursorN = lrdVar.n(dsdVarC);
                try {
                    arrayList = new ArrayList(cursorN.getCount());
                    while (cursorN.moveToNext()) {
                        arrayList.add(cursorN.isNull(0) ? null : Long.valueOf(cursorN.getLong(0)));
                    }
                    cursorN.close();
                    dsdVarC.y();
                } finally {
                }
            } else {
                lrd lrdVar2 = jrdVar.c().a;
                dsdVarC = dsd.c(2, "SELECT docid FROM chat_title WHERE originalTitle MATCH ? OR normalizedTitle MATCH ? || '*' ORDER BY sortTime DESC ");
                if (str3 == null) {
                    dsdVarC.S(1);
                } else {
                    dsdVarC.f(1, str3);
                }
                if (str2 == null) {
                    dsdVarC.S(2);
                } else {
                    dsdVarC.f(2, str2);
                }
                lrdVar2.b();
                cursorN = lrdVar2.n(dsdVarC);
                try {
                    arrayList = new ArrayList(cursorN.getCount());
                    while (cursorN.moveToNext()) {
                        arrayList.add(cursorN.isNull(0) ? null : Long.valueOf(cursorN.getLong(0)));
                    }
                    cursorN.close();
                    dsdVarC.y();
                } finally {
                }
            }
            linkedHashSet.addAll(arrayList);
            String str6 = vl6Var3.a;
            String str7 = vl6Var3.b;
            if (vl6Var4 != null) {
                m03 m03VarC2 = jrdVar.c();
                String str8 = vl6Var4.a;
                String str9 = vl6Var4.b;
                lrd lrdVar3 = m03VarC2.a;
                dsdVarC = dsd.c(4, "SELECT docid FROM chat_title WHERE originalTitle LIKE ? OR normalizedTitle LIKE ? OR normalizedTitleWithoutEmoji LIKE ? OR originalTitleWithoutEmoji LIKE ? ORDER BY sortTime DESC ");
                if (str7 == null) {
                    dsdVarC.S(1);
                } else {
                    dsdVarC.f(1, str7);
                }
                if (str6 == null) {
                    dsdVarC.S(2);
                } else {
                    dsdVarC.f(2, str6);
                }
                if (str8 == null) {
                    dsdVarC.S(3);
                } else {
                    dsdVarC.f(3, str8);
                }
                if (str9 == null) {
                    dsdVarC.S(4);
                } else {
                    dsdVarC.f(4, str9);
                }
                lrdVar3.b();
                cursorN = lrdVar3.n(dsdVarC);
                try {
                    arrayList2 = new ArrayList(cursorN.getCount());
                    while (cursorN.moveToNext()) {
                        arrayList2.add(cursorN.isNull(0) ? null : Long.valueOf(cursorN.getLong(0)));
                    }
                } finally {
                }
            } else {
                lrd lrdVar4 = jrdVar.c().a;
                dsdVarC = dsd.c(2, "SELECT docid FROM chat_title WHERE originalTitle LIKE ? OR normalizedTitle LIKE ? ORDER BY sortTime DESC ");
                if (str7 == null) {
                    dsdVarC.S(1);
                } else {
                    dsdVarC.f(1, str7);
                }
                if (str6 == null) {
                    dsdVarC.S(2);
                } else {
                    dsdVarC.f(2, str6);
                }
                lrdVar4.b();
                cursorN = lrdVar4.n(dsdVarC);
                try {
                    arrayList2 = new ArrayList(cursorN.getCount());
                    while (cursorN.moveToNext()) {
                        arrayList2.add(cursorN.isNull(0) ? null : Long.valueOf(cursorN.getLong(0)));
                    }
                } finally {
                }
            }
            linkedHashSet.addAll(arrayList2);
            listD0 = ue3.d0(linkedHashSet);
        }
        if (!jqi.f(listD0)) {
            EnumSet enumSet = ve2.L;
            Iterator it = listD0.iterator();
            while (it.hasNext()) {
                pb2 pb2VarM = ve2Var.M(((Long) it.next()).longValue());
                if (pb2VarM != null) {
                    gu5 gu5Var = ve2Var.o.e;
                    if (ve2.w(pb2VarM, enumSet, false)) {
                        try {
                            o7e o7eVar = this.c;
                            if (pb2VarM.F()) {
                                try {
                                    if (!n8aVar2.d(pb2VarM.a)) {
                                        ku3 ku3VarN = pb2VarM.n();
                                        if (ku3VarN != null) {
                                            try {
                                                if (!n8aVar.d(ku3VarN.p())) {
                                                    arrayList3.add(o7eVar.a(pb2VarM, str));
                                                }
                                            } catch (Throwable th) {
                                                th = th;
                                                wqi.e("ve2", "iterateChatsByQuery fail", th);
                                            }
                                        }
                                        arrayList3.add(o7eVar.a(pb2VarM, str));
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                            }
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    }
                }
            }
        }
        if (arrayList3.size() > 1) {
            ze3.s(new vs6(19), arrayList3);
        }
        return arrayList3;
    }

    public final void c(String str, n8a n8aVar, n8a n8aVar2, ArrayList arrayList, ArrayList arrayList2) {
        o7e o7eVar;
        pb2 pb2VarP;
        wl6 wl6VarE;
        dsd dsdVarC;
        Cursor cursorN;
        ArrayList arrayList3;
        ArrayList arrayList4;
        qv3 qv3Var = this.b;
        te8 te8Var = ((ie4) qv3Var.e.get()).d;
        te8Var.getClass();
        boolean zF = vmf.F(str);
        List listD0 = hd5.a;
        if (!zF && (wl6VarE = xl6.e(str)) != null) {
            vl6 vl6Var = wl6VarE.a;
            vl6 vl6Var2 = vl6Var.c;
            vl6 vl6Var3 = wl6VarE.b;
            vl6 vl6Var4 = vl6Var3.c;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            String str2 = vl6Var.a;
            String str3 = vl6Var.b;
            if (vl6Var2 != null) {
                m14 m14VarR = te8Var.r();
                String str4 = vl6Var2.a;
                String str5 = vl6Var2.b;
                lrd lrdVar = m14VarR.a;
                dsdVarC = dsd.c(5, "SELECT docid FROM contact_title WHERE (allOriginalTitles MATCH ? OR allNormalizedTitles MATCH ? OR link MATCH ? OR allNormalizedTitlesWithoutEmoji MATCH ? OR allOriginalTitlesWithoutEmoji MATCH ? || '*')");
                if (str3 == null) {
                    dsdVarC.S(1);
                } else {
                    dsdVarC.f(1, str3);
                }
                if (str2 == null) {
                    dsdVarC.S(2);
                } else {
                    dsdVarC.f(2, str2);
                }
                if (str2 == null) {
                    dsdVarC.S(3);
                } else {
                    dsdVarC.f(3, str2);
                }
                if (str4 == null) {
                    dsdVarC.S(4);
                } else {
                    dsdVarC.f(4, str4);
                }
                if (str5 == null) {
                    dsdVarC.S(5);
                } else {
                    dsdVarC.f(5, str5);
                }
                lrdVar.b();
                cursorN = lrdVar.n(dsdVarC);
                try {
                    arrayList3 = new ArrayList(cursorN.getCount());
                    while (cursorN.moveToNext()) {
                        arrayList3.add(cursorN.isNull(0) ? null : Long.valueOf(cursorN.getLong(0)));
                    }
                    cursorN.close();
                    dsdVarC.y();
                } finally {
                }
            } else {
                lrd lrdVar2 = te8Var.r().a;
                dsdVarC = dsd.c(3, "SELECT docid FROM contact_title WHERE allOriginalTitles MATCH ? OR allNormalizedTitles MATCH ? OR link MATCH ?");
                if (str3 == null) {
                    dsdVarC.S(1);
                } else {
                    dsdVarC.f(1, str3);
                }
                if (str2 == null) {
                    dsdVarC.S(2);
                } else {
                    dsdVarC.f(2, str2);
                }
                if (str2 == null) {
                    dsdVarC.S(3);
                } else {
                    dsdVarC.f(3, str2);
                }
                lrdVar2.b();
                cursorN = lrdVar2.n(dsdVarC);
                try {
                    arrayList3 = new ArrayList(cursorN.getCount());
                    while (cursorN.moveToNext()) {
                        arrayList3.add(cursorN.isNull(0) ? null : Long.valueOf(cursorN.getLong(0)));
                    }
                    cursorN.close();
                    dsdVarC.y();
                } finally {
                }
            }
            linkedHashSet.addAll(arrayList3);
            String str6 = vl6Var3.a;
            String str7 = vl6Var3.b;
            if (vl6Var4 != null) {
                m14 m14VarR2 = te8Var.r();
                String str8 = vl6Var4.a;
                String str9 = vl6Var4.b;
                lrd lrdVar3 = m14VarR2.a;
                dsdVarC = dsd.c(5, "SELECT docid FROM contact_title WHERE (allOriginalTitles LIKE ? OR allNormalizedTitles LIKE ? OR link LIKE ? OR allNormalizedTitlesWithoutEmoji LIKE ? OR allOriginalTitlesWithoutEmoji LIKE ?)");
                if (str7 == null) {
                    dsdVarC.S(1);
                } else {
                    dsdVarC.f(1, str7);
                }
                if (str6 == null) {
                    dsdVarC.S(2);
                } else {
                    dsdVarC.f(2, str6);
                }
                if (str6 == null) {
                    dsdVarC.S(3);
                } else {
                    dsdVarC.f(3, str6);
                }
                if (str8 == null) {
                    dsdVarC.S(4);
                } else {
                    dsdVarC.f(4, str8);
                }
                if (str9 == null) {
                    dsdVarC.S(5);
                } else {
                    dsdVarC.f(5, str9);
                }
                lrdVar3.b();
                cursorN = lrdVar3.n(dsdVarC);
                try {
                    arrayList4 = new ArrayList(cursorN.getCount());
                    while (cursorN.moveToNext()) {
                        arrayList4.add(cursorN.isNull(0) ? null : Long.valueOf(cursorN.getLong(0)));
                    }
                } finally {
                }
            } else {
                lrd lrdVar4 = te8Var.r().a;
                dsdVarC = dsd.c(3, "SELECT docid FROM contact_title WHERE (allOriginalTitles LIKE ? OR allNormalizedTitles LIKE ? OR link LIKE ?)");
                if (str7 == null) {
                    dsdVarC.S(1);
                } else {
                    dsdVarC.f(1, str7);
                }
                if (str6 == null) {
                    dsdVarC.S(2);
                } else {
                    dsdVarC.f(2, str6);
                }
                if (str6 == null) {
                    dsdVarC.S(3);
                } else {
                    dsdVarC.f(3, str6);
                }
                lrdVar4.b();
                cursorN = lrdVar4.n(dsdVarC);
                try {
                    arrayList4 = new ArrayList(cursorN.getCount());
                    while (cursorN.moveToNext()) {
                        arrayList4.add(cursorN.isNull(0) ? null : Long.valueOf(cursorN.getLong(0)));
                    }
                } finally {
                }
            }
            linkedHashSet.addAll(arrayList4);
            listD0 = ue3.d0(linkedHashSet);
        }
        if (jqi.f(listD0)) {
            return;
        }
        EnumSet enumSet = qv3.o;
        ku3 ku3VarI = qv3Var.i(qv3Var.g.a.s(), false);
        Iterator it = listD0.iterator();
        while (it.hasNext()) {
            ku3 ku3Var = (ku3) qv3Var.a.get((Long) it.next());
            if (ku3Var != null && ku3VarI != null && ku3Var != ku3VarI && enumSet.contains(ku3Var.a.b.k)) {
                try {
                    o7eVar = this.c;
                    pb2VarP = this.a.P(ku3Var.p());
                } catch (Throwable th) {
                    th = th;
                }
                if (pb2VarP != null && pb2VarP.F()) {
                    try {
                        arrayList.add(o7eVar.a(pb2VarP, str));
                        try {
                            n8aVar2.a(pb2VarP.a);
                        } catch (Throwable th2) {
                            th = th2;
                        }
                        try {
                            n8aVar.a(ku3Var.p());
                        } catch (Throwable th3) {
                            th = th3;
                            wqi.e("ContactController", "iterateContactsByQuery fail", th);
                        }
                    } catch (Throwable th4) {
                        th = th4;
                    }
                } else if (ku3Var.d()) {
                    try {
                        arrayList2.add(o7eVar.b(ku3Var, str));
                    } catch (Throwable th5) {
                        th = th5;
                        wqi.e("ContactController", "iterateContactsByQuery fail", th);
                    }
                }
            }
        }
    }
}
