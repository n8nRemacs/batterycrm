package com.avito.android.profile.user_profile.cards.comfortable_deal.item_new_status;

import Ua0.InterfaceC15503a;
import Y41.l;
import Y61.k;
import com.avito.android.deep_linking.links.ClickStreamLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.profile.user_profile.cards.CardItem;
import com.avito.android.remote.model.user_profile.items.Banner;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ComfortableDealWithStatusCardItemPresenter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/comfortable_deal/item_new_status/d;", "LTV0/d;", "Lcom/avito/android/profile/user_profile/cards/comfortable_deal/item_new_status/f;", "Lcom/avito/android/profile/user_profile/cards/CardItem$ComfortableDealWithStatusCardItem;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class d implements TV0.d<f, CardItem.ComfortableDealWithStatusCardItem> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<InterfaceC15503a, G0> f224897b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public d(@k l<? super InterfaceC15503a, G0> lVar) {
        this.f224897b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        f fVar = (f) eVar;
        CardItem.ComfortableDealWithStatusCardItem comfortableDealWithStatusCardItem = (CardItem.ComfortableDealWithStatusCardItem) aVar;
        Banner banner = comfortableDealWithStatusCardItem.f224387f;
        DeepLink onShowDeeplink = banner.getOnShowDeeplink();
        if (onShowDeeplink != null && (onShowDeeplink instanceof ClickStreamLink)) {
            this.f224897b.invoke(new InterfaceC15503a.C1130a(onShowDeeplink, false));
        }
        fVar.b(comfortableDealWithStatusCardItem.f224385d);
        fVar.SJ(banner);
        fVar.S(new c(comfortableDealWithStatusCardItem, this));
    }
}
