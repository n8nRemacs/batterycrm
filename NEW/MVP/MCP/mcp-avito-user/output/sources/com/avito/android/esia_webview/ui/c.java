package com.avito.android.esia_webview.ui;

import Y41.l;
import Y61.k;
import android.net.Uri;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.avito.android.esia_webview.ui.EsiaWebViewActivity;
import com.huawei.hms.framework.common.ContainerUtils;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: EsiaWebViewClient.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/esia_webview/ui/c;", "Landroid/webkit/WebViewClient;", "_avito_gig_esia-webview_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class c extends WebViewClient {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f148204a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<Map<String, String>, G0> f148205b;

    /* JADX WARN: Multi-variable type inference failed */
    public c(@k String str, @k l<? super Map<String, String>, G0> lVar) {
        this.f148204a = str;
        this.f148205b = lVar;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(@Y61.l WebView webView, @Y61.l WebResourceRequest webResourceRequest) {
        Map<String, ? extends String> mapC;
        Uri url = webResourceRequest != null ? webResourceRequest.getUrl() : null;
        if (url == null) {
            return false;
        }
        if (!L.f(url.getPath(), this.f148204a)) {
            return super.shouldOverrideUrlLoading(webView, webResourceRequest);
        }
        try {
            String encodedQuery = url.getEncodedQuery();
            if (encodedQuery == null || encodedQuery.length() == 0) {
                mapC = P0.c();
            } else {
                List listF0 = C43066x.f0(encodedQuery, new String[]{ContainerUtils.FIELD_DELIMITER}, 0, 6);
                int iF2 = P0.f(C42745f0.q(listF0, 10));
                if (iF2 < 16) {
                    iF2 = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iF2);
                Iterator it = listF0.iterator();
                while (it.hasNext()) {
                    List listF02 = C43066x.f0((String) it.next(), new String[]{ContainerUtils.KEY_VALUE_DELIMITER}, 2, 2);
                    linkedHashMap.put((String) listF02.get(0), (String) listF02.get(1));
                }
                mapC = linkedHashMap;
            }
        } catch (Throwable unused) {
            mapC = P0.c();
        }
        ((EsiaWebViewActivity.c) this.f148205b).invoke(mapC);
        return true;
    }
}
