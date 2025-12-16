package com.avito.android.advert_details_items.price.realty;

import Y61.k;
import Y61.l;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert_details_items.price.realty.AdvertDetailsNormalizedAndHistoryPricesItem;
import com.avito.android.favorite.InterfaceC30570d;
import com.avito.android.remote.model.text.Attribute;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.text.FontAttribute;
import com.avito.android.remote.model.text.FontParameter;
import com.avito.android.remote.model.text.TextIconAttribute;
import com.avito.android.util.R0;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.U;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.internal.C43238h;
import kotlinx.coroutines.reactive.A;

/* compiled from: AdvertDetailsPriceWithNormalizedPriceAndPriceHistoryPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_details_items/price/realty/f;", "LTV0/d;", "Lcom/avito/android/advert_details_items/price/realty/h;", "Lcom/avito/android/advert_details_items/price/realty/AdvertDetailsNormalizedAndHistoryPricesItem;", "_avito_advert-details-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class f implements TV0.d<h, AdvertDetailsNormalizedAndHistoryPricesItem> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_handler.handler.composite.a f85240b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final InterfaceC30570d f85241c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final C43238h f85242d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f85243e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public N0 f85244f;

    @Inject
    public f(@k com.avito.android.deeplink_handler.handler.composite.a aVar, @k InterfaceC30570d interfaceC30570d, @k R0 r02) {
        this.f85240b = aVar;
        this.f85241c = interfaceC30570d;
        this.f85242d = U.a(r02.a());
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        h hVar = (h) eVar;
        AdvertDetailsNormalizedAndHistoryPricesItem advertDetailsNormalizedAndHistoryPricesItem = (AdvertDetailsNormalizedAndHistoryPricesItem) aVar;
        hVar.N2(advertDetailsNormalizedAndHistoryPricesItem.f85221g);
        String str = advertDetailsNormalizedAndHistoryPricesItem.f85222h;
        hVar.ax(str);
        boolean z12 = advertDetailsNormalizedAndHistoryPricesItem.f85224j;
        AdvertDetailsNormalizedAndHistoryPricesItem.PriceHistory priceHistory = advertDetailsNormalizedAndHistoryPricesItem.f85223i;
        if (priceHistory != null) {
            this.f85243e = priceHistory.f85227d;
            this.f85244f = C43175k.K(new C43197r1(new c(this, null), A.a(this.f85241c.c())), this.f85242d);
            AttributedText attributedText = priceHistory.f85228e;
            if (z12) {
                FontParameter.ColorParameter colorParameter = new FontParameter.ColorParameter(null, null, "gray48");
                List<Attribute> attributes = attributedText.getAttributes();
                ArrayList arrayList = new ArrayList(C42745f0.q(attributes, 10));
                for (Parcelable parcelableCopy$default : attributes) {
                    if (parcelableCopy$default instanceof FontAttribute) {
                        FontAttribute fontAttribute = (FontAttribute) parcelableCopy$default;
                        parcelableCopy$default = FontAttribute.copy$default(fontAttribute, null, null, C42745f0.i0(colorParameter, fontAttribute.getParameters()), 3, null);
                    } else if (parcelableCopy$default instanceof TextIconAttribute) {
                        TextIconAttribute textIconAttribute = (TextIconAttribute) parcelableCopy$default;
                        List<FontParameter> parameters = textIconAttribute.getParameters();
                        if (parameters == null) {
                            parameters = C42784z0.f406748b;
                        }
                        parcelableCopy$default = TextIconAttribute.copy$default(textIconAttribute, null, null, null, C42745f0.i0(colorParameter, parameters), 7, null);
                    }
                    arrayList.add(parcelableCopy$default);
                }
                attributedText = new AttributedText(attributedText.getText(), arrayList, attributedText.getVersion());
            }
            hVar.Mn(attributedText, new d(this, priceHistory));
            hVar.d(new e(this));
        }
        if (str != null && priceHistory != null) {
            hVar.iJ();
        }
        if (z12) {
            hVar.hU();
        }
    }
}
