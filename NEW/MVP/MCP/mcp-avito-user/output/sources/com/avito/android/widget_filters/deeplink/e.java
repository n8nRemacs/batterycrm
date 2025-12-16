package com.avito.android.widget_filters.deeplink;

import Ku.AbstractC14350a;
import android.net.Uri;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.x;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.SearchParamsFactory;
import com.avito.android.remote.model.messenger.message.MessageBody;
import com.avito.android.widget_filters.deeplink.WidgetFiltersLink;
import com.google.gson.Gson;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: WidgetFiltersLinkParser.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/widget_filters/deeplink/e;", "LKu/a;", "Lcom/avito/android/widget_filters/deeplink/WidgetFiltersLink;", "<init>", "()V", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class e extends AbstractC14350a<WidgetFiltersLink> {
    @Override // Ku.AbstractC14350a
    public final DeepLink r(Uri uri, Gson gson, x xVar) {
        String queryParameter = uri.getQueryParameter("title");
        SearchParams searchParamsFromUri = SearchParamsFactory.INSTANCE.fromUri(uri);
        String queryParameter2 = uri.getQueryParameter("fromPage");
        WidgetFiltersLink.WidgetFiltersFlow.a aVar = WidgetFiltersLink.WidgetFiltersFlow.f329737b;
        String queryParameter3 = uri.getQueryParameter(MessageBody.SystemMessageBody.Platform.FLOW);
        aVar.getClass();
        return new WidgetFiltersLink(queryParameter, searchParamsFromUri, queryParameter2, L.f(queryParameter3, "redirect") ? WidgetFiltersLink.WidgetFiltersFlow.f329738c : L.f(queryParameter3, "parameters_update") ? WidgetFiltersLink.WidgetFiltersFlow.f329739d : WidgetFiltersLink.WidgetFiltersFlow.f329740e);
    }
}
