package com.avito.android.credits.credit_partner_screen;

import Y61.k;
import Y61.l;
import android.net.Uri;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import kotlin.Metadata;

/* compiled from: CreditPartnerView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/credits/credit_partner_screen/e;", "Landroid/webkit/WebChromeClient;", "_avito_credits_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class e extends WebChromeClient {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f128817a;

    public e(d dVar) {
        this.f128817a = dVar;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onShowFileChooser(@l WebView webView, @k ValueCallback<Uri[]> valueCallback, @l WebChromeClient.FileChooserParams fileChooserParams) {
        this.f128817a.f128784g.invoke(valueCallback);
        return true;
    }
}
