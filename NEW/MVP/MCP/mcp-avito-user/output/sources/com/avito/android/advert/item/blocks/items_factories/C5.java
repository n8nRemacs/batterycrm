package com.avito.android.advert.item.blocks.items_factories;

import com.avito.android.C29640d;
import com.avito.android.advert.di.C27710t;
import com.avito.android.advert.item.marketplace_sales_advert_promo_banner.MarketplaceSalesAdvertPromoBannerItem;
import com.avito.android.remote.model.AdjustParameters;
import com.avito.android.remote.model.AdvertDetails;
import com.avito.android.remote.model.AdvertPrice;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.sales.SalesAdvertPromoBanner;
import com.avito.android.remote.model.sales.utils.Timer;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.InterfaceC35945t1;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: MarketplaceSalesAdvertPromoBannerItemFactory.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/blocks/items_factories/C5;", "Lcom/avito/android/advert/item/blocks/items_factories/B5;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class C5 implements B5 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.similars.j f73720a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C29640d f73721b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35945t1<AdvertPrice> f73722c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35945t1<AdvertPrice> f73723d;

    @Inject
    public C5(@Y61.k com.avito.android.advert.item.similars.j jVar, @Y61.k C29640d c29640d, @Y61.k @C27710t.j InterfaceC35945t1<AdvertPrice> interfaceC35945t1, @C27710t.s @Y61.k InterfaceC35945t1<AdvertPrice> interfaceC35945t12) {
        this.f73720a = jVar;
        this.f73721b = c29640d;
        this.f73722c = interfaceC35945t1;
        this.f73723d = interfaceC35945t12;
    }

    @Override // com.avito.android.advert.item.blocks.items_factories.B5
    @Y61.l
    public final MarketplaceSalesAdvertPromoBannerItem a(@Y61.k AdvertDetails advertDetails) {
        Boolean boolIsPriceInside;
        UniversalImage backgroundImage;
        SalesAdvertPromoBanner.AdvertFrontImage frontImage;
        UniversalImage image;
        MarketplaceSalesAdvertPromoBannerItem.AdvertPromoBannerPriceBlock advertPromoBannerPriceBlock;
        Integer numQ;
        UniversalColor textColor;
        String strA;
        Integer numQ2;
        UniversalColor textColor2;
        UniversalColor strikethroughColor;
        MarketplaceSalesAdvertPromoBannerItem.AdvertPromoBannerPrice advertPromoBannerPrice;
        String oldValueHint;
        Integer numQ3;
        UniversalColor textColor3;
        String textStyle;
        SalesAdvertPromoBanner salesAdvertPromoBanner = advertDetails.getSalesAdvertPromoBanner();
        if (salesAdvertPromoBanner == null || (boolIsPriceInside = salesAdvertPromoBanner.isPriceInside()) == null) {
            return null;
        }
        boolean zBooleanValue = boolIsPriceInside.booleanValue();
        AdvertPrice price = advertDetails.getPrice();
        boolean zIsGoodsPriceRedesign = advertDetails.isGoodsPriceRedesign();
        if (advertDetails.getAdvertisementStyle() != AdvertDetails.AdvertisementStyle.Default && advertDetails.getAdvertisementStyle() != null) {
            return null;
        }
        if (price == null && zBooleanValue) {
            return null;
        }
        C29640d c29640d = this.f73721b;
        c29640d.getClass();
        kotlin.reflect.n<Object> nVar = C29640d.f132175X[40];
        if (!((Boolean) c29640d.f132189N.a().invoke()).booleanValue() || (backgroundImage = salesAdvertPromoBanner.getBackgroundImage()) == null || (frontImage = salesAdvertPromoBanner.getFrontImage()) == null || (image = frontImage.getImage()) == null) {
            return null;
        }
        if (zBooleanValue) {
            String strA2 = this.f73722c.a(price);
            SalesAdvertPromoBanner.TextStyle priceStyle = salesAdvertPromoBanner.getPriceStyle();
            if (priceStyle != null) {
                String textStyle2 = priceStyle.getTextStyle();
                if (textStyle2 == null || (numQ = com.avito.android.lib.util.f.q(textStyle2)) == null) {
                    return null;
                }
            } else {
                numQ = null;
            }
            SalesAdvertPromoBanner.TextStyle priceStyle2 = salesAdvertPromoBanner.getPriceStyle();
            if (priceStyle2 != null) {
                textColor = priceStyle2.getTextColor();
                if (textColor == null) {
                    return null;
                }
            } else {
                textColor = null;
            }
            MarketplaceSalesAdvertPromoBannerItem.AdvertPromoBannerPrice advertPromoBannerPrice2 = new MarketplaceSalesAdvertPromoBannerItem.AdvertPromoBannerPrice(strA2, numQ, textColor, null);
            AttributedText current = price != null ? price.getCurrent() : null;
            if (!zIsGoodsPriceRedesign) {
                current = null;
            }
            if (!advertDetails.isGoodsPriceRedesign()) {
                strA = this.f73723d.a(price);
            } else if (price == null || (strA = price.getOldValue()) == null) {
                strA = "";
            }
            SalesAdvertPromoBanner.TextWithStrikethroughStyle oldPriceStyle = salesAdvertPromoBanner.getOldPriceStyle();
            if (oldPriceStyle != null) {
                String textStyle3 = oldPriceStyle.getTextStyle();
                if (textStyle3 == null || (numQ2 = com.avito.android.lib.util.f.q(textStyle3)) == null) {
                    return null;
                }
            } else {
                numQ2 = null;
            }
            SalesAdvertPromoBanner.TextWithStrikethroughStyle oldPriceStyle2 = salesAdvertPromoBanner.getOldPriceStyle();
            if (oldPriceStyle2 != null) {
                textColor2 = oldPriceStyle2.getTextColor();
                if (textColor2 == null) {
                    return null;
                }
            } else {
                textColor2 = null;
            }
            SalesAdvertPromoBanner.TextWithStrikethroughStyle oldPriceStyle3 = salesAdvertPromoBanner.getOldPriceStyle();
            if (oldPriceStyle3 != null) {
                strikethroughColor = oldPriceStyle3.getStrikethroughColor();
                if (strikethroughColor == null) {
                    return null;
                }
            } else {
                strikethroughColor = null;
            }
            MarketplaceSalesAdvertPromoBannerItem.AdvertPromoBannerPrice advertPromoBannerPrice3 = new MarketplaceSalesAdvertPromoBannerItem.AdvertPromoBannerPrice(strA, numQ2, textColor2, strikethroughColor);
            if (price == null || (oldValueHint = price.getOldValueHint()) == null) {
                advertPromoBannerPrice = null;
            } else {
                SalesAdvertPromoBanner.TextStyle discountStyle = salesAdvertPromoBanner.getDiscountStyle();
                if (discountStyle == null || (textStyle = discountStyle.getTextStyle()) == null) {
                    numQ3 = null;
                } else {
                    numQ3 = com.avito.android.lib.util.f.q(textStyle);
                    if (numQ3 == null) {
                        return null;
                    }
                }
                SalesAdvertPromoBanner.TextStyle discountStyle2 = salesAdvertPromoBanner.getDiscountStyle();
                if (discountStyle2 != null) {
                    textColor3 = discountStyle2.getTextColor();
                    if (textColor3 == null) {
                        return null;
                    }
                } else {
                    textColor3 = null;
                }
                advertPromoBannerPrice = new MarketplaceSalesAdvertPromoBannerItem.AdvertPromoBannerPrice(oldValueHint, numQ3, textColor3, null);
            }
            advertPromoBannerPriceBlock = new MarketplaceSalesAdvertPromoBannerItem.AdvertPromoBannerPriceBlock(advertPromoBannerPrice2, current, advertPromoBannerPrice3, advertPromoBannerPrice);
        } else {
            advertPromoBannerPriceBlock = null;
        }
        MarketplaceSalesAdvertPromoBannerItem.FrontImage frontImage2 = new MarketplaceSalesAdvertPromoBannerItem.FrontImage(image);
        Timer timer = salesAdvertPromoBanner.getTimer();
        AttributedText title = salesAdvertPromoBanner.getTitle();
        AttributedText subtitle = salesAdvertPromoBanner.getSubtitle();
        String id2 = advertDetails.getId();
        String categoryId = advertDetails.getCategoryId();
        AdjustParameters adjustParameters = advertDetails.getAdjustParameters();
        return new MarketplaceSalesAdvertPromoBannerItem(0L, null, new MarketplaceSalesAdvertPromoBannerItem.AdvertPromoBanner(advertPromoBannerPriceBlock, backgroundImage, frontImage2, timer, title, subtitle, id2, categoryId, adjustParameters != null ? adjustParameters.getMicroCategoryId() : null), this.f73720a.a(), null, null, 51, null);
    }
}
