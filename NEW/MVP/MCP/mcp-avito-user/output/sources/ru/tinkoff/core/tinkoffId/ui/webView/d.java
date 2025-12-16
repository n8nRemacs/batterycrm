package ru.tinkoff.core.tinkoffId.ui.webView;

import Y61.k;
import Y61.l;
import android.content.Intent;
import android.net.Uri;
import android.webkit.CookieManager;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.huawei.hms.framework.common.ContainerUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import zb1.C50544a;

/* compiled from: TinkoffWebViewClient.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lru/tinkoff/core/tinkoffId/ui/webView/d;", "Landroid/webkit/WebViewClient;", "a", "tinkoff-id_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class d extends WebViewClient {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final ru.tinkoff.core.tinkoffId.ui.webView.a f437105a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public String f437106b;

    /* compiled from: TinkoffWebViewClient.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lru/tinkoff/core/tinkoffId/ui/webView/d$a;", "", "<init>", "()V", "", "COOKIES_SEPARATOR", "Ljava/lang/String;", "COOKIE_NAME_AND_VALUE_SEPARATOR", "tinkoff-id_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
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

    public d(@k ru.tinkoff.core.tinkoffId.ui.webView.a aVar) {
        this.f437105a = aVar;
    }

    public final boolean a(String str) {
        if (str != null) {
            ru.tinkoff.core.tinkoffId.ui.webView.a aVar = this.f437105a;
            if (C43066x.h0(str, aVar.f437101a.f437107a, false)) {
                String str2 = this.f437106b;
                if (str2 != null) {
                    CookieManager cookieManager = CookieManager.getInstance();
                    List<String> listF0 = C43066x.f0(CookieManager.getInstance().getCookie(str2), new String[]{"; "}, 0, 6);
                    ArrayList arrayList = new ArrayList(C42745f0.q(listF0, 10));
                    for (String str3 : listF0) {
                        arrayList.add(str3.substring(0, C43066x.I(str3, ContainerUtils.KEY_VALUE_DELIMITER, 0, false, 6)));
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        cookieManager.setCookie(str2, ((String) it.next()) + ContainerUtils.KEY_VALUE_DELIMITER);
                    }
                    cookieManager.flush();
                }
                int i12 = TinkoffWebViewAuthActivity.f437095e;
                TinkoffWebViewAuthActivity tinkoffWebViewAuthActivity = aVar.f437102b;
                ru.tinkoff.core.tinkoffId.a aVar2 = (ru.tinkoff.core.tinkoffId.a) tinkoffWebViewAuthActivity.f437097c.getValue();
                String str4 = aVar.f437101a.f437108b;
                ((c) tinkoffWebViewAuthActivity.f437096b.getValue()).getClass();
                C50544a.f444088c.getClass();
                String queryParameter = Uri.parse(str).getQueryParameter("code");
                if (queryParameter == null) {
                    throw new IllegalArgumentException("The server must specify the code when completing authorization");
                }
                aVar2.getClass();
                Intent data = new Intent("android.intent.action.VIEW").setData(Uri.parse(str4).buildUpon().appendQueryParameter("auth_status_code", "success").appendQueryParameter("code", queryParameter).build());
                data.setPackage(tinkoffWebViewAuthActivity.getPackageName());
                tinkoffWebViewAuthActivity.startActivity(data);
                tinkoffWebViewAuthActivity.finish();
                return true;
            }
        }
        this.f437106b = str;
        return false;
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(@l WebView webView, @l RenderProcessGoneDetail renderProcessGoneDetail) {
        ru.tinkoff.core.tinkoffId.ui.webView.a aVar = this.f437105a;
        String str = aVar.f437101a.f437108b;
        int i12 = TinkoffWebViewAuthActivity.f437095e;
        aVar.f437102b.H1(str);
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(@l WebView webView, @l WebResourceRequest webResourceRequest) {
        return a(String.valueOf(webResourceRequest != null ? webResourceRequest.getUrl() : null));
    }

    @Override // android.webkit.WebViewClient
    @InterfaceC42830m
    public final boolean shouldOverrideUrlLoading(@l WebView webView, @l String str) {
        return a(str);
    }
}
