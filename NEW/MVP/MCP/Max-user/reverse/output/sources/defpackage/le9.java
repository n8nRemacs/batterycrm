package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public interface le9 {
    static ArrayList c(pb2 pb2Var, List list) {
        ArrayList arrayList = new ArrayList(we3.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ku3 ku3Var = (ku3) it.next();
            arrayList.add(new zq2(ku3Var, pb2Var.d0(ku3Var.p()) ? 1 : pb2Var.H(ku3Var.p()) ? 2 : 3));
        }
        return arrayList;
    }

    void a(String str);

    x26 b();

    boolean d();

    hbd e();

    void f();
}
