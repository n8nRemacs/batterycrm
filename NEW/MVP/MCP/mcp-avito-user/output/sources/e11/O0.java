package e11;

import android.content.Context;
import android.graphics.Point;
import com.my.target.C37788h;
import com.my.target.C37802o;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes7.dex */
public class O0 extends T0<W0> {
    @j.P
    public static com.my.target.common.models.b b(@j.N ArrayList arrayList, int i12, int i13) {
        int i14;
        com.my.target.common.models.b bVar = null;
        if (arrayList.size() == 0) {
            return null;
        }
        if (i13 != 0 && i12 != 0) {
            float f12 = i12;
            float f13 = i13;
            float f14 = f12 / f13;
            Iterator it = arrayList.iterator();
            float f15 = 0.0f;
            while (it.hasNext()) {
                com.my.target.common.models.b bVar2 = (com.my.target.common.models.b) it.next();
                int i15 = bVar2.f394305b;
                if (i15 > 0 && (i14 = bVar2.f394306c) > 0) {
                    float f16 = i15;
                    float f17 = i14;
                    float f18 = f16 / f17;
                    if (f14 < f18) {
                        if (f16 > f12) {
                            f16 = f12;
                        }
                        f17 = f16 / f18;
                    } else {
                        if (f17 > f13) {
                            f17 = f13;
                        }
                        f16 = f17 * f18;
                    }
                    float f19 = f16 * f17;
                    if (f19 <= f15) {
                        break;
                    }
                    bVar = bVar2;
                    f15 = f19;
                }
            }
        }
        return bVar;
    }

    /* JADX WARN: Type inference failed for: r5v9, types: [T, java.lang.String] */
    public static boolean c(@j.N Context context, p2 p2Var) {
        com.my.target.common.models.b bVar;
        if (p2Var instanceof C39884l0) {
            C39884l0 c39884l0 = (C39884l0) p2Var;
            ArrayList arrayList = new ArrayList();
            C39913v0<com.my.target.common.models.e> c39913v0 = c39884l0.f394673N;
            if (c39913v0 != null) {
                com.my.target.common.models.b bVar2 = c39913v0.f394858L;
                if (bVar2 != null) {
                    arrayList.add(bVar2);
                }
                com.my.target.common.models.e eVar = (com.my.target.common.models.e) c39913v0.f394856J;
                if (eVar != null && eVar.f364778e) {
                    ?? r52 = (String) new M1().b(eVar.f394304a, null, null, context);
                    if (r52 != 0) {
                        eVar.f394307d = r52;
                    } else if (c39884l0.f394678S) {
                        return false;
                    }
                }
            }
            com.my.target.common.models.b bVar3 = c39884l0.f394716o;
            if (bVar3 != null) {
                arrayList.add(bVar3);
            }
            com.my.target.common.models.b bVar4 = c39884l0.f394717p;
            if (bVar4 != null) {
                arrayList.add(bVar4);
            }
            com.my.target.common.models.b bVar5 = c39884l0.f394741H;
            if (bVar5 != null) {
                arrayList.add(bVar5);
            }
            com.my.target.common.models.b bVar6 = c39884l0.f394675P;
            if (bVar6 != null) {
                arrayList.add(bVar6);
            }
            C37788h c37788h = c39884l0.f394698D;
            if (c37788h != null) {
                arrayList.add(c37788h.f364851a);
            }
            com.my.target.common.models.b bVar7 = c39884l0.f394671L.f394740k;
            if (bVar7 != null) {
                arrayList.add(bVar7);
            }
            ArrayList arrayList2 = c39884l0.f394672M;
            if (!arrayList2.isEmpty()) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    com.my.target.common.models.b bVar8 = ((C39883l) it.next()).f394716o;
                    if (bVar8 != null) {
                        arrayList.add(bVar8);
                    }
                }
            }
            p2 p2Var2 = c39884l0.f394674O;
            if (p2Var2 != null && !c(context, p2Var2)) {
                c39884l0.f394674O = null;
            }
            if (arrayList.size() > 0) {
                new C37802o(arrayList).d(context);
            }
        } else if (p2Var instanceof P) {
            P p12 = (P) p2Var;
            ArrayList arrayList3 = new ArrayList();
            Point pointK = C39924z.k(context);
            p12.getClass();
            com.my.target.common.models.b bVarB = b(new ArrayList(p12.f394453L), Math.min(pointK.x, pointK.y), Math.max(pointK.x, pointK.y));
            if (bVarB != null) {
                arrayList3.add(bVarB);
                p12.f394455N = bVarB;
            }
            com.my.target.common.models.b bVarB2 = b(new ArrayList(p12.f394454M), Math.max(pointK.x, pointK.y), Math.min(pointK.x, pointK.y));
            if (bVarB2 != null) {
                arrayList3.add(bVarB2);
                p12.f394456O = bVarB2;
            }
            if ((bVarB != null || bVarB2 != null) && (bVar = p12.f394741H) != null) {
                arrayList3.add(bVar);
            }
            C37788h c37788h2 = p12.f394698D;
            if (c37788h2 != null) {
                arrayList3.add(c37788h2.f364851a);
            }
            if (arrayList3.size() <= 0) {
                return false;
            }
            new C37802o(arrayList3).d(context);
            if ((bVarB == null || bVarB.a() == null) && (bVarB2 == null || bVarB2.a() == null)) {
                return false;
            }
        } else {
            if (!(p2Var instanceof C39848C)) {
                return false;
            }
            C39848C c39848c = (C39848C) p2Var;
            ArrayList arrayList4 = new ArrayList();
            C37788h c37788h3 = c39848c.f394698D;
            if (c37788h3 != null) {
                arrayList4.add(c37788h3.f364851a);
            }
            com.my.target.common.models.b bVar9 = c39848c.f394741H;
            if (bVar9 != null) {
                arrayList4.add(bVar9);
            }
            new C37802o(arrayList4).d(context);
        }
        return true;
    }

    @Override // e11.T0
    @j.P
    public final AbstractC39858c1 a(@j.N AbstractC39858c1 abstractC39858c1, @j.N C39901r0 c39901r0, @j.N Context context) {
        W0 w02 = (W0) abstractC39858c1;
        p2 p2Var = w02.f394498b;
        if (p2Var == null) {
            X0 x02 = w02.f394557a;
            if (x02 != null && !x02.f394504a.isEmpty()) {
                return w02;
            }
        } else if (c(context, p2Var)) {
            return w02;
        }
        return null;
    }
}
