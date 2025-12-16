package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class kt4 {
    public final k18 a;

    public kt4(k18 k18Var) {
        this.a = k18Var;
    }

    public final void a(long j, long j2, List list, boolean z) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            long jLongValue = ((Number) it.next()).longValue();
            hwa hwaVar = (hwa) this.a.getValue();
            List listSingletonList = Collections.singletonList(new Long(jLongValue));
            int i = z ? -1 : 0;
            if (hwaVar.j(j)) {
                mr2 mr2Var = new mr2(hwaVar.t().a.k(), j, j2, 2, listSingletonList, br2.MEMBER, true, i, 0);
                if (i == 0) {
                    hwa.r(hwaVar, mr2Var);
                } else {
                    hwa.q(hwaVar, mr2Var);
                }
            }
        }
    }
}
