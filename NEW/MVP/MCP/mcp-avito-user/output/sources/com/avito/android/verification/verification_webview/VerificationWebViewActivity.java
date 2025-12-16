package com.avito.android.verification.verification_webview;

import Y41.l;
import Y61.k;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.view.x;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.di.C29972i;
import com.avito.android.verification.verification_webview.VerificationWebViewResult;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import ru.avito.component.toolbar.AppBarLayoutWithIconAction;

/* compiled from: VerificationWebViewActivity.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/verification/verification_webview/VerificationWebViewActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "a", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class VerificationWebViewActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.a {

    /* renamed from: m, reason: collision with root package name */
    @k
    public static final a f325830m = new a(null);

    /* compiled from: VerificationWebViewActivity.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/avito/android/verification/verification_webview/VerificationWebViewActivity$a;", "", "<init>", "()V", "", "ARGS_KEY", "Ljava/lang/String;", "CAUSE", "PATH", "QUERY", "RESULT_KEY", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: VerificationWebViewActivity.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/verification/verification_webview/VerificationWebViewActivity$c", "Landroidx/activity/x;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c extends x {

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ l<String, G0> f325832d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(l<? super String, G0> lVar) {
            super(true);
            this.f325832d = lVar;
        }

        @Override // androidx.view.x
        public final void c() {
            ((f) this.f325832d).invoke("back press");
        }
    }

    /* compiled from: VerificationWebViewActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ InterfaceC28373a f325833l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ VerificationWebViewArgs f325834m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(InterfaceC28373a interfaceC28373a, VerificationWebViewArgs verificationWebViewArgs) {
            super(0);
            this.f325833l = interfaceC28373a;
            this.f325834m = verificationWebViewArgs;
        }

        @Override // Y41.a
        public final G0 invoke() {
            this.f325833l.c(new com.avito.android.verification.verification_webview.a(this.f325834m.f325840d));
            return G0.f406611a;
        }
    }

    /* compiled from: VerificationWebViewActivity.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "", "it", "Lkotlin/G0;", "invoke", "(Ljava/util/Map;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements l<Map<String, ? extends String>, G0> {
        public e() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(Map<String, ? extends String> map) {
            Intent intent = new Intent();
            intent.putExtra("verificationWebViewResult", new VerificationWebViewResult.Success(map));
            G0 g02 = G0.f406611a;
            VerificationWebViewActivity verificationWebViewActivity = VerificationWebViewActivity.this;
            verificationWebViewActivity.setResult(-1, intent);
            verificationWebViewActivity.finish();
            return G0.f406611a;
        }
    }

    /* compiled from: VerificationWebViewActivity.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "cause", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements l<String, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ WebView f325836l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ VerificationWebViewActivity f325837m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(WebView webView, VerificationWebViewActivity verificationWebViewActivity) {
            super(1);
            this.f325836l = webView;
            this.f325837m = verificationWebViewActivity;
        }

        @Override // Y41.l
        public final G0 invoke(String str) {
            String str2 = str;
            String url = this.f325836l.getUrl();
            if (url == null) {
                url = "";
            }
            Uri uri = Uri.parse(url);
            String host = uri.getHost();
            if (host == null) {
                host = "";
            }
            String path = uri.getPath();
            if (path == null) {
                path = "";
            }
            Q q12 = new Q("path", host.concat(path));
            String query = uri.getQuery();
            VerificationWebViewResult.Closed closed = new VerificationWebViewResult.Closed(P0.g(q12, new Q("query", query != null ? query : ""), new Q("cause", str2)));
            Intent intent = new Intent();
            intent.putExtra("verificationWebViewResult", closed);
            G0 g02 = G0.f406611a;
            VerificationWebViewActivity verificationWebViewActivity = this.f325837m;
            verificationWebViewActivity.setResult(0, intent);
            verificationWebViewActivity.finish();
            return G0.f406611a;
        }
    }

    @Override // com.avito.android.ui.activity.a
    public final int M1() {
        return R.layout.activity_verification_web_view;
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    @SuppressLint({"SetJavaScriptEnabled"})
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        VerificationWebViewArgs verificationWebViewArgs = (VerificationWebViewArgs) (Build.VERSION.SDK_INT >= 33 ? (Parcelable) intent.getParcelableExtra("verificationWebViewArgs", VerificationWebViewArgs.class) : intent.getParcelableExtra("verificationWebViewArgs"));
        InterfaceC28373a analytics = com.avito.android.verification.di.verification_webview.a.a().a((com.avito.android.verification.di.verification_webview.c) C29972i.a(C29972i.b(this), com.avito.android.verification.di.verification_webview.c.class)).getAnalytics();
        WebView webView = (WebView) findViewById(R.id.verification_web_view);
        AppBarLayoutWithIconAction appBarLayoutWithIconAction = (AppBarLayoutWithIconAction) findViewById(R.id.verification_web_view_app_bar);
        f fVar = new f(webView, this);
        appBarLayoutWithIconAction.setClickListener(new b(fVar));
        getF21241d().a(this, new c(fVar));
        webView.setWebViewClient(new com.avito.android.verification.verification_webview.b(this, verificationWebViewArgs.f325839c, new d(analytics, verificationWebViewArgs), new e()));
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setAllowContentAccess(true);
        settings.setDomStorageEnabled(true);
        webView.loadUrl(verificationWebViewArgs.f325838b);
    }

    /* compiled from: VerificationWebViewActivity.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/verification/verification_webview/VerificationWebViewActivity$b", "Lru/avito/component/toolbar/a;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements ru.avito.component.toolbar.a {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l<String, G0> f325831b;

        /* JADX WARN: Multi-variable type inference failed */
        public b(l<? super String, G0> lVar) {
            this.f325831b = lVar;
        }

        @Override // ru.avito.component.toolbar.a
        public final void R() {
            this.f325831b.invoke("home click");
        }

        @Override // ru.avito.component.toolbar.a
        public final void u() {
        }
    }
}
