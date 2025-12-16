package com.vk.id.captcha.web;

import Y61.k;
import Y61.l;
import android.app.ActionBar;
import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.webkit.WebView;
import android.widget.ProgressBar;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.vk.id.captcha.R;
import com.vk.id.captcha.a;
import com.vk.id.captcha.api.VKCaptcha;
import com.vk.id.captcha.api.data.VKCaptchaError;
import com.vk.id.captcha.b.a;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import kotlin.text.C43066x;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: VKCaptchaWebViewActivity.kt */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\t\u0010\u0003J\u000f\u0010\n\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\n\u0010\u0003J\u000f\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\u0003J\u0017\u0010\u000e\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0014\u001a\u00020\u00062\u0010\u0010\u0013\u001a\f\u0012\u0004\u0012\u00020\u00110\u0010j\u0002`\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001d\u0010\u001c\u001a\u0004\u0018\u00010\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010\u001f\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001f\u0010 R\u0016\u0010\"\u001a\u00020!8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\"\u0010#R\u001b\u0010(\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010\u0019\u001a\u0004\b&\u0010'R\u0016\u0010*\u001a\u00020)8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.¨\u0006/"}, d2 = {"Lcom/vk/id/captcha/web/VKCaptchaWebViewActivity;", "Landroid/app/Activity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Lkotlin/G0;", "onCreate", "(Landroid/os/Bundle;)V", "onBackPressed", "onDestroy", "finishActivity", "", ContextActionHandler.Link.URL, "prepareUrl", "(Ljava/lang/String;)Ljava/lang/String;", "", "Lcom/vk/id/captcha/sensors/model/SensorData;", "Lcom/vk/id/captcha/sensors/model/SensorsData;", "data", "sendVKCaptchaListenSensorsChangedEvent", "(Ljava/util/List;)V", "setupWebView", "(Ljava/lang/String;)V", "domain$delegate", "Lkotlin/C;", "getDomain", "()Ljava/lang/String;", "domain", "", "isHitmanChallenge$delegate", "isHitmanChallenge", "()Z", "Landroid/widget/ProgressBar;", "progressBar", "Landroid/widget/ProgressBar;", "Lcom/vk/id/captcha/web/UrlDecorator;", "urlDecorator$delegate", "getUrlDecorator", "()Lcom/vk/id/captcha/web/UrlDecorator;", "urlDecorator", "Landroid/webkit/WebView;", "webView", "Landroid/webkit/WebView;", "Landroid/os/Handler;", "webViewHandler", "Landroid/os/Handler;", "captcha_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class VKCaptchaWebViewActivity extends Activity {

    /* renamed from: a, reason: collision with root package name */
    private WebView f366840a;

    /* renamed from: b, reason: collision with root package name */
    private ProgressBar f366841b;

    /* renamed from: c, reason: collision with root package name */
    @k
    private final InterfaceC42726C f366842c = C42727D.c(new AnonymousClass6());

    /* renamed from: d, reason: collision with root package name */
    @k
    private final Handler f366843d = new Handler(f.a().a().getLooper());

    /* renamed from: e, reason: collision with root package name */
    @k
    private final InterfaceC42726C f366844e = C42727D.c(new AnonymousClass1());

    /* renamed from: f, reason: collision with root package name */
    @k
    private final InterfaceC42726C f366845f = C42727D.c(new AnonymousClass2());

    /* compiled from: VKCaptchaWebViewActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.vk.id.captcha.web.VKCaptchaWebViewActivity$1, reason: invalid class name */
    public static final class AnonymousClass1 extends N implements Y41.a<String> {
        public AnonymousClass1() {
            super(0);
        }

        @Override // Y41.a
        @l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return VKCaptchaWebViewActivity.this.getIntent().getStringExtra("VK_CAPTCHA_CHALLENGE_DOMAIN_URL_KEY");
        }
    }

    /* compiled from: VKCaptchaWebViewActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.vk.id.captcha.web.VKCaptchaWebViewActivity$2, reason: invalid class name */
    public static final class AnonymousClass2 extends N implements Y41.a<Boolean> {
        public AnonymousClass2() {
            super(0);
        }

        @Override // Y41.a
        @k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(VKCaptchaWebViewActivity.this.a() != null);
        }
    }

    /* compiled from: VKCaptchaWebViewActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "a", "()V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.vk.id.captcha.web.VKCaptchaWebViewActivity$3, reason: invalid class name */
    public static final class AnonymousClass3 extends N implements Y41.a<G0> {
        public AnonymousClass3() {
            super(0);
        }

        public final void a() {
            VKCaptchaWebViewActivity.this.b();
        }

        @Override // Y41.a
        public final /* synthetic */ G0 invoke() {
            a();
            return G0.f406611a;
        }
    }

    /* compiled from: VKCaptchaWebViewActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "a", "()V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.vk.id.captcha.web.VKCaptchaWebViewActivity$4, reason: invalid class name */
    public static final class AnonymousClass4 extends N implements Y41.a<G0> {
        public AnonymousClass4() {
            super(0);
        }

        public final void a() {
            VKCaptchaWebViewActivity.this.b();
        }

        @Override // Y41.a
        public final /* synthetic */ G0 invoke() {
            a();
            return G0.f406611a;
        }
    }

    /* compiled from: VKCaptchaWebViewActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "a", "()V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.vk.id.captcha.web.VKCaptchaWebViewActivity$5, reason: invalid class name */
    public static final class AnonymousClass5 extends N implements Y41.a<G0> {
        public AnonymousClass5() {
            super(0);
        }

        public final void a() {
            ProgressBar progressBar = VKCaptchaWebViewActivity.this.f366841b;
            if (progressBar == null) {
                progressBar = null;
            }
            progressBar.setVisibility(8);
            WebView webView = VKCaptchaWebViewActivity.this.f366840a;
            (webView != null ? webView : null).setVisibility(0);
        }

        @Override // Y41.a
        public final /* synthetic */ G0 invoke() {
            a();
            return G0.f406611a;
        }
    }

    /* compiled from: VKCaptchaWebViewActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/vk/id/captcha/web/c;", "a", "()Lcom/vk/id/captcha/web/c;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.vk.id.captcha.web.VKCaptchaWebViewActivity$6, reason: invalid class name */
    public static final class AnonymousClass6 extends N implements Y41.a<c> {
        public AnonymousClass6() {
            super(0);
        }

        @Override // Y41.a
        @k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final c invoke() {
            return new c(VKCaptchaWebViewActivity.this.getResources().getConfiguration());
        }
    }

    /* compiled from: VKCaptchaWebViewActivity.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a extends H implements Y41.l<List<? extends com.vk.id.captcha.sensors.a.a>, G0> {
        public a(VKCaptchaWebViewActivity vKCaptchaWebViewActivity) {
            super(1, vKCaptchaWebViewActivity, VKCaptchaWebViewActivity.class, "sendVKCaptchaListenSensorsChangedEvent", "sendVKCaptchaListenSensorsChangedEvent(Ljava/util/List;)V", 0);
        }

        public final void a(@k List<? extends com.vk.id.captcha.sensors.a.a> list) throws JSONException {
            VKCaptchaWebViewActivity.a((VKCaptchaWebViewActivity) this.receiver, list);
        }

        @Override // Y41.l
        public final /* synthetic */ G0 invoke(List<? extends com.vk.id.captcha.sensors.a.a> list) throws JSONException {
            a(list);
            return G0.f406611a;
        }
    }

    @Override // android.app.Activity
    @InterfaceC42830m
    public final void onBackPressed() {
        WebView webView = this.f366840a;
        if (webView == null) {
            webView = null;
        }
        if (webView.canGoBack()) {
            WebView webView2 = this.f366840a;
            (webView2 != null ? webView2 : null).goBack();
        }
    }

    @Override // android.app.Activity
    public final void onCreate(@l Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try {
            setContentView(R.layout.vkcaptcha_activity);
        } catch (RuntimeException e12) {
            String message = e12.getMessage();
            if (message != null && C43066x.q(message.toLowerCase(Locale.ROOT), "webview", false)) {
                VKCaptcha.INSTANCE.closeCaptcha$captcha_release(new a.b(new VKCaptchaError.WebviewIsUpdatingError("Webview is being updated", e12), a()));
                b();
                return;
            }
        }
        ActionBar actionBar = getActionBar();
        if (actionBar != null) {
            actionBar.hide();
        }
        this.f366840a = (WebView) findViewById(R.id.webview);
        this.f366841b = (ProgressBar) findViewById(R.id.progress_bar);
        String stringExtra = getIntent().getStringExtra("VK_CAPTCHA_URL_KEY");
        WebView webView = this.f366840a;
        if (webView == null) {
            webView = null;
        }
        webView.getSettings().setJavaScriptEnabled(true);
        Handler handler = this.f366843d;
        AnonymousClass3 anonymousClass3 = new AnonymousClass3();
        a aVar = new a(this);
        a.Companion companion = com.vk.id.captcha.b.a.INSTANCE;
        webView.addJavascriptInterface(new VKCaptchaJSInterface(handler, anonymousClass3, aVar, a.Companion.a().a(), a()), "AndroidBridge");
        webView.setBackgroundColor(0);
        WebView webView2 = this.f366840a;
        webView.setWebViewClient(new g(webView2 == null ? null : webView2, new AnonymousClass4(), new AnonymousClass5(), ((Boolean) this.f366845f.getValue()).booleanValue(), stringExtra, a()));
        String strA = ((c) this.f366842c.getValue()).a(stringExtra);
        WebView webView3 = this.f366840a;
        (webView3 != null ? webView3 : null).loadUrl(strA);
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        WebView webView = this.f366840a;
        if (webView == null) {
            webView = null;
        }
        webView.removeJavascriptInterface("AndroidBridge");
        a.Companion companion = com.vk.id.captcha.b.a.INSTANCE;
        a.Companion.a().a().a();
        WebView webView2 = this.f366840a;
        (webView2 != null ? webView2 : null).destroy();
        super.onDestroy();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String a() {
        return (String) this.f366844e.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b() {
        finish();
        if (Build.VERSION.SDK_INT >= 34) {
            overrideActivityTransition(1, R.anim.fade_in, R.anim.fade_out);
        } else {
            overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
        }
    }

    public static final /* synthetic */ void a(VKCaptchaWebViewActivity vKCaptchaWebViewActivity, List list) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            com.vk.id.captcha.sensors.a.a aVar = (com.vk.id.captcha.sensors.a.a) it.next();
            jSONObject2.put(aVar.getD(), aVar.b());
        }
        jSONObject.put("detail", jSONObject2);
        WebView webView = vKCaptchaWebViewActivity.f366840a;
        if (webView == null) {
            webView = null;
        }
        webView.loadUrl("javascript:window.dispatchEvent(new CustomEvent('VKCaptchaListenSensorsChanged', " + jSONObject + "))");
    }
}
