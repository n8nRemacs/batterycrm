package com.avito.android.select.sectioned_multiselect.tab;

import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TabListComparator.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/select/sectioned_multiselect/tab/u;", "Lcom/avito/android/recycler/data_aware/b;", "<init>", "()V", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class u implements com.avito.android.recycler.data_aware.b {
    @Override // com.avito.android.recycler.data_aware.b
    public final boolean a(@Y61.l TV0.a aVar, @Y61.l TV0.a aVar2) {
        if ((aVar instanceof com.avito.android.select.sectioned_multiselect.Items.section_list.a) && (aVar2 instanceof com.avito.android.select.sectioned_multiselect.Items.section_list.a)) {
            com.avito.android.select.sectioned_multiselect.Items.section_list.a aVar3 = (com.avito.android.select.sectioned_multiselect.Items.section_list.a) aVar;
            com.avito.android.select.sectioned_multiselect.Items.section_list.a aVar4 = (com.avito.android.select.sectioned_multiselect.Items.section_list.a) aVar2;
            if (L.f(aVar3.f266391c, aVar4.f266391c) && L.f(aVar3.f266390b, aVar4.f266390b) && L.f(aVar3.f266392d, aVar4.f266392d)) {
                return true;
            }
        } else if ((aVar instanceof com.avito.android.select.sectioned_multiselect.Items.section_item.section_title.a) && (aVar2 instanceof com.avito.android.select.sectioned_multiselect.Items.section_item.section_title.a)) {
            com.avito.android.select.sectioned_multiselect.Items.section_item.section_title.a aVar5 = (com.avito.android.select.sectioned_multiselect.Items.section_item.section_title.a) aVar;
            com.avito.android.select.sectioned_multiselect.Items.section_item.section_title.a aVar6 = (com.avito.android.select.sectioned_multiselect.Items.section_item.section_title.a) aVar2;
            if (L.f(aVar5.f266383c, aVar6.f266383c) && L.f(aVar5.f266382b, aVar6.f266382b)) {
                return true;
            }
        } else if ((aVar instanceof com.avito.android.select.sectioned_multiselect.Items.section_item.section_checkbox.a) && (aVar2 instanceof com.avito.android.select.sectioned_multiselect.Items.section_item.section_checkbox.a)) {
            com.avito.android.select.sectioned_multiselect.Items.section_item.section_checkbox.a aVar7 = (com.avito.android.select.sectioned_multiselect.Items.section_item.section_checkbox.a) aVar;
            com.avito.android.select.sectioned_multiselect.Items.section_item.section_checkbox.a aVar8 = (com.avito.android.select.sectioned_multiselect.Items.section_item.section_checkbox.a) aVar2;
            if (L.f(aVar7.f266365c, aVar8.f266365c) && L.f(aVar7.f266364b, aVar8.f266364b) && L.f(aVar7.f266366d, aVar8.f266366d) && aVar7.f266367e == aVar8.f266367e && aVar7.f266368f == aVar8.f266368f) {
                return true;
            }
        } else if ((aVar instanceof com.avito.android.select.sectioned_multiselect.Items.section_item.radio_select.a) && (aVar2 instanceof com.avito.android.select.sectioned_multiselect.Items.section_item.radio_select.a)) {
            com.avito.android.select.sectioned_multiselect.Items.section_item.radio_select.a aVar9 = (com.avito.android.select.sectioned_multiselect.Items.section_item.radio_select.a) aVar;
            com.avito.android.select.sectioned_multiselect.Items.section_item.radio_select.a aVar10 = (com.avito.android.select.sectioned_multiselect.Items.section_item.radio_select.a) aVar2;
            if (aVar9.f266351c.equals(aVar10.f266351c) && L.f(aVar9.f266350b, aVar10.f266350b) && aVar9.f266352d == aVar10.f266352d) {
                return true;
            }
        }
        return false;
    }
}
