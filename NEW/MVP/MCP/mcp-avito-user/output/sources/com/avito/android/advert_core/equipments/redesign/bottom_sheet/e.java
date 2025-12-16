package com.avito.android.advert_core.equipments.redesign.bottom_sheet;

import com.avito.android.advert_core.equipments.redesign.bottom_sheet.item.gap.DialogOptionGapItem;
import com.avito.android.advert_core.equipments.redesign.bottom_sheet.item.text.DialogOptionTextItem;
import com.avito.android.advert_core.equipments.redesign.bottom_sheet.item.title.DialogOptionTitleItem;
import com.avito.android.remote.model.AdvertEquipments;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.s0;
import x9.InterfaceC49794a;

/* compiled from: EquipmentsDialogItemConverter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_core/equipments/redesign/bottom_sheet/e;", "Lcom/avito/android/advert_core/equipments/redesign/bottom_sheet/d;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class e implements d {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC49794a f83491a;

    @Inject
    public e(@Y61.k InterfaceC49794a interfaceC49794a) {
        this.f83491a = interfaceC49794a;
    }

    @Override // com.avito.android.advert_core.equipments.redesign.bottom_sheet.d
    @Y61.k
    public final ArrayList a(@Y61.k List list) {
        InterfaceC49794a interfaceC49794a;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            interfaceC49794a = this.f83491a;
            if (!zHasNext) {
                break;
            }
            AdvertEquipments.EquipmentOption equipmentOption = (AdvertEquipments.EquipmentOption) it.next();
            if (!equipmentOption.getValues().isEmpty()) {
                int f442267b = arrayList.isEmpty() ? interfaceC49794a.getF442267b() : interfaceC49794a.getF442268c();
                n0 n0Var = m0.f406844a;
                arrayList.add(new DialogOptionGapItem(n0Var.b(DialogOptionGapItem.class).toString(), f442267b));
                arrayList.add(new DialogOptionTitleItem(n0Var.b(DialogOptionTitleItem.class).toString(), equipmentOption.getTitle()));
                for (String str : equipmentOption.getValues()) {
                    int f442267b2 = interfaceC49794a.getF442267b();
                    n0 n0Var2 = m0.f406844a;
                    arrayList.add(new DialogOptionGapItem(n0Var2.b(DialogOptionGapItem.class).toString(), f442267b2));
                    arrayList.add(new DialogOptionTextItem(n0Var2.b(DialogOptionTextItem.class).toString(), str));
                }
            }
        }
        if (!arrayList.isEmpty()) {
            arrayList.add(new DialogOptionGapItem(m0.f406844a.b(DialogOptionGapItem.class).toString(), interfaceC49794a.getF442269d()));
        }
        return arrayList;
    }
}
