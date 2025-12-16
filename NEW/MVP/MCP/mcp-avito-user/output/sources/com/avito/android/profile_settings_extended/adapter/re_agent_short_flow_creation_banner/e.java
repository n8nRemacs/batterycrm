package com.avito.android.profile_settings_extended.adapter.re_agent_short_flow_creation_banner;

import Y41.l;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.event.BannerEvent;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ReAgentShortFlowCreationBannerItemPresenter.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile_settings_extended/adapter/re_agent_short_flow_creation_banner/e;", "LTV0/d;", "Lcom/avito/android/profile_settings_extended/adapter/re_agent_short_flow_creation_banner/g;", "Lcom/avito/android/profile_settings_extended/adapter/re_agent_short_flow_creation_banner/ReAgentShortFlowCreationBannerItem;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class e implements TV0.d<g, ReAgentShortFlowCreationBannerItem> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC28373a f229792b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final l<yc0.k, G0> f229793c;

    @Inject
    public e(@k l lVar, @k InterfaceC28373a interfaceC28373a) {
        this.f229792b = interfaceC28373a;
        this.f229793c = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        g gVar = (g) eVar;
        ReAgentShortFlowCreationBannerItem reAgentShortFlowCreationBannerItem = (ReAgentShortFlowCreationBannerItem) aVar;
        this.f229792b.c(new BannerEvent.i(reAgentShortFlowCreationBannerItem.f229776b, "profile_management", null, null, 12, null));
        gVar.b(reAgentShortFlowCreationBannerItem.f229777c);
        gVar.n(reAgentShortFlowCreationBannerItem.f229778d);
        gVar.uI(reAgentShortFlowCreationBannerItem.f229779e.f229782b);
        gVar.cl(reAgentShortFlowCreationBannerItem.f229780f.f229782b);
        gVar.Fz(new c(this, reAgentShortFlowCreationBannerItem));
        gVar.LB(new d(this, reAgentShortFlowCreationBannerItem));
    }
}
