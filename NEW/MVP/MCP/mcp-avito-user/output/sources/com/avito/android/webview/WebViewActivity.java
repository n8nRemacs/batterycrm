package com.avito.android.webview;

import android.content.Intent;
import android.content.res.AssetManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.ViewGroup;
import android.webkit.ValueCallback;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.WebViewLinkSettings;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.di.C29972i;
import com.avito.android.util.C35967w2;
import com.avito.android.util.C35974x2;
import com.avito.android.util.V2;
import com.avito.android.webview.di.b;
import com.avito.android.webview.p;
import com.avito.android.webview.q;
import i.b;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: WebViewActivity.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/avito/android/webview/WebViewActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/webview/p$a;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_webview_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class WebViewActivity extends com.avito.android.ui.activity.a implements p.a, InterfaceC28477j.b {

    /* renamed from: y, reason: collision with root package name */
    @Y61.k
    public static final a f329521y = new a(null);

    /* renamed from: m, reason: collision with root package name */
    @Inject
    public p f329522m;

    /* renamed from: n, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f329523n;

    /* renamed from: o, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.mapping.checker.c f329524o;

    /* renamed from: p, reason: collision with root package name */
    @Inject
    public InterfaceC28373a f329525p;

    /* renamed from: q, reason: collision with root package name */
    @Inject
    public FP0.a f329526q;

    /* renamed from: r, reason: collision with root package name */
    @Inject
    public com.avito.android.connection_quality.connectivity.a f329527r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f329528s = true;

    /* renamed from: t, reason: collision with root package name */
    @Y61.k
    public final androidx.view.result.h<Void> f329529t = registerForActivityResult(new C36149b(), new C36152e(this, 1));

    /* renamed from: u, reason: collision with root package name */
    @Y61.k
    public final androidx.view.result.h<String> f329530u = registerForActivityResult(new b.l(), new C36152e(this, 2));

    /* renamed from: v, reason: collision with root package name */
    @Y61.k
    public final androidx.view.result.h<String> f329531v = registerForActivityResult(new b.l(), new C36152e(this, 0));

    /* renamed from: w, reason: collision with root package name */
    @Y61.l
    public ValueCallback<Uri[]> f329532w;

    /* renamed from: x, reason: collision with root package name */
    @Y61.l
    public Y41.l<? super Boolean, G0> f329533x;

    /* compiled from: WebViewActivity.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/avito/android/webview/WebViewActivity$a;", "", "<init>", "()V", "", "KEY_ANALYTICS_DISPLAY_EVENT", "Ljava/lang/String;", "KEY_ANALYTICS_INTERACTOR_STATE", "KEY_SETTINGS", "KEY_URI", "_avito_webview_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    @Override // com.avito.android.ui.activity.a
    public final int M1() {
        return R.layout.activity_webview;
    }

    @Override // com.avito.android.ui.activity.a
    /* renamed from: S1 */
    public final boolean getF304545j() {
        return false;
    }

    @Override // com.avito.android.ui.activity.a
    /* renamed from: T1, reason: from getter */
    public final boolean getF329528s() {
        return this.f329528s;
    }

    @Override // com.avito.android.webview.p.a
    public final void V(@Y61.k Y41.l<? super Boolean, G0> lVar) {
        if (androidx.core.content.d.checkSelfPermission(this, "android.permission.CAMERA") == 0) {
            ((q.a) lVar).invoke(Boolean.TRUE);
        } else {
            this.f329533x = lVar;
            this.f329531v.b("android.permission.CAMERA");
        }
    }

    @Override // com.avito.android.ui.activity.a
    public final void Y1(@Y61.l Bundle bundle) {
        Uri uri = (Uri) getIntent().getParcelableExtra("key_uri");
        if (uri == null) {
            throw new RuntimeException("key_uri was not passed to " + getLocalClassName());
        }
        WebViewLinkSettings webViewLinkSettings = (WebViewLinkSettings) getIntent().getParcelableExtra("key_settings");
        if (webViewLinkSettings == null) {
            webViewLinkSettings = new WebViewLinkSettings(false, false, false, false, false, null, null, false, false, false, false, 2047, null);
        }
        b.a aVarA = com.avito.android.webview.di.a.a();
        aVarA.b((com.avito.android.webview.di.c) C29972i.a(C29972i.b(this), com.avito.android.webview.di.c.class));
        aVarA.a(cv.c.a(this));
        aVarA.c(uri);
        aVarA.d(webViewLinkSettings);
        aVarA.e(C35967w2.a(getIntent()));
        aVarA.build().a(this);
    }

    public final void a(@Y61.k DeepLink deepLink) {
        com.avito.android.deeplink_handler.mapping.checker.c cVar = this.f329524o;
        if (cVar == null) {
            cVar = null;
        }
        if (!cVar.a(deepLink)) {
            setResult(-1, new Intent().putExtra("deep_link", deepLink));
            finish();
        } else {
            com.avito.android.deeplink_handler.handler.composite.a aVar = this.f329523n;
            if (aVar == null) {
                aVar = null;
            }
            b.a.a(aVar, deepLink, null, null, 6);
        }
    }

    public final boolean a2(@Y61.k Uri uri) {
        Intent component = new Intent("android.intent.action.VIEW", uri).setComponent(null);
        C35974x2.d(component);
        try {
            startActivity(component);
            return true;
        } catch (Exception e12) {
            V2.f318762a.a(WebViewActivity.class.getName(), "", e12);
            return false;
        }
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    @Y61.k
    public final AssetManager getAssets() {
        return getResources().getAssets();
    }

    @Override // com.avito.android.webview.p.a
    public final void i0(@Y61.k ValueCallback<Uri[]> valueCallback) {
        this.f329532w = valueCallback;
        if (androidx.core.content.d.checkSelfPermission(this, "android.permission.CAMERA") == 0) {
            this.f329529t.b(null);
        } else {
            this.f329530u.b("android.permission.CAMERA");
        }
    }

    @Override // com.avito.android.ui.activity.a, androidx.view.n, android.app.Activity
    public final void onBackPressed() {
        p pVar = this.f329522m;
        if (pVar == null) {
            pVar = null;
        }
        pVar.i0();
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@Y61.l Bundle bundle) {
        ParametrizedClickStreamEvent parametrizedClickStreamEvent;
        super.onCreate(bundle);
        ViewGroup viewGroup = (ViewGroup) K1();
        p pVar = this.f329522m;
        if (pVar == null) {
            pVar = null;
        }
        j jVar = new j(this, this);
        com.avito.android.connection_quality.connectivity.a aVar = this.f329527r;
        if (aVar == null) {
            aVar = null;
        }
        D d12 = new D(viewGroup, pVar, jVar, aVar);
        p pVar2 = this.f329522m;
        if (pVar2 == null) {
            pVar2 = null;
        }
        pVar2.c(d12);
        FP0.a aVar2 = this.f329526q;
        if (aVar2 == null) {
            aVar2 = null;
        }
        aVar2.f(bundle != null ? bundle.getBundle("key_analytics_interactor_state") : null);
        if (bundle != null || (parametrizedClickStreamEvent = (ParametrizedClickStreamEvent) getIntent().getParcelableExtra("key_analytics_display_event")) == null) {
            return;
        }
        FP0.a aVar3 = this.f329526q;
        (aVar3 != null ? aVar3 : null).g(parametrizedClickStreamEvent);
    }

    @Override // androidx.appcompat.app.m, androidx.fragment.app.ActivityC22955m, android.app.Activity
    public final void onDestroy() {
        p pVar = this.f329522m;
        if (pVar == null) {
            pVar = null;
        }
        pVar.K();
        super.onDestroy();
    }

    @Override // com.avito.android.ui.activity.a, androidx.view.n, android.app.Activity
    public final void onNewIntent(@Y61.k Intent intent) {
        super.onNewIntent(intent);
        Uri uri = (Uri) intent.getParcelableExtra("key_uri");
        if (uri != null) {
            p pVar = this.f329522m;
            if (pVar == null) {
                pVar = null;
            }
            pVar.b(uri);
            ParametrizedClickStreamEvent parametrizedClickStreamEvent = (ParametrizedClickStreamEvent) intent.getParcelableExtra("key_analytics_display_event");
            if (parametrizedClickStreamEvent != null) {
                FP0.a aVar = this.f329526q;
                (aVar != null ? aVar : null).g(parametrizedClickStreamEvent);
            }
        }
    }

    @Override // androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onSaveInstanceState(@Y61.k Bundle bundle) {
        super.onSaveInstanceState(bundle);
        FP0.a aVar = this.f329526q;
        if (aVar == null) {
            aVar = null;
        }
        bundle.putBundle("key_analytics_interactor_state", aVar.c());
    }

    @Override // com.avito.android.ui.activity.a, androidx.appcompat.app.m, androidx.fragment.app.ActivityC22955m, android.app.Activity
    public final void onStart() {
        super.onStart();
        p pVar = this.f329522m;
        if (pVar == null) {
            pVar = null;
        }
        pVar.e(this);
    }

    @Override // com.avito.android.ui.activity.a, androidx.appcompat.app.m, androidx.fragment.app.ActivityC22955m, android.app.Activity
    public final void onStop() {
        p pVar = this.f329522m;
        if (pVar == null) {
            pVar = null;
        }
        pVar.f();
        super.onStop();
    }
}
