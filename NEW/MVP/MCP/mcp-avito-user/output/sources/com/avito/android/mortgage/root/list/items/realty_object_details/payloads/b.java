package com.avito.android.mortgage.root.list.items.realty_object_details.payloads;

import Y61.k;
import Y61.l;
import Z00.e;
import a10.InterfaceC19665b;
import androidx.compose.runtime.internal.P;
import com.avito.android.mortgage.root.list.items.realty_object_details.payloads.a;
import java.util.ArrayList;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: RealtyObjectDetailsPayloadProvider.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage/root/list/items/realty_object_details/payloads/b;", "LZ00/e;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class b implements e {
    @Inject
    public b() {
    }

    @Override // Z00.e
    @l
    public final Object a(@k InterfaceC19665b interfaceC19665b, @k InterfaceC19665b interfaceC19665b2) {
        if (!(interfaceC19665b instanceof com.avito.android.mortgage.root.list.items.realty_object_details.e) || !(interfaceC19665b2 instanceof com.avito.android.mortgage.root.list.items.realty_object_details.e)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        com.avito.android.mortgage.root.list.items.realty_object_details.e eVar = (com.avito.android.mortgage.root.list.items.realty_object_details.e) interfaceC19665b;
        com.avito.android.mortgage.root.list.items.realty_object_details.b bVar = eVar.f202776c;
        com.avito.android.mortgage.root.list.items.realty_object_details.e eVar2 = (com.avito.android.mortgage.root.list.items.realty_object_details.e) interfaceC19665b2;
        com.avito.android.mortgage.root.list.items.realty_object_details.b bVar2 = eVar2.f202776c;
        int i12 = bVar.f202768c;
        int i13 = bVar2.f202768c;
        if (i12 != i13) {
            arrayList.add(new a.i(i13));
        }
        com.avito.android.mortgage.root.list.items.realty_object_details.a aVar = eVar.f202777d;
        ArrayList arrayList2 = aVar.f202763b;
        com.avito.android.mortgage.root.list.items.realty_object_details.a aVar2 = eVar2.f202777d;
        ArrayList arrayList3 = aVar2.f202763b;
        if (!arrayList2.equals(arrayList3)) {
            arrayList.add(new a.e(arrayList3));
        }
        int i14 = aVar.f202764c;
        int i15 = aVar2.f202764c;
        if (i14 != i15) {
            arrayList.add(new a.h(i15));
        }
        if (!L.f(aVar.a().getTitle(), aVar2.a().getTitle())) {
            arrayList.add(new a.c(aVar2.a().getTitle()));
        }
        if (!L.f(aVar.a().getPlaceholder(), aVar2.a().getPlaceholder())) {
            arrayList.add(new a.b(aVar2.a().getPlaceholder()));
        }
        if (!L.f(aVar.a().getValue(), aVar2.a().getValue())) {
            arrayList.add(new a.d(aVar2.a().getValue()));
        }
        if (!L.f(aVar.a().getError(), aVar2.a().getError())) {
            arrayList.add(new a.C6036a(aVar2.a().getError()));
        }
        KZ.P p12 = aVar.f202765d;
        Long value = p12.getValue();
        KZ.P p13 = aVar2.f202765d;
        if (!L.f(value, p13.getValue())) {
            Long value2 = p13.getValue();
            arrayList.add(new a.g(value2 != null ? value2.toString() : null));
        }
        if (!L.f(p12.getError(), p13.getError())) {
            arrayList.add(new a.f(p13.getError()));
        }
        return com.avito.android.mortgage.util.c.a(arrayList);
    }
}
