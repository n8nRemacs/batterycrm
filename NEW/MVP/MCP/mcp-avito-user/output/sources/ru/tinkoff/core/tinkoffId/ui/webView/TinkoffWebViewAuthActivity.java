package ru.tinkoff.core.tinkoffId.ui.webView;

import Y61.k;
import Y61.l;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.appcompat.app.m;
import androidx.appcompat.widget.Toolbar;
import com.avito.android.R;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import zb1.C50544a;

/* compiled from: TinkoffWebViewAuthActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/tinkoff/core/tinkoffId/ui/webView/TinkoffWebViewAuthActivity;", "Landroidx/appcompat/app/m;", "<init>", "()V", "tinkoff-id_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class TinkoffWebViewAuthActivity extends m {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f437095e = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC42726C f437096b = C42727D.c(b.f437100l);

    /* renamed from: c, reason: collision with root package name */
    @k
    public final InterfaceC42726C f437097c = C42727D.c(new a());

    /* renamed from: d, reason: collision with root package name */
    public WebView f437098d;

    /* compiled from: TinkoffWebViewAuthActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lru/tinkoff/core/tinkoffId/a;", "invoke", "()Lru/tinkoff/core/tinkoffId/a;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class a extends N implements Y41.a<ru.tinkoff.core.tinkoffId.a> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final ru.tinkoff.core.tinkoffId.a invoke() {
            return new ru.tinkoff.core.tinkoffId.a(TinkoffWebViewAuthActivity.this);
        }
    }

    /* compiled from: TinkoffWebViewAuthActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lru/tinkoff/core/tinkoffId/ui/webView/c;", "invoke", "()Lru/tinkoff/core/tinkoffId/ui/webView/c;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class b extends N implements Y41.a<c> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f437100l = new b();

        public b() {
            super(0);
        }

        @Override // Y41.a
        public final c invoke() {
            return new c();
        }
    }

    public final void H1(String str) {
        ((ru.tinkoff.core.tinkoffId.a) this.f437097c.getValue()).getClass();
        Intent data = new Intent("android.intent.action.VIEW").setData(Uri.parse(str).buildUpon().appendQueryParameter("auth_status_code", "cancelled_by_user").build());
        data.setPackage(getPackageName());
        startActivity(data);
        finish();
    }

    @Override // androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@l Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.tinkoff_id_web_view_activity);
        ru.tinkoff.core.tinkoffId.a aVar = (ru.tinkoff.core.tinkoffId.a) this.f437097c.getValue();
        Intent intent = getIntent();
        aVar.getClass();
        String strA = ru.tinkoff.core.tinkoffId.a.a(intent, "clientId");
        String strA2 = ru.tinkoff.core.tinkoffId.a.a(intent, "code_challenge");
        String strA3 = ru.tinkoff.core.tinkoffId.a.a(intent, "code_challenge_method");
        String strA4 = ru.tinkoff.core.tinkoffId.a.a(intent, "redirect_uri");
        f fVar = new f(strA, strA2, strA3, strA4, ru.tinkoff.core.tinkoffId.a.a(intent, "callback_url"));
        this.f437098d = (WebView) findViewById(R.id.webView);
        ((c) this.f437096b.getValue()).getClass();
        C50544a.f444088c.getClass();
        String string = Uri.parse("https://id.tinkoff.ru").buildUpon().path("auth/authorize").appendQueryParameter("client_id", strA).appendQueryParameter("code_challenge", strA2).appendQueryParameter("code_challenge_method", strA3).appendQueryParameter("redirect_uri", strA4).appendQueryParameter("response_type", "code").appendQueryParameter("response_mode", "query").build().toString();
        WebView webView = this.f437098d;
        if (webView == null) {
            webView = null;
        }
        webView.setWebViewClient(new d(new ru.tinkoff.core.tinkoffId.ui.webView.a(this, fVar)));
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setGeolocationEnabled(false);
        settings.setCacheMode(2);
        settings.setAllowFileAccess(false);
        settings.setAllowContentAccess(false);
        webView.loadUrl(string);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.m(R.menu.tinkoff_id_web_view_auth_menu);
        toolbar.setOnMenuItemClickListener(new com.my.target.ads.a(this, 28));
        toolbar.setNavigationOnClickListener(new ru.cyberity.cbr.core.widget.autocompletePhone.bottomsheet.c(2, this, fVar));
        getF21241d().b(new ru.tinkoff.core.tinkoffId.ui.webView.b(this, fVar));
    }
}
