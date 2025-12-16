package com.vk.id.captcha.web;

import Y61.k;
import Y61.l;
import android.graphics.Bitmap;
import android.net.Uri;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.vk.id.captcha.a;
import com.vk.id.captcha.api.VKCaptcha;
import com.vk.id.captcha.api.data.VKCaptchaError;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.InterfaceC42830m;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;

/* compiled from: VKCaptchaWebViewClient.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fBG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J-\u0010\u0012\u001a\u00020\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J-\u0010\u0016\u001a\u00020\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00142\b\u0010\u0007\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J-\u0010\u0019\u001a\u00020\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00142\b\u0010\u0007\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ#\u0010\u001b\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\nH\u0017¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\"\u0010!R\u0014\u0010\u001d\u001a\u00020\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010#\u001a\u00020\n8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010\u000f\u001a\u0004\u0018\u00010\n8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010&R\u0015\u0010%\u001a\u00020'8\u0003X\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b(\u0010)"}, d2 = {"Lcom/vk/id/captcha/web/g;", "Landroid/webkit/WebViewClient;", "Landroid/webkit/WebView;", "p0", "Lkotlin/Function0;", "Lkotlin/G0;", "p1", "p2", "", "p3", "", "p4", "p5", "<init>", "(Landroid/webkit/WebView;LY41/a;LY41/a;ZLjava/lang/String;Ljava/lang/String;)V", "a", "(Ljava/lang/String;)V", "Landroid/graphics/Bitmap;", "onPageStarted", "(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V", "Landroid/webkit/WebResourceRequest;", "Landroid/webkit/WebResourceError;", "onReceivedError", "(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceError;)V", "Landroid/webkit/WebResourceResponse;", "onReceivedHttpError", "(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceResponse;)V", "shouldOverrideUrlLoading", "(Landroid/webkit/WebView;Ljava/lang/String;)Z", "b", "Landroid/webkit/WebView;", "g", "c", "LY41/a;", "d", "e", "Z", "f", "Ljava/lang/String;", "Lcom/vk/id/captcha/web/d;", "h", "Lkotlin/C;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class g extends WebViewClient {

    /* renamed from: a, reason: collision with root package name */
    @k
    private static final a f366867a = new a(null);

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @k
    private final WebView g;

    @k
    private final Y41.a<G0> c;

    @k
    private final Y41.a<G0> d;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final boolean b;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @k
    private final String e;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @l
    private final String a;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @k
    private final InterfaceC42726C f = C42727D.b(LazyThreadSafetyMode.f406616d, new AnonymousClass1());

    /* compiled from: VKCaptchaWebViewClient.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/vk/id/captcha/web/d;", "a", "()Lcom/vk/id/captcha/web/d;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.vk.id.captcha.web.g$1, reason: invalid class name */
    public static final class AnonymousClass1 extends N implements Y41.a<d> {
        public AnonymousClass1() {
            super(0);
        }

        @Override // Y41.a
        @k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final d invoke() {
            return new d(g.this.b, g.this.e);
        }
    }

    /* compiled from: VKCaptchaWebViewClient.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/vk/id/captcha/web/g$a;", "", "<init>", "()V"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }
    }

    public g(@k WebView webView, @k Y41.a<G0> aVar, @k Y41.a<G0> aVar2, boolean z12, @k String str, @l String str2) {
        this.g = webView;
        this.c = aVar;
        this.d = aVar2;
        this.b = z12;
        this.e = str;
        this.a = str2;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(@l WebView p02, @l String p12, @l Bitmap p22) {
        this.d.invoke();
        super.onPageStarted(p02, p12, p22);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(@l WebView p02, @l WebResourceRequest p12, @l WebResourceError p22) {
        if (p02 != null) {
            p02.loadUrl("file:///android_asset/index.html");
        }
        a("Error loading WebView.");
        super.onReceivedError(p02, p12, p22);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(@l WebView p02, @l WebResourceRequest p12, @l WebResourceResponse p22) {
        StringBuilder sb2 = new StringBuilder("HttpError loading WebView. ErrorCode: ");
        sb2.append(p22 != null ? Integer.valueOf(p22.getStatusCode()) : null);
        a(sb2.toString());
        super.onReceivedHttpError(p02, p12, p22);
    }

    @Override // android.webkit.WebViewClient
    @InterfaceC42830m
    public final boolean shouldOverrideUrlLoading(@l WebView p02, @l String p12) {
        if (((d) this.f.getValue()).a(p02, Uri.parse(p12))) {
            return true;
        }
        WebView webView = this.g;
        if (p12 == null) {
            p12 = "";
        }
        webView.loadUrl(p12);
        return true;
    }

    private final void a(String p02) {
        VKCaptcha.INSTANCE.closeCaptcha$captcha_release(new a.b(new VKCaptchaError.NetworkError(p02, null, 2, null), this.a));
        this.c.invoke();
    }
}
