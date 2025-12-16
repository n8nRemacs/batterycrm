package com.avito.android.social.esia;

import Y41.l;
import Y61.k;
import android.net.Uri;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.huawei.hms.framework.common.ContainerUtils;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: EsiaAuthWebViewClient.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/social/esia/h;", "Landroid/webkit/WebViewClient;", "a", "_common_social_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class h extends WebViewClient {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final l<Map<String, String>, G0> f284390a;

    /* compiled from: EsiaAuthWebViewClient.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/social/esia/h$a;", "", "<init>", "()V", "", "ESIA_REDIRECT_URL", "Ljava/lang/String;", "_common_social_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public h(@k l<? super Map<String, String>, G0> lVar) {
        this.f284390a = lVar;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(@Y61.l WebView webView, @Y61.l WebResourceRequest webResourceRequest) {
        Map<String, ? extends String> mapC;
        Uri url = webResourceRequest != null ? webResourceRequest.getUrl() : null;
        if (url == null) {
            return false;
        }
        if (!L.f(url.getPath(), "/social/login")) {
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
        ((d) this.f284390a).invoke(mapC);
        return true;
    }
}
