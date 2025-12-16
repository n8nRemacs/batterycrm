package com.avito.android.travel_search.deeplink;

import Ku.AbstractC14350a;
import android.net.Uri;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.x;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.SearchParamsFactory;
import com.avito.android.remote.model.messenger.message.MessageBody;
import com.avito.android.travel_search.deeplink.TravelSearchLink;
import com.google.gson.Gson;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TravelSearchLinkParser.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/travel_search/deeplink/b;", "LKu/a;", "Lcom/avito/android/travel_search/deeplink/TravelSearchLink;", "<init>", "()V", "_avito_travel-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class b extends AbstractC14350a<TravelSearchLink> {
    @Override // Ku.AbstractC14350a
    public final DeepLink r(Uri uri, Gson gson, x xVar) {
        SearchParams searchParamsFromUri = SearchParamsFactory.INSTANCE.fromUri(uri);
        TravelSearchLink.TravelSearchFlow.a aVar = TravelSearchLink.TravelSearchFlow.f302772b;
        String queryParameter = uri.getQueryParameter(MessageBody.SystemMessageBody.Platform.FLOW);
        aVar.getClass();
        return new TravelSearchLink(searchParamsFromUri, L.f(queryParameter, "favorites") ? TravelSearchLink.TravelSearchFlow.f302773c : TravelSearchLink.TravelSearchFlow.f302774d);
    }
}
