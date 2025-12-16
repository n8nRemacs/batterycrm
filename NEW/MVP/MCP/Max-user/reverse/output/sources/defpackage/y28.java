package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class y28 implements f22 {
    public final int b;

    public y28(int i) {
        this.b = i;
    }

    @Override // defpackage.f22
    public final List a(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            l22 l22Var = (l22) it.next();
            z5j.a("The camera info doesn't contain internal implementation.", l22Var instanceof l22);
            if (l22Var.h() == this.b) {
                arrayList.add(l22Var);
            }
        }
        return arrayList;
    }
}
