package com.vk.api.sdk.ui;

import G11.d;
import Y61.k;
import Y61.l;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import com.avito.android.R;
import com.vk.api.sdk.C37878d;
import com.vk.api.sdk.auth.VKScope;
import com.vk.api.sdk.g;
import com.vk.api.sdk.t;
import com.vk.api.sdk.utils.n;
import com.vk.api.sdk.utils.o;
import j.X;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.B0;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.text.C43066x;

/* compiled from: VKWebViewAuthActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/vk/api/sdk/ui/VKWebViewAuthActivity;", "Landroid/app/Activity;", "<init>", "()V", "a", "b", "core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public class VKWebViewAuthActivity extends Activity {

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final a f366699e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    @l
    public static t.b f366700f;

    /* renamed from: b, reason: collision with root package name */
    public WebView f366701b;

    /* renamed from: c, reason: collision with root package name */
    public ProgressBar f366702c;

    /* renamed from: d, reason: collision with root package name */
    public d f366703d;

    /* compiled from: VKWebViewAuthActivity.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/vk/api/sdk/ui/VKWebViewAuthActivity$a;", "", "<init>", "()V", "", "VK_EXTRA_AUTH_PARAMS", "Ljava/lang/String;", "VK_EXTRA_VALIDATION_URL", "VK_RESULT_INTENT_NAME", "core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: VKWebViewAuthActivity.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/vk/api/sdk/ui/VKWebViewAuthActivity$b;", "Landroid/webkit/WebViewClient;", "core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public final class b extends WebViewClient {

        /* renamed from: a, reason: collision with root package name */
        public boolean f366704a;

        public b() {
        }

        public final boolean a(String str) throws NumberFormatException {
            String stringExtra;
            t.b bVar;
            int i12 = 0;
            if (str == null) {
                return false;
            }
            a aVar = VKWebViewAuthActivity.f366699e;
            VKWebViewAuthActivity vKWebViewAuthActivity = VKWebViewAuthActivity.this;
            if (vKWebViewAuthActivity.b()) {
                Uri uri = Uri.parse(C43066x.a0(str, "#", "?", false));
                if (uri.getQueryParameter("success") != null) {
                    if (uri.getQueryParameter("access_token") != null) {
                        String queryParameter = uri.getQueryParameter("access_token");
                        String queryParameter2 = uri.getQueryParameter("secret");
                        String queryParameter3 = uri.getQueryParameter("user_id");
                        if (queryParameter3 != null) {
                            Integer.parseInt(queryParameter3);
                        }
                        bVar = new t.b(queryParameter2, queryParameter);
                    } else {
                        t.b.f366687d.getClass();
                        bVar = t.b.f366688e;
                    }
                    VKWebViewAuthActivity.f366700f = bVar;
                    o.f366748a.getClass();
                    o.b();
                    vKWebViewAuthActivity.finish();
                } else if (uri.getQueryParameter("cancel") != null) {
                    o.f366748a.getClass();
                    o.b();
                    vKWebViewAuthActivity.finish();
                }
                return false;
            }
            if (vKWebViewAuthActivity.b()) {
                stringExtra = vKWebViewAuthActivity.getIntent().getStringExtra("vk_validation_url");
            } else {
                d dVar = vKWebViewAuthActivity.f366703d;
                dVar.getClass();
                stringExtra = dVar.f6209b;
            }
            if (!C43066x.h0(str, stringExtra, false)) {
                return false;
            }
            Intent intent = new Intent("com.vk.auth-token");
            String strSubstring = str.substring(C43066x.I(str, "#", 0, false, 6) + 1);
            intent.putExtra("extra-token-data", strSubstring);
            HashMap mapA = n.a(strSubstring);
            if (mapA == null || (!mapA.containsKey("error") && !mapA.containsKey("cancel"))) {
                i12 = -1;
            }
            vKWebViewAuthActivity.setResult(i12, intent);
            o.f366748a.getClass();
            o.b();
            vKWebViewAuthActivity.finish();
            return true;
        }

        @Override // android.webkit.WebViewClient
        public final void onPageFinished(@l WebView webView, @l String str) {
            super.onPageFinished(webView, str);
            if (this.f366704a) {
                return;
            }
            VKWebViewAuthActivity vKWebViewAuthActivity = VKWebViewAuthActivity.this;
            ProgressBar progressBar = vKWebViewAuthActivity.f366702c;
            progressBar.getClass();
            progressBar.setVisibility(8);
            WebView webView2 = vKWebViewAuthActivity.f366701b;
            webView2.getClass();
            webView2.setVisibility(0);
        }

        @Override // android.webkit.WebViewClient
        public final void onPageStarted(@l WebView webView, @l String str, @l Bitmap bitmap) throws NumberFormatException {
            super.onPageStarted(webView, str, bitmap);
            a(str);
        }

        @Override // android.webkit.WebViewClient
        @X
        public final void onReceivedError(@l WebView webView, @l WebResourceRequest webResourceRequest, @l WebResourceError webResourceError) {
            super.onReceivedError(webView, webResourceRequest, webResourceError);
            int errorCode = webResourceError == null ? -1 : webResourceError.getErrorCode();
            this.f366704a = true;
            Intent intent = new Intent();
            intent.putExtra("vw_login_error", errorCode);
            VKWebViewAuthActivity vKWebViewAuthActivity = VKWebViewAuthActivity.this;
            vKWebViewAuthActivity.setResult(0, intent);
            vKWebViewAuthActivity.finish();
        }

        @Override // android.webkit.WebViewClient
        @X
        public final boolean shouldOverrideUrlLoading(@l WebView webView, @l WebResourceRequest webResourceRequest) {
            return a(String.valueOf(webResourceRequest == null ? null : webResourceRequest.getUrl()));
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(@l WebView webView, @l String str) {
            return a(str);
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedError(@l WebView webView, int i12, @l String str, @l String str2) {
            super.onReceivedError(webView, i12, str, str2);
            this.f366704a = true;
            Intent intent = new Intent();
            intent.putExtra("vw_login_error", i12);
            VKWebViewAuthActivity vKWebViewAuthActivity = VKWebViewAuthActivity.this;
            vKWebViewAuthActivity.setResult(0, intent);
            vKWebViewAuthActivity.finish();
        }
    }

    @k
    public final Map<String, String> a() {
        d dVar = this.f366703d;
        dVar.getClass();
        Q q12 = new Q("client_id", String.valueOf(dVar.f6208a));
        d dVar2 = this.f366703d;
        dVar2.getClass();
        Q q13 = new Q("scope", C42745f0.O(dVar2.f6210c, ",", null, null, null, 62));
        d dVar3 = this.f366703d;
        dVar3.getClass();
        Q q14 = new Q("redirect_uri", dVar3.f6209b);
        Q q15 = new Q("response_type", "token");
        Q q16 = new Q("display", "mobile");
        g gVar = C37878d.f366576b;
        gVar.getClass();
        return P0.g(q12, q13, q14, q15, q16, new Q("v", gVar.f366596f), new Q("revoke", "1"));
    }

    public final boolean b() {
        return getIntent().getStringExtra("vk_validation_url") != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r3v3, types: [kotlin.collections.B0] */
    /* JADX WARN: Type inference failed for: r3v4 */
    @Override // android.app.Activity
    public final void onCreate(@l Bundle bundle) {
        ?? arrayList;
        d dVar;
        String string;
        super.onCreate(bundle);
        setContentView(R.layout.vk_webview_auth_dialog);
        this.f366701b = (WebView) findViewById(R.id.webView);
        this.f366702c = (ProgressBar) findViewById(R.id.progress);
        d.a aVar = d.f6207d;
        Bundle bundleExtra = getIntent().getBundleExtra("vk_auth_params");
        aVar.getClass();
        if (bundleExtra == null) {
            dVar = null;
        } else {
            int i12 = bundleExtra.getInt("vk_app_id");
            ArrayList<String> stringArrayList = bundleExtra.getStringArrayList("vk_app_scope");
            if (stringArrayList == null) {
                arrayList = 0;
            } else {
                arrayList = new ArrayList(C42745f0.q(stringArrayList, 10));
                Iterator it = stringArrayList.iterator();
                while (it.hasNext()) {
                    arrayList.add(VKScope.valueOf((String) it.next()));
                }
            }
            if (arrayList == 0) {
                arrayList = B0.f406639b;
            }
            dVar = new d(i12, bundleExtra.getString("vk_app_redirect_url", "https://oauth.vk.com/blank.html"), arrayList);
        }
        if (dVar != null) {
            this.f366703d = dVar;
        } else if (!b()) {
            finish();
        }
        WebView webView = this.f366701b;
        webView.getClass();
        webView.setWebViewClient(new b());
        webView.setVerticalScrollBarEnabled(false);
        webView.setVisibility(4);
        webView.setOverScrollMode(2);
        WebView webView2 = this.f366701b;
        webView2.getClass();
        webView2.getSettings().setJavaScriptEnabled(true);
        try {
            if (b()) {
                string = getIntent().getStringExtra("vk_validation_url");
            } else {
                Uri.Builder builderBuildUpon = Uri.parse("https://oauth.vk.com/authorize").buildUpon();
                for (Map.Entry<String, String> entry : a().entrySet()) {
                    builderBuildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
                }
                string = builderBuildUpon.build().toString();
            }
            WebView webView3 = this.f366701b;
            if (webView3 == null) {
                throw null;
            }
            webView3.loadUrl(string);
        } catch (Exception unused) {
            setResult(0);
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        WebView webView = this.f366701b;
        webView.getClass();
        webView.destroy();
        o.f366748a.getClass();
        o.b();
        super.onDestroy();
    }
}
