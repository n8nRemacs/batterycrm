package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.internal.Symbol;

/* loaded from: classes2.dex */
public final class k1a implements ui8 {
    public final k18 X;
    public final k18 Y;
    public final n9a Z;
    public final a84 a;
    public final k18 b;
    public final k18 c;
    public final k18 d;
    public final k18 o;
    public final xs s0;
    public final bg8 t0;

    public k1a(k18 k18Var, k18 k18Var2, a84 a84Var, k18 k18Var3, k18 k18Var4, k18 k18Var5, k18 k18Var6, k18 k18Var7) {
        this.a = a84Var;
        this.b = k18Var2;
        this.c = k18Var3;
        this.d = k18Var4;
        this.o = k18Var5;
        this.X = k18Var6;
        this.Y = k18Var7;
        Symbol symbol = o9a.a;
        this.Z = new n9a();
        this.s0 = new xs(0);
        this.t0 = new bg8(k18Var, 1);
        ((hia) k18Var7.getValue()).c.d = new x0a(this, null);
    }

    public static void e(fh9 fh9Var, n8a n8aVar, n8a n8aVar2, int i, boolean z) {
        fh9 fh9Var2;
        n8aVar.a(fh9Var.d);
        sz szVar = fh9Var.Z;
        if (!szVar.isEmpty()) {
            Iterator<E> it = szVar.iterator();
            while (it.hasNext()) {
                xy xyVar = (xy) it.next();
                s00 s00Var = xyVar.a;
                int i2 = s00Var == null ? -1 : y0a.$EnumSwitchMapping$0[s00Var.ordinal()];
                if (i2 == 1) {
                    s44 s44Var = (s44) xyVar;
                    Long l = s44Var.o;
                    if (l != null) {
                        n8aVar.a(l.longValue());
                    }
                    List<Long> list = s44Var.X;
                    if (list != null) {
                        for (Long l2 : list) {
                            if (l2 != null) {
                                n8aVar.a(l2.longValue());
                            }
                        }
                    }
                } else if (i2 == 2) {
                    List list2 = ((t21) xyVar).s0;
                    if (list2 != null) {
                        Iterator it2 = list2.iterator();
                        while (it2.hasNext()) {
                            n8aVar.a(((Long) it2.next()).longValue());
                        }
                    }
                } else if (i2 == 3) {
                    n8aVar.a(((pu3) xyVar).o);
                }
            }
        }
        rk9 rk9Var = fh9Var.s0;
        if (rk9Var == null || (fh9Var2 = rk9Var.c) == null || i <= 0) {
            return;
        }
        if (z) {
            e(fh9Var2, n8aVar2, n8aVar2, i - 1, true);
        } else {
            e(fh9Var2, n8aVar, n8aVar2, i - 1, true);
        }
    }

    public static void f(si9 si9Var, n8a n8aVar, n8a n8aVar2, int i, boolean z) {
        List list;
        a10 a10Var;
        n8aVar.a(si9Var.o);
        jdc jdcVar = si9Var.x0;
        if (jdcVar != null) {
            int iP = jdcVar.p();
            for (int i2 = 0; i2 < iP; i2++) {
                w10 w10VarO = jdcVar.o(i2);
                if (w10VarO != null) {
                    s10 s10Var = w10VarO.a;
                    int i3 = s10Var == null ? -1 : y0a.$EnumSwitchMapping$1[s10Var.ordinal()];
                    if (i3 == 1) {
                        d10 d10Var = w10VarO.c;
                        if (d10Var != null) {
                            n8aVar.a(d10Var.b);
                            Iterator it = d10Var.c.iterator();
                            while (it.hasNext()) {
                                n8aVar.a(((Number) it.next()).longValue());
                            }
                        }
                    } else if (i3 == 2) {
                        z00 z00Var = w10VarO.i;
                        if (z00Var != null && (list = z00Var.f) != null) {
                            Iterator it2 = list.iterator();
                            while (it2.hasNext()) {
                                n8aVar.a(((Number) it2.next()).longValue());
                            }
                        }
                    } else if (i3 == 3 && (a10Var = w10VarO.k) != null) {
                        n8aVar.a(a10Var.b);
                    }
                }
            }
        }
        si9 si9Var2 = si9Var.A0;
        if (si9Var2 != null && i > 0) {
            if (z) {
                f(si9Var2, n8aVar2, n8aVar2, i - 1, true);
            } else {
                f(si9Var2, n8aVar, n8aVar2, i - 1, true);
            }
        }
    }

