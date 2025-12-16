package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.webkit.WebSettings;
import com.yandex.mobile.ads.impl.ns0;
import com.yandex.mobile.ads.impl.tj1;

/* loaded from: classes8.dex */
public abstract class nr0 extends jf implements o00, ns0.a, tj1.a {

    /* renamed from: j, reason: collision with root package name */
    private static boolean f388350j = false;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final tj1 f388351b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final j41 f388352c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final ns0 f388353d;

    /* renamed from: e, reason: collision with root package name */
    @j.N
    private final nc1 f388354e;

    /* renamed from: f, reason: collision with root package name */
    @j.P
    protected q00 f388355f;

    /* renamed from: g, reason: collision with root package name */
    @j.P
    protected p00 f388356g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f388357h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f388358i;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            nr0.this.h();
        }
    }

    public nr0(@j.N Context context) {
        super(context.getApplicationContext());
        this.f388351b = new tj1();
        this.f388352c = new j41();
        this.f388354e = e9.a();
        this.f388353d = ns0.a();
        b(context);
        if (f388350j) {
            return;
        }
        a(getContext());
        f388350j = true;
    }

    private static void a(@j.N Context context) {
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public void b(Context context) {
        setBackgroundColor(0);
        setVisibility(4);
        setHorizontalScrollBarEnabled(false);
        setHorizontalScrollbarOverlay(false);
        setVerticalScrollBarEnabled(false);
        setVerticalScrollbarOverlay(false);
        setScrollBarStyle(0);
        WebSettings settings = getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setSupportZoom(false);
        settings.setBuiltInZoomControls(false);
        settings.setMinimumFontSize(1);
        settings.setMinimumLogicalFontSize(1);
        if (h7.a(21)) {
            settings.setMixedContentMode(0);
        }
        settings.setMediaPlaybackRequiresUserGesture(false);
        WebSettings settings2 = getSettings();
        v11 v11VarA = q21.b().a(context);
        if (v11VarA != null && v11VarA.D()) {
            settings2.setUserAgentString(this.f388354e.a(context));
        }
        setWebViewClient(new n00(this));
        setWebChromeClient(new i00());
    }

    @Override // com.yandex.mobile.ads.impl.jf
    public String c() {
        return "<style type='text/css'> \n  * { \n      -webkit-tap-highlight-color: rgba(0, 0, 0, 0) !important; \n      -webkit-focus-ring-color: rgba(0, 0, 0, 0) !important; \n      outline: none !important; \n    } \n</style> \n" + jl1.f386915b;
    }

    @Override // com.yandex.mobile.ads.impl.jf
    public void e() {
        this.f388355f = null;
        super.e();
    }

    public abstract void h();

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f388358i = true;
        this.f388353d.a(getContext(), this);
        this.f388351b.getClass();
        boolean zA2 = tj1.a(this);
        if (this.f388357h != zA2) {
            this.f388357h = zA2;
            q00 q00Var = this.f388355f;
            if (q00Var != null) {
                q00Var.a(zA2);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.f388358i = false;
        this.f388351b.getClass();
        boolean zA2 = tj1.a(this);
        if (this.f388357h != zA2) {
            this.f388357h = zA2;
            q00 q00Var = this.f388355f;
            if (q00Var != null) {
                q00Var.a(zA2);
            }
        }
        this.f388353d.b(getContext(), this);
        super.onDetachedFromWindow();
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onVisibilityChanged(View view, int i12) {
        super.onVisibilityChanged(view, i12);
        this.f388351b.getClass();
        boolean zA2 = tj1.a(this);
        if (this.f388357h != zA2) {
            this.f388357h = zA2;
            q00 q00Var = this.f388355f;
            if (q00Var != null) {
                q00Var.a(zA2);
            }
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onWindowFocusChanged(boolean z12) {
        super.onWindowFocusChanged(z12);
        this.f388351b.getClass();
        boolean zA2 = tj1.a(this);
        if (this.f388357h != zA2) {
            this.f388357h = zA2;
            q00 q00Var = this.f388355f;
            if (q00Var != null) {
                q00Var.a(zA2);
            }
        }
    }

    public void setHtmlWebViewErrorListener(@j.N p00 p00Var) {
        this.f388356g = p00Var;
    }

    public void setHtmlWebViewListener(@j.N q00 q00Var) {
        this.f388355f = q00Var;
    }

    public void a() {
        this.f388352c.a(new a());
    }

    public void a(int i12) {
        p00 p00Var = this.f388356g;
        if (p00Var != null) {
            ((j8) p00Var).a(i12);
        }
    }

    public void a(@j.N Context context, @j.N String str) {
        q00 q00Var = this.f388355f;
        if (q00Var != null) {
            q00Var.a(str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    @Override // com.yandex.mobile.ads.impl.ns0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(@j.N android.content.Intent r2) {
        /*
            r1 = this;
            java.lang.String r2 = r2.getAction()
            java.lang.String r0 = "android.intent.action.SCREEN_OFF"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto Ld
            goto L26
        Ld:
            com.yandex.mobile.ads.impl.tj1 r2 = r1.f388351b
            r2.getClass()
            boolean r2 = com.yandex.mobile.ads.impl.tj1.a(r1)
            if (r2 == 0) goto L26
            com.yandex.mobile.ads.impl.ns0 r2 = r1.f388353d
            android.content.Context r0 = r1.getContext()
            boolean r2 = r2.b(r0)
            if (r2 == 0) goto L26
            r2 = 1
            goto L27
        L26:
            r2 = 0
        L27:
            boolean r0 = r1.f388357h
            if (r0 == r2) goto L34
            r1.f388357h = r2
            com.yandex.mobile.ads.impl.q00 r0 = r1.f388355f
            if (r0 == 0) goto L34
            r0.a(r2)
        L34:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.nr0.a(android.content.Intent):void");
    }

    @Override // com.yandex.mobile.ads.impl.tj1.a
    public final boolean b() {
        return this.f388358i;
    }
}
