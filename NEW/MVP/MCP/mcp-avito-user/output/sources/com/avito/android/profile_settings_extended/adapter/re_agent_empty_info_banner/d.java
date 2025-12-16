package com.avito.android.profile_settings_extended.adapter.re_agent_empty_info_banner;

import Y41.l;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.event.BannerEvent;
import com.avito.android.remote.model.text.AttributedText;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ReAgentEmptyInfoBannerItemPresenter.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile_settings_extended/adapter/re_agent_empty_info_banner/d;", "LTV0/d;", "Lcom/avito/android/profile_settings_extended/adapter/re_agent_empty_info_banner/f;", "Lcom/avito/android/profile_settings_extended/adapter/re_agent_empty_info_banner/ReAgentEmptyInfoBannerItem;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class d implements TV0.d<f, ReAgentEmptyInfoBannerItem> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC28373a f229768b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final l<yc0.k, G0> f229769c;

    @Inject
    public d(@k l lVar, @k InterfaceC28373a interfaceC28373a) {
        this.f229768b = interfaceC28373a;
        this.f229769c = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        f fVar = (f) eVar;
        ReAgentEmptyInfoBannerItem reAgentEmptyInfoBannerItem = (ReAgentEmptyInfoBannerItem) aVar;
        this.f229768b.c(new BannerEvent.i(reAgentEmptyInfoBannerItem.f229755b, "profile_management", null, null, 12, null));
        fVar.b(reAgentEmptyInfoBannerItem.f229756c);
        AttributedText attributedText = reAgentEmptyInfoBannerItem.f229757d;
        fVar.q(attributedText);
        fVar.gR(reAgentEmptyInfoBannerItem.f229758e.f229760b);
        attributedText.setOnDeepLinkClickListener(new com.avito.android.advert_details_items.buyer_bonuses.g(4, this, reAgentEmptyInfoBannerItem));
        fVar.L0(new c(this, reAgentEmptyInfoBannerItem));
    }
}
