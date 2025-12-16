package com.avito.android.social.esia;

import Cd.C13243a;
import Y41.l;
import Y61.k;
import Yw0.InterfaceC18341a;
import Yw0.InterfaceC18343c;
import Yw0.InterfaceC18344d;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.appcompat.app.m;
import androidx.view.Lifecycle;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.nav_bar.NavBar;
import com.avito.android.lib.design.spinner.overlay.SpinnerOverlay;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.social.di.g;
import com.avito.android.social.esia.EsiaAuthResult;
import com.avito.android.util.D6;
import com.esiasdk.android.EsiaErrorResponse;
import com.esiasdk.android.data.network.model.ClientSessionInfo;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import z1.AbstractC50339a;

/* compiled from: EsiaAuthActivity.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/social/esia/EsiaAuthActivity;", "Landroidx/appcompat/app/m;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "a", "_common_social_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class EsiaAuthActivity extends m implements InterfaceC28477j.a {

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final a f284369e = new a(null);

    /* renamed from: b, reason: collision with root package name */
    @Inject
    public j f284370b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final O0 f284371c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final com.esiasdk.android.esiaLoginClient.a f284372d;

    /* compiled from: EsiaAuthActivity.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/social/esia/EsiaAuthActivity$a;", "", "<init>", "()V", "", "EXTRA_ESIA_APP_2_APP_RESULT", "Ljava/lang/String;", "EXTRA_ESIA_CODE", "EXTRA_ESIA_ERROR", "EXTRA_ESIA_ERROR_MESSAGE", "EXTRA_ESIA_STATE", "", "RESULT_ERROR", "I", "_common_social_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: EsiaAuthActivity.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LYw0/c;", "it", "Lkotlin/G0;", "invoke", "(LYw0/c;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements l<InterfaceC18343c, G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ WebView f284374m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ Bundle f284375n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(WebView webView, Bundle bundle) {
            super(1);
            this.f284374m = webView;
            this.f284375n = bundle;
        }

        @Override // Y41.l
        public final G0 invoke(InterfaceC18343c interfaceC18343c) {
            InterfaceC18343c interfaceC18343c2 = interfaceC18343c;
            boolean z12 = interfaceC18343c2 instanceof InterfaceC18343c.a;
            EsiaAuthActivity esiaAuthActivity = EsiaAuthActivity.this;
            if (z12) {
                esiaAuthActivity.setResult(1);
                esiaAuthActivity.finish();
            } else if (interfaceC18343c2 instanceof InterfaceC18343c.C1409c) {
                a aVar = EsiaAuthActivity.f284369e;
                WebView webView = (WebView) esiaAuthActivity.findViewById(R.id.esia_auth_web_view);
                D6.H(webView);
                com.avito.android.social.esia.d dVar = new com.avito.android.social.esia.d(esiaAuthActivity);
                WebSettings settings = webView.getSettings();
                settings.setJavaScriptEnabled(true);
                settings.setAllowContentAccess(true);
                settings.setDomStorageEnabled(true);
                webView.setWebViewClient(new h(dVar));
                NavBar navBar = (NavBar) esiaAuthActivity.findViewById(R.id.esia_auth_navbar);
                D6.H(navBar);
                navBar.c(R.attr.ic_close24, new com.avito.android.social.esia.c(esiaAuthActivity));
                this.f284374m.loadUrl(((InterfaceC18343c.C1409c) interfaceC18343c2).f19750a);
            } else if ((interfaceC18343c2 instanceof InterfaceC18343c.b) && this.f284375n == null) {
                com.esiasdk.android.esiaLoginClient.f fVar = com.esiasdk.android.esiaLoginClient.f.f339706a;
                InterfaceC18343c.b bVar = (InterfaceC18343c.b) interfaceC18343c2;
                ClientSessionInfo clientSessionInfo = bVar.f19747a;
                String str = bVar.f19748b;
                fVar.getClass();
                com.esiasdk.android.esiaLoginClient.f.a(esiaAuthActivity, clientSessionInfo, str, bVar.f19749c);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: EsiaAuthActivity.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LYw0/d;", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(LYw0/d;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements l<InterfaceC18344d, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ SpinnerOverlay f284376l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ WebView f284377m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(SpinnerOverlay spinnerOverlay, WebView webView) {
            super(1);
            this.f284376l = spinnerOverlay;
            this.f284377m = webView;
        }

        @Override // Y41.l
        public final G0 invoke(InterfaceC18344d interfaceC18344d) {
            InterfaceC18344d interfaceC18344d2 = interfaceC18344d;
            boolean z12 = interfaceC18344d2 instanceof InterfaceC18344d.c;
            this.f284376l.setVisibility(z12 ? 0 : 8);
            boolean z13 = interfaceC18344d2 instanceof InterfaceC18344d.b;
            WebView webView = this.f284377m;
            if (z13) {
                if (webView.getUrl() == null && webView.getVisibility() == 0) {
                    webView.loadUrl(((InterfaceC18344d.b) interfaceC18344d2).f19751a);
                }
            } else if (z12) {
                webView.loadUrl("about:blank");
            }
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/n", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f284378l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Y41.a aVar) {
            super(0);
            this.f284378l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f284378l);
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/g", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<S0> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        public final S0 invoke() {
            return EsiaAuthActivity.this.getF42820b();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/h", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<AbstractC50339a> {
        public f() {
            super(0);
        }

        @Override // Y41.a
        public final AbstractC50339a invoke() {
            return EsiaAuthActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    /* compiled from: EsiaAuthActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/social/esia/i;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/social/esia/i;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<i> {
        public g() {
            super(0);
        }

        @Override // Y41.a
        public final i invoke() {
            j jVar = EsiaAuthActivity.this.f284370b;
            if (jVar == null) {
                jVar = null;
            }
            return (i) jVar.get();
        }
    }

    public EsiaAuthActivity() {
        super(R.layout.activity_esia_auth);
        this.f284371c = new O0(m0.f406844a.b(i.class), new e(), new d(new g()), new f());
        this.f284372d = new com.esiasdk.android.esiaLoginClient.a();
    }

    public static final void H1(EsiaAuthActivity esiaAuthActivity, boolean z12, EsiaErrorResponse esiaErrorResponse) {
        Parcelable failed = z12 ? new EsiaAuthResult.Failed(esiaErrorResponse) : new EsiaAuthResult.Canceled(esiaErrorResponse);
        Intent intent = new Intent();
        intent.putExtra("esia_app_2_app_result", failed);
        G0 g02 = G0.f406611a;
        esiaAuthActivity.setResult(0, intent);
        esiaAuthActivity.finish();
    }

    @Override // androidx.fragment.app.ActivityC22955m, androidx.view.n, android.app.Activity
    @InterfaceC42830m
    public final void onActivityResult(int i12, int i13, @Y61.l Intent intent) {
        if (this.f284372d.a(i12, i13, intent)) {
            return;
        }
        super.onActivityResult(i12, i13, intent);
    }

    @Override // androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        com.avito.android.social.di.e.a().a((g.a) C29972i.a(C29972i.b(this), g.a.class)).a(this);
        com.esiasdk.android.esiaLoginClient.f fVar = com.esiasdk.android.esiaLoginClient.f.f339706a;
        com.avito.android.social.esia.b bVar = new com.avito.android.social.esia.b(this);
        fVar.getClass();
        this.f284372d.f339702a = new com.esiasdk.android.esiaLoginClient.e(bVar);
        O0 o02 = this.f284371c;
        if (bundle == null) {
            ((i) o02.getValue()).accept(InterfaceC18341a.C1407a.f19742a);
        }
        WebView webView = (WebView) findViewById(R.id.esia_auth_web_view);
        SpinnerOverlay spinnerOverlay = (SpinnerOverlay) findViewById(R.id.esia_auth_spinner);
        com.avito.android.arch.mvi.android.f.a((i) o02.getValue(), this, Lifecycle.State.f46682e, new b(webView, bundle), new c(spinnerOverlay, webView));
    }

    @Override // androidx.appcompat.app.m, androidx.fragment.app.ActivityC22955m, android.app.Activity
    public final void onDestroy() {
        com.esiasdk.android.esiaLoginClient.f.f339706a.getClass();
        this.f284372d.f339702a = null;
        super.onDestroy();
    }
}
