package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public interface l22 {
    Set a();

    int b();

    boolean c();

    String d();

    cb8 e();

    void f(Executor executor, oy1 oy1Var);

    default l22 g() {
        return this;
    }

    int h();

    f9g i();

    default f32 j() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new f22() { // from class: k22
            @Override // defpackage.f22
            public final List a(List list) {
                String strD = this.b.d();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    l22 l22Var = (l22) it.next();
                    z5j.b(l22Var instanceof l22);
                    if (l22Var.d().equals(strD)) {
                        return Collections.singletonList(l22Var);
                    }
                }
                throw new IllegalStateException(ho7.i("Unable to find camera with id ", strD, " from list of available cameras."));
            }
        });
        linkedHashSet.add(new y28(h()));
        return new f32(linkedHashSet);
    }

    String k();

    int l(int i);

    boolean m();

    cf5 n();

    i17 o();

    List p(int i);

    cb8 q();

    void r(k02 k02Var);
}
