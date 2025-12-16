package com.avito.android.bottom_sheet_group;

import com.avito.android.bottom_sheet_group.items.checkable_item.BottomSheetGroupCheckableItem;
import com.avito.android.bottom_sheet_group.items.multiselect_item.BottomSheetMultiselectItem;
import com.avito.android.remote.model.category_parameters.MultiselectParameter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: GroupItemConverter.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/bottom_sheet_group/w;", "", "<init>", "()V", "_avito_bottom-sheet-group_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class w {
    @Inject
    public w() {
    }

    @Y61.k
    public static ArrayList a(@Y61.k List list, @Y61.l Map map) {
        boolean zBooleanValue;
        boolean z12;
        List<String> topValues;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        int i12 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i13 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            MultiselectParameter multiselectParameter = (MultiselectParameter) next;
            boolean z13 = i12 == 0;
            String id2 = multiselectParameter.getId();
            String title = multiselectParameter.getTitle();
            List<? extends String> value = multiselectParameter.getValue();
            List<MultiselectParameter.Value> values = multiselectParameter.getValues();
            ArrayList arrayList2 = new ArrayList(C42745f0.q(values, 10));
            for (MultiselectParameter.Value value2 : values) {
                List<? extends String> value3 = multiselectParameter.getValue();
                arrayList2.add(new BottomSheetGroupCheckableItem(value2.getId(), multiselectParameter.getId(), value2.getTitle(), value3 != null ? value3.contains(value2.getId()) : false));
            }
            List<MultiselectParameter.Value> values2 = multiselectParameter.getValues();
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : values2) {
                MultiselectParameter.Value value4 = (MultiselectParameter.Value) obj;
                MultiselectParameter.Displaying displaying = multiselectParameter.getDisplaying();
                if ((displaying == null || (topValues = displaying.getTopValues()) == null) ? false : topValues.contains(value4.getId())) {
                    arrayList3.add(obj);
                }
            }
            ArrayList arrayList4 = new ArrayList(C42745f0.q(arrayList3, 10));
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                MultiselectParameter.Value value5 = (MultiselectParameter.Value) it2.next();
                List<? extends String> value6 = multiselectParameter.getValue();
                Iterator it3 = it;
                arrayList4.add(new BottomSheetGroupCheckableItem(value5.getId(), multiselectParameter.getId(), value5.getTitle(), value6 != null ? value6.contains(value5.getId()) : false));
                it = it3;
            }
            Iterator it4 = it;
            MultiselectParameter.Displaying displaying2 = multiselectParameter.getDisplaying();
            Boolean hideTitle = displaying2 != null ? displaying2.getHideTitle() : null;
            List<? extends String> value7 = multiselectParameter.getValue();
            MultiselectParameter.Displaying displaying3 = multiselectParameter.getDisplaying();
            List<String> topValues2 = displaying3 != null ? displaying3.getTopValues() : null;
            String id3 = multiselectParameter.getId();
            if (topValues2 != null) {
                if (map != null) {
                    zBooleanValue = true;
                    if (map.containsKey(id3)) {
                        zBooleanValue = ((Boolean) map.getOrDefault(id3, Boolean.FALSE)).booleanValue();
                    }
                    z12 = zBooleanValue;
                    break;
                }
                zBooleanValue = true;
                if (value7 != null) {
                    List<? extends String> list2 = value7;
                    if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                        Iterator<T> it5 = list2.iterator();
                        while (it5.hasNext()) {
                            if (!topValues2.contains((String) it5.next())) {
                                z12 = zBooleanValue;
                                break;
                                break;
                            }
                        }
                    }
                }
                z12 = false;
            } else {
                z12 = false;
            }
            arrayList.add(new BottomSheetMultiselectItem(id2, title, value, arrayList2, arrayList4, z12, hideTitle, z13));
            i12 = i13;
            it = it4;
        }
        return arrayList;
    }
}
