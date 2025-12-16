package sberid.sdk.ui.utils.extensions;

import android.content.Intent;
import android.net.Uri;
import android.webkit.WebView;
import android.widget.Toast;
import androidx.annotation.Keep;
import com.avito.android.R;
import com.avito.android.remote.model.text.TooltipAttribute;
import d31.AbstractC39501g;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import t2.C48464b;

@s0
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aK\u0010\n\u001a\u00020\b*\u00020\u000026\u0010\t\u001a2\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0001H\u0001¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000e²\u0006\f\u0010\r\u001a\u00020\f8\nX\u008a\u0084\u0002"}, d2 = {"Landroid/webkit/WebView;", "Lkotlin/Function2;", "", "Lkotlin/S;", "name", "host", "", "canGoBack", "Lkotlin/G0;", "startUpdateHost", "setupWebview", "(Landroid/webkit/WebView;LY41/p;)V", "LH81/a;", "trustHolder", "SberIdSDK_release"}, k = 2, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class WebViewExtensionsKt {

    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0004\u0010\u0004\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "T", "invoke", "()Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<H81.a> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f437882l = new a();

        public a() {
            super(0);
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [H81.a, java.lang.Object] */
        @Override // Y41.a
        @Y61.k
        public final H81.a invoke() {
            if (sc1.o.a()) {
                throw new IllegalStateException("Используйте SID.Initializer.initialize(application: Application, clientId: String) для инициализации библиотеки, прежде чем использовать методы.");
            }
            return org.koin.java.c.a(H81.a.class);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "host", "", "canGoBack", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;Ljava/lang/Boolean;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.p<String, Boolean, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.p<String, Boolean, G0> f437883l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Y41.p<? super String, ? super Boolean, G0> pVar) {
            super(2);
            this.f437883l = pVar;
        }

        @Override // Y41.p
        public final G0 invoke(String str, Boolean bool) {
            String str2 = str;
            Boolean bool2 = bool;
            if (str2 != null && bool2 != null) {
                this.f437883l.invoke(str2, bool2);
            }
            return G0.f406611a;
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroid/webkit/WebView;", "<anonymous parameter 0>", "", "<anonymous parameter 1>", "", "<anonymous parameter 2>", "Lkotlin/G0;", "invoke", "(Landroid/webkit/WebView;Ljava/lang/String;Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.q<WebView, String, Boolean, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final c f437884l = new c();

        public c() {
            super(3);
        }

        @Override // Y41.q
        public final /* bridge */ /* synthetic */ G0 invoke(WebView webView, String str, Boolean bool) {
            bool.booleanValue();
            return G0.f406611a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/net/Uri;", TooltipAttribute.PARAM_DEEP_LINK, "Lkotlin/G0;", "invoke", "(Landroid/net/Uri;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.l<Uri, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ WebView f437885l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(WebView webView) {
            super(1);
            this.f437885l = webView;
        }

        @Override // Y41.l
        public final G0 invoke(Uri uri) {
            this.f437885l.getContext().startActivity(new Intent("android.intent.action.VIEW", uri));
            return G0.f406611a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/net/Uri;", TooltipAttribute.PARAM_DEEP_LINK, "Lkotlin/G0;", "invoke", "(Landroid/net/Uri;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.l<Uri, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ WebView f437886l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(WebView webView) {
            super(1);
            this.f437886l = webView;
        }

        @Override // Y41.l
        public final G0 invoke(Uri uri) {
            WebView webView = this.f437886l;
            AbstractC39501g.c(webView.getContext(), uri, null);
            Toast.makeText(webView.getContext(), webView.getContext().getText(R.string.browser_not_found_toast), 0).show();
            return G0.f406611a;
        }
    }

    @Keep
    public static final void setupWebview(@Y61.k WebView webView, @Y61.k Y41.p<? super String, ? super Boolean, G0> pVar) {
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406614b, a.f437882l);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setAllowContentAccess(false);
        webView.getSettings().setAllowFileAccess(false);
        webView.getSettings().setDomStorageEnabled(true);
        webView.getSettings().setCacheMode(2);
        webView.clearHistory();
        webView.clearCache(true);
        webView.clearFormData();
        webView.setWebViewClient(new C48464b(((H81.a) interfaceC42726CB.getValue()).c(), new b(pVar), c.f437884l, new d(webView), new e(webView)));
    }
}
