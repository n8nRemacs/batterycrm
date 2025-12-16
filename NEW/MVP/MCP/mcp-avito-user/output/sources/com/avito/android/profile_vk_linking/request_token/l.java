package com.avito.android.profile_vk_linking.request_token;

import Zc0.InterfaceC19538a;
import android.net.Uri;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.huawei.hms.framework.common.ContainerUtils;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.text.C43066x;

/* compiled from: VkRequestTokenWebViewClient.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_vk_linking/request_token/l;", "Landroid/webkit/WebViewClient;", "_avito_profile-vk-linking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class l extends WebViewClient {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Y41.l<InterfaceC19538a, G0> f231364a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f231365b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f231366c;

    @Inject
    public l(@Y61.k String str, @Y61.k Y41.l lVar) {
        this.f231364a = lVar;
        Uri uri = Uri.parse(Uri.parse(str).getQueryParameter("redirect_uri"));
        String authority = uri.getAuthority();
        this.f231365b = authority == null ? "" : authority;
        String path = uri.getPath();
        this.f231366c = path != null ? path : "";
    }

    public static String a(String str, String str2) {
        int length = str2.length() + C43066x.I(str, str2.concat(ContainerUtils.KEY_VALUE_DELIMITER), 0, true, 2) + 1;
        if (length <= 0 || length >= str.length() - 1) {
            return null;
        }
        int i12 = length;
        while (i12 <= str.length() - 1 && str.charAt(i12) != '&') {
            i12++;
        }
        return str.substring(length, i12);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(@Y61.l WebView webView, @Y61.l String str) {
        this.f231364a.invoke(InterfaceC19538a.e.f20295a);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(@Y61.l WebView webView, @Y61.l WebResourceRequest webResourceRequest) {
        Uri uri;
        Uri url;
        String string = (webResourceRequest == null || (url = webResourceRequest.getUrl()) == null) ? null : url.toString();
        Y41.l<InterfaceC19538a, G0> lVar = this.f231364a;
        if (string == null) {
            return false;
        }
        try {
            uri = Uri.parse(string);
        } catch (Throwable th2) {
            lVar.invoke(new InterfaceC19538a.d(th2));
        }
        if (!L.f(uri.getAuthority(), this.f231365b) || !L.f(uri.getPath(), this.f231366c)) {
            return false;
        }
        String strA = a(string, "code");
        if (strA == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        String strA2 = a(string, VoiceInfo.STATE);
        if (strA2 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        lVar.invoke(new InterfaceC19538a.b(strA, strA2));
        return true;
    }
}
