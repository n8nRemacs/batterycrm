package com.avito.android.serp.adapter.search_bar;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.ItemsSearchLink;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.search.suggest.SuggestAction;
import com.avito.android.remote.model.search.suggest.SuggestAnalyticsEvent;
import com.avito.android.remote.model.search.suggest.SuggestDeeplink;
import com.avito.android.remote.model.ux_feedback.UxFeedbackConfigOld;
import com.avito.android.search_ux_feedback.SearchFeedbackCampaign;
import com.avito.android.search_ux_feedback.remote.SearchRemoteFeedbackEvent;
import java.util.List;
import kotlin.Metadata;
import rn0.InterfaceC47691c;

/* compiled from: SearchBarItemPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/model/search/suggest/SuggestAction;", "action", "Lkotlin/G0;", "accept", "(Lcom/avito/android/remote/model/search/suggest/SuggestAction;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class D<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C34840t f271581b;

    public D(C34840t c34840t) {
        this.f271581b = c34840t;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        SearchParams searchParams;
        SuggestAction suggestAction = (SuggestAction) obj;
        boolean z12 = suggestAction instanceof SuggestDeeplink;
        C34840t c34840t = this.f271581b;
        if (!z12) {
            if (suggestAction instanceof SuggestAnalyticsEvent) {
                InterfaceC28373a interfaceC28373a = c34840t.f271665f;
                SuggestAnalyticsEvent suggestAnalyticsEvent = (SuggestAnalyticsEvent) suggestAction;
                com.avito.android.analytics.event.B.f89904c.getClass();
                interfaceC28373a.c(new com.avito.android.analytics.event.B(suggestAnalyticsEvent.getId(), suggestAnalyticsEvent.getVersion(), suggestAnalyticsEvent.getParameters(), null));
                return;
            }
            return;
        }
        c34840t.f271663d.get().r();
        SuggestDeeplink suggestDeeplink = (SuggestDeeplink) suggestAction;
        DeepLink deepLink = suggestDeeplink.getDeepLink();
        ItemsSearchLink itemsSearchLink = deepLink instanceof ItemsSearchLink ? (ItemsSearchLink) deepLink : null;
        InterfaceC47691c.a.a(c34840t.f271664e.get(), itemsSearchLink != null ? ItemsSearchLink.a(itemsSearchLink, null, null, "homeFromSuggestSearch", null, 262079) : suggestDeeplink.getDeepLink(), null, 14);
        DeepLink deepLink2 = suggestDeeplink.getDeepLink();
        ItemsSearchLink itemsSearchLink2 = deepLink2 instanceof ItemsSearchLink ? (ItemsSearchLink) deepLink2 : null;
        c34840t.f271666g.a(new SearchFeedbackCampaign.b((itemsSearchLink2 == null || (searchParams = itemsSearchLink2.f133403b) == null) ? null : searchParams.getCategoryId(), null));
        List<UxFeedbackConfigOld> list = c34840t.f271677r;
        if (list != null) {
            com.avito.android.delayed_ux_feedback.d dVar = c34840t.f271667h;
            dVar.ge(list);
            dVar.ga(SearchRemoteFeedbackEvent.f264412e);
        }
    }
}
