package com.avito.android.select.sectioned_multiselect.core;

import com.avito.android.remote.model.ParcelableEntity;
import com.avito.android.remote.model.search.InlineFilterValue;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;

/* compiled from: SectionedMultiselectDialogPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "accept", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class C<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ K f266468b;

    public C(K k12) {
        this.f266468b = k12;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        K k12 = this.f266468b;
        Set<ParcelableEntity<String>> setR8 = k12.f266482g.r8();
        List listM0 = setR8 != null ? C42745f0.M0(setR8) : null;
        if (listM0 == null) {
            listM0 = C42784z0.f406748b;
        }
        SectionedMultiselectCoreFragment sectionedMultiselectCoreFragment = k12.f266490o;
        if (sectionedMultiselectCoreFragment != null) {
            sectionedMultiselectCoreFragment.f266543o0 = true;
            com.avito.android.select.p pVarF5 = sectionedMultiselectCoreFragment.f5();
            if (pVarF5 != null) {
                String str = sectionedMultiselectCoreFragment.f266541m0;
                if (str == null) {
                    str = null;
                }
                pVarF5.j(str, null, listM0);
            }
            if (sectionedMultiselectCoreFragment.f266545q0 != null) {
                List list = listM0;
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
