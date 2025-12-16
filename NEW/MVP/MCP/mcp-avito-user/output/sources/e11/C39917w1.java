package e11;

import android.content.Context;
import android.widget.ImageView;
import com.my.target.C37788h;
import com.my.target.C37802o;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* renamed from: e11.w1, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C39917w1 extends T0<D1> {
    @Override // e11.T0
    @j.P
    public final AbstractC39858c1 a(@j.N AbstractC39858c1 abstractC39858c1, @j.N C39901r0 c39901r0, @j.N Context context) {
        D1 d12 = (D1) abstractC39858c1;
        G0 g02 = d12.f394308b;
        if (g02 == null) {
            X0 x02 = d12.f394557a;
            if (x02 == null || x02.f394504a.isEmpty()) {
                return null;
            }
            return d12;
        }
        C37788h c37788h = g02.f394698D;
        if (c37788h == null) {
            return d12;
        }
        com.my.target.common.models.b bVar = c37788h.f364851a;
        WeakHashMap<ImageView, com.my.target.common.models.b> weakHashMap = C37802o.f365040c;
        ArrayList arrayList = new ArrayList();
        arrayList.add(bVar);
        new C37802o(arrayList).d(context);
        return d12;
    }
}
