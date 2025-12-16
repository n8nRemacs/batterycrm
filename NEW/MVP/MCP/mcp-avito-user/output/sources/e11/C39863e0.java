package e11;

import android.content.Context;
import com.my.target.C37788h;
import com.my.target.C37802o;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: e11.e0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C39863e0 extends T0<C39881k0> {
    @Override // e11.T0
    @j.P
    public final AbstractC39858c1 a(@j.N AbstractC39858c1 abstractC39858c1, @j.N C39901r0 c39901r0, @j.N Context context) {
        C39881k0 c39881k0 = (C39881k0) abstractC39858c1;
        c39881k0.getClass();
        HashMap<String, J0<com.my.target.common.models.e>> map = c39881k0.f394631b;
        Iterator it = new ArrayList(map.values()).iterator();
        while (it.hasNext()) {
            ((J0) it.next()).d();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it2 = new ArrayList(map.values()).iterator();
        while (it2.hasNext()) {
            J0 j02 = (J0) it2.next();
            j02.getClass();
            Iterator it3 = new ArrayList(j02.f394373d).iterator();
            while (it3.hasNext()) {
                C37788h c37788h = ((C39913v0) it3.next()).f394698D;
                if (c37788h != null) {
                    com.my.target.common.models.b bVar = c37788h.f364851a;
                    bVar.b();
                    arrayList.add(bVar);
                }
            }
        }
        if (arrayList.size() > 0) {
            new C37802o(arrayList).d(context);
        }
        return c39881k0;
    }
}
