package com.my.target;

import Ca1.ViewOnTouchListenerC13234a;
import android.annotation.SuppressLint;
import android.content.Context;
import android.view.GestureDetector;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import e11.C39912v;

/* loaded from: classes7.dex */
public class B extends C39912v {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f364327g = 0;

    /* renamed from: c, reason: collision with root package name */
    @j.P
    public a f364328c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f364329d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f364330e;

    /* renamed from: f, reason: collision with root package name */
    public int f364331f;

    public interface a {
        void a(boolean z12);

        void c();
    }

    public static class b extends GestureDetector {

        /* renamed from: a, reason: collision with root package name */
        @j.N
        public final B f364332a;

        /* renamed from: b, reason: collision with root package name */
        @j.P
        public com.my.target.ads.a f364333b;

        public interface a {
        }

        public b(@j.N Context context, @j.N B b12) {
            super(context, new GestureDetector.SimpleOnGestureListener());
            this.f364332a = b12;
            setIsLongpressEnabled(false);
        }
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public B(@j.N Context context) {
        super(context);
        this.f364329d = getVisibility() == 0;
        WebSettings settings = getSettings();
        if (settings != null) {
            settings.setJavaScriptEnabled(true);
            settings.setDomStorageEnabled(true);
            settings.setAppCacheEnabled(true);
            settings.setAppCachePath(getContext().getCacheDir().getAbsolutePath());
            settings.setAllowFileAccess(false);
            settings.setAllowContentAccess(false);
            settings.setAllowFileAccessFromFileURLs(false);
            settings.setAllowUniversalAccessFromFileURLs(false);
        }
        b bVar = new b(getContext(), this);
        bVar.f364333b = new com.my.target.ads.a(this, 12);
        setOnTouchListener(new ViewOnTouchListenerC13234a(bVar, 19));
    }

    public final void c(boolean z12) {
        WebView webView = this.f394853b;
        if (z12) {
            if (webView != null) {
                try {
                    webView.stopLoading();
                } catch (Throwable th2) {
                    th2.getMessage();
                }
            }
            WebView webView2 = this.f394853b;
            if (webView2 != null) {
                try {
                    webView2.loadUrl("");
                } catch (Throwable th3) {
                    th3.getMessage();
                }
            }
        }
        if (webView == null) {
            return;
        }
        try {
            webView.onPause();
        } catch (Throwable th4) {
            th4.getMessage();
        }
    }

    @Override // e11.C39912v, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i12, int i13) {
        int i14 = ((float) View.MeasureSpec.getSize(i12)) / ((float) View.MeasureSpec.getSize(i13)) > 1.0f ? 2 : 1;
        if (i14 != this.f364331f) {
            this.f364331f = i14;
            a aVar = this.f364328c;
            if (aVar != null) {
                aVar.c();
            }
        }
        super.onMeasure(i12, i13);
    }

    @Override // android.view.View
    public final void onVisibilityChanged(@j.N View view, int i12) {
        super.onVisibilityChanged(view, i12);
        boolean z12 = i12 == 0;
        if (z12 != this.f364329d) {
            this.f364329d = z12;
            a aVar = this.f364328c;
            if (aVar != null) {
                aVar.a(z12);
            }
        }
    }

    @j.k0
    public void setClicked(boolean z12) {
        this.f364330e = z12;
    }

    public void setVisibilityChangedListener(@j.P a aVar) {
        this.f364328c = aVar;
    }
}
