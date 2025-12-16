package com.avito.android.data_picker_show.datapickershow.mvi;

import com.avito.android.arch.mvi.u;
import com.avito.android.data_picker_show.DataPickerArgs;
import com.avito.android.data_picker_show.datapickershow.mvi.entity.DataPickerShowInternalAction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: DataPickerShowReducer.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/data_picker_show/datapickershow/mvi/j;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/data_picker_show/datapickershow/mvi/entity/DataPickerShowInternalAction;", "Lgu/c;", "<init>", "()V", "_avito_data-picker-show_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class j implements u<DataPickerShowInternalAction, gu.c> {
    @Inject
    public j() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.List<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r0v9 */
    @Override // com.avito.android.arch.mvi.u
    public final gu.c a(DataPickerShowInternalAction dataPickerShowInternalAction, gu.c cVar) {
        ArrayList arrayList;
        DataPickerShowInternalAction dataPickerShowInternalAction2 = dataPickerShowInternalAction;
        gu.c cVar2 = cVar;
        int i12 = 0;
        if (!(dataPickerShowInternalAction2 instanceof DataPickerShowInternalAction.Content)) {
            if (!(dataPickerShowInternalAction2 instanceof DataPickerShowInternalAction.WheelValueSelected)) {
                return cVar2;
            }
            List<String> list = cVar2.f396934c;
            if (list != null) {
                List<String> list2 = list;
                ArrayList arrayList2 = new ArrayList(C42745f0.q(list2, 10));
                for (Object obj : list2) {
                    int i13 = i12 + 1;
                    if (i12 < 0) {
                        C42745f0.H0();
                        throw null;
                    }
                    String str = (String) obj;
                    DataPickerShowInternalAction.WheelValueSelected wheelValueSelected = (DataPickerShowInternalAction.WheelValueSelected) dataPickerShowInternalAction2;
                    if (i12 == wheelValueSelected.f132519b) {
                        str = wheelValueSelected.f132520c;
                    }
                    arrayList2.add(str);
                    i12 = i13;
                }
                arrayList = arrayList2;
            } else {
                arrayList = null;
            }
            return new gu.c(cVar2.f396933b, arrayList, cVar2.f396935d, cVar2.f396936e, cVar2.f396937f);
        }
        DataPickerArgs dataPickerArgs = ((DataPickerShowInternalAction.Content) dataPickerShowInternalAction2).f132518b;
        List<List<String>> list3 = dataPickerArgs.f132463b;
        List<List<String>> list4 = list3;
        ArrayList arrayList3 = new ArrayList(C42745f0.q(list4, 10));
        Iterator it = list4.iterator();
        while (it.hasNext()) {
            List list5 = (List) it.next();
            ArrayList arrayList4 = new ArrayList(C42745f0.q(list5, 10));
            int i14 = 0;
            for (Object obj2 : list5) {
                int i15 = i14 + 1;
                if (i14 < 0) {
                    C42745f0.H0();
                    throw null;
                }
                arrayList4.add(new com.avito.android.lib.design.picker.k(Integer.valueOf(i14), (String) obj2));
                i14 = i15;
            }
            arrayList3.add(arrayList4);
        }
        ?? arrayList5 = dataPickerArgs.f132464c;
        if (arrayList5 == 0) {
            int size = list3.size();
            arrayList5 = new ArrayList(size);
            while (i12 < size) {
                arrayList5.add("");
                i12++;
            }
        }
        List list6 = arrayList5;
        String str2 = dataPickerArgs.f132465d;
        return new gu.c(arrayList3, list6, str2 == null ? "" : str2, dataPickerArgs.f132466e, dataPickerArgs.f132467f);
    }
}
