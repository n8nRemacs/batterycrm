package com.avito.android.select.sectioned_multiselect.core;

import com.avito.android.remote.model.ParcelableEntity;
import com.avito.android.remote.model.search.InlineFilterValue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: SectionedMultiselectDialogPresenter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/remote/model/ParcelableEntity;", "", "selectRadio", "Lkotlin/G0;", "accept", "(Lcom/avito/android/remote/model/ParcelableEntity;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class x<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ K f266686b;

    public x(K k12) {
        this.f266686b = k12;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        ParcelableEntity parcelableEntity = (ParcelableEntity) obj;
        K k12 = this.f266686b;
        k12.f266482g.p6(true);
        SectionedMultiselectCoreFragment sectionedMultiselectCoreFragment = k12.f266490o;
        if (sectionedMultiselectCoreFragment != null) {
            List listSingletonList = Collections.singletonList(parcelableEntity);
            sectionedMultiselectCoreFragment.f266543o0 = true;
            com.avito.android.select.p pVarF5 = sectionedMultiselectCoreFragment.f5();
            if (pVarF5 != null) {
                String str = sectionedMultiselectCoreFragment.f266541m0;
                if (str == null) {
                    str = null;
                }
                pVarF5.j(str, null, listSingletonList);
            }
            if (sectionedMultiselectCoreFragment.f266545q0 != null) {
                List list = listSingletonList;
                ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add((String) ((ParcelableEntity) it.next()).getId());
                }
                new InlineFilterValue.InlineFilterSectionedMultiSelectValue(arrayList);
            }
            sectionedMultiselectCoreFragment.dismissAllowingStateLoss();
        }
    }
}
