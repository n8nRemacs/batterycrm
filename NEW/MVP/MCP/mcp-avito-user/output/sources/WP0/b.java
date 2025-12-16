package Wp0;

import Y61.k;
import androidx.compose.runtime.internal.P;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SelectableGroupItemsConverter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LWp0/b;", "LWp0/a;", "<init>", "()V", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b implements InterfaceC15789a {
    @Override // Wp0.InterfaceC15789a
    @k
    public final ArrayList a(@k List list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            com.avito.conveyor_item.a aVar = (com.avito.conveyor_item.a) obj;
            if (!(aVar instanceof com.avito.android.select.variant.a) || !((com.avito.android.select.variant.a) aVar).f266846n) {
                arrayList2.add(obj);
            }
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            com.avito.conveyor_item.a aVar2 = (com.avito.conveyor_item.a) it.next();
            if (aVar2 instanceof com.avito.android.select.bottom_sheet.blueprints.group.a) {
                arrayList.add(aVar2);
                com.avito.android.select.bottom_sheet.blueprints.group.a aVar3 = (com.avito.android.select.bottom_sheet.blueprints.group.a) aVar2;
                if (aVar3.f265092e || !aVar3.f265093f) {
                    arrayList.addAll(aVar3.f265091d);
                }
            } else {
                arrayList.add(aVar2);
            }
        }
        return arrayList;
    }
}
