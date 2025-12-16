package e11;

import android.content.Context;
import com.my.target.C37788h;
import com.my.target.C37802o;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes7.dex */
public class q2 extends T0<C39862e> {
    /* JADX WARN: Type inference failed for: r8v9, types: [T, java.lang.String] */
    @Override // e11.T0
    @j.P
    public final AbstractC39858c1 a(@j.N AbstractC39858c1 abstractC39858c1, @j.N C39901r0 c39901r0, @j.N Context context) {
        C39862e c39862e = (C39862e) abstractC39858c1;
        c39862e.getClass();
        ArrayList arrayList = new ArrayList(c39862e.f394575b);
        if (arrayList.isEmpty()) {
            X0 x02 = c39862e.f394557a;
            if (x02 == null || x02.f394504a.isEmpty()) {
                return null;
            }
            return c39862e;
        }
        ArrayList arrayList2 = new ArrayList();
        int i12 = c39901r0.f394771h;
        boolean z12 = i12 == 0 || i12 == 1;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Q0 q02 = (Q0) it.next();
            C39913v0<com.my.target.common.models.e> c39913v0 = q02.f394464I;
            if (c39913v0 != null) {
                com.my.target.common.models.e eVar = (com.my.target.common.models.e) c39913v0.f394856J;
                boolean z13 = i12 == 0 || i12 == 2;
                if (eVar != null && z13 && eVar.f364778e) {
                    eVar.f394307d = (String) new M1().b(eVar.f394304a, null, null, context);
                }
            }
            com.my.target.common.models.b bVar = q02.f394716o;
            if (bVar != null) {
                bVar.b();
                if (z12) {
                    arrayList2.add(bVar);
                }
            }
            com.my.target.common.models.b bVar2 = q02.f394717p;
            if (bVar2 != null) {
                bVar2.b();
                if (z12) {
                    arrayList2.add(bVar2);
                }
            }
            Iterator it2 = q02.d().iterator();
            while (it2.hasNext()) {
                com.my.target.common.models.b bVar3 = ((C39867f1) it2.next()).f394716o;
                if (bVar3 != null) {
                    bVar3.b();
                    if (z12) {
                        arrayList2.add(bVar3);
                    }
                }
            }
            C37788h c37788h = q02.f394698D;
            if (c37788h != null) {
                com.my.target.common.models.b bVar4 = c37788h.f364851a;
                bVar4.b();
                if (z12) {
                    arrayList2.add(bVar4);
                }
            }
            com.my.target.common.models.b bVar5 = q02.f394467L;
            if (bVar5 != null) {
                arrayList2.add(bVar5);
            }
        }
        if (arrayList2.size() <= 0) {
            return c39862e;
        }
        new C37802o(arrayList2).d(context);
        return c39862e;
    }
}
