package com.avito.android.extended_profile.mvi;

import com.avito.android.extended_profile.mvi.entity.ExtendedProfileInternalAction;
import com.avito.android.extended_profile_widgets.adapter.search.tabs.SearchTabsItem;
import kotlin.Metadata;

/* compiled from: ExtendedProfileReducer.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/extended_profile/data/g;", "it", "invoke", "(Lcom/avito/android/extended_profile/data/g;)Lcom/avito/android/extended_profile/data/g;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class d0 extends kotlin.jvm.internal.N implements Y41.l<com.avito.android.extended_profile.data.g, com.avito.android.extended_profile.data.g> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C f150152l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ExtendedProfileInternalAction f150153m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(C c12, ExtendedProfileInternalAction extendedProfileInternalAction) {
        super(1);
        this.f150152l = c12;
        this.f150153m = extendedProfileInternalAction;
    }

    @Override // Y41.l
    public final com.avito.android.extended_profile.data.g invoke(com.avito.android.extended_profile.data.g gVar) {
        SearchTabsItem searchTabsItemA;
        com.avito.android.extended_profile.data.g gVar2 = gVar;
        com.avito.android.extended_profile.data.j jVar = gVar2 instanceof com.avito.android.extended_profile.data.j ? (com.avito.android.extended_profile.data.j) gVar2 : null;
        if (jVar == null) {
            return gVar2;
        }
        com.avito.android.extended_profile.data.i iVar = jVar.f149498e;
        SearchTabsItem searchTabsItem = iVar.f149493d;
        if (searchTabsItem != null) {
            b0 b0Var = b0.f150138l;
            c0 c0Var = new c0(this.f150153m);
            this.f150152l.getClass();
            searchTabsItemA = SearchTabsItem.a(searchTabsItem, C.c(searchTabsItem.f154850d, b0Var, c0Var), 0, 11);
        } else {
            searchTabsItemA = null;
        }
        return com.avito.android.extended_profile.data.j.a(jVar, null, com.avito.android.extended_profile.data.i.a(iVar, searchTabsItemA), 3);
    }
}
