package com.avito.android.extended_profile.mvi;

import com.avito.android.extended_profile.mvi.entity.ExtendedProfileInternalAction;
import com.avito.android.extended_profile_adverts.n;
import com.avito.android.public_profile.ui.tab.TabItem;
import com.avito.android.remote.model.AdvertStatus;
import kotlin.Metadata;

/* compiled from: ExtendedProfileReducer.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/avito/android/public_profile/ui/tab/TabItem;", "it", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
final class Z extends kotlin.jvm.internal.N implements Y41.l<TabItem, TabItem> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ExtendedProfileInternalAction f150063l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C f150064m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z(C c12, ExtendedProfileInternalAction extendedProfileInternalAction) {
        super(1);
        this.f150063l = extendedProfileInternalAction;
        this.f150064m = c12;
    }

    @Override // Y41.l
    public final TabItem invoke(TabItem tabItem) {
        TabItem tabItem2 = tabItem;
        n.a aVar = ((ExtendedProfileInternalAction.OnProfileAdvertsUpdates) this.f150063l).f150183b;
        int i12 = aVar.f150958b;
        String str = aVar.f150957a;
        boolean zF2 = kotlin.jvm.internal.L.f(str, "active");
        C c12 = this.f150064m;
        return TabItem.d(tabItem2, zF2 ? c12.f150034c.c(i12) : kotlin.jvm.internal.L.f(str, AdvertStatus.CLOSED) ? c12.f150034c.a(i12) : c12.f150034c.b(i12));
    }
}
