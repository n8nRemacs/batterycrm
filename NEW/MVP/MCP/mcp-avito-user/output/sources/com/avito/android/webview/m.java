package com.avito.android.webview;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.deep_linking.links.WebViewLinkSettings;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: WebViewIntentFactoryImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/webview/m;", "Lcom/avito/android/webview/l;", "_avito_webview_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class m implements l {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Context f329636a;

    @Inject
    public m(@Y61.k Context context) {
        this.f329636a = context;
    }

    @Override // com.avito.android.webview.l
    @Y61.k
    public final Intent a(@Y61.k Uri uri, @Y61.k WebViewLinkSettings webViewLinkSettings, @Y61.l ParametrizedClickStreamEvent parametrizedClickStreamEvent) {
        WebViewActivity.f329521y.getClass();
        return new Intent(this.f329636a, (Class<?>) WebViewActivity.class).putExtra("key_uri", uri).putExtra("key_settings", webViewLinkSettings).putExtra("key_analytics_display_event", parametrizedClickStreamEvent);
    }
}
