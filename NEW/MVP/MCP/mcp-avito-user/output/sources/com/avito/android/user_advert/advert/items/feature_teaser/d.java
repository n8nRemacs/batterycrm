package com.avito.android.user_advert.advert.items.feature_teaser;

import Y61.k;
import com.avito.android.advert_core.feature_teasers.common.AdvertDetailsFeatureTeaserItem;
import com.avito.android.advert_core.feature_teasers.common.j;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: MyAdvertFeatureTeaserItemPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_advert/advert/items/feature_teaser/d;", "Lcom/avito/android/user_advert/advert/items/feature_teaser/c;", "Lcom/avito/android/advert_core/feature_teasers/common/j;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class d implements c, j {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.advert_core.feature_teasers.common.k f309383b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.advert_core.feature_teasers.common.g f309384c;

    @Inject
    public d(@k com.avito.android.advert_core.feature_teasers.common.k kVar) {
        this.f309383b = kVar;
        this.f309384c = new com.avito.android.advert_core.feature_teasers.common.g(kVar);
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        this.f309384c.a((f) eVar, (AdvertDetailsFeatureTeaserItem) aVar);
    }
}
