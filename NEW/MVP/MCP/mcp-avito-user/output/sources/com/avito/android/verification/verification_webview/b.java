package com.avito.android.verification.verification_webview;

import Y41.l;
import Y61.k;
import android.content.Intent;
import android.net.Uri;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.avito.android.util.C35755b0;
import com.avito.android.verification.verification_webview.VerificationWebViewActivity;
import com.facebook.common.util.g;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import shark.AndroidResourceIdNames;

/* compiled from: VerificationWebViewClient.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/verification/verification_webview/b;", "Landroid/webkit/WebViewClient;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class b extends WebViewClient {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final VerificationWebViewActivity f325845a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f325846b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Y41.a<G0> f325847c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final l<Map<String, String>, G0> f325848d;

    public b(@k VerificationWebViewActivity verificationWebViewActivity, @k String str, @k Y41.a aVar, @k l lVar) {
        this.f325845a = verificationWebViewActivity;
        this.f325846b = str;
        this.f325847c = aVar;
        this.f325848d = lVar;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(@Y61.l WebView webView, @Y61.l WebResourceRequest webResourceRequest) {
        Map<String, ? extends String> mapSingletonMap;
        Uri url = webResourceRequest != null ? webResourceRequest.getUrl() : null;
        if (url == null) {
            return false;
        }
        if (!L.f(url.getPath(), this.f325846b)) {
            if (g.c(url)) {
                return super.shouldOverrideUrlLoading(webView, webResourceRequest);
            }
            Intent intent = new Intent("android.intent.action.VIEW", url);
            VerificationWebViewActivity verificationWebViewActivity = this.f325845a;
            if (!verificationWebViewActivity.getPackageManager().queryIntentActivities(intent, AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR).isEmpty()) {
                ((VerificationWebViewActivity.d) this.f325847c).invoke();
                verificationWebViewActivity.startActivity(intent);
            }
            return true;
        }
        try {
            Set<String> queryParameterNames = url.getQueryParameterNames();
            int iF2 = P0.f(C42745f0.q(queryParameterNames, 10));
            if (iF2 < 16) {
                iF2 = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iF2);
            for (Object obj : queryParameterNames) {
                linkedHashMap.put(obj, url.getQueryParameter((String) obj));
            }
            mapSingletonMap = C35755b0.c(linkedHashMap);
        } catch (Throwable unused) {
            mapSingletonMap = Collections.singletonMap("error", "parsing query error " + url.getQuery());
        }
        ((VerificationWebViewActivity.e) this.f325848d).invoke(mapSingletonMap);
        return true;
    }
}
