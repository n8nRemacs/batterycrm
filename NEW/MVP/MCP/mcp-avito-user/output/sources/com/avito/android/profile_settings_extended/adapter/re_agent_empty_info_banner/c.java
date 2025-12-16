package com.avito.android.profile_settings_extended.adapter.re_agent_empty_info_banner;

import com.avito.android.analytics.event.BannerEvent;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.ProfileSettingsLink;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.N;
import kotlin.text.C43066x;
import yc0.v;

/* compiled from: ReAgentEmptyInfoBannerItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class c extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ d f229766l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ReAgentEmptyInfoBannerItem f229767m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, ReAgentEmptyInfoBannerItem reAgentEmptyInfoBannerItem) {
        super(0);
        this.f229766l = dVar;
        this.f229767m = reAgentEmptyInfoBannerItem;
    }

    @Override // Y41.a
    public final G0 invoke() {
        String str;
        d dVar = this.f229766l;
        ReAgentEmptyInfoBannerItem reAgentEmptyInfoBannerItem = this.f229767m;
        dVar.f229768b.c(new BannerEvent.a(reAgentEmptyInfoBannerItem.f229755b, "profile_management", null, "button-click", 4, null));
        DeepLink deepLink = reAgentEmptyInfoBannerItem.f229758e.f229761c;
        List listM0 = null;
        ProfileSettingsLink profileSettingsLink = deepLink instanceof ProfileSettingsLink ? (ProfileSettingsLink) deepLink : null;
        if (profileSettingsLink != null && (str = profileSettingsLink.f133614c) != null) {
            listM0 = C42745f0.M0(C43066x.f0(str, new String[]{","}, 0, 6));
        }
        if (listM0 == null) {
            listM0 = C42784z0.f406748b;
        }
        if (!listM0.isEmpty()) {
            dVar.f229769c.invoke(new v(listM0));
        }
        return G0.f406611a;
    }
}
