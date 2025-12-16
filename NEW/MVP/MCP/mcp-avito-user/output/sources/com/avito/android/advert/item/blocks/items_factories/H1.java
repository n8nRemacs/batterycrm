package com.avito.android.advert.item.blocks.items_factories;

import com.avito.android.advert.item.fmp.products.AdvertDetailsFmpProductsItem;
import com.avito.android.advert.item.fmp.products.MortgageTile;
import com.avito.android.remote.fmp.Icons;
import com.avito.android.remote.fmp.Margin;
import com.avito.android.remote.fmp.Padding;
import com.avito.android.remote.model.AdvertDetails;
import com.avito.android.remote.model.fmp.EnumPosition;
import com.avito.android.remote.model.fmp.Fmp;
import com.avito.android.remote.model.fmp.FmpProducts;
import com.avito.android.remote.model.fmp.Tile;
import com.avito.android.remote.model.fmp.util.Background;
import com.avito.android.remote.model.fmp.util.FmpAnalyticsEvent;
import com.avito.android.remote.model.fmp.util.Size;
import com.avito.android.remote.model.text.AttributedText;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: AdvertDetailsFmpProductsItemFactory.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/blocks/items_factories/H1;", "Lcom/avito/android/advert/item/blocks/items_factories/G1;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class H1 implements G1 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.similars.j f73763a;

    @Inject
    public H1(@Y61.k com.avito.android.advert.item.similars.j jVar) {
        this.f73763a = jVar;
    }

    @Override // com.avito.android.advert.item.blocks.items_factories.G1
    @Y61.l
    public final AdvertDetailsFmpProductsItem a(@Y61.k AdvertDetails advertDetails) {
        FmpProducts products;
        ArrayList arrayList;
        MortgageTile mortgageTile;
        ArrayList arrayList2;
        H1 h12;
        Fmp fmp = advertDetails.getFmp();
        if (fmp == null || (products = fmp.getProducts()) == null) {
            return null;
        }
        List<Tile> tiles = products.getTiles();
        if (tiles != null) {
            List<Tile> list = tiles;
            ArrayList arrayList3 = new ArrayList(C42745f0.q(list, 10));
            for (Tile tile : list) {
                AttributedText title = tile.getTitle();
                AttributedText subtitle = tile.getSubtitle();
                Icons iconsB = J1.b(tile.getIcons());
                String deeplink = tile.getDeeplink();
                Background background = tile.getBackground();
                com.avito.android.remote.fmp.Background background2 = background != null ? new com.avito.android.remote.fmp.Background(background.getSolid(), background.getGradient(), background.getCornerRadius(), background.getImage()) : null;
                Padding paddingD = J1.d(tile.getPadding());
                Margin marginC = J1.c(tile.getMargin());
                Size size = tile.getSize();
                com.avito.android.remote.fmp.Size sizeE = size != null ? J1.e(size) : null;
                List<FmpAnalyticsEvent> onClick = tile.getOnClick();
                ArrayList arrayListA = onClick != null ? J1.a(onClick) : null;
                List<FmpAnalyticsEvent> onAppear = tile.getOnAppear();
                arrayList3.add(new com.avito.android.advert.item.fmp.products.Tile(title, subtitle, iconsB, deeplink, background2, paddingD, marginC, sizeE, arrayListA, onAppear != null ? J1.a(onAppear) : null));
            }
            arrayList = arrayList3;
        } else {
            arrayList = null;
        }
        com.avito.android.remote.model.fmp.MortgageTile mortgageTile2 = products.getMortgageTile();
        if (mortgageTile2 != null) {
            AttributedText title2 = mortgageTile2.getTitle();
            AttributedText subtitle2 = mortgageTile2.getSubtitle();
            Integer position = mortgageTile2.getPosition();
            Icons iconsB2 = J1.b(mortgageTile2.getIcons());
            String errorOffersTitle = mortgageTile2.getErrorOffersTitle();
            String paymentTemplate = mortgageTile2.getPaymentTemplate();
            String deeplink2 = mortgageTile2.getDeeplink();
            Background background3 = mortgageTile2.getBackground();
            com.avito.android.remote.fmp.Background background4 = background3 != null ? new com.avito.android.remote.fmp.Background(background3.getSolid(), background3.getGradient(), background3.getCornerRadius(), background3.getImage()) : null;
            Padding paddingD2 = J1.d(mortgageTile2.getPadding());
            Margin marginC2 = J1.c(mortgageTile2.getMargin());
            Size size2 = mortgageTile2.getSize();
            com.avito.android.remote.fmp.Size sizeE2 = size2 != null ? J1.e(size2) : null;
            List<FmpAnalyticsEvent> onClick2 = mortgageTile2.getOnClick();
            ArrayList arrayListA2 = onClick2 != null ? J1.a(onClick2) : null;
            List<FmpAnalyticsEvent> onAppear2 = mortgageTile2.getOnAppear();
            mortgageTile = new MortgageTile(title2, subtitle2, position, iconsB2, errorOffersTitle, paymentTemplate, deeplink2, background4, paddingD2, marginC2, sizeE2, arrayListA2, onAppear2 != null ? J1.a(onAppear2) : null);
        } else {
            mortgageTile = null;
        }
        Padding paddingD3 = J1.d(products.getPadding());
        Margin marginC3 = J1.c(products.getMargin());
        EnumPosition position2 = products.getPosition();
        com.avito.android.remote.fmp.EnumPosition enumPositionValueOf = position2 != null ? com.avito.android.remote.fmp.EnumPosition.valueOf(position2.name()) : null;
        Size size3 = products.getSize();
        com.avito.android.remote.fmp.Size sizeE3 = size3 != null ? J1.e(size3) : null;
        List<FmpAnalyticsEvent> onAppear3 = products.getOnAppear();
        if (onAppear3 != null) {
            ArrayList arrayListA3 = J1.a(onAppear3);
            h12 = this;
            arrayList2 = arrayListA3;
        } else {
            arrayList2 = null;
            h12 = this;
        }
        return new AdvertDetailsFmpProductsItem(arrayList, mortgageTile, paddingD3, marginC3, sizeE3, enumPositionValueOf, arrayList2, 0L, null, h12.f73763a.a(), null, null, 3456, null);
    }
}
