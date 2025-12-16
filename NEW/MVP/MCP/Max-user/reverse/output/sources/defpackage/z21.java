package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import ru.ok.android.externcalls.analytics.CallAnalyticsSender;

/* loaded from: classes2.dex */
public final class z21 {
    public boolean a;
    public final Object b;
    public final Object c;
    public final Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;

    public z21(CallAnalyticsSender callAnalyticsSender, qt6 qt6Var, y8g y8gVar) {
        this.b = callAnalyticsSender;
        this.c = qt6Var;
        this.d = y8gVar;
        this.a = true;
        this.h = new iv6(5, this);
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x000d  */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, k18] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List a(java.util.Collection r8, defpackage.vfh r9, defpackage.vc1 r10) {
        /*
            r7 = this;
            boolean r0 = r10.g
            boolean r1 = r10.l
            vfh r2 = defpackage.vfh.a
            hd5 r3 = defpackage.hd5.a
            r4 = 1
            if (r0 != 0) goto L10
            if (r9 != r2) goto L10
        Ld:
            r10 = r3
            goto L82
        L10:
            vfh r5 = defpackage.vfh.c
            if (r0 == 0) goto L2d
            if (r9 != r5) goto L2d
            co5 r6 = r10.e
            boolean r6 = r6 instanceof defpackage.bo5
            if (r6 == 0) goto L2d
            o98 r10 = defpackage.ve3.d()
            r10.addAll(r8)
            xd1 r0 = defpackage.xd1.a
            r10.add(r0)
            o98 r10 = defpackage.ve3.a(r10)
            goto L82
        L2d:
            if (r0 == 0) goto L6f
            if (r9 != r5) goto L6f
            if (r1 != 0) goto L6f
            o98 r0 = defpackage.ve3.d()
            r0.addAll(r8)
            gxi r1 = r10.b
            if (r1 == 0) goto L6a
            d51 r1 = r10.f
            if (r1 == 0) goto L6a
            boolean r1 = r1.e
            if (r1 != r4) goto L6a
            boolean r1 = r7.a
            if (r1 == 0) goto L6a
            java.lang.Object r1 = r7.e
            vc1 r1 = (defpackage.vc1) r1
            co5 r1 = r1.e
            boolean r1 = r1 instanceof defpackage.yn5
            if (r1 != 0) goto L6a
            wd1 r1 = new wd1
            java.lang.String r10 = r10.k
            if (r10 == 0) goto L5f
            java.lang.String r10 = defpackage.dqi.u(r10)
            goto L60
        L5f:
            r10 = 0
        L60:
            if (r10 != 0) goto L64
            java.lang.String r10 = ""
        L64:
            r1.<init>(r10)
            r0.add(r1)
        L6a:
            o98 r10 = defpackage.ve3.a(r0)
            goto L82
        L6f:
            if (r0 == 0) goto L7e
            if (r9 != r2) goto L7e
            if (r1 != 0) goto L79
            boolean r0 = r7.a
            if (r0 != 0) goto L7e
        L79:
            boolean r10 = r10.o
            if (r10 == 0) goto L7e
            goto Ld
        L7e:
            java.util.List r10 = defpackage.ue3.d0(r8)
        L82:
            int r9 = r9.ordinal()
            if (r9 == 0) goto Laf
            if (r9 == r4) goto Lb5
            r8 = 2
            if (r9 != r8) goto La9
            o98 r8 = defpackage.ve3.d()
            java.lang.Object r9 = r7.d
            java.lang.Object r9 = r9.getValue()
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            java.util.ArrayList r9 = defpackage.ko8.a(r10, r9, r4)
            r8.addAll(r9)
            o98 r8 = defpackage.ve3.a(r8)
            return r8
        La9:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        Laf:
            boolean r9 = r8.isEmpty()
            if (r9 == 0) goto Lb6
        Lb5:
            return r3
        Lb6:
            int r8 = r8.size()
            java.util.ArrayList r8 = defpackage.ko8.a(r10, r8, r4)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z21.a(java.util.Collection, vfh, vc1):java.util.List");
    }

    public t7f b(Map map, bn8 bn8Var, List list, zi1 zi1Var, boolean z) {
        vd1 vd1Var;
        vc1 vc1Var = (vc1) this.e;
        xib xibVarF = null;
        if (vc1Var.s) {
            return null;
        }
        if (vc1Var.q == ms8.b) {
            co5 co5Var = vc1Var.e;
            if (!(co5Var instanceof wn5) && !(co5Var instanceof vn5) && !(co5Var instanceof xn5) && !vc1Var.g && ((vfh) this.f) == vfh.a && (vd1Var = (vd1) map.get(zi1Var)) != null) {
                xibVarF = ko8.f(vd1Var, true, vc1Var.m, false);
            }
        }
        return new t7f(list, bn8Var, xibVarF, z);
    }

    public bn8 c(vfh vfhVar, Map map, zi1 zi1Var) {
        bn8 bn8Var;
        Object next;
        k18 k18Var = (k18) this.c;
        d51 d51Var = ((vc1) this.e).f;
        Object obj = null;
        if (d51Var != null) {
            wd0 wd0Var = d51Var.c;
            CharSequence charSequence = d51Var.b;
            Long l = d51Var.a;
            bn8Var = new bn8(wd0Var, charSequence, l != null ? new zi1(l.longValue(), 0) : null, false, false, false, false, null, false, false, 3, null, null);
        } else {
            bn8Var = null;
        }
        vc1 vc1Var = (vc1) this.e;
        Map map2 = (Map) this.i;
        vd1 vd1Var = (vd1) map2.get((zi1) this.h);
        if (vd1Var == null && (vd1Var = (vd1) map2.get(vc1Var.p)) == null) {
            Iterator it = map2.keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                zi1 zi1Var2 = (zi1) next;
                cnb cnbVar = vc1Var.h;
                if (!fni.a(zi1Var2, cnbVar != null ? cnbVar.a.getId() : null)) {
                    break;
                }
            }
            vd1Var = (vd1) map2.get(next);
            if (vd1Var == null) {
                vd1Var = (vd1) ue3.H(map2.values());
            }
        }
        vc1 vc1Var2 = (vc1) this.e;
        in1 in1Var = vc1Var2.i;
        boolean z = vc1Var2.g;
        if (in1Var.a() || vfhVar == vfh.c) {
            return null;
        }
        vfh vfhVar2 = vfh.a;
        if (!z && vfhVar == vfhVar2 && zi1Var == null) {
            Iterator it2 = map.values().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next2 = it2.next();
                if (!((vd1) next2).v0) {
                    obj = next2;
                    break;
                }
            }
            vd1 vd1Var2 = (vd1) obj;
            if (vd1Var2 != null) {
                return ko8.e(vd1Var2, (vc1) this.e, (mr1) k18Var.getValue());
            }
        } else if (!z && vfhVar == vfhVar2) {
            Iterator it3 = map.values().iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                Object next3 = it3.next();
                if (!fni.a(((vd1) next3).a, zi1Var)) {
                    obj = next3;
                    break;
                }
            }
            vd1 vd1Var3 = (vd1) obj;
            if (vd1Var3 != null) {
                return ko8.e(vd1Var3, (vc1) this.e, (mr1) k18Var.getValue());
            }
        } else if (vd1Var != null) {
            return ko8.e(vd1Var, (vc1) this.e, (mr1) k18Var.getValue());
        }
        return bn8Var;
    }

    public z21(k18 k18Var, r1e r1eVar) {
        this.b = r1eVar;
        this.c = k18Var;
        this.d = ipi.b(3, new hk1(3, this));
        this.e = new vc1();
        this.f = vfh.a;
        this.a = true;
        this.i = id5.a;
    }
}
