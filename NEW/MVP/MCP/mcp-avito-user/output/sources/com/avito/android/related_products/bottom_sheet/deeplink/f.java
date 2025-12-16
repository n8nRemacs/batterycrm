package com.avito.android.related_products.bottom_sheet.deeplink;

import Ku.AbstractC14350a;
import Ku.i;
import android.net.Uri;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.error.DeeplinkParsingError;
import com.avito.android.deep_linking.x;
import com.avito.android.related_products.bottom_sheet.RelatedProductsBottomSheetDeepLink;
import com.google.gson.Gson;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: RelatedProductsBottomSheetDeepLinkParser.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/related_products/bottom_sheet/deeplink/f;", "LKu/a;", "Lcom/avito/android/related_products/bottom_sheet/RelatedProductsBottomSheetDeepLink;", "<init>", "()V", "_avito_related-products_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class f extends AbstractC14350a<RelatedProductsBottomSheetDeepLink> {
    @Override // Ku.AbstractC14350a
    public final DeepLink r(Uri uri, Gson gson, x xVar) throws DeeplinkParsingError.WrongParameterValue {
        long jM2 = i.m(uri, "itemId");
        String queryParameter = uri.getQueryParameter("onFailure");
        return new RelatedProductsBottomSheetDeepLink(jM2, queryParameter != null ? xVar.b(queryParameter) : null, uri.getQueryParameter("context"));
    }
}
