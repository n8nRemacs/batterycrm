package defpackage;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class osf implements rl3, ghg {
    public static awd a(List list) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            u61 u61Var = (u61) it.next();
            int[] iArr = gai.a;
            nt1 nt1Var = u61Var.a;
            ti1 ti1Var = nt1Var.b;
            int i = iArr[nt1Var.a.ordinal()];
            if (i == 1) {
                hashSet.add(ti1Var);
            } else if (i == 2) {
                hashSet2.add(ti1Var);
            } else if (i == 3) {
                hashSet3.add(ti1Var);
            }
        }
        return new awd(8, hashSet2);
    }

    @Override // defpackage.ghg
    public Object apply(Object obj) {
        return (byte[]) obj;
    }

    @Override // defpackage.rl3
    public Object j(v6d v6dVar) {
        return new ukd(v6dVar.b(fsc.a(tkd.class)));
    }
}
