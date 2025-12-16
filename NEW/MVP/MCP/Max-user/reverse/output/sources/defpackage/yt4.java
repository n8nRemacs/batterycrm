package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class yt4 {
    public zt3 a;
    public boolean b;
    public boolean c;
    public zt3 d;
    public ArrayList e;
    public poc f;
    public zl0 g;
    public ArrayList h;

    public final void a(zt4 zt4Var, int i, ArrayList arrayList, rvd rvdVar) {
        z2i z2iVar = zt4Var.d;
        rvd rvdVar2 = z2iVar.c;
        zt4 zt4Var2 = z2iVar.i;
        zt4 zt4Var3 = z2iVar.h;
        if (rvdVar2 == null) {
            zt3 zt3Var = this.a;
            if (z2iVar == zt3Var.d || z2iVar == zt3Var.e) {
                return;
            }
            if (rvdVar == null) {
                rvdVar = new rvd();
                rvdVar.a = null;
                rvdVar.b = new ArrayList();
                rvdVar.a = z2iVar;
                arrayList.add(rvdVar);
            }
            z2iVar.c = rvdVar;
            rvdVar.b.add(z2iVar);
            Iterator it = zt4Var3.k.iterator();
            while (it.hasNext()) {
                wt4 wt4Var = (wt4) it.next();
                if (wt4Var instanceof zt4) {
                    a((zt4) wt4Var, i, arrayList, rvdVar);
                }
            }
            Iterator it2 = zt4Var2.k.iterator();
            while (it2.hasNext()) {
                wt4 wt4Var2 = (wt4) it2.next();
                if (wt4Var2 instanceof zt4) {
                    a((zt4) wt4Var2, i, arrayList, rvdVar);
                }
            }
            if (i == 1 && (z2iVar instanceof i0h)) {
                Iterator it3 = ((i0h) z2iVar).k.k.iterator();
                while (it3.hasNext()) {
                    wt4 wt4Var3 = (wt4) it3.next();
                    if (wt4Var3 instanceof zt4) {
                        a((zt4) wt4Var3, i, arrayList, rvdVar);
                    }
                }
            }
            Iterator it4 = zt4Var3.l.iterator();
            while (it4.hasNext()) {
                a((zt4) it4.next(), i, arrayList, rvdVar);
            }
            Iterator it5 = zt4Var2.l.iterator();
            while (it5.hasNext()) {
                a((zt4) it5.next(), i, arrayList, rvdVar);
            }
            if (i == 1 && (z2iVar instanceof i0h)) {
                Iterator it6 = ((i0h) z2iVar).k.l.iterator();
                while (it6.hasNext()) {
                    a((zt4) it6.next(), i, arrayList, rvdVar);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:146:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0293 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:180:0x028c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:188:0x019d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:199:0x000a A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(defpackage.zt3 r25) {
        /*
            Method dump skipped, instructions count: 845
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yt4.b(zt3):void");
    }

    public final void c() {
        zt3 zt3Var = this.a;
        ArrayList arrayList = this.h;
        ArrayList arrayList2 = this.e;
        arrayList2.clear();
        zt3 zt3Var2 = this.d;
        zt3Var2.d.f();
        zt3Var2.e.f();
        arrayList2.add(zt3Var2.d);
        arrayList2.add(zt3Var2.e);
        Iterator it = zt3Var2.q0.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            yt3 yt3Var = (yt3) it.next();
            if (yt3Var instanceof hz6) {
                iz6 iz6Var = new iz6(yt3Var);
                yt3Var.d.f();
                yt3Var.e.f();
                iz6Var.f = ((hz6) yt3Var).u0;
                arrayList2.add(iz6Var);
            } else {
                if (yt3Var.x()) {
                    if (yt3Var.b == null) {
                        yt3Var.b = new l72(yt3Var, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(yt3Var.b);
                } else {
                    arrayList2.add(yt3Var.d);
                }
                if (yt3Var.y()) {
                    if (yt3Var.c == null) {
                        yt3Var.c = new l72(yt3Var, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(yt3Var.c);
                } else {
                    arrayList2.add(yt3Var.e);
                }
                if (yt3Var instanceof e27) {
                    arrayList2.add(new d27(yt3Var));
                }
            }
        }
        if (hashSet != null) {
            arrayList2.addAll(hashSet);
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            ((z2i) it2.next()).f();
        }
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            z2i z2iVar = (z2i) it3.next();
            if (z2iVar.b != zt3Var2) {
                z2iVar.d();
            }
        }
        arrayList.clear();
        e(zt3Var.d, 0, arrayList);
        e(zt3Var.e, 1, arrayList);
        this.b = false;
    }

    public final int d(zt3 zt3Var, int i) {
        ArrayList arrayList;
        int i2;
        long jMax;
        float f;
        zt3 zt3Var2 = zt3Var;
        ArrayList arrayList2 = this.h;
        int size = arrayList2.size();
        long j = 0;
        int i3 = 0;
        long jMax2 = 0;
        while (i3 < size) {
            z2i z2iVar = ((rvd) arrayList2.get(i3)).a;
            if (!(z2iVar instanceof l72) ? !(i != 0 ? (z2iVar instanceof i0h) : (z2iVar instanceof u67)) : ((l72) z2iVar).f != i) {
                zt4 zt4Var = (i == 0 ? zt3Var2.d : zt3Var2.e).h;
                zt4 zt4Var2 = (i == 0 ? zt3Var2.d : zt3Var2.e).i;
                zt4 zt4Var3 = z2iVar.h;
                zt4 zt4Var4 = z2iVar.i;
                boolean zContains = zt4Var3.l.contains(zt4Var);
                boolean zContains2 = zt4Var4.l.contains(zt4Var2);
                long j2 = z2iVar.j();
                if (zContains && zContains2) {
                    long jB = rvd.b(zt4Var3, j);
                    long jA = rvd.a(zt4Var4, j);
                    long j3 = jB - j2;
                    int i4 = zt4Var4.f;
                    arrayList = arrayList2;
                    i2 = size;
                    if (j3 >= (-i4)) {
                        j3 += i4;
                    }
                    long j4 = zt4Var3.f;
                    long j5 = ((-jA) - j2) - j4;
                    if (j5 >= j4) {
                        j5 -= j4;
                    }
                    yt3 yt3Var = z2iVar.b;
                    if (i == 0) {
                        f = yt3Var.d0;
                    } else if (i == 1) {
                        f = yt3Var.e0;
                    } else {
                        yt3Var.getClass();
                        f = -1.0f;
                    }
                    float f2 = f > 0.0f ? (long) ((j3 / (1.0f - f)) + (j5 / f)) : 0L;
                    jMax = (zt4Var3.f + ((((long) ((f2 * f) + 0.5f)) + j2) + ((long) utb.i(1.0f, f, f2, 0.5f)))) - zt4Var4.f;
                } else {
                    arrayList = arrayList2;
                    i2 = size;
                    jMax = zContains ? Math.max(rvd.b(zt4Var3, zt4Var3.f), zt4Var3.f + j2) : zContains2 ? Math.max(-rvd.a(zt4Var4, zt4Var4.f), (-zt4Var4.f) + j2) : (z2iVar.j() + zt4Var3.f) - zt4Var4.f;
                }
            } else {
                arrayList = arrayList2;
                i2 = size;
                jMax = j;
            }
            jMax2 = Math.max(jMax2, jMax);
            i3++;
            zt3Var2 = zt3Var;
            arrayList2 = arrayList;
            size = i2;
            j = 0;
        }
        return (int) jMax2;
    }

    public final void e(z2i z2iVar, int i, ArrayList arrayList) {
        zt4 zt4Var = z2iVar.h;
        zt4 zt4Var2 = z2iVar.i;
        Iterator it = zt4Var.k.iterator();
        while (it.hasNext()) {
            wt4 wt4Var = (wt4) it.next();
            if (wt4Var instanceof zt4) {
                a((zt4) wt4Var, i, arrayList, null);
            } else if (wt4Var instanceof z2i) {
                a(((z2i) wt4Var).h, i, arrayList, null);
            }
        }
        Iterator it2 = zt4Var2.k.iterator();
        while (it2.hasNext()) {
            wt4 wt4Var2 = (wt4) it2.next();
            if (wt4Var2 instanceof zt4) {
                a((zt4) wt4Var2, i, arrayList, null);
            } else if (wt4Var2 instanceof z2i) {
                a(((z2i) wt4Var2).i, i, arrayList, null);
            }
        }
        if (i == 1) {
            Iterator it3 = ((i0h) z2iVar).k.k.iterator();
            while (it3.hasNext()) {
                wt4 wt4Var3 = (wt4) it3.next();
                if (wt4Var3 instanceof zt4) {
                    a((zt4) wt4Var3, i, arrayList, null);
                }
            }
        }
    }

    public final void f(int i, int i2, int i3, int i4, yt3 yt3Var) {
        zl0 zl0Var = this.g;
        zl0Var.a = i;
        zl0Var.b = i3;
        zl0Var.c = i2;
        zl0Var.d = i4;
        this.f.c(yt3Var, zl0Var);
        yt3Var.O(zl0Var.e);
        yt3Var.L(zl0Var.f);
        yt3Var.E = zl0Var.h;
        yt3Var.I(zl0Var.g);
    }

    public final void g() {
        sl0 sl0Var;
        Iterator it = this.a.q0.iterator();
        while (it.hasNext()) {
            yt3 yt3Var = (yt3) it.next();
            if (!yt3Var.a) {
                int[] iArr = yt3Var.p0;
                boolean z = false;
                int i = iArr[0];
                int i2 = iArr[1];
                int i3 = yt3Var.r;
                int i4 = yt3Var.s;
                boolean z2 = i == 2 || (i == 3 && i3 == 1);
                if (i2 == 2 || (i2 == 3 && i4 == 1)) {
                    z = true;
                }
                uw4 uw4Var = yt3Var.d.e;
                boolean z3 = uw4Var.j;
                uw4 uw4Var2 = yt3Var.e.e;
                boolean z4 = uw4Var2.j;
                boolean z5 = z2;
                if (z3 && z4) {
                    f(1, uw4Var.g, 1, uw4Var2.g, yt3Var);
                    yt3Var.a = true;
                } else if (z3 && z) {
                    f(1, uw4Var.g, 2, uw4Var2.g, yt3Var);
                    if (i2 == 3) {
                        yt3Var.e.e.m = yt3Var.k();
                    } else {
                        yt3Var.e.e.d(yt3Var.k());
                        yt3Var.a = true;
                    }
                } else if (z4 && z5) {
                    f(2, uw4Var.g, 1, uw4Var2.g, yt3Var);
                    if (i == 3) {
                        yt3Var.d.e.m = yt3Var.q();
                    } else {
                        yt3Var.d.e.d(yt3Var.q());
                        yt3Var.a = true;
                    }
                }
                if (yt3Var.a && (sl0Var = yt3Var.e.l) != null) {
                    sl0Var.d(yt3Var.a0);
                }
            }
        }
    }
}
