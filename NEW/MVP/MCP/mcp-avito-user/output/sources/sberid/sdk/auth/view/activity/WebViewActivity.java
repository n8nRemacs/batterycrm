package sberid.sdk.auth.view.activity;

import A91.p;
import H81.a;
import android.os.Bundle;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ProgressBar;
import androidx.appcompat.widget.Toolbar;
import androidx.view.n;
import com.avito.android.R;
import com.avito.android.remote.model.text.TooltipAttribute;
import kotlin.C42727D;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Z;
import kotlin.jvm.internal.s0;
import r31.C47485b;
import r31.c;
import r31.d;
import r31.e;
import r31.f;
import t2.C48463a;

@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lsberid/sdk/auth/view/activity/WebViewActivity;", "Landroidx/activity/n;", "<init>", "()V", "f0/a", "SberIdSDK_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class WebViewActivity extends n {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f437756g = 0;

    /* renamed from: b, reason: collision with root package name */
    public Toolbar f437757b;

    /* renamed from: c, reason: collision with root package name */
    public ViewGroup f437758c;

    /* renamed from: d, reason: collision with root package name */
    public ProgressBar f437759d;

    /* renamed from: e, reason: collision with root package name */
    public WebView f437760e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f437761f;

    public WebViewActivity() {
        super(R.layout.sber_id_web_view_activity);
        this.f437761f = C42727D.b(LazyThreadSafetyMode.f406614b, f.f429573l);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.C] */
    @Override // androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Object bVar;
        super.onCreate(bundle);
        this.f437758c = (ViewGroup) findViewById(R.id.root_view);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        this.f437757b = toolbar;
        toolbar.setNavigationOnClickListener(new p(this, 18));
        this.f437759d = (ProgressBar) findViewById(R.id.progress);
        try {
            int i12 = Z.f406624c;
            WebView webView = (WebView) findViewById(R.id.web_view);
            if (webView != null) {
                webView.getSettings().setJavaScriptEnabled(true);
                webView.getSettings().setAllowContentAccess(false);
                webView.getSettings().setAllowFileAccess(false);
                webView.getSettings().setDomStorageEnabled(true);
                webView.getSettings().setCacheMode(2);
                webView.clearHistory();
                webView.clearCache(true);
                webView.clearFormData();
                getF21241d().a(this, new C47485b(this, webView));
                webView.setWebViewClient(new C48463a(((a) this.f437761f.getValue()).c(), new c(this), new d(this), new e(webView)));
                String stringExtra = getIntent().getStringExtra(TooltipAttribute.PARAM_DEEP_LINK);
                bVar = webView;
                if (stringExtra != null) {
                    webView.loadUrl(stringExtra);
                    bVar = webView;
                }
            } else {
                bVar = null;
            }
        } catch (Throwable th2) {
            int i13 = Z.f406624c;
            bVar = new Z.b(th2);
        }
        this.f437760e = (WebView) (bVar instanceof Z.b ? null : bVar);
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        WebView webView = this.f437760e;
        if (webView != null) {
            webView.destroy();
        }
    }
}
