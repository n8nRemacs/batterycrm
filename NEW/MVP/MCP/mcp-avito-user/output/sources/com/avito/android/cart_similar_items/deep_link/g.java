package com.avito.android.cart_similar_items.deep_link;

import Ku.AbstractC14350a;
import Ku.i;
import android.net.Uri;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.cart_similar_items.ScreenStyle;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.error.DeeplinkParsingError;
import com.avito.android.deep_linking.x;
import com.google.gson.Gson;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: CartSimilarItemsLinkParser.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/cart_similar_items/deep_link/g;", "LKu/a;", "Lcom/avito/android/cart_similar_items/deep_link/CartSimilarItemsLink;", "<init>", "()V", "_avito_cart-similar-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class g extends AbstractC14350a<CartSimilarItemsLink> {
    @Inject
    public g() {
    }

    @Override // Ku.AbstractC14350a
    public final DeepLink r(Uri uri, Gson gson, x xVar) throws DeeplinkParsingError.WrongParameterValue {
        ScreenStyle.a aVar = ScreenStyle.f115707b;
        String queryParameter = uri.getQueryParameter(BeduinPromoBlockModel.SERIALIZED_NAME_STYLE);
        aVar.getClass();
        ScreenStyle screenStyle = ScreenStyle.f115709d;
        if (!L.f(queryParameter, "push")) {
            screenStyle = ScreenStyle.f115708c;
        }
        String strN = i.n(uri, "screenName");
        String strP = i.p(uri, "initialRequest");
        try {
            Type type = new f().getType();
            String queryParameter2 = uri.getQueryParameter("extraParameters");
            return new CartSimilarItemsLink(screenStyle, strN, strP, (Map) (queryParameter2 != null ? gson.e(queryParameter2, type) : null));
        } catch (JsonParseException e12) {
            throw new DeeplinkParsingError.WrongParameterValue(uri.toString(), "extraParameters", DeeplinkParsingError.FieldConstraint.Json.f133986b, e12);
        }
    }
}
