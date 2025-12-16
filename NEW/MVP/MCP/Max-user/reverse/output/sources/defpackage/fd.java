package defpackage;

import java.util.ArrayList;
import java.util.List;
import ru.ok.android.externcalls.analytics.events.SdkMetricStatEvent;

/* loaded from: classes2.dex */
public final class fd implements bi5 {
    public final erb a;

    public fd(erb erbVar) {
        this.a = erbVar;
    }

    @Override // defpackage.bi5
    public final void a(String str, c9a c9aVar, List list, lqb lqbVar) {
        nn8 nn8Var = new nn8();
        nn8Var.put("properties", c9aVar);
        if (lqbVar != null) {
            nn8Var.put("errorType", Integer.valueOf(lqbVar.a()));
        }
        List<imb> list2 = !list.isEmpty() ? list : null;
        if (list2 != null) {
            ArrayList arrayList = new ArrayList(we3.q(list2, 10));
            for (imb imbVar : list2) {
                Object obj = imbVar.a;
                Object obj2 = imbVar.b;
                c9a c9aVar2 = new c9a(2);
                c9aVar2.i(SdkMetricStatEvent.NAME_KEY, obj);
                c9aVar2.i("duration", obj2);
                arrayList.add(c9aVar2);
            }
            nn8Var.put("spans", arrayList);
        }
        ((dd) this.a.f.getValue()).h(new hg8("PERF", str, 0L, 0L, nn8Var.b(), 0L, 44));
    }
}
