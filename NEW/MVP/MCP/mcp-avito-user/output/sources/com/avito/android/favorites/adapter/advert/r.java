package com.avito.android.favorites.adapter.advert;

import android.net.Uri;
import android.view.View;
import com.avito.android.cart_snippet_actions.models.ui.Stepper;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.related_products.RelatedProductsEntryPointState;
import com.avito.android.remote.model.AdvertAction;
import com.avito.android.remote.model.BuyWithDeliveryInFavorites;
import com.avito.android.remote.model.DiscountIcon;
import com.avito.android.remote.model.autotekateaser.AutotekaLink;
import com.avito.android.remote.model.autotekateaser.AutotekaPurchaseAction;
import com.avito.android.remote.model.badge_bar.SerpBadgeBar;
import com.avito.android.remote.model.sales.utils.BadgeSticker;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: FavoriteAdvertItemView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/favorites/adapter/advert/r;", "LTV0/e;", "_avito-discouraged_avito-libs_favorite-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface r extends TV0.e {

    /* compiled from: FavoriteAdvertItemView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    void BW();

    void Bh(@Y61.k Y41.l<? super Integer, G0> lVar);

    void C(@Y61.l String str);

    void CS(@Y61.l String str, boolean z12);

    void CX(int i12);

    void Ce(@Y61.l Long l12);

    void EK(@Y61.l BadgeSticker badgeSticker, boolean z12);

    void F0(@Y61.l Y41.a<G0> aVar);

    void FQ(@Y61.l Y41.a<G0> aVar);

    void G00(@Y61.k AttributedText attributedText, @Y61.k RelatedProductsEntryPointState relatedProductsEntryPointState, @Y61.k Y41.a<G0> aVar);

    void Jk(@Y61.l Stepper stepper);

    void KD(@Y61.l SerpBadgeBar serpBadgeBar);

    @Y61.k
    Uri O(@Y61.k com.avito.android.image_loader.k kVar);

    void V(@Y61.l String str);

    void XN();

    void c(@Y61.l Y41.a<G0> aVar);

    void d(@Y61.l Y41.a<G0> aVar);

    void fM(@Y61.l String str, boolean z12);

    void i50(@Y61.l String str, @Y61.l DiscountIcon discountIcon, boolean z12);

    void iI(@Y61.l AdvertAction.Phone phone, @Y61.l AdvertAction.Messenger messenger, @Y61.l AdvertAction advertAction, @Y61.k Y41.l lVar);

    void kG(@Y61.l String str);

    void ms(@Y61.l com.avito.android.extended_profile_ui_components.c cVar);

    void nd(boolean z12, boolean z13);

    void rr(@Y61.l BuyWithDeliveryInFavorites buyWithDeliveryInFavorites);

    void setFavorite(boolean z12);

    void setOnAddToCartClickListener(@Y61.l View.OnClickListener onClickListener);

    void setTitle(@Y61.k String str);

    void tT(@Y61.l AutotekaPurchaseAction autotekaPurchaseAction, @Y61.l AutotekaLink autotekaLink, @Y61.k Y41.l<? super AutotekaPurchaseAction, G0> lVar, @Y61.k Y41.l<? super DeepLink, G0> lVar2);

    void vu(@Y61.l String str, boolean z12, @Y61.k Y41.a aVar);

    void x(@Y61.k com.avito.android.image_loader.k kVar);
}
