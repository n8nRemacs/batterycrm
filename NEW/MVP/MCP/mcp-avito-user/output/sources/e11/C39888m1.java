package e11;

import android.content.Context;
import com.my.target.C37788h;
import com.my.target.C37802o;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: e11.m1, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C39888m1 extends T0<C39905s1> {
    @Override // e11.T0
    @j.P
    public final AbstractC39858c1 a(@j.N AbstractC39858c1 abstractC39858c1, @j.N C39901r0 c39901r0, @j.N Context context) {
        C39905s1 c39905s1 = (C39905s1) abstractC39858c1;
        c39905s1.getClass();
        ArrayList arrayList = new ArrayList(c39905s1.f394792b.values());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((J0) it.next()).d();
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            J0 j02 = (J0) it2.next();
            j02.getClass();
            Iterator it3 = new ArrayList(j02.f394373d).iterator();
            while (it3.hasNext()) {
                C37788h c37788h = ((C39913v0) it3.next()).f394698D;
                if (c37788h != null) {
                    com.my.target.common.models.b bVar = c37788h.f364851a;
                    bVar.b();
                    arrayList2.add(bVar);
                }
            }
        }
        if (arrayList2.size() > 0) {
            new C37802o(arrayList2).d(context);
        }
        return c39905s1;
    }
}
