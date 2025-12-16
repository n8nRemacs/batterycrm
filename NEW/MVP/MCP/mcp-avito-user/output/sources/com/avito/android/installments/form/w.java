package com.avito.android.installments.form;

import android.net.http.SslError;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.InterfaceC28373a;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: InstallmentsFormViewErrorHandler.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/installments/form/w;", "Lcom/avito/android/installments/form/v;", "_avito_installments_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class w implements v {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f172823a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Map<String, Object> f172824b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public String f172825c;

    @Inject
    public w(@Y61.k InterfaceC28373a interfaceC28373a, @com.avito.android.credits.di.m @Y61.l String str, @com.avito.android.credits.di.a @Y61.k Map<String, ? extends Object> map) {
        this.f172823a = interfaceC28373a;
        this.f172824b = map;
        this.f172825c = str;
    }

    @Override // com.yatatsu.powerwebview.PowerWebView.c
    public final void a(@Y61.k WebView webView, @Y61.k WebResourceRequest webResourceRequest, @Y61.k WebResourceError webResourceError) {
        this.f172823a.c(new VN.a(webResourceError.getErrorCode(), webResourceError.getDescription().toString(), webView.getSettings().getUserAgentString(), webResourceRequest.getUrl().toString(), this.f172825c, this.f172824b));
    }

    @Override // com.avito.android.installments.form.v
    public final void b(@Y61.l String str) {
        this.f172825c = str;
    }

    @Override // com.yatatsu.powerwebview.g
    public final void c(@Y61.k WebView webView, @Y61.k SslError sslError) {
        this.f172823a.c(new VN.a(sslError.getPrimaryError(), "SSL error", webView.getSettings().getUserAgentString(), sslError.getUrl(), this.f172825c, this.f172824b));
    }
}
