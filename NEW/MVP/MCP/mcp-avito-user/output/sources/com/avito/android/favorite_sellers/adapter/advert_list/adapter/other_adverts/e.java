package com.avito.android.favorite_sellers.adapter.advert_list.adapter.other_adverts;

import Y61.k;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.section.item.s;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Y1;

/* compiled from: OtherAdvertsItemPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/favorite_sellers/adapter/advert_list/adapter/other_adverts/e;", "Lcom/avito/android/favorite_sellers/adapter/advert_list/adapter/other_adverts/c;", "_avito_favorite-sellers-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class e implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Y1<vC.b> f155512b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final s f155513c;

    @Inject
    public e(@k Y1<vC.b> y12, @k s sVar) {
        this.f155512b = y12;
        this.f155513c = sVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        g gVar = (g) eVar;
        OtherAdvertsItem otherAdvertsItem = (OtherAdvertsItem) aVar;
        gVar.setTitle(otherAdvertsItem.f155501c);
        gVar.setSubtitle(otherAdvertsItem.f155502d);
        gVar.f5(this.f155513c.b(otherAdvertsItem.f155505g));
        DeepLink deepLink = otherAdvertsItem.f155503e;
        if (deepLink != null) {
            gVar.a(new d(this, deepLink));
        }
    }
}
