package com.avito.android.list.banner;

import Y61.k;
import com.avito.android.C31100l2;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.a0;
import com.avito.android.remote.model.ParametrizedEvent;
import com.avito.android.remote.model.search.suggest.BannerSuggestItem;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: BannerItemPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/list/banner/d;", "Lcom/avito/android/list/banner/h;", "_avito_search-bar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class d implements h {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final C31100l2 f181544b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final InterfaceC28373a f181545c;

    @Inject
    public d(@k C31100l2 c31100l2, @k InterfaceC28373a interfaceC28373a) {
        this.f181544b = c31100l2;
        this.f181545c = interfaceC28373a;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        e eVar2 = (e) eVar;
        BannerSuggestItem bannerSuggestItem = ((com.avito.android.search.a) aVar).f261729c;
        eVar2.qv(bannerSuggestItem.getPadding());
        eVar2.N4(bannerSuggestItem.getTitle(), bannerSuggestItem.getSubtitle());
        eVar2.v(bannerSuggestItem.getBackgroundColor());
        eVar2.c(new c(bannerSuggestItem, this));
        eVar2.i(bannerSuggestItem.getImage());
        ParametrizedEvent showEvent = bannerSuggestItem.getShowEvent();
        if (showEvent != null) {
            this.f181545c.c(a0.a(showEvent));
        }
    }
}
