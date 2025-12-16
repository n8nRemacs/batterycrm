package com.avito.android.bottom_sheet_group;

import com.avito.android.bottom_sheet_group.items.checkable_item.BottomSheetGroupCheckableItem;
import com.avito.android.remote.model.category_parameters.MultiselectParameter;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BottomSheetGroupDialogPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/bottom_sheet_group/items/checkable_item/BottomSheetGroupCheckableItem;", "item", "Lkotlin/G0;", "accept", "(Lcom/avito/android/bottom_sheet_group/items/checkable_item/BottomSheetGroupCheckableItem;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class b<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f107191b;

    public b(j jVar) {
        this.f107191b = jVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        List list;
        BottomSheetGroupCheckableItem bottomSheetGroupCheckableItem = (BottomSheetGroupCheckableItem) obj;
        j jVar = this.f107191b;
        jVar.getClass();
        boolean z12 = bottomSheetGroupCheckableItem.f107344e;
        BottomSheetGroupParameterWrapper bottomSheetGroupParameterWrapper = jVar.f107392g;
        String str = bottomSheetGroupCheckableItem.f107341b;
        String str2 = bottomSheetGroupCheckableItem.f107342c;
        if (z12) {
            MultiselectParameter multiselectParameterA = BottomSheetGroupParameterWrapper.a(bottomSheetGroupParameterWrapper.f107183a, str2);
            if (multiselectParameterA != null) {
                List list2 = (List) multiselectParameterA.getValue();
                ArrayList arrayList = list2 != null ? new ArrayList(list2) : new ArrayList();
                if (!arrayList.contains(str)) {
                    arrayList.add(str);
                    if (!L.f(multiselectParameterA.getValue(), arrayList)) {
                        multiselectParameterA.setValue(arrayList);
                        multiselectParameterA.setError(null);
                    }
                    bottomSheetGroupParameterWrapper.f107186d.add(str);
                }
            }
        } else {
            MultiselectParameter multiselectParameterA2 = BottomSheetGroupParameterWrapper.a(bottomSheetGroupParameterWrapper.f107183a, str2);
            if (multiselectParameterA2 != null && (list = (List) multiselectParameterA2.getValue()) != null) {
                ArrayList arrayList2 = new ArrayList(list);
                arrayList2.remove(str);
                if (!L.f(multiselectParameterA2.getValue(), arrayList2)) {
                    multiselectParameterA2.setValue(arrayList2);
                    multiselectParameterA2.setError(null);
                }
                bottomSheetGroupParameterWrapper.f107186d.remove(str);
            }
        }
        jVar.c();
    }
}
