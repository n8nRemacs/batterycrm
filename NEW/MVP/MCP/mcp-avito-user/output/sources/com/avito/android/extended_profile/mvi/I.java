package com.avito.android.extended_profile.mvi;

import com.avito.android.extended_profile.mvi.entity.ExtendedProfileInternalAction;
import com.avito.android.extended_profile_widgets.adapter.search.ExtendedProfileSearchTab;
import com.avito.android.extended_profile_widgets.adapter.search.tabs.SearchTabsItem;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* compiled from: ExtendedProfileReducer.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/extended_profile/data/g;", "group", "invoke", "(Lcom/avito/android/extended_profile/data/g;)Lcom/avito/android/extended_profile/data/g;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class I extends kotlin.jvm.internal.N implements Y41.l<com.avito.android.extended_profile.data.g, com.avito.android.extended_profile.data.g> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ExtendedProfileInternalAction.OnSearchTabSelected f150047l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(ExtendedProfileInternalAction.OnSearchTabSelected onSearchTabSelected) {
        super(1);
        this.f150047l = onSearchTabSelected;
    }

    @Override // Y41.l
    public final com.avito.android.extended_profile.data.g invoke(com.avito.android.extended_profile.data.g gVar) {
        List<ExtendedProfileSearchTab> list;
        com.avito.android.extended_profile.data.g gVar2 = gVar;
        if (!(gVar2 instanceof com.avito.android.extended_profile.data.j)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        com.avito.android.extended_profile.data.j jVar = (com.avito.android.extended_profile.data.j) gVar2;
        SearchTabsItem searchTabsItem = jVar.f149498e.f149493d;
        int iIntValue = 0;
        if (searchTabsItem != null && (list = searchTabsItem.f154850d) != null) {
            Iterator<ExtendedProfileSearchTab> it = list.iterator();
            int i12 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i12 = -1;
                    break;
                }
                if (it.next().f154618d == this.f150047l.f150184b) {
                    break;
                }
                i12++;
            }
            Integer numValueOf = Integer.valueOf(i12);
            if (i12 == -1) {
                numValueOf = null;
            }
            if (numValueOf != null) {
                iIntValue = numValueOf.intValue();
            }
        }
        com.avito.android.extended_profile.data.i iVar = jVar.f149498e;
        SearchTabsItem searchTabsItem2 = iVar.f149493d;
        return com.avito.android.extended_profile.data.j.a(jVar, null, com.avito.android.extended_profile.data.i.a(iVar, searchTabsItem2 != null ? SearchTabsItem.a(searchTabsItem2, null, iIntValue, 7) : null), 3);
    }
}
