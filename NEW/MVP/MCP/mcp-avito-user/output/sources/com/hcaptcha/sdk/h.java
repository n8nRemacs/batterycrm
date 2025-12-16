package com.hcaptcha.sdk;

import android.os.Handler;
import android.os.Looper;
import android.view.ViewGroup;
import android.webkit.WebView;
import androidx.fragment.app.ActivityC22955m;
import com.avito.android.R;
import lombok.NonNull;

/* loaded from: classes7.dex */
final class h implements t {

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final HCaptcha$1 f363100b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final p f363101c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f363102d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f363103e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f363104f;

    public h(@NonNull ActivityC22955m activityC22955m, @NonNull HCaptchaConfig hCaptchaConfig, @NonNull j jVar, @NonNull HCaptcha$1 hCaptcha$1) {
        if (activityC22955m == null) {
            throw new NullPointerException("activity is marked non-null but is null");
        }
        if (jVar == null) {
            throw new NullPointerException("internalConfig is marked non-null but is null");
        }
        this.f363100b = hCaptcha$1;
        HCaptchaWebView hCaptchaWebView = new HCaptchaWebView(activityC22955m);
        hCaptchaWebView.setId(R.id.webView);
        hCaptchaWebView.setVisibility(8);
        if (hCaptchaWebView.getParent() == null) {
            ((ViewGroup) activityC22955m.getWindow().getDecorView().getRootView()).addView(hCaptchaWebView);
        }
        this.f363101c = new p(new Handler(Looper.getMainLooper()), activityC22955m, hCaptchaConfig, jVar, this, hCaptcha$1, hCaptchaWebView);
    }

    @Override // com.hcaptcha.sdk.tasks.a
    public final void B3(@NonNull HCaptchaException hCaptchaException) {
        if (hCaptchaException == null) {
            throw new NullPointerException("exception is marked non-null but is null");
        }
        p pVar = this.f363101c;
        HCaptchaConfig hCaptchaConfig = pVar.f363116a;
        if (hCaptchaConfig.getRetryPredicate().H3(hCaptchaConfig, hCaptchaException)) {
            pVar.f363119d.loadUrl("javascript:resetAndExecute();");
        } else {
            this.f363100b.a(hCaptchaException);
        }
    }

    @Override // com.hcaptcha.sdk.t
    public final void H4(@NonNull ActivityC22955m activityC22955m) {
        if (activityC22955m == null) {
            throw new NullPointerException("activity is marked non-null but is null");
        }
        if (this.f363102d) {
            this.f363101c.f363119d.loadUrl("javascript:resetAndExecute();");
        } else {
            this.f363103e = true;
        }
    }

    @Override // com.hcaptcha.sdk.tasks.b
    public final void c3() {
        this.f363102d = true;
        if (this.f363104f) {
            this.f363104f = false;
            w0();
        } else if (this.f363103e) {
            this.f363103e = false;
            this.f363101c.f363119d.loadUrl("javascript:resetAndExecute();");
        }
    }

    @Override // com.hcaptcha.sdk.tasks.d
    public final void onSuccess(String str) {
        this.f363100b.d(str);
    }

    @Override // com.hcaptcha.sdk.tasks.c
    public final void v4() {
        this.f363100b.c();
    }

    @Override // com.hcaptcha.sdk.t
    public final void w0() {
        if (!this.f363102d) {
            this.f363104f = true;
            return;
        }
        p pVar = this.f363101c;
        pVar.f363119d.loadUrl("javascript:reset();");
        WebView webView = pVar.f363119d;
        if (webView.getParent() != null) {
            ((ViewGroup) webView.getParent()).removeView(webView);
        }
    }
}