    public final List a(n8a n8aVar) {
        k1a k1aVar;
        if (i() && !n8aVar.i()) {
            n8a n8aVar2 = new n8a((Object) null);
            long[] jArr = n8aVar.b;
            long[] jArr2 = n8aVar.a;
            int length = jArr2.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr2[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                long j2 = jArr[(i << 3) + i3];
                                if (!((Boolean) this.t0.invoke(Long.valueOf(j2))).booleanValue()) {
                                    n8aVar2.a(j2);
                                }
                            }
                            j >>= 8;
                        }
                        k1aVar = this;
                        if (i2 != 8) {
                            break;
                        }
                    } else {
                        k1aVar = this;
                    }
                    if (i == length) {
                        break;
                    }
                    i++;
                }
            } else {
                k1aVar = this;
            }
            n8aVar.m(n8aVar2);
            if (k1aVar.i() && !n8aVar.i()) {
                return dsi.h(n8aVar);
            }
        }
        return hd5.a;
    }

    public final void b(n8a n8aVar, qb2 qb2Var, n8a n8aVar2) {
        boolean z = qb2Var.W0 == 2;
        Iterator it = qb2Var.d.keySet().iterator();
        while (it.hasNext()) {
            long jLongValue = ((Long) it.next()).longValue();
            if (z) {
                n8aVar.a(jLongValue);
            } else {
                n8aVar2.a(jLongValue);
            }
        }
        LinkedHashMap linkedHashMap = qb2Var.L0;
        if (linkedHashMap != null) {
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                Long l = (Long) entry.getKey();
                ea eaVar = (ea) entry.getValue();
                n8aVar2.a(l.longValue());
                n8aVar2.a(eaVar.c);
            }
        }
        fh9 fh9Var = qb2Var.s0;
        if (fh9Var != null) {
            e(fh9Var, n8aVar, n8aVar2, 5, false);
        }
        fh9 fh9Var2 = qb2Var.G0;
        if (fh9Var2 != null) {
            e(fh9Var2, n8aVar, n8aVar2, 5, false);
        }
        n8aVar2.a(qb2Var.c);
    }

    @Override // defpackage.ui8
    public final void c() {
    }

    public final n8a d(List list, n8a n8aVar) {
        n8a n8aVar2 = new n8a(list.size());
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                b(n8aVar2, (qb2) it.next(), n8aVar);
            }
        }
        return n8aVar2;
    }

    public final void g(List list, n8a n8aVar, n8a n8aVar2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            e((fh9) it.next(), n8aVar, n8aVar2, 5, false);
        }
    }

    public final hia h() {
        return (hia) this.Y.getValue();
    }

    public final boolean i() {
        return !(((oje) ((lr3) this.X.getValue()).d.getValue()).k == 1);
    }

    public final Object j(long j, q44 q44Var, List list) {
        return d7j.d(new c1a(list, this, j, null), q44Var);
    }

    public final void k(qb2 qb2Var) throws Throwable {
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, "MissedContactsController", "requestForChat: chat=" + qb2Var, null);
            }
        }
        n8a n8aVar = new n8a((Object) null);
        n8a n8aVarD = d(Collections.singletonList(qb2Var), n8aVar);
        h().b(n8aVar);
        if (n8aVarD.i()) {
            return;
        }
        List listA = a(n8aVarD);
        if (listA.isEmpty()) {
            return;
        }
        svi.g(bd5.a, new d1a(this, listA, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.List] */
    public final Object l(ih2 ih2Var, long j, q44 q44Var) {
        Object objJ;
        qqg qqgVar = qqg.a;
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                qb2 qb2Var = ih2Var.d;
                l6bVar.c(lg8Var, "MissedContactsController", "requestForChatHistory: response=" + (qb2Var != null ? new Long(qb2Var.a) : null), null);
            }
        }
        n8a n8aVar = new n8a((Object) null);
        n8a n8aVar2 = new n8a((Object) null);
        g(ih2Var.c, n8aVar, n8aVar2);
        qb2 qb2Var2 = ih2Var.d;
        if (qb2Var2 != null) {
            b(n8aVar, qb2Var2, n8aVar2);
        }
        h().b(n8aVar2);
        List listA = a(n8aVar);
        return (!listA.isEmpty() && (objJ = j(j, q44Var, listA)) == g84.a) ? objJ : qqgVar;
    }

    public final void m(sh2 sh2Var) throws Throwable {
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, "MissedContactsController", "requestForChatInfo: response=" + sh2Var, null);
            }
        }
        n8a n8aVar = new n8a((Object) null);
        n8a n8aVarD = d(sh2Var.c, n8aVar);
        qb2 qb2Var = sh2Var.d;
        if (qb2Var != null) {
            b(n8aVarD, qb2Var, n8aVar);
        }
        h().b(n8aVar);
        if (n8aVarD.i()) {
            return;
        }
        List listA = a(n8aVarD);
        if (listA.isEmpty()) {
            return;
        }
        svi.g(bd5.a, new e1a(this, listA, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n(java.util.List r11) throws java.lang.Throwable {
        /*
            r10 = this;
            if (r11 == 0) goto L58
            boolean r0 = r11.isEmpty()
            if (r0 == 0) goto L9
            goto L58
        L9:
            l6b r0 = defpackage.wqi.a
            r1 = 0
            if (r0 != 0) goto L10
        Le:
            r4 = r11
            goto L2e
        L10:
            lg8 r2 = defpackage.lg8.d
            boolean r3 = r0.b(r2)
            if (r3 == 0) goto Le
            r8 = 0
            r9 = 63
            r5 = 0
            r6 = 0
            r7 = 0
            r4 = r11
            java.lang.String r11 = defpackage.ue3.N(r4, r5, r6, r7, r8, r9)
            java.lang.String r3 = "requestForChats: chats="
            java.lang.String r11 = r3.concat(r11)
            java.lang.String r3 = "MissedContactsController"
            r0.c(r2, r3, r11, r1)
        L2e:
            n8a r11 = new n8a
            r11.<init>(r1)
            n8a r0 = r10.d(r4, r11)
            hia r2 = r10.h()
            r2.b(r11)
            boolean r11 = r0.i()
            if (r11 == 0) goto L45
            goto L58
        L45:
            java.util.List r11 = r10.a(r0)
            boolean r0 = r11.isEmpty()
            if (r0 == 0) goto L50
            goto L58
        L50:
            f1a r0 = new f1a
            r0.<init>(r10, r11, r1)
            defpackage.svi.h(r0)
        L58:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k1a.n(java.util.List):void");
    }

    public final Object o(pb2 pb2Var, dtf dtfVar) {
        qqg qqgVar = qqg.a;
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, "MissedContactsController", "requestForChat: chat=" + pb2Var, null);
            }
        }
        n8a n8aVar = new n8a((Object) null);
        n8a n8aVar2 = new n8a((Object) null);
        boolean zQ = pb2Var.Q();
        Iterator it = pb2Var.b.e.keySet().iterator();
        while (it.hasNext()) {
            long jLongValue = ((Long) it.next()).longValue();
            if (zQ) {
                n8aVar2.a(jLongValue);
            } else {
                n8aVar.a(jLongValue);
            }
        }
        us usVar = pb2Var.b.R;
        if (usVar != null) {
            Iterator it2 = ((ps) usVar.entrySet()).iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                Long l = (Long) entry.getKey();
                ze2 ze2Var = (ze2) entry.getValue();
                n8aVar.a(l.longValue());
                n8aVar.a(ze2Var.c);
            }
        }
        eh9 eh9Var = pb2Var.c;
        if (eh9Var != null) {
            f(eh9Var.a, n8aVar2, n8aVar, 5, false);
        }
        eh9 eh9Var2 = pb2Var.o;
        if (eh9Var2 != null) {
            f(eh9Var2.a, n8aVar2, n8aVar, 5, false);
        }
        n8aVar.a(pb2Var.b.d);
        h().b(n8aVar);
        if (!n8aVar2.i()) {
            List listA = a(n8aVar2);
            if (!listA.isEmpty()) {
                int i = s65.d;
                Object objJ = j(v9j.h(10, y65.SECONDS), dtfVar, listA);
                if (objJ == g84.a) {
                    return objJ;
                }
            }
        }
        return qqgVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(defpackage.gh8 r7, long r8, defpackage.q44 r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof defpackage.g1a
            if (r0 == 0) goto L13
            r0 = r10
            g1a r0 = (defpackage.g1a) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            g1a r0 = new g1a
            r0.<init>(r6, r10)
        L18:
            java.lang.Object r10 = r0.X
            int r1 = r0.Z
            r2 = 1
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2a
            n8a r7 = r0.o
            k1a r8 = r0.d
            defpackage.g8j.b(r10)
            goto Lb8
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            defpackage.g8j.b(r10)
            java.lang.String r10 = "MissedContactsController"
            java.lang.String r1 = "requestForLogin"
            defpackage.wqi.d(r10, r1)
            java.util.ArrayList r10 = r7.e()
            java.util.ArrayList r1 = new java.util.ArrayList
            r3 = 10
            int r3 = defpackage.we3.q(r10, r3)
            r1.<init>(r3)
            java.util.Iterator r10 = r10.iterator()
        L4f:
            boolean r3 = r10.hasNext()
            if (r3 == 0) goto L66
            java.lang.Object r3 = r10.next()
            gx3 r3 = (defpackage.gx3) r3
            long r3 = r3.a
            java.lang.Long r5 = new java.lang.Long
            r5.<init>(r3)
            r1.add(r5)
            goto L4f
        L66:
            n8a r10 = defpackage.dsi.i(r1)
            n8a r1 = new n8a
            r3 = 0
            r1.<init>(r3)
            java.util.List r3 = r7.d
            n8a r3 = r6.d(r3, r1)
            java.util.Map r4 = r7.t0
            java.util.Collection r4 = r4.values()
            java.util.Iterator r4 = r4.iterator()
        L80:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L90
            java.lang.Object r5 = r4.next()
            java.util.List r5 = (java.util.List) r5
            r6.g(r5, r3, r1)
            goto L80
        L90:
            r3.m(r10)
            wac r7 = r7.c
            if (r7 == 0) goto La0
            gx3 r7 = r7.a
            if (r7 == 0) goto La0
            long r4 = r7.a
            r3.l(r4)
        La0:
            r1.m(r10)
            java.util.List r7 = r6.a(r3)
            r0.d = r6
            r0.o = r1
            r0.Z = r2
            java.lang.Object r7 = r6.j(r8, r0, r7)
            g84 r8 = defpackage.g84.a
            if (r7 != r8) goto Lb6
            return r8
        Lb6:
            r8 = r6
            r7 = r1
        Lb8:
            hia r8 = r8.h()
            r8.b(r7)
            qqg r7 = defpackage.qqg.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k1a.p(gh8, long, q44):java.lang.Object");
    }

    public final void q(uja ujaVar) throws Throwable {
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, "MissedContactsController", "requestForNotifMessage: response=" + ujaVar, null);
            }
        }
        n8a n8aVar = new n8a((Object) null);
        n8a n8aVar2 = new n8a((Object) null);
        e(ujaVar.o, n8aVar, n8aVar2, 5, false);
        qb2 qb2Var = ujaVar.d;
        if (qb2Var != null) {
            b(n8aVar, qb2Var, n8aVar2);
        }
        h().b(n8aVar2);
        if (n8aVar.i()) {
            return;
        }
        List listA = a(n8aVar);
        if (listA.isEmpty()) {
            return;
        }
        svi.g(bd5.a, new h1a(this, listA, null));
    }

    public final void r(nka nkaVar) {
        List listA = a(dk8.b(nkaVar.d));
        if (listA.isEmpty()) {
            return;
        }
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, "MissedContactsController", "requestForTyping: id=#" + ue3.G(listA), null);
            }
        }
        h().d(listA);
    }

    public final Object s(long j, long j2, dtf dtfVar) {
        Object objJ;
        qqg qqgVar = qqg.a;
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, "MissedContactsController", vb9.e(j, "requestForUser: id=#"), null);
            }
        }
        List listA = a(dk8.b(j));
        return (!listA.isEmpty() && (objJ = j(j2, dtfVar, listA)) == g84.a) ? objJ : qqgVar;
    }

    public final Object t(n8a n8aVar, long j, q44 q44Var) {
        qqg qqgVar = qqg.a;
        List listA = a(n8aVar);
        if (!listA.isEmpty()) {
            l6b l6bVar = wqi.a;
            if (l6bVar != null) {
                lg8 lg8Var = lg8.d;
                if (l6bVar.b(lg8Var)) {
                    l6bVar.c(lg8Var, "MissedContactsController", ho7.i("requestForUsers: ids=[", ue3.N(listA, null, null, null, null, 63), "]"), null);
                }
            }
            Object objJ = j(j, q44Var, listA);
            if (objJ == g84.a) {
                return objJ;
            }
        }
        return qqgVar;
    }
}
