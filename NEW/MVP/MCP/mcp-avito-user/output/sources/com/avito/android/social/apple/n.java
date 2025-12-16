package com.avito.android.social.apple;

import android.graphics.Bitmap;
import android.net.Uri;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import com.avito.android.social.apple.j;
import com.avito.android.util.D6;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: AppleAuthWebViewClient.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/social/apple/n;", "Landroid/webkit/WebViewClient;", "Lcom/avito/android/social/apple/m;", "<init>", "()V", "_common_social_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class n extends WebViewClient implements m {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public i f284319a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public Y41.l<? super j, G0> f284320b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public View f284321c;

    @Inject
    public n() {
    }

    @Override // com.avito.android.social.apple.m
    public final void a(@Y61.l View view) {
        this.f284321c = view;
    }

    @Override // com.avito.android.social.apple.m
    public final void b(@Y61.l i iVar) {
        this.f284319a = iVar;
    }

    @Override // com.avito.android.social.apple.m
    public final void c(@Y61.l Y41.l<? super j, G0> lVar) {
        this.f284320b = lVar;
    }

    public final boolean d(String str) {
        boolean zF2;
        if (this.f284319a != null) {
            zF2 = L.f(str != null ? Boolean.valueOf(C43066x.q(str, "ru.avito://1/social_redirect", false)) : null, Boolean.TRUE);
        } else {
            zF2 = false;
        }
        if (!zF2) {
            return false;
        }
        Uri uri = Uri.parse(str != null ? C43066x.a0(str, "?#", "?", false) : null);
        String queryParameter = uri.getQueryParameter("code");
        String queryParameter2 = uri.getQueryParameter(ChannelContext.UserToUser.TYPE);
        Y41.l<? super j, G0> lVar = this.f284320b;
        if (lVar != null) {
            ((e) lVar).invoke(queryParameter == null || queryParameter.length() == 0 ? new j.a(null) : new j.b(queryParameter, queryParameter2));
        }
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(@Y61.l WebView webView, @Y61.l String str) {
        super.onPageFinished(webView, str);
        D6.w(this.f284321c);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(@Y61.l WebView webView, @Y61.l String str, @Y61.l Bitmap bitmap) {
        D6.H(this.f284321c);
        super.onPageStarted(webView, str, bitmap);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(@Y61.l WebView webView, @Y61.l String str) {
        return d(str);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(@Y61.l WebView webView, @Y61.l WebResourceRequest webResourceRequest) {
        Uri url;
        return d((webResourceRequest == null || (url = webResourceRequest.getUrl()) == null) ? null : url.toString());
    }
}
