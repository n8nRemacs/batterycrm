package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import ru.ok.android.onelog.impl.BuildConfig;

/* loaded from: classes2.dex */
public final class b47 {
    public static final /* synthetic */ yy7[] j;
    public final h37 a;
    public final re4 b;
    public final re4 c;
    public final int d;
    public final iv6 e;
    public final boolean f = true;
    public final p74 g;
    public final f94 h;
    public volatile x37 i;

    static {
        z8a z8aVar = new z8a(b47.class, "historyBounds", "getHistoryBounds()Lru/ok/tamtam/loader/HistoryBounds;");
        vid.a.getClass();
        j = new yy7[]{z8aVar};
    }

    public b47(h37 h37Var, re4 re4Var, re4 re4Var2, int i, iv6 iv6Var, int i2) {
        this.a = h37Var;
        this.b = re4Var;
        this.c = re4Var2;
        this.d = i;
        this.e = iv6Var;
        p74 p74Var = new p74();
        this.g = p74Var;
        this.h = new f94(new bwf(new e44(26, this)), this);
        p74Var.add(new i37());
    }

    public final void a(int i, j37 j37Var) {
        this.g.add(i, j37Var);
    }

    public final void b(j37 j37Var) {
        this.e.u("addHistoryItem " + j37Var);
        h(Collections.singletonList(j37Var));
        p();
        s();
        x37 x37Var = this.i;
        if (x37Var != null) {
            x37Var.m();
        }
    }

    public final void c(Set set) {
        if (set.isEmpty()) {
            return;
        }
        this.e.u("deleteHistoryItem: " + set.size());
        p74 p74Var = this.g;
        ArrayList arrayList = new ArrayList();
        Iterator it = p74Var.iterator();
        while (true) {
            m74 m74Var = (m74) it;
            if (!m74Var.hasNext()) {
                break;
            }
            Object next = m74Var.next();
            if (set.contains(Long.valueOf(((j37) next).getA()))) {
                arrayList.add(next);
            }
        }
        if (arrayList.isEmpty() || this.g.isEmpty()) {
            return;
        }
        this.g.removeAll(arrayList);
        m(this.g);
        q();
        p74 p74Var2 = this.g;
        if (p74Var2 == null || !p74Var2.isEmpty()) {
            Iterator it2 = p74Var2.iterator();
            while (true) {
                m74 m74Var2 = (m74) it2;
                if (!m74Var2.hasNext()) {
                    break;
                }
                if (!(((j37) m74Var2.next()) instanceof i37)) {
                    p();
                    s();
                    break;
                }
            }
        }
        x37 x37Var = this.i;
        if (x37Var != null) {
            x37Var.m();
        }
    }

    public final g37 d() {
        return (g37) this.h.D(this, j[0]);
    }

