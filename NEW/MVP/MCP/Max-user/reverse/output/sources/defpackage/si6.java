package defpackage;

import androidx.fragment.app.a;
import androidx.fragment.app.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public final class si6 implements qi6 {
    public final /* synthetic */ c a;

    public si6(c cVar) {
        this.a = cVar;
    }

    @Override // defpackage.qi6
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        c cVar = this.a;
        ue0 ue0Var = (ue0) wy1.d(cVar.d, 1);
        cVar.h = ue0Var;
        Iterator it = ue0Var.a.iterator();
        while (it.hasNext()) {
            a aVar = ((aj6) it.next()).b;
            if (aVar != null) {
                aVar.w0 = true;
            }
        }
        boolean zU = cVar.U(arrayList, arrayList2, -1, 0);
        if (!cVar.n.isEmpty() && arrayList.size() > 0) {
            ((Boolean) arrayList2.get(arrayList.size() - 1)).getClass();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                linkedHashSet.addAll(c.F((ue0) it2.next()));
            }
            Iterator it3 = cVar.n.iterator();
            while (it3.hasNext()) {
                if (it3.next() != null) {
                    throw new ClassCastException();
                }
                Iterator it4 = linkedHashSet.iterator();
                if (it4.hasNext()) {
                    throw null;
                }
            }
        }
        return zU;
    }
}
