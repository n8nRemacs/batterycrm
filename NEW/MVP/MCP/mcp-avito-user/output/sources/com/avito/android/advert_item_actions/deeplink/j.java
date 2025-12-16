package com.avito.android.advert_item_actions.deeplink;

import Ku.AbstractC14350a;
import android.net.Uri;
import com.avito.android.advert_item_actions.AdvertItemActionsDeeplink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.error.DeeplinkParsingError;
import com.avito.android.deep_linking.x;
import com.avito.android.remote.model.SearchParamsConverterKt;
import com.google.gson.Gson;
import kotlin.Metadata;
import kotlin.text.C43066x;

/* compiled from: AdvertItemActionsDeeplinkParser.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/advert_item_actions/deeplink/j;", "LKu/a;", "Lcom/avito/android/advert_item_actions/AdvertItemActionsDeeplink;", "<init>", "()V", "_avito_advert-item-actions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class j extends AbstractC14350a<AdvertItemActionsDeeplink> {
    @Override // Ku.AbstractC14350a
    public final DeepLink r(Uri uri, Gson gson, x xVar) throws DeeplinkParsingError.WrongParameterValue {
        String strP = Ku.i.p(uri, "id");
        String queryParameter = uri.getQueryParameter("categoryId");
        String queryParameter2 = uri.getQueryParameter(SearchParamsConverterKt.LOCATION_ID);
        return new AdvertItemActionsDeeplink(strP, null, queryParameter, queryParameter2 != null ? C43066x.y0(queryParameter2) : null, null, null);
    }
}
