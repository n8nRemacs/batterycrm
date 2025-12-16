package com.avito.android.serp.adapter;

import SK0.b;
import com.avito.android.B2;
import com.avito.android.deep_linking.links.Store;
import com.avito.android.update.UpdateApplicationActivity;
import com.avito.android.util.InterfaceC35845m2;
import i90.C41253a;
import i90.C41255c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import kotlin.collections.C42745f0;
import ru.avito.messenger.internal.C47773d;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class U implements Callable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f268591b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f268592c;

    public /* synthetic */ U(Object obj, int i12) {
        this.f268591b = i12;
        this.f268592c = obj;
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, java.util.Map] */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f268591b) {
            case 0:
                List list = (List) this.f268592c;
                ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((com.avito.conveyor_item.a) it.next()).getF174298h());
                }
                return arrayList;
            case 1:
                return new com.avito.android.service.short_task.metrics.m("network_type", ((com.avito.android.service.short_task.metrics.o) this.f268592c).f274091a.a());
            case 2:
                com.avito.android.service.short_task.metrics.r rVar = (com.avito.android.service.short_task.metrics.r) this.f268592c;
                Set<Map.Entry> setEntrySet = rVar.f274096c.entrySet();
                ArrayList arrayList2 = new ArrayList(C42745f0.q(setEntrySet, 10));
                for (Map.Entry entry : setEntrySet) {
                    arrayList2.add(new com.avito.android.service.short_task.metrics.m((String) entry.getKey(), Boolean.valueOf(rVar.f274094a.b((String) entry.getValue()))));
                }
                return C42745f0.i0(new com.avito.android.service.short_task.metrics.m("push_notification_permission", Boolean.valueOf(rVar.f274095b.b())), arrayList2);
            case 3:
                UpdateApplicationActivity updateApplicationActivity = (UpdateApplicationActivity) this.f268592c;
                InterfaceC35845m2 interfaceC35845m2 = updateApplicationActivity.f306637m;
                if (interfaceC35845m2 == null) {
                    interfaceC35845m2 = null;
                }
                updateApplicationActivity.startActivity(interfaceC35845m2.b(Store.f133676d));
                return kotlin.G0.f406611a;
            case 4:
                com.avito.android.vas_discount.ui.dialog.j jVar = (com.avito.android.vas_discount.ui.dialog.j) this.f268592c;
                return jVar.f319704J.a(jVar.f319703E);
            case 5:
                return (ru.tinkoff.core.tinkoffId.p) ((ru.tinkoff.core.tinkoffId.l) this.f268592c).a();
            case 6:
                i90.d dVar = (i90.d) this.f268592c;
                B2 b22 = dVar.f398403c;
                b22.getClass();
                kotlin.reflect.n<Object> nVar = B2.f67184X[2];
                if (!((Boolean) b22.f67210d.a().invoke()).booleanValue() || !dVar.f398401a.a()) {
                    return Boolean.FALSE;
                }
                b.a.a(dVar.f398402b, new C41253a(), null, null, new C41255c(dVar), 6);
                return Boolean.TRUE;
            default:
                ((C47773d) this.f268592c).f431388a.get().connect();
                return kotlin.G0.f406611a;
        }
    }
}
