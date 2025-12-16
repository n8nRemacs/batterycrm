package com.avito.android.seller_promotions.deep_link;

import Ku.AbstractC14350a;
import Ku.i;
import android.net.Uri;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.PromotionsSellerLink;
import com.avito.android.deep_linking.links.error.DeeplinkParsingError;
import com.avito.android.deep_linking.x;
import com.avito.android.remote.model.SearchParamsConverterKt;
import com.google.gson.Gson;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: PromotionsSellerLinkParser.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/seller_promotions/deep_link/b;", "LKu/a;", "Lcom/avito/android/deep_linking/links/PromotionsSellerLink;", "<init>", "()V", "_avito_seller-promotions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b extends AbstractC14350a<PromotionsSellerLink> {
    @Inject
    public b() {
    }

    @Override // Ku.AbstractC14350a
    public final DeepLink r(Uri uri, Gson gson, x xVar) throws DeeplinkParsingError.WrongParameterValue {
        String strP = i.p(uri, SearchParamsConverterKt.SELLER_ID);
        String strP2 = i.p(uri, "initialRequest");
        String strP3 = i.p(uri, "itemsUpdateRequest");
        String strP4 = i.p(uri, "paginationRequest");
        String queryParameter = uri.getQueryParameter("updatePromotionRequest");
        try {
            Type type = new a().getType();
            String queryParameter2 = uri.getQueryParameter("extraParameters");
            return new PromotionsSellerLink(strP, strP2, strP3, strP4, queryParameter, (Map) (queryParameter2 != null ? gson.e(queryParameter2, type) : null));
        } catch (JsonParseException e12) {
            throw new DeeplinkParsingError.WrongParameterValue(uri.toString(), "extraParameters", DeeplinkParsingError.FieldConstraint.Json.f133986b, e12);
        }
    }
}
