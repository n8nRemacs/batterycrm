package com.avito.android.advertising.adapter.items.avito.profile_promo_gallery;

import com.avito.android.advertising.adapter.items.buzzoola.profile_promo.ProfilePromoBannerItem;
import com.avito.android.advertising.adapter.items.buzzoola.profile_promo.ProfilePromoGalleryBannerItem;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;

/* compiled from: ProfilePromoGalleryPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class k extends N implements Y41.l<Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ProfilePromoGalleryBannerItem f87252l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(ProfilePromoGalleryBannerItem profilePromoGalleryBannerItem) {
        super(1);
        this.f87252l = profilePromoGalleryBannerItem;
    }

    @Override // Y41.l
    public final G0 invoke(Integer num) {
        ProfilePromoBannerItem profilePromoBannerItem = (ProfilePromoBannerItem) C42745f0.K(num.intValue(), this.f87252l.getProfilePromoItems());
        if (profilePromoBannerItem != null) {
            profilePromoBannerItem.setHidden(true);
        }
        return G0.f406611a;
    }
}
