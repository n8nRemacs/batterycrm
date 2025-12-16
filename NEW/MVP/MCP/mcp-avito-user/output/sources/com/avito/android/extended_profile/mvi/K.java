package com.avito.android.extended_profile.mvi;

import com.avito.android.extended_profile.mvi.entity.ExtendedProfileInternalAction;
import com.avito.android.extended_profile_widgets.adapter.tabs_with_widgets.TabsWithWidgetsItem;
import kotlin.Metadata;

/* compiled from: ExtendedProfileReducer.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/extended_profile/data/g;", "it", "invoke", "(Lcom/avito/android/extended_profile/data/g;)Lcom/avito/android/extended_profile/data/g;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class K extends kotlin.jvm.internal.N implements Y41.l<com.avito.android.extended_profile.data.g, com.avito.android.extended_profile.data.g> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ExtendedProfileInternalAction.OnTabsWithWidgetsClicked f150049l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K(ExtendedProfileInternalAction.OnTabsWithWidgetsClicked onTabsWithWidgetsClicked) {
        super(1);
        this.f150049l = onTabsWithWidgetsClicked;
    }

    @Override // Y41.l
    public final com.avito.android.extended_profile.data.g invoke(com.avito.android.extended_profile.data.g gVar) {
        com.avito.android.extended_profile.data.e eVar = (com.avito.android.extended_profile.data.e) gVar;
        return com.avito.android.extended_profile.data.e.a(eVar, TabsWithWidgetsItem.a(eVar.f149482d, null, this.f150049l.f150196c, 47), null, 5);
    }
}
