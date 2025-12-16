package com.avito.android.search_suggest.adapter.banner;

import Pp0.InterfaceC14824b;
import TV0.e;
import Y41.l;
import Y61.k;
import com.avito.android.analytics.a0;
import com.avito.android.list.banner.h;
import com.avito.android.remote.model.ParametrizedEvent;
import com.avito.android.remote.model.search.suggest.BannerSuggestItem;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: BannerItemPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search_suggest/adapter/banner/b;", "Lcom/avito/android/list/banner/h;", "_avito_search-suggest_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b implements h {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<InterfaceC14824b, G0> f264147b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public b(@k l<? super InterfaceC14824b, G0> lVar) {
        this.f264147b = lVar;
    }

    @Override // TV0.d
    public final void O5(e eVar, TV0.a aVar, int i12) {
        com.avito.android.list.banner.e eVar2 = (com.avito.android.list.banner.e) eVar;
        com.avito.android.search.a aVar2 = (com.avito.android.search.a) aVar;
        BannerSuggestItem bannerSuggestItem = aVar2.f261729c;
        eVar2.qv(bannerSuggestItem.getPadding());
        eVar2.N4(bannerSuggestItem.getTitle(), bannerSuggestItem.getSubtitle());
        eVar2.v(bannerSuggestItem.getBackgroundColor());
        eVar2.i(bannerSuggestItem.getImage());
        ParametrizedEvent showEvent = bannerSuggestItem.getShowEvent();
        if (showEvent != null) {
            this.f264147b.invoke(new InterfaceC14824b.g(a0.a(showEvent)));
        }
        eVar2.c(new a(bannerSuggestItem, this, aVar2));
    }
}
