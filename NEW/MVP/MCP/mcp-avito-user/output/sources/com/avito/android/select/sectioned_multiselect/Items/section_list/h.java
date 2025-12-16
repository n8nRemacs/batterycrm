package com.avito.android.select.sectioned_multiselect.Items.section_list;

import Y61.l;
import androidx.compose.runtime.internal.P;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SectionsComparator.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/select/sectioned_multiselect/Items/section_list/h;", "Lcom/avito/android/recycler/data_aware/b;", "<init>", "()V", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class h implements com.avito.android.recycler.data_aware.b {
    @Inject
    public h() {
    }

    @Override // com.avito.android.recycler.data_aware.b
    public final boolean a(@l TV0.a aVar, @l TV0.a aVar2) {
        if ((aVar instanceof com.avito.android.select.sectioned_multiselect.Items.section_item.a) && (aVar2 instanceof com.avito.android.select.sectioned_multiselect.Items.section_item.a)) {
            com.avito.android.select.sectioned_multiselect.Items.section_item.a aVar3 = (com.avito.android.select.sectioned_multiselect.Items.section_item.a) aVar;
            com.avito.android.select.sectioned_multiselect.Items.section_item.a aVar4 = (com.avito.android.select.sectioned_multiselect.Items.section_item.a) aVar2;
            if (L.f(aVar3.f266319c, aVar4.f266319c) && L.f(aVar3.f266318b, aVar4.f266318b) && aVar3.f266323g == aVar4.f266323g && L.f(aVar3.f266324h, aVar4.f266324h) && aVar3.f266322f == aVar4.f266322f) {
                return true;
            }
        } else if ((aVar instanceof com.avito.android.select.sectioned_multiselect.Items.section_item.section_checkbox.a) && (aVar2 instanceof com.avito.android.select.sectioned_multiselect.Items.section_item.section_checkbox.a)) {
            com.avito.android.select.sectioned_multiselect.Items.section_item.section_checkbox.a aVar5 = (com.avito.android.select.sectioned_multiselect.Items.section_item.section_checkbox.a) aVar;
            com.avito.android.select.sectioned_multiselect.Items.section_item.section_checkbox.a aVar6 = (com.avito.android.select.sectioned_multiselect.Items.section_item.section_checkbox.a) aVar2;
            if (L.f(aVar5.f266365c, aVar6.f266365c) && L.f(aVar5.f266364b, aVar6.f266364b) && aVar5.f266367e == aVar6.f266367e && L.f(aVar5.f266366d, aVar6.f266366d) && aVar5.f266368f == aVar6.f266368f) {
                return true;
            }
        }
        return false;
    }
}
