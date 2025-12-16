package defpackage;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.ListIterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class ci1 extends xfh implements iq1 {
    public final pr1 A0;
    public final tcf B0;
    public final hbd C0;
    public final ci5 D0;
    public final qv1 X;
    public final lcj Y;
    public final k18 Z;
    public final s41 b;
    public final ks1 c;
    public final nnb d;
    public final lzf o;
    public final k18 s0;
    public final k18 t0;
    public final k18 u0;
    public final k18 v0;
    public final Object w0 = ipi.b(3, new g31(19));
    public String x0 = "";
    public final tcf y0;
    public final tcf z0;

    public ci1(k18 k18Var, k18 k18Var2, k18 k18Var3, k18 k18Var4, k18 k18Var5, k18 k18Var6, k18 k18Var7, s41 s41Var, ks1 ks1Var, nnb nnbVar, lzf lzfVar, qv1 qv1Var, lcj lcjVar) {
        Object value;
        this.b = s41Var;
        this.c = ks1Var;
        this.d = nnbVar;
        this.o = lzfVar;
        this.X = qv1Var;
        this.Y = lcjVar;
        this.Z = k18Var3;
        this.s0 = k18Var5;
        this.t0 = k18Var2;
        this.u0 = k18Var;
        this.v0 = k18Var7;
        tcf tcfVarA = ucf.a(mi1.g);
        this.y0 = tcfVarA;
        this.z0 = tcfVarA;
        this.A0 = new pr1();
        tcf tcfVarA2 = ucf.a(pa.c);
        this.B0 = tcfVarA2;
        this.C0 = new hbd(tcfVarA2);
        this.D0 = new ci5(0);
        q2b q2bVar = (q2b) lzfVar;
        gw0.w(gw0.u(new g56(((v11) ((z01) k18Var5.getValue())).t0, new ph1(this, null), 1), q2bVar.a()), this.a);
        svi.e(this.a, q2bVar.f(), null, new rh1(this, null), 2);
        gw0.w(new g56(ks1Var.g, new sh1(this, null), 1), this.a);
        gw0.w(new g56(((c51) qv1Var.f).j, new th1(this, null), 1), this.a);
        gw0.w(new z41(qv1Var.c.f, new bi1(qv1Var.e(), k18Var4, 0), new uh1(k18Var4, this, null, 0), 3), this.a);
        boolean z = ((gu5) ((rt5) k18Var6.getValue())).u() && !((n41) ((c51) s41Var).j.getValue()).g;
        if (((gu5) ((rt5) k18Var6.getValue())).t()) {
            gw0.w(gw0.u(new g56(((v11) ((z01) k18Var5.getValue())).F0, new vh1(this, z, k18Var6, null), 1), q2bVar.a()), this.a);
        } else {
            do {
                value = tcfVarA.getValue();
            } while (!tcfVarA.c(value, mi1.a((mi1) value, null, u(false, z), null, false, null, false, 29)));
        }
        gw0.w(new g56(((v11) this.X.l).D0, new wh1(this, null), 1), this.a);
        ((hw1) ((tv1) this.t0.getValue())).e(this);
    }

    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, k18] */
    public static final void t(ci1 ci1Var, o98 o98Var, Map map) {
        Object value;
        mi1 mi1Var;
        ArrayList arrayList;
        tcf tcfVar = ci1Var.y0;
        do {
            value = tcfVar.getValue();
            mi1Var = (mi1) value;
            arrayList = new ArrayList(we3.q(o98Var, 10));
            ListIterator listIterator = o98Var.listIterator(0);
            while (true) {
                m98 m98Var = (m98) listIterator;
                if (!m98Var.hasNext()) {
                    break;
                }
                cnb cnbVar = (cnb) m98Var.next();
                boolean z = o98Var.getSize() > 1;
                bj1 bj1Var = cnbVar.a;
                zi1 id = bj1Var.getId();
                gs1 gs1Var = cnbVar.b;
                String strQ = gs1Var.q();
                if (strQ == null) {
                    strQ = "";
                }
                String str = strQ;
                String name = gs1Var.getName();
                boolean zM = bj1Var.m();
                boolean zO = bj1Var.o();
                boolean z2 = !bj1Var.o() || (bj1Var.o() && (z || bj1Var.h()));
                boolean zH = bj1Var.h();
                Long l = (Long) map.get(bj1Var.getId());
                arrayList.add(new hh1(id, name, str, zO, z2, zM, zH, l != null ? l.longValue() : -1L, Integer.valueOf((bj1Var.m() && bj1Var.o()) ? m0b.x2 : bj1Var.m() ? m0b.u2 : bj1Var.o() ? m0b.w2 : m0b.y2)));
            }
        } while (!tcfVar.c(value, mi1.a(mi1Var, ue3.X(arrayList, (Comparator) ci1Var.w0.getValue()), null, null, false, null, false, 62)));
    }

    public static o98 u(boolean z, boolean z2) {
        o98 o98VarD = ve3.d();
        if (!z2) {
            o98VarD.add(new sza(j0b.i1, Integer.valueOf(m0b.A1), (Integer) null, Integer.valueOf(i0b.N), (Integer) null, 52));
        }
        if (!z2) {
            o98VarD.add(new sza(j0b.h1, Integer.valueOf(avd.w0), (Integer) null, Integer.valueOf(i0b.e), (Integer) null, 52));
        } else if (z2 && z) {
            o98VarD.add(new sza(j0b.g1, Integer.valueOf(m0b.x1), (Integer) null, Integer.valueOf(i0b.e), (Integer) null, 52));
        }
        return ve3.a(o98VarD);
    }

    @Override // defpackage.iq1
    public final void l() {
        xfh.r(this.D0, hm1.D);
    }
}
