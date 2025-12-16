package androidx.constraintlayout.core.widgets.analyzer;

import androidx.appcompat.app.r;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.analyzer.b;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: DependencyGraph.java */
/* loaded from: classes.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public androidx.constraintlayout.core.widgets.d f43501a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f43502b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f43503c;

    /* renamed from: d, reason: collision with root package name */
    public androidx.constraintlayout.core.widgets.d f43504d;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList<p> f43505e;

    /* renamed from: f, reason: collision with root package name */
    public b.InterfaceC1703b f43506f;

    /* renamed from: g, reason: collision with root package name */
    public b.a f43507g;

    /* renamed from: h, reason: collision with root package name */
    public ArrayList<m> f43508h;

    public final void a(f fVar, int i12, ArrayList arrayList, m mVar) {
        p pVar = fVar.f43512d;
        if (pVar.f43547c == null) {
            androidx.constraintlayout.core.widgets.d dVar = this.f43501a;
            if (pVar == dVar.f43435d || pVar == dVar.f43437e) {
                return;
            }
            if (mVar == null) {
                mVar = new m();
                mVar.f43534a = null;
                mVar.f43535b = new ArrayList<>();
                mVar.f43534a = pVar;
                arrayList.add(mVar);
            }
            pVar.f43547c = mVar;
            mVar.f43535b.add(pVar);
            f fVar2 = pVar.f43552h;
            Iterator it = fVar2.f43519k.iterator();
            while (it.hasNext()) {
                d dVar2 = (d) it.next();
                if (dVar2 instanceof f) {
                    a((f) dVar2, i12, arrayList, mVar);
                }
            }
            f fVar3 = pVar.f43553i;
            Iterator it2 = fVar3.f43519k.iterator();
            while (it2.hasNext()) {
                d dVar3 = (d) it2.next();
                if (dVar3 instanceof f) {
                    a((f) dVar3, i12, arrayList, mVar);
                }
            }
            if (i12 == 1 && (pVar instanceof n)) {
                Iterator it3 = ((n) pVar).f43536k.f43519k.iterator();
                while (it3.hasNext()) {
                    d dVar4 = (d) it3.next();
                    if (dVar4 instanceof f) {
                        a((f) dVar4, i12, arrayList, mVar);
                    }
                }
            }
            Iterator it4 = fVar2.f43520l.iterator();
            while (it4.hasNext()) {
                a((f) it4.next(), i12, arrayList, mVar);
            }
            Iterator it5 = fVar3.f43520l.iterator();
            while (it5.hasNext()) {
                a((f) it5.next(), i12, arrayList, mVar);
            }
            if (i12 == 1 && (pVar instanceof n)) {
                Iterator it6 = ((n) pVar).f43536k.f43520l.iterator();
                while (it6.hasNext()) {
                    a((f) it6.next(), i12, arrayList, mVar);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:85:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x018b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(androidx.constraintlayout.core.widgets.d r18) {
        /*
            Method dump skipped, instructions count: 788
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.analyzer.e.b(androidx.constraintlayout.core.widgets.d):void");
    }

    public final void c() {
        ArrayList<p> arrayList = this.f43505e;
        arrayList.clear();
        androidx.constraintlayout.core.widgets.d dVar = this.f43504d;
        dVar.f43435d.f();
        dVar.f43437e.f();
        arrayList.add(dVar.f43435d);
        arrayList.add(dVar.f43437e);
        Iterator<ConstraintWidget> it = dVar.f43661u0.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            ConstraintWidget next = it.next();
            if (next instanceof androidx.constraintlayout.core.widgets.f) {
                j jVar = new j(next);
                next.f43435d.f();
                next.f43437e.f();
                jVar.f43550f = ((androidx.constraintlayout.core.widgets.f) next).f43644y0;
                arrayList.add(jVar);
            } else {
                if (next.B()) {
                    if (next.f43431b == null) {
                        next.f43431b = new c(next, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.f43431b);
                } else {
                    arrayList.add(next.f43435d);
                }
                if (next.C()) {
                    if (next.f43433c == null) {
                        next.f43433c = new c(next, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.f43433c);
                } else {
                    arrayList.add(next.f43437e);
                }
                if (next instanceof androidx.constraintlayout.core.widgets.h) {
                    arrayList.add(new k(next));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator<p> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            it2.next().f();
        }
        Iterator<p> it3 = arrayList.iterator();
        while (it3.hasNext()) {
            p next2 = it3.next();
            if (next2.f43546b != dVar) {
                next2.d();
            }
        }
        ArrayList<m> arrayList2 = this.f43508h;
        arrayList2.clear();
        androidx.constraintlayout.core.widgets.d dVar2 = this.f43501a;
        g(dVar2.f43435d, 0, arrayList2);
        g(dVar2.f43437e, 1, arrayList2);
        this.f43502b = false;
    }

    public final int d(androidx.constraintlayout.core.widgets.d dVar, int i12) {
        ArrayList<m> arrayList;
        int i13;
        int i14;
        long jMax;
        float f12;
        androidx.constraintlayout.core.widgets.d dVar2 = dVar;
        ArrayList<m> arrayList2 = this.f43508h;
        int size = arrayList2.size();
        int i15 = 0;
        long jMax2 = 0;
        while (i15 < size) {
            p pVar = arrayList2.get(i15).f43534a;
            if (!(pVar instanceof c) ? !(i12 != 0 ? (pVar instanceof n) : (pVar instanceof l)) : ((c) pVar).f43550f != i12) {
                f fVar = (i12 == 0 ? dVar2.f43435d : dVar2.f43437e).f43552h;
                f fVar2 = (i12 == 0 ? dVar2.f43435d : dVar2.f43437e).f43553i;
                boolean zContains = pVar.f43552h.f43520l.contains(fVar);
                f fVar3 = pVar.f43553i;
                boolean zContains2 = fVar3.f43520l.contains(fVar2);
                long j12 = pVar.j();
                f fVar4 = pVar.f43552h;
                if (zContains && zContains2) {
                    long jB2 = m.b(fVar4, 0L);
                    ArrayList<m> arrayList3 = arrayList2;
                    i13 = size;
                    long jA2 = m.a(fVar3, 0L);
                    long j13 = jB2 - j12;
                    int i16 = fVar3.f43514f;
                    arrayList = arrayList3;
                    i14 = i15;
                    if (j13 >= (-i16)) {
                        j13 += i16;
                    }
                    long j14 = (-jA2) - j12;
                    long j15 = fVar4.f43514f;
                    long j16 = j14 - j15;
                    if (j16 >= j15) {
                        j16 -= j15;
                    }
                    ConstraintWidget constraintWidget = pVar.f43546b;
                    if (i12 == 0) {
                        f12 = constraintWidget.f43440f0;
                    } else if (i12 == 1) {
                        f12 = constraintWidget.f43442g0;
                    } else {
                        constraintWidget.getClass();
                        f12 = -1.0f;
                    }
                    float f13 = f12 > 0.0f ? (long) ((j13 / (1.0f - f12)) + (j16 / f12)) : 0L;
                    jMax = (fVar4.f43514f + ((((long) ((f13 * f12) + 0.5f)) + j12) + ((long) r.c(1.0f, f12, f13, 0.5f)))) - fVar3.f43514f;
                } else {
                    arrayList = arrayList2;
                    i13 = size;
                    i14 = i15;
                    jMax = zContains ? Math.max(m.b(fVar4, fVar4.f43514f), fVar4.f43514f + j12) : zContains2 ? Math.max(-m.a(fVar3, fVar3.f43514f), (-fVar3.f43514f) + j12) : (pVar.j() + fVar4.f43514f) - fVar3.f43514f;
                }
            } else {
                arrayList = arrayList2;
                i13 = size;
                i14 = i15;
                jMax = 0;
            }
            jMax2 = Math.max(jMax2, jMax);
            i15 = i14 + 1;
            dVar2 = dVar;
            size = i13;
            arrayList2 = arrayList;
        }
        return (int) jMax2;
    }

    public final boolean e(boolean z12) {
        boolean z13;
        boolean z14 = this.f43502b;
        androidx.constraintlayout.core.widgets.d dVar = this.f43501a;
        boolean z15 = false;
        if (z14 || this.f43503c) {
            Iterator<ConstraintWidget> it = dVar.f43661u0.iterator();
            while (it.hasNext()) {
                ConstraintWidget next = it.next();
                next.l();
                next.f43429a = false;
                next.f43435d.n();
                next.f43437e.m();
            }
            dVar.l();
            dVar.f43429a = false;
            dVar.f43435d.n();
            dVar.f43437e.m();
            this.f43503c = false;
        }
        b(this.f43504d);
        dVar.f43430a0 = 0;
        dVar.f43432b0 = 0;
        ConstraintWidget.DimensionBehaviour dimensionBehaviourN = dVar.n(0);
        ConstraintWidget.DimensionBehaviour dimensionBehaviourN2 = dVar.n(1);
        if (this.f43502b) {
            c();
        }
        int iV2 = dVar.v();
        int iW2 = dVar.w();
        dVar.f43435d.f43552h.d(iV2);
        dVar.f43437e.f43552h.d(iW2);
        i();
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.f43476c;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.f43475b;
        ArrayList<p> arrayList = this.f43505e;
        if (dimensionBehaviourN == dimensionBehaviour || dimensionBehaviourN2 == dimensionBehaviour) {
            if (z12) {
                Iterator<p> it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (!it2.next().k()) {
                        z12 = false;
                        break;
                    }
                }
            }
            if (z12 && dimensionBehaviourN == dimensionBehaviour) {
                dVar.Q(dimensionBehaviour2);
                dVar.S(d(dVar, 0));
                dVar.f43435d.f43549e.d(dVar.u());
            }
            if (z12 && dimensionBehaviourN2 == dimensionBehaviour) {
                dVar.R(dimensionBehaviour2);
                dVar.P(d(dVar, 1));
                dVar.f43437e.f43549e.d(dVar.o());
            }
        }
        ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = dVar.f43423U[0];
        ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.f43478e;
        if (dimensionBehaviour3 == dimensionBehaviour2 || dimensionBehaviour3 == dimensionBehaviour4) {
            int iU2 = dVar.u() + iV2;
            dVar.f43435d.f43553i.d(iU2);
            dVar.f43435d.f43549e.d(iU2 - iV2);
            i();
            ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = dVar.f43423U[1];
            if (dimensionBehaviour5 == dimensionBehaviour2 || dimensionBehaviour5 == dimensionBehaviour4) {
                int iO2 = dVar.o() + iW2;
                dVar.f43437e.f43553i.d(iO2);
                dVar.f43437e.f43549e.d(iO2 - iW2);
            }
            i();
            z13 = true;
        } else {
            z13 = false;
        }
        Iterator<p> it3 = arrayList.iterator();
        while (it3.hasNext()) {
            p next2 = it3.next();
            if (next2.f43546b != dVar || next2.f43551g) {
                next2.e();
            }
        }
        Iterator<p> it4 = arrayList.iterator();
        while (true) {
            if (!it4.hasNext()) {
                z15 = true;
                break;
            }
            p next3 = it4.next();
            if (z13 || next3.f43546b != dVar) {
                if (!next3.f43552h.f43518j || ((!next3.f43553i.f43518j && !(next3 instanceof j)) || (!next3.f43549e.f43518j && !(next3 instanceof c) && !(next3 instanceof j)))) {
                    break;
                }
            }
        }
        dVar.Q(dimensionBehaviourN);
        dVar.R(dimensionBehaviourN2);
        return z15;
    }

    public final boolean f(int i12, boolean z12) {
        boolean z13;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour;
        androidx.constraintlayout.core.widgets.d dVar = this.f43501a;
        boolean z14 = false;
        ConstraintWidget.DimensionBehaviour dimensionBehaviourN = dVar.n(0);
        ConstraintWidget.DimensionBehaviour dimensionBehaviourN2 = dVar.n(1);
        int iV2 = dVar.v();
        int iW2 = dVar.w();
        ArrayList<p> arrayList = this.f43505e;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.f43475b;
        if (z12 && (dimensionBehaviourN == (dimensionBehaviour = ConstraintWidget.DimensionBehaviour.f43476c) || dimensionBehaviourN2 == dimensionBehaviour)) {
            Iterator<p> it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                p next = it.next();
                if (next.f43550f == i12 && !next.k()) {
                    z12 = false;
                    break;
                }
            }
            if (i12 == 0) {
                if (z12 && dimensionBehaviourN == dimensionBehaviour) {
                    dVar.Q(dimensionBehaviour2);
                    dVar.S(d(dVar, 0));
                    dVar.f43435d.f43549e.d(dVar.u());
                }
            } else if (z12 && dimensionBehaviourN2 == dimensionBehaviour) {
                dVar.R(dimensionBehaviour2);
                dVar.P(d(dVar, 1));
                dVar.f43437e.f43549e.d(dVar.o());
            }
        }
        ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.f43478e;
        if (i12 == 0) {
            ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = dVar.f43423U[0];
            if (dimensionBehaviour4 == dimensionBehaviour2 || dimensionBehaviour4 == dimensionBehaviour3) {
                int iU2 = dVar.u() + iV2;
                dVar.f43435d.f43553i.d(iU2);
                dVar.f43435d.f43549e.d(iU2 - iV2);
                z13 = true;
            }
            z13 = false;
        } else {
            ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = dVar.f43423U[1];
            if (dimensionBehaviour5 == dimensionBehaviour2 || dimensionBehaviour5 == dimensionBehaviour3) {
                int iO2 = dVar.o() + iW2;
                dVar.f43437e.f43553i.d(iO2);
                dVar.f43437e.f43549e.d(iO2 - iW2);
                z13 = true;
            }
            z13 = false;
        }
        i();
        Iterator<p> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            p next2 = it2.next();
            if (next2.f43550f == i12 && (next2.f43546b != dVar || next2.f43551g)) {
                next2.e();
            }
        }
        Iterator<p> it3 = arrayList.iterator();
        while (true) {
            if (!it3.hasNext()) {
                z14 = true;
                break;
            }
            p next3 = it3.next();
            if (next3.f43550f == i12 && (z13 || next3.f43546b != dVar)) {
                if (!next3.f43552h.f43518j || !next3.f43553i.f43518j || (!(next3 instanceof c) && !next3.f43549e.f43518j)) {
                    break;
                }
            }
        }
        dVar.Q(dimensionBehaviourN);
        dVar.R(dimensionBehaviourN2);
        return z14;
    }

    public final void g(p pVar, int i12, ArrayList<m> arrayList) {
        f fVar;
        Iterator it = pVar.f43552h.f43519k.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            fVar = pVar.f43553i;
            if (!zHasNext) {
                break;
            }
            d dVar = (d) it.next();
            if (dVar instanceof f) {
                a((f) dVar, i12, arrayList, null);
            } else if (dVar instanceof p) {
                a(((p) dVar).f43552h, i12, arrayList, null);
            }
        }
        Iterator it2 = fVar.f43519k.iterator();
        while (it2.hasNext()) {
            d dVar2 = (d) it2.next();
            if (dVar2 instanceof f) {
                a((f) dVar2, i12, arrayList, null);
            } else if (dVar2 instanceof p) {
                a(((p) dVar2).f43553i, i12, arrayList, null);
            }
        }
        if (i12 == 1) {
            Iterator it3 = ((n) pVar).f43536k.f43519k.iterator();
            while (it3.hasNext()) {
                d dVar3 = (d) it3.next();
                if (dVar3 instanceof f) {
                    a((f) dVar3, i12, arrayList, null);
                }
            }
        }
    }

    public final void h(ConstraintWidget constraintWidget, ConstraintWidget.DimensionBehaviour dimensionBehaviour, int i12, ConstraintWidget.DimensionBehaviour dimensionBehaviour2, int i13) {
        b.a aVar = this.f43507g;
        aVar.f43489a = dimensionBehaviour;
        aVar.f43490b = dimensionBehaviour2;
        aVar.f43491c = i12;
        aVar.f43492d = i13;
        this.f43506f.a(constraintWidget, aVar);
        constraintWidget.S(aVar.f43493e);
        constraintWidget.P(aVar.f43494f);
        constraintWidget.f43407E = aVar.f43496h;
        constraintWidget.M(aVar.f43495g);
    }

    public final void i() {
        a aVar;
        Iterator<ConstraintWidget> it = this.f43501a.f43661u0.iterator();
        while (it.hasNext()) {
            ConstraintWidget next = it.next();
            if (!next.f43429a) {
                ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = next.f43423U;
                boolean z12 = false;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[0];
                ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = dimensionBehaviourArr[1];
                int i12 = next.f43463r;
                int i13 = next.f43465s;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.f43476c;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.f43477d;
                boolean z13 = dimensionBehaviour == dimensionBehaviour3 || (dimensionBehaviour == dimensionBehaviour4 && i12 == 1);
                if (dimensionBehaviour2 == dimensionBehaviour3 || (dimensionBehaviour2 == dimensionBehaviour4 && i13 == 1)) {
                    z12 = true;
                }
                g gVar = next.f43435d.f43549e;
                boolean z14 = gVar.f43518j;
                g gVar2 = next.f43437e.f43549e;
                boolean z15 = gVar2.f43518j;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = ConstraintWidget.DimensionBehaviour.f43475b;
                if (z14 && z15) {
                    h(next, dimensionBehaviour5, gVar.f43515g, dimensionBehaviour5, gVar2.f43515g);
                    next.f43429a = true;
                } else if (z14 && z12) {
                    h(next, dimensionBehaviour5, gVar.f43515g, dimensionBehaviour3, gVar2.f43515g);
                    if (dimensionBehaviour2 == dimensionBehaviour4) {
                        next.f43437e.f43549e.f43530m = next.o();
                    } else {
                        next.f43437e.f43549e.d(next.o());
                        next.f43429a = true;
                    }
                } else if (z15 && z13) {
                    h(next, dimensionBehaviour3, gVar.f43515g, dimensionBehaviour5, gVar2.f43515g);
                    if (dimensionBehaviour == dimensionBehaviour4) {
                        next.f43435d.f43549e.f43530m = next.u();
                    } else {
                        next.f43435d.f43549e.d(next.u());
                        next.f43429a = true;
                    }
                }
                if (next.f43429a && (aVar = next.f43437e.f43537l) != null) {
                    aVar.d(next.f43434c0);
                }
            }
        }
    }
}
