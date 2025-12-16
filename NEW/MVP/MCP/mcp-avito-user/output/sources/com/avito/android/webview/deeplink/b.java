package com.avito.android.webview.deeplink;

import Y61.k;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import bv.C25719a;
import com.avito.android.CalledFrom;
import com.avito.android.analytics.a0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.RefreshLink;
import com.avito.android.deep_linking.links.WebViewLink;
import com.avito.android.deep_linking.links.WebViewLinkSettings;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.remote.model.ParametrizedEvent;
import com.avito.android.util.C35967w2;
import com.avito.android.util.H;
import com.avito.android.webview.l;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import l41.g;
import l41.r;
import rv.C47918a;
import sv.C48421d;

/* compiled from: WebViewDeeplinkHandler.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/webview/deeplink/b;", "Lcom/avito/android/deep_linking/links/WebViewLink;", "D", "Lev/a;", "_avito_webview_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class b<D extends WebViewLink> extends AbstractC40161a<D> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final a.b f329542f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final l f329543g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f329544h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final C25719a f329545i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_handler.handler.composite.a f329546j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.disposables.c f329547k = new io.reactivex.rxjava3.disposables.c();

    /* compiled from: WebViewDeeplinkHandler.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/deep_linking/links/WebViewLink;", "D", "Lrv/a;", "it", "", "test", "(Lrv/a;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements r {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b<D> f329548b;

        public a(b<D> bVar) {
            this.f329548b = bVar;
        }

        @Override // l41.r
        public final boolean test(Object obj) {
            return ((C47918a) obj).f437155a == C48421d.a(this.f329548b);
        }
    }

    @Inject
    public b(@k a.b bVar, @k l lVar, @k a.InterfaceC4053a interfaceC4053a, @k C25719a c25719a, @k com.avito.android.deeplink_handler.handler.composite.a aVar) {
        this.f329542f = bVar;
        this.f329543g = lVar;
        this.f329544h = interfaceC4053a;
        this.f329545i = c25719a;
        this.f329546j = aVar;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        String str2;
        WebViewLink webViewLink = (WebViewLink) deepLink;
        WebViewLinkSettings f133856c = webViewLink.getF133856c();
        if (!f133856c.f133871f || (str2 = f133856c.f133872g) == null || str2.length() == 0) {
            k(webViewLink);
        } else {
            this.f329545i.b(webViewLink, this, str2, new com.avito.android.webview.deeplink.a(this, webViewLink));
        }
    }

    @Override // ev.AbstractC40161a
    public final void f() {
        this.f329547k.b(this.f329542f.Q().N(new a(this)).t0(new g(this) { // from class: com.avito.android.webview.deeplink.b.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b<D> f329549b;

            {
                this.f329549b = this;
            }

            @Override // l41.g
            public final void accept(Object obj) {
                Bundle extras;
                Bundle extras2;
                C47918a c47918a = (C47918a) obj;
                b<D> bVar = this.f329549b;
                int i12 = c47918a.f437156b;
                Intent intent = c47918a.f437157c;
                if (i12 == -1 && intent != null && (extras2 = intent.getExtras()) != null && extras2.containsKey("deep_link")) {
                    bVar.j(new WebViewLink.a.c(intent != null ? (DeepLink) intent.getParcelableExtra("deep_link") : null));
                    return;
                }
                if (i12 != -1 || intent == null || (extras = intent.getExtras()) == null || !extras.containsKey("should_refresh_screen")) {
                    bVar.j(WebViewLink.a.C4021a.f133864b);
                    return;
                }
                if (intent != null ? intent.getBooleanExtra("should_refresh_screen", false) : false) {
                    bVar.i(WebViewLink.a.b.f133865b, bVar.f329546j, new RefreshLink());
                } else {
                    bVar.j(WebViewLink.a.C4021a.f133864b);
                }
            }
        }));
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        this.f329547k.e();
    }

    public final void k(D d12) {
        Uri f133855b = d12.getF133855b();
        WebViewLinkSettings f133856c = d12.getF133856c();
        ParametrizedEvent f133857d = d12.getF133857d();
        Intent intentA = this.f329543g.a(f133855b, f133856c, f133857d != null ? a0.a(f133857d) : null);
        Bundle bundleB = b();
        C35967w2.c(intentA, bundleB != null ? H.b(bundleB) : null);
        Bundle bundleB2 = b();
        intentA.putExtra("analytic_params", bundleB2 != null ? H.a(bundleB2) : null);
        Bundle bundleB3 = b();
        boolean z12 = (bundleB3 != null ? H.b(bundleB3) : null) instanceof CalledFrom.Push;
        a.InterfaceC4053a interfaceC4053a = this.f329544h;
        if (!z12) {
            interfaceC4053a.J(intentA, C48421d.a(this), com.avito.android.deeplink_handler.view.c.f134589l);
        } else {
            interfaceC4053a.R(intentA, com.avito.android.deeplink_handler.view.b.f134588l);
            j(new WebViewLink.a.c(null, 1, null));
        }
    }
}
