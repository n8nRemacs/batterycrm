package com.avito.android.installments.form;

import android.net.Uri;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import kotlin.Metadata;

/* compiled from: InstallmentsFormView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/installments/form/q;", "Landroid/webkit/WebChromeClient;", "_avito_installments_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class q extends WebChromeClient {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f172820a;

    public q(p pVar) {
        this.f172820a = pVar;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onShowFileChooser(@Y61.l WebView webView, @Y61.k ValueCallback<Uri[]> valueCallback, @Y61.l WebChromeClient.FileChooserParams fileChooserParams) {
        this.f172820a.f172806b.invoke(valueCallback);
        return true;
    }
}
