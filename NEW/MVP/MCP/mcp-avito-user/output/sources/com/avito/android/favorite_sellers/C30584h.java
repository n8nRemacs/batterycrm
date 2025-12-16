package com.avito.android.favorite_sellers;

import com.avito.android.favorite_sellers.SellerCarouselItem;
import com.avito.android.favorite_sellers.adapter.advert_list.AdvertListItem;
import com.avito.android.favorite_sellers.adapter.advert_list.adapter.other_adverts.OtherAdvertsItem;
import com.avito.android.favorite_sellers.adapter.info.InfoItem;
import com.avito.android.favorite_sellers.adapter.seller.SellerItem;
import com.avito.android.remote.model.AdvertImage;
import com.avito.android.remote.model.AvatarShape;
import com.avito.android.remote.model.DimmedImage;
import com.avito.android.remote.model.FavoriteSeller;
import com.avito.android.remote.model.FavoriteSellersResult;
import com.avito.android.remote.model.FavoriteSellersResultItem;
import com.avito.android.remote.model.FavoriteSellersSectionHeader;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.OtherAdverts;
import com.avito.android.remote.model.SerpAdvert;
import com.avito.android.remote.model.SerpElement;
import com.avito.android.remote.model.recommendation.AdvertWithOverlay;
import com.avito.android.remote.model.recommendation.RecommendationCarousel;
import com.avito.android.remote.model.recommendation.RecommendationCarouselSeller;
import com.avito.android.serp.adapter.AdvertItem;
import com.avito.android.serp.adapter.InterfaceC34904z0;
import com.avito.android.serp.adapter.n1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42756l;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: FavoriteSellersConverter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/favorite_sellers/h;", "Lcom/avito/android/favorite_sellers/g;", "_avito_favorite-sellers-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.favorite_sellers.h, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30584h implements InterfaceC30583g {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC34904z0 f155890a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.serp.adapter.T f155891b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final n1 f155892c;

    @Inject
    public C30584h(@Y61.k InterfaceC34904z0 interfaceC34904z0, @Y61.k com.avito.android.serp.adapter.T t12, @Y61.k n1 n1Var) {
        this.f155890a = interfaceC34904z0;
        this.f155891b = t12;
        this.f155892c = n1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v8, types: [com.avito.android.favorite_sellers.adapter.advert_list.adapter.other_adverts.OtherAdvertsItem] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.ArrayList] */
    @Override // com.avito.android.favorite_sellers.InterfaceC30583g
    @Y61.k
    public final ArrayList a(@Y61.k FavoriteSellersResult favoriteSellersResult) {
        Iterable iterableSingletonList;
        List list;
        C42784z0 c42784z0;
        DimmedImage image;
        AdvertItem otherAdvertsItem;
        C30584h c30584h = this;
        char c12 = 1;
        boolean z12 = false;
        List<FavoriteSellersResultItem> list2 = favoriteSellersResult.getList();
        if (list2 == null) {
            list2 = C42784z0.f406748b;
        }
        ArrayList arrayList = new ArrayList();
        for (FavoriteSellersResultItem favoriteSellersResultItem : list2) {
            if (favoriteSellersResultItem instanceof FavoriteSeller) {
                FavoriteSeller favoriteSeller = (FavoriteSeller) favoriteSellersResultItem;
                List<SerpElement> items = favoriteSeller.getItems();
                if (items == null) {
                    items = C42784z0.f406748b;
                }
                ArrayList arrayList2 = new ArrayList();
                int i12 = z12 ? 1 : 0;
                for (Object obj : items) {
                    int i13 = i12 + 1;
                    if (i12 < 0) {
                        C42745f0.H0();
                        throw null;
                    }
                    SerpElement serpElement = (SerpElement) obj;
                    if (serpElement instanceof SerpAdvert) {
                        otherAdvertsItem = InterfaceC34904z0.a.a(c30584h.f155890a, (SerpAdvert) serpElement, false, false, null, null, 0, null, null, false, 2046);
                    } else if (serpElement instanceof OtherAdverts) {
                        OtherAdverts otherAdverts = (OtherAdverts) serpElement;
                        otherAdvertsItem = new OtherAdvertsItem(AK.c.g(i12, "other_adverts:"), otherAdverts.getTitle(), otherAdverts.getSubtitle(), otherAdverts.getDeepLink());
                    } else {
                        otherAdvertsItem = null;
                    }
                    if (otherAdvertsItem != null) {
                        arrayList2.add(otherAdvertsItem);
                    }
                    i12 = i13;
                }
                c30584h.f155892c.b(arrayList2);
                c30584h.f155891b.b(arrayList2);
                ArrayList arrayList3 = !arrayList2.isEmpty() ? arrayList2 : null;
                AdvertListItem advertListItem = arrayList3 != null ? new AdvertListItem("items:" + favoriteSeller.getUserKey(), favoriteSeller.getUserKey(), arrayList3, favoriteSeller.getIsDisabled(), false, null, 48, null) : null;
                Boolean isShop = favoriteSeller.getIsShop();
                boolean zBooleanValue = isShop != null ? isShop.booleanValue() : z12 ? 1 : 0;
                AvatarShape avatarShape = favoriteSeller.getAvatarShape();
                if (avatarShape == null) {
                    avatarShape = zBooleanValue ? AvatarShape.SQUARE : AvatarShape.CIRCLE;
                }
                FavoriteSellersItem[] favoriteSellersItemArr = new FavoriteSellersItem[2];
                favoriteSellersItemArr[z12 ? 1 : 0] = new SellerItem("seller:" + favoriteSeller.getUserKey(), favoriteSeller.getUserKey(), favoriteSeller.getName(), favoriteSeller.getDescription(), favoriteSeller.getAvatar(), avatarShape, zBooleanValue, favoriteSeller.getIsDisabled(), favoriteSeller.getDeepLink(), false, false, favoriteSeller.getIsNotificationsActivated(), false, favoriteSeller.getHasNewItems(), 5632, null);
                favoriteSellersItemArr[c12] = advertListItem;
                iterableSingletonList = C42756l.B(favoriteSellersItemArr);
            } else if (favoriteSellersResultItem instanceof FavoriteSellersSectionHeader) {
                FavoriteSellersSectionHeader favoriteSellersSectionHeader = (FavoriteSellersSectionHeader) favoriteSellersResultItem;
                iterableSingletonList = Collections.singletonList(new InfoItem("info:" + favoriteSellersSectionHeader.hashCode(), favoriteSellersSectionHeader.getTitle(), favoriteSellersSectionHeader.getSubtitle()));
            } else if (favoriteSellersResultItem instanceof RecommendationCarousel) {
                RecommendationCarousel recommendationCarousel = (RecommendationCarousel) favoriteSellersResultItem;
                String str = "recommendation_carousel:" + UUID.randomUUID();
                List<RecommendationCarouselSeller> entries = recommendationCarousel.getEntries();
                if (entries != null) {
                    List<RecommendationCarouselSeller> list3 = entries;
                    int i14 = 10;
                    ArrayList arrayList4 = new ArrayList(C42745f0.q(list3, 10));
                    ArrayList arrayList5 = arrayList4;
                    for (RecommendationCarouselSeller recommendationCarouselSeller : list3) {
                        String str2 = "seller_carousel_item:" + recommendationCarouselSeller.getUserKey();
                        String userKey = recommendationCarouselSeller.getUserKey();
                        String name = recommendationCarouselSeller.getName();
                        String description = recommendationCarouselSeller.getDescription();
                        Image avatar = recommendationCarouselSeller.getAvatar();
                        Boolean isShop2 = recommendationCarouselSeller.getIsShop();
                        boolean zBooleanValue2 = isShop2 != null ? isShop2.booleanValue() : z12;
                        List<AdvertWithOverlay> adverts = recommendationCarouselSeller.getAdverts();
                        if (adverts != null) {
                            List<AdvertWithOverlay> list4 = adverts;
                            ?? arrayList6 = new ArrayList(C42745f0.q(list4, i14));
                            for (AdvertWithOverlay advertWithOverlay : list4) {
                                AdvertImage image2 = advertWithOverlay.getImage();
                                Image image3 = (image2 == null || (image = image2.getImage()) == null) ? null : image.getImage();
                                AdvertWithOverlay.Overlay overlay = advertWithOverlay.getOverlay();
                                String title = overlay != null ? overlay.getTitle() : null;
                                AdvertWithOverlay.Overlay overlay2 = advertWithOverlay.getOverlay();
                                arrayList6.add(new SellerCarouselItem.Advert(image3, title, overlay2 != null ? overlay2.getSubtitle() : null));
                            }
                            c42784z0 = arrayList6;
                        } else {
                            c42784z0 = C42784z0.f406748b;
                        }
                        ArrayList arrayList7 = arrayList5;
                        arrayList7.add(new SellerCarouselItem(str2, str, userKey, name, description, avatar, zBooleanValue2, c42784z0, recommendationCarouselSeller.getDeepLink(), false, false, null, 3584, null));
                        arrayList5 = arrayList7;
                        i14 = 10;
                        z12 = false;
                    }
                    list = arrayList5;
                } else {
                    list = C42784z0.f406748b;
                }
                iterableSingletonList = Collections.singletonList(new RecommendationItem(str, list, recommendationCarousel.getTitle(), 0, null, 24, null));
            } else {
                iterableSingletonList = C42784z0.f406748b;
            }
            C42745f0.h(iterableSingletonList, arrayList);
            c30584h = this;
            c12 = 1;
            z12 = false;
        }
        return arrayList;
    }
}
