package com.avito.android.serp.adapter.serp_advert_card;

import android.net.Uri;
import android.os.Parcelable;
import com.avito.android.analytics.event.native_video.VideoStopReason;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.Action;
import com.avito.android.remote.model.DiscountIcon;
import com.avito.android.remote.model.QuorumFilterInfo;
import com.avito.android.remote.model.TravelInstallments;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.badge.Badge;
import com.avito.android.remote.model.buyer_bonuses.BuyerBonuses;
import com.avito.android.remote.model.developer_profile.DeveloperProfile;
import com.avito.android.remote.model.hotel.HotelRating;
import com.avito.android.remote.model.realtor_bonus.RealtorBonus;
import hw.InterfaceC41177b;
import java.util.List;
import java.util.Set;
import kotlin.G0;
import kotlin.Metadata;
import ru.avito.component.serp.AsyncViewportTracker;
import ru.avito.component.serp.DeliveryTerms;
import ru.avito.component.serp.rating_and_reviews.RatingAndReviews;

/* compiled from: SerpAdvertRichCard.kt */
@InterfaceC41177b
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/serp/adapter/serp_advert_card/h;", "LQ81/a;", "Lru/avito/component/serp/AsyncViewportTracker;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.serp.adapter.serp_advert_card.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC34849h extends Q81.a, AsyncViewportTracker {

    /* compiled from: SerpAdvertRichCard.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.serp.adapter.serp_advert_card.h$a */
    public static final class a {
    }

    void Bb(@Y61.l com.avito.android.cyclic_gallery_widget.image_carousel.seller_info.b bVar);

    void C(@Y61.l String str);

    void D0(@Y61.l QuorumFilterInfo quorumFilterInfo);

    void E0(@Y61.l String str);

    void FR(@Y61.l Y41.l lVar, @Y61.l DeveloperProfile developerProfile);

    void H0();

    void H1(@Y61.l Parcelable parcelable);

    void H2(@Y61.l Y41.a<G0> aVar);

    void Ls(@Y61.k Y41.l<? super Boolean, G0> lVar);

    void N30(@Y61.l String str, boolean z12);

    @Y61.k
    Uri O(@Y61.k com.avito.android.image_loader.k kVar);

    void P1(@Y61.l Y41.l<? super Integer, G0> lVar);

    void P5(@Y61.k Y41.l<? super Integer, G0> lVar);

    void Q0(@Y61.l DeliveryTerms deliveryTerms);

    void R0(@Y61.k Y41.l<? super String, G0> lVar);

    void Ro(@Y61.l TravelInstallments travelInstallments);

    void Sc(@Y61.l String str);

    void U40();

    void UN(@Y61.l RealtorBonus realtorBonus);

    void V(@Y61.l String str);

    void VH(@Y61.l Action action, @Y61.k Y41.l<? super DeepLink, G0> lVar);

    void W2();

    void Zr(@Y61.l String str, @Y61.l String str2);

    void a1(@Y61.k Y41.r<? super String, ? super Double, ? super Double, ? super VideoStopReason, G0> rVar);

    void aY(@Y61.l CharSequence charSequence);

    void b0(@Y61.l String str);

    void b00(@Y61.l String str);

    void d1(boolean z12);

    void d4(@Y61.l ru.avito.component.snippet_badge_bar.d dVar);

    void dC(@Y61.l String str, boolean z12, @Y61.l UniversalColor universalColor, boolean z13, boolean z14);

    void dv(@Y61.k Y41.l<? super Boolean, G0> lVar);

    void e1(@Y61.k Badge badge);

    void f1(@Y61.l String str);

    void fY(@Y61.l RatingAndReviews ratingAndReviews);

    void fr(@Y61.l String str, @Y61.l DiscountIcon discountIcon, boolean z12, boolean z13);

    void gs(@Y61.l String str, boolean z12);

    void h(@Y61.l String str);

    void i3(@Y61.k List<? extends com.avito.android.image_loader.k> list);

    void k1(@Y61.l String str);

    @Y61.l
    Parcelable k2();

    void k4(@Y61.k List<com.avito.android.cyclic_gallery_widget.image_carousel.native_video.b> list);

    void ki(@Y61.k Y41.l<? super Boolean, G0> lVar);

    void l5(@Y61.l Y41.a<G0> aVar);

    void mB(boolean z12, boolean z13, boolean z14);

    void nd(boolean z12, boolean z13);

    void nv(boolean z12);

    void o1(boolean z12);

    void o2(@Y61.l String str);

    void oH(@Y61.l HotelRating hotelRating);

    void p7(@Y61.l z80.e eVar);

    void q4(@Y61.k Y41.p<? super String, ? super String, G0> pVar);

    void q7(boolean z12, boolean z13);

    void rG(@Y61.l String str, boolean z12);

    void rJ(@Y61.l String str);

    void sa(@Y61.l String str, boolean z12);

    void setFavorite(boolean z12);

    void setTitle(@Y61.k String str);

    void v5(boolean z12);

    void vE(@Y61.l BuyerBonuses buyerBonuses);

    void vb(@Y61.l String str);

    void w0();

    void w1(boolean z12);

    void w4();

    void wL(@Y61.k Y41.l<? super DeepLink, G0> lVar);

    void wd(@Y61.k Set<com.avito.android.cyclic_gallery_widget.image_carousel.a> set);

    void z0(boolean z12);
}
