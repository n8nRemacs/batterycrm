package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes2.dex */
public final /* synthetic */ class xs4 implements ns8 {
    public final /* synthetic */ ys4 a;

    @Override // defpackage.ns8
    public final void n(os8 os8Var) {
        ys4 ys4Var = this.a;
        ys4Var.d = os8Var;
        Iterator it = ((CopyOnWriteArrayList) ys4Var.b).iterator();
        while (it.hasNext()) {
            ((ns8) it.next()).n(os8Var);
        }
    }
}
