package com.avito.android.hotel_booking.select_radio.mvi;

import com.avito.android.arch.mvi.u;
import com.avito.android.hotel_booking.RadioItem;
import com.avito.android.hotel_booking.select_radio.mvi.entity.SelectRadioInternalAction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: SelectRadioReducer.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/hotel_booking/select_radio/mvi/m;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/hotel_booking/select_radio/mvi/entity/SelectRadioInternalAction;", "LTI/c;", "<init>", "()V", "_avito_hotel-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class m implements u<SelectRadioInternalAction, TI.c> {
    @Inject
    public m() {
    }

    public static TI.c b(TI.c cVar) {
        List<RadioItem> list = cVar.f15521b;
        List<RadioItem> list2 = list == null ? C42784z0.f406748b : list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        for (RadioItem radioItem : list2) {
            arrayList.add(new com.avito.android.hotel_booking.select_radio.konveyor.radio.c("radio_item" + radioItem.getId(), radioItem.getId(), radioItem.isSelected(), radioItem.d()));
        }
        Integer num = null;
        boolean z12 = false;
        if (list != null) {
            Iterator<RadioItem> it = list.iterator();
            int i12 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i12 = -1;
                    break;
                }
                if (it.next().isSelected()) {
                    break;
                }
                i12++;
            }
            Integer numValueOf = Integer.valueOf(i12);
            if (i12 >= 0) {
                num = numValueOf;
            }
        }
        if (cVar.f15525f && cVar.f15524e != null) {
            z12 = true;
        }
        cVar.f15526g.getClass();
        return TI.c.a(cVar, null, null, null, null, false, new TI.d(arrayList, num, z12), 31);
    }

    @Override // com.avito.android.arch.mvi.u
    public final TI.c a(SelectRadioInternalAction selectRadioInternalAction, TI.c cVar) {
        SelectRadioInternalAction selectRadioInternalAction2 = selectRadioInternalAction;
        TI.c cVar2 = cVar;
        if (selectRadioInternalAction2 instanceof SelectRadioInternalAction.Init) {
            return TI.c.a(cVar2, null, ((SelectRadioInternalAction.Init) selectRadioInternalAction2).f164038b, null, null, false, null, 61);
        }
        ArrayList arrayList = null;
        Object obj = null;
        RadioItem radioItem = null;
        if (selectRadioInternalAction2 instanceof SelectRadioInternalAction.Content) {
            SelectRadioInternalAction.Content content = (SelectRadioInternalAction.Content) selectRadioInternalAction2;
            List<RadioItem> list = content.f164037b;
            if (list != null) {
                Iterator<T> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (((RadioItem) next).isSelected()) {
                        obj = next;
                        break;
                    }
                }
                radioItem = (RadioItem) obj;
            }
            RadioItem radioItem2 = radioItem;
            return b(TI.c.a(cVar2, content.f164037b, null, radioItem2, radioItem2, false, null, 34));
        }
        if (!(selectRadioInternalAction2 instanceof SelectRadioInternalAction.UpdateSelectedItem)) {
            return cVar2;
        }
        SelectRadioInternalAction.UpdateSelectedItem updateSelectedItem = (SelectRadioInternalAction.UpdateSelectedItem) selectRadioInternalAction2;
        RadioItem radioItem3 = cVar2.f15523d;
        String id2 = radioItem3 != null ? radioItem3.getId() : null;
        RadioItem radioItem4 = updateSelectedItem.f164039b;
        boolean z12 = !L.f(id2, radioItem4.getId());
        List<RadioItem> list2 = cVar2.f15521b;
        if (list2 != null) {
            List<RadioItem> list3 = list2;
            arrayList = new ArrayList(C42745f0.q(list3, 10));
            for (RadioItem radioItem5 : list3) {
                arrayList.add(RadioItem.a(radioItem5, Boolean.valueOf(L.f(radioItem5.getId(), radioItem4.getId()))));
            }
        }
        return b(TI.c.a(cVar2, arrayList, null, null, updateSelectedItem.f164039b, z12, null, 38));
    }
}
