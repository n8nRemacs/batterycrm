package com.avito.android.webview;

import android.content.Intent;
import android.net.Uri;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.deep_linking.links.WebViewLinkSettings;
import kotlin.Metadata;

/* compiled from: WebViewIntentFactory.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/webview/l;", "", "_avito_webview_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface l {

    /* compiled from: WebViewIntentFactory.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public static /* synthetic */ Intent a(l lVar, Uri uri, WebViewLinkSettings webViewLinkSettings, int i12) {
            WebViewLinkSettings webViewLinkSettings2;
            if ((i12 & 2) != 0) {
                webViewLinkSettings2 = new WebViewLinkSettings(false, false, false, false, false, null, null, false, false, false, false, 2047, null);
            } else {
                webViewLinkSettings2 = webViewLinkSettings;
            }
            return lVar.a(uri, webViewLinkSettings2, null);
        }
    }

    @Y61.k
    Intent a(@Y61.k Uri uri, @Y61.k WebViewLinkSettings webViewLinkSettings, @Y61.l ParametrizedClickStreamEvent parametrizedClickStreamEvent);
}
