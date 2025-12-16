package com.avito.android.esia_webview.ui;

import Cd.C13243a;
import Oz.AbstractC14757a;
import Oz.AbstractC14759c;
import Oz.C14760d;
import Y41.l;
import android.annotation.SuppressLint;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.view.Lifecycle;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.di.C29972i;
import com.avito.android.esia_webview.mvi.j;
import com.avito.android.esia_webview.mvi.k;
import com.avito.android.lib.design.nav_bar.NavBar;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.util.C35809h6;
import java.util.Map;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import z1.AbstractC50339a;

/* compiled from: EsiaWebViewActivity.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/esia_webview/ui/EsiaWebViewActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "a", "_avito_gig_esia-webview_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class EsiaWebViewActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.a {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f148193o = 0;

    /* renamed from: m, reason: collision with root package name */
    @Inject
    public k f148194m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final O0 f148195n = new O0(m0.f406844a.b(j.class), new g(), new f(new i()), new h());

    /* compiled from: EsiaWebViewActivity.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/avito/android/esia_webview/ui/EsiaWebViewActivity$a;", "", "<init>", "()V", "", "CODE_DEEPLINK_PARAM_NAME", "Ljava/lang/String;", "CODE_PARAM_NAME", "EXTRA_AUTH_URL", "EXTRA_RESULT_DEEPLINK", "EXTRA_RETRY_DEEPLINK", "EXTRA_TRIGGER", "RETRY_DEEPLINK_PARAM_NAME", "STATE_DEEPLINK_PARAM_NAME", "STATE_PARAM_NAME", "_avito_gig_esia-webview_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: EsiaWebViewActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<G0> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            int i12 = EsiaWebViewActivity.f148193o;
            ((j) EsiaWebViewActivity.this.f148195n.getValue()).accept(AbstractC14757a.C0823a.f12743a);
            return G0.f406611a;
        }
    }

    /* compiled from: EsiaWebViewActivity.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "", "it", "Lkotlin/G0;", "invoke", "(Ljava/util/Map;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements l<Map<String, ? extends String>, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ String f148197l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ EsiaWebViewActivity f148198m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, EsiaWebViewActivity esiaWebViewActivity) {
            super(1);
            this.f148197l = str;
            this.f148198m = esiaWebViewActivity;
        }

        @Override // Y41.l
        public final G0 invoke(Map<String, ? extends String> map) {
            Map<String, ? extends String> map2 = map;
            String str = this.f148197l;
            if (str != null) {
                int i12 = EsiaWebViewActivity.f148193o;
                EsiaWebViewActivity esiaWebViewActivity = this.f148198m;
                ((j) esiaWebViewActivity.f148195n.getValue()).accept(new AbstractC14757a.b(C35809h6.c(C35809h6.c(C35809h6.c(Uri.parse(str), "authCode", String.valueOf(map2.get("code"))), "authState", String.valueOf(map2.get(VoiceInfo.STATE))), "retryEsiaLink", String.valueOf(esiaWebViewActivity.getIntent().getStringExtra("RETRY_DEEPLINK_PARAM_NAME")))));
            }
            return G0.f406611a;
        }
    }

    /* compiled from: EsiaWebViewActivity.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class d extends H implements l<AbstractC14759c, G0> {
        @Override // Y41.l
        public final G0 invoke(AbstractC14759c abstractC14759c) {
            EsiaWebViewActivity esiaWebViewActivity = (EsiaWebViewActivity) this.receiver;
            int i12 = EsiaWebViewActivity.f148193o;
            esiaWebViewActivity.getClass();
            if (L.f(abstractC14759c, AbstractC14759c.a.f12746a)) {
                esiaWebViewActivity.finish();
            }
            return G0.f406611a;
        }
    }

    /* compiled from: EsiaWebViewActivity.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LOz/d;", "it", "Lkotlin/G0;", "invoke", "(LOz/d;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements l<C14760d, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final e f148199l = new e();

        public e() {
            super(1);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(C14760d c14760d) {
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/n", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f148200l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Y41.a aVar) {
            super(0);
            this.f148200l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f148200l);
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/g", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<S0> {
        public g() {
            super(0);
        }

        @Override // Y41.a
        public final S0 invoke() {
            return EsiaWebViewActivity.this.getF42820b();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/h", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<AbstractC50339a> {
        public h() {
            super(0);
        }

        @Override // Y41.a
        public final AbstractC50339a invoke() {
            return EsiaWebViewActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    /* compiled from: EsiaWebViewActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/esia_webview/mvi/j;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/esia_webview/mvi/j;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<j> {
        public i() {
            super(0);
        }

        @Override // Y41.a
        public final j invoke() {
            k kVar = EsiaWebViewActivity.this.f148194m;
            if (kVar == null) {
                kVar = null;
            }
            return (j) kVar.get();
        }
    }

    static {
        new a(null);
    }

    @Override // com.avito.android.ui.activity.a
    public final int M1() {
        return R.layout.esia_webview_activity;
    }

    @Override // com.avito.android.ui.activity.a
    public final void Y1(@Y61.l Bundle bundle) {
        com.avito.android.esia_webview.di.a.a().a((com.avito.android.esia_webview.di.c) C29972i.a(C29972i.b(this), Object.class), cv.c.a(this)).a(this);
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    @SuppressLint({"UdfComponentUsage"})
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        ((NavBar) findViewById(R.id.esia_webview_navbar)).c(R.attr.ic_close24, new b());
        WebView webView = (WebView) findViewById(R.id.esia_webview_web_view);
        c cVar = new c(getIntent().getStringExtra("EXTRA_RESULT_DEEPLINK"), this);
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setAllowContentAccess(true);
        settings.setDomStorageEnabled(true);
        String stringExtra = getIntent().getStringExtra("EXTRA_TRIGGER");
        if (stringExtra != null) {
            webView.setWebViewClient(new com.avito.android.esia_webview.ui.c(stringExtra, cVar));
        }
        String stringExtra2 = getIntent().getStringExtra("EXTRA_AUTH_URL");
        if (stringExtra2 != null) {
            webView.loadUrl(stringExtra2);
        }
        com.avito.android.arch.mvi.android.f.a((j) this.f148195n.getValue(), this, Lifecycle.State.f46681d, new d(1, this, EsiaWebViewActivity.class, "handleEvent", "handleEvent(Lcom/avito/android/esia_webview/models/EsiaWebViewOneTimeEvent;)V", 0), e.f148199l);
    }
}