    public final ArrayList e() {
        return new ArrayList(this.g);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0094 A[PHI: r8
  0x0094: PHI (r8v5 int) = (r8v1 int), (r8v9 int) binds: [B:37:0x008e, B:39:0x0091] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0130  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List f(long r17) {
        /*
            Method dump skipped, instructions count: 388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b47.f(long):java.util.List");
    }

    public final void g(List list, long j2, boolean z, boolean z2) {
        List listSingletonList;
        List listJ = d().j();
        oz5 oz5VarG = lee.g(new az4(new at(2, list), new d73(23), 0), new y37(0, listJ));
        Comparator comparatorC = d().c();
        ArrayList arrayList = new ArrayList();
        lee.n(oz5VarG, arrayList);
        ze3.s(comparatorC, arrayList);
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(next);
                while (it.hasNext()) {
                    arrayList2.add(it.next());
                }
                listSingletonList = arrayList2;
            } else {
                listSingletonList = Collections.singletonList(next);
            }
        } else {
            listSingletonList = hd5.a;
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        int size = listSingletonList.size();
        for (int i = 0; i < size; i++) {
            j37 j37Var = (j37) listSingletonList.get(i);
            arrayList4.add(j37Var);
            if (i == listSingletonList.size() - 1 || !fni.a(k4j.d(j37Var.getC(), listJ), k4j.d(((j37) listSingletonList.get(i + 1)).getC(), listJ))) {
                arrayList3.add(arrayList4);
                arrayList4 = new ArrayList();
            }
        }
        ArrayList arrayList5 = new ArrayList();
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            Object next2 = it2.next();
            if (((List) next2).size() > 0) {
                arrayList5.add(next2);
            }
        }
        ArrayList arrayList6 = new ArrayList(arrayList5);
        if (arrayList6.isEmpty()) {
            return;
        }
        Iterator it3 = arrayList6.iterator();
        while (it3.hasNext()) {
            List list2 = (List) it3.next();
            list2.add(0, new i37());
            list2.add(list2.size(), new i37());
        }
        Iterator it4 = arrayList6.iterator();
        while (it4.hasNext()) {
            List list3 = (List) it4.next();
            h(list3);
            o(gei.b(list3), gei.c(list3));
        }
        List list4 = (List) ue3.G(arrayList6);
        if (z && !this.g.isEmpty()) {
            j37 j37VarC = gei.c(list4);
            long c = j37VarC != null ? j37VarC.getC() : -1L;
            if (c >= 0) {
                d93 d93VarD = k4j.d(c, listJ);
                d93 d93VarD2 = k4j.d(j2, listJ);
                if (d93VarD != null && d93VarD.equals(d93VarD2)) {
                    n(j2, c);
                }
            }
        }
        List list5 = (List) ue3.P(arrayList6);
        if (z2 && !this.g.isEmpty()) {
            j37 j37VarB = gei.b(list5);
            long c2 = j37VarB != null ? j37VarB.getC() : -1L;
            if (c2 >= 0) {
                d93 d93VarD3 = k4j.d(c2, listJ);
                d93 d93VarD4 = k4j.d(j2, listJ);
                if (d93VarD3 != null && d93VarD3.equals(d93VarD4)) {
                    n(c2, j2);
                }
            }
        }
        m(this.g);
        p();
        s();
        if (!d().a()) {
            p74 p74Var = this.g;
            o(gei.b(p74Var), gei.c(p74Var));
        }
        x37 x37Var = this.i;
        if (x37Var != null) {
            x37Var.m();
        }
    }

    public final void h(List list) {
        int iIndexOf;
        int iIndexOf2;
        int i = 0;
        boolean z = !list.isEmpty() && (ue3.G(list) instanceof i37);
        boolean z2 = !list.isEmpty() && (ue3.P(list) instanceof i37);
        List<j37> listO = lee.o(lee.h(lee.g(new at(2, list), new d73(22)), new d92(28, this)));
        if (listO.isEmpty()) {
            return;
        }
        if (this.g.isEmpty()) {
            this.g.addAll(listO);
        } else {
            Comparator comparatorE = d().e();
            if (this.f) {
                int i2 = ve3.i(this.g);
                Iterator it = new wp8(1, listO).iterator();
                while (true) {
                    eqd eqdVar = (eqd) it;
                    if (!eqdVar.b.hasPrevious()) {
                        break;
                    }
                    j37 j37Var = (j37) eqdVar.b.previous();
                    while (i2 > 0 && ((this.g.b[i2] instanceof i37) || comparatorE.compare(Long.valueOf(((j37) this.g.b[i2]).getC()), Long.valueOf(j37Var.getC())) > 0)) {
                        i2--;
                    }
                    int i3 = i2 + 1;
                    if (this.g.b.length > i3 && (this.g.b[i3] instanceof i37)) {
                        i2 = i3;
                    }
                    a(i2 + 1, j37Var);
                }
            } else {
                for (j37 j37Var2 : listO) {
                    while (i < this.g.b.length && ((this.g.b[i] instanceof i37) || comparatorE.compare(Long.valueOf(((j37) this.g.b[i]).getC()), Long.valueOf(j37Var2.getC())) <= 0)) {
                        i++;
                    }
                    a(i, j37Var2);
                }
            }
        }
        if (z && (iIndexOf2 = this.g.indexOf(ue3.G(listO))) > 0) {
            int i4 = iIndexOf2 - 1;
            if (!(this.g.b[i4] instanceof i37)) {
                a(i4, new i37());
            }
        }
        if (!z2 || (iIndexOf = this.g.indexOf(ue3.P(listO))) <= 0) {
            return;
        }
        if (iIndexOf == ve3.i(this.g) ? ue3.P(this.g) instanceof i37 : this.g.b[iIndexOf + 1] instanceof i37) {
            return;
        }
        a(iIndexOf + 1, new i37());
    }

    public final boolean i(List list, long j2, boolean z) {
        int i;
        int i2;
        int i3 = this.d;
        if (z) {
            if (list.isEmpty()) {
                i2 = 0;
            } else {
                Iterator it = list.iterator();
                i2 = 0;
                while (it.hasNext()) {
                    j37 j37Var = (j37) it.next();
                    if (!(j37Var instanceof i37) && d().e().compare(Long.valueOf(j37Var.getC()), Long.valueOf(j2)) <= 0 && (i2 = i2 + 1) < 0) {
                        ve3.o();
                        throw null;
                    }
                }
            }
            if (i2 < i3) {
                return true;
            }
        } else {
            if (list.isEmpty()) {
                i = 0;
            } else {
                Iterator it2 = list.iterator();
                i = 0;
                while (it2.hasNext()) {
                    j37 j37Var2 = (j37) it2.next();
                    if (!(j37Var2 instanceof i37) && d().e().compare(Long.valueOf(j37Var2.getC()), Long.valueOf(j2)) >= 0 && (i = i + 1) < 0) {
                        ve3.o();
                        throw null;
                    }
                }
            }
            if (i < i3) {
                return true;
            }
        }
        return false;
    }

    public final void j(re4 re4Var, long j2, boolean z, boolean z2, boolean z3) {
        long j3;
        long jC;
        int i;
        long c;
        j37 j37Var;
        j37 j37Var2;
        long jA;
        int i2;
        long j4;
        long j5;
        j37 j37Var3;
        if (z || z2) {
            List listF = f(j2);
            ArrayList arrayList = new ArrayList();
            for (Object obj : listF) {
                if (!(((j37) obj) instanceof i37)) {
                    arrayList.add(obj);
                }
            }
            boolean zIsEmpty = arrayList.isEmpty();
            int i3 = this.d;
            if (zIsEmpty) {
                j3 = j2;
                j4 = j3;
                i2 = i3;
                j5 = -1;
                jA = -1;
                j37Var3 = null;
                j37Var2 = null;
            } else {
                j3 = 0;
                if ((ue3.G(listF) instanceof i37) && z && (!z3 || i(listF, j2, true))) {
                    c = ((j37) listF.get(1)).getC();
                    j37Var = (j37) listF.get(1);
                    d93 d93VarF = d().f(c);
                    jC = d93VarF != null ? d93VarF.c() : -1L;
                    i = i3;
                } else {
                    jC = -1;
                    i = 0;
                    c = 0;
                    j37Var = null;
                }
                if ((ue3.P(listF) instanceof i37) && z2 && (!z3 || i(listF, j2, false))) {
                    long c2 = ((j37) listF.get(listF.size() - 2)).getC();
                    j37Var3 = (j37) listF.get(listF.size() - 2);
                    d93 d93VarD = d().d(c2);
                    j3 = c2;
                    j37Var2 = j37Var;
                    i2 = i3;
                    jA = d93VarD != null ? d93VarD.a() : -1L;
                    j4 = c;
                    j5 = jC;
                    i3 = i;
                } else {
                    j37Var2 = j37Var;
                    jA = -1;
                    i2 = 0;
                    j4 = c;
                    j5 = jC;
                    i3 = i;
                    j37Var3 = null;
                }
            }
            if (i3 == 0 && i2 == 0) {
                return;
            }
            String simpleName = re4Var.getClass().getSimpleName();
            String strK = iv6.k(j4);
            String strK2 = iv6.k(j3);
            String strK3 = iv6.k(j5);
            String strK4 = iv6.k(jA);
            StringBuilder sbL = wy1.l("dataSourceRequest: ", simpleName, ", bTime: ", strK, ", fTime: ");
            sbL.append(strK2);
            sbL.append(", bCount: ");
            sbL.append(i3);
            sbL.append(", fCount: ");
            sbL.append(i2);
            sbL.append(", bLimit: ");
            sbL.append(strK3);
            sbL.append(", fLimit: ");
            sbL.append(strK4);
            this.e.u(sbL.toString());
            if (j3 == j4) {
                int i4 = i2;
                int i5 = i3;
                List listM = re4Var.m(j4, j37Var2, i5, i4, j5, jA);
                q();
                g(listM, j4, i4 > 0, i5 > 0);
                return;
            }
            int i6 = i2;
            int i7 = i3;
            long j6 = jA;
            if (i7 > 0) {
                List listM2 = re4Var.m(j4, j37Var2, i7, 0, j5, -1L);
                q();
                g(listM2, j4, false, true);
            }
            if (i6 > 0) {
                long j7 = j3;
                List listM3 = re4Var.m(j7, j37Var3, 0, i6, -1L, j6);
                q();
                g(listM3, j7, true, false);
            }
        }
    }

    public final void k(re4 re4Var, long j2, boolean z, boolean z2) {
        j(re4Var, j2, z, z2, true);
        if (this.g.isEmpty() || (this.g.b.length == 1 && (ue3.I(this.g) instanceof i37))) {
            this.g.clear();
            x37 x37Var = this.i;
            if (x37Var != null) {
                x37Var.m();
            }
        }
    }

    public final void l(long j2) {
        int i;
        this.e.u("loadEmptyChunksData: " + iv6.k(j2));
        List listM = this.b.m(j2, null, Integer.MAX_VALUE, Integer.MAX_VALUE, Long.MIN_VALUE, BuildConfig.MAX_TIME_TO_UPLOAD);
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM) {
            if (hashSet.add(Long.valueOf(((j37) obj).getA()))) {
                arrayList.add(obj);
            }
        }
        int i2 = 0;
        h(ue3.X(arrayList, b5j.a(z37.a, a47.a)));
        ArrayList arrayList2 = new ArrayList();
        int i3 = ve3.i(this.g);
        if (i3 >= 0) {
            int i4 = 0;
            while (true) {
                j37 j37Var = (j37) this.g.b[i2];
                if (!(j37Var instanceof i37)) {
                    if (i4 != i2) {
                        this.g.set(i4, j37Var);
                    }
                    i4++;
                }
                if (i2 == i3) {
                    break;
                } else {
                    i2++;
                }
            }
            i2 = i4;
        }
        if (i2 < this.g.b.length && i2 <= (i = ve3.i(this.g))) {
            while (true) {
                arrayList2.add(this.g.remove(i));
                if (i == i2) {
                    break;
                } else {
                    i--;
                }
            }
        }
        arrayList2.isEmpty();
        x37 x37Var = this.i;
        if (x37Var != null) {
            x37Var.m();
        }
    }

    public final void m(List list) {
        int size = list.size();
        while (true) {
            size--;
            if (-1 >= size) {
                return;
            }
            if (size > 0 && (list.get(size) instanceof i37) && (list.get(size - 1) instanceof i37)) {
            }
        }
    }

    public final void n(long j2, long j3) {
        Object obj;
        Object objPrevious;
        p74 p74Var = this.g;
        ListIterator listIterator = p74Var.listIterator(p74Var.size());
        while (true) {
            obj = null;
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
            j37 j37Var = (j37) objPrevious;
            if (!(j37Var instanceof i37) && j37Var.getC() <= j2) {
                break;
            }
        }
        j37 j37Var2 = (j37) objPrevious;
        Iterator<E> it = p74Var.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            j37 j37Var3 = (j37) next;
            if (!(j37Var3 instanceof i37) && j37Var3.getC() >= j3) {
                obj = next;
                break;
            }
        }
        o(j37Var2, (j37) obj);
    }

    public final void o(j37 j37Var, j37 j37Var2) {
        int i;
        if (j37Var == null || j37Var2 == null) {
            return;
        }
        Iterator it = this.g.iterator();
        int i2 = 0;
        while (true) {
            m74 m74Var = (m74) it;
            i = -1;
            if (!m74Var.hasNext()) {
                i2 = -1;
                break;
            }
            j37 j37Var3 = (j37) m74Var.next();
            if (!(j37Var3 instanceof i37) && j37Var3.getA() == j37Var.getA()) {
                break;
            } else {
                i2++;
            }
        }
        p74 p74Var = this.g;
        ListIterator listIterator = p74Var.listIterator(p74Var.b.length);
        while (true) {
            m74 m74Var2 = (m74) listIterator;
            if (!m74Var2.hasPrevious()) {
                break;
            }
            j37 j37Var4 = (j37) m74Var2.previous();
            if (!(j37Var4 instanceof i37) && j37Var4.getA() == j37Var2.getA()) {
                i = m74Var2.b;
                break;
            }
        }
        if (i2 < 0 || i < 0 || i2 > i) {
            return;
        }
        while (true) {
            if (this.g.b[i] instanceof i37) {
            }
            if (i == i2) {
                return;
            } else {
                i--;
            }
        }
    }

    public final void p() {
        boolean z;
        long jG = d().g();
        long jI = d().i();
        p74 p74Var = this.g;
        if (jG != jI && (p74Var == null || !p74Var.isEmpty())) {
            Iterator it = p74Var.iterator();
            while (true) {
                m74 m74Var = (m74) it;
                if (!m74Var.hasNext()) {
                    break;
                }
                j37 j37Var = (j37) m74Var.next();
                if (!(j37Var instanceof i37) && j37Var.getA() == jG) {
                    z = true;
                    break;
                }
            }
        } else {
            z = false;
        }
        j37 j37Var2 = (j37) ue3.G(p74Var);
        StringBuilder sbJ = xc0.j(jG, "UpdateFirstGap: firstItemId=", ", isLastGap=", j37Var2 instanceof i37);
        sbJ.append(", hasFirstBound=");
        sbJ.append(z);
        this.e.u(sbJ.toString());
        if (z && (j37Var2 instanceof i37)) {
        } else {
            if (z || (j37Var2 instanceof i37)) {
                return;
            }
            a(0, new i37());
        }
    }

    public final void q() {
        g37 g37VarD = d();
        g37 g37VarN = this.a.n();
        this.h.O(this, j[0], g37VarN);
        p74 p74Var = this.g;
        if (p74Var == null || !p74Var.isEmpty()) {
            Iterator it = p74Var.iterator();
            while (true) {
                m74 m74Var = (m74) it;
                if (!m74Var.hasNext()) {
                    break;
                }
                if (!(((j37) m74Var.next()) instanceof i37)) {
                    p();
                    s();
                    break;
                }
            }
        }
        if (eei.a(g37VarD, d(), null)) {
            return;
        }
        iei.c(this.e, d());
    }

    public final void r(j37 j37Var) {
        int i = ve3.i(this.g);
        while (true) {
            if (-1 >= i) {
                i = -1;
                break;
            } else if (((j37) this.g.b[i]).getA() == j37Var.getA()) {
                break;
            } else {
                i--;
            }
        }
        x37 x37Var = this.i;
        if (i < 0) {
            this.e.u("WARN: updateHistoryItem: could not find history item by id!");
            return;
        }
        j37 j37Var2 = (j37) ue3.J(i - 1, this.g);
        boolean z = true;
        j37 j37Var3 = (j37) ue3.J(i + 1, this.g);
        if ((j37Var2 == null || d().c().compare(j37Var2, j37Var) <= 0) && (j37Var3 == null || d().c().compare(j37Var, j37Var3) >= 0)) {
            z = false;
        }
        if (z) {
            this.g.c(d().c());
        }
        if ((z || x37Var == null) && x37Var != null) {
            x37Var.m();
        }
    }

    public final void s() {
        boolean z;
        p74 p74Var;
        long jH = d().h();
        if (jH != d().i() && ((p74Var = this.g) == null || !p74Var.isEmpty())) {
            Iterator it = p74Var.iterator();
            while (true) {
                m74 m74Var = (m74) it;
                if (!m74Var.hasNext()) {
                    break;
                }
                j37 j37Var = (j37) m74Var.next();
                if (!(j37Var instanceof i37) && j37Var.getA() == jH) {
                    z = true;
                    break;
                }
            }
        } else {
            z = false;
        }
        j37 j37Var2 = (j37) ue3.P(this.g);
        iv6 iv6Var = this.e;
        StringBuilder sbJ = xc0.j(jH, "UpdateLastGap: lastItemId=", ", isLastGap=", j37Var2 instanceof i37);
        sbJ.append(", hasLastBound=");
        sbJ.append(z);
        iv6Var.u(sbJ.toString());
        if (z && (j37Var2 instanceof i37)) {
            this.g.remove(j37Var2);
        } else {
            if (z || (j37Var2 instanceof i37)) {
                return;
            }
            a(this.g.b.length, new i37());
        }
    }
}
