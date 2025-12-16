package com.avito.android.hotel_booking.select_single_value.mvi;

import com.avito.android.arch.mvi.u;
import com.avito.android.hotel_booking.Value;
import com.avito.android.hotel_booking.select_single_value.mvi.entity.SelectSingleValueInternalAction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: SelectSingleValueReducer.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/hotel_booking/select_single_value/mvi/l;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/hotel_booking/select_single_value/mvi/entity/SelectSingleValueInternalAction;", "LVI/c;", "<init>", "()V", "_avito_hotel-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class l implements u<SelectSingleValueInternalAction, VI.c> {
    @Inject
    public l() {
    }

    public static VI.c b(VI.c cVar) {
        boolean zBooleanValue;
        List<Value> list = cVar.f17056b;
        List<Value> list2 = list == null ? C42784z0.f406748b : list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        Iterator<T> it = list2.iterator();
        while (true) {
            zBooleanValue = false;
            if (!it.hasNext()) {
                break;
            }
            Value value = (Value) it.next();
            String str = "checkmark_item" + value.getId();
            String id2 = value.getId();
            String title = value.getTitle();
            String subtitle = value.getSubtitle();
            Boolean isChecked = value.getIsChecked();
            if (isChecked != null) {
                zBooleanValue = isChecked.booleanValue();
            }
            arrayList.add(new com.avito.android.hotel_booking.select_single_value.konveyor.checkmark.c(str, id2, title, subtitle, zBooleanValue));
        }
        Integer num = null;
        if (list != null) {
            Iterator<Value> it2 = list.iterator();
            int i12 = 0;
            while (true) {
                if (!it2.hasNext()) {
                    i12 = -1;
                    break;
                }
                if (L.f(it2.next().getIsChecked(), Boolean.TRUE)) {
                    break;
                }
                i12++;
            }
            Integer numValueOf = Integer.valueOf(i12);
            if (i12 >= 0) {
                num = numValueOf;
            }
        }
        if (cVar.f17060f && cVar.f17059e != null) {
            zBooleanValue = true;
        }
        cVar.f17061g.getClass();
        return VI.c.a(cVar, null, null, null, null, false, new VI.d(arrayList, num, zBooleanValue), 31);
    }

    @Override // com.avito.android.arch.mvi.u
    public final VI.c a(SelectSingleValueInternalAction selectSingleValueInternalAction, VI.c cVar) {
        SelectSingleValueInternalAction selectSingleValueInternalAction2 = selectSingleValueInternalAction;
        VI.c cVar2 = cVar;
        if (selectSingleValueInternalAction2 instanceof SelectSingleValueInternalAction.Init) {
            return VI.c.a(cVar2, null, ((SelectSingleValueInternalAction.Init) selectSingleValueInternalAction2).f164110b, null, null, false, null, 61);
        }
        ArrayList arrayList = null;
        Object obj = null;
        Value value = null;
        if (selectSingleValueInternalAction2 instanceof SelectSingleValueInternalAction.Content) {
            SelectSingleValueInternalAction.Content content = (SelectSingleValueInternalAction.Content) selectSingleValueInternalAction2;
            List<Value> list = content.f164109b;
            if (list != null) {
                Iterator<T> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (L.f(((Value) next).getIsChecked(), Boolean.TRUE)) {
                        obj = next;
                        break;
                    }
                }
                value = (Value) obj;
            }
            Value value2 = value;
            return b(VI.c.a(cVar2, content.f164109b, null, value2, value2, false, null, 34));
        }
        if (!(selectSingleValueInternalAction2 instanceof SelectSingleValueInternalAction.UpdateSelectedValue)) {
            return cVar2;
        }
        SelectSingleValueInternalAction.UpdateSelectedValue updateSelectedValue = (SelectSingleValueInternalAction.UpdateSelectedValue) selectSingleValueInternalAction2;
        Value value3 = cVar2.f17058d;
        String id2 = value3 != null ? value3.getId() : null;
        Value value4 = updateSelectedValue.f164111b;
        boolean z12 = !L.f(id2, value4 != null ? value4.getId() : null);
        List<Value> list2 = cVar2.f17056b;
        if (list2 != null) {
            List<Value> list3 = list2;
            ArrayList arrayList2 = new ArrayList(C42745f0.q(list3, 10));
            for (Value value5 : list3) {
                arrayList2.add(Value.a(value5, Boolean.valueOf(L.f(value5.getId(), value4 != null ? value4.getId() : null))));
            }
            arrayList = arrayList2;
        }
        return b(VI.c.a(cVar2, arrayList, null, null, updateSelectedValue.f164111b, z12, null, 38));
    }
}
