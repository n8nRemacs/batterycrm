package com.avito.android.extended_profile.mvi;

import com.avito.android.extended_profile.mvi.entity.ExtendedProfileInternalAction;
import com.avito.android.extended_profile_widgets.adapter.search.ExtendedProfileSearchTab;
import com.avito.android.remote.model.notification.NotificationOpenAtTab;
import kotlin.Metadata;

/* compiled from: ExtendedProfileReducer.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/avito/android/extended_profile_widgets/adapter/search/ExtendedProfileSearchTab;", NotificationOpenAtTab.TAB, "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
final class c0 extends kotlin.jvm.internal.N implements Y41.l<ExtendedProfileSearchTab, ExtendedProfileSearchTab> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ExtendedProfileInternalAction f150142l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(ExtendedProfileInternalAction extendedProfileInternalAction) {
        super(1);
        this.f150142l = extendedProfileInternalAction;
    }

    @Override // Y41.l
    public final ExtendedProfileSearchTab invoke(ExtendedProfileSearchTab extendedProfileSearchTab) {
        ExtendedProfileSearchTab extendedProfileSearchTab2 = extendedProfileSearchTab;
        Integer num = ((ExtendedProfileInternalAction.UpdateActiveAdvertsSearchState) this.f150142l).f150229c;
        if (num == null) {
            return extendedProfileSearchTab2;
        }
        return new ExtendedProfileSearchTab(extendedProfileSearchTab2.f154616b, num.intValue(), extendedProfileSearchTab2.f154618d, extendedProfileSearchTab2.f154619e);
    }
}
